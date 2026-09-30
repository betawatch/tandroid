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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hw implements li.c, ol0, um0, le.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ mz b;

    public /* synthetic */ hw(mz mzVar, int i10) {
        this.a = i10;
        this.b = mzVar;
    }

    @Override // le.e
    public void D(int i10, float f7, float f10, le.f fVar) {
        this.b.R();
    }

    @Override // org.telegram.ui.Components.um0
    public void a(int i10) {
        int i11;
        yy yyVar;
        switch (this.a) {
            case 2:
                mz mzVar = this.b;
                sy syVar = mzVar.i0;
                int i12 = mzVar.c1;
                ry ryVar = mzVar.n0;
                uy uyVar = mzVar.k0;
                if (i10 != mzVar.s0 || !ryVar.x.isEmpty()) {
                    mzVar.h0.B0();
                    mzVar.p0.k(i10, 0);
                    if (i10 == mzVar.r0 || i10 == mzVar.s0) {
                        mzVar.o0.d.setText("");
                        if (i10 != mzVar.s0 || (i11 = ryVar.I) < 1) {
                            ny nyVar = mzVar.t1;
                            syVar.h1((nyVar == null || !nyVar.A()) ? 1 : 0, 0);
                        } else {
                            syVar.h1(i11, -AndroidUtilities.dp(4.0f));
                        }
                        if (i10 == mzVar.s0) {
                            ArrayList<String> arrayList = MessagesController.getInstance(i12).gifSearchEmojies;
                            if (!arrayList.isEmpty()) {
                                uyVar.a(arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList<String> arrayList2 = MessagesController.getInstance(i12).gifSearchEmojies;
                        mzVar.j0.H(arrayList2.get(i10 - mzVar.t0));
                        int i13 = i10 - mzVar.t0;
                        if (i13 > 0) {
                            uyVar.a(arrayList2.get(i13 - 1), true);
                        }
                        if (i10 - mzVar.t0 < arrayList2.size() - 1) {
                            uyVar.a(arrayList2.get((i10 - mzVar.t0) + 1), true);
                        }
                    }
                    mzVar.F(2);
                    break;
                }
                break;
            default:
                mz mzVar2 = this.b;
                yw ywVar = mzVar2.G0;
                ArrayList arrayList3 = mzVar2.d1;
                zw zwVar = mzVar2.B0;
                dz dzVar = mzVar2.y0;
                vw vwVar = mzVar2.D0;
                if (!mzVar2.S0) {
                    if (i10 != mzVar2.H1) {
                        if (ywVar != null && (yyVar = ywVar.r) != null && yyVar.getSelectedCategory() != null) {
                            ywVar.c(null, false);
                            yyVar.F1(null);
                        }
                        if (i10 != mzVar2.F1) {
                            if (i10 != mzVar2.G1) {
                                if (i10 != mzVar2.I1) {
                                    int i14 = i10 - mzVar2.E1;
                                    if (i14 < arrayList3.size()) {
                                        if (i14 >= arrayList3.size()) {
                                            i14 = arrayList3.size() - 1;
                                        }
                                        mzVar2.I0 = false;
                                        vwVar.B0();
                                        mzVar2.H(dzVar.E(arrayList3.get(i14)), 0);
                                        mzVar2.F(0);
                                        mzVar2.p(0);
                                        int i15 = mzVar2.G1;
                                        if (i15 <= 0 && (i15 = mzVar2.F1) <= 0) {
                                            i15 = mzVar2.E1;
                                        }
                                        zwVar.k(i10, i15);
                                        mzVar2.X1 = false;
                                        mzVar2.Y();
                                        break;
                                    }
                                } else {
                                    vwVar.B0();
                                    mzVar2.H(dzVar.E("premium"), 0);
                                    mzVar2.F(0);
                                    int i16 = mzVar2.I1;
                                    zwVar.k(i16, i16 > 0 ? i16 : mzVar2.E1);
                                    break;
                                }
                            } else {
                                vwVar.B0();
                                mzVar2.H(dzVar.E("fav"), 0);
                                mzVar2.F(0);
                                int i17 = mzVar2.G1;
                                zwVar.k(i17, i17 > 0 ? i17 : mzVar2.E1);
                                break;
                            }
                        } else {
                            vwVar.B0();
                            mzVar2.H(dzVar.E("recent"), 0);
                            mzVar2.F(0);
                            int i18 = mzVar2.F1;
                            zwVar.k(i18, i18 > 0 ? i18 : mzVar2.E1);
                            break;
                        }
                    } else {
                        mzVar2.t1.o(new t51(mzVar2.getContext(), new hx(mzVar2), mzVar2.x1, mzVar2.y1, mzVar2.z1, null, mzVar2.Z1));
                        break;
                    }
                }
                break;
        }
    }

    @Override // li.c
    public void b(int i10) {
        mz mzVar = this.b;
        ah.h hVar = mzVar.j2;
        RectF rectF = mzVar.y2;
        if (Build.VERSION.SDK_INT < 31 || hVar == null) {
            return;
        }
        hh.k.c(mzVar.w, mzVar, rectF);
        rectF.inset(LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f), LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        rectF.right = mzVar.getMeasuredWidth();
        rectF.bottom = Math.min(rectF.bottom, mzVar.getMeasuredHeight());
        hVar.g(!rectF.isEmpty() ? 1 : 0, mzVar.z2);
        hVar.e(mzVar.k2, mzVar.getWidth(), mzVar.getHeight());
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        String str;
        int i11;
        mz mzVar = this.b;
        int i12 = mzVar.C1;
        yx yxVar = mzVar.P;
        int[] iArr = mzVar.D1;
        zu zuVar = mzVar.B1;
        if (!(view instanceof vy)) {
            return false;
        }
        vy vyVar = (vy) view;
        if (vyVar.c) {
            View F = yxVar.F(view);
            s4.c1 T = F != null ? yxVar.T(F) : null;
            if (T != null && T.b() <= mzVar.getRecentEmoji().size()) {
                mzVar.t1.n();
            }
            yxVar.x1(view);
            return true;
        }
        if (vyVar.getSpan() != null || (str = (String) vyVar.getTag()) == null) {
            return false;
        }
        String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
        String str2 = vyVar.c ? null : Emoji.emojiColor.get(replace);
        boolean isCompound = CompoundEmoji.isCompound(replace);
        if (!isCompound && !EmojiData.emojiColoredMap.contains(replace)) {
            return false;
        }
        mzVar.R1 = vyVar;
        mzVar.U1 = mzVar.S1;
        mzVar.V1 = mzVar.T1;
        if (isCompound) {
            replace = mz.g(replace, str2);
        } else {
            int indexOf = CompoundEmoji.skinTones.indexOf(str2) + 1;
            yu yuVar = zuVar.c;
            int[] iArr2 = yuVar.n;
            if (iArr2[0] != indexOf) {
                iArr2[0] = indexOf;
                yuVar.invalidate();
            }
        }
        zuVar.getClass();
        yu yuVar2 = zuVar.c;
        int i13 = zuVar.e;
        boolean z10 = CompoundEmoji.getCompoundEmojiDrawable(replace) != null;
        zuVar.d = z10;
        Drawable[] drawableArr = yuVar2.b;
        int[] iArr3 = yuVar2.n;
        yuVar2.f = z10;
        yuVar2.e = replace;
        if (z10) {
            drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
            drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(yuVar2.e, 0, -2);
            drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(yuVar2.e, 1, -2);
            drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(yuVar2.e, 2, -2);
            drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(yuVar2.e, 3, -2);
            drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(yuVar2.e, 4, -2);
            drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(yuVar2.e, -2, 0);
            drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(yuVar2.e, -2, 1);
            drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(yuVar2.e, -2, 2);
            drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(yuVar2.e, -2, 3);
            drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(yuVar2.e, -2, 4);
            Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
            if (isHandshake != null) {
                int intValue = ((Integer) isHandshake.first).intValue();
                if (iArr3[0] != intValue) {
                    iArr3[0] = intValue;
                    yuVar2.invalidate();
                }
                int intValue2 = ((Integer) isHandshake.second).intValue();
                if (iArr3[1] != intValue2) {
                    iArr3[1] = intValue2;
                    yuVar2.invalidate();
                }
                yuVar2.G = iArr3[0] == iArr3[1];
            }
            yuVar2.I = true;
        } else {
            int i14 = 0;
            while (i14 < 6) {
                drawableArr[i14] = Emoji.getEmojiBigDrawable(i14 != 0 ? mz.g(replace, CompoundEmoji.skinTones.get(i14 - 1)) : replace);
                i14++;
            }
        }
        yuVar2.invalidate();
        zuVar.setWidth(AndroidUtilities.dp((zuVar.d ? 3 : 0) + 30) + (i13 * 6));
        zuVar.setHeight(((zuVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(zuVar.d ? 11.66f : 15.0f));
        int dp = AndroidUtilities.dp((zuVar.d ? 3 : 0) + 30) + (i13 * 6);
        int dp2 = ((zuVar.d ? 2 : 1) * i13) + AndroidUtilities.dp(zuVar.d ? 11.66f : 15.0f);
        vyVar.getLocationOnScreen(iArr);
        if (zuVar.d) {
            i11 = 0;
        } else {
            i11 = AndroidUtilities.dp((r3 * 4) - (AndroidUtilities.isTablet() ? 5 : 1)) + (yuVar2.n[0] * i12);
        }
        if (iArr[0] - i11 < AndroidUtilities.dp(5.0f)) {
            i11 = org.telegram.messenger.ok.D(5.0f, iArr[0] - i11, i11);
        } else if ((iArr[0] - i11) + dp > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
            i11 += ((iArr[0] - i11) + dp) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
        }
        int i15 = -i11;
        int top = vyVar.getTop() < 0 ? vyVar.getTop() : 0;
        yuVar2.setArrowX((AndroidUtilities.dp(AndroidUtilities.isTablet() ? 30.0f : 22.0f) - i15) + ((int) AndroidUtilities.dpf2(0.5f)));
        zuVar.setFocusable(true);
        zuVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i12) / 2) + ((-view.getMeasuredHeight()) - dp2)) - top);
        mzVar.h.requestDisallowInterceptTouchEvent(true);
        yxVar.d1(true);
        yxVar.x1(view);
        return true;
    }

    @Override // le.e
    public /* synthetic */ void C(float f7, int i10) {
    }
}
