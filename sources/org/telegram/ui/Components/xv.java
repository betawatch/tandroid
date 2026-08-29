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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xv implements bl0, vd.b, dm0, sg.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ fz b;

    public /* synthetic */ xv(fz fzVar, int i10) {
        this.a = i10;
        this.b = fzVar;
    }

    @Override // vd.b
    public void N(int i10, float f9, float f10, vd.c cVar) {
        this.b.T();
    }

    @Override // org.telegram.ui.Components.dm0
    public void a(int i10) {
        int i11;
        qy qyVar;
        switch (this.a) {
            case 2:
                fz fzVar = this.b;
                ky kyVar = fzVar.e0;
                int i12 = fzVar.Y0;
                jy jyVar = fzVar.j0;
                my myVar = fzVar.g0;
                if (i10 != fzVar.o0 || !jyVar.x.isEmpty()) {
                    fzVar.d0.B0();
                    fzVar.l0.k(i10, 0);
                    if (i10 == fzVar.n0 || i10 == fzVar.o0) {
                        fzVar.k0.d.setText("");
                        if (i10 != fzVar.o0 || (i11 = jyVar.E) < 1) {
                            fy fyVar = fzVar.p1;
                            kyVar.h1((fyVar == null || !fyVar.A()) ? 1 : 0, 0);
                        } else {
                            kyVar.h1(i11, -AndroidUtilities.dp(4.0f));
                        }
                        if (i10 == fzVar.o0) {
                            ArrayList<String> arrayList = MessagesController.getInstance(i12).gifSearchEmojies;
                            if (!arrayList.isEmpty()) {
                                myVar.a(arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList<String> arrayList2 = MessagesController.getInstance(i12).gifSearchEmojies;
                        fzVar.f0.H(arrayList2.get(i10 - fzVar.p0));
                        int i13 = i10 - fzVar.p0;
                        if (i13 > 0) {
                            myVar.a(arrayList2.get(i13 - 1), true);
                        }
                        if (i10 - fzVar.p0 < arrayList2.size() - 1) {
                            myVar.a(arrayList2.get((i10 - fzVar.p0) + 1), true);
                        }
                    }
                    fzVar.G(2);
                    break;
                }
                break;
            default:
                fz fzVar2 = this.b;
                ow owVar = fzVar2.C0;
                ArrayList arrayList3 = fzVar2.Z0;
                pw pwVar = fzVar2.x0;
                wy wyVar = fzVar2.u0;
                lw lwVar = fzVar2.z0;
                if (!fzVar2.O0) {
                    if (i10 != fzVar2.D1) {
                        if (owVar != null && (qyVar = owVar.r) != null && qyVar.getSelectedCategory() != null) {
                            owVar.c(null, false);
                            qyVar.F1(null);
                        }
                        if (i10 != fzVar2.B1) {
                            if (i10 != fzVar2.C1) {
                                if (i10 != fzVar2.E1) {
                                    int i14 = i10 - fzVar2.A1;
                                    if (i14 < arrayList3.size()) {
                                        if (i14 >= arrayList3.size()) {
                                            i14 = arrayList3.size() - 1;
                                        }
                                        fzVar2.E0 = false;
                                        lwVar.B0();
                                        fzVar2.I(wyVar.E(arrayList3.get(i14)), 0);
                                        fzVar2.G(0);
                                        fzVar2.p(0);
                                        int i15 = fzVar2.C1;
                                        if (i15 <= 0 && (i15 = fzVar2.B1) <= 0) {
                                            i15 = fzVar2.A1;
                                        }
                                        pwVar.k(i10, i15);
                                        fzVar2.T1 = false;
                                        fzVar2.a0();
                                        break;
                                    }
                                } else {
                                    lwVar.B0();
                                    fzVar2.I(wyVar.E("premium"), 0);
                                    fzVar2.G(0);
                                    int i16 = fzVar2.E1;
                                    pwVar.k(i16, i16 > 0 ? i16 : fzVar2.A1);
                                    break;
                                }
                            } else {
                                lwVar.B0();
                                fzVar2.I(wyVar.E("fav"), 0);
                                fzVar2.G(0);
                                int i17 = fzVar2.C1;
                                pwVar.k(i17, i17 > 0 ? i17 : fzVar2.A1);
                                break;
                            }
                        } else {
                            lwVar.B0();
                            fzVar2.I(wyVar.E("recent"), 0);
                            fzVar2.G(0);
                            int i18 = fzVar2.B1;
                            pwVar.k(i18, i18 > 0 ? i18 : fzVar2.A1);
                            break;
                        }
                    } else {
                        fzVar2.p1.o(new s41(fzVar2.getContext(), new yw(fzVar2), fzVar2.t1, fzVar2.u1, fzVar2.v1, null, fzVar2.V1));
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        String str;
        int i11;
        fz fzVar = this.b;
        int i12 = fzVar.y1;
        dx dxVar = fzVar.L;
        int[] iArr = fzVar.z1;
        ou ouVar = fzVar.x1;
        if (!(view instanceof ny)) {
            return false;
        }
        ny nyVar = (ny) view;
        if (nyVar.c) {
            View F = dxVar.F(view);
            f2.n1 T = F != null ? dxVar.T(F) : null;
            if (T != null && T.b() <= fzVar.getRecentEmoji().size()) {
                fzVar.p1.n();
            }
            dxVar.w1(view);
            return true;
        }
        if (nyVar.getSpan() != null || (str = (String) nyVar.getTag()) == null) {
            return false;
        }
        String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
        String str2 = nyVar.c ? null : Emoji.emojiColor.get(replace);
        boolean isCompound = CompoundEmoji.isCompound(replace);
        if (!isCompound && !EmojiData.emojiColoredMap.contains(replace)) {
            return false;
        }
        fzVar.N1 = nyVar;
        fzVar.Q1 = fzVar.O1;
        fzVar.R1 = fzVar.P1;
        if (isCompound) {
            replace = fz.g(replace, str2);
        } else {
            int indexOf = CompoundEmoji.skinTones.indexOf(str2) + 1;
            nu nuVar = ouVar.c;
            int[] iArr2 = nuVar.n;
            if (iArr2[0] != indexOf) {
                iArr2[0] = indexOf;
                nuVar.invalidate();
            }
        }
        ouVar.getClass();
        nu nuVar2 = ouVar.c;
        int i13 = ouVar.e;
        boolean z10 = CompoundEmoji.getCompoundEmojiDrawable(replace) != null;
        ouVar.d = z10;
        Drawable[] drawableArr = nuVar2.b;
        int[] iArr3 = nuVar2.n;
        nuVar2.f = z10;
        nuVar2.e = replace;
        if (z10) {
            drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
            drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(nuVar2.e, 0, -2);
            drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(nuVar2.e, 1, -2);
            drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(nuVar2.e, 2, -2);
            drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(nuVar2.e, 3, -2);
            drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(nuVar2.e, 4, -2);
            drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(nuVar2.e, -2, 0);
            drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(nuVar2.e, -2, 1);
            drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(nuVar2.e, -2, 2);
            drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(nuVar2.e, -2, 3);
            drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(nuVar2.e, -2, 4);
            Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
            if (isHandshake != null) {
                int intValue = ((Integer) isHandshake.first).intValue();
                if (iArr3[0] != intValue) {
                    iArr3[0] = intValue;
                    nuVar2.invalidate();
                }
                int intValue2 = ((Integer) isHandshake.second).intValue();
                if (iArr3[1] != intValue2) {
                    iArr3[1] = intValue2;
                    nuVar2.invalidate();
                }
                nuVar2.C = iArr3[0] == iArr3[1];
            }
            nuVar2.E = true;
        } else {
            int i14 = 0;
            while (i14 < 6) {
                drawableArr[i14] = Emoji.getEmojiBigDrawable(i14 != 0 ? fz.g(replace, CompoundEmoji.skinTones.get(i14 - 1)) : replace);
                i14++;
            }
        }
        nuVar2.invalidate();
        ouVar.setWidth(AndroidUtilities.dp((ouVar.d ? 3 : 0) + 30) + (i13 * 6));
        ouVar.setHeight(((ouVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(ouVar.d ? 11.66f : 15.0f));
        int dp = AndroidUtilities.dp((ouVar.d ? 3 : 0) + 30) + (i13 * 6);
        int dp2 = ((ouVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(ouVar.d ? 11.66f : 15.0f);
        nyVar.getLocationOnScreen(iArr);
        if (ouVar.d) {
            i11 = 0;
        } else {
            i11 = AndroidUtilities.dp((r3 * 4) - (AndroidUtilities.isTablet() ? 5 : 1)) + (nuVar2.n[0] * i12);
        }
        if (iArr[0] - i11 < AndroidUtilities.dp(5.0f)) {
            i11 = org.telegram.ui.b.C(5.0f, iArr[0] - i11, i11);
        } else if ((iArr[0] - i11) + dp > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
            i11 += ((iArr[0] - i11) + dp) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
        }
        int i15 = -i11;
        int top = nyVar.getTop() < 0 ? nyVar.getTop() : 0;
        nuVar2.setArrowX((AndroidUtilities.dp(AndroidUtilities.isTablet() ? 30.0f : 22.0f) - i15) + ((int) AndroidUtilities.dpf2(0.5f)));
        ouVar.setFocusable(true);
        ouVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i12) / 2) + ((-view.getMeasuredHeight()) - dp2)) - top);
        fzVar.h.requestDisallowInterceptTouchEvent(true);
        dxVar.d1(true);
        dxVar.w1(view);
        return true;
    }

    @Override // sg.g
    public void d(RectF rectF, View view) {
        this.b.C();
    }

    @Override // vd.b
    public /* synthetic */ void z(float f9, int i10) {
    }
}
