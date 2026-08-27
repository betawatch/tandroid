package i0;

import a9.o;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import androidx.biometric.n;
import com.google.android.gms.common.api.internal.q1;
import d5.e0;
import d5.u;
import g7.l8;
import g7.x7;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m.i3;
import n2.t;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class f {
    public static final x7 a;
    public static final a0.j b;

    static {
        l8.a("TypefaceCompat static init");
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
    public static Typeface a(Context context, h0.d dVar, Resources resources, int i10, String str, int i11, int i12, e0 e0Var) {
        Typeface a2;
        Typeface typeface;
        List unmodifiableList;
        int i13 = 15;
        if (dVar instanceof h0.g) {
            h0.g gVar = (h0.g) dVar;
            String str2 = gVar.e;
            a2 = null;
            boolean z10 = false;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                new Handler(Looper.getMainLooper()).post(new u(i13, e0Var, typeface));
                return typeface;
            }
            int i14 = 1;
            boolean z11 = gVar.d == 0;
            int i15 = gVar.c;
            Handler handler = new Handler(Looper.getMainLooper());
            a9.i iVar = new a9.i(18, z10);
            iVar.b = e0Var;
            o0.e eVar = gVar.b;
            int i16 = 2;
            if (eVar != null) {
                Object[] objArr = {gVar.a, eVar};
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
            n nVar = new n(handler, 4);
            g5.b bVar = new g5.b(27, iVar, nVar);
            int i18 = 29;
            if (!z11) {
                String a3 = o0.h.a(i12, unmodifiableList);
                Typeface typeface2 = (Typeface) o0.h.a.a(a3);
                if (typeface2 != null) {
                    nVar.execute(new o(iVar, typeface2, z10, i18));
                    a2 = typeface2;
                } else {
                    t tVar = new t(bVar, i14);
                    synchronized (o0.h.c) {
                        try {
                            a0.k kVar = o0.h.d;
                            ArrayList arrayList3 = (ArrayList) kVar.get(a3);
                            if (arrayList3 != null) {
                                arrayList3.add(tVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(tVar);
                                kVar.put(a3, arrayList4);
                                o0.f fVar = new o0.f(a3, context, unmodifiableList, i12, 1);
                                ThreadPoolExecutor threadPoolExecutor = o0.h.b;
                                t tVar2 = new t(a3, i16);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                q1 q1Var = new q1();
                                q1Var.b = fVar;
                                q1Var.c = tVar2;
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
                o0.e eVar2 = (o0.e) unmodifiableList.get(0);
                a0.j jVar = o0.h.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{eVar2}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String a10 = o0.h.a(i12, DesugarCollections.unmodifiableList(arrayList5));
                Typeface typeface3 = (Typeface) o0.h.a.a(a10);
                if (typeface3 != null) {
                    nVar.execute(new o(iVar, typeface3, z10, i18));
                    a2 = typeface3;
                } else if (i15 == -1) {
                    Object[] objArr3 = {eVar2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = objArr3[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    o0.g b10 = o0.h.b(a10, context, DesugarCollections.unmodifiableList(arrayList6), i12);
                    bVar.s(b10);
                    a2 = b10.a;
                } else {
                    try {
                        try {
                            try {
                                o0.g gVar2 = (o0.g) o0.h.b.submit(new o0.f(a10, context, eVar2, i12, 0)).get(i15, TimeUnit.MILLISECONDS);
                                bVar.s(gVar2);
                                a2 = gVar2.a;
                            } catch (InterruptedException e9) {
                                throw e9;
                            }
                        } catch (ExecutionException e10) {
                            throw new RuntimeException(e10);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((n) bVar.c).execute(new i3((a9.i) bVar.b, -3));
                    }
                }
            }
        } else {
            a2 = a.a(context, (h0.e) dVar, resources, i12);
            if (a2 != null) {
                new Handler(Looper.getMainLooper()).post(new u(i13, e0Var, a2));
            } else {
                e0Var.a();
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
