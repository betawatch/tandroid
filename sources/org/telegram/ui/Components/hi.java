package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class hi extends du0 {
    public int g0;
    public final RectF h0;
    public boolean i0;
    public float j0;
    public final gi k0;
    public final /* synthetic */ ui l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(ui uiVar, Context context) {
        super(context, null);
        this.l0 = uiVar;
        this.h0 = new RectF();
        this.k0 = new gi(this, this);
    }

    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int L;
        int L2;
        float f11;
        float f12;
        float f13;
        int w02;
        float alpha;
        float f14;
        mi miVar;
        canvas.save();
        ui uiVar = this.l0;
        mi miVar2 = uiVar.w2;
        rm rmVar = uiVar.l2;
        if ((miVar2 == rmVar || (miVar = uiVar.x2) == rmVar || (miVar2 == uiVar.e2 && miVar == null)) && miVar2 != null) {
            canvas.save();
            float f15 = uiVar.j4;
            boolean z10 = uiVar.b2;
            ai.l0 l0Var = uiVar.M2;
            uh uhVar = uiVar.g3;
            canvas.translate(0.0f, f15);
            int alpha2 = (int) (miVar2.getAlpha() * 255.0f);
            int j3 = miVar2.j();
            int L3 = org.telegram.messenger.g0.L(13.0f) + ((int) ((uhVar != null ? uhVar.getAlpha() : 0.0f) * org.telegram.messenger.g0.L(26.0f))) + ((int) (l0Var != null ? l0Var.getAlpha() * l0Var.getMeasuredHeight() : 0.0f));
            int d12 = (uiVar.d1(0) - uiVar.t0) - L3;
            if (uiVar.B0 == 1 || uiVar.r3 != null) {
                d12 = (int) (miVar2.getTranslationY() + d12);
            }
            int L4 = org.telegram.messenger.g0.L(20.0f) + d12;
            getMeasuredHeight();
            org.telegram.messenger.g0.L(45.0f);
            int i7 = uiVar.t0;
            if (j3 != 0) {
                i7 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            if (j3 != 2) {
                float f16 = L3;
                f10 = 1.0f;
                if (miVar2 == uiVar.j2) {
                    L = org.telegram.messenger.g0.L(11.0f);
                } else {
                    if (miVar2 == uiVar.h2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else if (miVar2 == uiVar.i2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    f11 = f16 - L2;
                    float alpha3 = uiVar.V2.getAlpha();
                    int i10 = (int) (((i7 - f11) + org.telegram.messenger.g0.m) * alpha3);
                    d12 -= i10;
                    L4 -= i10;
                    f12 = 1.0f - alpha3;
                }
                f11 = f16 + L;
                float alpha32 = uiVar.V2.getAlpha();
                int i102 = (int) (((i7 - f11) + org.telegram.messenger.g0.m) * alpha32);
                d12 -= i102;
                L4 -= i102;
                f12 = 1.0f - alpha32;
            } else if (d12 < i7) {
                f12 = org.telegram.ui.Cells.c0.B(i7 - d12, uiVar.t0, 1.0f, 0.0f);
                f10 = 1.0f;
            } else {
                f12 = 1.0f;
                f10 = 1.0f;
            }
            if (!z10) {
                int i11 = org.telegram.messenger.g0.m;
                d12 += i11;
                L4 += i11;
            }
            int customBackground = uiVar.w2.h() ? uiVar.w2.getCustomBackground() : uiVar.e1(true);
            uiVar.s0.setAlpha(alpha2);
            uiVar.s0.setBounds(0, d12, getMeasuredWidth(), org.telegram.messenger.g0.L(45.0f) + getMeasuredHeight() + uiVar.t0);
            uiVar.s0.draw(canvas);
            RectF rectF = this.h0;
            if (j3 == 2) {
                org.telegram.ui.ActionBar.m6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.m6.t0.setAlpha(alpha2);
                f13 = 24.0f;
                rectF.set(uiVar.u0, uiVar.t0 + d12, getMeasuredWidth() - uiVar.u0, org.telegram.messenger.g0.L(24.0f) + uiVar.t0 + d12);
            } else {
                f13 = 24.0f;
            }
            if ((f12 != f10 && j3 != 2) || uiVar.w2.g()) {
                Paint paint = org.telegram.ui.ActionBar.m6.t0;
                if (uiVar.w2.g()) {
                    customBackground = uiVar.w2.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                org.telegram.ui.ActionBar.m6.t0.setAlpha(alpha2);
                rectF.set(uiVar.u0, uiVar.t0 + d12, getMeasuredWidth() - uiVar.u0, org.telegram.messenger.g0.L(f13) + uiVar.t0 + d12);
            }
            if (uiVar.w2.g()) {
                org.telegram.ui.ActionBar.m6.t0.setColor(uiVar.w2.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.m6.t0.setAlpha(alpha2);
                int d13 = uiVar.d1(0);
                if (!z10) {
                    d13 += org.telegram.messenger.g0.m;
                }
                rectF.set(uiVar.u0, (org.telegram.messenger.g0.L(12.0f) + uiVar.t0 + d12) * f12, getMeasuredWidth() - uiVar.u0, org.telegram.messenger.g0.L(12.0f) + d13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.m6.t0);
                canvas.restore();
            }
            if ((uhVar == null || uhVar.getAlpha() != f10) && f12 != 0.0f) {
                int L5 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, L4, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(4.0f) + L4);
                if (j3 == 2) {
                    w02 = TLObject.FLAG_29;
                    f14 = f12;
                } else if (uiVar.w2.g()) {
                    int customActionBarBackground = uiVar.w2.getCustomActionBarBackground();
                    w02 = i0.a.f(0.5f, customActionBarBackground, i0.a.h(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (uhVar != null) {
                        alpha = uhVar.getAlpha();
                        f14 = f10 - alpha;
                    }
                    f14 = f10;
                } else {
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.zj, uiVar.J0);
                    if (uhVar != null) {
                        alpha = uhVar.getAlpha();
                        f14 = f10 - alpha;
                    }
                    f14 = f10;
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.m6.t0.setColor(w02);
                org.telegram.ui.ActionBar.m6.t0.setAlpha((int) (miVar2.getAlpha() * alpha4 * f14 * f12));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.t0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float f10;
        int L;
        int L2;
        float f11;
        float f12;
        int L3;
        int L4;
        float f13;
        float f14;
        float f15;
        boolean drawChild;
        int w02;
        float alpha;
        mi miVar;
        ui uiVar = this.l0;
        boolean z10 = uiVar.b2;
        ai.l0 l0Var = uiVar.M2;
        fh.g gVar = uiVar.y2;
        uh uhVar = uiVar.g3;
        v7 v7Var = uiVar.V2;
        if (!(view instanceof mi) || view.getAlpha() <= 0.0f) {
            if (view != v7Var) {
                if (!(view instanceof ty) || gVar == null) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                gVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(gVar.R.k);
                gVar.draw(canvas);
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            }
            float alpha2 = v7Var.getAlpha();
            if (alpha2 <= 0.0f) {
                return false;
            }
            if (alpha2 >= 1.0f) {
                return super.drawChild(canvas, view, j3);
            }
            canvas.save();
            float x10 = v7Var.getX();
            mi miVar2 = uiVar.w2;
            if (miVar2 != null) {
                int j10 = miVar2.j();
                int L5 = org.telegram.messenger.g0.L(13.0f) + ((int) ((uhVar != null ? uhVar.getAlpha() : 0.0f) * org.telegram.messenger.g0.L(26.0f))) + ((int) (l0Var != null ? l0Var.getAlpha() * l0Var.getMeasuredHeight() : 0.0f));
                int d12 = (uiVar.d1(0) - uiVar.t0) - L5;
                if (uiVar.B0 == 1 || uiVar.r3 != null) {
                    d12 = (int) (miVar2.getTranslationY() + d12);
                }
                int L6 = org.telegram.messenger.g0.L(20.0f) + d12;
                int currentActionBarHeight = j10 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : uiVar.t0;
                if (j10 != 2 && d12 + uiVar.t0 < currentActionBarHeight) {
                    float f16 = L5;
                    if (miVar2 == uiVar.j2) {
                        L = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        if (miVar2 == uiVar.h2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else if (miVar2 == uiVar.i2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        f11 = f16 - L2;
                        L6 -= (int) (v7Var.getAlpha() * ((currentActionBarHeight - f11) + org.telegram.messenger.g0.m));
                    }
                    f11 = f16 + L;
                    L6 -= (int) (v7Var.getAlpha() * ((currentActionBarHeight - f11) + org.telegram.messenger.g0.m));
                }
                if (!z10) {
                    L6 += org.telegram.messenger.g0.m;
                }
                f10 = L6;
            } else {
                f10 = 0.0f;
            }
            canvas.clipRect(x10, f10, v7Var.getX() + v7Var.getWidth(), v7Var.getY() + v7Var.getHeight());
            boolean drawChild3 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild3;
        }
        canvas.save();
        canvas.translate(0.0f, uiVar.j4);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        mi miVar3 = (mi) view;
        int j11 = miVar3.j();
        int L7 = org.telegram.messenger.g0.L(13.0f) + (uhVar != null ? org.telegram.messenger.g0.L(uhVar.getAlpha() * 26.0f) : 0) + ((int) (l0Var != null ? l0Var.getAlpha() * l0Var.getMeasuredHeight() : 0.0f));
        int d13 = (uiVar.d1(miVar3 == uiVar.w2 ? 0 : 1) - uiVar.t0) - L7;
        if (uiVar.B0 == 1 || uiVar.r3 != null) {
            d13 = (int) (view.getTranslationY() + d13);
        }
        int L8 = org.telegram.messenger.g0.L(20.0f) + d13;
        int L9 = org.telegram.messenger.g0.L(45.0f) + getMeasuredHeight();
        int i7 = uiVar.t0;
        int i10 = L9 + i7;
        if (j11 != 0) {
            i7 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (j11 != 2) {
            f12 = 0.0f;
            if (uiVar.t0 + d13 < i7) {
                float f17 = L7;
                if (miVar3 == uiVar.j2) {
                    L3 = org.telegram.messenger.g0.L(11.0f);
                } else {
                    if (miVar3 == uiVar.h2) {
                        L4 = org.telegram.messenger.g0.L(3.0f);
                    } else if (miVar3 == uiVar.i2) {
                        L4 = org.telegram.messenger.g0.L(3.0f);
                    } else {
                        L3 = org.telegram.messenger.g0.L(4.0f);
                    }
                    f13 = f17 - L4;
                    float min = Math.min(1.0f, ((i7 - d13) - uiVar.t0) / f13);
                    int i11 = (int) ((i7 - f13) * min);
                    d13 -= i11;
                    L8 -= i11;
                    i10 += i11;
                    f14 = 1.0f - min;
                }
                f13 = f17 + L3;
                float min2 = Math.min(1.0f, ((i7 - d13) - uiVar.t0) / f13);
                int i112 = (int) ((i7 - f13) * min2);
                d13 -= i112;
                L8 -= i112;
                i10 += i112;
                f14 = 1.0f - min2;
            }
            f14 = 1.0f;
        } else if (d13 < i7) {
            f14 = org.telegram.ui.Cells.c0.B(i7 - d13, uiVar.t0, 1.0f, 0.0f);
            f12 = 0.0f;
        } else {
            f12 = 0.0f;
            f14 = 1.0f;
        }
        if (!z10) {
            int i12 = org.telegram.messenger.g0.m;
            d13 += i12;
            L8 += i12;
            i10 -= i12;
        }
        int i13 = i10;
        int customBackground = uiVar.w2.h() ? uiVar.w2.getCustomBackground() : uiVar.e1(true);
        mi miVar4 = uiVar.w2;
        rm rmVar = uiVar.l2;
        boolean z11 = (miVar4 == rmVar || (miVar = uiVar.x2) == rmVar || (miVar4 == uiVar.e2 && miVar == null)) ? false : true;
        RectF rectF = this.h0;
        if (z11) {
            uiVar.s0.setAlpha(alpha3);
            f15 = 24.0f;
            uiVar.s0.setBounds(0, d13, getMeasuredWidth(), i13);
            uiVar.s0.draw(canvas);
            if (j11 == 2) {
                org.telegram.ui.ActionBar.m6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.m6.t0.setAlpha(alpha3);
                rectF.set(uiVar.u0, uiVar.t0 + d13, getMeasuredWidth() - uiVar.u0, org.telegram.messenger.g0.L(24.0f) + uiVar.t0 + d13);
            }
        } else {
            f15 = 24.0f;
        }
        miVar3.F(((uiVar.t0 + d13) - view.getTop()) - view.getTranslationY(), f14);
        if (view == uiVar.f2 || view == uiVar.n2 || view == uiVar.g2) {
            drawChild = super.drawChild(canvas, view, j3);
        } else {
            canvas.save();
            drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
        }
        if (z11) {
            if (f14 != 1.0f && j11 != 2) {
                org.telegram.ui.ActionBar.m6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.m6.t0.setAlpha(alpha3);
                rectF.set(uiVar.u0, uiVar.t0 + d13, getMeasuredWidth() - uiVar.u0, org.telegram.messenger.g0.L(f15) + uiVar.t0 + d13);
            }
            if ((uhVar == null || uhVar.getAlpha() != 1.0f) && f14 != f12) {
                int L10 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L10) / 2, L8, (getMeasuredWidth() + L10) / 2, org.telegram.messenger.g0.L(4.0f) + L8);
                if (j11 == 2) {
                    w02 = TLObject.FLAG_29;
                    alpha = f14;
                } else {
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.zj, uiVar.J0);
                    alpha = uhVar == null ? 1.0f : 1.0f - uhVar.getAlpha();
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.m6.t0.setColor(w02);
                org.telegram.ui.ActionBar.m6.t0.setAlpha((int) (view.getAlpha() * alpha4 * alpha * f14));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.t0);
            }
        }
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gi giVar = this.k0;
        giVar.b = this;
        giVar.c();
        ui uiVar = this.l0;
        uiVar.C2.setAdjustPanLayoutHelper(giVar);
        uiVar.N2.setAdjustPanLayoutHelper(giVar);
    }

    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.k0.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.l0.b2;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ui uiVar = this.l0;
        int[] iArr = uiVar.Z3;
        if (uiVar.w2.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y10 = motionEvent.getY();
                ai.l0 l0Var = uiVar.M2;
                int i7 = iArr[0] - (uiVar.t0 * 2);
                int L = org.telegram.messenger.g0.L(13.0f);
                uh uhVar = uiVar.g3;
                int L2 = org.telegram.messenger.g0.L(20.0f) + ((i7 - (L + (uhVar != null ? org.telegram.messenger.g0.L(uhVar.getAlpha() * 26.0f) : 0))) - ((int) (l0Var != null ? l0Var.getAlpha() * l0Var.getMeasuredHeight() : 0.0f)));
                if (!uiVar.b2) {
                    L2 += org.telegram.messenger.g0.m;
                }
                if (y10 < L2 && uiVar.V2.getAlpha() == 0.0f) {
                    uiVar.o0();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015f  */
    @Override // org.telegram.ui.Components.du0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        zl zlVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        xh xhVar;
        zh zhVar;
        tn tnVar;
        tn tnVar2;
        int i19;
        int max;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        hi hiVar = this;
        ui uiVar = hiVar.l0;
        ai.l0 l0Var = uiVar.M2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar.e2;
        int i20 = i11 - i7;
        if (hiVar.g0 != i20) {
            hiVar.g0 = i20;
            df dfVar = uiVar.c2;
            if (dfVar != null && !dfVar.u0) {
                dfVar.dismiss();
            }
        }
        int childCount = hiVar.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            uiVar.i4.set(i7, i10, i11, i12);
            hiVar.setSystemGestureExclusionRects(uiVar.h4);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.l1 a10 = r0.b0.a(hiVar);
        int i21 = 8;
        int i22 = a10 != null ? a10.a.f(8).d : 0;
        int paddingBottom = hiVar.getPaddingBottom();
        if (!uiVar.d) {
            tn tnVar3 = uiVar.h2;
            if (tnVar3 == null || uiVar.w2 != tnVar3 || tnVar3.F == null) {
                tn tnVar4 = uiVar.i2;
                if (tnVar4 == null || uiVar.w2 != tnVar4 || tnVar4.F == null) {
                    if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        emojiPadding = uiVar.b1().getEmojiPadding();
                        if (emojiPadding > 0) {
                            paddingBottom += emojiPadding;
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                } else {
                    if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        emojiPadding = uiVar.i2.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            } else {
                if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    emojiPadding = uiVar.h2.getEmojiPadding();
                    if (emojiPadding > 0) {
                    }
                }
                emojiPadding = 0;
                if (emojiPadding > 0) {
                }
            }
        }
        hiVar.setBottomClip(paddingBottom);
        int i23 = 0;
        while (i23 < childCount) {
            View childAt = hiVar.getChildAt(i23);
            if (childAt.getVisibility() != i21) {
                int i24 = org.telegram.messenger.g0.m;
                int max2 = i22 == 0 ? Math.max(org.telegram.messenger.g0.n, paddingBottom) : 0;
                if (childAt instanceof mi) {
                    mi miVar = (mi) childAt;
                    if (miVar.h) {
                        i24 = 0;
                    }
                    if (miVar.f) {
                        max2 = 0;
                    }
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i25 = layoutParams.gravity;
                if (i25 == -1) {
                    i25 = 51;
                }
                int i26 = i25 & org.telegram.messenger.ks.x1;
                int i27 = i25 & 7;
                if (i27 == 1) {
                    i13 = ((i20 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i27 != 5) {
                    i15 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i26 == 16) {
                        if (i26 == 48) {
                            i18 = layoutParams.topMargin + i24;
                        } else if (i26 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = ((i12 - max2) - i10) - measuredHeight3;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (childAt != uiVar.V2 || childAt == uiVar.t3) {
                            i18 = 0;
                        }
                        xhVar = uiVar.C2;
                        if ((xhVar == null && xhVar.l(childAt)) || (((zhVar = uiVar.N2) != null && zhVar.l(childAt)) || (((tnVar = uiVar.h2) != null && childAt == tnVar.F) || ((tnVar2 = uiVar.i2) != null && childAt == tnVar2.F)))) {
                            if (org.telegram.messenger.g0.Q1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i22;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i18 = measuredHeight - measuredHeight2;
                        } else if (childAt == uiVar.C4) {
                            if (uiVar.X1) {
                                i19 = org.telegram.messenger.g0.m;
                                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                i18 = i19 + max;
                            }
                        } else if (childAt == uiVar.u3) {
                            i19 = i18 + org.telegram.messenger.g0.n;
                            max = Math.max(i22, ui.M0(uiVar));
                            i18 = i19 + max;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, i18 + measuredHeight3);
                    } else {
                        i16 = ((((i12 - max2) - i10) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt != uiVar.V2) {
                    }
                    i18 = 0;
                    xhVar = uiVar.C2;
                    if (xhVar == null) {
                    }
                    if (childAt == uiVar.C4) {
                    }
                } else {
                    i13 = ((i20 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i14 = uiVar.u0;
                }
                i15 = i13 - i14;
                if (i26 == 16) {
                }
                i18 = i16 - i17;
                if (childAt != uiVar.V2) {
                }
                i18 = 0;
                xhVar = uiVar.C2;
                if (xhVar == null) {
                }
                if (childAt == uiVar.C4) {
                }
            }
            i23++;
            hiVar = this;
            i21 = 8;
        }
        R();
        uiVar.N1(uiVar.w2, 0);
        uiVar.N1(uiVar.x2, 0);
        if (uiVar.X1) {
            uiVar.K1();
        }
        if (chatAttachAlertPhotoLayout == null || (zlVar = chatAttachAlertPhotoLayout.F) == null || zlVar.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.F.getFastScroll().i0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.q1 + (uiVar.X1 ? (int) (l0Var.getAlpha() * l0Var.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.F.getFastScroll().invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        tn tnVar;
        tn tnVar2;
        int M0;
        hi hiVar = this;
        ui uiVar = hiVar.l0;
        boolean z10 = uiVar.b2;
        org.telegram.ui.ActionBar.q0 q0Var = uiVar.Y2;
        int size = hiVar.getLayoutParams().height > 0 ? hiVar.getLayoutParams().height : View.MeasureSpec.getSize(i10);
        if (!z10) {
            hiVar.i0 = true;
            int i12 = uiVar.u0;
            hiVar.setPadding(i12, 0, i12, 0);
            hiVar.i0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i7) - (uiVar.u0 * 2);
        if (org.telegram.messenger.g0.Q1()) {
            q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(3.0f));
        } else {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                q0Var.setAdditionalYOffset(0);
            } else {
                q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) uiVar.d3.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        hiVar.i0 = true;
        int min = (int) (size2 / Math.min(4.5f, uiVar.y3.b()));
        if (uiVar.W3 != min) {
            uiVar.W3 = min;
            org.telegram.messenger.g0.g3(new og(hiVar, 24));
        }
        hiVar.i0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i7);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        hiVar.setMeasuredDimension(size3, size4);
        int i13 = uiVar.u0;
        zh zhVar = uiVar.N2;
        xh xhVar = uiVar.C2;
        int i14 = size3 - (i13 * 2);
        if (!xhVar.O && org.telegram.messenger.g0.L(20.0f) >= 0 && !xhVar.e && !xhVar.P) {
            hiVar.i0 = true;
            xhVar.j();
            hiVar.i0 = false;
        }
        if (!zhVar.O && org.telegram.messenger.g0.L(20.0f) >= 0 && !zhVar.e && !zhVar.P) {
            hiVar.i0 = true;
            zhVar.j();
            hiVar.i0 = false;
        }
        if (uiVar.h2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            tn tnVar3 = uiVar.h2;
            if (!tnVar3.H && !tnVar3.b1 && !tnVar3.g1 && !tnVar3.i1) {
                hiVar.i0 = true;
                tnVar3.f0();
                hiVar.i0 = false;
            }
        }
        if (uiVar.i2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            tn tnVar4 = uiVar.i2;
            if (!tnVar4.H && !tnVar4.b1 && !tnVar4.g1 && !tnVar4.i1) {
                hiVar.i0 = true;
                tnVar4.f0();
                hiVar.i0 = false;
            }
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            if (uiVar.d) {
                mi miVar = uiVar.w2;
                tn tnVar5 = uiVar.h2;
                if (miVar == tnVar5 && tnVar5.F != null && tnVar5.i1) {
                    M0 = org.telegram.messenger.g0.L(120.0f);
                } else {
                    tn tnVar6 = uiVar.i2;
                    M0 = (miVar == tnVar6 && tnVar6.F != null && tnVar6.i1) ? org.telegram.messenger.g0.L(120.0f) : 0;
                }
            } else {
                M0 = ui.M0(uiVar);
            }
            WeakHashMap weakHashMap = r0.i0.a;
            r0.l1 a10 = r0.b0.a(hiVar);
            int i15 = a10 != null ? a10.a.f(8).d : 0;
            r0.l1 a11 = r0.b0.a(hiVar);
            Math.max(a11 != null ? a11.a.f(527).d : 0, M0);
            int max = Math.max(i15 > 0 ? 0 : org.telegram.messenger.g0.n, M0);
            hiVar.i0 = true;
            mi miVar2 = uiVar.w2;
            if (miVar2.f) {
                miVar2.e = org.telegram.messenger.g0.L(62.0f) + max;
                uiVar.w2.B(i14, size4);
            } else {
                miVar2.e = org.telegram.messenger.g0.n;
                miVar2.B(i14, size4 - M0);
            }
            mi miVar3 = uiVar.x2;
            if (miVar3 != null) {
                if (miVar3.f) {
                    miVar3.e = org.telegram.messenger.g0.L(62.0f) + max;
                    uiVar.x2.B(i14, size4);
                } else {
                    miVar3.e = org.telegram.messenger.g0.n;
                    miVar3.B(i14, size4 - M0);
                }
            }
            hiVar.i0 = false;
        }
        int childCount = hiVar.getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            int i17 = i16;
            View childAt = hiVar.getChildAt(i17);
            if (childAt == null || childAt.getVisibility() == 8) {
                i11 = i17;
            } else if (childAt == uiVar.t3) {
                i11 = i17;
                hiVar.measureChildWithMargins(childAt, i7, 0, makeMeasureSpec, 0);
            } else {
                i11 = i17;
                int i18 = org.telegram.messenger.g0.m;
                int i19 = org.telegram.messenger.g0.n;
                if (childAt instanceof mi) {
                    mi miVar4 = (mi) childAt;
                    if (miVar4.h) {
                        i18 = 0;
                    }
                    if (miVar4.f) {
                        i19 = 0;
                    }
                }
                if (!xhVar.l(childAt) && !zhVar.l(childAt) && (((tnVar = uiVar.h2) == null || childAt != tnVar.F) && ((tnVar2 = uiVar.i2) == null || childAt != tnVar2.F))) {
                    measureChildWithMargins(childAt, i7, 0, makeMeasureSpec, i18 + i19);
                } else if (z10) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size4, TLObject.FLAG_30));
                } else if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 200.0f : 320.0f), getPaddingTop() + (size4 - org.telegram.messenger.g0.m)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - org.telegram.messenger.g0.m), TLObject.FLAG_30));
                }
            }
            i16 = i11 + 1;
            hiVar = this;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        int i13;
        WindowInsets rootWindowInsets;
        super.onSizeChanged(i7, i10, i11, i12);
        int i14 = 0;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
            i13 = 0;
        } else {
            RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
            RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
            i13 = roundedCorner == null ? 0 : roundedCorner.getRadius();
            if (roundedCorner2 != null) {
                i14 = roundedCorner2.getRadius();
            }
        }
        fh.g gVar = this.l0.y2;
        if (gVar != null) {
            gVar.t(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), i14, i13, true);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ui uiVar = this.l0;
        if (uiVar.w2.o(motionEvent)) {
            return true;
        }
        return !uiVar.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.i0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        ui uiVar = this.l0;
        uh uhVar = uiVar.v3;
        float f11 = f10 + uiVar.j4;
        int i7 = uiVar.B0;
        if (i7 == 0) {
            this.j0 = f11;
        }
        if (i7 == 1) {
            if (f11 < 0.0f) {
                uiVar.w2.setTranslationY(f11);
                if (uiVar.O2 != 0 || uiVar.R2) {
                    uiVar.g3.setTranslationY((uiVar.n3 + f11) - uiVar.j4);
                }
                uhVar.setTranslationY(0.0f);
                f11 = 0.0f;
            } else {
                uiVar.w2.setTranslationY(0.0f);
                uhVar.setTranslationY(((f11 / this.j0) * uhVar.getMeasuredHeight()) + (-f11));
            }
            uiVar.b.invalidate();
        }
        super.setTranslationY((f11 - uiVar.j4) + uiVar.t2);
        if (uiVar.B0 != 1) {
            uiVar.w2.m(uiVar.j4);
        }
    }

    @Override // org.telegram.ui.Components.du0
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
