package i0;

import a0.k;
import ag.o1;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import androidx.biometric.o;
import com.google.android.gms.common.api.internal.q1;
import f5.b0;
import g9.l;
import h7.f8;
import h7.m8;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import lh.m7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class e {
    public static final f8 a;
    public static final a0.j b;

    static {
        m8.a("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            a = new j();
        } else if (i10 >= 28) {
            a = new i();
        } else if (i10 >= 26) {
            a = new h();
        } else {
            if (i10 >= 24) {
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
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, h0.d dVar, Resources resources, int i10, String str, int i11, int i12, b0 b0Var) {
        Typeface a2;
        Typeface typeface;
        List unmodifiableList;
        Typeface typeface2;
        int i13 = 16;
        if (dVar instanceof h0.g) {
            h0.g gVar = (h0.g) dVar;
            String str2 = gVar.e;
            a2 = null;
            boolean z10 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                new Handler(Looper.getMainLooper()).post(new ef.c(i13, b0Var, typeface));
                return typeface;
            }
            int i14 = 1;
            boolean z11 = gVar.d == 0;
            int i15 = gVar.c;
            Handler handler = new Handler(Looper.getMainLooper());
            o1 o1Var = new o1(i13, z10);
            o1Var.b = b0Var;
            o0.d dVar2 = gVar.b;
            if (dVar2 != null) {
                Object[] objArr3 = {gVar.a, dVar2};
                ArrayList arrayList = new ArrayList(2);
                for (int i16 = 0; i16 < 2; i16++) {
                    Object obj = objArr3[i16];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            } else {
                Object[] objArr4 = {gVar.a};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr4[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            o oVar = new o(handler, 4);
            l lVar = new l(o1Var, oVar, objArr2 == true ? 1 : 0, 25);
            int i17 = 26;
            if (!z11) {
                String a10 = o0.h.a(i12, unmodifiableList);
                typeface2 = (Typeface) o0.h.a.a(a10);
                if (typeface2 != null) {
                    oVar.execute(new ab.o(i17, o1Var, typeface2));
                } else {
                    o0.f fVar = new o0.f(lVar, objArr == true ? 1 : 0);
                    synchronized (o0.h.c) {
                        try {
                            k kVar = o0.h.d;
                            ArrayList arrayList3 = (ArrayList) kVar.get(a10);
                            if (arrayList3 != null) {
                                arrayList3.add(fVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(fVar);
                                kVar.put(a10, arrayList4);
                                o0.e eVar = new o0.e(a10, context, unmodifiableList, i12, 1);
                                ThreadPoolExecutor threadPoolExecutor = o0.h.b;
                                o0.f fVar2 = new o0.f(a10, i14);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                q1 q1Var = new q1();
                                q1Var.b = eVar;
                                q1Var.c = fVar2;
                                q1Var.d = handler2;
                                threadPoolExecutor.execute(q1Var);
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
                a0.j jVar = o0.h.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{dVar3}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String a11 = o0.h.a(i12, DesugarCollections.unmodifiableList(arrayList5));
                typeface2 = (Typeface) o0.h.a.a(a11);
                if (typeface2 != null) {
                    oVar.execute(new ab.o(i17, o1Var, typeface2));
                } else if (i15 == -1) {
                    Object[] objArr5 = {dVar3};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = objArr5[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    o0.g b10 = o0.h.b(a11, context, DesugarCollections.unmodifiableList(arrayList6), i12);
                    lVar.p(b10);
                    a2 = b10.a;
                } else {
                    try {
                        try {
                            try {
                                o0.g gVar2 = (o0.g) o0.h.b.submit(new o0.e(a11, context, dVar3, i12, 0)).get(i15, TimeUnit.MILLISECONDS);
                                lVar.p(gVar2);
                                a2 = gVar2.a;
                            } catch (TimeoutException unused) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e10) {
                            throw e10;
                        } catch (ExecutionException e11) {
                            throw new RuntimeException(e11);
                        }
                    } catch (InterruptedException unused2) {
                        ((o) lVar.c).execute(new m7((o1) lVar.b, -3));
                    }
                }
            }
            a2 = typeface2;
        } else {
            a2 = a.a(context, (h0.e) dVar, resources, i12);
            if (a2 != null) {
                new Handler(Looper.getMainLooper()).post(new ef.c(i13, b0Var, a2));
            } else {
                b0Var.a();
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
