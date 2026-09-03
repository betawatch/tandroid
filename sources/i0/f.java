package i0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import j7.a8;
import j7.b8;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class f extends a8 {
    public static Class a = null;
    public static Constructor b = null;
    public static Method c = null;
    public static Method d = null;
    public static boolean e = false;

    public static boolean g(Object obj, String str, int i10, boolean z4) {
        h();
        try {
            try {
                return ((Boolean) c.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z4))).booleanValue();
            } catch (InvocationTargetException e6) {
                e = e6;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e10) {
            e = e10;
        }
    }

    public static void h() {
        Method method;
        Class<?> cls;
        Method method2;
        if (e) {
            return;
        }
        e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi21Impl", e6.getClass().getName(), e6);
            method = null;
            cls = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    @Override // j7.a8
    public Typeface a(Context context, h0.e eVar, Resources resources, int i10) {
        h();
        try {
            Object newInstance = b.newInstance(null);
            for (h0.f fVar : eVar.a) {
                File d10 = b8.d(context);
                if (d10 == null) {
                    return null;
                }
                try {
                    if (!b8.b(d10, resources, fVar.f)) {
                        return null;
                    }
                    if (!g(newInstance, d10.getPath(), fVar.b, fVar.c)) {
                        return null;
                    }
                    d10.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d10.delete();
                }
            }
            h();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // j7.a8
    public Typeface b(Context context, o0.i[] iVarArr, int i10) {
        File file;
        String readlink;
        if (iVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f(iVarArr, i10).a, "r", null);
                if (openFileDescriptor != null) {
                    try {
                        try {
                            readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    try {
                        if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                            file = new File(readlink);
                            if (file != null && file.canRead()) {
                                Typeface createFromFile = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile;
                            }
                            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            Typeface d10 = d(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return d10;
                        }
                        Typeface d102 = d(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return d102;
                    } finally {
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile2 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile2;
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
