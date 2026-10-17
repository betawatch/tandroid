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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mw implements ni.c, yl0, en0, ne.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ tz b;

    public /* synthetic */ mw(tz tzVar, int i10) {
        this.a = i10;
        this.b = tzVar;
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        String str;
        int i11;
        tz tzVar = this.b;
        int i12 = tzVar.C1;
        ey eyVar = tzVar.P;
        int[] iArr = tzVar.D1;
        ev evVar = tzVar.B1;
        if (view instanceof cz) {
            cz czVar = (cz) view;
            if (czVar.c) {
                View F = eyVar.F(view);
                s4.b1 T = F != null ? eyVar.T(F) : null;
                if (T != null && T.b() <= tzVar.getRecentEmoji().size()) {
                    tzVar.t1.n();
                }
                eyVar.y1(view);
                return true;
            }
            if (czVar.getSpan() == null && (str = (String) czVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                String str2 = czVar.c ? null : Emoji.emojiColor.get(replace);
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (isCompound || EmojiData.emojiColoredMap.contains(replace)) {
                    tzVar.R1 = czVar;
                    tzVar.U1 = tzVar.S1;
                    tzVar.V1 = tzVar.T1;
                    if (isCompound) {
                        replace = tz.g(replace, str2);
                    } else {
                        int indexOf = CompoundEmoji.skinTones.indexOf(str2) + 1;
                        dv dvVar = evVar.c;
                        int[] iArr2 = dvVar.n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            dvVar.invalidate();
                        }
                    }
                    evVar.getClass();
                    dv dvVar2 = evVar.c;
                    int i13 = evVar.e;
                    boolean z10 = CompoundEmoji.getCompoundEmojiDrawable(replace) != null;
                    evVar.d = z10;
                    Drawable[] drawableArr = dvVar2.b;
                    int[] iArr3 = dvVar2.n;
                    dvVar2.f = z10;
                    dvVar2.e = replace;
                    if (z10) {
                        drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                        drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(dvVar2.e, 0, -2);
                        drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(dvVar2.e, 1, -2);
                        drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(dvVar2.e, 2, -2);
                        drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(dvVar2.e, 3, -2);
                        drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(dvVar2.e, 4, -2);
                        drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(dvVar2.e, -2, 0);
                        drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(dvVar2.e, -2, 1);
                        drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(dvVar2.e, -2, 2);
                        drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(dvVar2.e, -2, 3);
                        drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(dvVar2.e, -2, 4);
                        Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                        if (isHandshake != null) {
                            int intValue = ((Integer) isHandshake.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                dvVar2.invalidate();
                            }
                            int intValue2 = ((Integer) isHandshake.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                dvVar2.invalidate();
                            }
                            dvVar2.G = iArr3[0] == iArr3[1];
                        }
                        dvVar2.I = true;
                    } else {
                        int i14 = 0;
                        while (i14 < 6) {
                            drawableArr[i14] = Emoji.getEmojiBigDrawable(i14 != 0 ? tz.g(replace, CompoundEmoji.skinTones.get(i14 - 1)) : replace);
                            i14++;
                        }
                    }
                    dvVar2.invalidate();
                    evVar.setWidth(AndroidUtilities.dp((evVar.d ? 3 : 0) + 30) + (i13 * 6));
                    evVar.setHeight(((evVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(evVar.d ? 11.66f : 15.0f));
                    int dp = AndroidUtilities.dp((evVar.d ? 3 : 0) + 30) + (i13 * 6);
                    int dp2 = ((evVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(evVar.d ? 11.66f : 15.0f);
                    czVar.getLocationOnScreen(iArr);
                    if (evVar.d) {
                        i11 = 0;
                    } else {
                        i11 = AndroidUtilities.dp((r3 * 4) - (AndroidUtilities.isTablet() ? 5 : 1)) + (dvVar2.n[0] * i12);
                    }
                    if (iArr[0] - i11 < AndroidUtilities.dp(5.0f)) {
                        i11 = org.telegram.ui.Cells.t0.e(5.0f, iArr[0] - i11, i11);
                    } else if ((iArr[0] - i11) + dp > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
                        i11 += ((iArr[0] - i11) + dp) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
                    }
                    int i15 = -i11;
                    int top = czVar.getTop() < 0 ? czVar.getTop() : 0;
                    dvVar2.setArrowX((AndroidUtilities.dp(AndroidUtilities.isTablet() ? 30.0f : 22.0f) - i15) + ((int) AndroidUtilities.dpf2(0.5f)));
                    evVar.setFocusable(true);
                    evVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i12) / 2) + ((-view.getMeasuredHeight()) - dp2)) - top);
                    tzVar.h.requestDisallowInterceptTouchEvent(true);
                    eyVar.d1(true);
                    eyVar.y1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.en0
    public void b(int i10) {
        int i11;
        fz fzVar;
        switch (this.a) {
            case 2:
                tz tzVar = this.b;
                zy zyVar = tzVar.i0;
                int i12 = tzVar.c1;
                yy yyVar = tzVar.n0;
                bz bzVar = tzVar.k0;
                if (i10 != tzVar.s0 || !yyVar.x.isEmpty()) {
                    tzVar.h0.B0();
                    tzVar.p0.k(i10, 0);
                    if (i10 == tzVar.r0 || i10 == tzVar.s0) {
                        tzVar.o0.d.setText("");
                        if (i10 != tzVar.s0 || (i11 = yyVar.I) < 1) {
                            uy uyVar = tzVar.t1;
                            zyVar.h1((uyVar == null || !uyVar.A()) ? 1 : 0, 0);
                        } else {
                            zyVar.h1(i11, -AndroidUtilities.dp(4.0f));
                        }
                        if (i10 == tzVar.s0) {
                            ArrayList<String> arrayList = MessagesController.getInstance(i12).gifSearchEmojies;
                            if (!arrayList.isEmpty()) {
                                bzVar.a(arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList<String> arrayList2 = MessagesController.getInstance(i12).gifSearchEmojies;
                        tzVar.j0.H(arrayList2.get(i10 - tzVar.t0));
                        int i13 = i10 - tzVar.t0;
                        if (i13 > 0) {
                            bzVar.a(arrayList2.get(i13 - 1), true);
                        }
                        if (i10 - tzVar.t0 < arrayList2.size() - 1) {
                            bzVar.a(arrayList2.get((i10 - tzVar.t0) + 1), true);
                        }
                    }
                    tzVar.F(2);
                    break;
                }
                break;
            default:
                tz tzVar2 = this.b;
                dx dxVar = tzVar2.G0;
                ArrayList arrayList3 = tzVar2.d1;
                ex exVar = tzVar2.B0;
                kz kzVar = tzVar2.y0;
                ax axVar = tzVar2.D0;
                if (!tzVar2.S0) {
                    if (i10 != tzVar2.H1) {
                        if (dxVar != null && (fzVar = dxVar.r) != null && fzVar.getSelectedCategory() != null) {
                            dxVar.c(null, false);
                            fzVar.G1(null);
                        }
                        if (i10 != tzVar2.F1) {
                            if (i10 != tzVar2.G1) {
                                if (i10 != tzVar2.I1) {
                                    int i14 = i10 - tzVar2.E1;
                                    if (i14 < arrayList3.size()) {
                                        if (i14 >= arrayList3.size()) {
                                            i14 = arrayList3.size() - 1;
                                        }
                                        tzVar2.I0 = false;
                                        axVar.B0();
                                        tzVar2.H(kzVar.E(arrayList3.get(i14)), 0);
                                        tzVar2.F(0);
                                        tzVar2.p(0);
                                        int i15 = tzVar2.G1;
                                        if (i15 <= 0 && (i15 = tzVar2.F1) <= 0) {
                                            i15 = tzVar2.E1;
                                        }
                                        exVar.k(i10, i15);
                                        tzVar2.X1 = false;
                                        tzVar2.Y();
                                        break;
                                    }
                                } else {
                                    axVar.B0();
                                    tzVar2.H(kzVar.E("premium"), 0);
                                    tzVar2.F(0);
                                    int i16 = tzVar2.I1;
                                    exVar.k(i16, i16 > 0 ? i16 : tzVar2.E1);
                                    break;
                                }
                            } else {
                                axVar.B0();
                                tzVar2.H(kzVar.E("fav"), 0);
                                tzVar2.F(0);
                                int i17 = tzVar2.G1;
                                exVar.k(i17, i17 > 0 ? i17 : tzVar2.E1);
                                break;
                            }
                        } else {
                            axVar.B0();
                            tzVar2.H(kzVar.E("recent"), 0);
                            tzVar2.F(0);
                            int i18 = tzVar2.F1;
                            exVar.k(i18, i18 > 0 ? i18 : tzVar2.E1);
                            break;
                        }
                    } else {
                        tzVar2.t1.o(new b61(tzVar2.getContext(), new mx(tzVar2), tzVar2.x1, tzVar2.y1, tzVar2.z1, null, tzVar2.Z1));
                        break;
                    }
                }
                break;
        }
    }

    @Override // ni.c
    public void c(int i10) {
        tz tzVar = this.b;
        bh.f fVar = tzVar.j2;
        RectF rectF = tzVar.y2;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        ih.j.c(tzVar.w, tzVar, rectF);
        rectF.inset(LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f), LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        rectF.right = tzVar.getMeasuredWidth();
        rectF.bottom = Math.min(rectF.bottom, tzVar.getMeasuredHeight());
        fVar.g(!rectF.isEmpty() ? 1 : 0, tzVar.z2);
        fVar.e(tzVar.k2, tzVar.getWidth(), tzVar.getHeight());
    }

    @Override // ne.d
    public void u(int i10, float f7, float f10, ne.e eVar) {
        this.b.R();
    }

    @Override // ne.d
    public /* synthetic */ void E(float f7, int i10) {
    }
}
