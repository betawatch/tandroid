package org.telegram.ui.Components;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bw implements kl0, xd.b, nm0, ug.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ kz b;

    public /* synthetic */ bw(kz kzVar, int i10) {
        this.a = i10;
        this.b = kzVar;
    }

    @Override // xd.b
    public void L(int i10, float f10, float f11, xd.c cVar) {
        this.b.T();
    }

    @Override // org.telegram.ui.Components.nm0
    public void a(int i10) {
        int i11;
        vy vyVar;
        switch (this.a) {
            case 2:
                kz kzVar = this.b;
                py pyVar = kzVar.f0;
                int i12 = kzVar.Z0;
                oy oyVar = kzVar.k0;
                ry ryVar = kzVar.h0;
                if (i10 != kzVar.p0 || !oyVar.x.isEmpty()) {
                    kzVar.e0.B0();
                    kzVar.m0.k(i10, 0);
                    if (i10 == kzVar.o0 || i10 == kzVar.p0) {
                        kzVar.l0.d.setText("");
                        if (i10 != kzVar.p0 || (i11 = oyVar.F) < 1) {
                            ky kyVar = kzVar.q1;
                            pyVar.h1((kyVar == null || !kyVar.A()) ? 1 : 0, 0);
                        } else {
                            pyVar.h1(i11, -AndroidUtilities.dp(4.0f));
                        }
                        if (i10 == kzVar.p0) {
                            ArrayList<String> arrayList = MessagesController.getInstance(i12).gifSearchEmojies;
                            if (!arrayList.isEmpty()) {
                                ryVar.a(arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList<String> arrayList2 = MessagesController.getInstance(i12).gifSearchEmojies;
                        kzVar.g0.H(arrayList2.get(i10 - kzVar.q0));
                        int i13 = i10 - kzVar.q0;
                        if (i13 > 0) {
                            ryVar.a(arrayList2.get(i13 - 1), true);
                        }
                        if (i10 - kzVar.q0 < arrayList2.size() - 1) {
                            ryVar.a(arrayList2.get((i10 - kzVar.q0) + 1), true);
                        }
                    }
                    kzVar.G(2);
                    break;
                }
                break;
            default:
                kz kzVar2 = this.b;
                sw swVar = kzVar2.D0;
                ArrayList arrayList3 = kzVar2.a1;
                tw twVar = kzVar2.y0;
                bz bzVar = kzVar2.v0;
                pw pwVar = kzVar2.A0;
                if (!kzVar2.P0) {
                    if (i10 != kzVar2.E1) {
                        if (swVar != null && (vyVar = swVar.r) != null && vyVar.getSelectedCategory() != null) {
                            swVar.c(null, false);
                            vyVar.F1(null);
                        }
                        if (i10 != kzVar2.C1) {
                            if (i10 != kzVar2.D1) {
                                if (i10 != kzVar2.F1) {
                                    int i14 = i10 - kzVar2.B1;
                                    if (i14 < arrayList3.size()) {
                                        if (i14 >= arrayList3.size()) {
                                            i14 = arrayList3.size() - 1;
                                        }
                                        kzVar2.F0 = false;
                                        pwVar.B0();
                                        kzVar2.I(bzVar.E(arrayList3.get(i14)), 0);
                                        kzVar2.G(0);
                                        kzVar2.p(0);
                                        int i15 = kzVar2.D1;
                                        if (i15 <= 0 && (i15 = kzVar2.C1) <= 0) {
                                            i15 = kzVar2.B1;
                                        }
                                        twVar.k(i10, i15);
                                        kzVar2.U1 = false;
                                        kzVar2.a0();
                                        break;
                                    }
                                } else {
                                    pwVar.B0();
                                    kzVar2.I(bzVar.E("premium"), 0);
                                    kzVar2.G(0);
                                    int i16 = kzVar2.F1;
                                    twVar.k(i16, i16 > 0 ? i16 : kzVar2.B1);
                                    break;
                                }
                            } else {
                                pwVar.B0();
                                kzVar2.I(bzVar.E("fav"), 0);
                                kzVar2.G(0);
                                int i17 = kzVar2.D1;
                                twVar.k(i17, i17 > 0 ? i17 : kzVar2.B1);
                                break;
                            }
                        } else {
                            pwVar.B0();
                            kzVar2.I(bzVar.E("recent"), 0);
                            kzVar2.G(0);
                            int i18 = kzVar2.C1;
                            twVar.k(i18, i18 > 0 ? i18 : kzVar2.B1);
                            break;
                        }
                    } else {
                        kzVar2.q1.o(new e51(kzVar2.getContext(), new cx(kzVar2), kzVar2.u1, kzVar2.v1, kzVar2.w1, null, kzVar2.W1));
                        break;
                    }
                }
                break;
        }
    }

    @Override // ug.g
    public void d(RectF rectF, View view) {
        this.b.C();
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        String str;
        int i11;
        kz kzVar = this.b;
        int i12 = kzVar.z1;
        ix ixVar = kzVar.M;
        int[] iArr = kzVar.A1;
        ru ruVar = kzVar.y1;
        if (!(view instanceof sy)) {
            return false;
        }
        sy syVar = (sy) view;
        if (syVar.c) {
            View F = ixVar.F(view);
            f2.l1 T = F != null ? ixVar.T(F) : null;
            if (T != null && T.b() <= kzVar.getRecentEmoji().size()) {
                kzVar.q1.n();
            }
            ixVar.w1(view);
            return true;
        }
        if (syVar.getSpan() != null || (str = (String) syVar.getTag()) == null) {
            return false;
        }
        String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
        String str2 = syVar.c ? null : Emoji.emojiColor.get(replace);
        boolean isCompound = CompoundEmoji.isCompound(replace);
        if (!isCompound && !EmojiData.emojiColoredMap.contains(replace)) {
            return false;
        }
        kzVar.O1 = syVar;
        kzVar.R1 = kzVar.P1;
        kzVar.S1 = kzVar.Q1;
        if (isCompound) {
            replace = kz.g(replace, str2);
        } else {
            int indexOf = CompoundEmoji.skinTones.indexOf(str2) + 1;
            qu quVar = ruVar.c;
            int[] iArr2 = quVar.n;
            if (iArr2[0] != indexOf) {
                iArr2[0] = indexOf;
                quVar.invalidate();
            }
        }
        ruVar.getClass();
        qu quVar2 = ruVar.c;
        int i13 = ruVar.e;
        boolean z4 = CompoundEmoji.getCompoundEmojiDrawable(replace) != null;
        ruVar.d = z4;
        Drawable[] drawableArr = quVar2.b;
        int[] iArr3 = quVar2.n;
        quVar2.f = z4;
        quVar2.e = replace;
        if (z4) {
            drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
            drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(quVar2.e, 0, -2);
            drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(quVar2.e, 1, -2);
            drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(quVar2.e, 2, -2);
            drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(quVar2.e, 3, -2);
            drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(quVar2.e, 4, -2);
            drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(quVar2.e, -2, 0);
            drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(quVar2.e, -2, 1);
            drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(quVar2.e, -2, 2);
            drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(quVar2.e, -2, 3);
            drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(quVar2.e, -2, 4);
            Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
            if (isHandshake != null) {
                int intValue = ((Integer) isHandshake.first).intValue();
                if (iArr3[0] != intValue) {
                    iArr3[0] = intValue;
                    quVar2.invalidate();
                }
                int intValue2 = ((Integer) isHandshake.second).intValue();
                if (iArr3[1] != intValue2) {
                    iArr3[1] = intValue2;
                    quVar2.invalidate();
                }
                quVar2.D = iArr3[0] == iArr3[1];
            }
            quVar2.F = true;
        } else {
            int i14 = 0;
            while (i14 < 6) {
                drawableArr[i14] = Emoji.getEmojiBigDrawable(i14 != 0 ? kz.g(replace, CompoundEmoji.skinTones.get(i14 - 1)) : replace);
                i14++;
            }
        }
        quVar2.invalidate();
        ruVar.setWidth(AndroidUtilities.dp((ruVar.d ? 3 : 0) + 30) + (i13 * 6));
        ruVar.setHeight(((ruVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(ruVar.d ? 11.66f : 15.0f));
        int dp = AndroidUtilities.dp((ruVar.d ? 3 : 0) + 30) + (i13 * 6);
        int dp2 = ((ruVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(ruVar.d ? 11.66f : 15.0f);
        syVar.getLocationOnScreen(iArr);
        if (ruVar.d) {
            i11 = 0;
        } else {
            i11 = AndroidUtilities.dp((r3 * 4) - (AndroidUtilities.isTablet() ? 5 : 1)) + (quVar2.n[0] * i12);
        }
        if (iArr[0] - i11 < AndroidUtilities.dp(5.0f)) {
            i11 = org.telegram.ui.b.C(5.0f, iArr[0] - i11, i11);
        } else if ((iArr[0] - i11) + dp > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
            i11 += ((iArr[0] - i11) + dp) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
        }
        int i15 = -i11;
        int top = syVar.getTop() < 0 ? syVar.getTop() : 0;
        quVar2.setArrowX((AndroidUtilities.dp(AndroidUtilities.isTablet() ? 30.0f : 22.0f) - i15) + ((int) AndroidUtilities.dpf2(0.5f)));
        ruVar.setFocusable(true);
        ruVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i12) / 2) + ((-view.getMeasuredHeight()) - dp2)) - top);
        kzVar.h.requestDisallowInterceptTouchEvent(true);
        ixVar.d1(true);
        ixVar.w1(view);
        return true;
    }

    @Override // xd.b
    public /* synthetic */ void z(float f10, int i10) {
    }
}
