package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class zz implements x61, r0.o, androidx.activity.result.b, na0, f71, OnCompleteListener, pa.n, t5.a, tf.i1, com.google.android.gms.common.api.internal.s, ji, vh.h0, vh.q3, v4.f, io0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ zz(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static float[] F(ArrayList arrayList) {
        double d;
        double d10;
        float f10;
        double[] dArr;
        ArrayList arrayList2;
        float f11;
        int i10;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            PointF pointF = (PointF) arrayList.get(i11);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
        }
        int size2 = arrayList.size();
        double d11 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            d = 1.0d;
            d10 = 6.0d;
            f10 = 255.0f;
            dArr = null;
        } else {
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d12 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i12 = 1;
            while (true) {
                i10 = size2 - 1;
                if (i12 >= i10) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i12 - 1);
                PointF pointF3 = (PointF) arrayList.get(i12);
                int i13 = i12 + 1;
                double d13 = d11;
                PointF pointF4 = (PointF) arrayList.get(i13);
                double[] dArr5 = dArr2[i12];
                float f12 = pointF3.x;
                double d14 = d12;
                double d15 = f12 - pointF2.x;
                dArr5[0] = d15 / 6.0d;
                float f13 = pointF4.x;
                dArr5[1] = (f13 - r14) / 3.0d;
                double d16 = f13 - f12;
                dArr5[2] = d16 / 6.0d;
                float f14 = pointF4.y;
                float f15 = pointF3.y;
                dArr3[i12] = ((f14 - f15) / d16) - ((f15 - pointF2.y) / d15);
                i12 = i13;
                d11 = d13;
                d12 = d14;
            }
            d = d11;
            double d17 = d12;
            d10 = 6.0d;
            f10 = 255.0f;
            dArr3[0] = d17;
            dArr3[i10] = d17;
            double[] dArr6 = dArr2[i10];
            dArr6[1] = d;
            dArr6[0] = d17;
            dArr6[2] = d17;
            for (int i14 = 1; i14 < size2; i14++) {
                double[] dArr7 = dArr2[i14];
                double d18 = dArr7[0];
                int i15 = i14 - 1;
                double[] dArr8 = dArr2[i15];
                double d19 = d18 / dArr8[1];
                dArr7[1] = dArr7[1] - (dArr8[2] * d19);
                dArr7[0] = d17;
                dArr3[i14] = dArr3[i14] - (d19 * dArr3[i15]);
            }
            for (int i16 = size2 - 2; i16 >= 0; i16--) {
                double[] dArr9 = dArr2[i16];
                double d20 = dArr9[2];
                int i17 = i16 + 1;
                double[] dArr10 = dArr2[i17];
                double d21 = d20 / dArr10[1];
                dArr9[1] = dArr9[1] - (dArr10[0] * d21);
                dArr9[2] = d17;
                dArr3[i16] = dArr3[i16] - (d21 * dArr3[i17]);
            }
            dArr = new double[size2];
            for (int i18 = 0; i18 < size2; i18++) {
                dArr[i18] = dArr3[i18] / dArr2[i18][1];
            }
        }
        int length = dArr.length;
        if (length < 1) {
            arrayList2 = null;
            f11 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i19 = 0;
            while (i19 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i19);
                int i20 = i19 + 1;
                PointF pointF6 = (PointF) arrayList.get(i20);
                int i21 = (int) pointF5.x;
                while (true) {
                    float f16 = pointF6.x;
                    if (i21 < ((int) f16)) {
                        float f17 = i21;
                        PointF pointF7 = pointF5;
                        double d22 = f16 - pointF5.x;
                        double d23 = (f17 - r12) / d22;
                        double d24 = d - d23;
                        int i22 = length;
                        double[] dArr11 = dArr;
                        float f18 = (float) (((((((d23 * d23) * d23) - d23) * dArr11[i20]) + ((((d24 * d24) * d24) - d24) * dArr11[i19])) * ((d22 * d22) / d10)) + (pointF6.y * d23) + (pointF7.y * d24));
                        if (f18 > f10) {
                            f18 = 255.0f;
                        } else if (f18 < 0.0f) {
                            f18 = 0.0f;
                        }
                        arrayList2.add(new PointF(f17, f18));
                        i21++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i22;
                    }
                }
                i19 = i20;
            }
            f11 = 0.0f;
            arrayList2.add((PointF) kf.k0.i(1, arrayList));
        }
        float f19 = ((PointF) arrayList2.get(0)).x;
        if (f19 > f11) {
            for (int i23 = (int) f19; i23 >= 0; i23--) {
                arrayList2.add(0, new PointF(i23, 0.0f));
            }
        }
        float f20 = ((PointF) kf.k0.i(1, arrayList2)).x;
        if (f20 < f10) {
            for (int i24 = ((int) f20) + 1; i24 <= 255; i24++) {
                arrayList2.add(new PointF(i24, 255.0f));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        for (int i25 = 0; i25 < size3; i25++) {
            PointF pointF8 = (PointF) arrayList2.get(i25);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i25] = sqrt;
        }
        return fArr;
    }

    @Override // vh.q3
    public void A() {
        vh.y1 y1Var = (vh.y1) this.b;
        vh.y1.Z(y1Var, false, true);
        int i10 = y1Var.F0;
        y1Var.x0(i10 != 2 ? i10 : 0, true);
    }

    @Override // vh.q3
    public p70 C(View view) {
        return p70.H((vh.y1) this.b, view);
    }

    @Override // org.telegram.ui.Components.ji
    public void C0(wg wgVar) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.p2) ((uf.k) this.b)).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(wgVar);
    }

    @Override // vh.q3
    public void D() {
        vh.y1 y1Var = (vh.y1) this.b;
        y1Var.z0();
        y1Var.C0();
    }

    public boolean G(int i10, int i11, Bundle bundle) {
        return false;
    }

    public JSONObject H() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(i9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        i9.h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    i9.h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            i9.h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e6) {
            e = e6;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            i9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // tf.i1
    public /* synthetic */ a0.h H0() {
        return null;
    }

    public pa.i I(Object obj) {
        pa.g gVar = ((sa.a0) this.b).b;
        gVar.getClass();
        if (obj == null) {
            return pa.k.a;
        }
        Class<?> cls = obj.getClass();
        sa.n nVar = new sa.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    @Override // vh.h0
    public org.telegram.ui.Cells.l9 J0() {
        switch (this.a) {
            case 21:
                vh.m3 m3Var = ((vh.y) this.b).L;
                if (m3Var != null) {
                    return m3Var.a.getTextSelectionHelper();
                }
                return null;
            default:
                vh.l3 l3Var = ((vh.p4) this.b).K;
                if (l3Var != null) {
                    return l3Var.a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override // tf.i1
    public void J1(ArrayList arrayList) {
        vn0 vn0Var = (vn0) this.b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            vn0Var.G.add(((tf.h1) arrayList.get(i10)).a);
        }
        org.telegram.ui.cy cyVar = vn0Var.R;
        if (cyVar != null) {
            cyVar.d(vn0Var.A0 > 0, false);
        }
        vn0Var.l();
    }

    @Override // vh.h0
    public void L0(CharSequence charSequence) {
        switch (this.a) {
            case 21:
                vh.m3 m3Var = ((vh.y) this.b).L;
                if (m3Var != null) {
                    m3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        m3Var.a.s4(charSequence.toString());
                        break;
                    }
                }
                break;
            default:
                vh.l3 l3Var = ((vh.p4) this.b).K;
                if (l3Var != null) {
                    l3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        l3Var.a.s4(charSequence.toString());
                        break;
                    }
                }
                break;
        }
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        hm0 hm0Var = (hm0) this.b;
        hm0Var.v.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        hm0Var.s.requestLayout();
        return r0.m1.b;
    }

    @Override // vh.h0
    public org.telegram.ui.Cells.k9 O0() {
        switch (this.a) {
            case 21:
                return (vh.y) this.b;
            default:
                return (vh.p4) this.b;
        }
    }

    @Override // vh.h0
    public vh.a T0() {
        switch (this.a) {
            case 21:
                return ((vh.y) this.b).a;
            default:
                return ((vh.p4) this.b).a;
        }
    }

    @Override // tf.i1
    public /* synthetic */ a0.h X0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ boolean X1() {
        return false;
    }

    @Override // org.telegram.ui.Components.io0
    public void Y(float f10, boolean z4) {
        zf.g gVar = (zf.g) this.b;
        float f11 = gVar.b;
        float w10 = e2.c.w(gVar.c, f11, f10, f11);
        gVar.d = w10;
        if (z4) {
            m6 m6Var = gVar.e;
            m6Var.getClass();
            m6Var.b(null, w10);
        }
        gVar.invalidate();
    }

    @Override // vh.h0
    public boolean Y0() {
        switch (this.a) {
            case 21:
                vh.y yVar = (vh.y) this.b;
                vh.m3 m3Var = yVar.L;
                if (m3Var != null) {
                    vh.a aVar = yVar.a;
                    if (m3Var.a.R4()) {
                    }
                }
                break;
            default:
                vh.p4 p4Var = (vh.p4) this.b;
                vh.l3 l3Var = p4Var.K;
                if (l3Var != null) {
                    vh.a aVar2 = p4Var.a;
                    if (l3Var.a.R4()) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 18:
                u5.r rVar = new u5.r(0, (TaskCompletionSource) obj2);
                u5.i iVar = (u5.i) ((u5.t) obj).u();
                String[] strArr = (String[]) this.b;
                Parcel M0 = iVar.M0();
                com.google.android.gms.internal.cast.t.d(M0, rVar);
                M0.writeStringArray(strArr);
                iVar.R0(M0, 5);
                break;
            case 19:
            default:
                w6.b bVar = (w6.b) this.b;
                w6.a aVar = new w6.a((TaskCompletionSource) obj2);
                w6.i iVar2 = (w6.i) ((w6.c) obj).u();
                String str = bVar.k;
                Parcel I0 = iVar2.I0();
                int i10 = w6.f.a;
                I0.writeStrongBinder(aVar);
                I0.writeString(str);
                iVar2.J0(I0, 2);
                break;
            case 20:
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.b;
                v6.f fVar = new v6.f(1, (TaskCompletionSource) obj2);
                v6.d dVar = (v6.d) ((v6.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = e7.a.a;
                obtain.writeStrongBinder(fVar);
                e7.a.b(obtain, getCredentialRequest);
                e7.a.b(obtain, gVar);
                ((v6.b) dVar).E0(obtain, 1);
                break;
        }
    }

    @Override // vh.q3
    public boolean b(float f10) {
        boolean z4;
        vh.y1 y1Var = (vh.y1) this.b;
        FrameLayout frameLayout = y1Var.s0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f10 >= r3[1]) {
                z4 = true;
                vh.y1.Z(y1Var, z4, true);
                return z4;
            }
        }
        z4 = false;
        vh.y1.Z(y1Var, z4, true);
        return z4;
    }

    @Override // vh.h0, vh.d1
    public void c(vh.e1 e1Var) {
        switch (this.a) {
            case 21:
                vh.m3 m3Var = ((vh.y) this.b).L;
                if (m3Var != null) {
                    vh.s3 s3Var = m3Var.a;
                    vh.s3.L1(s3Var, e1Var);
                    s3Var.e3.d(e1Var, true);
                    break;
                }
                break;
            default:
                vh.l3 l3Var = ((vh.p4) this.b).K;
                if (l3Var != null) {
                    vh.s3 s3Var2 = l3Var.a;
                    vh.s3.L1(s3Var2, e1Var);
                    s3Var2.e3.d(e1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // v4.f
    public int e(long j10) {
        return -1;
    }

    @Override // org.telegram.ui.Components.na0
    public Paint.FontMetricsInt f() {
        return ((ph.k) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // vh.h0
    public void f1(int i10, int i11) {
        switch (this.a) {
            case 21:
                vh.y yVar = (vh.y) this.b;
                vh.m3 m3Var = yVar.L;
                if (m3Var != null) {
                    vh.a aVar = yVar.a;
                    vh.d2 d2Var = m3Var.a.G3;
                    if (d2Var != null) {
                        d2Var.f(i10, i11);
                        break;
                    }
                }
                break;
            default:
                vh.p4 p4Var = (vh.p4) this.b;
                vh.l3 l3Var = p4Var.K;
                if (l3Var != null) {
                    vh.a aVar2 = p4Var.a;
                    vh.d2 d2Var2 = l3Var.a.G3;
                    if (d2Var2 != null) {
                        d2Var2.f(i10, i11);
                        break;
                    }
                }
                break;
        }
    }

    public s0.d g(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.io0
    public CharSequence getContentDescription() {
        zf.g gVar = (zf.g) this.b;
        float f10 = gVar.b;
        return String.valueOf(Math.round((gVar.a.getProgress() * (gVar.c - f10)) + f10));
    }

    @Override // v4.f
    public long h(int i10) {
        return 0L;
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ boolean h0() {
        return false;
    }

    @Override // vh.h0
    public void h2() {
        switch (this.a) {
            case 21:
                vh.y yVar = (vh.y) this.b;
                vh.m3 m3Var = yVar.L;
                if (m3Var != null) {
                    vh.a aVar = yVar.a;
                    vh.s3.N1(m3Var.a);
                    break;
                }
                break;
            default:
                vh.p4 p4Var = (vh.p4) this.b;
                vh.l3 l3Var = p4Var.K;
                if (l3Var != null) {
                    vh.a aVar2 = p4Var.a;
                    vh.s3.N1(l3Var.a);
                    break;
                }
                break;
        }
    }

    public s0.d i(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.x61
    public void invalidate() {
        ((mg0) this.b).h.invalidate();
    }

    @Override // org.telegram.ui.Components.io0
    public /* synthetic */ int j0() {
        return 0;
    }

    @Override // tf.i1
    public void k(int i10) {
        vn0 vn0Var = (vn0) this.b;
        vn0Var.A0--;
        vn0Var.b0 = i10;
        if (vn0Var.c0 != i10) {
            vn0Var.s.clear();
        }
        if (vn0Var.d0 != i10) {
            vn0Var.F.clear();
        }
        vn0Var.K = true;
        org.telegram.ui.cy cyVar = vn0Var.R;
        if (cyVar != null) {
            cyVar.d(vn0Var.A0 > 0, true);
        }
        vn0Var.l();
        org.telegram.ui.cy cyVar2 = vn0Var.R;
        if (cyVar2 != null) {
            cyVar2.c();
        }
    }

    @Override // vh.h0
    public void l() {
        switch (this.a) {
            case 21:
                vh.y yVar = (vh.y) this.b;
                vh.m3 m3Var = yVar.L;
                if (m3Var != null) {
                    vh.s3.O1(m3Var.a, yVar.a);
                    break;
                }
                break;
            default:
                vh.p4 p4Var = (vh.p4) this.b;
                vh.l3 l3Var = p4Var.K;
                if (l3Var != null) {
                    vh.s3.O1(l3Var.a, p4Var.a);
                    break;
                }
                break;
        }
    }

    @Override // vh.q3
    public void m(vh.p3 p3Var, View view) {
        vh.y1 y1Var = (vh.y1) this.b;
        p70 H = p70.H(y1Var, view);
        H.Q = true;
        y1Var.u0 = vh.e4.c(H, y1Var, y1Var.getParentActivity(), y1Var.getResourceProvider(), p3Var, false);
    }

    @Override // vh.q3
    public void n(int i10) {
        ((vh.y1) this.b).o0(74, i10);
    }

    @Override // vh.q3
    public void o() {
        vh.y1 y1Var = (vh.y1) this.b;
        vh.g3 g3Var = y1Var.M.k3;
        y1Var.x0((g3Var != null && g3Var.y() && y1Var.M.B4()) ? 1 : 0, true);
        y1Var.y0();
        y1Var.w0();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        r5.c.h((r5.c) ((r5.j) this.b).c, "joinApplication", task);
    }

    @Override // vh.q3
    public void onContentChanged() {
        vh.y1 y1Var = (vh.y1) this.b;
        if (y1Var.v0 != null) {
            boolean l32 = y1Var.M.l3();
            y1Var.I0 = l32;
            y1Var.v0.h(l32);
            y1Var.v0.invalidate();
        }
        y1Var.C0();
        Runnable runnable = y1Var.J0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.f71
    public void onStateChanged(boolean z4, int i10) {
        ph.k5 k5Var = (ph.k5) this.b;
        ph.i5 i5Var = k5Var.I;
        AndroidUtilities.cancelRunOnUIThread(i5Var);
        i71 i71Var = k5Var.y;
        if (i71Var == null || !i71Var.y()) {
            return;
        }
        AndroidUtilities.runOnUIThread(i5Var);
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.f71
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((ph.k5) this.b).i();
    }

    @Override // t5.a
    public void p(Bitmap bitmap) {
        ((t5.h) this.b).e(bitmap, 3);
    }

    @Override // v4.f
    public List q(long j10) {
        return (List) this.b;
    }

    @Override // v4.f
    public int r() {
        return 1;
    }

    @Override // vh.q3
    public void s() {
        vh.y1 y1Var = (vh.y1) this.b;
        y1Var.F0 = y1Var.H0;
        vh.y1.Z(y1Var, false, false);
        y1Var.x0(2, true);
    }

    @Override // vh.h0
    public void s1() {
        switch (this.a) {
            case 21:
                vh.y yVar = (vh.y) this.b;
                vh.m3 m3Var = yVar.L;
                if (m3Var != null) {
                    vh.a aVar = yVar.a;
                    vh.s3 s3Var = m3Var.a;
                    vh.d2 d2Var = s3Var.G3;
                    if (d2Var != null) {
                        d2Var.g();
                    }
                    s3Var.e3.onContentChanged();
                    break;
                }
                break;
            default:
                vh.p4 p4Var = (vh.p4) this.b;
                vh.l3 l3Var = p4Var.K;
                if (l3Var != null) {
                    vh.a aVar2 = p4Var.a;
                    vh.s3 s3Var2 = l3Var.a;
                    vh.d2 d2Var2 = s3Var2.G3;
                    if (d2Var2 != null) {
                        d2Var2.g();
                    }
                    s3Var2.e3.onContentChanged();
                    break;
                }
                break;
        }
    }

    @Override // vh.q3
    public void t(vh.w5 w5Var, String str) {
        vh.y1 y1Var = (vh.y1) this.b;
        if (y1Var.w0 == null) {
            y1Var.w0 = new m.s3(new ph.z8(this, 13), y1Var.getResourceProvider());
        }
        y1Var.w0.f(w5Var, str);
    }

    @Override // tf.i1
    public boolean t1(int i10) {
        return i10 == ((vn0) this.b).a0;
    }

    @Override // org.telegram.ui.Components.na0
    public void v(int i10, int i11, CharSequence charSequence, boolean z4) {
        ph.f fVar = ((ph.k) this.b).f;
        if (fVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z4) {
                Emoji.replaceEmoji(spannableStringBuilder, fVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            fVar.setText(spannableStringBuilder);
            fVar.setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // vh.q3
    public void w(vh.r3 r3Var, View view) {
        vh.y1 y1Var = (vh.y1) this.b;
        p70 H = p70.H(y1Var, view);
        H.Q = true;
        y1Var.getParentActivity();
        y1Var.getResourceProvider();
        y1Var.u0 = vh.e4.b(H, y1Var, r3Var, false);
    }

    @Override // androidx.activity.result.b
    public void x(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.b;
        int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.J;
        if (resultReceiver != null) {
            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
        }
        int i11 = aVar.a;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // vh.q3
    public void z(vh.a aVar) {
        vh.y1 y1Var = (vh.y1) this.b;
        if (aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(y1Var)) {
            li liVar = new li(y1Var.getParentActivity(), y1Var, false, false, false, y1Var.getResourceProvider());
            liVar.W1 = new cb.b(24);
            liVar.M = true;
            liVar.u1.setVisibility(8);
            liVar.q2 = new ph.l1(y1Var, aVar, liVar, 6);
            liVar.r1();
            liVar.show();
        }
    }

    public /* synthetic */ zz(u5.s sVar, String[] strArr) {
        this.a = 18;
        this.b = strArr;
    }

    @Override // org.telegram.ui.Components.f71
    public void onRenderedFirstFrame() {
    }

    public zz(n9.b bVar) {
        this.a = 5;
        this.b = new File(bVar.b, "com.crashlytics.settings.json");
    }

    public zz(int i10) {
        this.a = i10;
        switch (i10) {
            case 13:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new s0.e(this);
                    break;
                } else {
                    this.b = new gh0(this);
                    break;
                }
            case 15:
                this.b = new t4.d(5, 1.0f, false);
                break;
        }
    }

    public zz(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 9;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public zz(TextView textView) {
        this.a = 8;
        this.b = new q1.g(textView);
    }

    @Override // org.telegram.ui.Components.io0
    public void B() {
    }

    @Override // org.telegram.ui.Components.na0
    public /* synthetic */ void E(String str) {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void Q0() {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void Z0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void o1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onSeekStarted(k3.a aVar) {
    }

    @Override // vh.q3
    public void u() {
    }

    @Override // vh.q3
    public void y(int i10) {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void z0() {
    }

    @Override // vh.q3
    public void d(vh.e1 e1Var, boolean z4) {
    }

    @Override // org.telegram.ui.Components.f71
    public void onError(i71 i71Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.na0
    public /* synthetic */ void a(TLRPC.BotInlineResult botInlineResult, boolean z4, int i10) {
    }

    @Override // org.telegram.ui.Components.na0
    public /* synthetic */ void j(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Components.f71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }

    @Override // org.telegram.ui.Components.ji
    public void G1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
    }
}
