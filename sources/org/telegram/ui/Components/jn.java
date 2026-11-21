package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.location.Location;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcel;
import android.view.GestureDetector;
import android.widget.TextView;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class jn implements g61, og.n, org.telegram.ui.pm0, o2.i, an0, com.google.android.gms.common.api.internal.q, tg.m1, u2.m, com.google.android.gms.common.api.internal.n, q5.b, androidx.lifecycle.s0 {
    public static jn c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ jn(int i7) {
        this.a = i7;
    }

    public static void P(String str, TreeMap treeMap) {
        String[] split = str.split(":", 2);
        if (split.length < 2) {
            return;
        }
        String trim = split[0].trim();
        String trim2 = split[1].trim();
        List list = (List) treeMap.get(trim);
        if (list == null) {
            list = new ArrayList();
            treeMap.put(trim, list);
        }
        list.add(trim2);
    }

    public static jn m() {
        if (c == null) {
            Point point = org.telegram.messenger.g0.q;
            c = new jn(point.x, point.y);
        }
        return c;
    }

    public static float[] s(ArrayList arrayList) {
        float f10;
        int i7;
        int i10;
        float f11;
        double d;
        double d2;
        double[] dArr;
        ArrayList arrayList2;
        float f12;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            f10 = 255.0f;
            if (i13 >= size) {
                break;
            }
            PointF pointF = (PointF) arrayList.get(i13);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
            i13++;
        }
        int size2 = arrayList.size();
        int i14 = 1;
        double d10 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            i7 = 0;
            i10 = 1;
            f11 = 255.0f;
            d = 1.0d;
            d2 = 6.0d;
            dArr = null;
        } else {
            char c10 = 2;
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d11 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i15 = 1;
            while (true) {
                i11 = size2 - 1;
                if (i15 >= i11) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i15 - 1);
                PointF pointF3 = (PointF) arrayList.get(i15);
                int i16 = i15 + 1;
                double d12 = d10;
                PointF pointF4 = (PointF) arrayList.get(i16);
                double[] dArr5 = dArr2[i15];
                char c11 = c10;
                float f13 = pointF3.x;
                double d13 = d11;
                int i17 = i12;
                int i18 = i14;
                double d14 = f13 - pointF2.x;
                dArr5[i17] = d14 / 6.0d;
                float f14 = pointF4.x;
                float f15 = f10;
                dArr5[i18] = (f14 - r14) / 3.0d;
                double d15 = f14 - f13;
                dArr5[c11] = d15 / 6.0d;
                float f16 = pointF4.y;
                float f17 = pointF3.y;
                dArr3[i15] = ((f16 - f17) / d15) - ((f17 - pointF2.y) / d14);
                i15 = i16;
                c10 = c11;
                d10 = d12;
                d11 = d13;
                i12 = i17;
                i14 = i18;
                f10 = f15;
            }
            i7 = i12;
            i10 = i14;
            f11 = f10;
            d = d10;
            char c12 = c10;
            double d16 = d11;
            d2 = 6.0d;
            dArr3[i7] = d16;
            dArr3[i11] = d16;
            double[] dArr6 = dArr2[i11];
            dArr6[i10] = d;
            dArr6[i7] = d16;
            dArr6[c12] = d16;
            for (int i19 = i10; i19 < size2; i19++) {
                double[] dArr7 = dArr2[i19];
                double d17 = dArr7[i7];
                int i20 = i19 - 1;
                double[] dArr8 = dArr2[i20];
                double d18 = d17 / dArr8[i10];
                dArr7[i10] = dArr7[i10] - (dArr8[c12] * d18);
                dArr7[i7] = d16;
                dArr3[i19] = dArr3[i19] - (d18 * dArr3[i20]);
            }
            for (int i21 = size2 - 2; i21 >= 0; i21--) {
                double[] dArr9 = dArr2[i21];
                double d19 = dArr9[c12];
                int i22 = i21 + 1;
                double[] dArr10 = dArr2[i22];
                double d20 = d19 / dArr10[i10];
                dArr9[i10] = dArr9[i10] - (dArr10[i7] * d20);
                dArr9[c12] = d16;
                dArr3[i21] = dArr3[i21] - (d20 * dArr3[i22]);
            }
            dArr = new double[size2];
            for (int i23 = i7; i23 < size2; i23++) {
                dArr[i23] = dArr3[i23] / dArr2[i23][i10];
            }
        }
        int length = dArr.length;
        if (length < i10) {
            arrayList2 = null;
            f12 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i24 = i7;
            while (i24 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i24);
                int i25 = i24 + 1;
                PointF pointF6 = (PointF) arrayList.get(i25);
                int i26 = (int) pointF5.x;
                while (true) {
                    float f18 = pointF6.x;
                    if (i26 < ((int) f18)) {
                        float f19 = i26;
                        PointF pointF7 = pointF5;
                        double d21 = f18 - pointF5.x;
                        double d22 = (f19 - r12) / d21;
                        double d23 = d - d22;
                        int i27 = length;
                        double[] dArr11 = dArr;
                        float f20 = (float) (((((((d22 * d22) * d22) - d22) * dArr11[i25]) + ((((d23 * d23) * d23) - d23) * dArr11[i24])) * ((d21 * d21) / d2)) + (pointF6.y * d22) + (pointF7.y * d23));
                        if (f20 > f11) {
                            f20 = f11;
                        } else if (f20 < 0.0f) {
                            f20 = 0.0f;
                        }
                        arrayList2.add(new PointF(f19, f20));
                        i26++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i27;
                    }
                }
                i24 = i25;
            }
            f12 = 0.0f;
            arrayList2.add((PointF) i5.c.h(1, arrayList));
        }
        int i28 = i7;
        float f21 = ((PointF) arrayList2.get(i28)).x;
        if (f21 > f12) {
            for (int i29 = (int) f21; i29 >= 0; i29--) {
                arrayList2.add(i28, new PointF(i29, f12));
            }
        }
        float f22 = ((PointF) i5.c.h(1, arrayList2)).x;
        if (f22 < f11) {
            for (int i30 = ((int) f22) + 1; i30 <= 255; i30++) {
                arrayList2.add(new PointF(i30, f11));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        while (i28 < size3) {
            PointF pointF8 = (PointF) arrayList2.get(i28);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i28] = sqrt;
            i28++;
        }
        return fArr;
    }

    @Override // og.n
    public void D(boolean z10) {
        rd0 rd0Var = (rd0) this.b;
        rd0Var.getClass();
        qd0 qd0Var = rd0Var.a;
        if (qd0Var != null) {
            ((org.telegram.ui.so0) qd0Var).n(z10);
        }
    }

    public void F(s4.p pVar, s4.m mVar, Collection collection) {
        s4.e eVar = (s4.e) this.b;
        if (pVar != eVar.y || mVar == null) {
            if (pVar == eVar.e) {
                if (mVar != null) {
                    eVar.n(eVar.d, mVar);
                }
                eVar.d.n(collection);
                return;
            }
            return;
        }
        s4.u uVar = eVar.x.a;
        String d = mVar.d();
        s4.v vVar = new s4.v(uVar, d, eVar.b(uVar, d), false);
        vVar.i(mVar);
        if (eVar.d == vVar) {
            return;
        }
        eVar.h(eVar, vVar, eVar.y, 3, eVar.x, collection);
        eVar.x = null;
        eVar.y = null;
    }

    @Override // og.n
    public void G() {
        qd0 qd0Var = ((rd0) this.b).a;
        if (qd0Var != null) {
            PhotoViewer photoViewer = ((org.telegram.ui.so0) qd0Var).a;
            if (photoViewer.d2 == 1) {
                photoViewer.H2 = true;
                photoViewer.o3();
            }
        }
    }

    public byte Q() {
        int read = ((ab.d) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public int R() {
        return ((Q() & 255) << 24) | ((Q() & 255) << 16) | ((Q() & 255) << 8) | (Q() & 255);
    }

    public int S() {
        return ((Q() & Byte.MAX_VALUE) << 21) | ((Q() & Byte.MAX_VALUE) << 14) | ((Q() & Byte.MAX_VALUE) << 7) | (Q() & Byte.MAX_VALUE);
    }

    public void T(long j3) {
        long j10 = 0;
        while (j10 < j3) {
            long skip = ((ab.d) this.b).skip(j3 - j10);
            if (skip <= 0) {
                throw new EOFException();
            }
            j10 += skip;
        }
    }

    public void U(com.google.android.gms.internal.clearcut.y0 y0Var, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list == null || (str = (String) list.get(0)) == null || str.length() == 0) {
            return;
        }
        synchronized (((rc.u) this.b).c) {
        }
        throw new rc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), y0Var);
    }

    @Override // o2.i
    public long a(long j3) {
        return 0L;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        s6.b bVar = (s6.b) ((s6.a) obj).n();
        q6.r rVar = (q6.r) this.b;
        Parcel j12 = bVar.j1();
        n7.a.b(j12, rVar);
        try {
            bVar.b.transact(1, j12, null, 1);
            j12.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th2) {
            j12.recycle();
            throw th2;
        }
    }

    @Override // u2.m
    public void b(int i7, int i10, int i11, long j3) {
        ((MediaCodec) this.b).queueInputBuffer(i7, 0, i10, j3, i11);
    }

    @Override // u2.m
    public void c(int i7, k2.d dVar, long j3, int i10) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i7, 0, dVar.i, j3, i10);
    }

    @Override // org.telegram.ui.pm0
    public void d(ArrayList arrayList) {
        a8.r7 r7Var = (a8.r7) this.b;
        try {
            if (arrayList.isEmpty()) {
                return;
            }
            org.telegram.messenger.yy yyVar = (org.telegram.messenger.yy) arrayList.get(0);
            if (yyVar.c != null) {
                r7Var.f = new File(org.telegram.messenger.w7.z(4), Utilities.b.nextInt() + ".jpg");
                Point c12 = org.telegram.messenger.g0.c1();
                Bitmap K = org.telegram.messenger.ec.K(yyVar.c, null, (float) c12.x, (float) c12.y, true);
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream((File) r7Var.f));
                ((o71) r7Var.e).b((File) r7Var.f, K, true);
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 f(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 g(Class cls, y1.b bVar) {
        androidx.lifecycle.m0 m0Var = null;
        for (y1.c cVar : (y1.c[]) this.b) {
            if (cVar.a.equals(cls)) {
                m0Var = new androidx.lifecycle.m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // fd.a
    public Object get() {
        String packageName = ((Context) ((fd.a) this.b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // org.telegram.ui.Components.an0
    public CharSequence getContentDescription() {
        pg.h hVar = (pg.h) this.b;
        float f10 = hVar.b;
        return String.valueOf(Math.round((hVar.a.getProgress() * (hVar.c - f10)) + f10));
    }

    @Override // o2.i
    public long h(long j3, long j10) {
        return 0L;
    }

    @Override // o2.i
    public long i(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override // o2.i
    public p2.j k(long j3) {
        return (p2.j) this.b;
    }

    public void l() {
        sg.s0 s0Var = ((sg.u0) this.b).d;
        if (s0Var != null) {
            sg.r0 r0Var = s0Var.s;
            if (r0Var != null) {
                s0Var.cancelRunnable(r0Var);
                s0Var.s = null;
            }
            sg.r0 r0Var2 = new sg.r0(s0Var, 1);
            s0Var.s = r0Var2;
            s0Var.postRunnable(r0Var2, 1L);
        }
    }

    @Override // org.telegram.ui.Components.an0
    public void n(boolean z10, float f10) {
        pg.h hVar = (pg.h) this.b;
        float f11 = hVar.b;
        float z11 = com.google.android.gms.internal.vision.e2.z(hVar.c, f11, f10, f11);
        hVar.d = z11;
        if (z10) {
            q6 q6Var = hVar.e;
            q6Var.getClass();
            q6Var.c(null, z11);
        }
        hVar.invalidate();
    }

    @Override // o2.i
    public long o(long j3, long j10) {
        return 0L;
    }

    @Override // org.telegram.ui.Components.g61
    public void onError(i61 i61Var, Exception exc) {
        switch (this.a) {
            case 2:
                org.telegram.messenger.a8.g(exc, true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.g61
    public void onRenderedFirstFrame() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.g61
    public void onStateChanged(boolean z10, int i7) {
        c50 c50Var;
        org.telegram.messenger.e20 e20Var;
        switch (this.a) {
            case 2:
                u40 u40Var = (u40) this.b;
                i61 i61Var = u40Var.I0.T;
                if (i61Var != null && i61Var.d0() && i7 == 4 && (e20Var = (c50Var = u40Var.I0).S) != null) {
                    i61 i61Var2 = c50Var.T;
                    long j3 = e20Var.a;
                    if (j3 <= 0) {
                        j3 = 0;
                    }
                    i61Var2.p0(j3);
                    break;
                }
                break;
            default:
                zi0 zi0Var = (zi0) this.b;
                if (z10 && zi0Var.n.S() >= 0) {
                    zi0Var.x = true;
                }
                we0 we0Var = zi0Var.f;
                hb0 hb0Var = zi0Var.y;
                we0Var.a(z10, true);
                org.telegram.messenger.g0.r(hb0Var);
                if (z10) {
                    org.telegram.messenger.g0.h3(hb0Var, 16L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.g61
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.pm0
    public void p() {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            ((Activity) ((a8.r7) this.b).c).startActivityForResult(intent, 11);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // com.google.android.gms.common.api.internal.n
    public void q(Object obj) {
        LocationResult locationResult = (LocationResult) this.b;
        org.telegram.messenger.pa paVar = ((org.telegram.messenger.x9) obj).a;
        List list = locationResult.a;
        int size = list.size();
        paVar.onLocationChanged(size == 0 ? null : (Location) list.get(size - 1));
    }

    @Override // og.n
    public void r() {
        qd0 qd0Var = ((rd0) this.b).a;
        if (qd0Var != null) {
            ((org.telegram.ui.so0) qd0Var).a.f0.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.an0
    public /* synthetic */ int r0() {
        return 0;
    }

    @Override // u2.m
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    @Override // o2.i
    public boolean t() {
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 15:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // o2.i
    public long v() {
        return 0L;
    }

    @Override // og.n
    public void w(boolean z10) {
        ((rd0) this.b).c.setAspectLock(z10);
    }

    @Override // o2.i
    public long y(long j3) {
        return 1L;
    }

    @Override // tg.m1
    public void y1(float f10) {
        tg.p0 p0Var = (tg.p0) this.b;
        sg.k0.e(p0Var.a).k("-1", f10);
        p0Var.e.setBrushSize(f10);
    }

    @Override // o2.i
    public long z(long j3, long j10) {
        return 1L;
    }

    public /* synthetic */ jn(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
        int i7 = this.a;
    }

    public jn() {
        this.a = 12;
        this.b = new org.telegram.utils.twidget.w(1.0f, 5, 1, false);
    }

    @Override // tg.m1
    public float get() {
        tg.p0 p0Var = (tg.p0) this.b;
        int i7 = p0Var.a;
        sg.h currentBrush = p0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return sg.k0.e(i7).i;
        }
        return sg.k0.e(i7).f("-1", currentBrush.d());
    }

    public jn(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 11;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public jn(y1.c[] initializers) {
        this.a = 27;
        kotlin.jvm.internal.j.e(initializers, "initializers");
        this.b = initializers;
    }

    public jn(ArrayList arrayList) {
        this.a = 24;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    public jn(TextView textView) {
        this.a = 18;
        this.b = new t1.g(textView);
    }

    public jn(int i7, int i10) {
        this.a = 26;
        this.b = org.telegram.messenger.t0.b.getSharedPreferences(a8.p0.m(i7, i10, "pip_floating_", "_"), 0);
    }

    private final /* synthetic */ void A(m2.a aVar) {
    }

    private final /* synthetic */ void E(m2.a aVar) {
    }

    private final /* synthetic */ void H(m2.a aVar) {
    }

    private final /* synthetic */ void I(m2.a aVar) {
    }

    private final /* synthetic */ void J(m2.a aVar) {
    }

    private final /* synthetic */ void K(m2.a aVar) {
    }

    private final /* synthetic */ void L(SurfaceTexture surfaceTexture) {
    }

    private final /* synthetic */ void M(SurfaceTexture surfaceTexture) {
    }

    private final void B() {
    }

    private final void x() {
    }

    @Override // org.telegram.ui.Components.an0
    public void C() {
    }

    @Override // u2.m
    public void flush() {
    }

    @Override // u2.m
    public void j() {
    }

    @Override // u2.m
    public void shutdown() {
    }

    @Override // u2.m
    public void start() {
    }

    private final void u(i61 i61Var, Exception exc) {
    }

    @Override // o2.i
    public long e(long j3, long j10) {
        return j10;
    }

    private final void N(int i7, int i10, float f10, int i11) {
    }

    private final void O(int i7, int i10, float f10, int i11) {
    }
}
