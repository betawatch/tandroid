// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class fk9 extends dk9 {
    public final ek9[] X;
    public final int Y;
    public int Z;
    public ek9 a0;
    public ek9 b0;
    public final dj2 c0;

    public fk9(hl9 hl9Var, Rect rect, int i, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(hl9Var, rect, i);
        this.Z = -1;
        this.c0 = new dj2(new l09(this, (byte) 5));
        this.X = new ek9[pageblockbuttonrow.buttons.size()];
        int size = pageblockbuttonrow.buttons.size();
        for (int i2 = 0; i2 < size; i2++) {
            ek9[] ek9VarArr = this.X;
            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i2);
            ek9VarArr[i2] = new ek9(hl9Var, i, hl9Var.l(pageButton.text, hl9.Q(16, 13)), pageButton, pageButton.type, pageButton.style, ehb.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), false, false, false, false, null, new v59(this, (byte) 10));
        }
        if (pageblockbuttonrow.align_left) {
            this.Y = 1;
        } else if (pageblockbuttonrow.align_center) {
            this.Y = 3;
        } else if (pageblockbuttonrow.align_right) {
            this.Y = 2;
        } else {
            this.Y = 4;
        }
        j0(i0());
    }

    @Override // dk9
    public final int H() {
        ek9[] ek9VarArr = this.X;
        int L = ek9VarArr.length == 0 ? hl.L(this.a.M + 18) : ek9VarArr[0].c();
        Rect rect = this.b;
        return hl.L(4.333f) + rect.top + L + rect.bottom;
    }

    @Override // dk9
    public final int J() {
        Rect rect = this.b;
        return i0() + rect.left + rect.right;
    }

    @Override // dk9
    public final boolean P() {
        return this.b0 != null;
    }

    @Override // dk9
    public final void S() {
        for (ek9 ek9Var : this.X) {
            ek9Var.a.i(this.W);
        }
    }

    @Override // dk9
    public final void U() {
        for (ek9 ek9Var : this.X) {
            ek9Var.a.f(this.W);
        }
    }

    @Override // dk9
    public final boolean X(MotionEvent motionEvent) {
        View view = this.W;
        if (view == null) {
            return false;
        }
        return this.c0.a(view, motionEvent);
    }

    public final ek9 h0(float f, float f2) {
        l0();
        ek9[] ek9VarArr = this.X;
        int L = ek9VarArr.length == 0 ? hl.L(this.a.M + 18) : ek9VarArr[0].c();
        float H = (H() - L) / 2.0f;
        if (f2 < H || f2 > H + L) {
            return null;
        }
        for (ek9 ek9Var : ek9VarArr) {
            if (f >= ek9Var.d && f <= r1 + ek9Var.e) {
                return ek9Var;
            }
        }
        return null;
    }

    public final int i0() {
        ek9[] ek9VarArr = this.X;
        int length = ek9VarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * hl.L(7.0f);
        for (ek9 ek9Var : ek9VarArr) {
            L += ek9Var.h();
        }
        return Math.min(this.c, L);
    }

    public final void j0(int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        this.Z = i;
        ek9[] ek9VarArr = this.X;
        int length = ek9VarArr.length;
        if (length != 0) {
            int L = hl.L(7.0f);
            int i5 = (length - 1) * L;
            int max = Math.max(0, i - i5);
            int i6 = 0;
            for (ek9 ek9Var : ek9VarArr) {
                int h = ek9Var.h();
                ek9Var.e = h;
                i6 += h;
            }
            int i7 = this.Y;
            if (i6 > max) {
                int i8 = 0;
                for (ek9 ek9Var2 : ek9VarArr) {
                    i8 += ek9Var2.e - ek9Var2.e();
                }
                if (i8 <= 0) {
                    for (ek9 ek9Var3 : ek9VarArr) {
                        ek9Var3.e = ek9Var3.e();
                    }
                } else {
                    int min = Math.min(i6 - max, i8);
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < ek9VarArr.length) {
                        ek9 ek9Var4 = ek9VarArr[i9];
                        int e = ek9Var4.e - ek9Var4.e();
                        if (i9 == ek9VarArr.length - 1) {
                            i4 = min - i10;
                            i3 = i9;
                        } else {
                            i3 = i9;
                            i4 = (int) ((min * e) / i8);
                        }
                        int min2 = Math.min(i4, e);
                        ek9Var4.e -= min2;
                        i10 += min2;
                        i9 = i3 + 1;
                    }
                }
            } else if (i7 == 4) {
                boolean[] zArr = new boolean[ek9VarArr.length];
                int length2 = ek9VarArr.length;
                for (boolean z2 = true; z2 && length2 > 0; z2 = z) {
                    int i11 = max / length2;
                    z = false;
                    for (int i12 = 0; i12 < ek9VarArr.length; i12++) {
                        if (!zArr[i12] && (i2 = ek9VarArr[i12].e) > i11) {
                            zArr[i12] = true;
                            max -= i2;
                            length2--;
                            z = true;
                        }
                    }
                }
                if (length2 > 0) {
                    int i13 = max / length2;
                    int i14 = max - (length2 * i13);
                    for (int i15 = 0; i15 < ek9VarArr.length; i15++) {
                        if (!zArr[i15]) {
                            int i16 = i14 - 1;
                            ek9VarArr[i15].e = (i14 > 0 ? 1 : 0) + i13;
                            i14 = i16;
                        }
                    }
                }
            }
            for (ek9 ek9Var5 : ek9VarArr) {
                i5 += ek9Var5.e;
            }
            int F = ik8.F(i7);
            int i17 = F != 1 ? F != 2 ? 0 : (i - i5) / 2 : i - i5;
            for (ek9 ek9Var6 : ek9VarArr) {
                ek9Var6.d = i17;
                i17 += ek9Var6.e + L;
            }
        }
    }

    public final void k0(ek9 ek9Var) {
        ek9 ek9Var2 = this.a0;
        if (ek9Var2 != ek9Var) {
            if (ek9Var2 != null) {
                ek9Var2.m(false);
            }
            this.a0 = ek9Var;
            if (ek9Var != null) {
                ek9Var.m(true);
            }
        }
    }

    public final void l0() {
        hl9 hl9Var = this.a;
        int i = hl9Var.C;
        int i2 = hl9Var.S;
        int i3 = ((i + i2) + hl9Var.T) - (i2 << 1);
        Rect rect = this.b;
        int max = Math.max(0, (i3 - rect.left) - rect.right);
        if (this.Z != max) {
            j0(max);
        }
    }

    @Override // dk9
    public final void p(Canvas canvas) {
        l0();
        for (ek9 ek9Var : this.X) {
            canvas.save();
            canvas.translate(ek9Var.d, Math.round((H() - ek9Var.c()) / 2.0f));
            ek9Var.a(canvas);
            canvas.restore();
        }
    }
}
