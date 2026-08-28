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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv implements ok0, td.b, ql0, pg.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy b;

    public /* synthetic */ rv(wy wyVar, int i9) {
        this.a = i9;
        this.b = wyVar;
    }

    @Override // td.b
    public void J0(int i9, float f10, float f11, td.c cVar) {
        this.b.S();
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        String str;
        int i10;
        wy wyVar = this.b;
        int i11 = wyVar.y1;
        ww wwVar = wyVar.L;
        int[] iArr = wyVar.z1;
        iu iuVar = wyVar.x1;
        if (!(view instanceof fy)) {
            return false;
        }
        fy fyVar = (fy) view;
        if (fyVar.c) {
            View F = wwVar.F(view);
            f2.q1 T = F != null ? wwVar.T(F) : null;
            if (T != null && T.b() <= wyVar.getRecentEmoji().size()) {
                wyVar.p1.n();
            }
            wwVar.w1(view);
            return true;
        }
        if (fyVar.getSpan() != null || (str = (String) fyVar.getTag()) == null) {
            return false;
        }
        String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
        String str2 = fyVar.c ? null : Emoji.emojiColor.get(replace);
        boolean isCompound = CompoundEmoji.isCompound(replace);
        if (!isCompound && !EmojiData.emojiColoredMap.contains(replace)) {
            return false;
        }
        wyVar.N1 = fyVar;
        wyVar.Q1 = wyVar.O1;
        wyVar.R1 = wyVar.P1;
        if (isCompound) {
            replace = wy.g(replace, str2);
        } else {
            int indexOf = CompoundEmoji.skinTones.indexOf(str2) + 1;
            hu huVar = iuVar.c;
            int[] iArr2 = huVar.n;
            if (iArr2[0] != indexOf) {
                iArr2[0] = indexOf;
                huVar.invalidate();
            }
        }
        iuVar.getClass();
        hu huVar2 = iuVar.c;
        int i12 = iuVar.e;
        boolean z10 = CompoundEmoji.getCompoundEmojiDrawable(replace) != null;
        iuVar.d = z10;
        Drawable[] drawableArr = huVar2.b;
        int[] iArr3 = huVar2.n;
        huVar2.f = z10;
        huVar2.e = replace;
        if (z10) {
            drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
            drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(huVar2.e, 0, -2);
            drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(huVar2.e, 1, -2);
            drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(huVar2.e, 2, -2);
            drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(huVar2.e, 3, -2);
            drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(huVar2.e, 4, -2);
            drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(huVar2.e, -2, 0);
            drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(huVar2.e, -2, 1);
            drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(huVar2.e, -2, 2);
            drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(huVar2.e, -2, 3);
            drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(huVar2.e, -2, 4);
            Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
            if (isHandshake != null) {
                int intValue = ((Integer) isHandshake.first).intValue();
                if (iArr3[0] != intValue) {
                    iArr3[0] = intValue;
                    huVar2.invalidate();
                }
                int intValue2 = ((Integer) isHandshake.second).intValue();
                if (iArr3[1] != intValue2) {
                    iArr3[1] = intValue2;
                    huVar2.invalidate();
                }
                huVar2.C = iArr3[0] == iArr3[1];
            }
            huVar2.E = true;
        } else {
            int i13 = 0;
            while (i13 < 6) {
                drawableArr[i13] = Emoji.getEmojiBigDrawable(i13 != 0 ? wy.g(replace, CompoundEmoji.skinTones.get(i13 - 1)) : replace);
                i13++;
            }
        }
        huVar2.invalidate();
        iuVar.setWidth(AndroidUtilities.dp((iuVar.d ? 3 : 0) + 30) + (i12 * 6));
        iuVar.setHeight(((iuVar.d ? 2 : 1) * i12) + AndroidUtilities.dp(iuVar.d ? 11.66f : 15.0f));
        int dp = AndroidUtilities.dp((iuVar.d ? 3 : 0) + 30) + (i12 * 6);
        int dp2 = ((iuVar.d ? 2 : 1) * i12) + AndroidUtilities.dp(iuVar.d ? 11.66f : 15.0f);
        fyVar.getLocationOnScreen(iArr);
        if (iuVar.d) {
            i10 = 0;
        } else {
            i10 = AndroidUtilities.dp((r3 * 4) - (AndroidUtilities.isTablet() ? 5 : 1)) + (huVar2.n[0] * i11);
        }
        if (iArr[0] - i10 < AndroidUtilities.dp(5.0f)) {
            i10 = org.telegram.messenger.ll.D(5.0f, iArr[0] - i10, i10);
        } else if ((iArr[0] - i10) + dp > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
            i10 += ((iArr[0] - i10) + dp) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
        }
        int i14 = -i10;
        int top = fyVar.getTop() < 0 ? fyVar.getTop() : 0;
        huVar2.setArrowX((AndroidUtilities.dp(AndroidUtilities.isTablet() ? 30.0f : 22.0f) - i14) + ((int) AndroidUtilities.dpf2(0.5f)));
        iuVar.setFocusable(true);
        iuVar.showAsDropDown(view, i14, (((view.getMeasuredHeight() - i11) / 2) + ((-view.getMeasuredHeight()) - dp2)) - top);
        wyVar.h.requestDisallowInterceptTouchEvent(true);
        wwVar.d1(true);
        wwVar.w1(view);
        return true;
    }

    @Override // org.telegram.ui.Components.ql0
    public void b(int i9) {
        int i10;
        iy iyVar;
        switch (this.a) {
            case 2:
                wy wyVar = this.b;
                cy cyVar = wyVar.e0;
                int i11 = wyVar.Y0;
                ay ayVar = wyVar.j0;
                ey eyVar = wyVar.g0;
                if (i9 != wyVar.o0 || !ayVar.x.isEmpty()) {
                    wyVar.d0.B0();
                    wyVar.l0.k(i9, 0);
                    if (i9 == wyVar.n0 || i9 == wyVar.o0) {
                        wyVar.k0.d.setText("");
                        if (i9 != wyVar.o0 || (i10 = ayVar.E) < 1) {
                            wx wxVar = wyVar.p1;
                            cyVar.h1((wxVar == null || !wxVar.A()) ? 1 : 0, 0);
                        } else {
                            cyVar.h1(i10, -AndroidUtilities.dp(4.0f));
                        }
                        if (i9 == wyVar.o0) {
                            ArrayList<String> arrayList = MessagesController.getInstance(i11).gifSearchEmojies;
                            if (!arrayList.isEmpty()) {
                                eyVar.a(arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList<String> arrayList2 = MessagesController.getInstance(i11).gifSearchEmojies;
                        wyVar.f0.H(arrayList2.get(i9 - wyVar.p0));
                        int i12 = i9 - wyVar.p0;
                        if (i12 > 0) {
                            eyVar.a(arrayList2.get(i12 - 1), true);
                        }
                        if (i9 - wyVar.p0 < arrayList2.size() - 1) {
                            eyVar.a(arrayList2.get((i9 - wyVar.p0) + 1), true);
                        }
                    }
                    wyVar.G(2);
                    break;
                }
                break;
            default:
                wy wyVar2 = this.b;
                iw iwVar = wyVar2.C0;
                ArrayList arrayList3 = wyVar2.Z0;
                jw jwVar = wyVar2.x0;
                ny nyVar = wyVar2.u0;
                fw fwVar = wyVar2.z0;
                if (!wyVar2.O0) {
                    if (i9 != wyVar2.D1) {
                        if (iwVar != null && (iyVar = iwVar.r) != null && iyVar.getSelectedCategory() != null) {
                            iwVar.c(null, false);
                            iyVar.F1(null);
                        }
                        if (i9 != wyVar2.B1) {
                            if (i9 != wyVar2.C1) {
                                if (i9 != wyVar2.E1) {
                                    int i13 = i9 - wyVar2.A1;
                                    if (i13 < arrayList3.size()) {
                                        if (i13 >= arrayList3.size()) {
                                            i13 = arrayList3.size() - 1;
                                        }
                                        wyVar2.E0 = false;
                                        fwVar.B0();
                                        wyVar2.I(nyVar.E(arrayList3.get(i13)), 0);
                                        wyVar2.G(0);
                                        wyVar2.p(0);
                                        int i14 = wyVar2.C1;
                                        if (i14 <= 0 && (i14 = wyVar2.B1) <= 0) {
                                            i14 = wyVar2.A1;
                                        }
                                        jwVar.k(i9, i14);
                                        wyVar2.T1 = false;
                                        wyVar2.Z();
                                        break;
                                    }
                                } else {
                                    fwVar.B0();
                                    wyVar2.I(nyVar.E("premium"), 0);
                                    wyVar2.G(0);
                                    int i15 = wyVar2.E1;
                                    jwVar.k(i15, i15 > 0 ? i15 : wyVar2.A1);
                                    break;
                                }
                            } else {
                                fwVar.B0();
                                wyVar2.I(nyVar.E("fav"), 0);
                                wyVar2.G(0);
                                int i16 = wyVar2.C1;
                                jwVar.k(i16, i16 > 0 ? i16 : wyVar2.A1);
                                break;
                            }
                        } else {
                            fwVar.B0();
                            wyVar2.I(nyVar.E("recent"), 0);
                            wyVar2.G(0);
                            int i17 = wyVar2.B1;
                            jwVar.k(i17, i17 > 0 ? i17 : wyVar2.A1);
                            break;
                        }
                    } else {
                        wyVar2.p1.o(new h41(wyVar2.getContext(), new rw(wyVar2), wyVar2.t1, wyVar2.u1, wyVar2.v1, null, wyVar2.V1));
                        break;
                    }
                }
                break;
        }
    }

    @Override // pg.g
    public void i(RectF rectF, View view) {
        this.b.C();
    }

    @Override // td.b
    public /* synthetic */ void B(float f10, int i9) {
    }
}
