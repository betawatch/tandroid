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
import androidx.biometric.n;
import c5.v;
import c5.z;
import e2.a0;
import fi.j4;
import i9.s;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import v7.h8;
import w7.z7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class f {
    public static final h8 a;
    public static final a0.k b;

    static {
        z7.a("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            a = new k();
        } else if (i10 >= 28) {
            a = new j();
        } else if (i10 >= 26) {
            a = new i();
        } else {
            if (i10 >= 24) {
                Method method = h.c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    a = new h();
                }
            }
            a = new g();
        }
        b = new a0.k(16);
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r1.equals(r5) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, h0.d dVar, Resources resources, int i10, String str, int i11, int i12, a0 a0Var) {
        Typeface a2;
        Typeface typeface;
        List unmodifiableList;
        int i13 = 3;
        if (dVar instanceof h0.g) {
            h0.g gVar = (h0.g) dVar;
            String str2 = gVar.e;
            a2 = null;
            int i14 = 0;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                new Handler(Looper.getMainLooper()).post(new j4(i13, a0Var, typeface));
                return typeface;
            }
            int i15 = 1;
            boolean z10 = gVar.d == 0;
            int i16 = gVar.c;
            Handler handler = new Handler(Looper.getMainLooper());
            xa.c cVar = new xa.c(20);
            cVar.b = a0Var;
            o0.e eVar = gVar.b;
            int i17 = 2;
            if (eVar != null) {
                Object[] objArr = {gVar.a, eVar};
                ArrayList arrayList = new ArrayList(2);
                for (int i18 = 0; i18 < 2; i18++) {
                    Object obj = objArr[i18];
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
            n nVar = new n(handler, 4);
            o0.a aVar = new o0.a(i14, cVar, nVar);
            int i19 = 19;
            if (!z10) {
                String a10 = o0.h.a(i12, unmodifiableList);
                Typeface typeface2 = (Typeface) o0.h.a.a(a10);
                if (typeface2 != null) {
                    nVar.execute(new s(i19, cVar, typeface2));
                    a2 = typeface2;
                } else {
                    z zVar = new z(aVar, i15);
                    synchronized (o0.h.c) {
                        try {
                            l lVar = o0.h.d;
                            ArrayList arrayList3 = (ArrayList) lVar.get(a10);
                            if (arrayList3 != null) {
                                arrayList3.add(zVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(zVar);
                                lVar.put(a10, arrayList4);
                                o0.f fVar = new o0.f(a10, context, unmodifiableList, i12, 1);
                                ThreadPoolExecutor threadPoolExecutor = o0.h.b;
                                z zVar2 = new z(a10, i17);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                v vVar = new v();
                                vVar.b = fVar;
                                vVar.c = zVar2;
                                vVar.d = handler2;
                                threadPoolExecutor.execute(vVar);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (unmodifiableList.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                o0.e eVar2 = (o0.e) unmodifiableList.get(0);
                a0.k kVar = o0.h.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{eVar2}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String a11 = o0.h.a(i12, DesugarCollections.unmodifiableList(arrayList5));
                Typeface typeface3 = (Typeface) o0.h.a.a(a11);
                if (typeface3 != null) {
                    nVar.execute(new s(i19, cVar, typeface3));
                    a2 = typeface3;
                } else if (i16 == -1) {
                    Object[] objArr3 = {eVar2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = objArr3[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    o0.g b10 = o0.h.b(a11, context, DesugarCollections.unmodifiableList(arrayList6), i12);
                    aVar.H(b10);
                    a2 = b10.a;
                } else {
                    try {
                        try {
                            o0.g gVar2 = (o0.g) o0.h.b.submit(new o0.f(a11, context, eVar2, i12, 0)).get(i16, TimeUnit.MILLISECONDS);
                            aVar.H(gVar2);
                            a2 = gVar2.a;
                        } catch (InterruptedException e7) {
                            throw e7;
                        } catch (ExecutionException e10) {
                            throw new RuntimeException(e10);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((n) aVar.c).execute(new androidx.activity.i((xa.c) aVar.b, -3));
                    }
                }
            }
        } else {
            a2 = a.a(context, (h0.e) dVar, resources, i12);
            if (a2 != null) {
                new Handler(Looper.getMainLooper()).post(new j4(i13, a0Var, a2));
            } else {
                a0Var.b();
            }
        }
        if (a2 != null) {
            b.b(b(resources, i10, str, i11, i12), a2);
        }
        return a2;
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
