package org.telegram.ui.Components;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fw implements li.c, ml0, sm0, le.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ lz b;

    public /* synthetic */ fw(lz lzVar, int i10) {
        this.a = i10;
        this.b = lzVar;
    }

    @Override // le.e
    public void D(int i10, float f7, float f10, le.f fVar) {
        this.b.R();
    }

    @Override // org.telegram.ui.Components.sm0
    public void a(int i10) {
        int i11;
        xy xyVar;
        switch (this.a) {
            case 2:
                lz lzVar = this.b;
                ry ryVar = lzVar.i0;
                int i12 = lzVar.c1;
                qy qyVar = lzVar.n0;
                ty tyVar = lzVar.k0;
                if (i10 != lzVar.s0 || !qyVar.x.isEmpty()) {
                    lzVar.h0.B0();
                    lzVar.p0.k(i10, 0);
                    if (i10 == lzVar.r0 || i10 == lzVar.s0) {
                        lzVar.o0.d.setText("");
                        if (i10 != lzVar.s0 || (i11 = qyVar.I) < 1) {
                            my myVar = lzVar.t1;
                            ryVar.h1((myVar == null || !myVar.A()) ? 1 : 0, 0);
                        } else {
                            ryVar.h1(i11, -AndroidUtilities.dp(4.0f));
                        }
                        if (i10 == lzVar.s0) {
                            ArrayList<String> arrayList = MessagesController.getInstance(i12).gifSearchEmojies;
                            if (!arrayList.isEmpty()) {
                                tyVar.a(arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList<String> arrayList2 = MessagesController.getInstance(i12).gifSearchEmojies;
                        lzVar.j0.H(arrayList2.get(i10 - lzVar.t0));
                        int i13 = i10 - lzVar.t0;
                        if (i13 > 0) {
                            tyVar.a(arrayList2.get(i13 - 1), true);
                        }
                        if (i10 - lzVar.t0 < arrayList2.size() - 1) {
                            tyVar.a(arrayList2.get((i10 - lzVar.t0) + 1), true);
                        }
                    }
                    lzVar.F(2);
                    break;
                }
                break;
            default:
                lz lzVar2 = this.b;
                xw xwVar = lzVar2.G0;
                ArrayList arrayList3 = lzVar2.d1;
                yw ywVar = lzVar2.B0;
                cz czVar = lzVar2.y0;
                tw twVar = lzVar2.D0;
                if (!lzVar2.S0) {
                    if (i10 != lzVar2.H1) {
                        if (xwVar != null && (xyVar = xwVar.r) != null && xyVar.getSelectedCategory() != null) {
                            xwVar.c(null, false);
                            xyVar.F1(null);
                        }
                        if (i10 != lzVar2.F1) {
                            if (i10 != lzVar2.G1) {
                                if (i10 != lzVar2.I1) {
                                    int i14 = i10 - lzVar2.E1;
                                    if (i14 < arrayList3.size()) {
                                        if (i14 >= arrayList3.size()) {
                                            i14 = arrayList3.size() - 1;
                                        }
                                        lzVar2.I0 = false;
                                        twVar.B0();
                                        lzVar2.H(czVar.E(arrayList3.get(i14)), 0);
                                        lzVar2.F(0);
                                        lzVar2.p(0);
                                        int i15 = lzVar2.G1;
                                        if (i15 <= 0 && (i15 = lzVar2.F1) <= 0) {
                                            i15 = lzVar2.E1;
                                        }
                                        ywVar.k(i10, i15);
                                        lzVar2.X1 = false;
                                        lzVar2.Y();
                                        break;
                                    }
                                } else {
                                    twVar.B0();
                                    lzVar2.H(czVar.E("premium"), 0);
                                    lzVar2.F(0);
                                    int i16 = lzVar2.I1;
                                    ywVar.k(i16, i16 > 0 ? i16 : lzVar2.E1);
                                    break;
                                }
                            } else {
                                twVar.B0();
                                lzVar2.H(czVar.E("fav"), 0);
                                lzVar2.F(0);
                                int i17 = lzVar2.G1;
                                ywVar.k(i17, i17 > 0 ? i17 : lzVar2.E1);
                                break;
                            }
                        } else {
                            twVar.B0();
                            lzVar2.H(czVar.E("recent"), 0);
                            lzVar2.F(0);
                            int i18 = lzVar2.F1;
                            ywVar.k(i18, i18 > 0 ? i18 : lzVar2.E1);
                            break;
                        }
                    } else {
                        lzVar2.t1.o(new r51(lzVar2.getContext(), new gx(lzVar2), lzVar2.x1, lzVar2.y1, lzVar2.z1, null, lzVar2.Z1));
                        break;
                    }
                }
                break;
        }
    }

    @Override // li.c
    public void b(int i10) {
        lz lzVar = this.b;
        ah.h hVar = lzVar.j2;
        RectF rectF = lzVar.y2;
        if (Build.VERSION.SDK_INT < 31 || hVar == null) {
            return;
        }
        hh.k.c(lzVar.w, lzVar, rectF);
        rectF.inset(LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f), LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        rectF.right = lzVar.getMeasuredWidth();
        rectF.bottom = Math.min(rectF.bottom, lzVar.getMeasuredHeight());
        hVar.g(!rectF.isEmpty() ? 1 : 0, lzVar.z2);
        hVar.e(lzVar.k2, lzVar.getWidth(), lzVar.getHeight());
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        String str;
        int i11;
        lz lzVar = this.b;
        int i12 = lzVar.C1;
        xx xxVar = lzVar.P;
        int[] iArr = lzVar.D1;
        yu yuVar = lzVar.B1;
        if (!(view instanceof uy)) {
            return false;
        }
        uy uyVar = (uy) view;
        if (uyVar.c) {
            View F = xxVar.F(view);
            s4.c1 T = F != null ? xxVar.T(F) : null;
            if (T != null && T.b() <= lzVar.getRecentEmoji().size()) {
                lzVar.t1.n();
            }
            xxVar.x1(view);
            return true;
        }
        if (uyVar.getSpan() != null || (str = (String) uyVar.getTag()) == null) {
            return false;
        }
        String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
        String str2 = uyVar.c ? null : Emoji.emojiColor.get(replace);
        boolean isCompound = CompoundEmoji.isCompound(replace);
        if (!isCompound && !EmojiData.emojiColoredMap.contains(replace)) {
            return false;
        }
        lzVar.R1 = uyVar;
        lzVar.U1 = lzVar.S1;
        lzVar.V1 = lzVar.T1;
        if (isCompound) {
            replace = lz.g(replace, str2);
        } else {
            int indexOf = CompoundEmoji.skinTones.indexOf(str2) + 1;
            xu xuVar = yuVar.c;
            int[] iArr2 = xuVar.n;
            if (iArr2[0] != indexOf) {
                iArr2[0] = indexOf;
                xuVar.invalidate();
            }
        }
        yuVar.getClass();
        xu xuVar2 = yuVar.c;
        int i13 = yuVar.e;
        boolean z10 = CompoundEmoji.getCompoundEmojiDrawable(replace) != null;
        yuVar.d = z10;
        Drawable[] drawableArr = xuVar2.b;
        int[] iArr3 = xuVar2.n;
        xuVar2.f = z10;
        xuVar2.e = replace;
        if (z10) {
            drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
            drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(xuVar2.e, 0, -2);
            drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(xuVar2.e, 1, -2);
            drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(xuVar2.e, 2, -2);
            drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(xuVar2.e, 3, -2);
            drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(xuVar2.e, 4, -2);
            drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(xuVar2.e, -2, 0);
            drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(xuVar2.e, -2, 1);
            drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(xuVar2.e, -2, 2);
            drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(xuVar2.e, -2, 3);
            drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(xuVar2.e, -2, 4);
            Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
            if (isHandshake != null) {
                int intValue = ((Integer) isHandshake.first).intValue();
                if (iArr3[0] != intValue) {
                    iArr3[0] = intValue;
                    xuVar2.invalidate();
                }
                int intValue2 = ((Integer) isHandshake.second).intValue();
                if (iArr3[1] != intValue2) {
                    iArr3[1] = intValue2;
                    xuVar2.invalidate();
                }
                xuVar2.G = iArr3[0] == iArr3[1];
            }
            xuVar2.I = true;
        } else {
            int i14 = 0;
            while (i14 < 6) {
                drawableArr[i14] = Emoji.getEmojiBigDrawable(i14 != 0 ? lz.g(replace, CompoundEmoji.skinTones.get(i14 - 1)) : replace);
                i14++;
            }
        }
        xuVar2.invalidate();
        yuVar.setWidth(AndroidUtilities.dp((yuVar.d ? 3 : 0) + 30) + (i13 * 6));
        yuVar.setHeight(((yuVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(yuVar.d ? 11.66f : 15.0f));
        int dp = AndroidUtilities.dp((yuVar.d ? 3 : 0) + 30) + (i13 * 6);
        int dp2 = ((yuVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(yuVar.d ? 11.66f : 15.0f);
        uyVar.getLocationOnScreen(iArr);
        if (yuVar.d) {
            i11 = 0;
        } else {
            i11 = AndroidUtilities.dp((r3 * 4) - (AndroidUtilities.isTablet() ? 5 : 1)) + (xuVar2.n[0] * i12);
        }
        if (iArr[0] - i11 < AndroidUtilities.dp(5.0f)) {
            i11 = org.telegram.messenger.ok.D(5.0f, iArr[0] - i11, i11);
        } else if ((iArr[0] - i11) + dp > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
            i11 += ((iArr[0] - i11) + dp) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
        }
        int i15 = -i11;
        int top = uyVar.getTop() < 0 ? uyVar.getTop() : 0;
        xuVar2.setArrowX((AndroidUtilities.dp(AndroidUtilities.isTablet() ? 30.0f : 22.0f) - i15) + ((int) AndroidUtilities.dpf2(0.5f)));
        yuVar.setFocusable(true);
        yuVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i12) / 2) + ((-view.getMeasuredHeight()) - dp2)) - top);
        lzVar.h.requestDisallowInterceptTouchEvent(true);
        xxVar.d1(true);
        xxVar.x1(view);
        return true;
    }

    @Override // le.e
    public /* synthetic */ void C(float f7, int i10) {
    }
}
