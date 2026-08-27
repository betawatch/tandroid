package i0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import g7.y7;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class i extends g {
    public final Class f;
    public final Constructor g;
    public final Method h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;

    public i() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = l(cls2);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = m(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e9) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e9.getClass().getName()), e9);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f = cls;
        this.g = constructor;
        this.h = method2;
        this.i = method3;
        this.j = method4;
        this.k = method5;
        this.l = method;
    }

    public static Method l(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // i0.g, g7.x7
    public final Typeface a(Context context, h0.e eVar, Resources resources, int i10) {
        Object obj;
        Method method = this.h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.a(context, eVar, resources, i10);
        }
        try {
            obj = this.g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            h0.f[] fVarArr = eVar.a;
            int length = fVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    h0.f fVar = fVarArr[i11];
                    Context context2 = context;
                    if (i(context2, obj, fVar.a, fVar.e, fVar.b, fVar.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.d))) {
                        i11++;
                        context = context2;
                    } else {
                        try {
                            this.k.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (k(obj)) {
                    return j(obj);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2 A[SYNTHETIC] */
    @Override // i0.g, g7.x7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface b(Context context, o0.j[] jVarArr, int i10) {
        Object obj;
        Typeface j10;
        boolean z10;
        if (jVarArr.length >= 1) {
            Method method = this.h;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (o0.j jVar : jVarArr) {
                        if (jVar.e == 0) {
                            Uri uri = jVar.a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, y7.e(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
                    try {
                        obj = this.g.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = jVarArr.length;
                        int i11 = 0;
                        boolean z11 = false;
                        while (true) {
                            Method method2 = this.k;
                            if (i11 < length) {
                                o0.j jVar2 = jVarArr[i11];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(jVar2.a);
                                if (byteBuffer != null) {
                                    try {
                                        z10 = ((Boolean) this.i.invoke(obj, byteBuffer, Integer.valueOf(jVar2.b), null, Integer.valueOf(jVar2.c), Integer.valueOf(jVar2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z10 = false;
                                        if (z10) {
                                        }
                                    }
                                    if (z10) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z11 = true;
                                }
                                i11++;
                            } else if (!z11) {
                                method2.invoke(obj, null);
                            } else if (k(obj) && (j10 = j(obj)) != null) {
                                return Typeface.create(j10, i10);
                            }
                        }
                    }
                } else {
                    o0.j f10 = f(jVarArr, i10);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f10.a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(f10.c).setItalic(f10.d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    } else if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // g7.x7
    public final Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        Object obj;
        Method method = this.h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.e(context, resources, i10, str, i11);
        }
        try {
            obj = this.g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!i(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.k.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (k(obj)) {
                return j(obj);
            }
        }
        return null;
    }

    public final boolean i(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method m(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
