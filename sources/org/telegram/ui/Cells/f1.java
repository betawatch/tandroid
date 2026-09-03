package org.telegram.ui.Cells;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.y61;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class f1 implements y61, org.telegram.ui.Components.y4, oa0, r0.o, androidx.activity.result.b, eg.q2, OnCompleteListener, ra.m, pa.n, o4.m0, com.google.android.gms.common.api.internal.s, uf.j1, wh.h0, wh.p3 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ f1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static float[] r(ArrayList arrayList) {
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
            arrayList2.add((PointF) l.d.i(1, arrayList));
        }
        float f19 = ((PointF) arrayList2.get(0)).x;
        if (f19 > f11) {
            for (int i23 = (int) f19; i23 >= 0; i23--) {
                arrayList2.add(0, new PointF(i23, 0.0f));
            }
        }
        float f20 = ((PointF) l.d.i(1, arrayList2)).x;
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

    public static f1 t(float f10, int i10) {
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f10);
        int i12 = (int) (point.y * f10);
        if (i11 == i12) {
            return new f1(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new f1(i11, i12, new int[]{i12, i11});
        }
        return (i10 == 1) == (i11 < i12) ? new f1(i11, i12, new int[0]) : new f1(i12, i11, new int[0]);
    }

    @Override // wh.h0
    public void B(CharSequence charSequence) {
        switch (this.a) {
            case 26:
                wh.l3 l3Var = ((wh.y) this.b).L;
                if (l3Var != null) {
                    l3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        l3Var.a.s4(charSequence.toString());
                        break;
                    }
                }
                break;
            default:
                wh.k3 k3Var = ((wh.o4) this.b).K;
                if (k3Var != null) {
                    k3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        k3Var.a.s4(charSequence.toString());
                        break;
                    }
                }
                break;
        }
    }

    public boolean D(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override // wh.h0
    public l9 E() {
        switch (this.a) {
            case 26:
                return (wh.y) this.b;
            default:
                return (wh.o4) this.b;
        }
    }

    @Override // wh.p3
    public void F(wh.v5 v5Var, String str) {
        wh.z1 z1Var = (wh.z1) this.b;
        if (z1Var.w0 == null) {
            z1Var.w0 = new m.r3(new sf.h(this, 14), z1Var.getResourceProvider());
        }
        z1Var.w0.f(v5Var, str);
    }

    @Override // wh.h0
    public wh.a G() {
        switch (this.a) {
            case 26:
                return ((wh.y) this.b).a;
            default:
                return ((wh.o4) this.b).a;
        }
    }

    @Override // eg.q2
    public void H(float f10) {
        qh.e9 e9Var = (qh.e9) this.b;
        dg.e1.e(e9Var.C1).k(String.valueOf(dg.m.a.indexOf(e9Var.L0.getCurrentBrush())), f10);
        dg.e2 e2Var = e9Var.x1;
        e2Var.c = f10;
        e9Var.E0(e2Var, null, false);
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        ((ChatActivityEnterView) this.b).T0(i10, z4, 0, true, 0L);
    }

    @Override // wh.p3
    public void J() {
        wh.z1 z1Var = (wh.z1) this.b;
        wh.z1.Z(z1Var, false, true);
        int i10 = z1Var.F0;
        z1Var.x0(i10 != 2 ? i10 : 0, true);
    }

    @Override // uf.j1
    public /* synthetic */ a0.h K() {
        return null;
    }

    @Override // wh.h0
    public boolean L() {
        switch (this.a) {
            case 26:
                wh.y yVar = (wh.y) this.b;
                wh.l3 l3Var = yVar.L;
                if (l3Var != null) {
                    wh.a aVar = yVar.a;
                    if (l3Var.a.R4()) {
                    }
                }
                break;
            default:
                wh.o4 o4Var = (wh.o4) this.b;
                wh.k3 k3Var = o4Var.K;
                if (k3Var != null) {
                    wh.a aVar2 = o4Var.a;
                    if (k3Var.a.R4()) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // wh.h0
    public void M(int i10, int i11) {
        switch (this.a) {
            case 26:
                wh.y yVar = (wh.y) this.b;
                wh.l3 l3Var = yVar.L;
                if (l3Var != null) {
                    wh.a aVar = yVar.a;
                    wh.d2 d2Var = l3Var.a.G3;
                    if (d2Var != null) {
                        d2Var.f(i10, i11);
                        break;
                    }
                }
                break;
            default:
                wh.o4 o4Var = (wh.o4) this.b;
                wh.k3 k3Var = o4Var.K;
                if (k3Var != null) {
                    wh.a aVar2 = o4Var.a;
                    wh.d2 d2Var2 = k3Var.a.G3;
                    if (d2Var2 != null) {
                        d2Var2.f(i10, i11);
                        break;
                    }
                }
                break;
        }
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        im0 im0Var = (im0) this.b;
        im0Var.v.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        im0Var.s.requestLayout();
        return r0.m1.b;
    }

    public JSONObject O() {
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
                    } catch (Exception e6) {
                        e = e6;
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
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            i9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // wh.p3
    public q70 P(View view) {
        return q70.H((wh.z1) this.b, view);
    }

    @Override // wh.h0
    public void Q() {
        switch (this.a) {
            case 26:
                wh.y yVar = (wh.y) this.b;
                wh.l3 l3Var = yVar.L;
                if (l3Var != null) {
                    wh.a aVar = yVar.a;
                    wh.r3 r3Var = l3Var.a;
                    wh.d2 d2Var = r3Var.G3;
                    if (d2Var != null) {
                        d2Var.g();
                    }
                    r3Var.e3.onContentChanged();
                    break;
                }
                break;
            default:
                wh.o4 o4Var = (wh.o4) this.b;
                wh.k3 k3Var = o4Var.K;
                if (k3Var != null) {
                    wh.a aVar2 = o4Var.a;
                    wh.r3 r3Var2 = k3Var.a;
                    wh.d2 d2Var2 = r3Var2.G3;
                    if (d2Var2 != null) {
                        d2Var2.g();
                    }
                    r3Var2.e3.onContentChanged();
                    break;
                }
                break;
        }
    }

    @Override // uf.j1
    public /* synthetic */ boolean R(int i10) {
        return true;
    }

    @Override // wh.p3
    public void S() {
        wh.z1 z1Var = (wh.z1) this.b;
        z1Var.z0();
        z1Var.C0();
    }

    public pa.i T(Object obj) {
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

    @Override // org.telegram.ui.Components.oa0
    public void U(int i10, int i11, CharSequence charSequence, boolean z4) {
        mi miVar = (mi) this.b;
        if (miVar.m1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(miVar.m1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z4) {
                Emoji.replaceEmoji(spannableStringBuilder, miVar.m1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            miVar.m1().setText(spannableStringBuilder);
            miVar.m1().setSelection(i10 + charSequence.length());
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // wh.h0
    public void W() {
        switch (this.a) {
            case 26:
                wh.y yVar = (wh.y) this.b;
                wh.l3 l3Var = yVar.L;
                if (l3Var != null) {
                    wh.a aVar = yVar.a;
                    wh.r3.N1(l3Var.a);
                    break;
                }
                break;
            default:
                wh.o4 o4Var = (wh.o4) this.b;
                wh.k3 k3Var = o4Var.K;
                if (k3Var != null) {
                    wh.a aVar2 = o4Var.a;
                    wh.r3.N1(k3Var.a);
                    break;
                }
                break;
        }
    }

    public float Y(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 1;
        boolean z4 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z4) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i19 = (-abs) / 2;
        int i20 = i14 < i16 ? 1 : -1;
        int i21 = i15 < i17 ? 1 : -1;
        int i22 = i16 + i20;
        int i23 = i14;
        int i24 = i15;
        int i25 = 0;
        while (i23 != i22) {
            boolean z10 = z4;
            int i26 = abs;
            if ((i25 == i18) == ((pb.b) this.b).b(z4 ? i24 : i23, z4 ? i23 : i24)) {
                if (i25 == 2) {
                    return k7.o6.b(i23, i24, i14, i15);
                }
                i25++;
            }
            i19 += abs2;
            if (i19 > 0) {
                if (i24 == i17) {
                    break;
                }
                i24 += i21;
                i19 -= i26;
            }
            i23 += i20;
            abs = i26;
            z4 = z10;
            i18 = 1;
        }
        if (i25 == 2) {
            return k7.o6.b(i22, i17, i14, i15);
        }
        return Float.NaN;
    }

    public float Z(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        pb.b bVar = (pb.b) this.b;
        float Y = Y(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f10 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.a;
            if (i14 >= i16) {
                float f12 = ((i16 - 1) - i10) / (i14 - i10);
                int i17 = i16 - 1;
                f10 = f12;
                i14 = i17;
            } else {
                f10 = 1.0f;
            }
        }
        float f13 = i11;
        int i18 = (int) (f13 - ((i13 - i11) * f10));
        if (i18 < 0) {
            f11 = f13 / (i11 - i18);
        } else {
            int i19 = bVar.b;
            if (i18 >= i19) {
                f11 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f11 = 1.0f;
            }
        }
        return (Y(i10, i11, (int) (((i14 - i10) * f11) + i10), i15) + Y) - 1.0f;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 23:
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.b;
                v6.f fVar = new v6.f(1, (TaskCompletionSource) obj2);
                v6.d dVar = (v6.d) ((v6.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = e7.a.a;
                obtain.writeStrongBinder(fVar);
                e7.a.b(obtain, getCredentialRequest);
                e7.a.b(obtain, gVar);
                ((v6.b) dVar).E0(obtain, 1);
                break;
            default:
                o5.l lVar = new o5.l((TaskCompletionSource) obj2);
                w6.i iVar = (w6.i) ((w6.c) obj).u();
                l5.e eVar = (l5.e) this.b;
                Parcel I0 = iVar.I0();
                int i11 = w6.f.a;
                I0.writeStrongBinder(lVar);
                w6.f.c(I0, eVar);
                iVar.J0(I0, 1);
                break;
        }
    }

    @Override // wh.p3
    public boolean b(float f10) {
        boolean z4;
        wh.z1 z1Var = (wh.z1) this.b;
        FrameLayout frameLayout = z1Var.s0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f10 >= r3[1]) {
                z4 = true;
                wh.z1.Z(z1Var, z4, true);
                return z4;
            }
        }
        z4 = false;
        wh.z1.Z(z1Var, z4, true);
        return z4;
    }

    @Override // wh.h0
    public void c(wh.e1 e1Var) {
        switch (this.a) {
            case 26:
                wh.l3 l3Var = ((wh.y) this.b).L;
                if (l3Var != null) {
                    wh.r3 r3Var = l3Var.a;
                    wh.r3.L1(r3Var, e1Var);
                    r3Var.e3.h(e1Var, true);
                    break;
                }
                break;
            default:
                wh.k3 k3Var = ((wh.o4) this.b).K;
                if (k3Var != null) {
                    wh.r3 r3Var2 = k3Var.a;
                    wh.r3.L1(r3Var2, e1Var);
                    r3Var2.e3.h(e1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // wh.p3
    public void d(wh.o3 o3Var, View view) {
        wh.z1 z1Var = (wh.z1) this.b;
        q70 H = q70.H(z1Var, view);
        H.Q = true;
        z1Var.u0 = wh.d4.c(H, z1Var, z1Var.getParentActivity(), z1Var.getResourceProvider(), o3Var, false);
    }

    public float e(ub.c cVar, ub.c cVar2) {
        int i10 = (int) cVar.a;
        int i11 = (int) cVar.b;
        int i12 = (int) cVar2.a;
        int i13 = (int) cVar2.b;
        float Z = Z(i10, i11, i12, i13);
        float Z2 = Z((int) cVar2.a, i13, (int) cVar.a, i11);
        return Float.isNaN(Z) ? Z2 / 7.0f : Float.isNaN(Z2) ? Z / 7.0f : (Z + Z2) / 14.0f;
    }

    @Override // wh.h0
    public void f() {
        switch (this.a) {
            case 26:
                wh.y yVar = (wh.y) this.b;
                wh.l3 l3Var = yVar.L;
                if (l3Var != null) {
                    wh.r3.O1(l3Var.a, yVar.a);
                    break;
                }
                break;
            default:
                wh.o4 o4Var = (wh.o4) this.b;
                wh.k3 k3Var = o4Var.K;
                if (k3Var != null) {
                    wh.r3.O1(k3Var.a, o4Var.a);
                    break;
                }
                break;
        }
    }

    @Override // uf.j1
    public void g(int i10) {
        AndroidUtilities.runOnUIThread(new qh.u9(this, 21));
    }

    @Override // eg.q2
    public float get() {
        qh.e9 e9Var = (qh.e9) this.b;
        int i10 = e9Var.C1;
        dg.m currentBrush = e9Var.L0.getCurrentBrush();
        return currentBrush == null ? dg.e1.e(i10).i : dg.e1.e(i10).f(String.valueOf(dg.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    public s0.d i(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.y61
    public void invalidate() {
        switch (this.a) {
            case 0:
                ((t1) ((g1) this.b).b).invalidate();
                break;
            default:
                ((ng0) this.b).h.invalidate();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x0348, code lost:
    
        throw ob.c.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a4 A[LOOP:21: B:147:0x0226->B:177:0x03a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0373 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pb.d j(cb.m mVar) {
        int f10;
        tb.d dVar;
        tb.b bVar;
        int i10;
        int i11;
        pb.c cVar;
        int f11;
        tb.e r10 = mVar.r();
        tb.b bVar2 = mVar.q().a;
        tb.c q10 = mVar.q();
        tb.e r11 = mVar.r();
        int i12 = m1.j.d(8)[q10.b];
        pb.b bVar3 = (pb.b) mVar.b;
        int i13 = bVar3.b;
        for (int i14 = 0; i14 < i13; i14++) {
            for (int i15 = 0; i15 < i13; i15++) {
                if (yh.b(i12, i14, i15)) {
                    bVar3.a(i15, i14);
                }
            }
        }
        int i16 = r11.a * 4;
        int i17 = i16 + 17;
        int i18 = r11.d;
        pb.b bVar4 = new pb.b(i17, i17);
        bVar4.c(0, 0, 9, 9);
        int i19 = i16 + 9;
        bVar4.c(i19, 0, 8, 9);
        bVar4.c(0, i19, 9, 8);
        int[] iArr = r11.b;
        int length = iArr.length;
        for (int i20 = 0; i20 < length; i20++) {
            int i21 = iArr[i20] - 2;
            for (int i22 = 0; i22 < length; i22++) {
                if ((i20 != 0 || (i22 != 0 && i22 != length - 1)) && (i20 != length - 1 || i22 != 0)) {
                    bVar4.c(iArr[i22] - 2, i21, 5, 5);
                }
            }
        }
        int i23 = 6;
        bVar4.c(6, 9, 1, i16);
        bVar4.c(9, 6, i16, 1);
        if (r11.a > 6) {
            int i24 = i16 + 6;
            bVar4.c(i24, 0, 3, 6);
            bVar4.c(0, i24, 6, 3);
        }
        byte[] bArr = new byte[i18];
        int i25 = i13 - 1;
        int i26 = i25;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        boolean z4 = true;
        while (i26 > 0) {
            if (i26 == i23) {
                i26--;
            }
            for (int i30 = 0; i30 < i13; i30++) {
                int i31 = z4 ? i25 - i30 : i30;
                for (int i32 = 0; i32 < 2; i32++) {
                    int i33 = i26 - i32;
                    if (!bVar4.b(i33, i31)) {
                        i28++;
                        i29 <<= 1;
                        if (bVar3.b(i33, i31)) {
                            i29 |= 1;
                        }
                        if (i28 == 8) {
                            bArr[i27] = (byte) i29;
                            i27++;
                            i28 = 0;
                            i29 = 0;
                        }
                    }
                }
            }
            z4 = !z4;
            i26 -= 2;
            i23 = 6;
        }
        if (i27 != i18) {
            throw ob.c.a();
        }
        if (i18 != r10.d) {
            throw new IllegalArgumentException();
        }
        p2.v vVar = r10.c[bVar2.ordinal()];
        c5.e[] eVarArr = (c5.e[]) vVar.c;
        int i34 = vVar.b;
        int i35 = 0;
        for (c5.e eVar : eVarArr) {
            i35 += eVar.a;
        }
        j9.l[] lVarArr = new j9.l[i35];
        int i36 = 0;
        for (c5.e eVar2 : eVarArr) {
            int i37 = 0;
            while (i37 < eVar2.a) {
                int i38 = eVar2.b;
                lVarArr[i36] = new j9.l(i38, new byte[i34 + i38]);
                i37++;
                i36++;
            }
        }
        int length2 = lVarArr[0].b.length;
        int i39 = i35 - 1;
        while (i39 >= 0 && lVarArr[i39].b.length != length2) {
            i39--;
        }
        int i40 = i39 + 1;
        int i41 = length2 - i34;
        int i42 = 0;
        int i43 = 0;
        while (i42 < i41) {
            int i44 = i43;
            int i45 = 0;
            while (i45 < i36) {
                lVarArr[i45].b[i42] = bArr[i44];
                i45++;
                i44++;
            }
            i42++;
            i43 = i44;
        }
        int i46 = i40;
        while (i46 < i36) {
            lVarArr[i46].b[i41] = bArr[i43];
            i46++;
            i43++;
        }
        boolean z10 = false;
        int length3 = lVarArr[0].b.length;
        while (i41 < length3) {
            int i47 = i43;
            int i48 = 0;
            while (i48 < i36) {
                lVarArr[i48].b[i48 < i40 ? i41 : i41 + 1] = bArr[i47];
                i48++;
                i47++;
            }
            i41++;
            i43 = i47;
        }
        int i49 = 0;
        for (int i50 = 0; i50 < i35; i50++) {
            i49 += lVarArr[i50].a;
        }
        byte[] bArr2 = new byte[i49];
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        while (i52 < i35) {
            j9.l lVar = lVarArr[i52];
            byte[] bArr3 = lVar.b;
            int i54 = lVar.a;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i55 = 0; i55 < length4; i55++) {
                iArr2[i55] = bArr3[i55] & 255;
            }
            try {
                int e02 = ((oh.h4) this.b).e0(bArr3.length - i54, iArr2);
                for (int i56 = 0; i56 < i54; i56++) {
                    bArr3[i56] = (byte) iArr2[i56];
                }
                i51 += e02;
                int i57 = i53;
                int i58 = 0;
                while (i58 < i54) {
                    bArr2[i57] = bArr3[i58];
                    i58++;
                    i57++;
                }
                i52++;
                i53 = i57;
            } catch (rb.c unused) {
                ob.a aVar = ob.a.c;
                if (ob.h.a) {
                    throw new ob.a();
                }
                throw ob.a.c;
            }
        }
        char[] cArr = tb.a.a;
        p2.g gVar = new p2.g();
        gVar.c = bArr2;
        StringBuilder sb = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int i59 = -1;
        int i60 = -1;
        boolean z11 = false;
        boolean z12 = false;
        pb.c cVar2 = null;
        while (true) {
            try {
                int d = gVar.d();
                tb.d dVar2 = tb.d.c;
                if (d < 4 || (f10 = gVar.f(4)) == 0) {
                    dVar = dVar2;
                } else if (f10 == 1) {
                    dVar = tb.d.d;
                } else if (f10 == 2) {
                    dVar = tb.d.e;
                } else if (f10 == 3) {
                    dVar = tb.d.f;
                } else if (f10 == 4) {
                    dVar = tb.d.h;
                } else if (f10 == 5) {
                    dVar = tb.d.s;
                } else if (f10 == 7) {
                    dVar = tb.d.n;
                } else if (f10 == 8) {
                    dVar = tb.d.r;
                } else if (f10 == 9) {
                    dVar = tb.d.v;
                } else {
                    if (f10 != 13) {
                        throw new IllegalArgumentException();
                    }
                    dVar = tb.d.w;
                }
                int ordinal = dVar.ordinal();
                if (ordinal != 0) {
                    bVar = bVar2;
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            i10 = i51;
                            i11 = 1;
                            int f12 = gVar.f(8);
                            if ((f12 & 128) == 0) {
                                f11 = f12 & 127;
                            } else if ((f12 & 192) == 128) {
                                f11 = ((f12 & 63) << 8) | gVar.f(8);
                            } else {
                                if ((f12 & 224) != 192) {
                                    throw ob.c.a();
                                }
                                f11 = ((f12 & 31) << 16) | gVar.f(16);
                            }
                            HashMap hashMap = pb.c.c;
                            if (f11 < 0 || f11 >= 900) {
                                break;
                            }
                            pb.c cVar3 = (pb.c) pb.c.c.get(Integer.valueOf(f11));
                            if (cVar3 == null) {
                                throw ob.c.a();
                            }
                            cVar = cVar3;
                        } else if (ordinal == 7) {
                            i10 = i51;
                            i11 = 1;
                            cVar = cVar2;
                            z11 = true;
                            z10 = true;
                        } else if (ordinal == 8) {
                            i10 = i51;
                            i11 = 1;
                            cVar = cVar2;
                            z11 = true;
                            z12 = true;
                        } else if (ordinal != 9) {
                            int f13 = gVar.f(dVar.a(r10));
                            int ordinal2 = dVar.ordinal();
                            i10 = i51;
                            if (ordinal2 == 1) {
                                tb.a.e(gVar, sb, f13);
                            } else if (ordinal2 == 2) {
                                tb.a.a(gVar, sb, f13, z11);
                            } else if (ordinal2 == 4) {
                                tb.a.b(gVar, sb, f13, cVar2, arrayList);
                            } else {
                                if (ordinal2 != 6) {
                                    throw ob.c.a();
                                }
                                tb.a.d(gVar, sb, f13);
                            }
                        } else {
                            i10 = i51;
                            int f14 = gVar.f(4);
                            int f15 = gVar.f(dVar.a(r10));
                            i11 = 1;
                            if (f14 == 1) {
                                tb.a.c(gVar, sb, f15);
                            }
                        }
                        int i61 = i59;
                        if (dVar == dVar2) {
                            if (cVar != null) {
                                i11 = z10 ? 4 : z12 ? 6 : 2;
                            } else if (z10) {
                                i11 = 3;
                            } else if (z12) {
                                i11 = 5;
                            }
                            pb.d dVar3 = new pb.d(bArr2, sb.toString(), arrayList.isEmpty() ? null : arrayList, bVar.toString(), i61, i60, i11);
                            dVar3.d = Integer.valueOf(i10);
                            return dVar3;
                        }
                        i59 = i61;
                        bVar2 = bVar;
                        cVar2 = cVar;
                        i51 = i10;
                    } else {
                        i10 = i51;
                        i11 = 1;
                        if (gVar.d() < 16) {
                            throw ob.c.a();
                        }
                        i59 = gVar.f(8);
                        i60 = gVar.f(8);
                    }
                    cVar = cVar2;
                    int i612 = i59;
                    if (dVar == dVar2) {
                    }
                } else {
                    bVar = bVar2;
                    i10 = i51;
                }
                i11 = 1;
                cVar = cVar2;
                int i6122 = i59;
                if (dVar == dVar2) {
                }
            } catch (IllegalArgumentException unused2) {
                throw ob.c.a();
            }
        }
    }

    @Override // androidx.activity.result.b
    public void k(Object obj) {
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

    public ub.a m(float f10, float f11, int i10, int i11) {
        ub.a b10;
        ub.a b11;
        int i12 = (int) (f11 * f10);
        int max = Math.max(0, i10 - i12);
        pb.b bVar = (pb.b) this.b;
        int min = Math.min(bVar.a - 1, i10 + i12) - max;
        float f12 = 3.0f * f10;
        if (min < f12) {
            throw ob.e.a();
        }
        int max2 = Math.max(0, i11 - i12);
        int min2 = Math.min(bVar.b - 1, i11 + i12) - max2;
        if (min2 < f12) {
            throw ob.e.a();
        }
        pb.b bVar2 = (pb.b) this.b;
        ub.b bVar3 = new ub.b(bVar2, max, max2, min, min2, f10);
        int i13 = bVar3.e;
        int i14 = bVar3.c;
        int i15 = i13 + i14;
        int i16 = bVar3.f;
        int i17 = (i16 / 2) + bVar3.d;
        int[] iArr = new int[3];
        for (int i18 = 0; i18 < i16; i18++) {
            int i19 = ((i18 & 1) == 0 ? (i18 + 1) / 2 : -((i18 + 1) / 2)) + i17;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i20 = i14;
            while (i20 < i15 && !bVar2.b(i20, i19)) {
                i20++;
            }
            int i21 = 0;
            while (i20 < i15) {
                if (!bVar2.b(i20, i19)) {
                    if (i21 == 1) {
                        i21++;
                    }
                    iArr[i21] = iArr[i21] + 1;
                } else if (i21 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i21 != 2) {
                    i21++;
                    iArr[i21] = iArr[i21] + 1;
                } else {
                    if (bVar3.a(iArr) && (b11 = bVar3.b(i19, i20, iArr)) != null) {
                        return b11;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i21 = 1;
                }
                i20++;
            }
            if (bVar3.a(iArr) && (b10 = bVar3.b(i19, i15, iArr)) != null) {
                return b10;
            }
        }
        ArrayList arrayList = bVar3.b;
        if (arrayList.isEmpty()) {
            throw ob.e.a();
        }
        return (ub.a) arrayList.get(0);
    }

    @Override // wh.p3
    public void n(wh.a aVar) {
        wh.z1 z1Var = (wh.z1) this.b;
        if (aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(z1Var)) {
            mi miVar = new mi(z1Var.getParentActivity(), z1Var, false, false, false, z1Var.getResourceProvider());
            miVar.W1 = new h7.u(24);
            miVar.M = true;
            miVar.u1.setVisibility(8);
            miVar.q2 = new qh.l1(z1Var, aVar, miVar, 6);
            miVar.r1();
            miVar.show();
        }
    }

    public s0.d o(int i10) {
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        r5.c.h((r5.c) ((r5.j) this.b).c, "joinApplication", task);
    }

    @Override // wh.p3
    public void onContentChanged() {
        wh.z1 z1Var = (wh.z1) this.b;
        if (z1Var.v0 != null) {
            boolean l32 = z1Var.M.l3();
            z1Var.I0 = l32;
            z1Var.v0.h(l32);
            z1Var.v0.invalidate();
        }
        z1Var.C0();
        Runnable runnable = z1Var.J0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override // wh.p3
    public void p(int i10) {
        ((wh.z1) this.b).o0(74, i10);
    }

    @Override // wh.p3
    public void q() {
        wh.z1 z1Var = (wh.z1) this.b;
        wh.f3 f3Var = z1Var.M.k3;
        z1Var.x0((f3Var != null && f3Var.y() && z1Var.M.B4()) ? 1 : 0, true);
        z1Var.y0();
        z1Var.w0();
    }

    @Override // o4.m0
    public void s(o4.n0 n0Var) {
        t4.l lVar = (t4.l) this.b;
        lVar.D.s(lVar);
    }

    @Override // wh.p3
    public void u() {
        wh.z1 z1Var = (wh.z1) this.b;
        z1Var.F0 = z1Var.H0;
        wh.z1.Z(z1Var, false, false);
        z1Var.x0(2, true);
    }

    public void v() {
        t4.l lVar = (t4.l) this.b;
        int i10 = lVar.E - 1;
        lVar.E = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (t4.r rVar : lVar.G) {
            rVar.h();
            i11 += rVar.V.a;
        }
        o4.s0[] s0VarArr = new o4.s0[i11];
        int i12 = 0;
        for (t4.r rVar2 : lVar.G) {
            rVar2.h();
            int i13 = rVar2.V.a;
            int i14 = 0;
            while (i14 < i13) {
                rVar2.h();
                s0VarArr[i12] = rVar2.V.a(i14);
                i14++;
                i12++;
            }
        }
        lVar.F = new o4.t0(s0VarArr);
        lVar.D.a(lVar);
    }

    @Override // org.telegram.ui.Components.oa0
    public Paint.FontMetricsInt w() {
        return ((mi) this.b).B0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // wh.p3
    public void x(wh.q3 q3Var, View view) {
        wh.z1 z1Var = (wh.z1) this.b;
        q70 H = q70.H(z1Var, view);
        H.Q = true;
        z1Var.getParentActivity();
        z1Var.getResourceProvider();
        z1Var.u0 = wh.d4.b(H, z1Var, q3Var, false);
    }

    @Override // uf.j1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // ra.m
    public Object y2() {
        Class cls = (Class) this.b;
        try {
            return ra.r.a.a(cls);
        } catch (Exception e6) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e6);
        }
    }

    @Override // wh.h0
    public m9 z() {
        switch (this.a) {
            case 26:
                wh.l3 l3Var = ((wh.y) this.b).L;
                if (l3Var != null) {
                    return l3Var.a.getTextSelectionHelper();
                }
                return null;
            default:
                wh.k3 k3Var = ((wh.o4) this.b).K;
                if (k3Var != null) {
                    return k3Var.a.getTextSelectionHelper();
                }
                return null;
        }
    }

    public /* synthetic */ f1(w6.b bVar, l5.e eVar) {
        this.a = 25;
        this.b = eVar;
    }

    public f1(n9.b bVar) {
        this.a = 9;
        this.b = new File(bVar.b, "com.crashlytics.settings.json");
    }

    public f1(int i10) {
        this.a = i10;
        switch (i10) {
            case 17:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new s0.e(this);
                    break;
                } else {
                    this.b = new hh0(this);
                    break;
                }
            case 20:
                this.b = new oh.h4(rb.a.h, 17);
                break;
        }
    }

    public f1(int i10, int i11, int[] iArr) {
        this.a = 1;
        b60[] b60VarArr = new b60[(iArr.length / 2) + 1];
        this.b = b60VarArr;
        b60 b60Var = new b60(i10, i11);
        int i12 = 0;
        b60VarArr[0] = b60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((b60[]) this.b)[i13] = new b60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public f1(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 12;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public f1(EditText editText) {
        this.a = 10;
        this.b = new n7.qa(editText);
    }

    @Override // wh.p3
    public void A() {
    }

    @Override // wh.p3
    public void C(int i10) {
    }

    @Override // uf.j1
    public /* synthetic */ void V(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.oa0
    public /* synthetic */ void X(String str) {
    }

    @Override // wh.p3
    public void h(wh.e1 e1Var, boolean z4) {
    }

    @Override // org.telegram.ui.Components.oa0
    public /* synthetic */ void N(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Components.oa0
    public /* synthetic */ void l(TLRPC.BotInlineResult botInlineResult, boolean z4, int i10) {
    }
}
