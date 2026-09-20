package i0;

import a0.k;
import a0.m;
import ai.q4;
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
import gg.x1;
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
import v7.i8;
import w7.b8;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public abstract class e {
    public static final i8 a;
    public static final k b;

    static {
        b8.a("TypefaceCompat static init");
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
        b = new k(16);
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
        int i13 = 1;
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
                new Handler(Looper.getMainLooper()).post(new x1(i13, a0Var, typeface));
                return typeface;
            }
            boolean z11 = gVar.d == 0;
            int i14 = gVar.c;
            Handler handler = new Handler(Looper.getMainLooper());
            a6.i iVar = new a6.i(23, z10);
            iVar.b = a0Var;
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
            n nVar = new n(handler, 4);
            m5.e eVar = new m5.e(4, iVar, nVar);
            int i17 = 19;
            if (!z11) {
                String a10 = o0.g.a(i12, unmodifiableList);
                Typeface typeface2 = (Typeface) o0.g.a.a(a10);
                if (typeface2 != null) {
                    nVar.execute(new s(i17, iVar, typeface2));
                    a2 = typeface2;
                } else {
                    z zVar = new z(eVar, i13);
                    synchronized (o0.g.c) {
                        try {
                            m mVar = o0.g.d;
                            ArrayList arrayList3 = (ArrayList) mVar.get(a10);
                            if (arrayList3 != null) {
                                arrayList3.add(zVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(zVar);
                                mVar.put(a10, arrayList4);
                                o0.e eVar2 = new o0.e(a10, context, unmodifiableList, i12, 1);
                                ThreadPoolExecutor threadPoolExecutor = o0.g.b;
                                z zVar2 = new z(a10, i15);
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
                k kVar = o0.g.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{dVar3}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String a11 = o0.g.a(i12, DesugarCollections.unmodifiableList(arrayList5));
                Typeface typeface3 = (Typeface) o0.g.a.a(a11);
                if (typeface3 != null) {
                    nVar.execute(new s(i17, iVar, typeface3));
                    a2 = typeface3;
                } else if (i14 == -1) {
                    Object[] objArr3 = {dVar3};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = objArr3[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    o0.f b10 = o0.g.b(a11, context, DesugarCollections.unmodifiableList(arrayList6), i12);
                    eVar.K(b10);
                    a2 = b10.a;
                } else {
                    try {
                        try {
                            o0.f fVar = (o0.f) o0.g.b.submit(new o0.e(a11, context, dVar3, i12, 0)).get(i14, TimeUnit.MILLISECONDS);
                            eVar.K(fVar);
                            a2 = fVar.a;
                        } catch (InterruptedException e) {
                            throw e;
                        } catch (ExecutionException e7) {
                            throw new RuntimeException(e7);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((n) eVar.c).execute(new q4((a6.i) eVar.b, -3));
                    }
                }
            }
        } else {
            a2 = a.a(context, (h0.e) dVar, resources, i12);
            if (a2 != null) {
                new Handler(Looper.getMainLooper()).post(new x1(i13, a0Var, a2));
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
