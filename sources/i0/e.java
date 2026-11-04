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
import b8.sc;
import com.google.android.gms.common.api.internal.j1;
import e5.t;
import g2.k0;
import gi.w5;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l9.u;
import mi.b0;
import mi.h0;
import x7.e6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class e {
    public static final sc a;
    public static final a0.j b;

    static {
        e6.a("TypefaceCompat static init");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            a = new j();
        } else if (i3 >= 28) {
            a = new i();
        } else if (i3 >= 26) {
            a = new h();
        } else {
            if (i3 >= 24) {
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
    public static Typeface a(Context context, h0.d dVar, Resources resources, int i3, String str, int i10, int i11, k0 k0Var) {
        Typeface a10;
        Typeface typeface;
        List unmodifiableList;
        int i12 = 29;
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
                new Handler(Looper.getMainLooper()).post(new g2.c(i12, k0Var, typeface));
                return typeface;
            }
            int i13 = 1;
            boolean z11 = gVar.d == 0;
            int i14 = gVar.c;
            Handler handler = new Handler(Looper.getMainLooper());
            int i15 = 2;
            w5 w5Var = new w5(i15, z10);
            w5Var.b = k0Var;
            o0.e eVar = gVar.b;
            if (eVar != null) {
                Object[] objArr = {gVar.a, eVar};
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
            h0 h0Var = new h0(w5Var, oVar, z10, i13);
            int i17 = 23;
            if (!z11) {
                String a11 = o0.h.a(i11, unmodifiableList);
                Typeface typeface2 = (Typeface) o0.h.a.a(a11);
                if (typeface2 != null) {
                    oVar.execute(new u(i17, w5Var, typeface2));
                    a10 = typeface2;
                } else {
                    t tVar = new t(h0Var, i15);
                    synchronized (o0.h.c) {
                        try {
                            l lVar = o0.h.d;
                            ArrayList arrayList3 = (ArrayList) lVar.get(a11);
                            if (arrayList3 != null) {
                                arrayList3.add(tVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(tVar);
                                lVar.put(a11, arrayList4);
                                o0.f fVar = new o0.f(a11, context, unmodifiableList, i11, 1);
                                ThreadPoolExecutor threadPoolExecutor = o0.h.b;
                                t tVar2 = new t(a11, 3);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                j1 j1Var = new j1();
                                j1Var.b = fVar;
                                j1Var.c = tVar2;
                                j1Var.d = handler2;
                                threadPoolExecutor.execute(j1Var);
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
                a0.j jVar = o0.h.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{eVar2}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String a12 = o0.h.a(i11, DesugarCollections.unmodifiableList(arrayList5));
                Typeface typeface3 = (Typeface) o0.h.a.a(a12);
                if (typeface3 != null) {
                    oVar.execute(new u(i17, w5Var, typeface3));
                    a10 = typeface3;
                } else if (i14 == -1) {
                    Object[] objArr3 = {eVar2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = objArr3[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    o0.g b10 = o0.h.b(a12, context, DesugarCollections.unmodifiableList(arrayList6), i11);
                    h0Var.U(b10);
                    a10 = b10.a;
                } else {
                    try {
                        try {
                            o0.g gVar2 = (o0.g) o0.h.b.submit(new o0.f(a12, context, eVar2, i11, 0)).get(i14, TimeUnit.MILLISECONDS);
                            h0Var.U(gVar2);
                            a10 = gVar2.a;
                        } catch (InterruptedException e10) {
                            throw e10;
                        } catch (ExecutionException e11) {
                            throw new RuntimeException(e11);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((o) h0Var.c).execute(new b0((w5) h0Var.b, -3));
                    }
                }
            }
        } else {
            a10 = a.a(context, (h0.e) dVar, resources, i11);
            if (a10 != null) {
                new Handler(Looper.getMainLooper()).post(new g2.c(i12, k0Var, a10));
            } else {
                k0Var.b();
            }
        }
        if (a10 != null) {
            b.b(b(resources, i3, str, i10, i11), a10);
        }
        return a10;
    }

    public static String b(Resources resources, int i3, String str, int i10, int i11) {
        return resources.getResourcePackageName(i3) + '-' + str + '-' + i10 + '-' + i3 + '-' + i11;
    }
}
