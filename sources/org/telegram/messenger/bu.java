package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class bu extends zt {
    public final au[] X;
    public final int Y;
    public int Z;
    public au a0;
    public au b0;
    public final org.telegram.ui.Cells.l9 c0;

    public bu(ev evVar, Rect rect, int i7, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(evVar, rect, i7);
        this.Z = -1;
        this.c0 = new org.telegram.ui.Cells.l9(new j6.r(this, 22));
        this.X = new au[pageblockbuttonrow.buttons.size()];
        int size = pageblockbuttonrow.buttons.size();
        for (int i10 = 0; i10 < size; i10++) {
            au[] auVarArr = this.X;
            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i10);
            auVarArr[i10] = new au(evVar, i7, evVar.l(pageButton.text, ev.R(16, 13)), pageButton, pageButton.type, pageButton.style, cg.c.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), false, false, false, false, null, new xr(this, 5));
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

    public static au i0(bu buVar, float f10, float f11) {
        buVar.m0();
        au[] auVarArr = buVar.X;
        int L = auVarArr.length == 0 ? g0.L(buVar.a.M + 18) : auVarArr[0].d();
        float I = (buVar.I() - L) / 2.0f;
        if (f11 < I || f11 > I + L) {
            return null;
        }
        for (au auVar : auVarArr) {
            if (f10 >= auVar.d && f10 <= r1 + auVar.e) {
                return auVar;
            }
        }
        return null;
    }

    public static void j0(bu buVar, au auVar) {
        au auVar2 = buVar.a0;
        if (auVar2 == auVar) {
            return;
        }
        if (auVar2 != null) {
            auVar2.n(false);
        }
        buVar.a0 = auVar;
        if (auVar != null) {
            auVar.n(true);
        }
    }

    @Override // org.telegram.messenger.zt
    public final int I() {
        au[] auVarArr = this.X;
        int L = auVarArr.length == 0 ? g0.L(this.a.M + 18) : auVarArr[0].d();
        Rect rect = this.b;
        return g0.L(4.333f) + rect.top + L + rect.bottom;
    }

    @Override // org.telegram.messenger.zt
    public final int K() {
        Rect rect = this.b;
        return k0() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.zt
    public final boolean Q() {
        return this.b0 != null;
    }

    @Override // org.telegram.messenger.zt
    public final void T() {
        for (au auVar : this.X) {
            auVar.a(this.W);
        }
    }

    @Override // org.telegram.messenger.zt
    public final void V() {
        for (au auVar : this.X) {
            auVar.a.f(this.W);
        }
    }

    @Override // org.telegram.messenger.zt
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.W;
        if (view == null) {
            return false;
        }
        return this.c0.a(view, motionEvent);
    }

    public final int k0() {
        au[] auVarArr = this.X;
        int length = auVarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * g0.L(7.0f);
        for (au auVar : auVarArr) {
            L += auVar.i();
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
        au[] auVarArr = this.X;
        int length = auVarArr.length;
        if (length == 0) {
            return;
        }
        int L = g0.L(7.0f);
        int i15 = 1;
        int i16 = (length - 1) * L;
        int max = Math.max(0, i7 - i16);
        int i17 = 0;
        for (au auVar : auVarArr) {
            int i18 = auVar.i();
            auVar.e = i18;
            i17 += i18;
        }
        int i19 = this.Y;
        if (i17 > max) {
            int i20 = 0;
            for (au auVar2 : auVarArr) {
                i20 += auVar2.e - auVar2.f();
            }
            if (i20 <= 0) {
                for (au auVar3 : auVarArr) {
                    auVar3.e = auVar3.f();
                }
            } else {
                int min = Math.min(i17 - max, i20);
                int i21 = 0;
                int i22 = 0;
                while (i21 < auVarArr.length) {
                    au auVar4 = auVarArr[i21];
                    int f10 = auVar4.e - auVar4.f();
                    if (i21 == auVarArr.length - i15) {
                        i14 = min - i22;
                        i12 = i15;
                        i13 = min;
                    } else {
                        i12 = i15;
                        i13 = min;
                        i14 = (int) ((min * f10) / i20);
                    }
                    int min2 = Math.min(i14, f10);
                    auVar4.e -= min2;
                    i22 += min2;
                    i21++;
                    i15 = i12;
                    min = i13;
                }
            }
            i10 = i15;
        } else {
            i10 = 1;
            if (i19 == 4) {
                boolean[] zArr = new boolean[auVarArr.length];
                int length2 = auVarArr.length;
                for (boolean z11 = true; z11 && length2 > 0; z11 = z10) {
                    int i23 = max / length2;
                    z10 = false;
                    for (int i24 = 0; i24 < auVarArr.length; i24++) {
                        if (!zArr[i24] && (i11 = auVarArr[i24].e) > i23) {
                            zArr[i24] = true;
                            max -= i11;
                            length2--;
                            z10 = true;
                        }
                    }
                }
                if (length2 > 0) {
                    int i25 = max / length2;
                    int i26 = max - (length2 * i25);
                    for (int i27 = 0; i27 < auVarArr.length; i27++) {
                        if (!zArr[i27]) {
                            int i28 = i26 - 1;
                            auVarArr[i27].e = (i26 > 0 ? 1 : 0) + i25;
                            i26 = i28;
                        }
                    }
                }
            }
        }
        for (au auVar5 : auVarArr) {
            i16 += auVar5.e;
        }
        int c10 = p1.g.c(i19);
        int i29 = c10 != i10 ? c10 != 2 ? 0 : (i7 - i16) / 2 : i7 - i16;
        for (au auVar6 : auVarArr) {
            auVar6.d = i29;
            i29 += auVar6.e + L;
        }
    }

    public final void m0() {
        ev evVar = this.a;
        int i7 = evVar.C;
        int i10 = evVar.S;
        int i11 = ((i7 + i10) + evVar.T) - (i10 * 2);
        Rect rect = this.b;
        int max = Math.max(0, (i11 - rect.left) - rect.right);
        if (this.Z != max) {
            l0(max);
        }
    }

    @Override // org.telegram.messenger.zt
    public final void q(Canvas canvas) {
        m0();
        for (au auVar : this.X) {
            canvas.save();
            canvas.translate(auVar.d, Math.round((I() - auVar.d()) / 2.0f));
            auVar.b(canvas);
            canvas.restore();
        }
    }
}
