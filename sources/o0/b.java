package o0;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import com.google.android.exoplayer2.upstream.w;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.w6;
import j4.c1;
import j4.j1;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import n2.v;
import nh.j4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.m50;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.x90;
import org.telegram.ui.ni0;
import org.telegram.ui.rx;
import pf.h1;
import pf.i1;
import r0.m1;
import r0.o;
import r5.r;
import r5.t;
import rh.b2;
import rh.d1;
import rh.g5;
import rh.p;
import rh.p3;
import rh.w2;
import rh.x1;
import yf.r0;
import zf.v0;
import zf.v1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b implements a, c1, oa.m, b61, x4, x90, o, p5.a, i1, s, rh.c1, ud.b, v1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static float[] f(ArrayList arrayList) {
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
            arrayList2.add((PointF) i0.a.i(1, arrayList));
        }
        float f19 = ((PointF) arrayList2.get(0)).x;
        if (f19 > f11) {
            for (int i23 = (int) f19; i23 >= 0; i23--) {
                arrayList2.add(0, new PointF(i23, 0.0f));
            }
        }
        float f20 = ((PointF) i0.a.i(1, arrayList2)).x;
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

    public static b h(float f10, int i10) {
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f10);
        int i12 = (int) (point.y * f10);
        if (i11 == i12) {
            return new b(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new b(i11, i12, new int[]{i12, i11});
        }
        return (i10 == 1) == (i11 < i12) ? new b(i11, i12, new int[0]) : new b(i12, i11, new int[0]);
    }

    @Override // ud.b
    public void A(float f10, int i10) {
        ((ud.h) this.b).i(f10);
    }

    @Override // rh.c1
    public void B(int i10, int i11) {
        b2 b2Var;
        g5 g5Var = (g5) this.b;
        w2 w2Var = g5Var.A;
        if (w2Var == null || g5Var.a == null || (b2Var = w2Var.a.F3) == null) {
            return;
        }
        b2Var.f(i10, i11);
    }

    @Override // pf.i1
    public boolean D0(int i10) {
        switch (this.a) {
            case 12:
                return i10 == ((cn0) this.b).Z;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.x90
    public void H(int i10, int i11, CharSequence charSequence, boolean z10) {
        gi giVar = (gi) this.b;
        if (giVar.m1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(giVar.m1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, giVar.m1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            giVar.m1().setText(spannableStringBuilder);
            giVar.m1().setSelection(i10 + charSequence.length());
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 5:
                ((ChatActivityEnterView) this.b).T0(i10, z10, 0, true, 0L);
                break;
            case 16:
                ((p) this.b).I(i10, z10, i11, false, 0L);
                p pVar = (p) this.b;
                ni0 ni0Var = pVar.K;
                if (ni0Var != null) {
                    ni0Var.i();
                    pVar.K = null;
                    break;
                }
                break;
            default:
                ((x1) this.b).s0(i10, i11, z10);
                break;
        }
    }

    @Override // r0.o
    public m1 I0(View view, m1 m1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ol0 ol0Var = (ol0) this.b;
        ol0Var.v.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        ol0Var.s.requestLayout();
        return m1.b;
    }

    @Override // pf.i1
    public /* synthetic */ a0.h J() {
        switch (this.a) {
        }
        return null;
    }

    @Override // rh.c1
    public void N1(d1 d1Var, int i10, int i11) {
        w2 w2Var;
        j9 textSelectionHelper;
        g5 g5Var = (g5) this.b;
        if (g5Var.C || i10 == i11 || (w2Var = g5Var.A) == null || (textSelectionHelper = w2Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.y() && textSelectionHelper.W == g5Var) {
            return;
        }
        g5Var.post(new j4(this, d1Var, i11, textSelectionHelper, i10, 6));
    }

    @Override // rh.c1
    public /* synthetic */ boolean T1(boolean z10) {
        return false;
    }

    @Override // pf.i1
    public void V0(ArrayList arrayList) {
        switch (this.a) {
            case 12:
                cn0 cn0Var = (cn0) this.b;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    cn0Var.F.add(((h1) arrayList.get(i10)).a);
                }
                rx rxVar = cn0Var.Q;
                if (rxVar != null) {
                    rxVar.d(cn0Var.z0 > 0, false);
                }
                cn0Var.l();
                break;
        }
    }

    @Override // j4.c1
    public void a(j4.d1 d1Var) {
        o4.l lVar = (o4.l) this.b;
        lVar.C.a(lVar);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        r rVar = new r(0, (TaskCompletionSource) obj2);
        r5.i iVar = (r5.i) ((t) obj).u();
        String[] strArr = (String[]) this.b;
        Parcel M0 = iVar.M0();
        com.google.android.gms.internal.cast.t.d(M0, rVar);
        M0.writeStringArray(strArr);
        iVar.R0(M0, 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x0346, code lost:
    
        throw lb.c.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a2 A[LOOP:21: B:147:0x0224->B:177:0x03a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0371 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mb.d b(com.google.firebase.messaging.l lVar) {
        int e9;
        qb.d dVar;
        qb.b bVar;
        int i10;
        int i11;
        mb.c cVar;
        int e10;
        qb.e o10 = lVar.o();
        qb.b bVar2 = lVar.n().a;
        qb.c n10 = lVar.n();
        qb.e o11 = lVar.o();
        int i12 = m1.j.c(8)[n10.b];
        mb.b bVar3 = (mb.b) lVar.b;
        int i13 = bVar3.b;
        for (int i14 = 0; i14 < i13; i14++) {
            for (int i15 = 0; i15 < i13; i15++) {
                if (pa.a(i12, i14, i15)) {
                    bVar3.a(i15, i14);
                }
            }
        }
        int i16 = o11.a * 4;
        int i17 = i16 + 17;
        int i18 = o11.d;
        mb.b bVar4 = new mb.b(i17, i17);
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
            throw lb.c.a();
        }
        if (i18 != o10.d) {
            throw new IllegalArgumentException();
        }
        v vVar = o10.c[bVar2.ordinal()];
        d5.p[] pVarArr = (d5.p[]) vVar.c;
        int i34 = vVar.b;
        int i35 = 0;
        for (d5.p pVar : pVarArr) {
            i35 += pVar.a;
        }
        g9.l[] lVarArr = new g9.l[i35];
        int i36 = 0;
        for (d5.p pVar2 : pVarArr) {
            int i37 = 0;
            while (i37 < pVar2.a) {
                int i38 = pVar2.b;
                lVarArr[i36] = new g9.l(i38, new byte[i34 + i38]);
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
            g9.l lVar2 = lVarArr[i52];
            byte[] bArr3 = lVar2.b;
            int i54 = lVar2.a;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i55 = 0; i55 < length4; i55++) {
                iArr2[i55] = bArr3[i55] & 255;
            }
            try {
                int K = ((n1.d) this.b).K(bArr3.length - i54, iArr2);
                for (int i56 = 0; i56 < i54; i56++) {
                    bArr3[i56] = (byte) iArr2[i56];
                }
                i51 += K;
                int i57 = i53;
                int i58 = 0;
                while (i58 < i54) {
                    bArr2[i57] = bArr3[i58];
                    i58++;
                    i57++;
                }
                i52++;
                i53 = i57;
            } catch (ob.c unused) {
                lb.a aVar = lb.a.c;
                if (lb.h.a) {
                    throw new lb.a();
                }
                throw lb.a.c;
            }
        }
        char[] cArr = qb.a.a;
        w wVar = new w(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int i59 = -1;
        int i60 = -1;
        boolean z12 = false;
        boolean z13 = false;
        mb.c cVar2 = null;
        while (true) {
            try {
                int d = wVar.d();
                qb.d dVar2 = qb.d.c;
                if (d < 4 || (e9 = wVar.e(4)) == 0) {
                    dVar = dVar2;
                } else if (e9 == 1) {
                    dVar = qb.d.d;
                } else if (e9 == 2) {
                    dVar = qb.d.e;
                } else if (e9 == 3) {
                    dVar = qb.d.f;
                } else if (e9 == 4) {
                    dVar = qb.d.h;
                } else if (e9 == 5) {
                    dVar = qb.d.s;
                } else if (e9 == 7) {
                    dVar = qb.d.n;
                } else if (e9 == 8) {
                    dVar = qb.d.r;
                } else if (e9 == 9) {
                    dVar = qb.d.v;
                } else {
                    if (e9 != 13) {
                        throw new IllegalArgumentException();
                    }
                    dVar = qb.d.w;
                }
                int ordinal = dVar.ordinal();
                if (ordinal != 0) {
                    bVar = bVar2;
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            i10 = i51;
                            i11 = 1;
                            int e11 = wVar.e(8);
                            if ((e11 & 128) == 0) {
                                e10 = e11 & 127;
                            } else if ((e11 & 192) == 128) {
                                e10 = ((e11 & 63) << 8) | wVar.e(8);
                            } else {
                                if ((e11 & 224) != 192) {
                                    throw lb.c.a();
                                }
                                e10 = ((e11 & 31) << 16) | wVar.e(16);
                            }
                            HashMap hashMap = mb.c.c;
                            if (e10 < 0 || e10 >= 900) {
                                break;
                            }
                            mb.c cVar3 = (mb.c) mb.c.c.get(Integer.valueOf(e10));
                            if (cVar3 == null) {
                                throw lb.c.a();
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
                            int e12 = wVar.e(dVar.a(o10));
                            int ordinal2 = dVar.ordinal();
                            i10 = i51;
                            if (ordinal2 == 1) {
                                qb.a.e(wVar, sb2, e12);
                            } else if (ordinal2 == 2) {
                                qb.a.a(wVar, sb2, e12, z12);
                            } else if (ordinal2 == 4) {
                                qb.a.b(wVar, sb2, e12, cVar2, arrayList);
                            } else {
                                if (ordinal2 != 6) {
                                    throw lb.c.a();
                                }
                                qb.a.d(wVar, sb2, e12);
                            }
                        } else {
                            i10 = i51;
                            int e13 = wVar.e(4);
                            int e14 = wVar.e(dVar.a(o10));
                            i11 = 1;
                            if (e13 == 1) {
                                qb.a.c(wVar, sb2, e14);
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
                            mb.d dVar3 = new mb.d(bArr2, sb2.toString(), arrayList.isEmpty() ? null : arrayList, bVar.toString(), i61, i60, i11);
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
                            throw lb.c.a();
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
                throw lb.c.a();
            }
        }
    }

    @Override // zf.v1
    public void c0(float f10) {
        v0 v0Var = (v0) this.b;
        r0.e(v0Var.a).k("-1", f10);
        v0Var.e.setBrushSize(f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                a9.b.g((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // o0.a
    public Cursor d(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e9) {
            Log.w("FontsProvider", "Unable to query the content provider", e9);
            return null;
        }
    }

    @Override // rh.c1
    public /* synthetic */ boolean f1(d1 d1Var) {
        return false;
    }

    @Override // oa.m
    public Object f2() {
        Constructor constructor = (Constructor) this.b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e9) {
            w6 w6Var = ra.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e9);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + ra.c.b(constructor) + "' with no args", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + ra.c.b(constructor) + "' with no args", e11.getCause());
        }
    }

    @Override // rh.c1
    public void g(d1 d1Var) {
        w2 w2Var = ((g5) this.b).A;
        if (w2Var != null) {
            p3 p3Var = w2Var.a;
            p3.M1(p3Var, d1Var);
            p3Var.d3.n0(d1Var, true);
        }
    }

    @Override // rh.c1
    public void g1(CharSequence charSequence) {
        w2 w2Var = ((g5) this.b).A;
        if (w2Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        w2Var.a.t4(charSequence.toString());
    }

    @Override // zf.v1
    public float get() {
        v0 v0Var = (v0) this.b;
        int i10 = v0Var.a;
        yf.m currentBrush = v0Var.e.getCurrentBrush();
        return currentBrush == null ? r0.e(i10).i : r0.e(i10).f("-1", currentBrush.d());
    }

    @Override // pf.i1
    public /* synthetic */ a0.h h0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // pf.i1
    public void i(int i10) {
        switch (this.a) {
            case 12:
                cn0 cn0Var = (cn0) this.b;
                cn0Var.z0--;
                cn0Var.a0 = i10;
                if (cn0Var.b0 != i10) {
                    cn0Var.s.clear();
                }
                if (cn0Var.c0 != i10) {
                    cn0Var.E.clear();
                }
                cn0Var.J = true;
                rx rxVar = cn0Var.Q;
                if (rxVar != null) {
                    rxVar.d(cn0Var.z0 > 0, true);
                }
                cn0Var.l();
                rx rxVar2 = cn0Var.Q;
                if (rxVar2 != null) {
                    rxVar2.c();
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new qf.b(this, 3));
                break;
        }
    }

    @Override // org.telegram.ui.Components.b61
    public void invalidate() {
        switch (this.a) {
            case 3:
                ((s1) ((f1) this.b).b).invalidate();
                break;
            default:
                ((sf0) this.b).h.invalidate();
                break;
        }
    }

    public void j() {
        o4.l lVar = (o4.l) this.b;
        int i10 = lVar.D - 1;
        lVar.D = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (o4.r rVar : lVar.F) {
            rVar.e();
            i11 += rVar.U.a;
        }
        j4.i1[] i1VarArr = new j4.i1[i11];
        int i12 = 0;
        for (o4.r rVar2 : lVar.F) {
            rVar2.e();
            int i13 = rVar2.U.a;
            int i14 = 0;
            while (i14 < i13) {
                rVar2.e();
                i1VarArr[i12] = rVar2.U.a(i14);
                i14++;
                i12++;
            }
        }
        lVar.E = new j1(i1VarArr);
        lVar.C.e(lVar);
    }

    public void l() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + p());
    }

    public void m(long j10) {
        long p6 = p();
        if (p6 != j10) {
            if (p6 != -1) {
                if (p6 != -2) {
                    return;
                } else {
                    p6 = -2;
                }
            }
            StringBuilder q6 = a9.p.q(j10, "expected non-string scope or scope ", " but found ");
            q6.append(p6);
            throw new IOException(q6.toString());
        }
    }

    @Override // rh.c1
    public boolean n() {
        g5 g5Var = (g5) this.b;
        w2 w2Var = g5Var.A;
        if (w2Var == null || g5Var.a == null) {
            return false;
        }
        return w2Var.a.S4();
    }

    @Override // ud.b
    public void o(int i10, float f10, float f11, ud.c cVar) {
        ((ud.h) this.b).i(f10);
    }

    @Override // rh.c1
    public /* synthetic */ boolean o0(d1 d1Var) {
        return false;
    }

    public long p() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // rh.c1
    public void r1(Editable editable) {
        g5 g5Var = (g5) this.b;
        rh.a aVar = g5Var.a;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = g5Var.r.A;
        }
        g5Var.u();
        w2 w2Var = g5Var.A;
        if (w2Var == null || g5Var.a == null) {
            return;
        }
        w2Var.a();
    }

    @Override // org.telegram.ui.Components.x90
    public Paint.FontMetricsInt u() {
        return ((gi) this.b).A0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // p5.a
    public void z0(Bitmap bitmap) {
        r5.b bVar = p5.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f10 = width;
            int height = bitmap.getHeight();
            int d = (int) a9.p.d(f10, 9.0f, 16.0f, 0.5f);
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

    public /* synthetic */ b(r5.s sVar, String[] strArr) {
        this.a = 15;
        this.b = strArr;
    }

    public b(int i10) {
        this.a = i10;
        switch (i10) {
            case 13:
                this.b = new n1.d(ob.a.h, 7);
                break;
            case 21:
                this.b = new ArrayDeque(16);
                break;
        }
    }

    public b(int i10, int i11, int[] iArr) {
        this.a = 4;
        m50[] m50VarArr = new m50[(iArr.length / 2) + 1];
        this.b = m50VarArr;
        m50 m50Var = new m50(i10, i11);
        int i12 = 0;
        m50VarArr[0] = m50Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((m50[]) this.b)[i13] = new m50(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public b(Context context, Uri uri) {
        this.a = 0;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // rh.c1
    public /* synthetic */ void K0() {
    }

    private final /* synthetic */ void k(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.x90
    public /* synthetic */ void K(String str) {
    }

    @Override // rh.c1
    public /* synthetic */ void w1(d1 d1Var) {
    }

    @Override // org.telegram.ui.Components.x90
    public /* synthetic */ void c(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.x90
    public /* synthetic */ void x(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}
