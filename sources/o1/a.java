package o1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.exoplayer2.upstream.e0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.internal.cast.a0;
import com.google.android.gms.internal.cast.e1;
import com.google.android.gms.internal.cast.e2;
import com.google.android.gms.internal.cast.u;
import com.google.android.gms.internal.cast.z4;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import f5.d0;
import i7.c7;
import i7.r7;
import j3.t1;
import j7.l1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import l4.p;
import m.s3;
import nh.d6;
import o5.y;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.u50;
import org.telegram.ui.Components.voip.w1;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.th;
import org.telegram.ui.tn;
import pa.m;
import q5.n;
import qh.n0;
import qh.o0;
import qh.q;
import r0.m1;
import r0.o;
import rf.j1;
import rf.v0;
import s5.r;
import s5.t;
import sf.f1;
import th.b2;
import th.b4;
import th.d1;
import th.d3;
import th.g0;
import th.i3;
import th.j3;
import th.m3;
import th.m4;
import th.n3;
import th.o3;
import th.p3;
import th.t5;
import th.x;
import th.x1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a implements l0, m61, b5, ha0, o, androidx.activity.result.b, OnSuccessListener, m, s5.o, n0, j1, s, OnCompleteListener, g0, n3, s0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static a F(float f9, int i10) {
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f9);
        int i12 = (int) (point.y * f9);
        if (i11 == i12) {
            return new a(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new a(i11, i12, new int[]{i12, i11});
        }
        return (i10 == 1) == (i11 < i12) ? new a(i11, i12, new int[0]) : new a(i12, i11, new int[0]);
    }

    public static float[] z(ArrayList arrayList) {
        double d;
        double d10;
        float f9;
        double[] dArr;
        ArrayList arrayList2;
        float f10;
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
            f9 = 255.0f;
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
                float f11 = pointF3.x;
                double d14 = d12;
                double d15 = f11 - pointF2.x;
                dArr5[0] = d15 / 6.0d;
                float f12 = pointF4.x;
                dArr5[1] = (f12 - r14) / 3.0d;
                double d16 = f12 - f11;
                dArr5[2] = d16 / 6.0d;
                float f13 = pointF4.y;
                float f14 = pointF3.y;
                dArr3[i12] = ((f13 - f14) / d16) - ((f14 - pointF2.y) / d15);
                i12 = i13;
                d11 = d13;
                d12 = d14;
            }
            d = d11;
            double d17 = d12;
            d10 = 6.0d;
            f9 = 255.0f;
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
            f10 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i19 = 0;
            while (i19 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i19);
                int i20 = i19 + 1;
                PointF pointF6 = (PointF) arrayList.get(i20);
                int i21 = (int) pointF5.x;
                while (true) {
                    float f15 = pointF6.x;
                    if (i21 < ((int) f15)) {
                        float f16 = i21;
                        PointF pointF7 = pointF5;
                        double d22 = f15 - pointF5.x;
                        double d23 = (f16 - r12) / d22;
                        double d24 = d - d23;
                        int i22 = length;
                        double[] dArr11 = dArr;
                        float f17 = (float) (((((((d23 * d23) * d23) - d23) * dArr11[i20]) + ((((d24 * d24) * d24) - d24) * dArr11[i19])) * ((d22 * d22) / d10)) + (pointF6.y * d23) + (pointF7.y * d24));
                        if (f17 > f9) {
                            f17 = 255.0f;
                        } else if (f17 < 0.0f) {
                            f17 = 0.0f;
                        }
                        arrayList2.add(new PointF(f16, f17));
                        i21++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i22;
                    }
                }
                i19 = i20;
            }
            f10 = 0.0f;
            arrayList2.add((PointF) l1.i(1, arrayList));
        }
        float f18 = ((PointF) arrayList2.get(0)).x;
        if (f18 > f10) {
            for (int i23 = (int) f18; i23 >= 0; i23--) {
                arrayList2.add(0, new PointF(i23, 0.0f));
            }
        }
        float f19 = ((PointF) l1.i(1, arrayList2)).x;
        if (f19 < f9) {
            for (int i24 = ((int) f19) + 1; i24 <= 255; i24++) {
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

    @Override // rf.j1
    public /* synthetic */ boolean A(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // th.g0
    public void B(CharSequence charSequence) {
        switch (this.a) {
            case 23:
                j3 j3Var = ((x) this.b).K;
                if (j3Var != null) {
                    j3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        j3Var.a.t4(charSequence.toString());
                        break;
                    }
                }
                break;
            default:
                i3 i3Var = ((m4) this.b).J;
                if (i3Var != null) {
                    i3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        i3Var.a.t4(charSequence.toString());
                        break;
                    }
                }
                break;
        }
    }

    public void C(int i10, long j10) {
        u3.e eVar = (u3.e) this.b;
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw t1.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw t1.a("ContentEncodingScope " + j10 + " not supported", null);
        }
        int i11 = 3;
        switch (i10) {
            case 131:
                eVar.b(i10);
                eVar.u.d = (int) j10;
                return;
            case 136:
                eVar.b(i10);
                eVar.u.V = j10 == 1;
                return;
            case 155:
                eVar.I = eVar.k(j10);
                return;
            case 159:
                eVar.b(i10);
                eVar.u.O = (int) j10;
                return;
            case 176:
                eVar.b(i10);
                eVar.u.m = (int) j10;
                return;
            case 179:
                eVar.a(i10);
                eVar.C.c(eVar.k(j10));
                return;
            case 186:
                eVar.b(i10);
                eVar.u.n = (int) j10;
                return;
            case 215:
                eVar.b(i10);
                eVar.u.c = (int) j10;
                return;
            case 231:
                eVar.B = eVar.k(j10);
                return;
            case 238:
                eVar.P = (int) j10;
                return;
            case 241:
                if (eVar.E) {
                    return;
                }
                eVar.a(i10);
                eVar.D.c(j10);
                eVar.E = true;
                return;
            case 251:
                eVar.Q = true;
                return;
            case 16871:
                eVar.b(i10);
                eVar.u.g = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw t1.a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw t1.a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw t1.a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw t1.a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw t1.a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                eVar.x = j10 + eVar.q;
                return;
            case 21432:
                int i12 = (int) j10;
                eVar.b(i10);
                if (i12 == 0) {
                    eVar.u.w = 0;
                    return;
                }
                if (i12 == 1) {
                    eVar.u.w = 2;
                    return;
                } else if (i12 == 3) {
                    eVar.u.w = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    eVar.u.w = 3;
                    return;
                }
            case 21680:
                eVar.b(i10);
                eVar.u.o = (int) j10;
                return;
            case 21682:
                eVar.b(i10);
                eVar.u.q = (int) j10;
                return;
            case 21690:
                eVar.b(i10);
                eVar.u.p = (int) j10;
                return;
            case 21930:
                eVar.b(i10);
                eVar.u.U = j10 == 1;
                return;
            case 21998:
                eVar.b(i10);
                eVar.u.f = (int) j10;
                return;
            case 22186:
                eVar.b(i10);
                eVar.u.R = j10;
                return;
            case 22203:
                eVar.b(i10);
                eVar.u.S = j10;
                return;
            case 25188:
                eVar.b(i10);
                eVar.u.P = (int) j10;
                return;
            case 30114:
                eVar.R = j10;
                return;
            case 30321:
                eVar.b(i10);
                int i13 = (int) j10;
                if (i13 == 0) {
                    eVar.u.r = 0;
                    return;
                }
                if (i13 == 1) {
                    eVar.u.r = 1;
                    return;
                } else if (i13 == 2) {
                    eVar.u.r = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    eVar.u.r = 3;
                    return;
                }
            case 2352003:
                eVar.b(i10);
                eVar.u.e = (int) j10;
                return;
            case 2807729:
                eVar.r = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        eVar.b(i10);
                        int i14 = (int) j10;
                        if (i14 == 1) {
                            eVar.u.A = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            eVar.u.A = 1;
                            return;
                        }
                    case 21946:
                        eVar.b(i10);
                        int i15 = (int) j10;
                        String str = g5.b.f;
                        if (i15 != 1) {
                            if (i15 == 16) {
                                i11 = 6;
                            } else if (i15 == 18) {
                                i11 = 7;
                            } else if (i15 != 6 && i15 != 7) {
                                i11 = -1;
                            }
                        }
                        if (i11 != -1) {
                            eVar.u.z = i11;
                            return;
                        }
                        return;
                    case 21947:
                        eVar.b(i10);
                        eVar.u.x = true;
                        int a2 = g5.b.a((int) j10);
                        if (a2 != -1) {
                            eVar.u.y = a2;
                            return;
                        }
                        return;
                    case 21948:
                        eVar.b(i10);
                        eVar.u.B = (int) j10;
                        return;
                    case 21949:
                        eVar.b(i10);
                        eVar.u.C = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // th.g0
    public j9 D() {
        switch (this.a) {
            case 23:
                return (x) this.b;
            default:
                return (m4) this.b;
        }
    }

    @Override // rf.j1
    public void E(ArrayList arrayList) {
        switch (this.a) {
            case 19:
                v0 v0Var = (v0) this.b;
                String str = v0Var.V;
                if (str != null) {
                    v0Var.U(str, v0Var.Y, v0Var.Z, v0Var.X, v0Var.W);
                    break;
                }
                break;
        }
    }

    @Override // th.g0
    public th.a G() {
        switch (this.a) {
            case 23:
                return ((x) this.b).a;
            default:
                return ((m4) this.b).a;
        }
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.b).T0(i10, z10, 0, true, 0L);
    }

    @Override // r0.o
    public m1 I0(View view, m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        yl0 yl0Var = (yl0) this.b;
        yl0Var.v.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        yl0Var.s.requestLayout();
        return m1.b;
    }

    @Override // th.n3
    public void J(th.a aVar) {
        x1 x1Var = (x1) this.b;
        if (aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(x1Var)) {
            ni niVar = new ni(x1Var.getParentActivity(), x1Var, false, false, false, x1Var.getResourceProvider());
            niVar.V1 = new ab.b(23);
            niVar.L = true;
            niVar.t1.setVisibility(8);
            niVar.p2 = new w1(x1Var, aVar, niVar, 6);
            niVar.r1();
            niVar.show();
        }
    }

    @Override // th.g0
    public boolean M() {
        switch (this.a) {
            case 23:
                x xVar = (x) this.b;
                j3 j3Var = xVar.K;
                if (j3Var != null) {
                    th.a aVar = xVar.a;
                    if (j3Var.a.S4()) {
                    }
                }
                break;
            default:
                m4 m4Var = (m4) this.b;
                i3 i3Var = m4Var.J;
                if (i3Var != null) {
                    th.a aVar2 = m4Var.a;
                    if (i3Var.a.S4()) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // th.n3
    public void Q0(m3 m3Var, View view) {
        x1 x1Var = (x1) this.b;
        j70 H = j70.H(x1Var, view);
        H.Q = true;
        x1Var.t0 = b4.c(H, x1Var, x1Var.getParentActivity(), x1Var.getResourceProvider(), m3Var, false);
    }

    @Override // th.n3
    public void U0(o3 o3Var, View view) {
        x1 x1Var = (x1) this.b;
        j70 H = j70.H(x1Var, view);
        H.Q = true;
        x1Var.getParentActivity();
        x1Var.getResourceProvider();
        x1Var.t0 = b4.b(H, x1Var, o3Var, false);
    }

    @Override // th.n3
    public void W(int i10) {
        ((x1) this.b).o0(74, i10);
    }

    @Override // androidx.lifecycle.s0
    public p0 Z0(Class cls, v1.b bVar) {
        m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.b) {
            if (cVar.a.equals(cls)) {
                m0Var = new m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // qh.n0
    public void a(long j10) {
        ((q) this.b).presentFragment(tn.R9(j10));
    }

    @Override // th.n3
    public void a1(t5 t5Var, String str) {
        x1 x1Var = (x1) this.b;
        if (x1Var.v0 == null) {
            x1Var.v0 = new s3(new f1(this, 5), x1Var.getResourceProvider());
        }
        x1Var.v0.f(t5Var, str);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        r rVar = new r(0, (TaskCompletionSource) obj2);
        s5.i iVar = (s5.i) ((t) obj).u();
        String[] strArr = (String[]) this.b;
        Parcel M0 = iVar.M0();
        u.d(M0, rVar);
        M0.writeStringArray(strArr);
        iVar.R0(M0, 5);
    }

    @Override // th.n3
    public void b0() {
        x1 x1Var = (x1) this.b;
        d3 d3Var = x1Var.L.j3;
        x1Var.x0((d3Var != null && d3Var.y() && x1Var.L.C4()) ? 1 : 0, true);
        x1Var.y0();
        x1Var.w0();
    }

    @Override // s5.o
    public void c(String str, long j10, long j11, long j12) {
        n nVar = (n) this.b;
        try {
            nVar.a(new q5.m(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e10) {
            s5.b bVar = q5.h.k;
            Log.e(bVar.a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e10);
        }
        Iterator it = nVar.q.i.iterator();
        while (it.hasNext()) {
            ((q5.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override // qh.n0
    public void close() {
        ((q) this.b).finishFragment();
    }

    @Override // th.n3
    public boolean d(float f9) {
        boolean z10;
        x1 x1Var = (x1) this.b;
        FrameLayout frameLayout = x1Var.r0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f9 >= r3[1]) {
                z10 = true;
                x1.Z(x1Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        x1.Z(x1Var, z10, true);
        return z10;
    }

    @Override // th.g0
    public void e(d1 d1Var) {
        switch (this.a) {
            case 23:
                j3 j3Var = ((x) this.b).K;
                if (j3Var != null) {
                    p3 p3Var = j3Var.a;
                    p3.M1(p3Var, d1Var);
                    p3Var.d3.U(d1Var, true);
                    break;
                }
                break;
            default:
                i3 i3Var = ((m4) this.b).J;
                if (i3Var != null) {
                    p3 p3Var2 = i3Var.a;
                    p3.M1(p3Var2, d1Var);
                    p3Var2.d3.U(d1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // rf.j1
    public void f(int i10) {
        switch (this.a) {
            case 19:
                ((v0) this.b).l();
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t1(this, 17));
                break;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public void g(com.google.android.exoplayer2.upstream.n0 n0Var, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) n0Var;
        o4.h hVar = (o4.h) this.b;
        long j12 = t0Var.a;
        Uri uri = t0Var.d.c;
        p pVar = new p();
        hVar.n.getClass();
        hVar.q.d(pVar, t0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // androidx.lifecycle.s0
    public p0 h(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // th.g0
    public void h0(int i10, int i11) {
        switch (this.a) {
            case 23:
                x xVar = (x) this.b;
                j3 j3Var = xVar.K;
                if (j3Var != null) {
                    th.a aVar = xVar.a;
                    b2 b2Var = j3Var.a.F3;
                    if (b2Var != null) {
                        b2Var.f(i10, i11);
                        break;
                    }
                }
                break;
            default:
                m4 m4Var = (m4) this.b;
                i3 i3Var = m4Var.J;
                if (i3Var != null) {
                    th.a aVar2 = m4Var.a;
                    b2 b2Var2 = i3Var.a.F3;
                    if (b2Var2 != null) {
                        b2Var2.f(i10, i11);
                        break;
                    }
                }
                break;
        }
    }

    @Override // th.g0
    public void i() {
        switch (this.a) {
            case 23:
                x xVar = (x) this.b;
                j3 j3Var = xVar.K;
                if (j3Var != null) {
                    p3.P1(j3Var.a, xVar.a);
                    break;
                }
                break;
            default:
                m4 m4Var = (m4) this.b;
                i3 i3Var = m4Var.J;
                if (i3Var != null) {
                    p3.P1(i3Var.a, m4Var.a);
                    break;
                }
                break;
        }
    }

    @Override // th.g0
    public void i0() {
        switch (this.a) {
            case 23:
                x xVar = (x) this.b;
                j3 j3Var = xVar.K;
                if (j3Var != null) {
                    th.a aVar = xVar.a;
                    p3 p3Var = j3Var.a;
                    b2 b2Var = p3Var.F3;
                    if (b2Var != null) {
                        b2Var.g();
                    }
                    p3Var.d3.onContentChanged();
                    break;
                }
                break;
            default:
                m4 m4Var = (m4) this.b;
                i3 i3Var = m4Var.J;
                if (i3Var != null) {
                    th.a aVar2 = m4Var.a;
                    p3 p3Var2 = i3Var.a;
                    b2 b2Var2 = p3Var2.F3;
                    if (b2Var2 != null) {
                        b2Var2.g();
                    }
                    p3Var2.d3.onContentChanged();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.m61
    public void invalidate() {
        switch (this.a) {
            case 4:
                ((s1) ((org.telegram.ui.Cells.f1) this.b).b).invalidate();
                break;
            default:
                ((bg0) this.b).h.invalidate();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    @Override // com.google.android.exoplayer2.upstream.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0 j(com.google.android.exoplayer2.upstream.n0 n0Var, IOException iOException, int i10) {
        long j10;
        t0 t0Var = (t0) n0Var;
        o4.h hVar = (o4.h) this.b;
        long j11 = t0Var.a;
        Uri uri = t0Var.d.c;
        p pVar = new p();
        int i11 = t0Var.c;
        hVar.n.getClass();
        if (!(iOException instanceof t1) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof e0) && !(iOException instanceof com.google.android.exoplayer2.upstream.p0)) {
            int i12 = com.google.android.exoplayer2.upstream.n.b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof com.google.android.exoplayer2.upstream.n) || ((com.google.android.exoplayer2.upstream.n) th2).a != 2008) {
                }
            }
            j10 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            k0 k0Var = j10 != -9223372036854775807L ? q0.f : new k0(0, j10, false);
            hVar.q.i(pVar, i11, iOException, !k0Var.a());
            return k0Var;
        }
        j10 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
        }
        hVar.q.i(pVar, i11, iOException, !k0Var.a());
        return k0Var;
    }

    @Override // qh.n0
    public void k() {
        q qVar = (q) this.b;
        vd.a aVar = qVar.a;
        o0 o0Var = qVar.v;
        aVar.a(o0Var.n && o0Var.l == 0, true);
        qVar.d.U2.N(true);
    }

    @Override // th.n3
    public void k0() {
        x1 x1Var = (x1) this.b;
        x1Var.E0 = x1Var.G0;
        x1.Z(x1Var, false, false);
        x1Var.x0(2, true);
    }

    @Override // androidx.activity.result.b
    public void l(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.b;
        int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.I;
        if (resultReceiver != null) {
            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
        }
        int i11 = aVar.a;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // th.g0
    public void l0() {
        switch (this.a) {
            case 23:
                x xVar = (x) this.b;
                j3 j3Var = xVar.K;
                if (j3Var != null) {
                    th.a aVar = xVar.a;
                    p3.O1(j3Var.a);
                    break;
                }
                break;
            default:
                m4 m4Var = (m4) this.b;
                i3 i3Var = m4Var.J;
                if (i3Var != null) {
                    th.a aVar2 = m4Var.a;
                    p3.O1(i3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // th.n3
    public void l1() {
        x1 x1Var = (x1) this.b;
        x1.Z(x1Var, false, true);
        int i10 = x1Var.E0;
        x1Var.x0(i10 != 2 ? i10 : 0, true);
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public void m(com.google.android.exoplayer2.upstream.n0 n0Var, long j10, long j11) {
        t0 t0Var = (t0) n0Var;
        o4.h hVar = (o4.h) this.b;
        long j12 = t0Var.a;
        Uri uri = t0Var.d.c;
        p pVar = new p();
        hVar.n.getClass();
        hVar.q.f(pVar, t0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        p4.c cVar = (p4.c) t0Var.f;
        p4.c cVar2 = hVar.H;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j13 = cVar.b(0).b;
        int i10 = 0;
        while (i10 < size && hVar.H.b(i10).b < j13) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.m.size()) {
                f5.a.K("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = hVar.N;
                if (j14 == -9223372036854775807L || cVar.h * 1000 > j14) {
                    hVar.M = 0;
                } else {
                    f5.a.K("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + hVar.N);
                }
            }
            int i11 = hVar.M;
            hVar.M = i11 + 1;
            if (i11 < hVar.n.B(t0Var.c)) {
                hVar.D.postDelayed(hVar.v, Math.min((hVar.M - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000));
                return;
            } else {
                hVar.C = new z4();
                return;
            }
        }
        hVar.H = cVar;
        hVar.I = cVar.d & hVar.I;
        hVar.J = j10 - j11;
        hVar.K = j10;
        synchronized (hVar.t) {
            try {
                if (t0Var.b.a == hVar.F) {
                    Uri uri2 = hVar.H.k;
                    if (uri2 == null) {
                        uri2 = t0Var.d.c;
                    }
                    hVar.F = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (size != 0) {
            hVar.O += i10;
            hVar.u(true);
            return;
        }
        p4.c cVar3 = hVar.H;
        if (!cVar3.d) {
            hVar.u(true);
            return;
        }
        d9.c cVar4 = cVar3.i;
        if (cVar4 == null) {
            hVar.t();
            return;
        }
        String str = cVar4.b;
        if (d0.a(str, "urn:mpeg:dash:utc:direct:2014") || d0.a(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                hVar.L = d0.K(cVar4.c) - hVar.K;
                hVar.u(true);
                return;
            } catch (t1 e10) {
                f5.a.p("DashMediaSource", "Failed to resolve time offset.", e10);
                hVar.u(true);
                return;
            }
        }
        if (d0.a(str, "urn:mpeg:dash:utc:http-iso:2014") || d0.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            t0 t0Var2 = new t0(hVar.z, Uri.parse(cVar4.c), 5, new o4.f());
            hVar.A.f(t0Var2, new o4.d(hVar), 1);
            hVar.q.k(new p(t0Var2.b), t0Var2.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (d0.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || d0.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            t0 t0Var3 = new t0(hVar.z, Uri.parse(cVar4.c), 5, new bb.a(16));
            hVar.A.f(t0Var3, new o4.d(hVar), 1);
            hVar.q.k(new p(t0Var3.b), t0Var3.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (d0.a(str, "urn:mpeg:dash:utc:ntp:2014") || d0.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
            hVar.t();
        } else {
            f5.a.p("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
            hVar.u(true);
        }
    }

    @Override // org.telegram.ui.Components.ha0
    public Paint.FontMetricsInt n() {
        return ((ni) this.b).A0.getEditText().getPaint().getFontMetricsInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[LOOP:0: B:16:0x0047->B:18:0x004d, LOOP_END] */
    @Override // s5.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        Iterator it;
        n nVar = (n) this.b;
        try {
            i11 = i10;
            try {
                Status status = new Status(i11, null, null, null);
                Object obj2 = true == (obj instanceof s5.m) ? obj : null;
                if (obj2 != null) {
                }
                if (obj2 != null) {
                }
                nVar.a(new q5.m(status, 2));
            } catch (IllegalStateException e10) {
                e = e10;
                s5.b bVar = q5.h.k;
                Log.e(bVar.a, bVar.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = nVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e11) {
            e = e11;
            i11 = i10;
        }
        it = nVar.q.i.iterator();
        while (it.hasNext()) {
            ((q5.g) it.next()).h(str, j10, i11, j11, j12);
            i11 = i10;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        jd.m mVar = (jd.m) this.b;
        Exception exception = task.getException();
        if (exception != null) {
            mVar.resumeWith(c7.a(exception));
        } else if (task.isCanceled()) {
            mVar.n(null);
        } else {
            mVar.resumeWith(task.getResult());
        }
    }

    @Override // th.n3
    public void onContentChanged() {
        x1 x1Var = (x1) this.b;
        if (x1Var.u0 != null) {
            boolean m32 = x1Var.L.m3();
            x1Var.H0 = m32;
            x1Var.u0.h(m32);
            x1Var.u0.invalidate();
        }
        x1Var.C0();
        Runnable runnable = x1Var.I0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        e2 e2Var;
        e1 b10;
        p5.a aVar = (p5.a) this.b;
        Bundle bundle = (Bundle) obj;
        if (com.google.android.gms.internal.cast.p0.j) {
            Context context = aVar.a;
            s5.s sVar = aVar.f;
            com.google.android.gms.internal.cast.p0 p0Var = new com.google.android.gms.internal.cast.p0(context, sVar, aVar.c, aVar.j, aVar.g);
            int i10 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
            boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i10 == 0) {
                if (!z10) {
                    return;
                }
                i10 = 0;
                z10 = true;
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String k9 = u3.c.k(packageName, ".client_cast_analytics_data");
            p0Var.h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            y2.q.b(context);
            p0Var.g = y2.q.a().c(w2.a.e).a("CAST_SENDER_SDK", new v2.c("proto"), a0.a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                p0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(k9, 0);
            if (i10 != 0) {
                v b11 = w.b();
                b11.c = new d6(sVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, 22);
                b11.d = new w5.c[]{y.c};
                b11.b = false;
                b11.a = 8426;
                Task e10 = sVar.e(0, b11.b());
                f5.u uVar = new f5.u();
                uVar.b = p0Var;
                uVar.c = packageName;
                uVar.a = i10;
                uVar.d = sharedPreferences;
                e10.addOnSuccessListener(uVar);
            }
            if (z10) {
                z5.l.h(sharedPreferences);
                s5.b bVar = e2.i;
                synchronized (e2.class) {
                    try {
                        if (e2.k == null) {
                            e2.k = new e2(sharedPreferences, p0Var, packageName);
                        }
                        e2Var = e2.k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = e2Var.c;
                SharedPreferences sharedPreferences2 = e2Var.b;
                HashSet hashSet = e2Var.f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = e2Var.g;
                hashSet2.clear();
                e2Var.h = 0L;
                String str2 = e2.j;
                if (str2.equals(string) && str.equals(string2)) {
                    e2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j10 = sharedPreferences2.getLong(str3, 0L);
                            if (j10 != 0 && currentTimeMillis - j10 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                e1 b12 = e2.b(str3.substring(41));
                                if (b12 != null) {
                                    hashSet2.add(b12);
                                    hashSet.add(b12);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = e2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    e2Var.c(hashSet3);
                    z5.l.h(e2Var.e);
                    z5.l.h(e2Var.d);
                    e2Var.e.post(e2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    e2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                e2.a(e1.h);
            }
        }
    }

    @Override // pa.m
    public Object p2() {
        Constructor constructor = (Constructor) this.b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e10) {
            r7 r7Var = sa.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + sa.c.b(constructor) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + sa.c.b(constructor) + "' with no args", e12.getCause());
        }
    }

    @Override // rf.j1
    public /* synthetic */ a0.h q() {
        switch (this.a) {
        }
        return null;
    }

    @Override // th.n3
    public j70 q1(View view) {
        return j70.H((x1) this.b, view);
    }

    @Override // org.telegram.ui.Components.ha0
    public void r(int i10, int i11, CharSequence charSequence, boolean z10) {
        ni niVar = (ni) this.b;
        if (niVar.m1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(niVar.m1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, niVar.m1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            niVar.m1().setText(spannableStringBuilder);
            niVar.m1().setSelection(i10 + charSequence.length());
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // th.n3
    public void s1() {
        x1 x1Var = (x1) this.b;
        x1Var.z0();
        x1Var.C0();
    }

    @Override // rf.j1
    public /* synthetic */ a0.h t() {
        switch (this.a) {
        }
        return null;
    }

    public void u(int i10, int i11, o3.l lVar) {
        char c3;
        char c6;
        long j10;
        int i12;
        int i13;
        int i14;
        int i15;
        u3.e eVar = (u3.e) this.b;
        u3.f fVar = eVar.b;
        SparseArray sparseArray = eVar.c;
        f5.w wVar = eVar.i;
        f5.w wVar2 = eVar.g;
        int i16 = 1;
        int i17 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (eVar.G != 2) {
                    return;
                }
                u3.d dVar = (u3.d) sparseArray.get(eVar.M);
                int i18 = eVar.P;
                f5.w wVar3 = eVar.n;
                if (i18 != 4 || !"V_VP9".equals(dVar.b)) {
                    lVar.t(i11);
                    return;
                } else {
                    wVar3.z(i11);
                    lVar.readFully(wVar3.a, 0, i11);
                    return;
                }
            }
            if (i10 == 16877) {
                eVar.b(i10);
                u3.d dVar2 = eVar.u;
                int i19 = dVar2.g;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    lVar.t(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                dVar2.N = bArr;
                lVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 16981) {
                eVar.b(i10);
                byte[] bArr2 = new byte[i11];
                eVar.u.i = bArr2;
                lVar.readFully(bArr2, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                lVar.readFully(bArr3, 0, i11);
                eVar.b(i10);
                eVar.u.j = new o3.v(1, 0, 0, bArr3);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(wVar.a, (byte) 0);
                lVar.readFully(wVar.a, 4 - i11, i11);
                wVar.C(0);
                eVar.w = (int) wVar.s();
                return;
            }
            if (i10 == 25506) {
                eVar.b(i10);
                byte[] bArr4 = new byte[i11];
                eVar.u.k = bArr4;
                lVar.readFully(bArr4, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw t1.a("Unexpected id: " + i10, null);
            }
            eVar.b(i10);
            byte[] bArr5 = new byte[i11];
            eVar.u.v = bArr5;
            lVar.readFully(bArr5, 0, i11);
            return;
        }
        if (eVar.G == 0) {
            eVar.M = (int) fVar.b(lVar, false, true, 8);
            eVar.N = fVar.c;
            eVar.I = -9223372036854775807L;
            eVar.G = 1;
            wVar2.z(0);
        }
        u3.d dVar3 = (u3.d) sparseArray.get(eVar.M);
        if (dVar3 == null) {
            lVar.t(i11 - eVar.N);
            eVar.G = 0;
            return;
        }
        dVar3.X.getClass();
        if (eVar.G == 1) {
            eVar.h(lVar, 3);
            int i20 = (wVar2.a[2] & 6) >> 1;
            byte b10 = 255;
            if (i20 == 0) {
                eVar.K = 1;
                int[] iArr = eVar.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                eVar.L = iArr;
                iArr[0] = (i11 - eVar.N) - 3;
            } else {
                eVar.h(lVar, 4);
                int i21 = (wVar2.a[3] & 255) + 1;
                eVar.K = i21;
                int[] iArr2 = eVar.L;
                if (iArr2 == null) {
                    iArr2 = new int[i21];
                } else if (iArr2.length < i21) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i21)];
                }
                eVar.L = iArr2;
                if (i20 == 2) {
                    int i22 = (i11 - eVar.N) - 4;
                    int i23 = eVar.K;
                    Arrays.fill(iArr2, 0, i23, i22 / i23);
                } else {
                    if (i20 != 1) {
                        if (i20 != 3) {
                            throw t1.a("Unexpected lacing value: " + i20, null);
                        }
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 4;
                        while (true) {
                            int i27 = eVar.K - i16;
                            if (i24 >= i27) {
                                c3 = 1;
                                c6 = 0;
                                eVar.L[i27] = ((i11 - eVar.N) - i26) - i25;
                                break;
                            }
                            eVar.L[i24] = i17;
                            int i28 = i26 + 1;
                            eVar.h(lVar, i28);
                            if (wVar2.a[i26] == 0) {
                                throw t1.a("No valid varint length mask found", null);
                            }
                            int i29 = 0;
                            while (true) {
                                if (i29 >= 8) {
                                    j10 = 0;
                                    i12 = i28;
                                    break;
                                }
                                int i30 = 1 << (7 - i29);
                                if ((wVar2.a[i26] & i30) != 0) {
                                    i12 = i28 + i29;
                                    eVar.h(lVar, i12);
                                    j10 = wVar2.a[i26] & b10 & (~i30);
                                    while (i28 < i12) {
                                        j10 = (j10 << 8) | (wVar2.a[i28] & b10);
                                        i28++;
                                        b10 = 255;
                                    }
                                    if (i24 > 0) {
                                        j10 -= (1 << ((i29 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i29++;
                                    b10 = 255;
                                }
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                break;
                            }
                            int i31 = (int) j10;
                            int[] iArr3 = eVar.L;
                            if (i24 != 0) {
                                i31 += iArr3[i24 - 1];
                            }
                            iArr3[i24] = i31;
                            i25 += i31;
                            i24++;
                            i26 = i12;
                            b10 = 255;
                            i16 = 1;
                            i17 = 0;
                        }
                        throw t1.a("EBML lacing sample size out of range.", null);
                    }
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 4;
                    while (true) {
                        i13 = eVar.K - 1;
                        if (i32 >= i13) {
                            break;
                        }
                        eVar.L[i32] = 0;
                        while (true) {
                            i14 = i34 + 1;
                            eVar.h(lVar, i14);
                            int i35 = wVar2.a[i34] & 255;
                            int[] iArr4 = eVar.L;
                            i15 = iArr4[i32] + i35;
                            iArr4[i32] = i15;
                            if (i35 != 255) {
                                break;
                            } else {
                                i34 = i14;
                            }
                        }
                        i33 += i15;
                        i32++;
                        i34 = i14;
                    }
                    eVar.L[i13] = ((i11 - eVar.N) - i34) - i33;
                }
            }
            c3 = 1;
            c6 = 0;
            byte[] bArr6 = wVar2.a;
            eVar.H = eVar.k((bArr6[c3] & 255) | (bArr6[c6] << 8)) + eVar.B;
            eVar.O = (dVar3.d == 2 || (i10 == 163 && (wVar2.a[2] & 128) == 128)) ? 1 : 0;
            eVar.G = 2;
            eVar.J = 0;
        }
        if (i10 == 163) {
            while (true) {
                int i36 = eVar.J;
                if (i36 >= eVar.K) {
                    eVar.G = 0;
                    return;
                } else {
                    eVar.c(dVar3, ((eVar.J * dVar3.e) / MediaDataController.MAX_STYLE_RUNS_COUNT) + eVar.H, eVar.O, eVar.l(lVar, dVar3, eVar.L[i36], false), 0);
                    eVar.J++;
                }
            }
        } else {
            while (true) {
                int i37 = eVar.J;
                if (i37 >= eVar.K) {
                    return;
                }
                int[] iArr5 = eVar.L;
                iArr5[i37] = eVar.l(lVar, dVar3, iArr5[i37], true);
                eVar.J++;
            }
        }
    }

    public o5.o v() {
        o5.o oVar = (o5.o) this.b;
        if (oVar.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(oVar.e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(oVar.f) || oVar.f < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
        return oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x0346, code lost:
    
        throw mb.c.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a2 A[LOOP:21: B:147:0x0224->B:177:0x03a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0371 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nb.d w(ab.m mVar) {
        int e10;
        rb.d dVar;
        rb.b bVar;
        int i10;
        int i11;
        nb.c cVar;
        int e11;
        rb.e o10 = mVar.o();
        rb.b bVar2 = mVar.n().a;
        rb.c n10 = mVar.n();
        rb.e o11 = mVar.o();
        int i12 = m1.j.c(8)[n10.b];
        nb.b bVar3 = (nb.b) mVar.b;
        int i13 = bVar3.b;
        for (int i14 = 0; i14 < i13; i14++) {
            for (int i15 = 0; i15 < i13; i15++) {
                if (th.a(i12, i14, i15)) {
                    bVar3.a(i15, i14);
                }
            }
        }
        int i16 = o11.a * 4;
        int i17 = i16 + 17;
        int i18 = o11.d;
        nb.b bVar4 = new nb.b(i17, i17);
        bVar4.c(0, 0, 9, 9);
        int i19 = i16 + 9;
        bVar4.c(i19, 0, 8, 9);
        bVar4.c(0, i19, 9, 8);
        int[] iArr = o11.b;
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
        if (o11.a > 6) {
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
        boolean z10 = true;
        while (i26 > 0) {
            if (i26 == i23) {
                i26--;
            }
            for (int i30 = 0; i30 < i13; i30++) {
                int i31 = z10 ? i25 - i30 : i30;
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
            z10 = !z10;
            i26 -= 2;
            i23 = 6;
        }
        if (i27 != i18) {
            throw mb.c.a();
        }
        if (i18 != o10.d) {
            throw new IllegalArgumentException();
        }
        p2.u uVar = o10.c[bVar2.ordinal()];
        a5.e[] eVarArr = (a5.e[]) uVar.c;
        int i34 = uVar.b;
        int i35 = 0;
        for (a5.e eVar : eVarArr) {
            i35 += eVar.a;
        }
        h9.l[] lVarArr = new h9.l[i35];
        int i36 = 0;
        for (a5.e eVar2 : eVarArr) {
            int i37 = 0;
            while (i37 < eVar2.a) {
                int i38 = eVar2.b;
                lVarArr[i36] = new h9.l(i38, new byte[i34 + i38]);
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
        boolean z11 = false;
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
            h9.l lVar = lVarArr[i52];
            byte[] bArr3 = lVar.b;
            int i54 = lVar.a;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i55 = 0; i55 < length4; i55++) {
                iArr2[i55] = bArr3[i55] & 255;
            }
            try {
                int h = ((o4.g) this.b).h(bArr3.length - i54, iArr2);
                for (int i56 = 0; i56 < i54; i56++) {
                    bArr3[i56] = (byte) iArr2[i56];
                }
                i51 += h;
                int i57 = i53;
                int i58 = 0;
                while (i58 < i54) {
                    bArr2[i57] = bArr3[i58];
                    i58++;
                    i57++;
                }
                i52++;
                i53 = i57;
            } catch (pb.c unused) {
                mb.a aVar = mb.a.c;
                if (mb.h.a) {
                    throw new mb.a();
                }
                throw mb.a.c;
            }
        }
        char[] cArr = rb.a.a;
        com.google.android.exoplayer2.upstream.w wVar = new com.google.android.exoplayer2.upstream.w(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int i59 = -1;
        int i60 = -1;
        boolean z12 = false;
        boolean z13 = false;
        nb.c cVar2 = null;
        while (true) {
            try {
                int d = wVar.d();
                rb.d dVar2 = rb.d.c;
                if (d < 4 || (e10 = wVar.e(4)) == 0) {
                    dVar = dVar2;
                } else if (e10 == 1) {
                    dVar = rb.d.d;
                } else if (e10 == 2) {
                    dVar = rb.d.e;
                } else if (e10 == 3) {
                    dVar = rb.d.f;
                } else if (e10 == 4) {
                    dVar = rb.d.h;
                } else if (e10 == 5) {
                    dVar = rb.d.s;
                } else if (e10 == 7) {
                    dVar = rb.d.n;
                } else if (e10 == 8) {
                    dVar = rb.d.r;
                } else if (e10 == 9) {
                    dVar = rb.d.v;
                } else {
                    if (e10 != 13) {
                        throw new IllegalArgumentException();
                    }
                    dVar = rb.d.w;
                }
                int ordinal = dVar.ordinal();
                if (ordinal != 0) {
                    bVar = bVar2;
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            i10 = i51;
                            i11 = 1;
                            int e12 = wVar.e(8);
                            if ((e12 & 128) == 0) {
                                e11 = e12 & 127;
                            } else if ((e12 & 192) == 128) {
                                e11 = ((e12 & 63) << 8) | wVar.e(8);
                            } else {
                                if ((e12 & 224) != 192) {
                                    throw mb.c.a();
                                }
                                e11 = ((e12 & 31) << 16) | wVar.e(16);
                            }
                            HashMap hashMap = nb.c.c;
                            if (e11 < 0 || e11 >= 900) {
                                break;
                            }
                            nb.c cVar3 = (nb.c) nb.c.c.get(Integer.valueOf(e11));
                            if (cVar3 == null) {
                                throw mb.c.a();
                            }
                            cVar = cVar3;
                        } else if (ordinal == 7) {
                            i10 = i51;
                            i11 = 1;
                            cVar = cVar2;
                            z12 = true;
                            z11 = true;
                        } else if (ordinal == 8) {
                            i10 = i51;
                            i11 = 1;
                            cVar = cVar2;
                            z12 = true;
                            z13 = true;
                        } else if (ordinal != 9) {
                            int e13 = wVar.e(dVar.a(o10));
                            int ordinal2 = dVar.ordinal();
                            i10 = i51;
                            if (ordinal2 == 1) {
                                rb.a.e(wVar, sb2, e13);
                            } else if (ordinal2 == 2) {
                                rb.a.a(wVar, sb2, e13, z12);
                            } else if (ordinal2 == 4) {
                                rb.a.b(wVar, sb2, e13, cVar2, arrayList);
                            } else {
                                if (ordinal2 != 6) {
                                    throw mb.c.a();
                                }
                                rb.a.d(wVar, sb2, e13);
                            }
                        } else {
                            i10 = i51;
                            int e14 = wVar.e(4);
                            int e15 = wVar.e(dVar.a(o10));
                            i11 = 1;
                            if (e14 == 1) {
                                rb.a.c(wVar, sb2, e15);
                            }
                        }
                        int i61 = i59;
                        if (dVar == dVar2) {
                            if (cVar != null) {
                                i11 = z11 ? 4 : z13 ? 6 : 2;
                            } else if (z11) {
                                i11 = 3;
                            } else if (z13) {
                                i11 = 5;
                            }
                            nb.d dVar3 = new nb.d(bArr2, sb2.toString(), arrayList.isEmpty() ? null : arrayList, bVar.toString(), i61, i60, i11);
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
                        if (wVar.d() < 16) {
                            throw mb.c.a();
                        }
                        i59 = wVar.e(8);
                        i60 = wVar.e(8);
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
                throw mb.c.a();
            }
        }
    }

    @Override // th.g0
    public k9 x() {
        switch (this.a) {
            case 23:
                j3 j3Var = ((x) this.b).K;
                if (j3Var != null) {
                    return j3Var.a.getTextSelectionHelper();
                }
                return null;
            default:
                i3 i3Var = ((m4) this.b).J;
                if (i3Var != null) {
                    return i3Var.a.getTextSelectionHelper();
                }
                return null;
        }
    }

    public String y(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            u9.d dVar = (u9.d) this.b;
            u9.e eVar = new u9.e(stringWriter, dVar.a, dVar.b, dVar.c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public /* synthetic */ a(s5.s sVar, String[] strArr) {
        this.a = 20;
        this.b = strArr;
    }

    public a(MediaInfo mediaInfo) {
        this.a = 3;
        o5.o oVar = new o5.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public a(JSONObject jSONObject) {
        this.a = 3;
        this.b = new o5.o(jSONObject);
    }

    public a(int i10) {
        this.a = i10;
        switch (i10) {
            case 8:
                break;
            case 18:
                this.b = new o4.g(pb.a.h, 11);
                break;
            default:
                this.b = new f5.w(10);
                break;
        }
    }

    public a(int i10, int i11, int[] iArr) {
        this.a = 5;
        u50[] u50VarArr = new u50[(iArr.length / 2) + 1];
        this.b = u50VarArr;
        u50 u50Var = new u50(i10, i11);
        int i12 = 0;
        u50VarArr[0] = u50Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((u50[]) this.b)[i13] = new u50(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public a(v1.c[] initializers) {
        this.a = 28;
        kotlin.jvm.internal.j.e(initializers, "initializers");
        this.b = initializers;
    }

    public a(UUID uuid, int i10, byte[] bArr) {
        this.a = 29;
        this.b = uuid;
    }

    @Override // th.n3
    public void G0() {
    }

    private final /* synthetic */ void H(ArrayList arrayList) {
    }

    @Override // th.n3
    public void K0(int i10) {
    }

    @Override // org.telegram.ui.Components.ha0
    public /* synthetic */ void s(String str) {
    }

    @Override // th.n3
    public void U(d1 d1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ha0
    public /* synthetic */ void b(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.ha0
    public /* synthetic */ void p(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}
