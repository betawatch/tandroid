package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class wu extends ru {
    public static Paint b0;
    public final boolean W;
    public final ArrayList X;
    public final int[] Y;
    public final int Z;
    public ku a0;

    public wu(wv wvVar, Rect rect, int i10, TL_iv.pageBlockCollage pageblockcollage, boolean z10) {
        super(wvVar, rect, i10);
        float f7;
        int round;
        float f10;
        int i11;
        this.X = new ArrayList();
        this.W = z10;
        int i12 = 0;
        for (int i13 = 0; i13 < pageblockcollage.items.size(); i13++) {
            TL_iv.PageBlock pageBlock = pageblockcollage.items.get(i13);
            ku kuVar = pageBlock instanceof TL_iv.pageBlockPhoto ? new ku(wvVar, (TL_iv.pageBlockPhoto) pageBlock) : pageBlock instanceof TL_iv.pageBlockVideo ? new ku(wvVar, (TL_iv.pageBlockVideo) pageBlock) : null;
            if (kuVar != null) {
                this.X.add(kuVar);
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
            ku kuVar2 = (ku) arrayList.get(0);
            float f11 = kuVar2.E;
            f11 = f11 <= 0.0f ? 1.0f : f11;
            int i16 = (int) (i14 / f11);
            Point point = i0.q;
            int max = (int) (Math.max(point.x, point.y) * 0.55f);
            if (i16 > max) {
                i14 = (int) (max * f11);
                i16 = max;
            }
            kuVar2.l(0, 0, i14, i16);
            this.Y[0] = 15;
            this.Z = i16;
            return;
        }
        float[] fArr = new float[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            fArr[i17] = ((ku) arrayList.get(i17)).E;
        }
        cj[] e = wv.e(fArr);
        int i18 = 0;
        for (cj cjVar : e) {
            i18 = Math.max(i18, (int) cjVar.d);
        }
        int i19 = i18 + 1;
        float[] fArr2 = new float[i19];
        for (cj cjVar2 : e) {
            byte b10 = cjVar2.c;
            if (b10 == cjVar2.d) {
                fArr2[b10] = Math.max(fArr2[b10], cjVar2.f);
            }
        }
        int length = e.length;
        int i20 = 0;
        while (i20 < length) {
            cj cjVar3 = e[i20];
            int i21 = cjVar3.c;
            byte b11 = cjVar3.d;
            if (i21 != b11) {
                int i22 = (b11 - i21) + i15;
                float[] fArr3 = cjVar3.m;
                if (fArr3 == null || fArr3.length != i22) {
                    i11 = i15;
                    float f12 = cjVar3.f / i22;
                    while (i21 <= cjVar3.d) {
                        fArr2[i21] = Math.max(fArr2[i21], f12);
                        i21++;
                    }
                    i20++;
                    i15 = i11;
                } else {
                    int i23 = 0;
                    while (i23 < i22) {
                        int i24 = cjVar3.c + i23;
                        fArr2[i24] = Math.max(fArr2[i24], cjVar3.m[i23]);
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
            cj cjVar4 = e[i26];
            int i27 = iArr[cjVar4.c];
            int i28 = iArr[cjVar4.d + 1] - i27;
            float f14 = 1000.0f;
            if (cjVar4.j > 0) {
                round = Math.round((r12 * i14) / 1000.0f);
                f7 = 1000.0f;
            } else {
                int i29 = i12;
                int i30 = i29;
                while (i29 < e.length) {
                    if (i29 == i26) {
                        f10 = f14;
                    } else {
                        cj cjVar5 = e[i29];
                        f10 = f14;
                        byte b12 = cjVar5.c;
                        byte b13 = cjVar4.c;
                        if (b12 <= b13 && cjVar5.d >= b13 && cjVar5.a < cjVar4.a) {
                            i30 += cjVar5.e;
                        }
                    }
                    i29++;
                    f14 = f10;
                }
                f7 = f14;
                round = Math.round((i30 * i14) / f7);
            }
            int round2 = (cjVar4.l & 2) != 0 ? i14 - round : Math.round((cjVar4.e * i14) / f7) - L;
            if ((cjVar4.l & 8) == 0) {
                i28 -= L;
            }
            ((ku) arrayList.get(i26)).l(round, i27, Math.max(0, round2), Math.max(0, i28));
            this.Y[i26] = cjVar4.l;
            i26++;
            i12 = 0;
        }
        this.Z = iArr[i19];
    }

    @Override // org.telegram.messenger.ru
    public final void A(int i10, Rect rect) {
        if (i10 >= 0) {
            ArrayList arrayList = this.X;
            if (i10 >= arrayList.size()) {
                return;
            }
            ku kuVar = (ku) arrayList.get(i10);
            Rect rect2 = this.b;
            int i11 = rect2.left + kuVar.F;
            int i12 = ((int) this.M) + rect2.top + kuVar.G;
            rect.set(i11, i12, kuVar.H + i11, kuVar.I + i12);
        }
    }

    @Override // org.telegram.messenger.ru
    public final int B() {
        return this.X.size();
    }

    @Override // org.telegram.messenger.ru
    public final CharSequence E(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.X;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return ((ku) arrayList.get(i10)).f();
    }

    @Override // org.telegram.messenger.ru
    public final int H() {
        return this.Z;
    }

    @Override // org.telegram.messenger.ru
    public final int I() {
        return J();
    }

    @Override // org.telegram.messenger.ru
    public final int J() {
        Rect rect = this.b;
        return rect.left + this.c + rect.right;
    }

    @Override // org.telegram.messenger.ru
    public final void S() {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ku kuVar = (ku) obj;
            View view = this.V;
            kuVar.S = view;
            ImageReceiver imageReceiver = kuVar.c;
            imageReceiver.H0(view);
            imageReceiver.P();
            ImageReceiver imageReceiver2 = kuVar.d;
            imageReceiver2.H0(view);
            imageReceiver2.P();
            kuVar.d(view);
            kuVar.m(view, false);
        }
    }

    @Override // org.telegram.messenger.ru
    public final boolean T(int i10, View view) {
        if (i10 < 0) {
            return false;
        }
        ArrayList arrayList = this.X;
        if (i10 >= arrayList.size()) {
            return false;
        }
        return ((ku) arrayList.get(i10)).j(view);
    }

    @Override // org.telegram.messenger.ru
    public final void U() {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ku kuVar = (ku) obj;
            kuVar.c.R();
            kuVar.d.R();
            kuVar.e = null;
            b6.q(kuVar.a.a).v(kuVar);
        }
    }

    @Override // org.telegram.messenger.ru
    public final void V(Canvas canvas) {
        float f7;
        wu wuVar = this;
        boolean z10 = true;
        if (b0 == null) {
            Paint paint = new Paint(1);
            b0 = paint;
            paint.setColor(251658240);
        }
        boolean Q = wuVar.Q();
        int L = i0.L(2.0f);
        wv wvVar = wuVar.a;
        int i10 = (Q || wvVar.D()) ? 0 : wvVar.S - L;
        int i11 = (Q || wvVar.D()) ? 0 : wvVar.T - L;
        int i12 = wuVar.c;
        float f10 = (i12 <= 0 || (i10 <= 0 && i11 <= 0)) ? 1.0f : ((i12 + i10) + i11) / i12;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = wuVar.X;
            if (i13 >= arrayList.size()) {
                return;
            }
            ku kuVar = (ku) arrayList.get(i13);
            int i14 = kuVar.F;
            ImageReceiver imageReceiver = kuVar.c;
            int round = Math.round(i14 * f10) - i10;
            int round2 = Math.round(kuVar.H * f10);
            int[] iArr = wuVar.Y;
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
                int i16 = uz.Y0;
                f7 = 1.0f;
                int L3 = i16 > 2 ? i0.L(i16 - 2) : i0.L(i16);
                int min = Math.min(i0.L(3.0f), L3);
                if (wvVar.D()) {
                    imageReceiver.J0(i0.L(12.0f));
                } else {
                    boolean z15 = wuVar.W;
                    int i17 = (z11 && z13) ? (!z15 || wvVar.B() || (!wvVar.E() && wvVar.G())) ? min : L3 : 0;
                    if (!z11 || !z14) {
                        L3 = 0;
                    } else if (!z15 || wvVar.B() || (wvVar.E() && wvVar.G())) {
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
            imageReceiver.y0(f11, kuVar.G, round2, kuVar.I);
            if (!imageReceiver.I() || imageReceiver.h1 != f7) {
                canvas.drawRect(f11, kuVar.G, round + round2, r2 + kuVar.I, b0);
            }
            kuVar.c(canvas);
            i13++;
            z10 = true;
            wuVar = this;
        }
    }

    @Override // org.telegram.messenger.ru
    public final boolean X(MotionEvent motionEvent) {
        ArrayList arrayList = this.X;
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (actionMasked == 0) {
                this.a0 = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ku kuVar = (ku) arrayList.get(i10);
                    if (kuVar.g(motionEvent.getX(), motionEvent.getY()) && kuVar.k(this.V, motionEvent)) {
                        this.a0 = kuVar;
                        return true;
                    }
                }
            } else {
                ku kuVar2 = this.a0;
                if (kuVar2 != null) {
                    boolean k10 = kuVar2.k(this.V, motionEvent);
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
