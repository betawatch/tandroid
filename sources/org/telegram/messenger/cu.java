package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class cu extends au {
    public final bu[] X;
    public final int Y;
    public int Z;
    public bu a0;
    public bu b0;
    public final org.telegram.ui.Cells.m9 c0;

    public cu(fv fvVar, Rect rect, int i7, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(fvVar, rect, i7);
        this.Z = -1;
        this.c0 = new org.telegram.ui.Cells.m9(new h9.g1(this, 25));
        this.X = new bu[pageblockbuttonrow.buttons.size()];
        int size = pageblockbuttonrow.buttons.size();
        for (int i10 = 0; i10 < size; i10++) {
            bu[] buVarArr = this.X;
            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i10);
            buVarArr[i10] = new bu(fvVar, i7, fvVar.l(pageButton.text, fv.R(16, 13)), pageButton, pageButton.type, pageButton.style, cg.c.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), false, false, false, false, null, new yr(this, 5));
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

    public static bu i0(cu cuVar, float f10, float f11) {
        cuVar.m0();
        bu[] buVarArr = cuVar.X;
        int L = buVarArr.length == 0 ? g0.L(cuVar.a.M + 18) : buVarArr[0].c();
        float I = (cuVar.I() - L) / 2.0f;
        if (f11 < I || f11 > I + L) {
            return null;
        }
        for (bu buVar : buVarArr) {
            if (f10 >= buVar.d && f10 <= r1 + buVar.e) {
                return buVar;
            }
        }
        return null;
    }

    public static void j0(cu cuVar, bu buVar) {
        bu buVar2 = cuVar.a0;
        if (buVar2 == buVar) {
            return;
        }
        if (buVar2 != null) {
            buVar2.m(false);
        }
        cuVar.a0 = buVar;
        if (buVar != null) {
            buVar.m(true);
        }
    }

    @Override // org.telegram.messenger.au
    public final int I() {
        bu[] buVarArr = this.X;
        int L = buVarArr.length == 0 ? g0.L(this.a.M + 18) : buVarArr[0].c();
        Rect rect = this.b;
        return g0.L(4.333f) + rect.top + L + rect.bottom;
    }

    @Override // org.telegram.messenger.au
    public final int K() {
        Rect rect = this.b;
        return k0() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.au
    public final boolean Q() {
        return this.b0 != null;
    }

    @Override // org.telegram.messenger.au
    public final void T() {
        for (bu buVar : this.X) {
            buVar.a.i(this.W);
        }
    }

    @Override // org.telegram.messenger.au
    public final void V() {
        for (bu buVar : this.X) {
            buVar.a.f(this.W);
        }
    }

    @Override // org.telegram.messenger.au
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.W;
        if (view == null) {
            return false;
        }
        return this.c0.a(view, motionEvent);
    }

    public final int k0() {
        bu[] buVarArr = this.X;
        int length = buVarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * g0.L(7.0f);
        for (bu buVar : buVarArr) {
            L += buVar.h();
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
        bu[] buVarArr = this.X;
        int length = buVarArr.length;
        if (length == 0) {
            return;
        }
        int L = g0.L(7.0f);
        int i15 = 1;
        int i16 = (length - 1) * L;
        int max = Math.max(0, i7 - i16);
        int i17 = 0;
        for (bu buVar : buVarArr) {
            int h = buVar.h();
            buVar.e = h;
            i17 += h;
        }
        int i18 = this.Y;
        if (i17 > max) {
            int i19 = 0;
            for (bu buVar2 : buVarArr) {
                i19 += buVar2.e - buVar2.e();
            }
            if (i19 <= 0) {
                for (bu buVar3 : buVarArr) {
                    buVar3.e = buVar3.e();
                }
            } else {
                int min = Math.min(i17 - max, i19);
                int i20 = 0;
                int i21 = 0;
                while (i20 < buVarArr.length) {
                    bu buVar4 = buVarArr[i20];
                    int e10 = buVar4.e - buVar4.e();
                    if (i20 == buVarArr.length - i15) {
                        i14 = min - i21;
                        i12 = i15;
                        i13 = min;
                    } else {
                        i12 = i15;
                        i13 = min;
                        i14 = (int) ((min * e10) / i19);
                    }
                    int min2 = Math.min(i14, e10);
                    buVar4.e -= min2;
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
                boolean[] zArr = new boolean[buVarArr.length];
                int length2 = buVarArr.length;
                for (boolean z11 = true; z11 && length2 > 0; z11 = z10) {
                    int i22 = max / length2;
                    z10 = false;
                    for (int i23 = 0; i23 < buVarArr.length; i23++) {
                        if (!zArr[i23] && (i11 = buVarArr[i23].e) > i22) {
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
                    for (int i26 = 0; i26 < buVarArr.length; i26++) {
                        if (!zArr[i26]) {
                            int i27 = i25 - 1;
                            buVarArr[i26].e = (i25 > 0 ? 1 : 0) + i24;
                            i25 = i27;
                        }
                    }
                }
            }
        }
        for (bu buVar5 : buVarArr) {
            i16 += buVar5.e;
        }
        int c10 = p1.g.c(i18);
        int i28 = c10 != i10 ? c10 != 2 ? 0 : (i7 - i16) / 2 : i7 - i16;
        for (bu buVar6 : buVarArr) {
            buVar6.d = i28;
            i28 += buVar6.e + L;
        }
    }

    public final void m0() {
        fv fvVar = this.a;
        int i7 = fvVar.C;
        int i10 = fvVar.S;
        int i11 = ((i7 + i10) + fvVar.T) - (i10 * 2);
        Rect rect = this.b;
        int max = Math.max(0, (i11 - rect.left) - rect.right);
        if (this.Z != max) {
            l0(max);
        }
    }

    @Override // org.telegram.messenger.au
    public final void q(Canvas canvas) {
        m0();
        for (bu buVar : this.X) {
            canvas.save();
            canvas.translate(buVar.d, Math.round((I() - buVar.c()) / 2.0f));
            buVar.a(canvas);
            canvas.restore();
        }
    }
}
