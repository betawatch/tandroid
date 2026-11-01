package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class tu extends ru {
    public final su[] W;
    public final int X;
    public int Y;
    public su Z;
    public su a0;
    public final ge.b b0;

    public tu(wv wvVar, Rect rect, int i10, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(wvVar, rect, i10);
        this.Y = -1;
        this.b0 = new ge.b(new l2.f(this, 11));
        this.W = new su[pageblockbuttonrow.buttons.size()];
        int size = pageblockbuttonrow.buttons.size();
        for (int i11 = 0; i11 < size; i11++) {
            su[] suVarArr = this.W;
            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i11);
            suVarArr[i11] = new su(wvVar, i10, wvVar.l(pageButton.text, wv.R(16, 13)), pageButton, pageButton.type, pageButton.style, sf.c.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), false, false, false, false, null, new ns(this, 6));
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

    public static su h0(tu tuVar, float f7, float f10) {
        tuVar.l0();
        su[] suVarArr = tuVar.W;
        int L = suVarArr.length == 0 ? i0.L(tuVar.a.M + 18) : suVarArr[0].c();
        float H = (tuVar.H() - L) / 2.0f;
        if (f10 < H || f10 > H + L) {
            return null;
        }
        for (su suVar : suVarArr) {
            if (f7 >= suVar.d && f7 <= r1 + suVar.e) {
                return suVar;
            }
        }
        return null;
    }

    public static void i0(tu tuVar, su suVar) {
        su suVar2 = tuVar.Z;
        if (suVar2 == suVar) {
            return;
        }
        if (suVar2 != null) {
            suVar2.m(false);
        }
        tuVar.Z = suVar;
        if (suVar != null) {
            suVar.m(true);
        }
    }

    @Override // org.telegram.messenger.ru
    public final int H() {
        su[] suVarArr = this.W;
        int L = suVarArr.length == 0 ? i0.L(this.a.M + 18) : suVarArr[0].c();
        Rect rect = this.b;
        return i0.L(4.333f) + rect.top + L + rect.bottom;
    }

    @Override // org.telegram.messenger.ru
    public final int J() {
        Rect rect = this.b;
        return j0() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.ru
    public final boolean P() {
        return this.a0 != null;
    }

    @Override // org.telegram.messenger.ru
    public final void S() {
        for (su suVar : this.W) {
            suVar.a.i(this.V);
        }
    }

    @Override // org.telegram.messenger.ru
    public final void U() {
        for (su suVar : this.W) {
            suVar.a.f(this.V);
        }
    }

    @Override // org.telegram.messenger.ru
    public final boolean X(MotionEvent motionEvent) {
        View view = this.V;
        if (view == null) {
            return false;
        }
        return this.b0.a(view, motionEvent);
    }

    public final int j0() {
        su[] suVarArr = this.W;
        int length = suVarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * i0.L(7.0f);
        for (su suVar : suVarArr) {
            L += suVar.h();
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
        su[] suVarArr = this.W;
        int length = suVarArr.length;
        if (length == 0) {
            return;
        }
        int L = i0.L(7.0f);
        int i16 = 1;
        int i17 = (length - 1) * L;
        int max = Math.max(0, i10 - i17);
        int i18 = 0;
        for (su suVar : suVarArr) {
            int h = suVar.h();
            suVar.e = h;
            i18 += h;
        }
        int i19 = this.X;
        if (i18 > max) {
            int i20 = 0;
            for (su suVar2 : suVarArr) {
                i20 += suVar2.e - suVar2.e();
            }
            if (i20 <= 0) {
                for (su suVar3 : suVarArr) {
                    suVar3.e = suVar3.e();
                }
            } else {
                int min = Math.min(i18 - max, i20);
                int i21 = 0;
                int i22 = 0;
                while (i21 < suVarArr.length) {
                    su suVar4 = suVarArr[i21];
                    int e = suVar4.e - suVar4.e();
                    if (i21 == suVarArr.length - i16) {
                        i15 = min - i22;
                        i13 = i16;
                        i14 = min;
                    } else {
                        i13 = i16;
                        i14 = min;
                        i15 = (int) ((min * e) / i20);
                    }
                    int min2 = Math.min(i15, e);
                    suVar4.e -= min2;
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
                boolean[] zArr = new boolean[suVarArr.length];
                int length2 = suVarArr.length;
                for (boolean z11 = true; z11 && length2 > 0; z11 = z10) {
                    int i23 = max / length2;
                    z10 = false;
                    for (int i24 = 0; i24 < suVarArr.length; i24++) {
                        if (!zArr[i24] && (i12 = suVarArr[i24].e) > i23) {
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
                    for (int i27 = 0; i27 < suVarArr.length; i27++) {
                        if (!zArr[i27]) {
                            int i28 = i26 - 1;
                            suVarArr[i27].e = (i26 > 0 ? 1 : 0) + i25;
                            i26 = i28;
                        }
                    }
                }
            }
        }
        for (su suVar5 : suVarArr) {
            i17 += suVar5.e;
        }
        int c10 = m1.j.c(i19);
        int i29 = c10 != i11 ? c10 != 2 ? 0 : (i10 - i17) / 2 : i10 - i17;
        for (su suVar6 : suVarArr) {
            suVar6.d = i29;
            i29 += suVar6.e + L;
        }
    }

    public final void l0() {
        wv wvVar = this.a;
        int i10 = wvVar.C;
        int i11 = wvVar.S;
        int i12 = ((i10 + i11) + wvVar.T) - (i11 * 2);
        Rect rect = this.b;
        int max = Math.max(0, (i12 - rect.left) - rect.right);
        if (this.Y != max) {
            k0(max);
        }
    }

    @Override // org.telegram.messenger.ru
    public final void q(Canvas canvas) {
        l0();
        for (su suVar : this.W) {
            canvas.save();
            canvas.translate(suVar.d, Math.round((H() - suVar.c()) / 2.0f));
            suVar.a(canvas);
            canvas.restore();
        }
    }
}
