package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class iw implements li.i, ol0, ym0, le.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ nz b;

    public /* synthetic */ iw(nz nzVar, int i10) {
        this.a = i10;
        this.b = nzVar;
    }

    @Override // org.telegram.ui.Components.ym0
    public void a(int i10) {
        int i11;
        zy zyVar;
        switch (this.a) {
            case 2:
                nz nzVar = this.b;
                ty tyVar = nzVar.i0;
                int i12 = nzVar.c1;
                sy syVar = nzVar.n0;
                vy vyVar = nzVar.k0;
                if (i10 != nzVar.s0 || !syVar.x.isEmpty()) {
                    nzVar.h0.C0();
                    nzVar.p0.k(i10, 0);
                    if (i10 == nzVar.r0 || i10 == nzVar.s0) {
                        nzVar.o0.d.setText("");
                        if (i10 != nzVar.s0 || (i11 = syVar.I) < 1) {
                            oy oyVar = nzVar.t1;
                            tyVar.h1((oyVar == null || !oyVar.A()) ? 1 : 0, 0);
                        } else {
                            tyVar.h1(i11, -AndroidUtilities.dp(4.0f));
                        }
                        if (i10 == nzVar.s0) {
                            ArrayList<String> arrayList = MessagesController.getInstance(i12).gifSearchEmojies;
                            if (!arrayList.isEmpty()) {
                                vyVar.a(arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList<String> arrayList2 = MessagesController.getInstance(i12).gifSearchEmojies;
                        nzVar.j0.H(arrayList2.get(i10 - nzVar.t0));
                        int i13 = i10 - nzVar.t0;
                        if (i13 > 0) {
                            vyVar.a(arrayList2.get(i13 - 1), true);
                        }
                        if (i10 - nzVar.t0 < arrayList2.size() - 1) {
                            vyVar.a(arrayList2.get((i10 - nzVar.t0) + 1), true);
                        }
                    }
                    nzVar.D(2);
                    break;
                }
                break;
            default:
                nz nzVar2 = this.b;
                zw zwVar = nzVar2.G0;
                ArrayList arrayList3 = nzVar2.d1;
                ax axVar = nzVar2.B0;
                ez ezVar = nzVar2.y0;
                vw vwVar = nzVar2.D0;
                if (!nzVar2.S0) {
                    if (i10 != nzVar2.H1) {
                        if (zwVar != null && (zyVar = zwVar.r) != null && zyVar.getSelectedCategory() != null) {
                            zwVar.c(null, false);
                            zyVar.H1(null);
                        }
                        if (i10 != nzVar2.F1) {
                            if (i10 != nzVar2.G1) {
                                if (i10 != nzVar2.I1) {
                                    int i14 = i10 - nzVar2.E1;
                                    if (i14 < arrayList3.size()) {
                                        if (i14 >= arrayList3.size()) {
                                            i14 = arrayList3.size() - 1;
                                        }
                                        nzVar2.I0 = false;
                                        vwVar.C0();
                                        nzVar2.F(ezVar.E(arrayList3.get(i14)), 0);
                                        nzVar2.D(0);
                                        nzVar2.p(0);
                                        int i15 = nzVar2.G1;
                                        if (i15 <= 0 && (i15 = nzVar2.F1) <= 0) {
                                            i15 = nzVar2.E1;
                                        }
                                        axVar.k(i10, i15);
                                        nzVar2.X1 = false;
                                        nzVar2.X();
                                        break;
                                    }
                                } else {
                                    vwVar.C0();
                                    nzVar2.F(ezVar.E("premium"), 0);
                                    nzVar2.D(0);
                                    int i16 = nzVar2.I1;
                                    axVar.k(i16, i16 > 0 ? i16 : nzVar2.E1);
                                    break;
                                }
                            } else {
                                vwVar.C0();
                                nzVar2.F(ezVar.E("fav"), 0);
                                nzVar2.D(0);
                                int i17 = nzVar2.G1;
                                axVar.k(i17, i17 > 0 ? i17 : nzVar2.E1);
                                break;
                            }
                        } else {
                            vwVar.C0();
                            nzVar2.F(ezVar.E("recent"), 0);
                            nzVar2.D(0);
                            int i18 = nzVar2.F1;
                            axVar.k(i18, i18 > 0 ? i18 : nzVar2.E1);
                            break;
                        }
                    } else {
                        nzVar2.t1.o(new c61(nzVar2.getContext(), new hx(nzVar2), nzVar2.x1, nzVar2.y1, nzVar2.z1, null, nzVar2.Z1));
                        break;
                    }
                }
                break;
        }
    }

    @Override // le.d
    public void a0(int i10, float f7, float f10, le.e eVar) {
        this.b.P();
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        String str;
        int i11;
        nz nzVar = this.b;
        int i12 = nzVar.C1;
        zx zxVar = nzVar.P;
        int[] iArr = nzVar.D1;
        bv bvVar = nzVar.B1;
        if (!(view instanceof wy)) {
            return false;
        }
        wy wyVar = (wy) view;
        if (wyVar.c) {
            View F = zxVar.F(view);
            s4.c1 T = F != null ? zxVar.T(F) : null;
            if (T != null && T.b() <= nzVar.getRecentEmoji().size()) {
                nzVar.t1.n();
            }
            zxVar.z1(view);
            return true;
        }
        if (wyVar.getSpan() != null || (str = (String) wyVar.getTag()) == null) {
            return false;
        }
        String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
        String str2 = wyVar.c ? null : Emoji.emojiColor.get(replace);
        boolean isCompound = CompoundEmoji.isCompound(replace);
        if (!isCompound && !EmojiData.emojiColoredMap.contains(replace)) {
            return false;
        }
        nzVar.R1 = wyVar;
        nzVar.U1 = nzVar.S1;
        nzVar.V1 = nzVar.T1;
        if (isCompound) {
            replace = nz.g(replace, str2);
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
                drawableArr[i14] = Emoji.getEmojiBigDrawable(i14 != 0 ? nz.g(replace, CompoundEmoji.skinTones.get(i14 - 1)) : replace);
                i14++;
            }
        }
        avVar2.invalidate();
        bvVar.setWidth(AndroidUtilities.dp((bvVar.d ? 3 : 0) + 30) + (i13 * 6));
        bvVar.setHeight(((bvVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(bvVar.d ? 11.66f : 15.0f));
        int dp = AndroidUtilities.dp((bvVar.d ? 3 : 0) + 30) + (i13 * 6);
        int dp2 = ((bvVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(bvVar.d ? 11.66f : 15.0f);
        wyVar.getLocationOnScreen(iArr);
        if (bvVar.d) {
            i11 = 0;
        } else {
            i11 = AndroidUtilities.dp((r3 * 4) - (AndroidUtilities.isTablet() ? 5 : 1)) + (avVar2.n[0] * i12);
        }
        if (iArr[0] - i11 < AndroidUtilities.dp(5.0f)) {
            i11 = org.telegram.messenger.ok.D(5.0f, iArr[0] - i11, i11);
        } else if ((iArr[0] - i11) + dp > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
            i11 += ((iArr[0] - i11) + dp) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
        }
        int i15 = -i11;
        int top = wyVar.getTop() < 0 ? wyVar.getTop() : 0;
        avVar2.setArrowX((AndroidUtilities.dp(AndroidUtilities.isTablet() ? 30.0f : 22.0f) - i15) + ((int) AndroidUtilities.dpf2(0.5f)));
        bvVar.setFocusable(true);
        bvVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i12) / 2) + ((-view.getMeasuredHeight()) - dp2)) - top);
        nzVar.h.requestDisallowInterceptTouchEvent(true);
        zxVar.e1(true);
        zxVar.z1(view);
        return true;
    }

    @Override // li.i
    public void k(int i10) {
        nz nzVar = this.b;
        ah.i iVar = nzVar.j2;
        if (Build.VERSION.SDK_INT < 31 || iVar == null) {
            return;
        }
        if (w7.e0.a(i10, 4)) {
            iVar.h(nzVar.m2.e());
        }
        iVar.e(nzVar.k2, nzVar.getWidth(), nzVar.getHeight());
    }

    @Override // le.d
    public /* synthetic */ void V(float f7, int i10) {
    }
}
