package org.telegram.ui.Components;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i9 implements wj0, k51, pg.l, r0.m, vr0, re.a, kg.u1, om0, com.google.android.gms.common.api.internal.p, u4.i1, ug.k1, androidx.lifecycle.s0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i9(int i3, boolean z10) {
        this.a = i3;
    }

    public static float[] v(ArrayList arrayList) {
        float f10;
        int i3;
        int i10;
        float f11;
        double d;
        double d10;
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
        double d11 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            i3 = 0;
            i10 = 1;
            f11 = 255.0f;
            d = 1.0d;
            d10 = 6.0d;
            dArr = null;
        } else {
            char c2 = 2;
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d12 = 0.0d;
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
                double d13 = d11;
                PointF pointF4 = (PointF) arrayList.get(i16);
                double[] dArr5 = dArr2[i15];
                char c10 = c2;
                float f13 = pointF3.x;
                double d14 = d12;
                int i17 = i12;
                int i18 = i14;
                double d15 = f13 - pointF2.x;
                dArr5[i17] = d15 / 6.0d;
                float f14 = pointF4.x;
                float f15 = f10;
                dArr5[i18] = (f14 - r14) / 3.0d;
                double d16 = f14 - f13;
                dArr5[c10] = d16 / 6.0d;
                float f16 = pointF4.y;
                float f17 = pointF3.y;
                dArr3[i15] = ((f16 - f17) / d16) - ((f17 - pointF2.y) / d15);
                i15 = i16;
                c2 = c10;
                d11 = d13;
                d12 = d14;
                i12 = i17;
                i14 = i18;
                f10 = f15;
            }
            i3 = i12;
            i10 = i14;
            f11 = f10;
            d = d11;
            char c11 = c2;
            double d17 = d12;
            d10 = 6.0d;
            dArr3[i3] = d17;
            dArr3[i11] = d17;
            double[] dArr6 = dArr2[i11];
            dArr6[i10] = d;
            dArr6[i3] = d17;
            dArr6[c11] = d17;
            for (int i19 = i10; i19 < size2; i19++) {
                double[] dArr7 = dArr2[i19];
                double d18 = dArr7[i3];
                int i20 = i19 - 1;
                double[] dArr8 = dArr2[i20];
                double d19 = d18 / dArr8[i10];
                dArr7[i10] = dArr7[i10] - (dArr8[c11] * d19);
                dArr7[i3] = d17;
                dArr3[i19] = dArr3[i19] - (d19 * dArr3[i20]);
            }
            for (int i21 = size2 - 2; i21 >= 0; i21--) {
                double[] dArr9 = dArr2[i21];
                double d20 = dArr9[c11];
                int i22 = i21 + 1;
                double[] dArr10 = dArr2[i22];
                double d21 = d20 / dArr10[i10];
                dArr9[i10] = dArr9[i10] - (dArr10[i3] * d21);
                dArr9[c11] = d17;
                dArr3[i21] = dArr3[i21] - (d21 * dArr3[i22]);
            }
            dArr = new double[size2];
            for (int i23 = i3; i23 < size2; i23++) {
                dArr[i23] = dArr3[i23] / dArr2[i23][i10];
            }
        }
        int length = dArr.length;
        if (length < i10) {
            arrayList2 = null;
            f12 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i24 = i3;
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
                        double d22 = f18 - pointF5.x;
                        double d23 = (f19 - r12) / d22;
                        double d24 = d - d23;
                        int i27 = length;
                        double[] dArr11 = dArr;
                        float f20 = (float) (((((((d23 * d23) * d23) - d23) * dArr11[i25]) + ((((d24 * d24) * d24) - d24) * dArr11[i24])) * ((d22 * d22) / d10)) + (pointF6.y * d23) + (pointF7.y * d24));
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
            arrayList2.add((PointF) k2.p1.h(1, arrayList));
        }
        int i28 = i3;
        float f21 = ((PointF) arrayList2.get(i28)).x;
        if (f21 > f12) {
            for (int i29 = (int) f21; i29 >= 0; i29--) {
                arrayList2.add(i28, new PointF(i29, f12));
            }
        }
        float f22 = ((PointF) k2.p1.h(1, arrayList2)).x;
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

    public static i9 w(float f10, int i3) {
        Point point = org.telegram.messenger.g0.q;
        int i10 = (int) (point.x * f10);
        int i11 = (int) (point.y * f10);
        if (i10 == i11) {
            return new i9(i10, i11, new int[0]);
        }
        if (i3 == 3) {
            return new i9(i10, i11, new int[]{i11, i10});
        }
        return (i3 == 1) == (i10 < i11) ? new i9(i10, i11, new int[0]) : new i9(i11, i10, new int[0]);
    }

    @Override // pg.l
    public void A(boolean z10) {
        ((ad0) this.b).c.setAspectLock(z10);
    }

    @Override // kg.u1
    public /* synthetic */ a0.h C0() {
        return null;
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 G(Class cls, x1.b bVar) {
        androidx.lifecycle.m0 m0Var = null;
        for (x1.c cVar : (x1.c[]) this.b) {
            if (cVar.a.equals(cls)) {
                m0Var = new androidx.lifecycle.m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // re.a
    public void H0() {
        ((o41) this.b).h.c(false);
    }

    @Override // kg.u1
    public /* synthetic */ boolean J1(int i3) {
        return true;
    }

    @Override // re.a
    public void O(float f10, float f11) {
        Runnable runnable = ((o41) this.b).j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // pg.l
    public void Q(boolean z10) {
        ad0 ad0Var = (ad0) this.b;
        ad0Var.getClass();
        zc0 zc0Var = ad0Var.a;
        if (zc0Var != null) {
            ((org.telegram.ui.io0) zc0Var).a(z10);
        }
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        nk0 nk0Var = (nk0) this.b;
        nk0Var.w.setPadding(I0.a, I0.b, I0.c, I0.d);
        nk0Var.s.requestLayout();
        return r0.k1.b;
    }

    @Override // pg.l
    public void S() {
        zc0 zc0Var = ((ad0) this.b).a;
        if (zc0Var != null) {
            PhotoViewer photoViewer = ((org.telegram.ui.io0) zc0Var).a;
            if (photoViewer.d2 == 1) {
                photoViewer.I2 = true;
                photoViewer.t3();
            }
        }
    }

    @Override // re.a
    public boolean U0(float f10, float f11) {
        int L = org.telegram.messenger.g0.L(9.0f);
        RectF rectF = ((o41) this.b).g;
        float f12 = -L;
        rectF.inset(f12, f12);
        boolean contains = rectF.contains(f10, f11);
        float f13 = L;
        rectF.inset(f13, f13);
        return contains;
    }

    @Override // re.a
    public /* synthetic */ boolean Z0(View view, float f10, float f11) {
        return false;
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 16:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                r6.c cVar = (r6.c) ((r6.e) obj).m();
                p6.p pVar = (p6.p) this.b;
                Parcel J0 = cVar.J0();
                m7.a.b(J0, pVar);
                try {
                    cVar.b.transact(1, J0, null, 1);
                    J0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    J0.recycle();
                    throw th2;
                }
            default:
                i8.c cVar2 = (i8.c) this.b;
                t7.x xVar = (t7.x) ((t7.k) obj).m();
                t7.f fVar = new t7.f(1, (TaskCompletionSource) obj2);
                Parcel P0 = xVar.P0();
                int i3 = t7.d.a;
                P0.writeInt(1);
                cVar2.writeToParcel(P0, 0);
                t7.d.c(P0, fVar);
                P0.writeString(null);
                xVar.T0(P0, 63);
                return;
        }
    }

    @Override // org.telegram.ui.Components.wj0
    public void b(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
        chatAttachAlertPhotoLayout.M = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.F.d1(true);
    }

    @Override // org.telegram.ui.Components.wj0
    public boolean c(int i3) {
        return ((ChatAttachAlertPhotoLayout) this.b).H.d(i3) == 0;
    }

    @Override // u4.i1
    public int d(View view) {
        return u4.o0.z(view) - ((ViewGroup.MarginLayoutParams) ((u4.p0) view.getLayoutParams())).topMargin;
    }

    @Override // org.telegram.ui.Components.vr0
    public void e() {
        ((ws0) this.b).J.a(-1);
    }

    @Override // org.telegram.ui.Components.wj0
    public void f(View view, boolean z10) {
        if (z10 == ((ChatAttachAlertPhotoLayout) this.b).L && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.y.c(q5Var);
        }
    }

    @Override // u4.i1
    public int g() {
        return ((u4.o0) this.b).G();
    }

    @Override // re.a
    public /* synthetic */ boolean g0() {
        return true;
    }

    @Override // ug.k1
    public float get() {
        ug.n0 n0Var = (ug.n0) this.b;
        int i3 = n0Var.a;
        tg.h currentBrush = n0Var.e.getCurrentBrush();
        return currentBrush == null ? tg.k0.e(i3).i : tg.k0.e(i3).f("-1", currentBrush.d());
    }

    @Override // org.telegram.ui.Components.om0
    public CharSequence getContentDescription() {
        qg.g gVar = (qg.g) this.b;
        float f10 = gVar.b;
        return String.valueOf(Math.round((gVar.a.getProgress() * (gVar.c - f10)) + f10));
    }

    @Override // re.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // org.telegram.ui.Components.vr0
    public org.telegram.ui.ActionBar.y0 h(String str) {
        org.telegram.ui.ActionBar.f5 f5Var = ((ws0) this.b).J;
        return f5Var.d(0, 0, null, str, true, true, f5Var.n0);
    }

    @Override // u4.i1
    public int i() {
        u4.o0 o0Var = (u4.o0) this.b;
        return o0Var.n - o0Var.C();
    }

    @Override // u4.i1
    public View j(int i3) {
        return ((u4.o0) this.b).q(i3);
    }

    @Override // org.telegram.ui.Components.om0
    public void k(boolean z10, float f10) {
        qg.g gVar = (qg.g) this.b;
        float f11 = gVar.b;
        float y9 = com.google.android.recaptcha.internal.a.y(gVar.c, f11, f10, f11);
        gVar.d = y9;
        if (z10) {
            j6 j6Var = gVar.e;
            j6Var.getClass();
            j6Var.c(null, y9);
        }
        gVar.invalidate();
    }

    @Override // kg.u1
    public /* synthetic */ a0.h k1() {
        return null;
    }

    @Override // u4.i1
    public int l(View view) {
        return u4.o0.v(view) + ((ViewGroup.MarginLayoutParams) ((u4.p0) view.getLayoutParams())).bottomMargin;
    }

    @Override // org.telegram.ui.Components.wj0
    public boolean m(int i3) {
        org.telegram.messenger.ye M = ((ChatAttachAlertPhotoLayout) this.b).H.M(i3);
        return M != null && ChatAttachAlertPhotoLayout.t1.containsKey(Integer.valueOf(M.C));
    }

    @Override // org.telegram.ui.Components.vr0
    public org.telegram.ui.ActionBar.y0 n(int i3, Runnable runnable, String str, boolean z10, boolean z11) {
        ws0 ws0Var = (ws0) this.b;
        org.telegram.ui.ActionBar.y0 e10 = ws0Var.J.e(0, i3, str);
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.k6.p7;
            e10.d(ws0Var.s0(i10), ws0Var.s0(i10));
        }
        e10.setOnClickListener(new fa0(this, z11, runnable));
        return e10;
    }

    @Override // org.telegram.ui.Components.k51
    public void onError(m51 m51Var, Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onRenderedFirstFrame(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public void onStateChanged(boolean z10, int i3) {
        k40 k40Var;
        org.telegram.messenger.b20 b20Var;
        c40 c40Var = (c40) this.b;
        m51 m51Var = c40Var.I0.T;
        if (m51Var != null && m51Var.d0() && i3 == 4 && (b20Var = (k40Var = c40Var.I0).S) != null) {
            m51 m51Var2 = k40Var.T;
            long j10 = b20Var.a;
            if (j10 <= 0) {
                j10 = 0;
            }
            m51Var2.p0(j10);
        }
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void p(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.b).remove(runnable);
        if (runnable2 != null) {
            org.telegram.messenger.g0.r(runnable2);
        }
    }

    public void q() {
        HashMap hashMap = (HashMap) this.b;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            org.telegram.messenger.g0.r((Runnable) ((Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
    }

    @Override // org.telegram.ui.Components.om0
    public /* synthetic */ int q0() {
        return 0;
    }

    @Override // kg.u1
    public void r(int i3) {
        org.telegram.ui.Wallet.w9 w9Var = (org.telegram.ui.Wallet.w9) this.b;
        if (w9Var.r || i3 != w9Var.K) {
            return;
        }
        w9Var.j0(w9Var.O.getText().toString().trim());
    }

    @Override // ug.k1
    public void s(float f10) {
        ug.n0 n0Var = (ug.n0) this.b;
        tg.k0.e(n0Var.a).k("-1", f10);
        n0Var.e.setBrushSize(f10);
    }

    @Override // re.a
    public /* synthetic */ boolean s1() {
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 26:
                we.b bVar = we.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((u4.b) this.b).m());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override // pg.l
    public void u() {
        zc0 zc0Var = ((ad0) this.b).a;
        if (zc0Var != null) {
            ((org.telegram.ui.io0) zc0Var).a.f0.invalidate();
        }
    }

    @Override // re.a
    public void u0() {
        ((o41) this.b).h.c(true);
    }

    public /* synthetic */ i9(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.k51
    public void onRenderedFirstFrame() {
    }

    public i9(int i3) {
        this.a = i3;
        switch (i3) {
            case 13:
                this.b = new SparseArray();
                break;
            default:
                this.b = new HashMap();
                break;
        }
    }

    public i9(int i3, int i10, int[] iArr) {
        this.a = 0;
        q40[] q40VarArr = new q40[(iArr.length / 2) + 1];
        this.b = q40VarArr;
        q40 q40Var = new q40(i3, i10);
        int i11 = 0;
        q40VarArr[0] = q40Var;
        while (i11 < iArr.length / 2) {
            int i12 = i11 + 1;
            int i13 = i11 * 2;
            ((q40[]) this.b)[i12] = new q40(iArr[i13], iArr[i13 + 1]);
            i11 = i12;
        }
    }

    public i9(x1.c[] initializers) {
        this.a = 27;
        kotlin.jvm.internal.j.e(initializers, "initializers");
        this.b = initializers;
    }

    public i9(EditText editText) {
        this.a = 17;
        this.b = new mi.h0(editText);
    }

    @Override // kg.u1
    public /* synthetic */ void b2(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSeekFinished(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSeekStarted(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.om0
    public void D() {
    }

    @Override // re.a
    public /* synthetic */ void t(float f10, float f11) {
    }

    @Override // re.a
    public /* synthetic */ void o(View view, float f10, float f11) {
    }

    @Override // re.a
    public /* synthetic */ void o1(View view, float f10, float f11) {
    }

    @Override // re.a
    public /* synthetic */ void x(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.k51
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
    }
}
