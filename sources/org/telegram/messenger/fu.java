package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class fu extends au {
    public static Paint c0;
    public final boolean X;
    public final ArrayList Y;
    public final int[] Z;
    public final int a0;
    public tt b0;

    public fu(fv fvVar, Rect rect, int i7, TL_iv.pageBlockCollage pageblockcollage, boolean z10) {
        super(fvVar, rect, i7);
        float f10;
        int round;
        float f11;
        int i10;
        this.Y = new ArrayList();
        this.X = z10;
        int i11 = 0;
        for (int i12 = 0; i12 < pageblockcollage.items.size(); i12++) {
            TL_iv.PageBlock pageBlock = pageblockcollage.items.get(i12);
            tt ttVar = pageBlock instanceof TL_iv.pageBlockPhoto ? new tt(fvVar, (TL_iv.pageBlockPhoto) pageBlock) : pageBlock instanceof TL_iv.pageBlockVideo ? new tt(fvVar, (TL_iv.pageBlockVideo) pageBlock) : null;
            if (ttVar != null) {
                this.Y.add(ttVar);
            }
        }
        int i13 = this.c;
        ArrayList arrayList = this.Y;
        this.Z = new int[arrayList.size()];
        if (arrayList.isEmpty()) {
            this.a0 = 0;
            return;
        }
        int i14 = 1;
        if (arrayList.size() == 1) {
            tt ttVar2 = (tt) arrayList.get(0);
            float f12 = ttVar2.F;
            f12 = f12 <= 0.0f ? 1.0f : f12;
            int i15 = (int) (i13 / f12);
            Point point = g0.q;
            int max = (int) (Math.max(point.x, point.y) * 0.55f);
            if (i15 > max) {
                i13 = (int) (max * f12);
                i15 = max;
            }
            ttVar2.l(0, 0, i13, i15);
            this.Z[0] = 15;
            this.a0 = i15;
            return;
        }
        float[] fArr = new float[arrayList.size()];
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            fArr[i16] = ((tt) arrayList.get(i16)).F;
        }
        yi[] e10 = fv.e(fArr);
        int i17 = 0;
        for (yi yiVar : e10) {
            i17 = Math.max(i17, (int) yiVar.d);
        }
        int i18 = i17 + 1;
        float[] fArr2 = new float[i18];
        for (yi yiVar2 : e10) {
            byte b10 = yiVar2.c;
            if (b10 == yiVar2.d) {
                fArr2[b10] = Math.max(fArr2[b10], yiVar2.f);
            }
        }
        int length = e10.length;
        int i19 = 0;
        while (i19 < length) {
            yi yiVar3 = e10[i19];
            int i20 = yiVar3.c;
            byte b11 = yiVar3.d;
            if (i20 != b11) {
                int i21 = (b11 - i20) + i14;
                float[] fArr3 = yiVar3.m;
                if (fArr3 == null || fArr3.length != i21) {
                    i10 = i14;
                    float f13 = yiVar3.f / i21;
                    while (i20 <= yiVar3.d) {
                        fArr2[i20] = Math.max(fArr2[i20], f13);
                        i20++;
                    }
                    i19++;
                    i14 = i10;
                } else {
                    int i22 = 0;
                    while (i22 < i21) {
                        int i23 = yiVar3.c + i22;
                        fArr2[i23] = Math.max(fArr2[i23], yiVar3.m[i22]);
                        i22++;
                        i14 = i14;
                    }
                }
            }
            i10 = i14;
            i19++;
            i14 = i10;
        }
        Point point2 = g0.q;
        float max2 = Math.max(point2.x, point2.y) * 0.5f;
        int[] iArr = new int[i17 + 2];
        float f14 = 0.0f;
        for (int i24 = 0; i24 <= i17; i24++) {
            iArr[i24] = Math.round(f14 * max2);
            f14 += fArr2[i24];
        }
        iArr[i18] = Math.round(f14 * max2);
        int L = g0.L(this.a.D() ? 3.0f : 2.0f);
        int i25 = 0;
        while (i25 < e10.length) {
            yi yiVar4 = e10[i25];
            int i26 = iArr[yiVar4.c];
            int i27 = iArr[yiVar4.d + 1] - i26;
            float f15 = 1000.0f;
            if (yiVar4.j > 0) {
                round = Math.round((r12 * i13) / 1000.0f);
                f10 = 1000.0f;
            } else {
                int i28 = i11;
                int i29 = i28;
                while (i28 < e10.length) {
                    if (i28 == i25) {
                        f11 = f15;
                    } else {
                        yi yiVar5 = e10[i28];
                        f11 = f15;
                        byte b12 = yiVar5.c;
                        byte b13 = yiVar4.c;
                        if (b12 <= b13 && yiVar5.d >= b13 && yiVar5.a < yiVar4.a) {
                            i29 += yiVar5.e;
                        }
                    }
                    i28++;
                    f15 = f11;
                }
                f10 = f15;
                round = Math.round((i29 * i13) / f10);
            }
            int round2 = (yiVar4.l & 2) != 0 ? i13 - round : Math.round((yiVar4.e * i13) / f10) - L;
            if ((yiVar4.l & 8) == 0) {
                i27 -= L;
            }
            ((tt) arrayList.get(i25)).l(round, i26, Math.max(0, round2), Math.max(0, i27));
            this.Z[i25] = yiVar4.l;
            i25++;
            i11 = 0;
        }
        this.a0 = iArr[i18];
    }

    @Override // org.telegram.messenger.au
    public final void A(int i7, Rect rect) {
        if (i7 >= 0) {
            ArrayList arrayList = this.Y;
            if (i7 >= arrayList.size()) {
                return;
            }
            tt ttVar = (tt) arrayList.get(i7);
            Rect rect2 = this.b;
            int i10 = rect2.left + ttVar.G;
            int i11 = ((int) this.N) + rect2.top + ttVar.H;
            rect.set(i10, i11, ttVar.I + i10, ttVar.J + i11);
        }
    }

    @Override // org.telegram.messenger.au
    public final int B() {
        return this.Y.size();
    }

    @Override // org.telegram.messenger.au
    public final CharSequence E(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.Y;
        if (i7 >= arrayList.size()) {
            return null;
        }
        return ((tt) arrayList.get(i7)).f();
    }

    @Override // org.telegram.messenger.au
    public final int I() {
        return this.a0;
    }

    @Override // org.telegram.messenger.au
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.au
    public final int K() {
        Rect rect = this.b;
        return rect.left + this.c + rect.right;
    }

    @Override // org.telegram.messenger.au
    public final void T() {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            tt ttVar = (tt) obj;
            View view = this.W;
            ttVar.T = view;
            ImageReceiver imageReceiver = ttVar.c;
            imageReceiver.H0(view);
            imageReceiver.P();
            ImageReceiver imageReceiver2 = ttVar.d;
            imageReceiver2.H0(view);
            imageReceiver2.P();
            ttVar.d(view);
            ttVar.m(view, false);
        }
    }

    @Override // org.telegram.messenger.au
    public final boolean U(int i7, View view) {
        if (i7 < 0) {
            return false;
        }
        ArrayList arrayList = this.Y;
        if (i7 >= arrayList.size()) {
            return false;
        }
        return ((tt) arrayList.get(i7)).j(view);
    }

    @Override // org.telegram.messenger.au
    public final void V() {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            tt ttVar = (tt) obj;
            ttVar.c.R();
            ttVar.d.R();
            ttVar.e = null;
            a6.q(ttVar.a.a).v(ttVar);
        }
    }

    @Override // org.telegram.messenger.au
    public final void W(Canvas canvas) {
        float f10;
        fu fuVar = this;
        boolean z10 = true;
        if (c0 == null) {
            Paint paint = new Paint(1);
            c0 = paint;
            paint.setColor(251658240);
        }
        boolean R = fuVar.R();
        int L = g0.L(2.0f);
        fv fvVar = fuVar.a;
        int i7 = (R || fvVar.D()) ? 0 : fvVar.S - L;
        int i10 = (R || fvVar.D()) ? 0 : fvVar.T - L;
        int i11 = fuVar.c;
        float f11 = (i11 <= 0 || (i7 <= 0 && i10 <= 0)) ? 1.0f : ((i11 + i7) + i10) / i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = fuVar.Y;
            if (i12 >= arrayList.size()) {
                return;
            }
            tt ttVar = (tt) arrayList.get(i12);
            int i13 = ttVar.G;
            ImageReceiver imageReceiver = ttVar.c;
            int round = Math.round(i13 * f11) - i7;
            int round2 = Math.round(ttVar.I * f11);
            int[] iArr = fuVar.Z;
            int i14 = (iArr == null || i12 >= iArr.length) ? 0 : iArr[i12];
            boolean z11 = (i14 & 4) != 0 ? z10 : false;
            boolean z12 = (i14 & 8) != 0 ? z10 : false;
            boolean z13 = (i14 & 1) != 0 ? z10 : false;
            boolean z14 = (i14 & 2) != 0 ? z10 : false;
            if (R) {
                int L2 = g0.L(8.0f);
                imageReceiver.K0((z11 && z13) ? L2 : 0, (z11 && z14) ? L2 : 0, (z12 && z14) ? L2 : 0, (z12 && z13) ? L2 : 0);
                f10 = 1.0f;
            } else {
                int i15 = cz.Y0;
                f10 = 1.0f;
                int L3 = i15 > 2 ? g0.L(i15 - 2) : g0.L(i15);
                int min = Math.min(g0.L(3.0f), L3);
                if (fvVar.D()) {
                    imageReceiver.J0(g0.L(12.0f));
                } else {
                    boolean z15 = fuVar.X;
                    int i16 = (z11 && z13) ? (!z15 || fvVar.B() || (!fvVar.E() && fvVar.G())) ? min : L3 : 0;
                    if (!z11 || !z14) {
                        L3 = 0;
                    } else if (!z15 || fvVar.B() || (fvVar.E() && fvVar.G())) {
                        L3 = min;
                    }
                    int i17 = (z12 && z14) ? min : 0;
                    if (!z12 || !z13) {
                        min = 0;
                    }
                    imageReceiver.K0(i16, L3, i17, min);
                }
            }
            float f12 = round;
            imageReceiver.y0(f12, ttVar.H, round2, ttVar.J);
            if (!imageReceiver.I() || imageReceiver.i1 != f10) {
                canvas.drawRect(f12, ttVar.H, round + round2, r2 + ttVar.J, c0);
            }
            ttVar.c(canvas);
            i12++;
            z10 = true;
            fuVar = this;
        }
    }

    @Override // org.telegram.messenger.au
    public final boolean Y(MotionEvent motionEvent) {
        ArrayList arrayList = this.Y;
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (actionMasked == 0) {
                this.b0 = null;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    tt ttVar = (tt) arrayList.get(i7);
                    if (ttVar.g(motionEvent.getX(), motionEvent.getY()) && ttVar.k(this.W, motionEvent)) {
                        this.b0 = ttVar;
                        return true;
                    }
                }
            } else {
                tt ttVar2 = this.b0;
                if (ttVar2 != null) {
                    boolean k10 = ttVar2.k(this.W, motionEvent);
                    if (actionMasked == 1 || actionMasked == 3) {
                        this.b0 = null;
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
