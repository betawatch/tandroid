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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class fi extends au0 {
    public int g0;
    public final RectF h0;
    public boolean i0;
    public float j0;
    public final ei k0;
    public final /* synthetic */ si l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(si siVar, Context context) {
        super(context, null);
        this.l0 = siVar;
        this.h0 = new RectF();
        this.k0 = new ei(this, this);
    }

    @Override // org.telegram.ui.Components.au0, android.view.ViewGroup, android.view.View
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
        ki kiVar;
        canvas.save();
        si siVar = this.l0;
        ki kiVar2 = siVar.w2;
        pm pmVar = siVar.l2;
        if ((kiVar2 == pmVar || (kiVar = siVar.x2) == pmVar || (kiVar2 == siVar.e2 && kiVar == null)) && kiVar2 != null) {
            canvas.save();
            float f15 = siVar.j4;
            boolean z10 = siVar.b2;
            ai.k0 k0Var = siVar.M2;
            sh shVar = siVar.g3;
            canvas.translate(0.0f, f15);
            int alpha2 = (int) (kiVar2.getAlpha() * 255.0f);
            int j3 = kiVar2.j();
            int L3 = org.telegram.messenger.g0.L(13.0f) + ((int) ((shVar != null ? shVar.getAlpha() : 0.0f) * org.telegram.messenger.g0.L(26.0f))) + ((int) (k0Var != null ? k0Var.getAlpha() * k0Var.getMeasuredHeight() : 0.0f));
            int d12 = (siVar.d1(0) - siVar.t0) - L3;
            if (siVar.B0 == 1 || siVar.r3 != null) {
                d12 = (int) (kiVar2.getTranslationY() + d12);
            }
            int L4 = org.telegram.messenger.g0.L(20.0f) + d12;
            getMeasuredHeight();
            org.telegram.messenger.g0.L(45.0f);
            int i7 = siVar.t0;
            if (j3 != 0) {
                i7 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            if (j3 != 2) {
                float f16 = L3;
                f10 = 1.0f;
                if (kiVar2 == siVar.j2) {
                    L = org.telegram.messenger.g0.L(11.0f);
                } else {
                    if (kiVar2 == siVar.h2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else if (kiVar2 == siVar.i2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    f11 = f16 - L2;
                    float alpha3 = siVar.V2.getAlpha();
                    int i10 = (int) (((i7 - f11) + org.telegram.messenger.g0.m) * alpha3);
                    d12 -= i10;
                    L4 -= i10;
                    f12 = 1.0f - alpha3;
                }
                f11 = f16 + L;
                float alpha32 = siVar.V2.getAlpha();
                int i102 = (int) (((i7 - f11) + org.telegram.messenger.g0.m) * alpha32);
                d12 -= i102;
                L4 -= i102;
                f12 = 1.0f - alpha32;
            } else if (d12 < i7) {
                f12 = org.telegram.ui.Cells.c0.B(i7 - d12, siVar.t0, 1.0f, 0.0f);
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
            int customBackground = siVar.w2.h() ? siVar.w2.getCustomBackground() : siVar.e1(true);
            siVar.s0.setAlpha(alpha2);
            siVar.s0.setBounds(0, d12, getMeasuredWidth(), org.telegram.messenger.g0.L(45.0f) + getMeasuredHeight() + siVar.t0);
            siVar.s0.draw(canvas);
            RectF rectF = this.h0;
            if (j3 == 2) {
                org.telegram.ui.ActionBar.n6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.n6.t0.setAlpha(alpha2);
                f13 = 24.0f;
                rectF.set(siVar.u0, siVar.t0 + d12, getMeasuredWidth() - siVar.u0, org.telegram.messenger.g0.L(24.0f) + siVar.t0 + d12);
            } else {
                f13 = 24.0f;
            }
            if ((f12 != f10 && j3 != 2) || siVar.w2.g()) {
                Paint paint = org.telegram.ui.ActionBar.n6.t0;
                if (siVar.w2.g()) {
                    customBackground = siVar.w2.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                org.telegram.ui.ActionBar.n6.t0.setAlpha(alpha2);
                rectF.set(siVar.u0, siVar.t0 + d12, getMeasuredWidth() - siVar.u0, org.telegram.messenger.g0.L(f13) + siVar.t0 + d12);
            }
            if (siVar.w2.g()) {
                org.telegram.ui.ActionBar.n6.t0.setColor(siVar.w2.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.n6.t0.setAlpha(alpha2);
                int d13 = siVar.d1(0);
                if (!z10) {
                    d13 += org.telegram.messenger.g0.m;
                }
                rectF.set(siVar.u0, (org.telegram.messenger.g0.L(12.0f) + siVar.t0 + d12) * f12, getMeasuredWidth() - siVar.u0, org.telegram.messenger.g0.L(12.0f) + d13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.n6.t0);
                canvas.restore();
            }
            if ((shVar == null || shVar.getAlpha() != f10) && f12 != 0.0f) {
                int L5 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, L4, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(4.0f) + L4);
                if (j3 == 2) {
                    w02 = TLObject.FLAG_29;
                    f14 = f12;
                } else if (siVar.w2.g()) {
                    int customActionBarBackground = siVar.w2.getCustomActionBarBackground();
                    w02 = i0.a.f(0.5f, customActionBarBackground, i0.a.h(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (shVar != null) {
                        alpha = shVar.getAlpha();
                        f14 = f10 - alpha;
                    }
                    f14 = f10;
                } else {
                    w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, siVar.J0);
                    if (shVar != null) {
                        alpha = shVar.getAlpha();
                        f14 = f10 - alpha;
                    }
                    f14 = f10;
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.n6.t0.setColor(w02);
                org.telegram.ui.ActionBar.n6.t0.setAlpha((int) (kiVar2.getAlpha() * alpha4 * f14 * f12));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.t0);
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
        ki kiVar;
        si siVar = this.l0;
        boolean z10 = siVar.b2;
        ai.k0 k0Var = siVar.M2;
        fh.g gVar = siVar.y2;
        sh shVar = siVar.g3;
        v7 v7Var = siVar.V2;
        if (!(view instanceof ki) || view.getAlpha() <= 0.0f) {
            if (view != v7Var) {
                if (!(view instanceof ry) || gVar == null) {
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
            ki kiVar2 = siVar.w2;
            if (kiVar2 != null) {
                int j10 = kiVar2.j();
                int L5 = org.telegram.messenger.g0.L(13.0f) + ((int) ((shVar != null ? shVar.getAlpha() : 0.0f) * org.telegram.messenger.g0.L(26.0f))) + ((int) (k0Var != null ? k0Var.getAlpha() * k0Var.getMeasuredHeight() : 0.0f));
                int d12 = (siVar.d1(0) - siVar.t0) - L5;
                if (siVar.B0 == 1 || siVar.r3 != null) {
                    d12 = (int) (kiVar2.getTranslationY() + d12);
                }
                int L6 = org.telegram.messenger.g0.L(20.0f) + d12;
                int currentActionBarHeight = j10 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : siVar.t0;
                if (j10 != 2 && d12 + siVar.t0 < currentActionBarHeight) {
                    float f16 = L5;
                    if (kiVar2 == siVar.j2) {
                        L = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        if (kiVar2 == siVar.h2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else if (kiVar2 == siVar.i2) {
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
        canvas.translate(0.0f, siVar.j4);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        ki kiVar3 = (ki) view;
        int j11 = kiVar3.j();
        int L7 = org.telegram.messenger.g0.L(13.0f) + (shVar != null ? org.telegram.messenger.g0.L(shVar.getAlpha() * 26.0f) : 0) + ((int) (k0Var != null ? k0Var.getAlpha() * k0Var.getMeasuredHeight() : 0.0f));
        int d13 = (siVar.d1(kiVar3 == siVar.w2 ? 0 : 1) - siVar.t0) - L7;
        if (siVar.B0 == 1 || siVar.r3 != null) {
            d13 = (int) (view.getTranslationY() + d13);
        }
        int L8 = org.telegram.messenger.g0.L(20.0f) + d13;
        int L9 = org.telegram.messenger.g0.L(45.0f) + getMeasuredHeight();
        int i7 = siVar.t0;
        int i10 = L9 + i7;
        if (j11 != 0) {
            i7 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (j11 != 2) {
            f12 = 0.0f;
            if (siVar.t0 + d13 < i7) {
                float f17 = L7;
                if (kiVar3 == siVar.j2) {
                    L3 = org.telegram.messenger.g0.L(11.0f);
                } else {
                    if (kiVar3 == siVar.h2) {
                        L4 = org.telegram.messenger.g0.L(3.0f);
                    } else if (kiVar3 == siVar.i2) {
                        L4 = org.telegram.messenger.g0.L(3.0f);
                    } else {
                        L3 = org.telegram.messenger.g0.L(4.0f);
                    }
                    f13 = f17 - L4;
                    float min = Math.min(1.0f, ((i7 - d13) - siVar.t0) / f13);
                    int i11 = (int) ((i7 - f13) * min);
                    d13 -= i11;
                    L8 -= i11;
                    i10 += i11;
                    f14 = 1.0f - min;
                }
                f13 = f17 + L3;
                float min2 = Math.min(1.0f, ((i7 - d13) - siVar.t0) / f13);
                int i112 = (int) ((i7 - f13) * min2);
                d13 -= i112;
                L8 -= i112;
                i10 += i112;
                f14 = 1.0f - min2;
            }
            f14 = 1.0f;
        } else if (d13 < i7) {
            f14 = org.telegram.ui.Cells.c0.B(i7 - d13, siVar.t0, 1.0f, 0.0f);
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
        int customBackground = siVar.w2.h() ? siVar.w2.getCustomBackground() : siVar.e1(true);
        ki kiVar4 = siVar.w2;
        pm pmVar = siVar.l2;
        boolean z11 = (kiVar4 == pmVar || (kiVar = siVar.x2) == pmVar || (kiVar4 == siVar.e2 && kiVar == null)) ? false : true;
        RectF rectF = this.h0;
        if (z11) {
            siVar.s0.setAlpha(alpha3);
            f15 = 24.0f;
            siVar.s0.setBounds(0, d13, getMeasuredWidth(), i13);
            siVar.s0.draw(canvas);
            if (j11 == 2) {
                org.telegram.ui.ActionBar.n6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.n6.t0.setAlpha(alpha3);
                rectF.set(siVar.u0, siVar.t0 + d13, getMeasuredWidth() - siVar.u0, org.telegram.messenger.g0.L(24.0f) + siVar.t0 + d13);
            }
        } else {
            f15 = 24.0f;
        }
        kiVar3.F(((siVar.t0 + d13) - view.getTop()) - view.getTranslationY(), f14);
        if (view == siVar.f2 || view == siVar.n2 || view == siVar.g2) {
            drawChild = super.drawChild(canvas, view, j3);
        } else {
            canvas.save();
            drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
        }
        if (z11) {
            if (f14 != 1.0f && j11 != 2) {
                org.telegram.ui.ActionBar.n6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.n6.t0.setAlpha(alpha3);
                rectF.set(siVar.u0, siVar.t0 + d13, getMeasuredWidth() - siVar.u0, org.telegram.messenger.g0.L(f15) + siVar.t0 + d13);
            }
            if ((shVar == null || shVar.getAlpha() != 1.0f) && f14 != f12) {
                int L10 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L10) / 2, L8, (getMeasuredWidth() + L10) / 2, org.telegram.messenger.g0.L(4.0f) + L8);
                if (j11 == 2) {
                    w02 = TLObject.FLAG_29;
                    alpha = f14;
                } else {
                    w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, siVar.J0);
                    alpha = shVar == null ? 1.0f : 1.0f - shVar.getAlpha();
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.n6.t0.setColor(w02);
                org.telegram.ui.ActionBar.n6.t0.setAlpha((int) (view.getAlpha() * alpha4 * alpha * f14));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.t0);
            }
        }
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.au0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ei eiVar = this.k0;
        eiVar.b = this;
        eiVar.c();
        si siVar = this.l0;
        siVar.C2.setAdjustPanLayoutHelper(eiVar);
        siVar.N2.setAdjustPanLayoutHelper(eiVar);
    }

    @Override // org.telegram.ui.Components.au0, android.view.ViewGroup, android.view.View
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
        si siVar = this.l0;
        int[] iArr = siVar.Z3;
        if (siVar.w2.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y10 = motionEvent.getY();
                ai.k0 k0Var = siVar.M2;
                int i7 = iArr[0] - (siVar.t0 * 2);
                int L = org.telegram.messenger.g0.L(13.0f);
                sh shVar = siVar.g3;
                int L2 = org.telegram.messenger.g0.L(20.0f) + ((i7 - (L + (shVar != null ? org.telegram.messenger.g0.L(shVar.getAlpha() * 26.0f) : 0))) - ((int) (k0Var != null ? k0Var.getAlpha() * k0Var.getMeasuredHeight() : 0.0f)));
                if (!siVar.b2) {
                    L2 += org.telegram.messenger.g0.m;
                }
                if (y10 < L2 && siVar.V2.getAlpha() == 0.0f) {
                    siVar.o0();
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
    @Override // org.telegram.ui.Components.au0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        xl xlVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        vh vhVar;
        xh xhVar;
        rn rnVar;
        rn rnVar2;
        int i19;
        int max;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        fi fiVar = this;
        si siVar = fiVar.l0;
        ai.k0 k0Var = siVar.M2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar.e2;
        int i20 = i11 - i7;
        if (fiVar.g0 != i20) {
            fiVar.g0 = i20;
            df dfVar = siVar.c2;
            if (dfVar != null && !dfVar.u0) {
                dfVar.dismiss();
            }
        }
        int childCount = fiVar.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            siVar.i4.set(i7, i10, i11, i12);
            fiVar.setSystemGestureExclusionRects(siVar.h4);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.l1 a10 = r0.b0.a(fiVar);
        int i21 = 8;
        int i22 = a10 != null ? a10.a.f(8).d : 0;
        int paddingBottom = fiVar.getPaddingBottom();
        if (!siVar.d) {
            rn rnVar3 = siVar.h2;
            if (rnVar3 == null || siVar.w2 != rnVar3 || rnVar3.F == null) {
                rn rnVar4 = siVar.i2;
                if (rnVar4 == null || siVar.w2 != rnVar4 || rnVar4.F == null) {
                    if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        emojiPadding = siVar.b1().getEmojiPadding();
                        if (emojiPadding > 0) {
                            paddingBottom += emojiPadding;
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                } else {
                    if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        emojiPadding = siVar.i2.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            } else {
                if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    emojiPadding = siVar.h2.getEmojiPadding();
                    if (emojiPadding > 0) {
                    }
                }
                emojiPadding = 0;
                if (emojiPadding > 0) {
                }
            }
        }
        fiVar.setBottomClip(paddingBottom);
        int i23 = 0;
        while (i23 < childCount) {
            View childAt = fiVar.getChildAt(i23);
            if (childAt.getVisibility() != i21) {
                int i24 = org.telegram.messenger.g0.m;
                int max2 = i22 == 0 ? Math.max(org.telegram.messenger.g0.n, paddingBottom) : 0;
                if (childAt instanceof ki) {
                    ki kiVar = (ki) childAt;
                    if (kiVar.h) {
                        i24 = 0;
                    }
                    if (kiVar.f) {
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
                        if (childAt != siVar.V2 || childAt == siVar.t3) {
                            i18 = 0;
                        }
                        vhVar = siVar.C2;
                        if ((vhVar == null && vhVar.l(childAt)) || (((xhVar = siVar.N2) != null && xhVar.l(childAt)) || (((rnVar = siVar.h2) != null && childAt == rnVar.F) || ((rnVar2 = siVar.i2) != null && childAt == rnVar2.F)))) {
                            if (org.telegram.messenger.g0.Q1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i22;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i18 = measuredHeight - measuredHeight2;
                        } else if (childAt == siVar.C4) {
                            if (siVar.X1) {
                                i19 = org.telegram.messenger.g0.m;
                                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                i18 = i19 + max;
                            }
                        } else if (childAt == siVar.u3) {
                            i19 = i18 + org.telegram.messenger.g0.n;
                            max = Math.max(i22, si.M0(siVar));
                            i18 = i19 + max;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, i18 + measuredHeight3);
                    } else {
                        i16 = ((((i12 - max2) - i10) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt != siVar.V2) {
                    }
                    i18 = 0;
                    vhVar = siVar.C2;
                    if (vhVar == null) {
                    }
                    if (childAt == siVar.C4) {
                    }
                } else {
                    i13 = ((i20 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i14 = siVar.u0;
                }
                i15 = i13 - i14;
                if (i26 == 16) {
                }
                i18 = i16 - i17;
                if (childAt != siVar.V2) {
                }
                i18 = 0;
                vhVar = siVar.C2;
                if (vhVar == null) {
                }
                if (childAt == siVar.C4) {
                }
            }
            i23++;
            fiVar = this;
            i21 = 8;
        }
        R();
        siVar.N1(siVar.w2, 0);
        siVar.N1(siVar.x2, 0);
        if (siVar.X1) {
            siVar.K1();
        }
        if (chatAttachAlertPhotoLayout == null || (xlVar = chatAttachAlertPhotoLayout.F) == null || xlVar.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.F.getFastScroll().i0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.q1 + (siVar.X1 ? (int) (k0Var.getAlpha() * k0Var.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.F.getFastScroll().invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        rn rnVar;
        rn rnVar2;
        int M0;
        fi fiVar = this;
        si siVar = fiVar.l0;
        boolean z10 = siVar.b2;
        org.telegram.ui.ActionBar.r0 r0Var = siVar.Y2;
        int size = fiVar.getLayoutParams().height > 0 ? fiVar.getLayoutParams().height : View.MeasureSpec.getSize(i10);
        if (!z10) {
            fiVar.i0 = true;
            int i12 = siVar.u0;
            fiVar.setPadding(i12, 0, i12, 0);
            fiVar.i0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i7) - (siVar.u0 * 2);
        if (org.telegram.messenger.g0.Q1()) {
            r0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(3.0f));
        } else {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                r0Var.setAdditionalYOffset(0);
            } else {
                r0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) siVar.d3.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        fiVar.i0 = true;
        int min = (int) (size2 / Math.min(4.5f, siVar.y3.b()));
        if (siVar.W3 != min) {
            siVar.W3 = min;
            org.telegram.messenger.g0.g3(new lg(fiVar, 24));
        }
        fiVar.i0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i7);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        fiVar.setMeasuredDimension(size3, size4);
        int i13 = siVar.u0;
        xh xhVar = siVar.N2;
        vh vhVar = siVar.C2;
        int i14 = size3 - (i13 * 2);
        if (!vhVar.O && org.telegram.messenger.g0.L(20.0f) >= 0 && !vhVar.e && !vhVar.P) {
            fiVar.i0 = true;
            vhVar.j();
            fiVar.i0 = false;
        }
        if (!xhVar.O && org.telegram.messenger.g0.L(20.0f) >= 0 && !xhVar.e && !xhVar.P) {
            fiVar.i0 = true;
            xhVar.j();
            fiVar.i0 = false;
        }
        if (siVar.h2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            rn rnVar3 = siVar.h2;
            if (!rnVar3.H && !rnVar3.b1 && !rnVar3.g1 && !rnVar3.i1) {
                fiVar.i0 = true;
                rnVar3.f0();
                fiVar.i0 = false;
            }
        }
        if (siVar.i2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            rn rnVar4 = siVar.i2;
            if (!rnVar4.H && !rnVar4.b1 && !rnVar4.g1 && !rnVar4.i1) {
                fiVar.i0 = true;
                rnVar4.f0();
                fiVar.i0 = false;
            }
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            if (siVar.d) {
                ki kiVar = siVar.w2;
                rn rnVar5 = siVar.h2;
                if (kiVar == rnVar5 && rnVar5.F != null && rnVar5.i1) {
                    M0 = org.telegram.messenger.g0.L(120.0f);
                } else {
                    rn rnVar6 = siVar.i2;
                    M0 = (kiVar == rnVar6 && rnVar6.F != null && rnVar6.i1) ? org.telegram.messenger.g0.L(120.0f) : 0;
                }
            } else {
                M0 = si.M0(siVar);
            }
            WeakHashMap weakHashMap = r0.i0.a;
            r0.l1 a10 = r0.b0.a(fiVar);
            int i15 = a10 != null ? a10.a.f(8).d : 0;
            r0.l1 a11 = r0.b0.a(fiVar);
            Math.max(a11 != null ? a11.a.f(527).d : 0, M0);
            int max = Math.max(i15 > 0 ? 0 : org.telegram.messenger.g0.n, M0);
            fiVar.i0 = true;
            ki kiVar2 = siVar.w2;
            if (kiVar2.f) {
                kiVar2.e = org.telegram.messenger.g0.L(62.0f) + max;
                siVar.w2.B(i14, size4);
            } else {
                kiVar2.e = org.telegram.messenger.g0.n;
                kiVar2.B(i14, size4 - M0);
            }
            ki kiVar3 = siVar.x2;
            if (kiVar3 != null) {
                if (kiVar3.f) {
                    kiVar3.e = org.telegram.messenger.g0.L(62.0f) + max;
                    siVar.x2.B(i14, size4);
                } else {
                    kiVar3.e = org.telegram.messenger.g0.n;
                    kiVar3.B(i14, size4 - M0);
                }
            }
            fiVar.i0 = false;
        }
        int childCount = fiVar.getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            int i17 = i16;
            View childAt = fiVar.getChildAt(i17);
            if (childAt == null || childAt.getVisibility() == 8) {
                i11 = i17;
            } else if (childAt == siVar.t3) {
                i11 = i17;
                fiVar.measureChildWithMargins(childAt, i7, 0, makeMeasureSpec, 0);
            } else {
                i11 = i17;
                int i18 = org.telegram.messenger.g0.m;
                int i19 = org.telegram.messenger.g0.n;
                if (childAt instanceof ki) {
                    ki kiVar4 = (ki) childAt;
                    if (kiVar4.h) {
                        i18 = 0;
                    }
                    if (kiVar4.f) {
                        i19 = 0;
                    }
                }
                if (!vhVar.l(childAt) && !xhVar.l(childAt) && (((rnVar = siVar.h2) == null || childAt != rnVar.F) && ((rnVar2 = siVar.i2) == null || childAt != rnVar2.F))) {
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
            fiVar = this;
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
        si siVar = this.l0;
        if (siVar.w2.o(motionEvent)) {
            return true;
        }
        return !siVar.J && super.onTouchEvent(motionEvent);
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
        si siVar = this.l0;
        sh shVar = siVar.v3;
        float f11 = f10 + siVar.j4;
        int i7 = siVar.B0;
        if (i7 == 0) {
            this.j0 = f11;
        }
        if (i7 == 1) {
            if (f11 < 0.0f) {
                siVar.w2.setTranslationY(f11);
                if (siVar.O2 != 0 || siVar.R2) {
                    siVar.g3.setTranslationY((siVar.n3 + f11) - siVar.j4);
                }
                shVar.setTranslationY(0.0f);
                f11 = 0.0f;
            } else {
                siVar.w2.setTranslationY(0.0f);
                shVar.setTranslationY(((f11 / this.j0) * shVar.getMeasuredHeight()) + (-f11));
            }
            siVar.b.invalidate();
        }
        super.setTranslationY((f11 - siVar.j4) + siVar.t2);
        if (siVar.B0 != 1) {
            siVar.w2.m(siVar.j4);
        }
    }

    @Override // org.telegram.ui.Components.au0
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
