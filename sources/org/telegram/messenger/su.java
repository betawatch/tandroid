package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class su extends qu {
    public final ru[] W;
    public final int X;
    public int Y;
    public ru Z;
    public ru a0;
    public final ge.b b0;

    public su(vv vvVar, Rect rect, int i10, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(vvVar, rect, i10);
        this.Y = -1;
        this.b0 = new ge.b(new l2.f(this, 11));
        this.W = new ru[pageblockbuttonrow.buttons.size()];
        int size = pageblockbuttonrow.buttons.size();
        for (int i11 = 0; i11 < size; i11++) {
            ru[] ruVarArr = this.W;
            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i11);
            ruVarArr[i11] = new ru(vvVar, i10, vvVar.l(pageButton.text, vv.R(16, 13)), pageButton, pageButton.type, pageButton.style, sf.c.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), false, false, false, false, null, new ms(this, 6));
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
        k0(j0());
    }

    public static ru h0(su suVar, float f7, float f10) {
        suVar.l0();
        ru[] ruVarArr = suVar.W;
        int L = ruVarArr.length == 0 ? i0.L(suVar.a.M + 18) : ruVarArr[0].c();
        float H = (suVar.H() - L) / 2.0f;
        if (f10 < H || f10 > H + L) {
            return null;
        }
        for (ru ruVar : ruVarArr) {
            if (f7 >= ruVar.d && f7 <= r1 + ruVar.e) {
                return ruVar;
            }
        }
        return null;
    }

    public static void i0(su suVar, ru ruVar) {
        ru ruVar2 = suVar.Z;
        if (ruVar2 == ruVar) {
            return;
        }
        if (ruVar2 != null) {
            ruVar2.m(false);
        }
        suVar.Z = ruVar;
        if (ruVar != null) {
            ruVar.m(true);
        }
    }

    @Override // org.telegram.messenger.qu
    public final int H() {
        ru[] ruVarArr = this.W;
        int L = ruVarArr.length == 0 ? i0.L(this.a.M + 18) : ruVarArr[0].c();
        Rect rect = this.b;
        return i0.L(4.333f) + rect.top + L + rect.bottom;
    }

    @Override // org.telegram.messenger.qu
    public final int J() {
        Rect rect = this.b;
        return j0() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.qu
    public final boolean P() {
        return this.a0 != null;
    }

    @Override // org.telegram.messenger.qu
    public final void S() {
        for (ru ruVar : this.W) {
            ruVar.a.i(this.V);
        }
    }

    @Override // org.telegram.messenger.qu
    public final void U() {
        for (ru ruVar : this.W) {
            ruVar.a.f(this.V);
        }
    }

    @Override // org.telegram.messenger.qu
    public final boolean X(MotionEvent motionEvent) {
        View view = this.V;
        if (view == null) {
            return false;
        }
        return this.b0.a(view, motionEvent);
    }

    public final int j0() {
        ru[] ruVarArr = this.W;
        int length = ruVarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * i0.L(7.0f);
        for (ru ruVar : ruVarArr) {
            L += ruVar.h();
        }
        return Math.min(this.c, L);
    }

    public final void k0(int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        this.Y = i10;
        ru[] ruVarArr = this.W;
        int length = ruVarArr.length;
        if (length == 0) {
            return;
        }
        int L = i0.L(7.0f);
        int i16 = 1;
        int i17 = (length - 1) * L;
        int max = Math.max(0, i10 - i17);
        int i18 = 0;
        for (ru ruVar : ruVarArr) {
            int h = ruVar.h();
            ruVar.e = h;
            i18 += h;
        }
        int i19 = this.X;
        if (i18 > max) {
            int i20 = 0;
            for (ru ruVar2 : ruVarArr) {
                i20 += ruVar2.e - ruVar2.e();
            }
            if (i20 <= 0) {
                for (ru ruVar3 : ruVarArr) {
                    ruVar3.e = ruVar3.e();
                }
            } else {
                int min = Math.min(i18 - max, i20);
                int i21 = 0;
                int i22 = 0;
                while (i21 < ruVarArr.length) {
                    ru ruVar4 = ruVarArr[i21];
                    int e = ruVar4.e - ruVar4.e();
                    if (i21 == ruVarArr.length - i16) {
                        i15 = min - i22;
                        i13 = i16;
                        i14 = min;
                    } else {
                        i13 = i16;
                        i14 = min;
                        i15 = (int) ((min * e) / i20);
                    }
                    int min2 = Math.min(i15, e);
                    ruVar4.e -= min2;
                    i22 += min2;
                    i21++;
                    i16 = i13;
                    min = i14;
                }
            }
            i11 = i16;
        } else {
            i11 = 1;
            if (i19 == 4) {
                boolean[] zArr = new boolean[ruVarArr.length];
                int length2 = ruVarArr.length;
                for (boolean z11 = true; z11 && length2 > 0; z11 = z10) {
                    int i23 = max / length2;
                    z10 = false;
                    for (int i24 = 0; i24 < ruVarArr.length; i24++) {
                        if (!zArr[i24] && (i12 = ruVarArr[i24].e) > i23) {
                            zArr[i24] = true;
                            max -= i12;
                            length2--;
                            z10 = true;
                        }
                    }
                }
                if (length2 > 0) {
                    int i25 = max / length2;
                    int i26 = max - (length2 * i25);
                    for (int i27 = 0; i27 < ruVarArr.length; i27++) {
                        if (!zArr[i27]) {
                            int i28 = i26 - 1;
                            ruVarArr[i27].e = (i26 > 0 ? 1 : 0) + i25;
                            i26 = i28;
                        }
                    }
                }
            }
        }
        for (ru ruVar5 : ruVarArr) {
            i17 += ruVar5.e;
        }
        int c10 = m1.j.c(i19);
        int i29 = c10 != i11 ? c10 != 2 ? 0 : (i10 - i17) / 2 : i10 - i17;
        for (ru ruVar6 : ruVarArr) {
            ruVar6.d = i29;
            i29 += ruVar6.e + L;
        }
    }

    public final void l0() {
        vv vvVar = this.a;
        int i10 = vvVar.C;
        int i11 = vvVar.S;
        int i12 = ((i10 + i11) + vvVar.T) - (i11 * 2);
        Rect rect = this.b;
        int max = Math.max(0, (i12 - rect.left) - rect.right);
        if (this.Y != max) {
            k0(max);
        }
    }

    @Override // org.telegram.messenger.qu
    public final void q(Canvas canvas) {
        l0();
        for (ru ruVar : this.W) {
            canvas.save();
            canvas.translate(ruVar.d, Math.round((H() - ruVar.c()) / 2.0f));
            ruVar.a(canvas);
            canvas.restore();
        }
    }
}
