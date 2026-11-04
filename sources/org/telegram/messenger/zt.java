package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class zt extends xt {
    public final yt[] X;
    public final int Y;
    public int Z;
    public yt a0;
    public yt b0;
    public final org.telegram.ui.Cells.k9 c0;

    public zt(cv cvVar, Rect rect, int i3, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(cvVar, rect, i3);
        this.Z = -1;
        this.c0 = new org.telegram.ui.Cells.k9(new gi.v5(this, 25));
        this.X = new yt[pageblockbuttonrow.buttons.size()];
        int size = pageblockbuttonrow.buttons.size();
        for (int i10 = 0; i10 < size; i10++) {
            yt[] ytVarArr = this.X;
            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i10);
            ytVarArr[i10] = new yt(cvVar, i3, cvVar.l(pageButton.text, cv.R(16, 13)), pageButton, pageButton.type, pageButton.style, dg.c.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), false, false, false, false, null, new vs(this, 5));
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

    public static yt i0(zt ztVar, float f10, float f11) {
        ztVar.m0();
        yt[] ytVarArr = ztVar.X;
        int L = ytVarArr.length == 0 ? g0.L(ztVar.a.M + 18) : ytVarArr[0].c();
        float I = (ztVar.I() - L) / 2.0f;
        if (f11 < I || f11 > I + L) {
            return null;
        }
        for (yt ytVar : ytVarArr) {
            if (f10 >= ytVar.d && f10 <= r1 + ytVar.e) {
                return ytVar;
            }
        }
        return null;
    }

    public static void j0(zt ztVar, yt ytVar) {
        yt ytVar2 = ztVar.a0;
        if (ytVar2 == ytVar) {
            return;
        }
        if (ytVar2 != null) {
            ytVar2.m(false);
        }
        ztVar.a0 = ytVar;
        if (ytVar != null) {
            ytVar.m(true);
        }
    }

    @Override // org.telegram.messenger.xt
    public final int I() {
        yt[] ytVarArr = this.X;
        int L = ytVarArr.length == 0 ? g0.L(this.a.M + 18) : ytVarArr[0].c();
        Rect rect = this.b;
        return g0.L(4.333f) + rect.top + L + rect.bottom;
    }

    @Override // org.telegram.messenger.xt
    public final int K() {
        Rect rect = this.b;
        return k0() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.xt
    public final boolean Q() {
        return this.b0 != null;
    }

    @Override // org.telegram.messenger.xt
    public final void T() {
        for (yt ytVar : this.X) {
            ytVar.a.i(this.W);
        }
    }

    @Override // org.telegram.messenger.xt
    public final void V() {
        for (yt ytVar : this.X) {
            ytVar.a.f(this.W);
        }
    }

    @Override // org.telegram.messenger.xt
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.W;
        if (view == null) {
            return false;
        }
        return this.c0.a(view, motionEvent);
    }

    public final int k0() {
        yt[] ytVarArr = this.X;
        int length = ytVarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * g0.L(7.0f);
        for (yt ytVar : ytVarArr) {
            L += ytVar.h();
        }
        return Math.min(this.c, L);
    }

    public final void l0(int i3) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        this.Z = i3;
        yt[] ytVarArr = this.X;
        int length = ytVarArr.length;
        if (length == 0) {
            return;
        }
        int L = g0.L(7.0f);
        int i15 = 1;
        int i16 = (length - 1) * L;
        int max = Math.max(0, i3 - i16);
        int i17 = 0;
        for (yt ytVar : ytVarArr) {
            int h = ytVar.h();
            ytVar.e = h;
            i17 += h;
        }
        int i18 = this.Y;
        if (i17 > max) {
            int i19 = 0;
            for (yt ytVar2 : ytVarArr) {
                i19 += ytVar2.e - ytVar2.e();
            }
            if (i19 <= 0) {
                for (yt ytVar3 : ytVarArr) {
                    ytVar3.e = ytVar3.e();
                }
            } else {
                int min = Math.min(i17 - max, i19);
                int i20 = 0;
                int i21 = 0;
                while (i20 < ytVarArr.length) {
                    yt ytVar4 = ytVarArr[i20];
                    int e10 = ytVar4.e - ytVar4.e();
                    if (i20 == ytVarArr.length - i15) {
                        i14 = min - i21;
                        i12 = i15;
                        i13 = min;
                    } else {
                        i12 = i15;
                        i13 = min;
                        i14 = (int) ((min * e10) / i19);
                    }
                    int min2 = Math.min(i14, e10);
                    ytVar4.e -= min2;
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
                boolean[] zArr = new boolean[ytVarArr.length];
                int length2 = ytVarArr.length;
                for (boolean z11 = true; z11 && length2 > 0; z11 = z10) {
                    int i22 = max / length2;
                    z10 = false;
                    for (int i23 = 0; i23 < ytVarArr.length; i23++) {
                        if (!zArr[i23] && (i11 = ytVarArr[i23].e) > i22) {
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
                    for (int i26 = 0; i26 < ytVarArr.length; i26++) {
                        if (!zArr[i26]) {
                            int i27 = i25 - 1;
                            ytVarArr[i26].e = (i25 > 0 ? 1 : 0) + i24;
                            i25 = i27;
                        }
                    }
                }
            }
        }
        for (yt ytVar5 : ytVarArr) {
            i16 += ytVar5.e;
        }
        int c2 = o1.g.c(i18);
        int i28 = c2 != i10 ? c2 != 2 ? 0 : (i3 - i16) / 2 : i3 - i16;
        for (yt ytVar6 : ytVarArr) {
            ytVar6.d = i28;
            i28 += ytVar6.e + L;
        }
    }

    public final void m0() {
        cv cvVar = this.a;
        int i3 = cvVar.C;
        int i10 = cvVar.S;
        int i11 = ((i3 + i10) + cvVar.T) - (i10 * 2);
        Rect rect = this.b;
        int max = Math.max(0, (i11 - rect.left) - rect.right);
        if (this.Z != max) {
            l0(max);
        }
    }

    @Override // org.telegram.messenger.xt
    public final void q(Canvas canvas) {
        m0();
        for (yt ytVar : this.X) {
            canvas.save();
            canvas.translate(ytVar.d, Math.round((I() - ytVar.c()) / 2.0f));
            ytVar.a(canvas);
            canvas.restore();
        }
    }
}
