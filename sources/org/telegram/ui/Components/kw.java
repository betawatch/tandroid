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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class kw implements ll0, le.d, qm0, gh.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ rz b;

    public /* synthetic */ kw(rz rzVar, int i10) {
        this.a = i10;
        this.b = rzVar;
    }

    @Override // le.d
    public void G(int i10, float f7, float f10, le.e eVar) {
        this.b.T();
    }

    @Override // org.telegram.ui.Components.qm0
    public void a(int i10) {
        int i11;
        dz dzVar;
        switch (this.a) {
            case 2:
                rz rzVar = this.b;
                xy xyVar = rzVar.i0;
                int i12 = rzVar.c1;
                wy wyVar = rzVar.n0;
                zy zyVar = rzVar.k0;
                if (i10 != rzVar.s0 || !wyVar.x.isEmpty()) {
                    rzVar.h0.B0();
                    rzVar.p0.k(i10, 0);
                    if (i10 == rzVar.r0 || i10 == rzVar.s0) {
                        rzVar.o0.d.setText("");
                        if (i10 != rzVar.s0 || (i11 = wyVar.I) < 1) {
                            sy syVar = rzVar.t1;
                            xyVar.h1((syVar == null || !syVar.A()) ? 1 : 0, 0);
                        } else {
                            xyVar.h1(i11, -AndroidUtilities.dp(4.0f));
                        }
                        if (i10 == rzVar.s0) {
                            ArrayList<String> arrayList = MessagesController.getInstance(i12).gifSearchEmojies;
                            if (!arrayList.isEmpty()) {
                                zyVar.a(arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList<String> arrayList2 = MessagesController.getInstance(i12).gifSearchEmojies;
                        rzVar.j0.H(arrayList2.get(i10 - rzVar.t0));
                        int i13 = i10 - rzVar.t0;
                        if (i13 > 0) {
                            zyVar.a(arrayList2.get(i13 - 1), true);
                        }
                        if (i10 - rzVar.t0 < arrayList2.size() - 1) {
                            zyVar.a(arrayList2.get((i10 - rzVar.t0) + 1), true);
                        }
                    }
                    rzVar.H(2);
                    break;
                }
                break;
            default:
                rz rzVar2 = this.b;
                bx bxVar = rzVar2.G0;
                ArrayList arrayList3 = rzVar2.d1;
                cx cxVar = rzVar2.B0;
                iz izVar = rzVar2.y0;
                yw ywVar = rzVar2.D0;
                if (!rzVar2.S0) {
                    if (i10 != rzVar2.H1) {
                        if (bxVar != null && (dzVar = bxVar.r) != null && dzVar.getSelectedCategory() != null) {
                            bxVar.c(null, false);
                            dzVar.E1(null);
                        }
                        if (i10 != rzVar2.F1) {
                            if (i10 != rzVar2.G1) {
                                if (i10 != rzVar2.I1) {
                                    int i14 = i10 - rzVar2.E1;
                                    if (i14 < arrayList3.size()) {
                                        if (i14 >= arrayList3.size()) {
                                            i14 = arrayList3.size() - 1;
                                        }
                                        rzVar2.I0 = false;
                                        ywVar.B0();
                                        rzVar2.J(izVar.E(arrayList3.get(i14)), 0);
                                        rzVar2.H(0);
                                        rzVar2.p(0);
                                        int i15 = rzVar2.G1;
                                        if (i15 <= 0 && (i15 = rzVar2.F1) <= 0) {
                                            i15 = rzVar2.E1;
                                        }
                                        cxVar.k(i10, i15);
                                        rzVar2.X1 = false;
                                        rzVar2.a0();
                                        break;
                                    }
                                } else {
                                    ywVar.B0();
                                    rzVar2.J(izVar.E("premium"), 0);
                                    rzVar2.H(0);
                                    int i16 = rzVar2.I1;
                                    cxVar.k(i16, i16 > 0 ? i16 : rzVar2.E1);
                                    break;
                                }
                            } else {
                                ywVar.B0();
                                rzVar2.J(izVar.E("fav"), 0);
                                rzVar2.H(0);
                                int i17 = rzVar2.G1;
                                cxVar.k(i17, i17 > 0 ? i17 : rzVar2.E1);
                                break;
                            }
                        } else {
                            ywVar.B0();
                            rzVar2.J(izVar.E("recent"), 0);
                            rzVar2.H(0);
                            int i18 = rzVar2.F1;
                            cxVar.k(i18, i18 > 0 ? i18 : rzVar2.E1);
                            break;
                        }
                    } else {
                        rzVar2.t1.o(new r51(rzVar2.getContext(), new kx(rzVar2), rzVar2.x1, rzVar2.y1, rzVar2.z1, null, rzVar2.Z1));
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        String str;
        int i11;
        rz rzVar = this.b;
        int i12 = rzVar.C1;
        px pxVar = rzVar.P;
        int[] iArr = rzVar.D1;
        bv bvVar = rzVar.B1;
        if (!(view instanceof az)) {
            return false;
        }
        az azVar = (az) view;
        if (azVar.c) {
            View F = pxVar.F(view);
            s4.c1 T = F != null ? pxVar.T(F) : null;
            if (T != null && T.b() <= rzVar.getRecentEmoji().size()) {
                rzVar.t1.n();
            }
            pxVar.v1(view);
            return true;
        }
        if (azVar.getSpan() != null || (str = (String) azVar.getTag()) == null) {
            return false;
        }
        String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
        String str2 = azVar.c ? null : Emoji.emojiColor.get(replace);
        boolean isCompound = CompoundEmoji.isCompound(replace);
        if (!isCompound && !EmojiData.emojiColoredMap.contains(replace)) {
            return false;
        }
        rzVar.R1 = azVar;
        rzVar.U1 = rzVar.S1;
        rzVar.V1 = rzVar.T1;
        if (isCompound) {
            replace = rz.g(replace, str2);
        } else {
            int indexOf = CompoundEmoji.skinTones.indexOf(str2) + 1;
            av avVar = bvVar.c;
            int[] iArr2 = avVar.n;
            if (iArr2[0] != indexOf) {
                iArr2[0] = indexOf;
                avVar.invalidate();
            }
        }
        bvVar.getClass();
        av avVar2 = bvVar.c;
        int i13 = bvVar.e;
        boolean z10 = CompoundEmoji.getCompoundEmojiDrawable(replace) != null;
        bvVar.d = z10;
        Drawable[] drawableArr = avVar2.b;
        int[] iArr3 = avVar2.n;
        avVar2.f = z10;
        avVar2.e = replace;
        if (z10) {
            drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
            drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.e, 0, -2);
            drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.e, 1, -2);
            drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.e, 2, -2);
            drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.e, 3, -2);
            drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.e, 4, -2);
            drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.e, -2, 0);
            drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.e, -2, 1);
            drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.e, -2, 2);
            drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.e, -2, 3);
            drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.e, -2, 4);
            Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
            if (isHandshake != null) {
                int intValue = ((Integer) isHandshake.first).intValue();
                if (iArr3[0] != intValue) {
                    iArr3[0] = intValue;
                    avVar2.invalidate();
                }
                int intValue2 = ((Integer) isHandshake.second).intValue();
                if (iArr3[1] != intValue2) {
                    iArr3[1] = intValue2;
                    avVar2.invalidate();
                }
                avVar2.G = iArr3[0] == iArr3[1];
            }
            avVar2.I = true;
        } else {
            int i14 = 0;
            while (i14 < 6) {
                drawableArr[i14] = Emoji.getEmojiBigDrawable(i14 != 0 ? rz.g(replace, CompoundEmoji.skinTones.get(i14 - 1)) : replace);
                i14++;
            }
        }
        avVar2.invalidate();
        bvVar.setWidth(AndroidUtilities.dp((bvVar.d ? 3 : 0) + 30) + (i13 * 6));
        bvVar.setHeight(((bvVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(bvVar.d ? 11.66f : 15.0f));
        int dp = AndroidUtilities.dp((bvVar.d ? 3 : 0) + 30) + (i13 * 6);
        int dp2 = ((bvVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(bvVar.d ? 11.66f : 15.0f);
        azVar.getLocationOnScreen(iArr);
        if (bvVar.d) {
            i11 = 0;
        } else {
            i11 = AndroidUtilities.dp((r3 * 4) - (AndroidUtilities.isTablet() ? 5 : 1)) + (avVar2.n[0] * i12);
        }
        if (iArr[0] - i11 < AndroidUtilities.dp(5.0f)) {
            i11 = org.telegram.messenger.em.D(5.0f, iArr[0] - i11, i11);
        } else if ((iArr[0] - i11) + dp > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
            i11 += ((iArr[0] - i11) + dp) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
        }
        int i15 = -i11;
        int top = azVar.getTop() < 0 ? azVar.getTop() : 0;
        avVar2.setArrowX((AndroidUtilities.dp(AndroidUtilities.isTablet() ? 30.0f : 22.0f) - i15) + ((int) AndroidUtilities.dpf2(0.5f)));
        bvVar.setFocusable(true);
        bvVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i12) / 2) + ((-view.getMeasuredHeight()) - dp2)) - top);
        rzVar.h.requestDisallowInterceptTouchEvent(true);
        pxVar.c1(true);
        pxVar.v1(view);
        return true;
    }

    @Override // gh.i
    public void e(RectF rectF, View view) {
        this.b.C();
    }

    @Override // le.d
    public /* synthetic */ void B(float f7, int i10) {
    }
}
