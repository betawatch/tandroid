package i0;

import a0.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import f7.j8;
import f7.k8;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends j8 {
    public static final Class a;
    public static final Constructor b;
    public static final Method c;
    public static final Method d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    public static boolean g(Object obj, ByteBuffer byteBuffer, int i9, int i10, boolean z10) {
        try {
            return ((Boolean) c.invoke(obj, byteBuffer, Integer.valueOf(i9), null, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface h(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // f7.j8
    public final Typeface a(Context context, h0.e eVar, Resources resources, int i9) {
        Object obj;
        int i10;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            h0.f[] fVarArr = eVar.a;
            int length = fVarArr.length;
            while (i10 < length) {
                h0.f fVar = fVarArr[i10];
                int i11 = fVar.f;
                File d9 = k8.d(context);
                if (d9 != null) {
                    try {
                        if (k8.b(d9, resources, i11)) {
                            try {
                                fileInputStream = new FileInputStream(d9);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i10 = (mappedByteBuffer == null && g(obj, mappedByteBuffer, fVar.e, fVar.b, fVar.c)) ? i10 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        d9.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer == null) {
                }
            }
            return h(obj);
        }
        return null;
    }

    @Override // f7.j8
    public final Typeface b(Context context, o0.i[] iVarArr, int i9) {
        Object obj;
        try {
            obj = b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i10 = 0;
            k kVar = new k(0);
            int length = iVarArr.length;
            while (true) {
                if (i10 < length) {
                    o0.i iVar = iVarArr[i10];
                    Uri uri = iVar.a;
                    ByteBuffer byteBuffer = (ByteBuffer) kVar.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = k8.e(context, uri);
                        kVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !g(obj, byteBuffer, iVar.b, iVar.c, iVar.d)) {
                        break;
                    }
                    i10++;
                } else {
                    Typeface h = h(obj);
                    if (h != null) {
                        return Typeface.create(h, i9);
                    }
                }
            }
        }
        return null;
    }
}
