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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qv implements rk0, ud.b, tl0, qg.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;

    public /* synthetic */ qv(yy yyVar, int i10) {
        this.a = i10;
        this.b = yyVar;
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        String str;
        int i11;
        yy yyVar = this.b;
        int i12 = yyVar.y1;
        ww wwVar = yyVar.L;
        int[] iArr = yyVar.z1;
        hu huVar = yyVar.x1;
        if (!(view instanceof gy)) {
            return false;
        }
        gy gyVar = (gy) view;
        if (gyVar.c) {
            View F = wwVar.F(view);
            f2.o1 T = F != null ? wwVar.T(F) : null;
            if (T != null && T.b() <= yyVar.getRecentEmoji().size()) {
                yyVar.p1.n();
            }
            wwVar.w1(view);
            return true;
        }
        if (gyVar.getSpan() != null || (str = (String) gyVar.getTag()) == null) {
            return false;
        }
        String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
        String str2 = gyVar.c ? null : Emoji.emojiColor.get(replace);
        boolean isCompound = CompoundEmoji.isCompound(replace);
        if (!isCompound && !EmojiData.emojiColoredMap.contains(replace)) {
            return false;
        }
        yyVar.N1 = gyVar;
        yyVar.Q1 = yyVar.O1;
        yyVar.R1 = yyVar.P1;
        if (isCompound) {
            replace = yy.g(replace, str2);
        } else {
            int indexOf = CompoundEmoji.skinTones.indexOf(str2) + 1;
            gu guVar = huVar.c;
            int[] iArr2 = guVar.n;
            if (iArr2[0] != indexOf) {
                iArr2[0] = indexOf;
                guVar.invalidate();
            }
        }
        huVar.getClass();
        gu guVar2 = huVar.c;
        int i13 = huVar.e;
        boolean z10 = CompoundEmoji.getCompoundEmojiDrawable(replace) != null;
        huVar.d = z10;
        Drawable[] drawableArr = guVar2.b;
        int[] iArr3 = guVar2.n;
        guVar2.f = z10;
        guVar2.e = replace;
        if (z10) {
            drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
            drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(guVar2.e, 0, -2);
            drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(guVar2.e, 1, -2);
            drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(guVar2.e, 2, -2);
            drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(guVar2.e, 3, -2);
            drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(guVar2.e, 4, -2);
            drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(guVar2.e, -2, 0);
            drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(guVar2.e, -2, 1);
            drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(guVar2.e, -2, 2);
            drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(guVar2.e, -2, 3);
            drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(guVar2.e, -2, 4);
            Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
            if (isHandshake != null) {
                int intValue = ((Integer) isHandshake.first).intValue();
                if (iArr3[0] != intValue) {
                    iArr3[0] = intValue;
                    guVar2.invalidate();
                }
                int intValue2 = ((Integer) isHandshake.second).intValue();
                if (iArr3[1] != intValue2) {
                    iArr3[1] = intValue2;
                    guVar2.invalidate();
                }
                guVar2.C = iArr3[0] == iArr3[1];
            }
            guVar2.E = true;
        } else {
            int i14 = 0;
            while (i14 < 6) {
                drawableArr[i14] = Emoji.getEmojiBigDrawable(i14 != 0 ? yy.g(replace, CompoundEmoji.skinTones.get(i14 - 1)) : replace);
                i14++;
            }
        }
        guVar2.invalidate();
        huVar.setWidth(AndroidUtilities.dp((huVar.d ? 3 : 0) + 30) + (i13 * 6));
        huVar.setHeight(((huVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(huVar.d ? 11.66f : 15.0f));
        int dp = AndroidUtilities.dp((huVar.d ? 3 : 0) + 30) + (i13 * 6);
        int dp2 = ((huVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(huVar.d ? 11.66f : 15.0f);
        gyVar.getLocationOnScreen(iArr);
        if (huVar.d) {
            i11 = 0;
        } else {
            i11 = AndroidUtilities.dp((r3 * 4) - (AndroidUtilities.isTablet() ? 5 : 1)) + (guVar2.n[0] * i12);
        }
        if (iArr[0] - i11 < AndroidUtilities.dp(5.0f)) {
            i11 = org.telegram.messenger.rl.C(5.0f, iArr[0] - i11, i11);
        } else if ((iArr[0] - i11) + dp > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
            i11 += ((iArr[0] - i11) + dp) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
        }
        int i15 = -i11;
        int top = gyVar.getTop() < 0 ? gyVar.getTop() : 0;
        guVar2.setArrowX((AndroidUtilities.dp(AndroidUtilities.isTablet() ? 30.0f : 22.0f) - i15) + ((int) AndroidUtilities.dpf2(0.5f)));
        huVar.setFocusable(true);
        huVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i12) / 2) + ((-view.getMeasuredHeight()) - dp2)) - top);
        yyVar.h.requestDisallowInterceptTouchEvent(true);
        wwVar.d1(true);
        wwVar.w1(view);
        return true;
    }

    @Override // org.telegram.ui.Components.tl0
    public void b(int i10) {
        int i11;
        jy jyVar;
        switch (this.a) {
            case 2:
                yy yyVar = this.b;
                dy dyVar = yyVar.e0;
                int i12 = yyVar.Y0;
                cy cyVar = yyVar.j0;
                fy fyVar = yyVar.g0;
                if (i10 != yyVar.o0 || !cyVar.x.isEmpty()) {
                    yyVar.d0.B0();
                    yyVar.l0.k(i10, 0);
                    if (i10 == yyVar.n0 || i10 == yyVar.o0) {
                        yyVar.k0.d.setText("");
                        if (i10 != yyVar.o0 || (i11 = cyVar.E) < 1) {
                            xx xxVar = yyVar.p1;
                            dyVar.h1((xxVar == null || !xxVar.A()) ? 1 : 0, 0);
                        } else {
                            dyVar.h1(i11, -AndroidUtilities.dp(4.0f));
                        }
                        if (i10 == yyVar.o0) {
                            ArrayList<String> arrayList = MessagesController.getInstance(i12).gifSearchEmojies;
                            if (!arrayList.isEmpty()) {
                                fyVar.a(arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList<String> arrayList2 = MessagesController.getInstance(i12).gifSearchEmojies;
                        yyVar.f0.H(arrayList2.get(i10 - yyVar.p0));
                        int i13 = i10 - yyVar.p0;
                        if (i13 > 0) {
                            fyVar.a(arrayList2.get(i13 - 1), true);
                        }
                        if (i10 - yyVar.p0 < arrayList2.size() - 1) {
                            fyVar.a(arrayList2.get((i10 - yyVar.p0) + 1), true);
                        }
                    }
                    yyVar.H(2);
                    break;
                }
                break;
            default:
                yy yyVar2 = this.b;
                hw hwVar = yyVar2.C0;
                ArrayList arrayList3 = yyVar2.Z0;
                iw iwVar = yyVar2.x0;
                py pyVar = yyVar2.u0;
                ew ewVar = yyVar2.z0;
                if (!yyVar2.O0) {
                    if (i10 != yyVar2.D1) {
                        if (hwVar != null && (jyVar = hwVar.r) != null && jyVar.getSelectedCategory() != null) {
                            hwVar.c(null, false);
                            jyVar.F1(null);
                        }
                        if (i10 != yyVar2.B1) {
                            if (i10 != yyVar2.C1) {
                                if (i10 != yyVar2.E1) {
                                    int i14 = i10 - yyVar2.A1;
                                    if (i14 < arrayList3.size()) {
                                        if (i14 >= arrayList3.size()) {
                                            i14 = arrayList3.size() - 1;
                                        }
                                        yyVar2.E0 = false;
                                        ewVar.B0();
                                        yyVar2.J(pyVar.E(arrayList3.get(i14)), 0);
                                        yyVar2.H(0);
                                        yyVar2.q(0);
                                        int i15 = yyVar2.C1;
                                        if (i15 <= 0 && (i15 = yyVar2.B1) <= 0) {
                                            i15 = yyVar2.A1;
                                        }
                                        iwVar.k(i10, i15);
                                        yyVar2.T1 = false;
                                        yyVar2.a0();
                                        break;
                                    }
                                } else {
                                    ewVar.B0();
                                    yyVar2.J(pyVar.E("premium"), 0);
                                    yyVar2.H(0);
                                    int i16 = yyVar2.E1;
                                    iwVar.k(i16, i16 > 0 ? i16 : yyVar2.A1);
                                    break;
                                }
                            } else {
                                ewVar.B0();
                                yyVar2.J(pyVar.E("fav"), 0);
                                yyVar2.H(0);
                                int i17 = yyVar2.C1;
                                iwVar.k(i17, i17 > 0 ? i17 : yyVar2.A1);
                                break;
                            }
                        } else {
                            ewVar.B0();
                            yyVar2.J(pyVar.E("recent"), 0);
                            yyVar2.H(0);
                            int i18 = yyVar2.B1;
                            iwVar.k(i18, i18 > 0 ? i18 : yyVar2.A1);
                            break;
                        }
                    } else {
                        yyVar2.p1.o(new j41(yyVar2.getContext(), new rw(yyVar2), yyVar2.t1, yyVar2.u1, yyVar2.v1, null, yyVar2.V1));
                        break;
                    }
                }
                break;
        }
    }

    @Override // qg.h
    public void g(RectF rectF, View view) {
        this.b.D();
    }

    @Override // ud.b
    public void o(int i10, float f10, float f11, ud.c cVar) {
        this.b.T();
    }

    @Override // ud.b
    public /* synthetic */ void A(float f10, int i10) {
    }
}
