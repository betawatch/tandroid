package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class ku extends fu {
    public static Paint b0;
    public final boolean W;
    public final ArrayList X;
    public final int[] Y;
    public final int Z;
    public yt a0;

    public ku(kv kvVar, Rect rect, int i7, TL_iv.pageBlockCollage pageblockcollage, boolean z9) {
        super(kvVar, rect, i7);
        float f10;
        int round;
        float f11;
        int i10;
        this.X = new ArrayList();
        this.W = z9;
        int i11 = 0;
        for (int i12 = 0; i12 < pageblockcollage.items.size(); i12++) {
            TL_iv.PageBlock pageBlock = pageblockcollage.items.get(i12);
            yt ytVar = pageBlock instanceof TL_iv.pageBlockPhoto ? new yt(kvVar, (TL_iv.pageBlockPhoto) pageBlock) : pageBlock instanceof TL_iv.pageBlockVideo ? new yt(kvVar, (TL_iv.pageBlockVideo) pageBlock) : null;
            if (ytVar != null) {
                this.X.add(ytVar);
            }
        }
        int i13 = this.c;
        ArrayList arrayList = this.X;
        this.Y = new int[arrayList.size()];
        if (arrayList.isEmpty()) {
            this.Z = 0;
            return;
        }
        int i14 = 1;
        if (arrayList.size() == 1) {
            yt ytVar2 = (yt) arrayList.get(0);
            float f12 = ytVar2.E;
            f12 = f12 <= 0.0f ? 1.0f : f12;
            int i15 = (int) (i13 / f12);
            Point point = g0.q;
            int max = (int) (Math.max(point.x, point.y) * 0.55f);
            if (i15 > max) {
                i13 = (int) (max * f12);
                i15 = max;
            }
            ytVar2.l(0, 0, i13, i15);
            this.Y[0] = 15;
            this.Z = i15;
            return;
        }
        float[] fArr = new float[arrayList.size()];
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            fArr[i16] = ((yt) arrayList.get(i16)).E;
        }
        aj[] e10 = kv.e(fArr);
        int i17 = 0;
        for (aj ajVar : e10) {
            i17 = Math.max(i17, (int) ajVar.d);
        }
        int i18 = i17 + 1;
        float[] fArr2 = new float[i18];
        for (aj ajVar2 : e10) {
            byte b10 = ajVar2.c;
            if (b10 == ajVar2.d) {
                fArr2[b10] = Math.max(fArr2[b10], ajVar2.f);
            }
        }
        int length = e10.length;
        int i19 = 0;
        while (i19 < length) {
            aj ajVar3 = e10[i19];
            int i20 = ajVar3.c;
            byte b11 = ajVar3.d;
            if (i20 != b11) {
                int i21 = (b11 - i20) + i14;
                float[] fArr3 = ajVar3.m;
                if (fArr3 == null || fArr3.length != i21) {
                    i10 = i14;
                    float f13 = ajVar3.f / i21;
                    while (i20 <= ajVar3.d) {
                        fArr2[i20] = Math.max(fArr2[i20], f13);
                        i20++;
                    }
                    i19++;
                    i14 = i10;
                } else {
                    int i22 = 0;
                    while (i22 < i21) {
                        int i23 = ajVar3.c + i22;
                        fArr2[i23] = Math.max(fArr2[i23], ajVar3.m[i22]);
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
            aj ajVar4 = e10[i25];
            int i26 = iArr[ajVar4.c];
            int i27 = iArr[ajVar4.d + 1] - i26;
            float f15 = 1000.0f;
            if (ajVar4.j > 0) {
                round = Math.round((r12 * i13) / 1000.0f);
                f10 = 1000.0f;
            } else {
                int i28 = i11;
                int i29 = i28;
                while (i28 < e10.length) {
                    if (i28 == i25) {
                        f11 = f15;
                    } else {
                        aj ajVar5 = e10[i28];
                        f11 = f15;
                        byte b12 = ajVar5.c;
                        byte b13 = ajVar4.c;
                        if (b12 <= b13 && ajVar5.d >= b13 && ajVar5.a < ajVar4.a) {
                            i29 += ajVar5.e;
                        }
                    }
                    i28++;
                    f15 = f11;
                }
                f10 = f15;
                round = Math.round((i29 * i13) / f10);
            }
            int round2 = (ajVar4.l & 2) != 0 ? i13 - round : Math.round((ajVar4.e * i13) / f10) - L;
            if ((ajVar4.l & 8) == 0) {
                i27 -= L;
            }
            ((yt) arrayList.get(i25)).l(round, i26, Math.max(0, round2), Math.max(0, i27));
            this.Y[i25] = ajVar4.l;
            i25++;
            i11 = 0;
        }
        this.Z = iArr[i18];
    }

    @Override // org.telegram.messenger.fu
    public final void A(int i7, Rect rect) {
        if (i7 >= 0) {
            ArrayList arrayList = this.X;
            if (i7 >= arrayList.size()) {
                return;
            }
            yt ytVar = (yt) arrayList.get(i7);
            Rect rect2 = this.b;
            int i10 = rect2.left + ytVar.F;
            int i11 = ((int) this.M) + rect2.top + ytVar.G;
            rect.set(i10, i11, ytVar.H + i10, ytVar.I + i11);
        }
    }

    @Override // org.telegram.messenger.fu
    public final int B() {
        return this.X.size();
    }

    @Override // org.telegram.messenger.fu
    public final CharSequence E(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.X;
        if (i7 >= arrayList.size()) {
            return null;
        }
        return ((yt) arrayList.get(i7)).f();
    }

    @Override // org.telegram.messenger.fu
    public final int I() {
        return this.Z;
    }

    @Override // org.telegram.messenger.fu
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.fu
    public final int K() {
        Rect rect = this.b;
        return rect.left + this.c + rect.right;
    }

    @Override // org.telegram.messenger.fu
    public final void T() {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            yt ytVar = (yt) obj;
            View view = this.V;
            ytVar.S = view;
            ImageReceiver imageReceiver = ytVar.c;
            imageReceiver.H0(view);
            imageReceiver.P();
            ImageReceiver imageReceiver2 = ytVar.d;
            imageReceiver2.H0(view);
            imageReceiver2.P();
            ytVar.d(view);
            ytVar.m(view, false);
        }
    }

    @Override // org.telegram.messenger.fu
    public final boolean U(int i7, View view) {
        if (i7 < 0) {
            return false;
        }
        ArrayList arrayList = this.X;
        if (i7 >= arrayList.size()) {
            return false;
        }
        return ((yt) arrayList.get(i7)).j(view);
    }

    @Override // org.telegram.messenger.fu
    public final void V() {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            yt ytVar = (yt) obj;
            ytVar.c.R();
            ytVar.d.R();
            ytVar.e = null;
            z5.q(ytVar.a.a).v(ytVar);
        }
    }

    @Override // org.telegram.messenger.fu
    public final void W(Canvas canvas) {
        float f10;
        ku kuVar = this;
        boolean z9 = true;
        if (b0 == null) {
            Paint paint = new Paint(1);
            b0 = paint;
            paint.setColor(251658240);
        }
        boolean R = kuVar.R();
        int L = g0.L(2.0f);
        kv kvVar = kuVar.a;
        int i7 = (R || kvVar.D()) ? 0 : kvVar.S - L;
        int i10 = (R || kvVar.D()) ? 0 : kvVar.T - L;
        int i11 = kuVar.c;
        float f11 = (i11 <= 0 || (i7 <= 0 && i10 <= 0)) ? 1.0f : ((i11 + i7) + i10) / i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = kuVar.X;
            if (i12 >= arrayList.size()) {
                return;
            }
            yt ytVar = (yt) arrayList.get(i12);
            int i13 = ytVar.F;
            ImageReceiver imageReceiver = ytVar.c;
            int round = Math.round(i13 * f11) - i7;
            int round2 = Math.round(ytVar.H * f11);
            int[] iArr = kuVar.Y;
            int i14 = (iArr == null || i12 >= iArr.length) ? 0 : iArr[i12];
            boolean z10 = (i14 & 4) != 0 ? z9 : false;
            boolean z11 = (i14 & 8) != 0 ? z9 : false;
            boolean z12 = (i14 & 1) != 0 ? z9 : false;
            boolean z13 = (i14 & 2) != 0 ? z9 : false;
            if (R) {
                int L2 = g0.L(8.0f);
                imageReceiver.K0((z10 && z12) ? L2 : 0, (z10 && z13) ? L2 : 0, (z11 && z13) ? L2 : 0, (z11 && z12) ? L2 : 0);
                f10 = 1.0f;
            } else {
                int i15 = iz.Y0;
                f10 = 1.0f;
                int L3 = i15 > 2 ? g0.L(i15 - 2) : g0.L(i15);
                int min = Math.min(g0.L(3.0f), L3);
                if (kvVar.D()) {
                    imageReceiver.J0(g0.L(12.0f));
                } else {
                    boolean z14 = kuVar.W;
                    int i16 = (z10 && z12) ? (!z14 || kvVar.B() || (!kvVar.E() && kvVar.G())) ? min : L3 : 0;
                    if (!z10 || !z13) {
                        L3 = 0;
                    } else if (!z14 || kvVar.B() || (kvVar.E() && kvVar.G())) {
                        L3 = min;
                    }
                    int i17 = (z11 && z13) ? min : 0;
                    if (!z11 || !z12) {
                        min = 0;
                    }
                    imageReceiver.K0(i16, L3, i17, min);
                }
            }
            float f12 = round;
            imageReceiver.y0(f12, ytVar.G, round2, ytVar.I);
            if (!imageReceiver.I() || imageReceiver.h1 != f10) {
                canvas.drawRect(f12, ytVar.G, round + round2, r2 + ytVar.I, b0);
            }
            ytVar.c(canvas);
            i12++;
            z9 = true;
            kuVar = this;
        }
    }

    @Override // org.telegram.messenger.fu
    public final boolean Y(MotionEvent motionEvent) {
        ArrayList arrayList = this.X;
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (actionMasked == 0) {
                this.a0 = null;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    yt ytVar = (yt) arrayList.get(i7);
                    if (ytVar.g(motionEvent.getX(), motionEvent.getY()) && ytVar.k(this.V, motionEvent)) {
                        this.a0 = ytVar;
                        return true;
                    }
                }
            } else {
                yt ytVar2 = this.a0;
                if (ytVar2 != null) {
                    boolean k10 = ytVar2.k(this.V, motionEvent);
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
