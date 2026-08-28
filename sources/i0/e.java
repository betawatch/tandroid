package i0;

import a0.k;
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
import d5.d0;
import e5.u;
import f7.j8;
import f7.r8;
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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class e {
    public static final j8 a;
    public static final a0.j b;

    static {
        r8.a("TypefaceCompat static init");
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            a = new j();
        } else if (i9 >= 28) {
            a = new i();
        } else if (i9 >= 26) {
            a = new h();
        } else {
            if (i9 >= 24) {
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2.equals(r7) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, h0.d dVar, Resources resources, int i9, String str, int i10, int i11, d0 d0Var) {
        Typeface a2;
        Typeface typeface;
        List unmodifiableList;
        int i12 = 28;
        if (dVar instanceof h0.g) {
            h0.g gVar = (h0.g) dVar;
            String str2 = gVar.e;
            Typeface typeface2 = null;
            boolean z10 = false;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                new Handler(Looper.getMainLooper()).post(new u(i12, d0Var, typeface));
                return typeface;
            }
            int i13 = 1;
            boolean z11 = gVar.d == 0;
            int i14 = gVar.c;
            Handler handler = new Handler(Looper.getMainLooper());
            k5.i iVar = new k5.i(18, z10);
            iVar.b = d0Var;
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
            g5.b bVar = new g5.b(27, iVar, oVar);
            if (!z11) {
                String a3 = o0.g.a(i11, unmodifiableList);
                Typeface typeface3 = (Typeface) o0.g.a.a(a3);
                if (typeface3 != null) {
                    oVar.execute(new androidx.biometric.j(iVar, typeface3, z10, i12));
                    typeface2 = typeface3;
                } else {
                    n2.u uVar = new n2.u(bVar, i13);
                    synchronized (o0.g.c) {
                        try {
                            k kVar = o0.g.d;
                            ArrayList arrayList3 = (ArrayList) kVar.get(a3);
                            if (arrayList3 != null) {
                                arrayList3.add(uVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(uVar);
                                kVar.put(a3, arrayList4);
                                o0.e eVar = new o0.e(a3, context, unmodifiableList, i11, 1);
                                ThreadPoolExecutor threadPoolExecutor = o0.g.b;
                                n2.u uVar2 = new n2.u(a3, i15);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                q1 q1Var = new q1();
                                q1Var.b = eVar;
                                q1Var.c = uVar2;
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
                a0.j jVar = o0.g.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{dVar3}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String a10 = o0.g.a(i11, DesugarCollections.unmodifiableList(arrayList5));
                Typeface typeface4 = (Typeface) o0.g.a.a(a10);
                if (typeface4 != null) {
                    oVar.execute(new androidx.biometric.j(iVar, typeface4, z10, i12));
                    typeface2 = typeface4;
                } else if (i14 == -1) {
                    Object[] objArr3 = {dVar3};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = objArr3[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    o0.f b10 = o0.g.b(a10, context, DesugarCollections.unmodifiableList(arrayList6), i11);
                    bVar.s(b10);
                    typeface2 = b10.a;
                } else {
                    try {
                        try {
                            try {
                                o0.f fVar = (o0.f) o0.g.b.submit(new o0.e(a10, context, dVar3, i11, 0)).get(i14, TimeUnit.MILLISECONDS);
                                bVar.s(fVar);
                                typeface2 = fVar.a;
                            } catch (InterruptedException e10) {
                                throw e10;
                            }
                        } catch (ExecutionException e11) {
                            throw new RuntimeException(e11);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((o) bVar.c).execute(new i3((k5.i) bVar.b, -3));
                    }
                }
            }
            a2 = typeface2;
        } else {
            a2 = a.a(context, (h0.e) dVar, resources, i11);
            if (a2 != null) {
                new Handler(Looper.getMainLooper()).post(new u(i12, d0Var, a2));
            } else {
                d0Var.a();
            }
        }
        if (a2 != null) {
            b.b(b(resources, i9, str, i10, i11), a2);
        }
        return a2;
    }

    public static String b(Resources resources, int i9, String str, int i10, int i11) {
        return resources.getResourcePackageName(i9) + '-' + str + '-' + i10 + '-' + i9 + '-' + i11;
    }
}
