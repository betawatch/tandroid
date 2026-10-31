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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ph extends uu0 {
    public int f0;
    public final RectF g0;
    public boolean h0;
    public float i0;
    public final nh j0;
    public final /* synthetic */ bi k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(bi biVar, Context context) {
        super(context, null);
        this.k0 = biVar;
        this.g0 = new RectF();
        this.j0 = new nh(this, this);
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int L;
        int L2;
        float f10;
        float f11;
        float f12;
        int w02;
        float alpha;
        float f13;
        uh uhVar;
        canvas.save();
        bi biVar = this.k0;
        uh uhVar2 = biVar.s2;
        jm jmVar = biVar.h2;
        if ((uhVar2 == jmVar || (uhVar = biVar.t2) == jmVar || (uhVar2 == biVar.a2 && uhVar == null)) && uhVar2 != null) {
            canvas.save();
            float f14 = biVar.f4;
            boolean z10 = biVar.X1;
            fg.i iVar = biVar.I2;
            ah ahVar = biVar.c3;
            canvas.translate(0.0f, f14);
            int alpha2 = (int) (uhVar2.getAlpha() * 255.0f);
            int i10 = uhVar2.i();
            int L3 = org.telegram.messenger.i0.L(13.0f) + ((int) ((ahVar != null ? ahVar.getAlpha() : 0.0f) * org.telegram.messenger.i0.L(26.0f))) + ((int) (iVar != null ? iVar.getAlpha() * iVar.getMeasuredHeight() : 0.0f));
            int b12 = (biVar.b1(0) - biVar.s0) - L3;
            if (biVar.A0 == 1 || biVar.n3 != null) {
                b12 = (int) (uhVar2.getTranslationY() + b12);
            }
            int L4 = org.telegram.messenger.i0.L(20.0f) + b12;
            getMeasuredHeight();
            org.telegram.messenger.i0.L(45.0f);
            int i11 = biVar.s0;
            if (i10 != 0) {
                i11 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            }
            if (i10 != 2) {
                float f15 = L3;
                f7 = 1.0f;
                if (uhVar2 == biVar.f2) {
                    L = org.telegram.messenger.i0.L(11.0f);
                } else {
                    if (uhVar2 == biVar.d2) {
                        L2 = org.telegram.messenger.i0.L(3.0f);
                    } else if (uhVar2 == biVar.e2) {
                        L2 = org.telegram.messenger.i0.L(3.0f);
                    } else {
                        L = org.telegram.messenger.i0.L(4.0f);
                    }
                    f10 = f15 - L2;
                    float alpha3 = biVar.R2.getAlpha();
                    int i12 = (int) (((i11 - f10) + org.telegram.messenger.i0.m) * alpha3);
                    b12 -= i12;
                    L4 -= i12;
                    f11 = 1.0f - alpha3;
                }
                f10 = f15 + L;
                float alpha32 = biVar.R2.getAlpha();
                int i122 = (int) (((i11 - f10) + org.telegram.messenger.i0.m) * alpha32);
                b12 -= i122;
                L4 -= i122;
                f11 = 1.0f - alpha32;
            } else if (b12 < i11) {
                f11 = org.telegram.ui.Cells.f1.v(i11 - b12, biVar.s0, 1.0f, 0.0f);
                f7 = 1.0f;
            } else {
                f11 = 1.0f;
                f7 = 1.0f;
            }
            if (!z10) {
                int i13 = org.telegram.messenger.i0.m;
                b12 += i13;
                L4 += i13;
            }
            int customBackground = biVar.s2.g() ? biVar.s2.getCustomBackground() : biVar.c1(true);
            biVar.r0.setAlpha(alpha2);
            biVar.r0.setBounds(0, b12, getMeasuredWidth(), org.telegram.messenger.i0.L(45.0f) + getMeasuredHeight() + biVar.s0);
            biVar.r0.draw(canvas);
            RectF rectF = this.g0;
            if (i10 == 2) {
                org.telegram.ui.ActionBar.t6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.t6.t0.setAlpha(alpha2);
                f12 = 24.0f;
                rectF.set(biVar.t0, biVar.s0 + b12, getMeasuredWidth() - biVar.t0, org.telegram.messenger.i0.L(24.0f) + biVar.s0 + b12);
            } else {
                f12 = 24.0f;
            }
            if ((f11 != f7 && i10 != 2) || biVar.s2.f()) {
                Paint paint = org.telegram.ui.ActionBar.t6.t0;
                if (biVar.s2.f()) {
                    customBackground = biVar.s2.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                org.telegram.ui.ActionBar.t6.t0.setAlpha(alpha2);
                rectF.set(biVar.t0, biVar.s0 + b12, getMeasuredWidth() - biVar.t0, org.telegram.messenger.i0.L(f12) + biVar.s0 + b12);
            }
            if (biVar.s2.f()) {
                org.telegram.ui.ActionBar.t6.t0.setColor(biVar.s2.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.t6.t0.setAlpha(alpha2);
                int b13 = biVar.b1(0);
                if (!z10) {
                    b13 += org.telegram.messenger.i0.m;
                }
                rectF.set(biVar.t0, (org.telegram.messenger.i0.L(12.0f) + biVar.s0 + b12) * f11, getMeasuredWidth() - biVar.t0, org.telegram.messenger.i0.L(12.0f) + b13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.t6.t0);
                canvas.restore();
            }
            if ((ahVar == null || ahVar.getAlpha() != f7) && f11 != 0.0f) {
                int L5 = org.telegram.messenger.i0.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, L4, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.i0.L(4.0f) + L4);
                if (i10 == 2) {
                    w02 = TLObject.FLAG_29;
                    f13 = f11;
                } else if (biVar.s2.f()) {
                    int customActionBarBackground = biVar.s2.getCustomActionBarBackground();
                    w02 = i0.b.f(0.5f, customActionBarBackground, i0.b.h(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (ahVar != null) {
                        alpha = ahVar.getAlpha();
                        f13 = f7 - alpha;
                    }
                    f13 = f7;
                } else {
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wj, biVar.I0);
                    if (ahVar != null) {
                        alpha = ahVar.getAlpha();
                        f13 = f7 - alpha;
                    }
                    f13 = f7;
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.t6.t0.setColor(w02);
                org.telegram.ui.ActionBar.t6.t0.setAlpha((int) (uhVar2.getAlpha() * alpha4 * f13 * f11));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.t0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f7;
        int L;
        int L2;
        float f10;
        float f11;
        int L3;
        int L4;
        float f12;
        float f13;
        boolean drawChild;
        int w02;
        float alpha;
        uh uhVar;
        bi biVar = this.k0;
        boolean z10 = biVar.X1;
        fg.i iVar = biVar.I2;
        vg.f fVar = biVar.u2;
        ah ahVar = biVar.c3;
        kg.g1 g1Var = biVar.R2;
        if (!(view instanceof uh) || view.getAlpha() <= 0.0f) {
            if (view != g1Var) {
                if (!(view instanceof vy) || fVar == null) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                fVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(fVar.M.k);
                fVar.draw(canvas);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
            float alpha2 = g1Var.getAlpha();
            if (alpha2 <= 0.0f) {
                return false;
            }
            if (alpha2 >= 1.0f) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            float x10 = g1Var.getX();
            uh uhVar2 = biVar.s2;
            if (uhVar2 != null) {
                int i10 = uhVar2.i();
                int L5 = org.telegram.messenger.i0.L(13.0f) + ((int) ((ahVar != null ? ahVar.getAlpha() : 0.0f) * org.telegram.messenger.i0.L(26.0f))) + ((int) (iVar != null ? iVar.getAlpha() * iVar.getMeasuredHeight() : 0.0f));
                int b12 = (biVar.b1(0) - biVar.s0) - L5;
                if (biVar.A0 == 1 || biVar.n3 != null) {
                    b12 = (int) (uhVar2.getTranslationY() + b12);
                }
                int L6 = org.telegram.messenger.i0.L(20.0f) + b12;
                int currentActionBarHeight = i10 != 0 ? org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() : biVar.s0;
                if (i10 != 2 && b12 + biVar.s0 < currentActionBarHeight) {
                    float f14 = L5;
                    if (uhVar2 == biVar.f2) {
                        L = org.telegram.messenger.i0.L(11.0f);
                    } else {
                        if (uhVar2 == biVar.d2) {
                            L2 = org.telegram.messenger.i0.L(3.0f);
                        } else if (uhVar2 == biVar.e2) {
                            L2 = org.telegram.messenger.i0.L(3.0f);
                        } else {
                            L = org.telegram.messenger.i0.L(4.0f);
                        }
                        f10 = f14 - L2;
                        L6 -= (int) (g1Var.getAlpha() * ((currentActionBarHeight - f10) + org.telegram.messenger.i0.m));
                    }
                    f10 = f14 + L;
                    L6 -= (int) (g1Var.getAlpha() * ((currentActionBarHeight - f10) + org.telegram.messenger.i0.m));
                }
                if (!z10) {
                    L6 += org.telegram.messenger.i0.m;
                }
                f7 = L6;
            } else {
                f7 = 0.0f;
            }
            canvas.clipRect(x10, f7, g1Var.getX() + g1Var.getWidth(), g1Var.getY() + g1Var.getHeight());
            boolean drawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild3;
        }
        canvas.save();
        canvas.translate(0.0f, biVar.f4);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        uh uhVar3 = (uh) view;
        int i11 = uhVar3.i();
        int L7 = org.telegram.messenger.i0.L(13.0f) + (ahVar != null ? org.telegram.messenger.i0.L(ahVar.getAlpha() * 26.0f) : 0) + ((int) (iVar != null ? iVar.getAlpha() * iVar.getMeasuredHeight() : 0.0f));
        int b13 = (biVar.b1(uhVar3 == biVar.s2 ? 0 : 1) - biVar.s0) - L7;
        if (biVar.A0 == 1 || biVar.n3 != null) {
            b13 = (int) (view.getTranslationY() + b13);
        }
        int L8 = org.telegram.messenger.i0.L(20.0f) + b13;
        int L9 = org.telegram.messenger.i0.L(45.0f) + getMeasuredHeight();
        int i12 = biVar.s0;
        int i13 = L9 + i12;
        if (i11 != 0) {
            i12 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        if (i11 != 2) {
            f11 = 0.0f;
            if (biVar.s0 + b13 < i12) {
                float f15 = L7;
                if (uhVar3 == biVar.f2) {
                    L3 = org.telegram.messenger.i0.L(11.0f);
                } else {
                    if (uhVar3 == biVar.d2) {
                        L4 = org.telegram.messenger.i0.L(3.0f);
                    } else if (uhVar3 == biVar.e2) {
                        L4 = org.telegram.messenger.i0.L(3.0f);
                    } else {
                        L3 = org.telegram.messenger.i0.L(4.0f);
                    }
                    f12 = f15 - L4;
                    float min = Math.min(1.0f, ((i12 - b13) - biVar.s0) / f12);
                    int i14 = (int) ((i12 - f12) * min);
                    b13 -= i14;
                    L8 -= i14;
                    i13 += i14;
                    f13 = 1.0f - min;
                }
                f12 = f15 + L3;
                float min2 = Math.min(1.0f, ((i12 - b13) - biVar.s0) / f12);
                int i142 = (int) ((i12 - f12) * min2);
                b13 -= i142;
                L8 -= i142;
                i13 += i142;
                f13 = 1.0f - min2;
            }
            f13 = 1.0f;
        } else if (b13 < i12) {
            f13 = org.telegram.ui.Cells.f1.v(i12 - b13, biVar.s0, 1.0f, 0.0f);
            f11 = 0.0f;
        } else {
            f11 = 0.0f;
            f13 = 1.0f;
        }
        if (!z10) {
            int i15 = org.telegram.messenger.i0.m;
            b13 += i15;
            L8 += i15;
            i13 -= i15;
        }
        int i16 = i13;
        int customBackground = biVar.s2.g() ? biVar.s2.getCustomBackground() : biVar.c1(true);
        uh uhVar4 = biVar.s2;
        jm jmVar = biVar.h2;
        boolean z11 = (uhVar4 == jmVar || (uhVar = biVar.t2) == jmVar || (uhVar4 == biVar.a2 && uhVar == null)) ? false : true;
        RectF rectF = this.g0;
        if (z11) {
            biVar.r0.setAlpha(alpha3);
            biVar.r0.setBounds(0, b13, getMeasuredWidth(), i16);
            biVar.r0.draw(canvas);
            if (i11 == 2) {
                org.telegram.ui.ActionBar.t6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.t6.t0.setAlpha(alpha3);
                rectF.set(biVar.t0, biVar.s0 + b13, getMeasuredWidth() - biVar.t0, org.telegram.messenger.i0.L(24.0f) + biVar.s0 + b13);
            }
        }
        if (view == biVar.b2 || view == biVar.j2 || view == biVar.c2) {
            drawChild = super.drawChild(canvas, view, j10);
        } else {
            canvas.save();
            drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
        }
        if (z11) {
            if (f13 != 1.0f && i11 != 2) {
                org.telegram.ui.ActionBar.t6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.t6.t0.setAlpha(alpha3);
                rectF.set(biVar.t0, biVar.s0 + b13, getMeasuredWidth() - biVar.t0, org.telegram.messenger.i0.L(24.0f) + biVar.s0 + b13);
            }
            if ((ahVar == null || ahVar.getAlpha() != 1.0f) && f13 != f11) {
                int L10 = org.telegram.messenger.i0.L(36.0f);
                rectF.set((getMeasuredWidth() - L10) / 2, L8, (getMeasuredWidth() + L10) / 2, org.telegram.messenger.i0.L(4.0f) + L8);
                if (i11 == 2) {
                    w02 = TLObject.FLAG_29;
                    alpha = f13;
                } else {
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wj, biVar.I0);
                    alpha = ahVar == null ? 1.0f : 1.0f - ahVar.getAlpha();
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.t6.t0.setColor(w02);
                org.telegram.ui.ActionBar.t6.t0.setAlpha((int) (view.getAlpha() * alpha4 * alpha * f13));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.t0);
            }
        }
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nh nhVar = this.j0;
        nhVar.b = this;
        nhVar.c();
        bi biVar = this.k0;
        biVar.y2.setAdjustPanLayoutHelper(nhVar);
        biVar.J2.setAdjustPanLayoutHelper(nhVar);
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j0.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.k0.X1;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        bi biVar = this.k0;
        int[] iArr = biVar.V3;
        if (biVar.s2.n(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y3 = motionEvent.getY();
                fg.i iVar = biVar.I2;
                int i10 = iArr[0] - (biVar.s0 * 2);
                int L = org.telegram.messenger.i0.L(13.0f);
                ah ahVar = biVar.c3;
                int L2 = org.telegram.messenger.i0.L(20.0f) + ((i10 - (L + (ahVar != null ? org.telegram.messenger.i0.L(ahVar.getAlpha() * 26.0f) : 0))) - ((int) (iVar != null ? iVar.getAlpha() * iVar.getMeasuredHeight() : 0.0f)));
                if (!biVar.X1) {
                    L2 += org.telegram.messenger.i0.m;
                }
                if (y3 < L2 && biVar.R2.getAlpha() == 0.0f) {
                    biVar.o0();
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
    @Override // org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        pl plVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        dh dhVar;
        fh fhVar;
        jn jnVar;
        jn jnVar2;
        int i20;
        int max;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        ph phVar = this;
        bi biVar = phVar.k0;
        fg.i iVar = biVar.I2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.a2;
        int i21 = i12 - i10;
        if (phVar.f0 != i21) {
            phVar.f0 = i21;
            pe peVar = biVar.Y1;
            if (peVar != null && !peVar.p0) {
                peVar.dismiss();
            }
        }
        int childCount = phVar.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            biVar.e4.set(i10, i11, i12, i13);
            phVar.setSystemGestureExclusionRects(biVar.d4);
        }
        WeakHashMap weakHashMap = r0.h0.a;
        r0.j1 a2 = r0.a0.a(phVar);
        int i22 = 8;
        int i23 = a2 != null ? a2.a.f(8).d : 0;
        int paddingBottom = phVar.getPaddingBottom();
        if (!biVar.d) {
            jn jnVar3 = biVar.d2;
            if (jnVar3 == null || biVar.s2 != jnVar3 || jnVar3.E == null) {
                jn jnVar4 = biVar.e2;
                if (jnVar4 == null || biVar.s2 != jnVar4 || jnVar4.E == null) {
                    if (i23 <= org.telegram.messenger.i0.L(20.0f) && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                        emojiPadding = biVar.Z0().getEmojiPadding();
                        if (emojiPadding > 0) {
                            paddingBottom += emojiPadding;
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                } else {
                    if (i23 <= org.telegram.messenger.i0.L(20.0f) && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                        emojiPadding = biVar.e2.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            } else {
                if (i23 <= org.telegram.messenger.i0.L(20.0f) && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                    emojiPadding = biVar.d2.getEmojiPadding();
                    if (emojiPadding > 0) {
                    }
                }
                emojiPadding = 0;
                if (emojiPadding > 0) {
                }
            }
        }
        phVar.setBottomClip(paddingBottom);
        int i24 = 0;
        while (i24 < childCount) {
            View childAt = phVar.getChildAt(i24);
            if (childAt.getVisibility() != i22) {
                int i25 = org.telegram.messenger.i0.m;
                int max2 = i23 == 0 ? Math.max(org.telegram.messenger.i0.n, paddingBottom) : 0;
                if (childAt instanceof uh) {
                    uh uhVar = (uh) childAt;
                    if (uhVar.h) {
                        i25 = 0;
                    }
                    if (uhVar.f) {
                        max2 = 0;
                    }
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i26 = layoutParams.gravity;
                if (i26 == -1) {
                    i26 = 51;
                }
                int i27 = i26 & org.telegram.messenger.zs.x1;
                int i28 = i26 & 7;
                if (i28 == 1) {
                    i14 = ((i21 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i28 != 5) {
                    i16 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i27 == 16) {
                        if (i27 == 48) {
                            i19 = layoutParams.topMargin + i25;
                        } else if (i27 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = ((i13 - max2) - i11) - measuredHeight3;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt != biVar.R2 || childAt == biVar.p3) {
                            i19 = 0;
                        }
                        dhVar = biVar.y2;
                        if ((dhVar == null && dhVar.l(childAt)) || (((fhVar = biVar.J2) != null && fhVar.l(childAt)) || (((jnVar = biVar.d2) != null && childAt == jnVar.E) || ((jnVar2 = biVar.e2) != null && childAt == jnVar2.E)))) {
                            if (org.telegram.messenger.i0.Q1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i23;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        } else if (childAt == biVar.y4) {
                            if (biVar.T1) {
                                i20 = org.telegram.messenger.i0.m;
                                max = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                                i19 = i20 + max;
                            }
                        } else if (childAt == biVar.q3) {
                            i20 = i19 + org.telegram.messenger.i0.n;
                            max = Math.max(i23, bi.L0(biVar));
                            i19 = i20 + max;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, i19 + measuredHeight3);
                    } else {
                        i17 = ((((i13 - max2) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != biVar.R2) {
                    }
                    i19 = 0;
                    dhVar = biVar.y2;
                    if (dhVar == null) {
                    }
                    if (childAt == biVar.y4) {
                    }
                } else {
                    i14 = ((i21 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i15 = biVar.t0;
                }
                i16 = i14 - i15;
                if (i27 == 16) {
                }
                i19 = i17 - i18;
                if (childAt != biVar.R2) {
                }
                i19 = 0;
                dhVar = biVar.y2;
                if (dhVar == null) {
                }
                if (childAt == biVar.y4) {
                }
            }
            i24++;
            phVar = this;
            i22 = 8;
        }
        R();
        biVar.L1(biVar.s2, 0);
        biVar.L1(biVar.t2, 0);
        if (biVar.T1) {
            biVar.I1();
        }
        if (chatAttachAlertPhotoLayout == null || (plVar = chatAttachAlertPhotoLayout.E) == null || plVar.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.E.getFastScroll().h0 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.p1 + (biVar.T1 ? (int) (iVar.getAlpha() * iVar.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.E.getFastScroll().invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        jn jnVar;
        jn jnVar2;
        int L0;
        ph phVar = this;
        bi biVar = phVar.k0;
        boolean z10 = biVar.X1;
        org.telegram.ui.ActionBar.t0 t0Var = biVar.U2;
        int size = phVar.getLayoutParams().height > 0 ? phVar.getLayoutParams().height : View.MeasureSpec.getSize(i11);
        if (!z10) {
            phVar.h0 = true;
            int i13 = biVar.t0;
            phVar.setPadding(i13, 0, i13, 0);
            phVar.h0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10) - (biVar.t0 * 2);
        if (org.telegram.messenger.i0.Q1()) {
            t0Var.setAdditionalYOffset(-org.telegram.messenger.i0.L(3.0f));
        } else {
            Point point = org.telegram.messenger.i0.q;
            if (point.x > point.y) {
                t0Var.setAdditionalYOffset(0);
            } else {
                t0Var.setAdditionalYOffset(-org.telegram.messenger.i0.L(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) biVar.Z2.getLayoutParams()).height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        phVar.h0 = true;
        int min = (int) (size2 / Math.min(4.5f, biVar.u3.b()));
        if (biVar.S3 != min) {
            biVar.S3 = min;
            org.telegram.messenger.i0.g3(new tf(phVar, 23));
        }
        phVar.h0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        phVar.setMeasuredDimension(size3, size4);
        int i14 = biVar.t0;
        fh fhVar = biVar.J2;
        dh dhVar = biVar.y2;
        int i15 = size3 - (i14 * 2);
        if (!dhVar.N && org.telegram.messenger.i0.L(20.0f) >= 0 && !dhVar.e && !dhVar.O) {
            phVar.h0 = true;
            dhVar.j();
            phVar.h0 = false;
        }
        if (!fhVar.N && org.telegram.messenger.i0.L(20.0f) >= 0 && !fhVar.e && !fhVar.O) {
            phVar.h0 = true;
            fhVar.j();
            phVar.h0 = false;
        }
        if (biVar.d2 != null && org.telegram.messenger.i0.L(20.0f) >= 0) {
            jn jnVar3 = biVar.d2;
            if (!jnVar3.G && !jnVar3.a1 && !jnVar3.f1 && !jnVar3.h1) {
                phVar.h0 = true;
                jnVar3.d0();
                phVar.h0 = false;
            }
        }
        if (biVar.e2 != null && org.telegram.messenger.i0.L(20.0f) >= 0) {
            jn jnVar4 = biVar.e2;
            if (!jnVar4.G && !jnVar4.a1 && !jnVar4.f1 && !jnVar4.h1) {
                phVar.h0 = true;
                jnVar4.d0();
                phVar.h0 = false;
            }
        }
        if (org.telegram.messenger.i0.L(20.0f) >= 0) {
            if (biVar.d) {
                uh uhVar = biVar.s2;
                jn jnVar5 = biVar.d2;
                if (uhVar == jnVar5 && jnVar5.E != null && jnVar5.h1) {
                    L0 = org.telegram.messenger.i0.L(120.0f);
                } else {
                    jn jnVar6 = biVar.e2;
                    L0 = (uhVar == jnVar6 && jnVar6.E != null && jnVar6.h1) ? org.telegram.messenger.i0.L(120.0f) : 0;
                }
            } else {
                L0 = bi.L0(biVar);
            }
            WeakHashMap weakHashMap = r0.h0.a;
            r0.j1 a2 = r0.a0.a(phVar);
            int i16 = a2 != null ? a2.a.f(8).d : 0;
            r0.j1 a10 = r0.a0.a(phVar);
            Math.max(a10 != null ? a10.a.f(527).d : 0, L0);
            int max = Math.max(i16 > 0 ? 0 : org.telegram.messenger.i0.n, L0);
            phVar.h0 = true;
            uh uhVar2 = biVar.s2;
            if (uhVar2.f) {
                uhVar2.e = org.telegram.messenger.i0.L(62.0f) + max;
                biVar.s2.B(i15, size4);
            } else {
                uhVar2.e = org.telegram.messenger.i0.n;
                uhVar2.B(i15, size4 - L0);
            }
            uh uhVar3 = biVar.t2;
            if (uhVar3 != null) {
                if (uhVar3.f) {
                    uhVar3.e = org.telegram.messenger.i0.L(62.0f) + max;
                    biVar.t2.B(i15, size4);
                } else {
                    uhVar3.e = org.telegram.messenger.i0.n;
                    uhVar3.B(i15, size4 - L0);
                }
            }
            phVar.h0 = false;
        }
        int childCount = phVar.getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            int i18 = i17;
            View childAt = phVar.getChildAt(i18);
            if (childAt == null || childAt.getVisibility() == 8) {
                i12 = i18;
            } else if (childAt == biVar.p3) {
                i12 = i18;
                phVar.measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, 0);
            } else {
                i12 = i18;
                int i19 = org.telegram.messenger.i0.m;
                int i20 = org.telegram.messenger.i0.n;
                if (childAt instanceof uh) {
                    uh uhVar4 = (uh) childAt;
                    if (uhVar4.h) {
                        i19 = 0;
                    }
                    if (uhVar4.f) {
                        i20 = 0;
                    }
                }
                if (!dhVar.l(childAt) && !fhVar.l(childAt) && (((jnVar = biVar.d2) == null || childAt != jnVar.E) && ((jnVar2 = biVar.e2) == null || childAt != jnVar2.E))) {
                    measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, i19 + i20);
                } else if (z10) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size4, TLObject.FLAG_30));
                } else if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (org.telegram.messenger.i0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(org.telegram.messenger.i0.Q1() ? 200.0f : 320.0f), getPaddingTop() + (size4 - org.telegram.messenger.i0.m)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - org.telegram.messenger.i0.m), TLObject.FLAG_30));
                }
            }
            i17 = i12 + 1;
            phVar = this;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        WindowInsets rootWindowInsets;
        super.onSizeChanged(i10, i11, i12, i13);
        int i15 = 0;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
            i14 = 0;
        } else {
            RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
            RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
            i14 = roundedCorner == null ? 0 : roundedCorner.getRadius();
            if (roundedCorner2 != null) {
                i15 = roundedCorner2.getRadius();
            }
        }
        vg.f fVar = this.k0.u2;
        if (fVar != null) {
            fVar.s(org.telegram.messenger.i0.L(29.0f), org.telegram.messenger.i0.L(29.0f), i15, i14, true);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bi biVar = this.k0;
        if (biVar.s2.n(motionEvent)) {
            return true;
        }
        return !biVar.I && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        bi biVar = this.k0;
        ah ahVar = biVar.r3;
        float f10 = f7 + biVar.f4;
        int i10 = biVar.A0;
        if (i10 == 0) {
            this.i0 = f10;
        }
        if (i10 == 1) {
            if (f10 < 0.0f) {
                biVar.s2.setTranslationY(f10);
                if (biVar.K2 != 0 || biVar.N2) {
                    biVar.c3.setTranslationY((biVar.j3 + f10) - biVar.f4);
                }
                ahVar.setTranslationY(0.0f);
                f10 = 0.0f;
            } else {
                biVar.s2.setTranslationY(0.0f);
                ahVar.setTranslationY(((f10 / this.i0) * ahVar.getMeasuredHeight()) + (-f10));
            }
            biVar.b.invalidate();
        }
        super.setTranslationY((f10 - biVar.f4) + biVar.p2);
        if (biVar.A0 != 1) {
            biVar.s2.l(biVar.f4);
        }
    }

    @Override // org.telegram.ui.Components.uu0
    public final void H(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
