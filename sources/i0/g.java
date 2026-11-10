package i0;

import a0.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import c8.j0;
import c8.k0;
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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class g extends j0 {
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

    public static boolean g(Object obj, ByteBuffer byteBuffer, int i7, int i10, boolean z9) {
        try {
            return ((Boolean) c.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i10), Boolean.valueOf(z9))).booleanValue();
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

    @Override // c8.j0
    public final Typeface a(Context context, h0.e eVar, Resources resources, int i7) {
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
            for (h0.f fVar : eVar.a) {
                int i11 = fVar.f;
                File d2 = k0.d(context);
                if (d2 != null) {
                    try {
                        if (k0.b(d2, resources, i11)) {
                            try {
                                fileInputStream = new FileInputStream(d2);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i10 = (mappedByteBuffer != null && g(obj, mappedByteBuffer, fVar.e, fVar.b, fVar.c)) ? i10 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        d2.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return h(obj);
        }
        return null;
    }

    @Override // c8.j0
    public final Typeface b(Context context, o0.h[] hVarArr, int i7) {
        Object obj;
        try {
            obj = b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i10 = 0;
            l lVar = new l(0);
            int length = hVarArr.length;
            while (true) {
                if (i10 < length) {
                    o0.h hVar = hVarArr[i10];
                    Uri uri = hVar.a;
                    ByteBuffer byteBuffer = (ByteBuffer) lVar.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = k0.e(context, uri);
                        lVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !g(obj, byteBuffer, hVar.b, hVar.c, hVar.d)) {
                        break;
                    }
                    i10++;
                } else {
                    Typeface h = h(obj);
                    if (h != null) {
                        return Typeface.create(h, i7);
                    }
                }
            }
        }
        return null;
    }
}
