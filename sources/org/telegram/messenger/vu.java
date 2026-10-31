package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class vu extends qu {
    public static Paint b0;
    public final boolean W;
    public final ArrayList X;
    public final int[] Y;
    public final int Z;
    public ju a0;

    public vu(vv vvVar, Rect rect, int i10, TL_iv.pageBlockCollage pageblockcollage, boolean z10) {
        super(vvVar, rect, i10);
        float f7;
        int round;
        float f10;
        int i11;
        this.X = new ArrayList();
        this.W = z10;
        int i12 = 0;
        for (int i13 = 0; i13 < pageblockcollage.items.size(); i13++) {
            TL_iv.PageBlock pageBlock = pageblockcollage.items.get(i13);
            ju juVar = pageBlock instanceof TL_iv.pageBlockPhoto ? new ju(vvVar, (TL_iv.pageBlockPhoto) pageBlock) : pageBlock instanceof TL_iv.pageBlockVideo ? new ju(vvVar, (TL_iv.pageBlockVideo) pageBlock) : null;
            if (juVar != null) {
                this.X.add(juVar);
            }
        }
        int i14 = this.c;
        ArrayList arrayList = this.X;
        this.Y = new int[arrayList.size()];
        if (arrayList.isEmpty()) {
            this.Z = 0;
            return;
        }
        int i15 = 1;
        if (arrayList.size() == 1) {
            ju juVar2 = (ju) arrayList.get(0);
            float f11 = juVar2.E;
            f11 = f11 <= 0.0f ? 1.0f : f11;
            int i16 = (int) (i14 / f11);
            Point point = i0.q;
            int max = (int) (Math.max(point.x, point.y) * 0.55f);
            if (i16 > max) {
                i14 = (int) (max * f11);
                i16 = max;
            }
            juVar2.l(0, 0, i14, i16);
            this.Y[0] = 15;
            this.Z = i16;
            return;
        }
        float[] fArr = new float[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            fArr[i17] = ((ju) arrayList.get(i17)).E;
        }
        bj[] e = vv.e(fArr);
        int i18 = 0;
        for (bj bjVar : e) {
            i18 = Math.max(i18, (int) bjVar.d);
        }
        int i19 = i18 + 1;
        float[] fArr2 = new float[i19];
        for (bj bjVar2 : e) {
            byte b10 = bjVar2.c;
            if (b10 == bjVar2.d) {
                fArr2[b10] = Math.max(fArr2[b10], bjVar2.f);
            }
        }
        int length = e.length;
        int i20 = 0;
        while (i20 < length) {
            bj bjVar3 = e[i20];
            int i21 = bjVar3.c;
            byte b11 = bjVar3.d;
            if (i21 != b11) {
                int i22 = (b11 - i21) + i15;
                float[] fArr3 = bjVar3.m;
                if (fArr3 == null || fArr3.length != i22) {
                    i11 = i15;
                    float f12 = bjVar3.f / i22;
                    while (i21 <= bjVar3.d) {
                        fArr2[i21] = Math.max(fArr2[i21], f12);
                        i21++;
                    }
                    i20++;
                    i15 = i11;
                } else {
                    int i23 = 0;
                    while (i23 < i22) {
                        int i24 = bjVar3.c + i23;
                        fArr2[i24] = Math.max(fArr2[i24], bjVar3.m[i23]);
                        i23++;
                        i15 = i15;
                    }
                }
            }
            i11 = i15;
            i20++;
            i15 = i11;
        }
        Point point2 = i0.q;
        float max2 = Math.max(point2.x, point2.y) * 0.5f;
        int[] iArr = new int[i18 + 2];
        float f13 = 0.0f;
        for (int i25 = 0; i25 <= i18; i25++) {
            iArr[i25] = Math.round(f13 * max2);
            f13 += fArr2[i25];
        }
        iArr[i19] = Math.round(f13 * max2);
        int L = i0.L(this.a.D() ? 3.0f : 2.0f);
        int i26 = 0;
        while (i26 < e.length) {
            bj bjVar4 = e[i26];
            int i27 = iArr[bjVar4.c];
            int i28 = iArr[bjVar4.d + 1] - i27;
            float f14 = 1000.0f;
            if (bjVar4.j > 0) {
                round = Math.round((r12 * i14) / 1000.0f);
                f7 = 1000.0f;
            } else {
                int i29 = i12;
                int i30 = i29;
                while (i29 < e.length) {
                    if (i29 == i26) {
                        f10 = f14;
                    } else {
                        bj bjVar5 = e[i29];
                        f10 = f14;
                        byte b12 = bjVar5.c;
                        byte b13 = bjVar4.c;
                        if (b12 <= b13 && bjVar5.d >= b13 && bjVar5.a < bjVar4.a) {
                            i30 += bjVar5.e;
                        }
                    }
                    i29++;
                    f14 = f10;
                }
                f7 = f14;
                round = Math.round((i30 * i14) / f7);
            }
            int round2 = (bjVar4.l & 2) != 0 ? i14 - round : Math.round((bjVar4.e * i14) / f7) - L;
            if ((bjVar4.l & 8) == 0) {
                i28 -= L;
            }
            ((ju) arrayList.get(i26)).l(round, i27, Math.max(0, round2), Math.max(0, i28));
            this.Y[i26] = bjVar4.l;
            i26++;
            i12 = 0;
        }
        this.Z = iArr[i19];
    }

    @Override // org.telegram.messenger.qu
    public final void A(int i10, Rect rect) {
        if (i10 >= 0) {
            ArrayList arrayList = this.X;
            if (i10 >= arrayList.size()) {
                return;
            }
            ju juVar = (ju) arrayList.get(i10);
            Rect rect2 = this.b;
            int i11 = rect2.left + juVar.F;
            int i12 = ((int) this.M) + rect2.top + juVar.G;
            rect.set(i11, i12, juVar.H + i11, juVar.I + i12);
        }
    }

    @Override // org.telegram.messenger.qu
    public final int B() {
        return this.X.size();
    }

    @Override // org.telegram.messenger.qu
    public final CharSequence E(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.X;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return ((ju) arrayList.get(i10)).f();
    }

    @Override // org.telegram.messenger.qu
    public final int H() {
        return this.Z;
    }

    @Override // org.telegram.messenger.qu
    public final int I() {
        return J();
    }

    @Override // org.telegram.messenger.qu
    public final int J() {
        Rect rect = this.b;
        return rect.left + this.c + rect.right;
    }

    @Override // org.telegram.messenger.qu
    public final void S() {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ju juVar = (ju) obj;
            View view = this.V;
            juVar.S = view;
            ImageReceiver imageReceiver = juVar.c;
            imageReceiver.H0(view);
            imageReceiver.P();
            ImageReceiver imageReceiver2 = juVar.d;
            imageReceiver2.H0(view);
            imageReceiver2.P();
            juVar.d(view);
            juVar.m(view, false);
        }
    }

    @Override // org.telegram.messenger.qu
    public final boolean T(int i10, View view) {
        if (i10 < 0) {
            return false;
        }
        ArrayList arrayList = this.X;
        if (i10 >= arrayList.size()) {
            return false;
        }
        return ((ju) arrayList.get(i10)).j(view);
    }

    @Override // org.telegram.messenger.qu
    public final void U() {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ju juVar = (ju) obj;
            juVar.c.R();
            juVar.d.R();
            juVar.e = null;
            b6.q(juVar.a.a).v(juVar);
        }
    }

    @Override // org.telegram.messenger.qu
    public final void V(Canvas canvas) {
        float f7;
        vu vuVar = this;
        boolean z10 = true;
        if (b0 == null) {
            Paint paint = new Paint(1);
            b0 = paint;
            paint.setColor(251658240);
        }
        boolean Q = vuVar.Q();
        int L = i0.L(2.0f);
        vv vvVar = vuVar.a;
        int i10 = (Q || vvVar.D()) ? 0 : vvVar.S - L;
        int i11 = (Q || vvVar.D()) ? 0 : vvVar.T - L;
        int i12 = vuVar.c;
        float f10 = (i12 <= 0 || (i10 <= 0 && i11 <= 0)) ? 1.0f : ((i12 + i10) + i11) / i12;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = vuVar.X;
            if (i13 >= arrayList.size()) {
                return;
            }
            ju juVar = (ju) arrayList.get(i13);
            int i14 = juVar.F;
            ImageReceiver imageReceiver = juVar.c;
            int round = Math.round(i14 * f10) - i10;
            int round2 = Math.round(juVar.H * f10);
            int[] iArr = vuVar.Y;
            int i15 = (iArr == null || i13 >= iArr.length) ? 0 : iArr[i13];
            boolean z11 = (i15 & 4) != 0 ? z10 : false;
            boolean z12 = (i15 & 8) != 0 ? z10 : false;
            boolean z13 = (i15 & 1) != 0 ? z10 : false;
            boolean z14 = (i15 & 2) != 0 ? z10 : false;
            if (Q) {
                int L2 = i0.L(8.0f);
                imageReceiver.K0((z11 && z13) ? L2 : 0, (z11 && z14) ? L2 : 0, (z12 && z14) ? L2 : 0, (z12 && z13) ? L2 : 0);
                f7 = 1.0f;
            } else {
                int i16 = tz.Y0;
                f7 = 1.0f;
                int L3 = i16 > 2 ? i0.L(i16 - 2) : i0.L(i16);
                int min = Math.min(i0.L(3.0f), L3);
                if (vvVar.D()) {
                    imageReceiver.J0(i0.L(12.0f));
                } else {
                    boolean z15 = vuVar.W;
                    int i17 = (z11 && z13) ? (!z15 || vvVar.B() || (!vvVar.E() && vvVar.G())) ? min : L3 : 0;
                    if (!z11 || !z14) {
                        L3 = 0;
                    } else if (!z15 || vvVar.B() || (vvVar.E() && vvVar.G())) {
                        L3 = min;
                    }
                    int i18 = (z12 && z14) ? min : 0;
                    if (!z12 || !z13) {
                        min = 0;
                    }
                    imageReceiver.K0(i17, L3, i18, min);
                }
            }
            float f11 = round;
            imageReceiver.y0(f11, juVar.G, round2, juVar.I);
            if (!imageReceiver.I() || imageReceiver.h1 != f7) {
                canvas.drawRect(f11, juVar.G, round + round2, r2 + juVar.I, b0);
            }
            juVar.c(canvas);
            i13++;
            z10 = true;
            vuVar = this;
        }
    }

    @Override // org.telegram.messenger.qu
    public final boolean X(MotionEvent motionEvent) {
        ArrayList arrayList = this.X;
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (actionMasked == 0) {
                this.a0 = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ju juVar = (ju) arrayList.get(i10);
                    if (juVar.g(motionEvent.getX(), motionEvent.getY()) && juVar.k(this.V, motionEvent)) {
                        this.a0 = juVar;
                        return true;
                    }
                }
            } else {
                ju juVar2 = this.a0;
                if (juVar2 != null) {
                    boolean k10 = juVar2.k(this.V, motionEvent);
                    if (actionMasked == 1 || actionMasked == 3) {
                        this.a0 = null;
                    }
                    return k10;
                }
            }
            return false;
        } finally {
            motionEvent.offsetLocation(rect.left, rect.top);
        }
    }
}
