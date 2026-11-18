package i0;

import a0.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import androidx.biometric.o;
import c8.ke;
import c8.m0;
import fi.a6;
import h2.j0;
import hi.u5;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m9.u;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class e {
    public static final m0 a;
    public static final a0.j b;

    static {
        ke.a("TypefaceCompat static init");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            a = new j();
        } else if (i7 >= 28) {
            a = new i();
        } else if (i7 >= 26) {
            a = new h();
        } else {
            if (i7 >= 24) {
                Method method = g.c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    a = new g();
                }
            }
            a = new f();
        }
        b = new a0.j(16);
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r1.equals(r5) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, h0.d dVar, Resources resources, int i7, String str, int i10, int i11, j0 j0Var) {
        Typeface a10;
        Typeface typeface;
        List unmodifiableList;
        int i12 = 20;
        if (dVar instanceof h0.g) {
            h0.g gVar = (h0.g) dVar;
            String str2 = gVar.e;
            a10 = null;
            boolean z10 = false;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                new Handler(Looper.getMainLooper()).post(new a6(i12, j0Var, typeface));
                return typeface;
            }
            int i13 = 1;
            boolean z11 = gVar.d == 0;
            int i14 = gVar.c;
            Handler handler = new Handler(Looper.getMainLooper());
            u5 u5Var = new u5(i13);
            u5Var.b = j0Var;
            o0.d dVar2 = gVar.b;
            int i15 = 2;
            if (dVar2 != null) {
                Object[] objArr = {gVar.a, dVar2};
                ArrayList arrayList = new ArrayList(2);
                for (int i16 = 0; i16 < 2; i16++) {
                    Object obj = objArr[i16];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            } else {
                Object[] objArr2 = {gVar.a};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr2[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            o oVar = new o(handler, 4);
            k8.a aVar = new k8.a(u5Var, oVar, z10, 6);
            int i17 = 24;
            if (!z11) {
                String a11 = o0.g.a(i11, unmodifiableList);
                Typeface typeface2 = (Typeface) o0.g.a.a(a11);
                if (typeface2 != null) {
                    oVar.execute(new u(i17, u5Var, typeface2));
                    a10 = typeface2;
                } else {
                    f5.u uVar = new f5.u(aVar, i15);
                    synchronized (o0.g.c) {
                        try {
                            l lVar = o0.g.d;
                            ArrayList arrayList3 = (ArrayList) lVar.get(a11);
                            if (arrayList3 != null) {
                                arrayList3.add(uVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(uVar);
                                lVar.put(a11, arrayList4);
                                o0.e eVar = new o0.e(a11, context, unmodifiableList, i11, 1);
                                ThreadPoolExecutor threadPoolExecutor = o0.g.b;
                                f5.u uVar2 = new f5.u(a11, 3);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                a9.h hVar = new a9.h();
                                hVar.b = eVar;
                                hVar.c = uVar2;
                                hVar.d = handler2;
                                threadPoolExecutor.execute(hVar);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (unmodifiableList.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                o0.d dVar3 = (o0.d) unmodifiableList.get(0);
                a0.j jVar = o0.g.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{dVar3}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String a12 = o0.g.a(i11, DesugarCollections.unmodifiableList(arrayList5));
                Typeface typeface3 = (Typeface) o0.g.a.a(a12);
                if (typeface3 != null) {
                    oVar.execute(new u(i17, u5Var, typeface3));
                    a10 = typeface3;
                } else if (i14 == -1) {
                    Object[] objArr3 = {dVar3};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = objArr3[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    o0.f b10 = o0.g.b(a12, context, DesugarCollections.unmodifiableList(arrayList6), i11);
                    aVar.P0(b10);
                    a10 = b10.a;
                } else {
                    try {
                        try {
                            o0.f fVar = (o0.f) o0.g.b.submit(new o0.e(a12, context, dVar3, i11, 0)).get(i14, TimeUnit.MILLISECONDS);
                            aVar.P0(fVar);
                            a10 = fVar.a;
                        } catch (InterruptedException e10) {
                            throw e10;
                        } catch (ExecutionException e11) {
                            throw new RuntimeException(e11);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((o) aVar.c).execute(new j6.o((u5) aVar.b, -3));
                    }
                }
            }
        } else {
            a10 = a.a(context, (h0.e) dVar, resources, i11);
            if (a10 != null) {
                new Handler(Looper.getMainLooper()).post(new a6(i12, j0Var, a10));
            } else {
                j0Var.b();
            }
        }
        if (a10 != null) {
            b.b(b(resources, i7, str, i10, i11), a10);
        }
        return a10;
    }

    public static String b(Resources resources, int i7, String str, int i10, int i11) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i10 + '-' + i7 + '-' + i11;
    }
}
