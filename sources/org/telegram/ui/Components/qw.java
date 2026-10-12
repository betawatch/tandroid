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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class qw implements ni.c, cm0, in0, ne.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ wz b;

    public /* synthetic */ qw(wz wzVar, int i10) {
        this.a = i10;
        this.b = wzVar;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        String str;
        int i11;
        wz wzVar = this.b;
        int i12 = wzVar.C1;
        iy iyVar = wzVar.P;
        int[] iArr = wzVar.D1;
        jv jvVar = wzVar.B1;
        if (view instanceof ez) {
            ez ezVar = (ez) view;
            if (ezVar.c) {
                View F = iyVar.F(view);
                s4.b1 T = F != null ? iyVar.T(F) : null;
                if (T != null && T.b() <= wzVar.getRecentEmoji().size()) {
                    wzVar.t1.n();
                }
                iyVar.y1(view);
                return true;
            }
            if (ezVar.getSpan() == null && (str = (String) ezVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                String str2 = ezVar.c ? null : Emoji.emojiColor.get(replace);
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (isCompound || EmojiData.emojiColoredMap.contains(replace)) {
                    wzVar.R1 = ezVar;
                    wzVar.U1 = wzVar.S1;
                    wzVar.V1 = wzVar.T1;
                    if (isCompound) {
                        replace = wz.g(replace, str2);
                    } else {
                        int indexOf = CompoundEmoji.skinTones.indexOf(str2) + 1;
                        iv ivVar = jvVar.c;
                        int[] iArr2 = ivVar.n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            ivVar.invalidate();
                        }
                    }
                    jvVar.getClass();
                    iv ivVar2 = jvVar.c;
                    int i13 = jvVar.e;
                    boolean z10 = CompoundEmoji.getCompoundEmojiDrawable(replace) != null;
                    jvVar.d = z10;
                    Drawable[] drawableArr = ivVar2.b;
                    int[] iArr3 = ivVar2.n;
                    ivVar2.f = z10;
                    ivVar2.e = replace;
                    if (z10) {
                        drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                        drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(ivVar2.e, 0, -2);
                        drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(ivVar2.e, 1, -2);
                        drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(ivVar2.e, 2, -2);
                        drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(ivVar2.e, 3, -2);
                        drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(ivVar2.e, 4, -2);
                        drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(ivVar2.e, -2, 0);
                        drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(ivVar2.e, -2, 1);
                        drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(ivVar2.e, -2, 2);
                        drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(ivVar2.e, -2, 3);
                        drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(ivVar2.e, -2, 4);
                        Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                        if (isHandshake != null) {
                            int intValue = ((Integer) isHandshake.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                ivVar2.invalidate();
                            }
                            int intValue2 = ((Integer) isHandshake.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                ivVar2.invalidate();
                            }
                            ivVar2.G = iArr3[0] == iArr3[1];
                        }
                        ivVar2.I = true;
                    } else {
                        int i14 = 0;
                        while (i14 < 6) {
                            drawableArr[i14] = Emoji.getEmojiBigDrawable(i14 != 0 ? wz.g(replace, CompoundEmoji.skinTones.get(i14 - 1)) : replace);
                            i14++;
                        }
                    }
                    ivVar2.invalidate();
                    jvVar.setWidth(AndroidUtilities.dp((jvVar.d ? 3 : 0) + 30) + (i13 * 6));
                    jvVar.setHeight(((jvVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(jvVar.d ? 11.66f : 15.0f));
                    int dp = AndroidUtilities.dp((jvVar.d ? 3 : 0) + 30) + (i13 * 6);
                    int dp2 = ((jvVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(jvVar.d ? 11.66f : 15.0f);
                    ezVar.getLocationOnScreen(iArr);
                    if (jvVar.d) {
                        i11 = 0;
                    } else {
                        i11 = AndroidUtilities.dp((r3 * 4) - (AndroidUtilities.isTablet() ? 5 : 1)) + (ivVar2.n[0] * i12);
                    }
                    if (iArr[0] - i11 < AndroidUtilities.dp(5.0f)) {
                        i11 = org.telegram.ui.Cells.d0.b(5.0f, iArr[0] - i11, i11);
                    } else if ((iArr[0] - i11) + dp > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
                        i11 += ((iArr[0] - i11) + dp) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
                    }
                    int i15 = -i11;
                    int top = ezVar.getTop() < 0 ? ezVar.getTop() : 0;
                    ivVar2.setArrowX((AndroidUtilities.dp(AndroidUtilities.isTablet() ? 30.0f : 22.0f) - i15) + ((int) AndroidUtilities.dpf2(0.5f)));
                    jvVar.setFocusable(true);
                    jvVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i12) / 2) + ((-view.getMeasuredHeight()) - dp2)) - top);
                    wzVar.h.requestDisallowInterceptTouchEvent(true);
                    iyVar.d1(true);
                    iyVar.y1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.in0
    public void b(int i10) {
        int i11;
        hz hzVar;
        switch (this.a) {
            case 2:
                wz wzVar = this.b;
                bz bzVar = wzVar.i0;
                int i12 = wzVar.c1;
                az azVar = wzVar.n0;
                dz dzVar = wzVar.k0;
                if (i10 != wzVar.s0 || !azVar.x.isEmpty()) {
                    wzVar.h0.B0();
                    wzVar.p0.k(i10, 0);
                    if (i10 == wzVar.r0 || i10 == wzVar.s0) {
                        wzVar.o0.d.setText("");
                        if (i10 != wzVar.s0 || (i11 = azVar.I) < 1) {
                            wy wyVar = wzVar.t1;
                            bzVar.h1((wyVar == null || !wyVar.A()) ? 1 : 0, 0);
                        } else {
                            bzVar.h1(i11, -AndroidUtilities.dp(4.0f));
                        }
                        if (i10 == wzVar.s0) {
                            ArrayList<String> arrayList = MessagesController.getInstance(i12).gifSearchEmojies;
                            if (!arrayList.isEmpty()) {
                                dzVar.a(arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList<String> arrayList2 = MessagesController.getInstance(i12).gifSearchEmojies;
                        wzVar.j0.H(arrayList2.get(i10 - wzVar.t0));
                        int i13 = i10 - wzVar.t0;
                        if (i13 > 0) {
                            dzVar.a(arrayList2.get(i13 - 1), true);
                        }
                        if (i10 - wzVar.t0 < arrayList2.size() - 1) {
                            dzVar.a(arrayList2.get((i10 - wzVar.t0) + 1), true);
                        }
                    }
                    wzVar.F(2);
                    break;
                }
                break;
            default:
                wz wzVar2 = this.b;
                hx hxVar = wzVar2.G0;
                ArrayList arrayList3 = wzVar2.d1;
                ix ixVar = wzVar2.B0;
                mz mzVar = wzVar2.y0;
                ex exVar = wzVar2.D0;
                if (!wzVar2.S0) {
                    if (i10 != wzVar2.H1) {
                        if (hxVar != null && (hzVar = hxVar.r) != null && hzVar.getSelectedCategory() != null) {
                            hxVar.c(null, false);
                            hzVar.G1(null);
                        }
                        if (i10 != wzVar2.F1) {
                            if (i10 != wzVar2.G1) {
                                if (i10 != wzVar2.I1) {
                                    int i14 = i10 - wzVar2.E1;
                                    if (i14 < arrayList3.size()) {
                                        if (i14 >= arrayList3.size()) {
                                            i14 = arrayList3.size() - 1;
                                        }
                                        wzVar2.I0 = false;
                                        exVar.B0();
                                        wzVar2.H(mzVar.E(arrayList3.get(i14)), 0);
                                        wzVar2.F(0);
                                        wzVar2.q(0);
                                        int i15 = wzVar2.G1;
                                        if (i15 <= 0 && (i15 = wzVar2.F1) <= 0) {
                                            i15 = wzVar2.E1;
                                        }
                                        ixVar.k(i10, i15);
                                        wzVar2.X1 = false;
                                        wzVar2.Y();
                                        break;
                                    }
                                } else {
                                    exVar.B0();
                                    wzVar2.H(mzVar.E("premium"), 0);
                                    wzVar2.F(0);
                                    int i16 = wzVar2.I1;
                                    ixVar.k(i16, i16 > 0 ? i16 : wzVar2.E1);
                                    break;
                                }
                            } else {
                                exVar.B0();
                                wzVar2.H(mzVar.E("fav"), 0);
                                wzVar2.F(0);
                                int i17 = wzVar2.G1;
                                ixVar.k(i17, i17 > 0 ? i17 : wzVar2.E1);
                                break;
                            }
                        } else {
                            exVar.B0();
                            wzVar2.H(mzVar.E("recent"), 0);
                            wzVar2.F(0);
                            int i18 = wzVar2.F1;
                            ixVar.k(i18, i18 > 0 ? i18 : wzVar2.E1);
                            break;
                        }
                    } else {
                        wzVar2.t1.o(new h61(wzVar2.getContext(), new qx(wzVar2), wzVar2.x1, wzVar2.y1, wzVar2.z1, null, wzVar2.Z1));
                        break;
                    }
                }
                break;
        }
    }

    @Override // ni.c
    public void d(int i10) {
        wz wzVar = this.b;
        bh.f fVar = wzVar.j2;
        RectF rectF = wzVar.y2;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        ih.j.c(wzVar.w, wzVar, rectF);
        rectF.inset(LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f), LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        rectF.right = wzVar.getMeasuredWidth();
        rectF.bottom = Math.min(rectF.bottom, wzVar.getMeasuredHeight());
        fVar.g(!rectF.isEmpty() ? 1 : 0, wzVar.z2);
        fVar.e(wzVar.k2, wzVar.getWidth(), wzVar.getHeight());
    }

    @Override // ne.d
    public void p(int i10, float f7, float f10, ne.e eVar) {
        this.b.R();
    }

    @Override // ne.d
    public /* synthetic */ void C(float f7, int i10) {
    }
}
