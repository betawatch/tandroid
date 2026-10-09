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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uw implements li.c, gm0, mn0, me.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ a00 b;

    public /* synthetic */ uw(a00 a00Var, int i10) {
        this.a = i10;
        this.b = a00Var;
    }

    @Override // org.telegram.ui.Components.mn0
    public void a(int i10) {
        int i11;
        lz lzVar;
        switch (this.a) {
            case 2:
                a00 a00Var = this.b;
                fz fzVar = a00Var.i0;
                int i12 = a00Var.c1;
                ez ezVar = a00Var.n0;
                hz hzVar = a00Var.k0;
                if (i10 != a00Var.s0 || !ezVar.x.isEmpty()) {
                    a00Var.h0.B0();
                    a00Var.p0.k(i10, 0);
                    if (i10 == a00Var.r0 || i10 == a00Var.s0) {
                        a00Var.o0.d.setText("");
                        if (i10 != a00Var.s0 || (i11 = ezVar.I) < 1) {
                            az azVar = a00Var.t1;
                            fzVar.h1((azVar == null || !azVar.A()) ? 1 : 0, 0);
                        } else {
                            fzVar.h1(i11, -AndroidUtilities.dp(4.0f));
                        }
                        if (i10 == a00Var.s0) {
                            ArrayList<String> arrayList = MessagesController.getInstance(i12).gifSearchEmojies;
                            if (!arrayList.isEmpty()) {
                                hzVar.a(arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList<String> arrayList2 = MessagesController.getInstance(i12).gifSearchEmojies;
                        a00Var.j0.H(arrayList2.get(i10 - a00Var.t0));
                        int i13 = i10 - a00Var.t0;
                        if (i13 > 0) {
                            hzVar.a(arrayList2.get(i13 - 1), true);
                        }
                        if (i10 - a00Var.t0 < arrayList2.size() - 1) {
                            hzVar.a(arrayList2.get((i10 - a00Var.t0) + 1), true);
                        }
                    }
                    a00Var.F(2);
                    break;
                }
                break;
            default:
                a00 a00Var2 = this.b;
                lx lxVar = a00Var2.G0;
                ArrayList arrayList3 = a00Var2.d1;
                mx mxVar = a00Var2.B0;
                qz qzVar = a00Var2.y0;
                ix ixVar = a00Var2.D0;
                if (!a00Var2.S0) {
                    if (i10 != a00Var2.H1) {
                        if (lxVar != null && (lzVar = lxVar.r) != null && lzVar.getSelectedCategory() != null) {
                            lxVar.c(null, false);
                            lzVar.G1(null);
                        }
                        if (i10 != a00Var2.F1) {
                            if (i10 != a00Var2.G1) {
                                if (i10 != a00Var2.I1) {
                                    int i14 = i10 - a00Var2.E1;
                                    if (i14 < arrayList3.size()) {
                                        if (i14 >= arrayList3.size()) {
                                            i14 = arrayList3.size() - 1;
                                        }
                                        a00Var2.I0 = false;
                                        ixVar.B0();
                                        a00Var2.H(qzVar.E(arrayList3.get(i14)), 0);
                                        a00Var2.F(0);
                                        a00Var2.q(0);
                                        int i15 = a00Var2.G1;
                                        if (i15 <= 0 && (i15 = a00Var2.F1) <= 0) {
                                            i15 = a00Var2.E1;
                                        }
                                        mxVar.k(i10, i15);
                                        a00Var2.X1 = false;
                                        a00Var2.Y();
                                        break;
                                    }
                                } else {
                                    ixVar.B0();
                                    a00Var2.H(qzVar.E("premium"), 0);
                                    a00Var2.F(0);
                                    int i16 = a00Var2.I1;
                                    mxVar.k(i16, i16 > 0 ? i16 : a00Var2.E1);
                                    break;
                                }
                            } else {
                                ixVar.B0();
                                a00Var2.H(qzVar.E("fav"), 0);
                                a00Var2.F(0);
                                int i17 = a00Var2.G1;
                                mxVar.k(i17, i17 > 0 ? i17 : a00Var2.E1);
                                break;
                            }
                        } else {
                            ixVar.B0();
                            a00Var2.H(qzVar.E("recent"), 0);
                            a00Var2.F(0);
                            int i18 = a00Var2.F1;
                            mxVar.k(i18, i18 > 0 ? i18 : a00Var2.E1);
                            break;
                        }
                    } else {
                        a00Var2.t1.o(new l61(a00Var2.getContext(), new ux(a00Var2), a00Var2.x1, a00Var2.y1, a00Var2.z1, null, a00Var2.Z1));
                        break;
                    }
                }
                break;
        }
    }

    @Override // li.c
    public void b(int i10) {
        a00 a00Var = this.b;
        ah.h hVar = a00Var.j2;
        RectF rectF = a00Var.y2;
        if (Build.VERSION.SDK_INT < 31 || hVar == null) {
            return;
        }
        hh.j.c(a00Var.w, a00Var, rectF);
        rectF.inset(LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f), LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        rectF.right = a00Var.getMeasuredWidth();
        rectF.bottom = Math.min(rectF.bottom, a00Var.getMeasuredHeight());
        hVar.g(!rectF.isEmpty() ? 1 : 0, a00Var.z2);
        hVar.e(a00Var.k2, a00Var.getWidth(), a00Var.getHeight());
    }

    @Override // org.telegram.ui.Components.gm0
    public boolean d(int i10, View view) {
        String str;
        int i11;
        a00 a00Var = this.b;
        int i12 = a00Var.C1;
        my myVar = a00Var.P;
        int[] iArr = a00Var.D1;
        nv nvVar = a00Var.B1;
        if (view instanceof iz) {
            iz izVar = (iz) view;
            if (izVar.c) {
                View F = myVar.F(view);
                s4.d1 T = F != null ? myVar.T(F) : null;
                if (T != null && T.b() <= a00Var.getRecentEmoji().size()) {
                    a00Var.t1.n();
                }
                myVar.y1(view);
                return true;
            }
            if (izVar.getSpan() == null && (str = (String) izVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                String str2 = izVar.c ? null : Emoji.emojiColor.get(replace);
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (isCompound || EmojiData.emojiColoredMap.contains(replace)) {
                    a00Var.R1 = izVar;
                    a00Var.U1 = a00Var.S1;
                    a00Var.V1 = a00Var.T1;
                    if (isCompound) {
                        replace = a00.g(replace, str2);
                    } else {
                        int indexOf = CompoundEmoji.skinTones.indexOf(str2) + 1;
                        mv mvVar = nvVar.c;
                        int[] iArr2 = mvVar.n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            mvVar.invalidate();
                        }
                    }
                    nvVar.getClass();
                    mv mvVar2 = nvVar.c;
                    int i13 = nvVar.e;
                    boolean z10 = CompoundEmoji.getCompoundEmojiDrawable(replace) != null;
                    nvVar.d = z10;
                    Drawable[] drawableArr = mvVar2.b;
                    int[] iArr3 = mvVar2.n;
                    mvVar2.f = z10;
                    mvVar2.e = replace;
                    if (z10) {
                        drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                        drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(mvVar2.e, 0, -2);
                        drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(mvVar2.e, 1, -2);
                        drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(mvVar2.e, 2, -2);
                        drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(mvVar2.e, 3, -2);
                        drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(mvVar2.e, 4, -2);
                        drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(mvVar2.e, -2, 0);
                        drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(mvVar2.e, -2, 1);
                        drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(mvVar2.e, -2, 2);
                        drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(mvVar2.e, -2, 3);
                        drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(mvVar2.e, -2, 4);
                        Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                        if (isHandshake != null) {
                            int intValue = ((Integer) isHandshake.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                mvVar2.invalidate();
                            }
                            int intValue2 = ((Integer) isHandshake.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                mvVar2.invalidate();
                            }
                            mvVar2.G = iArr3[0] == iArr3[1];
                        }
                        mvVar2.I = true;
                    } else {
                        int i14 = 0;
                        while (i14 < 6) {
                            drawableArr[i14] = Emoji.getEmojiBigDrawable(i14 != 0 ? a00.g(replace, CompoundEmoji.skinTones.get(i14 - 1)) : replace);
                            i14++;
                        }
                    }
                    mvVar2.invalidate();
                    nvVar.setWidth(AndroidUtilities.dp((nvVar.d ? 3 : 0) + 30) + (i13 * 6));
                    nvVar.setHeight(((nvVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(nvVar.d ? 11.66f : 15.0f));
                    int dp = AndroidUtilities.dp((nvVar.d ? 3 : 0) + 30) + (i13 * 6);
                    int dp2 = ((nvVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(nvVar.d ? 11.66f : 15.0f);
                    izVar.getLocationOnScreen(iArr);
                    if (nvVar.d) {
                        i11 = 0;
                    } else {
                        i11 = AndroidUtilities.dp((r3 * 4) - (AndroidUtilities.isTablet() ? 5 : 1)) + (mvVar2.n[0] * i12);
                    }
                    if (iArr[0] - i11 < AndroidUtilities.dp(5.0f)) {
                        i11 = org.telegram.messenger.bi.D(5.0f, iArr[0] - i11, i11);
                    } else if ((iArr[0] - i11) + dp > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
                        i11 += ((iArr[0] - i11) + dp) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
                    }
                    int i15 = -i11;
                    int top = izVar.getTop() < 0 ? izVar.getTop() : 0;
                    mvVar2.setArrowX((AndroidUtilities.dp(AndroidUtilities.isTablet() ? 30.0f : 22.0f) - i15) + ((int) AndroidUtilities.dpf2(0.5f)));
                    nvVar.setFocusable(true);
                    nvVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i12) / 2) + ((-view.getMeasuredHeight()) - dp2)) - top);
                    a00Var.h.requestDisallowInterceptTouchEvent(true);
                    myVar.d1(true);
                    myVar.y1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // me.d
    public void n(int i10, float f7, float f10, me.e eVar) {
        this.b.R();
    }

    @Override // me.d
    public /* synthetic */ void A(float f7, int i10) {
    }
}
