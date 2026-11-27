// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ik9 extends dk9 {
    public static Paint c0;
    public final boolean X;
    public final ArrayList Y;
    public final int[] Z;
    public final int a0;
    public xj9 b0;

    public ik9(hl9 hl9Var, Rect rect, int i, TL_iv.pageBlockCollage pageblockcollage, boolean z) {
        super(hl9Var, rect, i);
        float f;
        int round;
        float f2;
        int i2;
        this.Y = new ArrayList();
        this.X = z;
        int i3 = 0;
        for (int i4 = 0; i4 < pageblockcollage.items.size(); i4++) {
            TL_iv.PageBlock pageBlock = pageblockcollage.items.get(i4);
            xj9 xj9Var = pageBlock instanceof TL_iv.pageBlockPhoto ? new xj9(hl9Var, (TL_iv.pageBlockPhoto) pageBlock) : pageBlock instanceof TL_iv.pageBlockVideo ? new xj9(hl9Var, (TL_iv.pageBlockVideo) pageBlock) : null;
            if (xj9Var != null) {
                this.Y.add(xj9Var);
            }
        }
        int i5 = this.c;
        ArrayList arrayList = this.Y;
        this.Z = new int[arrayList.size()];
        if (arrayList.isEmpty()) {
            this.a0 = 0;
            return;
        }
        int i6 = 1;
        if (arrayList.size() == 1) {
            xj9 xj9Var2 = (xj9) arrayList.get(0);
            float f3 = xj9Var2.F;
            f3 = f3 <= 0.0f ? 1.0f : f3;
            int i7 = (int) (i5 / f3);
            Point point = hl.q;
            int max = (int) (Math.max(point.x, point.y) * 0.55f);
            if (i7 > max) {
                i5 = (int) (max * f3);
                i7 = max;
            }
            xj9Var2.m(0, 0, i5, i7);
            this.Z[0] = 15;
            this.a0 = i7;
            return;
        }
        float[] fArr = new float[arrayList.size()];
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            fArr[i8] = ((xj9) arrayList.get(i8)).F;
        }
        j47[] e = hl9.e(fArr);
        int i9 = 0;
        for (j47 j47Var : e) {
            i9 = Math.max(i9, (int) j47Var.d);
        }
        int i10 = i9 + 1;
        float[] fArr2 = new float[i10];
        for (j47 j47Var2 : e) {
            byte b = j47Var2.c;
            if (b == j47Var2.d) {
                fArr2[b] = Math.max(fArr2[b], j47Var2.f);
            }
        }
        int length = e.length;
        int i11 = 0;
        while (i11 < length) {
            j47 j47Var3 = e[i11];
            int i12 = j47Var3.c;
            byte b2 = j47Var3.d;
            if (i12 != b2) {
                int i13 = (b2 - i12) + i6;
                float[] fArr3 = j47Var3.m;
                if (fArr3 == null || fArr3.length != i13) {
                    i2 = i6;
                    float f4 = j47Var3.f / i13;
                    while (i12 <= j47Var3.d) {
                        fArr2[i12] = Math.max(fArr2[i12], f4);
                        i12++;
                    }
                    i11++;
                    i6 = i2;
                } else {
                    int i14 = 0;
                    while (i14 < i13) {
                        int i15 = j47Var3.c + i14;
                        fArr2[i15] = Math.max(fArr2[i15], j47Var3.m[i14]);
                        i14++;
                        i6 = i6;
                    }
                }
            }
            i2 = i6;
            i11++;
            i6 = i2;
        }
        Point point2 = hl.q;
        float max2 = Math.max(point2.x, point2.y) * 0.5f;
        int[] iArr = new int[i9 + 2];
        float f5 = 0.0f;
        for (int i16 = 0; i16 <= i9; i16++) {
            iArr[i16] = Math.round(f5 * max2);
            f5 += fArr2[i16];
        }
        iArr[i10] = Math.round(f5 * max2);
        int L = hl.L(this.a.C() ? 3.0f : 2.0f);
        int i17 = 0;
        while (i17 < e.length) {
            j47 j47Var4 = e[i17];
            int i18 = iArr[j47Var4.c];
            int i19 = iArr[j47Var4.d + 1] - i18;
            float f6 = 1000.0f;
            if (j47Var4.j > 0) {
                round = Math.round((r12 * i5) / 1000.0f);
                f = 1000.0f;
            } else {
                int i20 = i3;
                int i21 = i20;
                while (i20 < e.length) {
                    if (i20 == i17) {
                        f2 = f6;
                    } else {
                        j47 j47Var5 = e[i20];
                        f2 = f6;
                        byte b3 = j47Var5.c;
                        byte b4 = j47Var4.c;
                        if (b3 <= b4 && j47Var5.d >= b4 && j47Var5.a < j47Var4.a) {
                            i21 += j47Var5.e;
                        }
                    }
                    i20++;
                    f6 = f2;
                }
                f = f6;
                round = Math.round((i21 * i5) / f);
            }
            int round2 = (j47Var4.l & 2) != 0 ? i5 - round : Math.round((j47Var4.e * i5) / f) - L;
            if ((j47Var4.l & 8) == 0) {
                i19 -= L;
            }
            ((xj9) arrayList.get(i17)).m(round, i18, Math.max(0, round2), Math.max(0, i19));
            this.Z[i17] = j47Var4.l;
            i17++;
            i3 = 0;
        }
        this.a0 = iArr[i10];
    }

    @Override // dk9
    public final int A() {
        return this.Y.size();
    }

    @Override // dk9
    public final CharSequence D(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.Y;
        if (i < arrayList.size()) {
            return ((xj9) arrayList.get(i)).f();
        }
        return null;
    }

    @Override // dk9
    public final int H() {
        return this.a0;
    }

    @Override // dk9
    public final int I() {
        return J();
    }

    @Override // dk9
    public final int J() {
        Rect rect = this.b;
        return rect.left + this.c + rect.right;
    }

    @Override // dk9
    public final void S() {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xj9 xj9Var = (xj9) obj;
            View view = this.W;
            xj9Var.T = view;
            ImageReceiver imageReceiver = xj9Var.c;
            imageReceiver.p0(view);
            imageReceiver.I();
            ImageReceiver imageReceiver2 = xj9Var.d;
            imageReceiver2.p0(view);
            imageReceiver2.I();
            xj9Var.d(view);
            xj9Var.n(view, false);
        }
    }

    @Override // dk9
    public final boolean T(int i, View view) {
        if (i < 0) {
            return false;
        }
        ArrayList arrayList = this.Y;
        if (i < arrayList.size()) {
            return ((xj9) arrayList.get(i)).j(view);
        }
        return false;
    }

    @Override // dk9
    public final void U() {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xj9 xj9Var = (xj9) obj;
            xj9Var.c.K();
            xj9Var.d.K();
            xj9Var.e = null;
            lq3.q(xj9Var.a.a).v(xj9Var);
        }
    }

    @Override // dk9
    public final void V(Canvas canvas) {
        float f;
        ik9 ik9Var = this;
        boolean z = true;
        if (c0 == null) {
            Paint paint = new Paint(1);
            c0 = paint;
            paint.setColor(251658240);
        }
        boolean Q = ik9Var.Q();
        int L = hl.L(2.0f);
        hl9 hl9Var = ik9Var.a;
        int i = (Q || hl9Var.C()) ? 0 : hl9Var.S - L;
        int i2 = (Q || hl9Var.C()) ? 0 : hl9Var.T - L;
        int i3 = ik9Var.c;
        float f2 = (i3 <= 0 || (i <= 0 && i2 <= 0)) ? 1.0f : ((i3 + i) + i2) / i3;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = ik9Var.Y;
            if (i4 >= arrayList.size()) {
                return;
            }
            xj9 xj9Var = (xj9) arrayList.get(i4);
            int i5 = xj9Var.G;
            ImageReceiver imageReceiver = xj9Var.c;
            int round = Math.round(i5 * f2) - i;
            int round2 = Math.round(xj9Var.I * f2);
            int[] iArr = ik9Var.Z;
            int i6 = (iArr == null || i4 >= iArr.length) ? 0 : iArr[i4];
            boolean z2 = (i6 & 4) != 0 ? z : false;
            boolean z3 = (i6 & 8) != 0 ? z : false;
            boolean z4 = (i6 & 1) != 0 ? z : false;
            boolean z5 = (i6 & 2) != 0 ? z : false;
            if (Q) {
                int L2 = hl.L(8.0f);
                imageReceiver.r0((z2 && z4) ? L2 : 0, (z2 && z5) ? L2 : 0, (z3 && z5) ? L2 : 0, (z3 && z4) ? L2 : 0);
                f = 1.0f;
            } else {
                int i7 = xea.U0;
                f = 1.0f;
                int L3 = i7 > 2 ? hl.L(i7 - 2) : hl.L(i7);
                int min = Math.min(hl.L(3.0f), L3);
                if (hl9Var.C()) {
                    imageReceiver.q0(hl.L(12.0f));
                } else {
                    boolean z6 = ik9Var.X;
                    int i8 = (z2 && z4) ? (!z6 || hl9Var.A() || (!hl9Var.D() && hl9Var.F())) ? min : L3 : 0;
                    if (!z2 || !z5) {
                        L3 = 0;
                    } else if (!z6 || hl9Var.A() || (hl9Var.D() && hl9Var.F())) {
                        L3 = min;
                    }
                    int i9 = (z3 && z5) ? min : 0;
                    if (!z3 || !z4) {
                        min = 0;
                    }
                    imageReceiver.r0(i8, L3, i9, min);
                }
            }
            float f3 = round;
            imageReceiver.i0(f3, xj9Var.H, round2, xj9Var.J);
            if (!imageReceiver.B() || imageReceiver.i1 != f) {
                canvas.drawRect(f3, xj9Var.H, round + round2, r2 + xj9Var.J, c0);
            }
            xj9Var.c(canvas);
            i4++;
            z = true;
            ik9Var = this;
        }
    }

    @Override // dk9
    public final boolean X(MotionEvent motionEvent) {
        ArrayList arrayList = this.Y;
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (actionMasked == 0) {
                this.b0 = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    xj9 xj9Var = (xj9) arrayList.get(i);
                    if (xj9Var.g(motionEvent.getX(), motionEvent.getY()) && xj9Var.k(this.W, motionEvent)) {
                        this.b0 = xj9Var;
                        return true;
                    }
                }
            } else {
                xj9 xj9Var2 = this.b0;
                if (xj9Var2 != null) {
                    boolean k = xj9Var2.k(this.W, motionEvent);
                    if (actionMasked == 1 || actionMasked == 3) {
                        this.b0 = null;
                    }
                    return k;
                }
            }
            return false;
        } finally {
            motionEvent.offsetLocation(rect.left, rect.top);
        }
    }

    @Override // dk9
    public final void z(int i, Rect rect) {
        if (i >= 0) {
            ArrayList arrayList = this.Y;
            if (i < arrayList.size()) {
                xj9 xj9Var = (xj9) arrayList.get(i);
                Rect rect2 = this.b;
                int i2 = rect2.left + xj9Var.G;
                int i3 = ((int) this.N) + rect2.top + xj9Var.H;
                rect.set(i2, i3, xj9Var.I + i2, xj9Var.J + i3);
            }
        }
    }
}
