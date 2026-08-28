package m5;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.View;
import android.widget.EditText;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.j5;
import g7.y5;
import j$.util.Objects;
import j3.r0;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Cells.g1;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.h50;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.z51;
import org.telegram.ui.li0;
import qh.b2;
import qh.d1;
import qh.d4;
import qh.f4;
import qh.k3;
import qh.o3;
import qh.x1;
import r0.m1;
import xf.a1;
import xf.c1;
import xf.s0;
import xf.z0;
import yf.v0;
import yf.v1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements com.google.android.gms.common.api.internal.s, androidx.activity.result.b, OnSuccessListener, na.n, z51, x4, t90, r0.o, p5.a, kn0, qh.g0, v0.i, v1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    public static float[] l(ArrayList arrayList) {
        double d;
        double d9;
        float f10;
        double[] dArr;
        ArrayList arrayList2;
        float f11;
        int i9;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            PointF pointF = (PointF) arrayList.get(i10);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
        }
        int size2 = arrayList.size();
        double d10 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            d = 1.0d;
            d9 = 6.0d;
            f10 = 255.0f;
            dArr = null;
        } else {
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d11 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i11 = 1;
            while (true) {
                i9 = size2 - 1;
                if (i11 >= i9) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i11 - 1);
                PointF pointF3 = (PointF) arrayList.get(i11);
                int i12 = i11 + 1;
                double d12 = d10;
                PointF pointF4 = (PointF) arrayList.get(i12);
                double[] dArr5 = dArr2[i11];
                float f12 = pointF3.x;
                double d13 = d11;
                double d14 = f12 - pointF2.x;
                dArr5[0] = d14 / 6.0d;
                float f13 = pointF4.x;
                dArr5[1] = (f13 - r14) / 3.0d;
                double d15 = f13 - f12;
                dArr5[2] = d15 / 6.0d;
                float f14 = pointF4.y;
                float f15 = pointF3.y;
                dArr3[i11] = ((f14 - f15) / d15) - ((f15 - pointF2.y) / d14);
                i11 = i12;
                d10 = d12;
                d11 = d13;
            }
            d = d10;
            double d16 = d11;
            d9 = 6.0d;
            f10 = 255.0f;
            dArr3[0] = d16;
            dArr3[i9] = d16;
            double[] dArr6 = dArr2[i9];
            dArr6[1] = d;
            dArr6[0] = d16;
            dArr6[2] = d16;
            for (int i13 = 1; i13 < size2; i13++) {
                double[] dArr7 = dArr2[i13];
                double d17 = dArr7[0];
                int i14 = i13 - 1;
                double[] dArr8 = dArr2[i14];
                double d18 = d17 / dArr8[1];
                dArr7[1] = dArr7[1] - (dArr8[2] * d18);
                dArr7[0] = d16;
                dArr3[i13] = dArr3[i13] - (d18 * dArr3[i14]);
            }
            for (int i15 = size2 - 2; i15 >= 0; i15--) {
                double[] dArr9 = dArr2[i15];
                double d19 = dArr9[2];
                int i16 = i15 + 1;
                double[] dArr10 = dArr2[i16];
                double d20 = d19 / dArr10[1];
                dArr9[1] = dArr9[1] - (dArr10[0] * d20);
                dArr9[2] = d16;
                dArr3[i15] = dArr3[i15] - (d20 * dArr3[i16]);
            }
            dArr = new double[size2];
            for (int i17 = 0; i17 < size2; i17++) {
                dArr[i17] = dArr3[i17] / dArr2[i17][1];
            }
        }
        int length = dArr.length;
        if (length < 1) {
            arrayList2 = null;
            f11 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i18 = 0;
            while (i18 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i18);
                int i19 = i18 + 1;
                PointF pointF6 = (PointF) arrayList.get(i19);
                int i20 = (int) pointF5.x;
                while (true) {
                    float f16 = pointF6.x;
                    if (i20 < ((int) f16)) {
                        float f17 = i20;
                        PointF pointF7 = pointF5;
                        double d21 = f16 - pointF5.x;
                        double d22 = (f17 - r12) / d21;
                        double d23 = d - d22;
                        int i21 = length;
                        double[] dArr11 = dArr;
                        float f18 = (float) (((((((d22 * d22) * d22) - d22) * dArr11[i19]) + ((((d23 * d23) * d23) - d23) * dArr11[i18])) * ((d21 * d21) / d9)) + (pointF6.y * d22) + (pointF7.y * d23));
                        if (f18 > f10) {
                            f18 = 255.0f;
                        } else if (f18 < 0.0f) {
                            f18 = 0.0f;
                        }
                        arrayList2.add(new PointF(f17, f18));
                        i20++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i21;
                    }
                }
                i18 = i19;
            }
            f11 = 0.0f;
            arrayList2.add((PointF) r0.j(1, arrayList));
        }
        float f19 = ((PointF) arrayList2.get(0)).x;
        if (f19 > f11) {
            for (int i22 = (int) f19; i22 >= 0; i22--) {
                arrayList2.add(0, new PointF(i22, 0.0f));
            }
        }
        float f20 = ((PointF) r0.j(1, arrayList2)).x;
        if (f20 < f10) {
            for (int i23 = ((int) f20) + 1; i23 <= 255; i23++) {
                arrayList2.add(new PointF(i23, 255.0f));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        for (int i24 = 0; i24 < size3; i24++) {
            PointF pointF8 = (PointF) arrayList2.get(i24);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i24] = sqrt;
        }
        return fArr;
    }

    public static c0 m(float f10, int i9) {
        Point point = AndroidUtilities.displaySize;
        int i10 = (int) (point.x * f10);
        int i11 = (int) (point.y * f10);
        if (i10 == i11) {
            return new c0(i10, i11, new int[0]);
        }
        if (i9 == 3) {
            return new c0(i10, i11, new int[]{i11, i10});
        }
        return (i9 == 1) == (i10 < i11) ? new c0(i10, i11, new int[0]) : new c0(i11, i10, new int[0]);
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        switch (this.a) {
            case 12:
                ((ChatActivityEnterView) this.b).T0(i9, z10, 0, true, 0L);
                break;
            default:
                x1 x1Var = (x1) this.b;
                x1Var.r0(i9, i10, z10);
                li0 li0Var = x1Var.K0;
                if (li0Var != null) {
                    li0Var.i();
                    x1Var.K0 = null;
                    break;
                }
                break;
        }
    }

    @Override // qh.g0
    public n9 D() {
        d4 d4Var = ((f4) this.b).C;
        if (d4Var != null) {
            return ((k3) d4Var).a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // qh.g0
    public void G(CharSequence charSequence) {
        d4 d4Var = ((f4) this.b).C;
        if (d4Var != null) {
            k3 k3Var = (k3) d4Var;
            k3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            k3Var.a.t4(charSequence.toString());
        }
    }

    @Override // qh.g0
    public m9 H() {
        return (f4) this.b;
    }

    @Override // qh.g0
    public qh.a I() {
        return ((f4) this.b).a;
    }

    @Override // qh.g0
    public boolean K() {
        f4 f4Var = (f4) this.b;
        d4 d4Var = f4Var.C;
        if (d4Var == null) {
            return false;
        }
        qh.a aVar = f4Var.a;
        return ((k3) d4Var).a.S4();
    }

    @Override // r0.o
    public m1 L0(View view, m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ll0 ll0Var = (ll0) this.b;
        ll0Var.v.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        ll0Var.s.requestLayout();
        return m1.b;
    }

    @Override // qh.g0
    public void N0() {
        f4 f4Var = (f4) this.b;
        d4 d4Var = f4Var.C;
        if (d4Var != null) {
            qh.a aVar = f4Var.a;
            o3.O1(((k3) d4Var).a);
        }
    }

    @Override // qh.g0
    public void Q(int i9, int i10) {
        f4 f4Var = (f4) this.b;
        d4 d4Var = f4Var.C;
        if (d4Var != null) {
            qh.a aVar = f4Var.a;
            b2 b2Var = ((k3) d4Var).a.F3;
            if (b2Var != null) {
                b2Var.f(i9, i10);
            }
        }
    }

    @Override // qh.g0
    public void T() {
        f4 f4Var = (f4) this.b;
        d4 d4Var = f4Var.C;
        if (d4Var != null) {
            qh.a aVar = f4Var.a;
            o3 o3Var = ((k3) d4Var).a;
            b2 b2Var = o3Var.F3;
            if (b2Var != null) {
                b2Var.g();
            }
            o3Var.d3.onContentChanged();
        }
    }

    @Override // na.n
    public Object Y1() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new la.j("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new la.j("Invalid EnumSet type: " + type.toString());
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                q5.x xVar = (q5.x) obj;
                q5.f fVar = (q5.f) xVar.u();
                e0 e0Var = ((f0) this.b).k;
                Parcel M0 = fVar.M0();
                com.google.android.gms.internal.cast.u.d(M0, e0Var);
                fVar.R0(M0, 18);
                q5.f fVar2 = (q5.f) xVar.u();
                fVar2.R0(fVar2.M0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                break;
            default:
                s6.b bVar = (s6.b) this.b;
                s6.a aVar = new s6.a((TaskCompletionSource) obj2);
                s6.i iVar = (s6.i) ((s6.c) obj).u();
                String str = bVar.k;
                Parcel I0 = iVar.I0();
                int i9 = s6.f.a;
                I0.writeStrongBinder(aVar);
                I0.writeString(str);
                iVar.J0(I0, 2);
                break;
        }
    }

    @Override // org.telegram.ui.Components.kn0
    public void b(float f10) {
        qh.x xVar = (qh.x) this.b;
        MessageObject messageObject = xVar.L;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        MediaController.getInstance().seekToProgress(xVar.L, f10);
    }

    public void c(StringBuilder sb2, AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // qh.g0
    public void d(d1 d1Var) {
        d4 d4Var = ((f4) this.b).C;
        if (d4Var != null) {
            o3 o3Var = ((k3) d4Var).a;
            o3.M1(o3Var, d1Var);
            o3Var.d3.f1(d1Var, true);
        }
    }

    @Override // org.telegram.ui.Components.kn0
    public void e(float f10) {
        MessageObject messageObject = ((qh.x) this.b).L;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
    }

    @Override // androidx.activity.result.b
    public void f(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.b;
        int i9 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.J;
        if (resultReceiver != null) {
            resultReceiver.send(i9, intent == null ? null : intent.getExtras());
        }
        int i10 = aVar.a;
        if (i10 != -1 || i9 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i10 + " and billing's responseCode: " + i9);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // qh.g0
    public void g() {
        f4 f4Var = (f4) this.b;
        d4 d4Var = f4Var.C;
        if (d4Var != null) {
            o3.P1(((k3) d4Var).a, f4Var.a);
        }
    }

    @Override // yf.v1
    public void g0(float f10) {
        v0 v0Var = (v0) this.b;
        s0.e(v0Var.a).k("-1", f10);
        v0Var.e.setBrushSize(f10);
    }

    @Override // yf.v1
    public float get() {
        v0 v0Var = (v0) this.b;
        int i9 = v0Var.a;
        xf.m currentBrush = v0Var.e.getCurrentBrush();
        return currentBrush == null ? s0.e(i9).i : s0.e(i9).f("-1", currentBrush.d());
    }

    @Override // org.telegram.ui.Components.t90
    public Paint.FontMetricsInt h() {
        return ((ki) this.b).A0.getEditText().getPaint().getFontMetricsInt();
    }

    public void i() {
        a1 a1Var = ((c1) this.b).d;
        if (a1Var != null) {
            z0 z0Var = a1Var.s;
            if (z0Var != null) {
                a1Var.cancelRunnable(z0Var);
                a1Var.s = null;
            }
            z0 z0Var2 = new z0(a1Var, 1);
            a1Var.s = z0Var2;
            a1Var.postRunnable(z0Var2, 1L);
        }
    }

    @Override // org.telegram.ui.Components.z51
    public void invalidate() {
        switch (this.a) {
            case 10:
                ((t1) ((g1) this.b).b).invalidate();
                break;
            default:
                ((pf0) this.b).h.invalidate();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05cf A[Catch: a | c -> 0x0662, TryCatch #3 {a | c -> 0x0662, blocks: (B:292:0x05b5, B:293:0x05cb, B:295:0x05cf, B:296:0x05d2, B:298:0x05d6, B:300:0x05e0, B:302:0x05e6, B:307:0x05eb), top: B:291:0x05b5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j4.c j(g5.b bVar) {
        ArrayList arrayList;
        qb.c cVar;
        qb.c cVar2;
        qb.c cVar3;
        float f10;
        float f11;
        qb.a aVar;
        float f12;
        float f13;
        float f14;
        int i9;
        int i10;
        kb.j[] jVarArr;
        kb.a aVar2;
        lb.b bVar2;
        int i11;
        lb.d dVar;
        int i12;
        j4.c cVar4;
        List list;
        String str;
        int i13;
        boolean z10;
        double d;
        double abs;
        char c10;
        int i14;
        n2.p pVar = (n2.p) this.b;
        lb.b m10 = bVar.m();
        n5.e0 e0Var = new n5.e0(m10, 16);
        qb.e eVar = new qb.e(m10);
        int i15 = m10.b;
        int i16 = m10.a;
        int i17 = (i15 * 3) / 388;
        if (i17 < 3) {
            i17 = 3;
        }
        int[] iArr = new int[5];
        int i18 = i17 - 1;
        int i19 = 0;
        boolean z11 = false;
        while (true) {
            int i20 = 1;
            arrayList = eVar.b;
            if (i18 >= i15 || z11) {
                break;
            }
            Arrays.fill(iArr, i19);
            int i21 = 0;
            while (i21 < i16) {
                if (m10.b(i21, i18)) {
                    if ((i19 & 1) == i20) {
                        i19++;
                    }
                    iArr[i19] = iArr[i19] + i20;
                } else {
                    if ((i19 & 1) != 0) {
                        iArr[i19] = iArr[i19] + 1;
                    } else if (i19 == 4) {
                        if (!qb.e.b(iArr)) {
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                        } else if (eVar.c(i18, i21, iArr)) {
                            if (eVar.c) {
                                z11 = eVar.d();
                            } else {
                                if (arrayList.size() > i20) {
                                    int size = arrayList.size();
                                    int i22 = 0;
                                    qb.c cVar5 = null;
                                    while (true) {
                                        if (i22 >= size) {
                                            c10 = 2;
                                            i14 = 0;
                                            break;
                                        }
                                        Object obj = arrayList.get(i22);
                                        i22++;
                                        qb.c cVar6 = (qb.c) obj;
                                        int i23 = size;
                                        if (cVar6.d >= 2) {
                                            if (cVar5 != null) {
                                                eVar.c = true;
                                                c10 = 2;
                                                i14 = ((int) (Math.abs(cVar5.a - cVar6.a) - Math.abs(cVar5.b - cVar6.b))) / 2;
                                                break;
                                            }
                                            cVar5 = cVar6;
                                        }
                                        size = i23;
                                    }
                                } else {
                                    i14 = 0;
                                    c10 = 2;
                                }
                                if (i14 > iArr[c10]) {
                                    i18 += (i14 - r4) - 2;
                                    i21 = i16 - 1;
                                }
                            }
                            Arrays.fill(iArr, 0);
                            i17 = 2;
                            i19 = 0;
                        } else {
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                        }
                        i19 = 3;
                    } else {
                        int i24 = i19 + 1;
                        iArr[i24] = iArr[i24] + 1;
                        i19 = i24;
                    }
                    i21++;
                    i20 = 1;
                }
                i21++;
                i20 = 1;
            }
            if (qb.e.b(iArr) && eVar.c(i18, i16, iArr)) {
                int i25 = iArr[0];
                if (eVar.c) {
                    i17 = i25;
                    z11 = eVar.d();
                } else {
                    i17 = i25;
                }
            }
            i18 += i17;
            i19 = 0;
        }
        if (arrayList.size() < 3) {
            throw kb.e.a();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((qb.c) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList, qb.e.e);
        qb.c[] cVarArr = new qb.c[3];
        int i26 = 0;
        double d9 = Double.MAX_VALUE;
        for (int i27 = 2; i26 < arrayList.size() - i27; i27 = 2) {
            qb.c cVar7 = (qb.c) arrayList.get(i26);
            float f15 = cVar7.c;
            i26++;
            int i28 = i26;
            while (i28 < arrayList.size() - 1) {
                qb.c cVar8 = (qb.c) arrayList.get(i28);
                double e10 = qb.e.e(cVar7, cVar8);
                i28++;
                for (int i29 = i28; i29 < arrayList.size(); i29++) {
                    qb.c cVar9 = (qb.c) arrayList.get(i29);
                    if (cVar9.c <= 1.4f * f15) {
                        double e11 = qb.e.e(cVar8, cVar9);
                        double e12 = qb.e.e(cVar7, cVar9);
                        if (e10 < e11) {
                            if (e11 <= e12) {
                                e12 = e11;
                                e11 = e12;
                            } else if (e10 >= e12) {
                                d = e12;
                                e12 = e10;
                                abs = Math.abs(e11 - (d * 2.0d)) + Math.abs(e11 - (e12 * 2.0d));
                                if (abs >= d9) {
                                    cVarArr[0] = cVar7;
                                    cVarArr[1] = cVar8;
                                    cVarArr[2] = cVar9;
                                    d9 = abs;
                                }
                            }
                            d = e10;
                            abs = Math.abs(e11 - (d * 2.0d)) + Math.abs(e11 - (e12 * 2.0d));
                            if (abs >= d9) {
                            }
                        } else {
                            if (e11 >= e12) {
                                d = e12;
                                e12 = e11;
                            } else if (e10 < e12) {
                                d = e11;
                                e11 = e12;
                                e12 = e10;
                                abs = Math.abs(e11 - (d * 2.0d)) + Math.abs(e11 - (e12 * 2.0d));
                                if (abs >= d9) {
                                }
                            } else {
                                d = e11;
                            }
                            e11 = e10;
                            abs = Math.abs(e11 - (d * 2.0d)) + Math.abs(e11 - (e12 * 2.0d));
                            if (abs >= d9) {
                            }
                        }
                    }
                }
            }
        }
        if (d9 == Double.MAX_VALUE) {
            throw kb.e.a();
        }
        float a2 = kb.j.a(cVarArr[0], cVarArr[1]);
        float a3 = kb.j.a(cVarArr[1], cVarArr[2]);
        float a10 = kb.j.a(cVarArr[0], cVarArr[2]);
        if (a3 >= a2 && a3 >= a10) {
            cVar = cVarArr[0];
            cVar2 = cVarArr[1];
            cVar3 = cVarArr[2];
        } else if (a10 < a3 || a10 < a2) {
            cVar = cVarArr[2];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[1];
        } else {
            cVar = cVarArr[1];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[2];
        }
        float f16 = cVar.a;
        float f17 = cVar.b;
        if (r0.C(cVar2.a, f16, cVar3.b - f17, (cVar2.b - f17) * (cVar3.a - f16)) < 0.0f) {
            qb.c cVar10 = cVar3;
            cVar3 = cVar2;
            cVar2 = cVar10;
        }
        cVarArr[0] = cVar2;
        cVarArr[1] = cVar;
        cVarArr[2] = cVar3;
        float L0 = e0Var.L0(cVar, cVar3);
        float f18 = cVar.a;
        float f19 = cVar3.b;
        float f20 = cVar3.a;
        float L02 = e0Var.L0(cVar, cVar2);
        float f21 = cVar2.b;
        float f22 = cVar2.a;
        float f23 = (L02 + L0) / 2.0f;
        if (f23 < 1.0f) {
            throw kb.e.a();
        }
        float a11 = kb.j.a(cVar, cVar3) / f23;
        int i30 = (int) (a11 + (a11 < 0.0f ? -0.5f : 0.5f));
        float a12 = kb.j.a(cVar, cVar2) / f23;
        int i31 = (((int) (a12 + (a12 >= 0.0f ? 0.5f : -0.5f))) + i30) / 2;
        int i32 = i31 + 7;
        int i33 = i32 & 3;
        if (i33 == 0) {
            i32 = i31 + 8;
        } else if (i33 == 2) {
            i32 = i31 + 6;
        } else if (i33 == 3) {
            i32 = i31 + 5;
        }
        int i34 = i32;
        int[] iArr2 = pb.e.e;
        if (i34 % 4 != 1) {
            throw kb.c.a();
        }
        try {
            pb.e c11 = pb.e.c((i34 - 17) / 4);
            int i35 = (c11.a * 4) + 10;
            if (c11.b.length > 0) {
                float f24 = (f20 - f18) + f22;
                f11 = f20;
                float f25 = (f19 - f17) + f21;
                float f26 = 1.0f - (3.0f / i35);
                int z12 = (int) e2.c.z(f24, f18, f26, f18);
                int z13 = (int) e2.c.z(f25, f17, f26, f17);
                f10 = f18;
                for (int i36 = 4; i36 <= 16; i36 <<= 1) {
                    try {
                        aVar = e0Var.T0(f23, i36, z12, z13);
                        break;
                    } catch (kb.e unused) {
                    }
                }
            } else {
                f10 = f18;
                f11 = f20;
            }
            aVar = null;
            float f27 = i34 - 3.5f;
            if (aVar != null) {
                f12 = aVar.a;
                f13 = aVar.b;
                f14 = f27 - 3.0f;
            } else {
                f12 = (f11 - f10) + f22;
                f13 = (f19 - f17) + f21;
                f14 = f27;
            }
            float f28 = f13;
            float f29 = cVar.a;
            float f30 = cVar.b;
            float f31 = cVar3.a;
            float f32 = cVar3.b;
            float f33 = cVar2.a;
            float f34 = cVar2.b;
            lb.g a13 = lb.g.a(3.5f, 3.5f, f27, 3.5f, f14, f14, 3.5f, f27);
            qb.a aVar3 = aVar;
            float f35 = a13.e;
            float f36 = a13.i;
            float f37 = f35 * f36;
            float f38 = a13.f;
            float f39 = a13.h;
            float f40 = f37 - (f38 * f39);
            float f41 = a13.g;
            float f42 = f38 * f41;
            float f43 = a13.d;
            float f44 = f42 - (f43 * f36);
            float f45 = (f43 * f39) - (f35 * f41);
            float f46 = a13.c;
            float f47 = f46 * f39;
            float f48 = a13.b;
            float f49 = f47 - (f48 * f36);
            float f50 = a13.a;
            float f51 = (f36 * f50) - (f46 * f41);
            float f52 = (f41 * f48) - (f39 * f50);
            float f53 = (f48 * f38) - (f46 * f35);
            float f54 = (f46 * f43) - (f38 * f50);
            float f55 = (f50 * f35) - (f48 * f43);
            lb.g a14 = lb.g.a(f29, f30, f31, f32, f12, f28, f33, f34);
            float f56 = a14.a;
            float f57 = a14.d;
            float f58 = a14.g;
            float f59 = (f58 * f53) + (f57 * f49) + (f56 * f40);
            float f60 = (f58 * f54) + (f57 * f51) + (f56 * f44);
            float f61 = (f58 * f55) + (f57 * f52) + (f56 * f45);
            float f62 = a14.b;
            float f63 = a14.e;
            float f64 = a14.h;
            float f65 = (f64 * f53) + (f63 * f49) + (f62 * f40);
            float f66 = (f64 * f54) + (f63 * f51) + (f62 * f44);
            float f67 = (f64 * f55) + (f63 * f52) + (f62 * f45);
            float f68 = a14.c;
            float f69 = a14.f;
            float f70 = a14.i;
            float f71 = (f53 * f70) + (f49 * f69) + (f40 * f68);
            float f72 = (f54 * f70) + (f51 * f69) + (f44 * f68);
            float f73 = (f70 * f55) + (f69 * f52) + (f68 * f45);
            if (i34 <= 0 || i34 <= 0) {
                throw kb.e.a();
            }
            lb.b bVar3 = new lb.b(i34, i34);
            int i37 = i34 * 2;
            qb.c cVar11 = cVar;
            float[] fArr = new float[i37];
            int i38 = 0;
            while (i38 < i34) {
                int i39 = i34;
                float f74 = i38 + 0.5f;
                int i40 = 0;
                while (i40 < i37) {
                    int i41 = i40;
                    fArr[i41] = (i41 / 2) + 0.5f;
                    fArr[i41 + 1] = f74;
                    i40 = i41 + 2;
                }
                int i42 = i37 - 1;
                int i43 = i38;
                int i44 = 0;
                while (i44 < i42) {
                    float f75 = fArr[i44];
                    int i45 = i44 + 1;
                    int i46 = i44;
                    float f76 = fArr[i45];
                    qb.c cVar12 = cVar2;
                    float w8 = aa.d.w(f72, f76, f71 * f75, f73);
                    fArr[i46] = (((f60 * f76) + (f59 * f75)) + f61) / w8;
                    fArr[i45] = (((f76 * f66) + (f75 * f65)) + f67) / w8;
                    i44 = i46 + 2;
                    cVar2 = cVar12;
                }
                qb.c cVar13 = cVar2;
                int i47 = m10.b;
                float f77 = f72;
                int i48 = 0;
                boolean z14 = true;
                while (i48 < i42 && z14) {
                    int i49 = (int) fArr[i48];
                    int i50 = i48 + 1;
                    int i51 = i42;
                    int i52 = (int) fArr[i50];
                    int i53 = i48;
                    if (i49 < -1 || i49 > i16 || i52 < -1 || i52 > i47) {
                        throw kb.e.a();
                    }
                    if (i49 == -1) {
                        fArr[i53] = 0.0f;
                    } else if (i49 == i16) {
                        fArr[i53] = i16 - 1;
                    } else {
                        z10 = false;
                        if (i52 != -1) {
                            fArr[i50] = 0.0f;
                        } else if (i52 == i47) {
                            fArr[i50] = i47 - 1;
                        } else {
                            z14 = z10;
                            i48 = i53 + 2;
                            i42 = i51;
                        }
                        z14 = true;
                        i48 = i53 + 2;
                        i42 = i51;
                    }
                    z10 = true;
                    if (i52 != -1) {
                    }
                    z14 = true;
                    i48 = i53 + 2;
                    i42 = i51;
                }
                int i54 = i37 - 2;
                boolean z15 = true;
                while (i54 >= 0 && z15) {
                    int i55 = (int) fArr[i54];
                    int i56 = i54 + 1;
                    int i57 = i54;
                    int i58 = (int) fArr[i56];
                    if (i55 < -1 || i55 > i16 || i58 < -1 || i58 > i47) {
                        throw kb.e.a();
                    }
                    if (i55 == -1) {
                        fArr[i57] = 0.0f;
                    } else if (i55 == i16) {
                        fArr[i57] = i16 - 1;
                    } else {
                        z15 = false;
                        if (i58 != -1) {
                            fArr[i56] = 0.0f;
                        } else if (i58 == i47) {
                            fArr[i56] = i47 - 1;
                        } else {
                            i54 = i57 - 2;
                        }
                        z15 = true;
                        i54 = i57 - 2;
                    }
                    z15 = true;
                    if (i58 != -1) {
                    }
                    z15 = true;
                    i54 = i57 - 2;
                }
                for (int i59 = 0; i59 < i37; i59 += 2) {
                    try {
                        if (m10.b((int) fArr[i59], (int) fArr[i59 + 1])) {
                            int i60 = i59 / 2;
                            int i61 = (i60 / 32) + (bVar3.c * i43);
                            int[] iArr3 = bVar3.d;
                            iArr3[i61] = iArr3[i61] | (1 << (i60 & 31));
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw kb.e.a();
                    }
                }
                i38 = i43 + 1;
                i34 = i39;
                f72 = f77;
                cVar2 = cVar13;
            }
            qb.c cVar14 = cVar2;
            if (aVar3 == null) {
                i10 = 3;
                i9 = 1;
                jVarArr = new kb.j[]{cVar14, cVar11, cVar3};
            } else {
                i9 = 1;
                i10 = 3;
                jVarArr = new kb.j[]{cVar14, cVar11, cVar3, aVar3};
            }
            kb.j[] jVarArr2 = jVarArr;
            pVar.getClass();
            com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l();
            int i62 = bVar3.b;
            if (i62 < 21 || (i62 & i10) != i9) {
                throw kb.c.a();
            }
            lVar.b = bVar3;
            try {
                dVar = pVar.t(lVar);
            } catch (kb.a e13) {
                aVar2 = e13;
                e = null;
                try {
                    lVar.p();
                    lVar.c = null;
                    lVar.d = null;
                    lVar.a = true;
                    lVar.o();
                    lVar.n();
                    bVar2 = (lb.b) lVar.b;
                    i11 = 0;
                    while (i11 < bVar2.a) {
                        int i63 = i11 + 1;
                        for (int i64 = i63; i64 < bVar2.b; i64++) {
                            if (bVar2.b(i11, i64) != bVar2.b(i64, i11)) {
                                bVar2.a(i64, i11);
                                bVar2.a(i11, i64);
                            }
                        }
                        i11 = i63;
                    }
                    lb.d t10 = pVar.t(lVar);
                    t10.e = new za.a(20);
                    dVar = t10;
                    i12 = dVar.f;
                    if (e2.c.v(dVar.e)) {
                        kb.j jVar = jVarArr2[0];
                        jVarArr2[0] = jVarArr2[2];
                        jVarArr2[2] = jVar;
                    }
                    cVar4 = new j4.c(dVar.a, jVarArr2);
                    list = dVar.b;
                    if (list != null) {
                    }
                    str = dVar.c;
                    if (str != null) {
                    }
                    if (i12 >= 0) {
                        cVar4.F(kb.i.d, Integer.valueOf(i13));
                        cVar4.F(kb.i.e, Integer.valueOf(i12));
                    }
                    cVar4.F(kb.i.c, dVar.d);
                    cVar4.F(kb.i.f, "]Q" + dVar.h);
                    return cVar4;
                } catch (kb.a | kb.c unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw aVar2;
                }
            } catch (kb.c e14) {
                e = e14;
                aVar2 = null;
                lVar.p();
                lVar.c = null;
                lVar.d = null;
                lVar.a = true;
                lVar.o();
                lVar.n();
                bVar2 = (lb.b) lVar.b;
                i11 = 0;
                while (i11 < bVar2.a) {
                }
                lb.d t102 = pVar.t(lVar);
                t102.e = new za.a(20);
                dVar = t102;
                i12 = dVar.f;
                if (e2.c.v(dVar.e)) {
                }
                cVar4 = new j4.c(dVar.a, jVarArr2);
                list = dVar.b;
                if (list != null) {
                }
                str = dVar.c;
                if (str != null) {
                }
                if (i12 >= 0) {
                }
                cVar4.F(kb.i.c, dVar.d);
                cVar4.F(kb.i.f, "]Q" + dVar.h);
                return cVar4;
            }
            i12 = dVar.f;
            if (e2.c.v(dVar.e) && jVarArr2.length >= 3) {
                kb.j jVar2 = jVarArr2[0];
                jVarArr2[0] = jVarArr2[2];
                jVarArr2[2] = jVar2;
            }
            cVar4 = new j4.c(dVar.a, jVarArr2);
            list = dVar.b;
            if (list != null) {
                cVar4.F(kb.i.a, list);
            }
            str = dVar.c;
            if (str != null) {
                cVar4.F(kb.i.b, str);
            }
            if (i12 >= 0 && (i13 = dVar.g) >= 0) {
                cVar4.F(kb.i.d, Integer.valueOf(i13));
                cVar4.F(kb.i.e, Integer.valueOf(i12));
            }
            cVar4.F(kb.i.c, dVar.d);
            cVar4.F(kb.i.f, "]Q" + dVar.h);
            return cVar4;
        } catch (IllegalArgumentException unused4) {
            throw kb.c.a();
        }
    }

    public int k(int i9, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i10;
        int i11;
        nb.a aVar = (nb.a) this.b;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i12 = 1;
            while (i12 < length && iArr[i12] == 0) {
                i12++;
            }
            if (i12 == length) {
                iArr2 = new int[]{0};
            } else {
                int i13 = length - i12;
                int[] iArr4 = new int[i13];
                System.arraycopy(iArr, i12, iArr4, 0, i13);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i9];
        boolean z10 = true;
        for (int i14 = 0; i14 < i9; i14++) {
            int i15 = aVar.a[aVar.g + i14];
            if (i15 == 0) {
                i11 = iArr2[iArr2.length - 1];
            } else {
                if (i15 == 1) {
                    i10 = 0;
                    for (int i16 : iArr2) {
                        nb.a aVar2 = nb.a.h;
                        i10 ^= i16;
                    }
                } else {
                    i10 = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i17 = 1; i17 < length2; i17++) {
                        i10 = aVar.c(i15, i10) ^ iArr2[i17];
                    }
                }
                i11 = i10;
            }
            iArr5[(i9 - 1) - i14] = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            return 0;
        }
        nb.b bVar = new nb.b(aVar, iArr5);
        nb.b a2 = aVar.a(i9, 1);
        nb.b bVar2 = aVar.c;
        if (a2.d() >= bVar.d()) {
            a2 = bVar;
            bVar = a2;
        }
        nb.b bVar3 = aVar.d;
        nb.b bVar4 = a2;
        nb.b bVar5 = bVar;
        nb.b bVar6 = bVar4;
        nb.b bVar7 = bVar2;
        while (bVar6.d() * 2 >= i9) {
            if (bVar6.e()) {
                throw new nb.c("r_{i-1} was zero");
            }
            int b10 = aVar.b(bVar6.c(bVar6.d()));
            nb.b bVar8 = bVar2;
            while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                int d = bVar5.d() - bVar6.d();
                int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                bVar8 = bVar8.a(aVar.a(d, c10));
                bVar5 = bVar5.a(bVar6.h(d, c10));
            }
            nb.b a3 = bVar8.g(bVar3).a(bVar7);
            if (bVar5.d() >= bVar6.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
            }
            nb.b bVar9 = bVar5;
            bVar5 = bVar6;
            bVar6 = bVar9;
            bVar7 = bVar3;
            bVar3 = a3;
        }
        int c11 = bVar3.c(0);
        if (c11 == 0) {
            throw new nb.c("sigmaTilde(0) was zero");
        }
        int b11 = aVar.b(c11);
        nb.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
        nb.b bVar10 = bVarArr[0];
        nb.b bVar11 = bVarArr[1];
        int d9 = bVar10.d();
        if (d9 == 1) {
            iArr3 = new int[]{bVar10.c(1)};
        } else {
            int[] iArr6 = new int[d9];
            int i18 = 0;
            for (int i19 = 1; i19 < aVar.e && i18 < d9; i19++) {
                if (bVar10.b(i19) == 0) {
                    iArr6[i18] = aVar.b(i19);
                    i18++;
                }
            }
            if (i18 != d9) {
                throw new nb.c("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i20 = 0; i20 < length3; i20++) {
            int b12 = aVar.b(iArr3[i20]);
            int i21 = 1;
            for (int i22 = 0; i22 < length3; i22++) {
                if (i20 != i22) {
                    int c12 = aVar.c(iArr3[i22], b12);
                    i21 = aVar.c(i21, (c12 & 1) == 0 ? c12 | 1 : c12 & (-2));
                }
            }
            int c13 = aVar.c(bVar11.b(b12), aVar.b(i21));
            iArr7[i20] = c13;
            if (aVar.g != 0) {
                iArr7[i20] = aVar.c(c13, b12);
            }
        }
        for (int i23 = 0; i23 < iArr3.length; i23++) {
            int length4 = iArr.length - 1;
            int i24 = iArr3[i23];
            if (i24 == 0) {
                throw new IllegalArgumentException();
            }
            int i25 = length4 - aVar.b[i24];
            if (i25 < 0) {
                throw new nb.c("Bad error location");
            }
            iArr[i25] = iArr[i25] ^ iArr7[i23];
        }
        return iArr3.length;
    }

    @Override // v0.i
    public void onError(Object obj) {
        w0.d e10 = (w0.d) obj;
        kotlin.jvm.internal.i.e(e10, "e");
        hd.m mVar = (hd.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(y5.a(e10));
        }
    }

    @Override // v0.i
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        hd.m mVar = (hd.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((n5.a) this.b).getClass();
        j5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override // org.telegram.ui.Components.t90
    public void y(int i9, int i10, CharSequence charSequence, boolean z10) {
        ki kiVar = (ki) this.b;
        if (kiVar.m1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(kiVar.m1().getText());
            spannableStringBuilder.replace(i9, i10 + i9, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, kiVar.m1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            kiVar.m1().setText(spannableStringBuilder);
            kiVar.m1().setSelection(i9 + charSequence.length());
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // p5.a
    public void y0(Bitmap bitmap) {
        q5.b bVar = p5.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f10 = width;
            int height = bitmap.getHeight();
            int d = (int) aa.d.d(f10, 9.0f, 16.0f, 0.5f);
            float f11 = (d - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f11, f10, height + f11);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, d, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((p5.h) this.b).e(bitmap2, 0);
    }

    public c0(h6.a aVar) {
        this.a = 25;
        x5.l.h(aVar);
        this.b = aVar;
    }

    public c0(JSONArray jSONArray) {
        this.a = 1;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                if (optJSONObject != null) {
                    arrayList.add(new n2.j(optJSONObject));
                }
            }
        }
        this.b = arrayList;
    }

    public c0(int i9) {
        this.a = i9;
        switch (i9) {
            case 9:
                this.b = new n2.p(12);
                break;
            case 14:
                break;
            default:
                this.b = new SparseArray();
                break;
        }
    }

    public c0(int i9, int i10, int[] iArr) {
        this.a = 11;
        h50[] h50VarArr = new h50[(iArr.length / 2) + 1];
        this.b = h50VarArr;
        h50 h50Var = new h50(i9, i10);
        int i11 = 0;
        h50VarArr[0] = h50Var;
        while (i11 < iArr.length / 2) {
            int i12 = i11 + 1;
            int i13 = i11 * 2;
            ((h50[]) this.b)[i12] = new h50(iArr[i13], iArr[i13 + 1]);
            i11 = i12;
        }
    }

    public c0(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 23;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public c0(String str) {
        this.a = 4;
        str.getClass();
        this.b = str;
    }

    public c0(EditText editText) {
        this.a = 19;
        this.b = new e3(editText);
    }

    @Override // org.telegram.ui.Components.t90
    public /* synthetic */ void A(String str) {
    }

    @Override // org.telegram.ui.Components.t90
    public /* synthetic */ void a(TLRPC.BotInlineResult botInlineResult, boolean z10, int i9) {
    }

    @Override // org.telegram.ui.Components.t90
    public /* synthetic */ void p(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}
