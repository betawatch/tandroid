package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class eu extends cu {
    public final du[] X;
    public final int Y;
    public int Z;
    public du a0;
    public du b0;
    public final org.telegram.ui.Cells.k9 c0;

    public eu(iv ivVar, Rect rect, int i7, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(ivVar, rect, i7);
        this.Z = -1;
        this.c0 = new org.telegram.ui.Cells.k9(new hi.l0(this, 25));
        this.X = new du[pageblockbuttonrow.buttons.size()];
        int size = pageblockbuttonrow.buttons.size();
        for (int i10 = 0; i10 < size; i10++) {
            du[] duVarArr = this.X;
            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i10);
            duVarArr[i10] = new du(ivVar, i7, ivVar.l(pageButton.text, iv.R(16, 13)), pageButton, pageButton.type, pageButton.style, cg.c.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), false, false, false, false, null, new as(this, 5));
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
        l0(k0());
    }

    public static du i0(eu euVar, float f10, float f11) {
        euVar.m0();
        du[] duVarArr = euVar.X;
        int L = duVarArr.length == 0 ? g0.L(euVar.a.M + 18) : duVarArr[0].c();
        float I = (euVar.I() - L) / 2.0f;
        if (f11 < I || f11 > I + L) {
            return null;
        }
        for (du duVar : duVarArr) {
            if (f10 >= duVar.d && f10 <= r1 + duVar.e) {
                return duVar;
            }
        }
        return null;
    }

    public static void j0(eu euVar, du duVar) {
        du duVar2 = euVar.a0;
        if (duVar2 == duVar) {
            return;
        }
        if (duVar2 != null) {
            duVar2.m(false);
        }
        euVar.a0 = duVar;
        if (duVar != null) {
            duVar.m(true);
        }
    }

    @Override // org.telegram.messenger.cu
    public final int I() {
        du[] duVarArr = this.X;
        int L = duVarArr.length == 0 ? g0.L(this.a.M + 18) : duVarArr[0].c();
        Rect rect = this.b;
        return g0.L(4.333f) + rect.top + L + rect.bottom;
    }

    @Override // org.telegram.messenger.cu
    public final int K() {
        Rect rect = this.b;
        return k0() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.cu
    public final boolean Q() {
        return this.b0 != null;
    }

    @Override // org.telegram.messenger.cu
    public final void T() {
        for (du duVar : this.X) {
            duVar.a.i(this.W);
        }
    }

    @Override // org.telegram.messenger.cu
    public final void V() {
        for (du duVar : this.X) {
            duVar.a.f(this.W);
        }
    }

    @Override // org.telegram.messenger.cu
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.W;
        if (view == null) {
            return false;
        }
        return this.c0.a(view, motionEvent);
    }

    public final int k0() {
        du[] duVarArr = this.X;
        int length = duVarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * g0.L(7.0f);
        for (du duVar : duVarArr) {
            L += duVar.h();
        }
        return Math.min(this.c, L);
    }

    public final void l0(int i7) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        this.Z = i7;
        du[] duVarArr = this.X;
        int length = duVarArr.length;
        if (length == 0) {
            return;
        }
        int L = g0.L(7.0f);
        int i15 = 1;
        int i16 = (length - 1) * L;
        int max = Math.max(0, i7 - i16);
        int i17 = 0;
        for (du duVar : duVarArr) {
            int h = duVar.h();
            duVar.e = h;
            i17 += h;
        }
        int i18 = this.Y;
        if (i17 > max) {
            int i19 = 0;
            for (du duVar2 : duVarArr) {
                i19 += duVar2.e - duVar2.e();
            }
            if (i19 <= 0) {
                for (du duVar3 : duVarArr) {
                    duVar3.e = duVar3.e();
                }
            } else {
                int min = Math.min(i17 - max, i19);
                int i20 = 0;
                int i21 = 0;
                while (i20 < duVarArr.length) {
                    du duVar4 = duVarArr[i20];
                    int e10 = duVar4.e - duVar4.e();
                    if (i20 == duVarArr.length - i15) {
                        i14 = min - i21;
                        i12 = i15;
                        i13 = min;
                    } else {
                        i12 = i15;
                        i13 = min;
                        i14 = (int) ((min * e10) / i19);
                    }
                    int min2 = Math.min(i14, e10);
                    duVar4.e -= min2;
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
                boolean[] zArr = new boolean[duVarArr.length];
                int length2 = duVarArr.length;
                for (boolean z11 = true; z11 && length2 > 0; z11 = z10) {
                    int i22 = max / length2;
                    z10 = false;
                    for (int i23 = 0; i23 < duVarArr.length; i23++) {
                        if (!zArr[i23] && (i11 = duVarArr[i23].e) > i22) {
                            zArr[i23] = true;
                            max -= i11;
                            length2--;
                            z10 = true;
                        }
                    }
                }
                if (length2 > 0) {
                    int i24 = max / length2;
                    int i25 = max - (length2 * i24);
                    for (int i26 = 0; i26 < duVarArr.length; i26++) {
                        if (!zArr[i26]) {
                            int i27 = i25 - 1;
                            duVarArr[i26].e = (i25 > 0 ? 1 : 0) + i24;
                            i25 = i27;
                        }
                    }
                }
            }
        }
        for (du duVar5 : duVarArr) {
            i16 += duVar5.e;
        }
        int c10 = p1.g.c(i18);
        int i28 = c10 != i10 ? c10 != 2 ? 0 : (i7 - i16) / 2 : i7 - i16;
        for (du duVar6 : duVarArr) {
            duVar6.d = i28;
            i28 += duVar6.e + L;
        }
    }

    public final void m0() {
        iv ivVar = this.a;
        int i7 = ivVar.C;
        int i10 = ivVar.S;
        int i11 = ((i7 + i10) + ivVar.T) - (i10 * 2);
        Rect rect = this.b;
        int max = Math.max(0, (i11 - rect.left) - rect.right);
        if (this.Z != max) {
            l0(max);
        }
    }

    @Override // org.telegram.messenger.cu
    public final void q(Canvas canvas) {
        m0();
        for (du duVar : this.X) {
            canvas.save();
            canvas.translate(duVar.d, Math.round((I() - duVar.c()) / 2.0f));
            duVar.a(canvas);
            canvas.restore();
        }
    }
}
