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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dw implements ll0, xd.b, om0, vg.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ mz b;

    public /* synthetic */ dw(mz mzVar, int i10) {
        this.a = i10;
        this.b = mzVar;
    }

    @Override // xd.b
    public void L(int i10, float f10, float f11, xd.c cVar) {
        this.b.T();
    }

    @Override // org.telegram.ui.Components.om0
    public void a(int i10) {
        int i11;
        xy xyVar;
        switch (this.a) {
            case 2:
                mz mzVar = this.b;
                ry ryVar = mzVar.f0;
                int i12 = mzVar.Z0;
                qy qyVar = mzVar.k0;
                ty tyVar = mzVar.h0;
                if (i10 != mzVar.p0 || !qyVar.x.isEmpty()) {
                    mzVar.e0.B0();
                    mzVar.m0.k(i10, 0);
                    if (i10 == mzVar.o0 || i10 == mzVar.p0) {
                        mzVar.l0.d.setText("");
                        if (i10 != mzVar.p0 || (i11 = qyVar.F) < 1) {
                            my myVar = mzVar.q1;
                            ryVar.h1((myVar == null || !myVar.A()) ? 1 : 0, 0);
                        } else {
                            ryVar.h1(i11, -AndroidUtilities.dp(4.0f));
                        }
                        if (i10 == mzVar.p0) {
                            ArrayList<String> arrayList = MessagesController.getInstance(i12).gifSearchEmojies;
                            if (!arrayList.isEmpty()) {
                                tyVar.a(arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList<String> arrayList2 = MessagesController.getInstance(i12).gifSearchEmojies;
                        mzVar.g0.H(arrayList2.get(i10 - mzVar.q0));
                        int i13 = i10 - mzVar.q0;
                        if (i13 > 0) {
                            tyVar.a(arrayList2.get(i13 - 1), true);
                        }
                        if (i10 - mzVar.q0 < arrayList2.size() - 1) {
                            tyVar.a(arrayList2.get((i10 - mzVar.q0) + 1), true);
                        }
                    }
                    mzVar.G(2);
                    break;
                }
                break;
            default:
                mz mzVar2 = this.b;
                uw uwVar = mzVar2.D0;
                ArrayList arrayList3 = mzVar2.a1;
                vw vwVar = mzVar2.y0;
                dz dzVar = mzVar2.v0;
                rw rwVar = mzVar2.A0;
                if (!mzVar2.P0) {
                    if (i10 != mzVar2.E1) {
                        if (uwVar != null && (xyVar = uwVar.r) != null && xyVar.getSelectedCategory() != null) {
                            uwVar.c(null, false);
                            xyVar.F1(null);
                        }
                        if (i10 != mzVar2.C1) {
                            if (i10 != mzVar2.D1) {
                                if (i10 != mzVar2.F1) {
                                    int i14 = i10 - mzVar2.B1;
                                    if (i14 < arrayList3.size()) {
                                        if (i14 >= arrayList3.size()) {
                                            i14 = arrayList3.size() - 1;
                                        }
                                        mzVar2.F0 = false;
                                        rwVar.B0();
                                        mzVar2.I(dzVar.E(arrayList3.get(i14)), 0);
                                        mzVar2.G(0);
                                        mzVar2.p(0);
                                        int i15 = mzVar2.D1;
                                        if (i15 <= 0 && (i15 = mzVar2.C1) <= 0) {
                                            i15 = mzVar2.B1;
                                        }
                                        vwVar.k(i10, i15);
                                        mzVar2.U1 = false;
                                        mzVar2.a0();
                                        break;
                                    }
                                } else {
                                    rwVar.B0();
                                    mzVar2.I(dzVar.E("premium"), 0);
                                    mzVar2.G(0);
                                    int i16 = mzVar2.F1;
                                    vwVar.k(i16, i16 > 0 ? i16 : mzVar2.B1);
                                    break;
                                }
                            } else {
                                rwVar.B0();
                                mzVar2.I(dzVar.E("fav"), 0);
                                mzVar2.G(0);
                                int i17 = mzVar2.D1;
                                vwVar.k(i17, i17 > 0 ? i17 : mzVar2.B1);
                                break;
                            }
                        } else {
                            rwVar.B0();
                            mzVar2.I(dzVar.E("recent"), 0);
                            mzVar2.G(0);
                            int i18 = mzVar2.C1;
                            vwVar.k(i18, i18 > 0 ? i18 : mzVar2.B1);
                            break;
                        }
                    } else {
                        mzVar2.q1.o(new f51(mzVar2.getContext(), new ex(mzVar2), mzVar2.u1, mzVar2.v1, mzVar2.w1, null, mzVar2.W1));
                        break;
                    }
                }
                break;
        }
    }

    @Override // vg.g
    public void d(RectF rectF, View view) {
        this.b.C();
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean f(int i10, View view) {
        String str;
        int i11;
        mz mzVar = this.b;
        int i12 = mzVar.z1;
        kx kxVar = mzVar.M;
        int[] iArr = mzVar.A1;
        tu tuVar = mzVar.y1;
        if (!(view instanceof uy)) {
            return false;
        }
        uy uyVar = (uy) view;
        if (uyVar.c) {
            View F = kxVar.F(view);
            f2.m1 T = F != null ? kxVar.T(F) : null;
            if (T != null && T.b() <= mzVar.getRecentEmoji().size()) {
                mzVar.q1.n();
            }
            kxVar.w1(view);
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
        mzVar.O1 = uyVar;
        mzVar.R1 = mzVar.P1;
        mzVar.S1 = mzVar.Q1;
        if (isCompound) {
            replace = mz.g(replace, str2);
        } else {
            int indexOf = CompoundEmoji.skinTones.indexOf(str2) + 1;
            su suVar = tuVar.c;
            int[] iArr2 = suVar.n;
            if (iArr2[0] != indexOf) {
                iArr2[0] = indexOf;
                suVar.invalidate();
            }
        }
        tuVar.getClass();
        su suVar2 = tuVar.c;
        int i13 = tuVar.e;
        boolean z4 = CompoundEmoji.getCompoundEmojiDrawable(replace) != null;
        tuVar.d = z4;
        Drawable[] drawableArr = suVar2.b;
        int[] iArr3 = suVar2.n;
        suVar2.f = z4;
        suVar2.e = replace;
        if (z4) {
            drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
            drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(suVar2.e, 0, -2);
            drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(suVar2.e, 1, -2);
            drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(suVar2.e, 2, -2);
            drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(suVar2.e, 3, -2);
            drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(suVar2.e, 4, -2);
            drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(suVar2.e, -2, 0);
            drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(suVar2.e, -2, 1);
            drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(suVar2.e, -2, 2);
            drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(suVar2.e, -2, 3);
            drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(suVar2.e, -2, 4);
            Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
            if (isHandshake != null) {
                int intValue = ((Integer) isHandshake.first).intValue();
                if (iArr3[0] != intValue) {
                    iArr3[0] = intValue;
                    suVar2.invalidate();
                }
                int intValue2 = ((Integer) isHandshake.second).intValue();
                if (iArr3[1] != intValue2) {
                    iArr3[1] = intValue2;
                    suVar2.invalidate();
                }
                suVar2.D = iArr3[0] == iArr3[1];
            }
            suVar2.F = true;
        } else {
            int i14 = 0;
            while (i14 < 6) {
                drawableArr[i14] = Emoji.getEmojiBigDrawable(i14 != 0 ? mz.g(replace, CompoundEmoji.skinTones.get(i14 - 1)) : replace);
                i14++;
            }
        }
        suVar2.invalidate();
        tuVar.setWidth(AndroidUtilities.dp((tuVar.d ? 3 : 0) + 30) + (i13 * 6));
        tuVar.setHeight(((tuVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(tuVar.d ? 11.66f : 15.0f));
        int dp = AndroidUtilities.dp((tuVar.d ? 3 : 0) + 30) + (i13 * 6);
        int dp2 = ((tuVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(tuVar.d ? 11.66f : 15.0f);
        uyVar.getLocationOnScreen(iArr);
        if (tuVar.d) {
            i11 = 0;
        } else {
            i11 = AndroidUtilities.dp((r3 * 4) - (AndroidUtilities.isTablet() ? 5 : 1)) + (suVar2.n[0] * i12);
        }
        if (iArr[0] - i11 < AndroidUtilities.dp(5.0f)) {
            i11 = org.telegram.ui.b.C(5.0f, iArr[0] - i11, i11);
        } else if ((iArr[0] - i11) + dp > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
            i11 += ((iArr[0] - i11) + dp) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
        }
        int i15 = -i11;
        int top = uyVar.getTop() < 0 ? uyVar.getTop() : 0;
        suVar2.setArrowX((AndroidUtilities.dp(AndroidUtilities.isTablet() ? 30.0f : 22.0f) - i15) + ((int) AndroidUtilities.dpf2(0.5f)));
        tuVar.setFocusable(true);
        tuVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i12) / 2) + ((-view.getMeasuredHeight()) - dp2)) - top);
        mzVar.h.requestDisallowInterceptTouchEvent(true);
        kxVar.d1(true);
        kxVar.w1(view);
        return true;
    }

    @Override // xd.b
    public /* synthetic */ void z(float f10, int i10) {
    }
}
