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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class fw implements bl0, le.d, gm0, ih.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ kz b;

    public /* synthetic */ fw(kz kzVar, int i10) {
        this.a = i10;
        this.b = kzVar;
    }

    @Override // le.d
    public void E(int i10, float f7, float f10, le.e eVar) {
        this.b.T();
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean a(int i10, View view) {
        String str;
        int i11;
        kz kzVar = this.b;
        int i12 = kzVar.C1;
        kx kxVar = kzVar.P;
        int[] iArr = kzVar.D1;
        vu vuVar = kzVar.B1;
        if (!(view instanceof ty)) {
            return false;
        }
        ty tyVar = (ty) view;
        if (tyVar.c) {
            View F = kxVar.F(view);
            s4.c1 T = F != null ? kxVar.T(F) : null;
            if (T != null && T.b() <= kzVar.getRecentEmoji().size()) {
                kzVar.t1.n();
            }
            kxVar.v1(view);
            return true;
        }
        if (tyVar.getSpan() != null || (str = (String) tyVar.getTag()) == null) {
            return false;
        }
        String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
        String str2 = tyVar.c ? null : Emoji.emojiColor.get(replace);
        boolean isCompound = CompoundEmoji.isCompound(replace);
        if (!isCompound && !EmojiData.emojiColoredMap.contains(replace)) {
            return false;
        }
        kzVar.R1 = tyVar;
        kzVar.U1 = kzVar.S1;
        kzVar.V1 = kzVar.T1;
        if (isCompound) {
            replace = kz.g(replace, str2);
        } else {
            int indexOf = CompoundEmoji.skinTones.indexOf(str2) + 1;
            uu uuVar = vuVar.c;
            int[] iArr2 = uuVar.n;
            if (iArr2[0] != indexOf) {
                iArr2[0] = indexOf;
                uuVar.invalidate();
            }
        }
        vuVar.getClass();
        uu uuVar2 = vuVar.c;
        int i13 = vuVar.e;
        boolean z10 = CompoundEmoji.getCompoundEmojiDrawable(replace) != null;
        vuVar.d = z10;
        Drawable[] drawableArr = uuVar2.b;
        int[] iArr3 = uuVar2.n;
        uuVar2.f = z10;
        uuVar2.e = replace;
        if (z10) {
            drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
            drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(uuVar2.e, 0, -2);
            drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(uuVar2.e, 1, -2);
            drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(uuVar2.e, 2, -2);
            drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(uuVar2.e, 3, -2);
            drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(uuVar2.e, 4, -2);
            drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(uuVar2.e, -2, 0);
            drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(uuVar2.e, -2, 1);
            drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(uuVar2.e, -2, 2);
            drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(uuVar2.e, -2, 3);
            drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(uuVar2.e, -2, 4);
            Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
            if (isHandshake != null) {
                int intValue = ((Integer) isHandshake.first).intValue();
                if (iArr3[0] != intValue) {
                    iArr3[0] = intValue;
                    uuVar2.invalidate();
                }
                int intValue2 = ((Integer) isHandshake.second).intValue();
                if (iArr3[1] != intValue2) {
                    iArr3[1] = intValue2;
                    uuVar2.invalidate();
                }
                uuVar2.G = iArr3[0] == iArr3[1];
            }
            uuVar2.I = true;
        } else {
            int i14 = 0;
            while (i14 < 6) {
                drawableArr[i14] = Emoji.getEmojiBigDrawable(i14 != 0 ? kz.g(replace, CompoundEmoji.skinTones.get(i14 - 1)) : replace);
                i14++;
            }
        }
        uuVar2.invalidate();
        vuVar.setWidth(AndroidUtilities.dp((vuVar.d ? 3 : 0) + 30) + (i13 * 6));
        vuVar.setHeight(((vuVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(vuVar.d ? 11.66f : 15.0f));
        int dp = AndroidUtilities.dp((vuVar.d ? 3 : 0) + 30) + (i13 * 6);
        int dp2 = ((vuVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(vuVar.d ? 11.66f : 15.0f);
        tyVar.getLocationOnScreen(iArr);
        if (vuVar.d) {
            i11 = 0;
        } else {
            i11 = AndroidUtilities.dp((r3 * 4) - (AndroidUtilities.isTablet() ? 5 : 1)) + (uuVar2.n[0] * i12);
        }
        if (iArr[0] - i11 < AndroidUtilities.dp(5.0f)) {
            i11 = org.telegram.messenger.wl.D(5.0f, iArr[0] - i11, i11);
        } else if ((iArr[0] - i11) + dp > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
            i11 += ((iArr[0] - i11) + dp) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
        }
        int i15 = -i11;
        int top = tyVar.getTop() < 0 ? tyVar.getTop() : 0;
        uuVar2.setArrowX((AndroidUtilities.dp(AndroidUtilities.isTablet() ? 30.0f : 22.0f) - i15) + ((int) AndroidUtilities.dpf2(0.5f)));
        vuVar.setFocusable(true);
        vuVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i12) / 2) + ((-view.getMeasuredHeight()) - dp2)) - top);
        kzVar.h.requestDisallowInterceptTouchEvent(true);
        kxVar.c1(true);
        kxVar.v1(view);
        return true;
    }

    @Override // org.telegram.ui.Components.gm0
    public void b(int i10) {
        int i11;
        wy wyVar;
        switch (this.a) {
            case 2:
                kz kzVar = this.b;
                qy qyVar = kzVar.i0;
                int i12 = kzVar.c1;
                py pyVar = kzVar.n0;
                sy syVar = kzVar.k0;
                if (i10 != kzVar.s0 || !pyVar.x.isEmpty()) {
                    kzVar.h0.B0();
                    kzVar.p0.k(i10, 0);
                    if (i10 == kzVar.r0 || i10 == kzVar.s0) {
                        kzVar.o0.d.setText("");
                        if (i10 != kzVar.s0 || (i11 = pyVar.I) < 1) {
                            ly lyVar = kzVar.t1;
                            qyVar.h1((lyVar == null || !lyVar.A()) ? 1 : 0, 0);
                        } else {
                            qyVar.h1(i11, -AndroidUtilities.dp(4.0f));
                        }
                        if (i10 == kzVar.s0) {
                            ArrayList<String> arrayList = MessagesController.getInstance(i12).gifSearchEmojies;
                            if (!arrayList.isEmpty()) {
                                syVar.a(arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList<String> arrayList2 = MessagesController.getInstance(i12).gifSearchEmojies;
                        kzVar.j0.H(arrayList2.get(i10 - kzVar.t0));
                        int i13 = i10 - kzVar.t0;
                        if (i13 > 0) {
                            syVar.a(arrayList2.get(i13 - 1), true);
                        }
                        if (i10 - kzVar.t0 < arrayList2.size() - 1) {
                            syVar.a(arrayList2.get((i10 - kzVar.t0) + 1), true);
                        }
                    }
                    kzVar.H(2);
                    break;
                }
                break;
            default:
                kz kzVar2 = this.b;
                ww wwVar = kzVar2.G0;
                ArrayList arrayList3 = kzVar2.d1;
                xw xwVar = kzVar2.B0;
                bz bzVar = kzVar2.y0;
                tw twVar = kzVar2.D0;
                if (!kzVar2.S0) {
                    if (i10 != kzVar2.H1) {
                        if (wwVar != null && (wyVar = wwVar.r) != null && wyVar.getSelectedCategory() != null) {
                            wwVar.c(null, false);
                            wyVar.E1(null);
                        }
                        if (i10 != kzVar2.F1) {
                            if (i10 != kzVar2.G1) {
                                if (i10 != kzVar2.I1) {
                                    int i14 = i10 - kzVar2.E1;
                                    if (i14 < arrayList3.size()) {
                                        if (i14 >= arrayList3.size()) {
                                            i14 = arrayList3.size() - 1;
                                        }
                                        kzVar2.I0 = false;
                                        twVar.B0();
                                        kzVar2.J(bzVar.E(arrayList3.get(i14)), 0);
                                        kzVar2.H(0);
                                        kzVar2.p(0);
                                        int i15 = kzVar2.G1;
                                        if (i15 <= 0 && (i15 = kzVar2.F1) <= 0) {
                                            i15 = kzVar2.E1;
                                        }
                                        xwVar.k(i10, i15);
                                        kzVar2.X1 = false;
                                        kzVar2.a0();
                                        break;
                                    }
                                } else {
                                    twVar.B0();
                                    kzVar2.J(bzVar.E("premium"), 0);
                                    kzVar2.H(0);
                                    int i16 = kzVar2.I1;
                                    xwVar.k(i16, i16 > 0 ? i16 : kzVar2.E1);
                                    break;
                                }
                            } else {
                                twVar.B0();
                                kzVar2.J(bzVar.E("fav"), 0);
                                kzVar2.H(0);
                                int i17 = kzVar2.G1;
                                xwVar.k(i17, i17 > 0 ? i17 : kzVar2.E1);
                                break;
                            }
                        } else {
                            twVar.B0();
                            kzVar2.J(bzVar.E("recent"), 0);
                            kzVar2.H(0);
                            int i18 = kzVar2.F1;
                            xwVar.k(i18, i18 > 0 ? i18 : kzVar2.E1);
                            break;
                        }
                    } else {
                        kzVar2.t1.o(new d51(kzVar2.getContext(), new fx(kzVar2), kzVar2.x1, kzVar2.y1, kzVar2.z1, null, kzVar2.Z1));
                        break;
                    }
                }
                break;
        }
    }

    @Override // ih.i
    public void k(RectF rectF, View view) {
        this.b.C();
    }

    @Override // le.d
    public /* synthetic */ void z(float f7, int i10) {
    }
}
