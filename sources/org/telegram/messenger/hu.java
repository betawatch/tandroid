package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class hu extends fu {
    public final gu[] W;
    public final int X;
    public int Y;
    public gu Z;
    public gu a0;
    public final org.telegram.ui.Cells.l9 b0;

    public hu(kv kvVar, Rect rect, int i7, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(kvVar, rect, i7);
        this.Y = -1;
        this.b0 = new org.telegram.ui.Cells.l9(new gf.g(this, 25));
        this.W = new gu[pageblockbuttonrow.buttons.size()];
        int size = pageblockbuttonrow.buttons.size();
        for (int i10 = 0; i10 < size; i10++) {
            gu[] guVarArr = this.W;
            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i10);
            guVarArr[i10] = new gu(kvVar, i7, kvVar.l(pageButton.text, kv.R(16, 13)), pageButton, pageButton.type, pageButton.style, cg.c.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), false, false, false, false, null, new ds(this, 5));
        }
        if (pageblockbuttonrow.align_left) {
            this.X = 1;
        } else if (pageblockbuttonrow.align_center) {
            this.X = 3;
        } else if (pageblockbuttonrow.align_right) {
            this.X = 2;
        } else {
            this.X = 4;
        }
        l0(k0());
    }

    public static gu i0(hu huVar, float f10, float f11) {
        huVar.m0();
        gu[] guVarArr = huVar.W;
        int L = guVarArr.length == 0 ? g0.L(huVar.a.M + 18) : guVarArr[0].c();
        float I = (huVar.I() - L) / 2.0f;
        if (f11 < I || f11 > I + L) {
            return null;
        }
        for (gu guVar : guVarArr) {
            if (f10 >= guVar.d && f10 <= r1 + guVar.e) {
                return guVar;
            }
        }
        return null;
    }

    public static void j0(hu huVar, gu guVar) {
        gu guVar2 = huVar.Z;
        if (guVar2 == guVar) {
            return;
        }
        if (guVar2 != null) {
            guVar2.m(false);
        }
        huVar.Z = guVar;
        if (guVar != null) {
            guVar.m(true);
        }
    }

    @Override // org.telegram.messenger.fu
    public final int I() {
        gu[] guVarArr = this.W;
        int L = guVarArr.length == 0 ? g0.L(this.a.M + 18) : guVarArr[0].c();
        Rect rect = this.b;
        return g0.L(4.333f) + rect.top + L + rect.bottom;
    }

    @Override // org.telegram.messenger.fu
    public final int K() {
        Rect rect = this.b;
        return k0() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.fu
    public final boolean Q() {
        return this.a0 != null;
    }

    @Override // org.telegram.messenger.fu
    public final void T() {
        for (gu guVar : this.W) {
            guVar.a.i(this.V);
        }
    }

    @Override // org.telegram.messenger.fu
    public final void V() {
        for (gu guVar : this.W) {
            guVar.a.f(this.V);
        }
    }

    @Override // org.telegram.messenger.fu
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.V;
        if (view == null) {
            return false;
        }
        return this.b0.a(view, motionEvent);
    }

    public final int k0() {
        gu[] guVarArr = this.W;
        int length = guVarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * g0.L(7.0f);
        for (gu guVar : guVarArr) {
            L += guVar.h();
        }
        return Math.min(this.c, L);
    }

    public final void l0(int i7) {
        int i10;
        boolean z9;
        int i11;
        int i12;
        int i13;
        int i14;
        this.Y = i7;
        gu[] guVarArr = this.W;
        int length = guVarArr.length;
        if (length == 0) {
            return;
        }
        int L = g0.L(7.0f);
        int i15 = 1;
        int i16 = (length - 1) * L;
        int max = Math.max(0, i7 - i16);
        int i17 = 0;
        for (gu guVar : guVarArr) {
            int h = guVar.h();
            guVar.e = h;
            i17 += h;
        }
        int i18 = this.X;
        if (i17 > max) {
            int i19 = 0;
            for (gu guVar2 : guVarArr) {
                i19 += guVar2.e - guVar2.e();
            }
            if (i19 <= 0) {
                for (gu guVar3 : guVarArr) {
                    guVar3.e = guVar3.e();
                }
            } else {
                int min = Math.min(i17 - max, i19);
                int i20 = 0;
                int i21 = 0;
                while (i20 < guVarArr.length) {
                    gu guVar4 = guVarArr[i20];
                    int e10 = guVar4.e - guVar4.e();
                    if (i20 == guVarArr.length - i15) {
                        i14 = min - i21;
                        i12 = i15;
                        i13 = min;
                    } else {
                        i12 = i15;
                        i13 = min;
                        i14 = (int) ((min * e10) / i19);
                    }
                    int min2 = Math.min(i14, e10);
                    guVar4.e -= min2;
                    i21 += min2;
                    i20++;
                    i15 = i12;
                    min = i13;
                }
            }
            i10 = i15;
        } else {
            i10 = 1;
            if (i18 == 4) {
                boolean[] zArr = new boolean[guVarArr.length];
                int length2 = guVarArr.length;
                for (boolean z10 = true; z10 && length2 > 0; z10 = z9) {
                    int i22 = max / length2;
                    z9 = false;
                    for (int i23 = 0; i23 < guVarArr.length; i23++) {
                        if (!zArr[i23] && (i11 = guVarArr[i23].e) > i22) {
                            zArr[i23] = true;
                            max -= i11;
                            length2--;
                            z9 = true;
                        }
                    }
                }
                if (length2 > 0) {
                    int i24 = max / length2;
                    int i25 = max - (length2 * i24);
                    for (int i26 = 0; i26 < guVarArr.length; i26++) {
                        if (!zArr[i26]) {
                            int i27 = i25 - 1;
                            guVarArr[i26].e = (i25 > 0 ? 1 : 0) + i24;
                            i25 = i27;
                        }
                    }
                }
            }
        }
        for (gu guVar5 : guVarArr) {
            i16 += guVar5.e;
        }
        int c10 = p1.g.c(i18);
        int i28 = c10 != i10 ? c10 != 2 ? 0 : (i7 - i16) / 2 : i7 - i16;
        for (gu guVar6 : guVarArr) {
            guVar6.d = i28;
            i28 += guVar6.e + L;
        }
    }

    public final void m0() {
        kv kvVar = this.a;
        int i7 = kvVar.C;
        int i10 = kvVar.S;
        int i11 = ((i7 + i10) + kvVar.T) - (i10 * 2);
        Rect rect = this.b;
        int max = Math.max(0, (i11 - rect.left) - rect.right);
        if (this.Y != max) {
            l0(max);
        }
    }

    @Override // org.telegram.messenger.fu
    public final void q(Canvas canvas) {
        m0();
        for (gu guVar : this.W) {
            canvas.save();
            canvas.translate(guVar.d, Math.round((I() - guVar.c()) / 2.0f));
            guVar.a(canvas);
            canvas.restore();
        }
    }
}
