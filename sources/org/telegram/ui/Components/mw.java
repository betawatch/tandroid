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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mw implements oi.m, bm0, nn0, oe.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ sz b;

    public /* synthetic */ mw(sz szVar, int i10) {
        this.a = i10;
        this.b = szVar;
    }

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        this.b.R();
    }

    @Override // org.telegram.ui.Components.nn0
    public void a(int i10) {
        int i11;
        ez ezVar;
        switch (this.a) {
            case 2:
                sz szVar = this.b;
                yy yyVar = szVar.i0;
                int i12 = szVar.c1;
                xy xyVar = szVar.n0;
                az azVar = szVar.k0;
                if (i10 != szVar.s0 || !xyVar.x.isEmpty()) {
                    szVar.h0.C0();
                    szVar.p0.k(i10, 0);
                    if (i10 == szVar.r0 || i10 == szVar.s0) {
                        szVar.o0.d.setText("");
                        if (i10 != szVar.s0 || (i11 = xyVar.I) < 1) {
                            ty tyVar = szVar.t1;
                            yyVar.h1((tyVar == null || !tyVar.A()) ? 1 : 0, 0);
                        } else {
                            yyVar.h1(i11, -AndroidUtilities.dp(4.0f));
                        }
                        if (i10 == szVar.s0) {
                            ArrayList<String> arrayList = MessagesController.getInstance(i12).gifSearchEmojies;
                            if (!arrayList.isEmpty()) {
                                azVar.a(arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList<String> arrayList2 = MessagesController.getInstance(i12).gifSearchEmojies;
                        szVar.j0.H(arrayList2.get(i10 - szVar.t0));
                        int i13 = i10 - szVar.t0;
                        if (i13 > 0) {
                            azVar.a(arrayList2.get(i13 - 1), true);
                        }
                        if (i10 - szVar.t0 < arrayList2.size() - 1) {
                            azVar.a(arrayList2.get((i10 - szVar.t0) + 1), true);
                        }
                    }
                    szVar.F(2);
                    break;
                }
                break;
            default:
                sz szVar2 = this.b;
                cx cxVar = szVar2.G0;
                ArrayList arrayList3 = szVar2.d1;
                dx dxVar = szVar2.B0;
                jz jzVar = szVar2.y0;
                zw zwVar = szVar2.D0;
                if (!szVar2.S0) {
                    if (i10 != szVar2.H1) {
                        if (cxVar != null && (ezVar = cxVar.r) != null && ezVar.getSelectedCategory() != null) {
                            cxVar.c(null, false);
                            ezVar.L1(null);
                        }
                        if (i10 != szVar2.F1) {
                            if (i10 != szVar2.G1) {
                                if (i10 != szVar2.I1) {
                                    int i14 = i10 - szVar2.E1;
                                    if (i14 < arrayList3.size()) {
                                        if (i14 >= arrayList3.size()) {
                                            i14 = arrayList3.size() - 1;
                                        }
                                        szVar2.I0 = false;
                                        zwVar.C0();
                                        szVar2.H(jzVar.E(arrayList3.get(i14)), 0);
                                        szVar2.F(0);
                                        szVar2.p(0);
                                        int i15 = szVar2.G1;
                                        if (i15 <= 0 && (i15 = szVar2.F1) <= 0) {
                                            i15 = szVar2.E1;
                                        }
                                        dxVar.k(i10, i15);
                                        szVar2.X1 = false;
                                        szVar2.Y();
                                        break;
                                    }
                                } else {
                                    zwVar.C0();
                                    szVar2.H(jzVar.E("premium"), 0);
                                    szVar2.F(0);
                                    int i16 = szVar2.I1;
                                    dxVar.k(i16, i16 > 0 ? i16 : szVar2.E1);
                                    break;
                                }
                            } else {
                                zwVar.C0();
                                szVar2.H(jzVar.E("fav"), 0);
                                szVar2.F(0);
                                int i17 = szVar2.G1;
                                dxVar.k(i17, i17 > 0 ? i17 : szVar2.E1);
                                break;
                            }
                        } else {
                            zwVar.C0();
                            szVar2.H(jzVar.E("recent"), 0);
                            szVar2.F(0);
                            int i18 = szVar2.F1;
                            dxVar.k(i18, i18 > 0 ? i18 : szVar2.E1);
                            break;
                        }
                    } else {
                        szVar2.t1.o(new p61(szVar2.getContext(), new kx(szVar2), szVar2.x1, szVar2.y1, szVar2.z1, null, szVar2.Z1));
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public boolean c(int i10, View view) {
        String str;
        int i11;
        sz szVar = this.b;
        int i12 = szVar.C1;
        dy dyVar = szVar.P;
        int[] iArr = szVar.D1;
        fv fvVar = szVar.B1;
        if (view instanceof bz) {
            bz bzVar = (bz) view;
            if (bzVar.c) {
                View F = dyVar.F(view);
                s4.e1 T = F != null ? dyVar.T(F) : null;
                if (T != null && T.b() <= szVar.getRecentEmoji().size()) {
                    szVar.t1.n();
                }
                dyVar.D1(view);
                return true;
            }
            if (bzVar.getSpan() == null && (str = (String) bzVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                String str2 = bzVar.c ? null : Emoji.emojiColor.get(replace);
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (isCompound || EmojiData.emojiColoredMap.contains(replace)) {
                    szVar.R1 = bzVar;
                    szVar.U1 = szVar.S1;
                    szVar.V1 = szVar.T1;
                    if (isCompound) {
                        replace = sz.g(replace, str2);
                    } else {
                        int indexOf = CompoundEmoji.skinTones.indexOf(str2) + 1;
                        ev evVar = fvVar.c;
                        int[] iArr2 = evVar.n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            evVar.invalidate();
                        }
                    }
                    fvVar.getClass();
                    ev evVar2 = fvVar.c;
                    int i13 = fvVar.e;
                    boolean z10 = CompoundEmoji.getCompoundEmojiDrawable(replace) != null;
                    fvVar.d = z10;
                    Drawable[] drawableArr = evVar2.b;
                    int[] iArr3 = evVar2.n;
                    evVar2.f = z10;
                    evVar2.e = replace;
                    if (z10) {
                        drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                        drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(evVar2.e, 0, -2);
                        drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(evVar2.e, 1, -2);
                        drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(evVar2.e, 2, -2);
                        drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(evVar2.e, 3, -2);
                        drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(evVar2.e, 4, -2);
                        drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(evVar2.e, -2, 0);
                        drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(evVar2.e, -2, 1);
                        drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(evVar2.e, -2, 2);
                        drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(evVar2.e, -2, 3);
                        drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(evVar2.e, -2, 4);
                        Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                        if (isHandshake != null) {
                            int intValue = ((Integer) isHandshake.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                evVar2.invalidate();
                            }
                            int intValue2 = ((Integer) isHandshake.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                evVar2.invalidate();
                            }
                            evVar2.G = iArr3[0] == iArr3[1];
                        }
                        evVar2.I = true;
                    } else {
                        int i14 = 0;
                        while (i14 < 6) {
                            drawableArr[i14] = Emoji.getEmojiBigDrawable(i14 != 0 ? sz.g(replace, CompoundEmoji.skinTones.get(i14 - 1)) : replace);
                            i14++;
                        }
                    }
                    evVar2.invalidate();
                    fvVar.setWidth(AndroidUtilities.dp((fvVar.d ? 3 : 0) + 30) + (i13 * 6));
                    fvVar.setHeight(((fvVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(fvVar.d ? 11.66f : 15.0f));
                    int dp = AndroidUtilities.dp((fvVar.d ? 3 : 0) + 30) + (i13 * 6);
                    int dp2 = ((fvVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(fvVar.d ? 11.66f : 15.0f);
                    bzVar.getLocationOnScreen(iArr);
                    if (fvVar.d) {
                        i11 = 0;
                    } else {
                        i11 = AndroidUtilities.dp((r3 * 4) - (AndroidUtilities.isTablet() ? 5 : 1)) + (evVar2.n[0] * i12);
                    }
                    if (iArr[0] - i11 < AndroidUtilities.dp(5.0f)) {
                        i11 = org.telegram.ui.d3.w(5.0f, iArr[0] - i11, i11);
                    } else if ((iArr[0] - i11) + dp > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
                        i11 += ((iArr[0] - i11) + dp) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
                    }
                    int i15 = -i11;
                    int top = bzVar.getTop() < 0 ? bzVar.getTop() : 0;
                    evVar2.setArrowX((AndroidUtilities.dp(AndroidUtilities.isTablet() ? 30.0f : 22.0f) - i15) + ((int) AndroidUtilities.dpf2(0.5f)));
                    fvVar.setFocusable(true);
                    fvVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i12) / 2) + ((-view.getMeasuredHeight()) - dp2)) - top);
                    szVar.h.requestDisallowInterceptTouchEvent(true);
                    dyVar.d1(true);
                    dyVar.D1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // oi.m
    public void k(int i10) {
        sz szVar = this.b;
        ch.f fVar = szVar.j2;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        if (a8.pf.a(i10, 4)) {
            fVar.h(szVar.n2.e());
        }
        fVar.e(szVar.k2, szVar.getWidth(), szVar.getHeight());
    }

    @Override // oe.d
    public /* synthetic */ void z(float f7, int i10) {
    }
}
