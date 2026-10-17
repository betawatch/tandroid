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
import c5.v;
import c5.z;
import e2.j0;
import ei.p6;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j9.u;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import v7.y7;
import w7.e8;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public abstract class f {
    public static final y7 a;
    public static final a0.j b;

    static {
        e8.a("TypefaceCompat static init");
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
        b = new a0.j(16);
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r1.equals(r5) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, h0.d dVar, Resources resources, int i10, String str, int i11, int i12, j0 j0Var) {
        Typeface a2;
        Typeface typeface;
        List unmodifiableList;
        int i13 = 22;
        if (dVar instanceof h0.g) {
            h0.g gVar = (h0.g) dVar;
            String str2 = gVar.e;
            a2 = null;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                new Handler(Looper.getMainLooper()).post(new p6(i13, j0Var, typeface));
                return typeface;
            }
            int i14 = 1;
            boolean z10 = gVar.d == 0;
            int i15 = gVar.c;
            Handler handler = new Handler(Looper.getMainLooper());
            a6.i iVar = new a6.i(24);
            iVar.b = j0Var;
            o0.d dVar2 = gVar.b;
            int i16 = 2;
            if (dVar2 != null) {
                Object[] objArr = {gVar.a, dVar2};
                ArrayList arrayList = new ArrayList(2);
                for (int i17 = 0; i17 < 2; i17++) {
                    Object obj = objArr[i17];
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
            n2.e eVar = new n2.e(4, iVar, oVar);
            int i18 = 20;
            if (!z10) {
                String a10 = o0.g.a(i12, unmodifiableList);
                Typeface typeface2 = (Typeface) o0.g.a.a(a10);
                if (typeface2 != null) {
                    oVar.execute(new u(i18, iVar, typeface2));
                    a2 = typeface2;
                } else {
                    z zVar = new z(eVar, i14);
                    synchronized (o0.g.c) {
                        try {
                            l lVar = o0.g.d;
                            ArrayList arrayList3 = (ArrayList) lVar.get(a10);
                            if (arrayList3 != null) {
                                arrayList3.add(zVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(zVar);
                                lVar.put(a10, arrayList4);
                                o0.e eVar2 = new o0.e(a10, context, unmodifiableList, i12, 1);
                                ThreadPoolExecutor threadPoolExecutor = o0.g.b;
                                z zVar2 = new z(a10, i16);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                v vVar = new v();
                                vVar.b = eVar2;
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
                o0.d dVar3 = (o0.d) unmodifiableList.get(0);
                a0.j jVar = o0.g.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{dVar3}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String a11 = o0.g.a(i12, DesugarCollections.unmodifiableList(arrayList5));
                Typeface typeface3 = (Typeface) o0.g.a.a(a11);
                if (typeface3 != null) {
                    oVar.execute(new u(i18, iVar, typeface3));
                    a2 = typeface3;
                } else if (i15 == -1) {
                    Object[] objArr3 = {dVar3};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = objArr3[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    o0.f b10 = o0.g.b(a11, context, DesugarCollections.unmodifiableList(arrayList6), i12);
                    eVar.a0(b10);
                    a2 = b10.a;
                } else {
                    try {
                        try {
                            try {
                                o0.f fVar = (o0.f) o0.g.b.submit(new o0.e(a11, context, dVar3, i12, 0)).get(i15, TimeUnit.MILLISECONDS);
                                eVar.a0(fVar);
                                a2 = fVar.a;
                            } catch (TimeoutException unused) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e) {
                            throw e;
                        } catch (ExecutionException e7) {
                            throw new RuntimeException(e7);
                        }
                    } catch (InterruptedException unused2) {
                        ((o) eVar.c).execute(new androidx.activity.i((a6.i) eVar.b, -3));
                    }
                }
            }
        } else {
            a2 = a.a(context, (h0.e) dVar, resources, i12);
            if (a2 != null) {
                new Handler(Looper.getMainLooper()).post(new p6(i13, j0Var, a2));
            } else {
                j0Var.b();
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
