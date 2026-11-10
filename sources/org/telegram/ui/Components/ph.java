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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ph extends st0 {
    public int f0;
    public final RectF g0;
    public boolean h0;
    public float i0;
    public final oh j0;
    public final /* synthetic */ ci k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(ci ciVar, Context context) {
        super(context, null);
        this.k0 = ciVar;
        this.g0 = new RectF();
        this.j0 = new oh(this, this);
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
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
        uh uhVar;
        canvas.save();
        ci ciVar = this.k0;
        uh uhVar2 = ciVar.v2;
        am amVar = ciVar.k2;
        if ((uhVar2 == amVar || (uhVar = ciVar.w2) == amVar || (uhVar2 == ciVar.d2 && uhVar == null)) && uhVar2 != null) {
            canvas.save();
            float f15 = ciVar.i4;
            boolean z9 = ciVar.a2;
            bi.x5 x5Var = ciVar.L2;
            ch chVar = ciVar.f3;
            canvas.translate(0.0f, f15);
            int alpha2 = (int) (uhVar2.getAlpha() * 255.0f);
            int j3 = uhVar2.j();
            int L3 = org.telegram.messenger.g0.L(13.0f) + ((int) ((chVar != null ? chVar.getAlpha() : 0.0f) * org.telegram.messenger.g0.L(26.0f))) + ((int) (x5Var != null ? x5Var.getAlpha() * x5Var.getMeasuredHeight() : 0.0f));
            int c12 = (ciVar.c1(0) - ciVar.s0) - L3;
            if (ciVar.A0 == 1 || ciVar.q3 != null) {
                c12 = (int) (uhVar2.getTranslationY() + c12);
            }
            int L4 = org.telegram.messenger.g0.L(20.0f) + c12;
            getMeasuredHeight();
            org.telegram.messenger.g0.L(45.0f);
            int i7 = ciVar.s0;
            if (j3 != 0) {
                i7 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            }
            if (j3 != 2) {
                float f16 = L3;
                f10 = 1.0f;
                if (uhVar2 == ciVar.i2) {
                    L = org.telegram.messenger.g0.L(11.0f);
                } else {
                    if (uhVar2 == ciVar.g2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else if (uhVar2 == ciVar.h2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    f11 = f16 - L2;
                    float alpha3 = ciVar.U2.getAlpha();
                    int i10 = (int) (((i7 - f11) + org.telegram.messenger.g0.m) * alpha3);
                    c12 -= i10;
                    L4 -= i10;
                    f12 = 1.0f - alpha3;
                }
                f11 = f16 + L;
                float alpha32 = ciVar.U2.getAlpha();
                int i102 = (int) (((i7 - f11) + org.telegram.messenger.g0.m) * alpha32);
                c12 -= i102;
                L4 -= i102;
                f12 = 1.0f - alpha32;
            } else if (c12 < i7) {
                f12 = org.telegram.ui.Cells.f1.v(i7 - c12, ciVar.s0, 1.0f, 0.0f);
                f10 = 1.0f;
            } else {
                f12 = 1.0f;
                f10 = 1.0f;
            }
            if (!z9) {
                int i11 = org.telegram.messenger.g0.m;
                c12 += i11;
                L4 += i11;
            }
            int customBackground = ciVar.v2.h() ? ciVar.v2.getCustomBackground() : ciVar.d1(true);
            ciVar.r0.setAlpha(alpha2);
            ciVar.r0.setBounds(0, c12, getMeasuredWidth(), org.telegram.messenger.g0.L(45.0f) + getMeasuredHeight() + ciVar.s0);
            ciVar.r0.draw(canvas);
            RectF rectF = this.g0;
            if (j3 == 2) {
                org.telegram.ui.ActionBar.m6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.m6.t0.setAlpha(alpha2);
                f13 = 24.0f;
                rectF.set(ciVar.t0, ciVar.s0 + c12, getMeasuredWidth() - ciVar.t0, org.telegram.messenger.g0.L(24.0f) + ciVar.s0 + c12);
            } else {
                f13 = 24.0f;
            }
            if ((f12 != f10 && j3 != 2) || ciVar.v2.g()) {
                Paint paint = org.telegram.ui.ActionBar.m6.t0;
                if (ciVar.v2.g()) {
                    customBackground = ciVar.v2.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                org.telegram.ui.ActionBar.m6.t0.setAlpha(alpha2);
                rectF.set(ciVar.t0, ciVar.s0 + c12, getMeasuredWidth() - ciVar.t0, org.telegram.messenger.g0.L(f13) + ciVar.s0 + c12);
            }
            if (ciVar.v2.g()) {
                org.telegram.ui.ActionBar.m6.t0.setColor(ciVar.v2.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.m6.t0.setAlpha(alpha2);
                int c13 = ciVar.c1(0);
                if (!z9) {
                    c13 += org.telegram.messenger.g0.m;
                }
                rectF.set(ciVar.t0, (org.telegram.messenger.g0.L(12.0f) + ciVar.s0 + c12) * f12, getMeasuredWidth() - ciVar.t0, org.telegram.messenger.g0.L(12.0f) + c13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.m6.t0);
                canvas.restore();
            }
            if ((chVar == null || chVar.getAlpha() != f10) && f12 != 0.0f) {
                int L5 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, L4, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(4.0f) + L4);
                if (j3 == 2) {
                    w02 = TLObject.FLAG_29;
                    f14 = f12;
                } else if (ciVar.v2.g()) {
                    int customActionBarBackground = ciVar.v2.getCustomActionBarBackground();
                    w02 = i0.a.f(0.5f, customActionBarBackground, i0.a.h(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (chVar != null) {
                        alpha = chVar.getAlpha();
                        f14 = f10 - alpha;
                    }
                    f14 = f10;
                } else {
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, ciVar.I0);
                    if (chVar != null) {
                        alpha = chVar.getAlpha();
                        f14 = f10 - alpha;
                    }
                    f14 = f10;
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.m6.t0.setColor(w02);
                org.telegram.ui.ActionBar.m6.t0.setAlpha((int) (uhVar2.getAlpha() * alpha4 * f14 * f12));
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
        uh uhVar;
        ci ciVar = this.k0;
        boolean z9 = ciVar.a2;
        bi.x5 x5Var = ciVar.L2;
        fh.g gVar = ciVar.x2;
        ch chVar = ciVar.f3;
        q7 q7Var = ciVar.U2;
        if (!(view instanceof uh) || view.getAlpha() <= 0.0f) {
            if (view != q7Var) {
                if (!(view instanceof gy) || gVar == null) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                gVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(gVar.Q.k);
                gVar.draw(canvas);
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            }
            float alpha2 = q7Var.getAlpha();
            if (alpha2 <= 0.0f) {
                return false;
            }
            if (alpha2 >= 1.0f) {
                return super.drawChild(canvas, view, j3);
            }
            canvas.save();
            float x10 = q7Var.getX();
            uh uhVar2 = ciVar.v2;
            if (uhVar2 != null) {
                int j10 = uhVar2.j();
                int L5 = org.telegram.messenger.g0.L(13.0f) + ((int) ((chVar != null ? chVar.getAlpha() : 0.0f) * org.telegram.messenger.g0.L(26.0f))) + ((int) (x5Var != null ? x5Var.getAlpha() * x5Var.getMeasuredHeight() : 0.0f));
                int c12 = (ciVar.c1(0) - ciVar.s0) - L5;
                if (ciVar.A0 == 1 || ciVar.q3 != null) {
                    c12 = (int) (uhVar2.getTranslationY() + c12);
                }
                int L6 = org.telegram.messenger.g0.L(20.0f) + c12;
                int currentActionBarHeight = j10 != 0 ? org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() : ciVar.s0;
                if (j10 != 2 && c12 + ciVar.s0 < currentActionBarHeight) {
                    float f16 = L5;
                    if (uhVar2 == ciVar.i2) {
                        L = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        if (uhVar2 == ciVar.g2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else if (uhVar2 == ciVar.h2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        f11 = f16 - L2;
                        L6 -= (int) (q7Var.getAlpha() * ((currentActionBarHeight - f11) + org.telegram.messenger.g0.m));
                    }
                    f11 = f16 + L;
                    L6 -= (int) (q7Var.getAlpha() * ((currentActionBarHeight - f11) + org.telegram.messenger.g0.m));
                }
                if (!z9) {
                    L6 += org.telegram.messenger.g0.m;
                }
                f10 = L6;
            } else {
                f10 = 0.0f;
            }
            canvas.clipRect(x10, f10, q7Var.getX() + q7Var.getWidth(), q7Var.getY() + q7Var.getHeight());
            boolean drawChild3 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild3;
        }
        canvas.save();
        canvas.translate(0.0f, ciVar.i4);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        uh uhVar3 = (uh) view;
        int j11 = uhVar3.j();
        int L7 = org.telegram.messenger.g0.L(13.0f) + (chVar != null ? org.telegram.messenger.g0.L(chVar.getAlpha() * 26.0f) : 0) + ((int) (x5Var != null ? x5Var.getAlpha() * x5Var.getMeasuredHeight() : 0.0f));
        int c13 = (ciVar.c1(uhVar3 == ciVar.v2 ? 0 : 1) - ciVar.s0) - L7;
        if (ciVar.A0 == 1 || ciVar.q3 != null) {
            c13 = (int) (view.getTranslationY() + c13);
        }
        int L8 = org.telegram.messenger.g0.L(20.0f) + c13;
        int L9 = org.telegram.messenger.g0.L(45.0f) + getMeasuredHeight();
        int i7 = ciVar.s0;
        int i10 = L9 + i7;
        if (j11 != 0) {
            i7 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        if (j11 != 2) {
            f12 = 0.0f;
            if (ciVar.s0 + c13 < i7) {
                float f17 = L7;
                if (uhVar3 == ciVar.i2) {
                    L3 = org.telegram.messenger.g0.L(11.0f);
                } else {
                    if (uhVar3 == ciVar.g2) {
                        L4 = org.telegram.messenger.g0.L(3.0f);
                    } else if (uhVar3 == ciVar.h2) {
                        L4 = org.telegram.messenger.g0.L(3.0f);
                    } else {
                        L3 = org.telegram.messenger.g0.L(4.0f);
                    }
                    f13 = f17 - L4;
                    float min = Math.min(1.0f, ((i7 - c13) - ciVar.s0) / f13);
                    int i11 = (int) ((i7 - f13) * min);
                    c13 -= i11;
                    L8 -= i11;
                    i10 += i11;
                    f14 = 1.0f - min;
                }
                f13 = f17 + L3;
                float min2 = Math.min(1.0f, ((i7 - c13) - ciVar.s0) / f13);
                int i112 = (int) ((i7 - f13) * min2);
                c13 -= i112;
                L8 -= i112;
                i10 += i112;
                f14 = 1.0f - min2;
            }
            f14 = 1.0f;
        } else if (c13 < i7) {
            f14 = org.telegram.ui.Cells.f1.v(i7 - c13, ciVar.s0, 1.0f, 0.0f);
            f12 = 0.0f;
        } else {
            f12 = 0.0f;
            f14 = 1.0f;
        }
        if (!z9) {
            int i12 = org.telegram.messenger.g0.m;
            c13 += i12;
            L8 += i12;
            i10 -= i12;
        }
        int i13 = i10;
        int customBackground = ciVar.v2.h() ? ciVar.v2.getCustomBackground() : ciVar.d1(true);
        uh uhVar4 = ciVar.v2;
        am amVar = ciVar.k2;
        boolean z10 = (uhVar4 == amVar || (uhVar = ciVar.w2) == amVar || (uhVar4 == ciVar.d2 && uhVar == null)) ? false : true;
        RectF rectF = this.g0;
        if (z10) {
            ciVar.r0.setAlpha(alpha3);
            f15 = 24.0f;
            ciVar.r0.setBounds(0, c13, getMeasuredWidth(), i13);
            ciVar.r0.draw(canvas);
            if (j11 == 2) {
                org.telegram.ui.ActionBar.m6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.m6.t0.setAlpha(alpha3);
                rectF.set(ciVar.t0, ciVar.s0 + c13, getMeasuredWidth() - ciVar.t0, org.telegram.messenger.g0.L(24.0f) + ciVar.s0 + c13);
            }
        } else {
            f15 = 24.0f;
        }
        uhVar3.E(((ciVar.s0 + c13) - view.getTop()) - view.getTranslationY(), f14);
        if (view == ciVar.e2 || view == ciVar.m2 || view == ciVar.f2) {
            drawChild = super.drawChild(canvas, view, j3);
        } else {
            canvas.save();
            drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
        }
        if (z10) {
            if (f14 != 1.0f && j11 != 2) {
                org.telegram.ui.ActionBar.m6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.m6.t0.setAlpha(alpha3);
                rectF.set(ciVar.t0, ciVar.s0 + c13, getMeasuredWidth() - ciVar.t0, org.telegram.messenger.g0.L(f15) + ciVar.s0 + c13);
            }
            if ((chVar == null || chVar.getAlpha() != 1.0f) && f14 != f12) {
                int L10 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L10) / 2, L8, (getMeasuredWidth() + L10) / 2, org.telegram.messenger.g0.L(4.0f) + L8);
                if (j11 == 2) {
                    w02 = TLObject.FLAG_29;
                    alpha = f14;
                } else {
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, ciVar.I0);
                    alpha = chVar == null ? 1.0f : 1.0f - chVar.getAlpha();
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

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        oh ohVar = this.j0;
        ohVar.b = this;
        ohVar.c();
        ci ciVar = this.k0;
        ciVar.B2.setAdjustPanLayoutHelper(ohVar);
        ciVar.M2.setAdjustPanLayoutHelper(ohVar);
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j0.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z9 = this.k0.a2;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ci ciVar = this.k0;
        int[] iArr = ciVar.Y3;
        if (ciVar.v2.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y10 = motionEvent.getY();
                bi.x5 x5Var = ciVar.L2;
                int i7 = iArr[0] - (ciVar.s0 * 2);
                int L = org.telegram.messenger.g0.L(13.0f);
                ch chVar = ciVar.f3;
                int L2 = org.telegram.messenger.g0.L(20.0f) + ((i7 - (L + (chVar != null ? org.telegram.messenger.g0.L(chVar.getAlpha() * 26.0f) : 0))) - ((int) (x5Var != null ? x5Var.getAlpha() * x5Var.getMeasuredHeight() : 0.0f)));
                if (!ciVar.a2) {
                    L2 += org.telegram.messenger.g0.m;
                }
                if (y10 < L2 && ciVar.U2.getAlpha() == 0.0f) {
                    ciVar.o0();
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
    @Override // org.telegram.ui.Components.st0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        il ilVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        fh fhVar;
        hh hhVar;
        an anVar;
        an anVar2;
        int i19;
        int max;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        ph phVar = this;
        ci ciVar = phVar.k0;
        bi.x5 x5Var = ciVar.L2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar.d2;
        int i20 = i11 - i7;
        if (phVar.f0 != i20) {
            phVar.f0 = i20;
            te teVar = ciVar.b2;
            if (teVar != null && !teVar.p0) {
                teVar.dismiss();
            }
        }
        int childCount = phVar.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            ciVar.h4.set(i7, i10, i11, i12);
            phVar.setSystemGestureExclusionRects(ciVar.g4);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.k1 a10 = r0.b0.a(phVar);
        int i21 = 8;
        int i22 = a10 != null ? a10.a.f(8).d : 0;
        int paddingBottom = phVar.getPaddingBottom();
        if (!ciVar.d) {
            an anVar3 = ciVar.g2;
            if (anVar3 == null || ciVar.v2 != anVar3 || anVar3.E == null) {
                an anVar4 = ciVar.h2;
                if (anVar4 == null || ciVar.v2 != anVar4 || anVar4.E == null) {
                    if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        emojiPadding = ciVar.a1().getEmojiPadding();
                        if (emojiPadding > 0) {
                            paddingBottom += emojiPadding;
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                } else {
                    if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        emojiPadding = ciVar.h2.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            } else {
                if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    emojiPadding = ciVar.g2.getEmojiPadding();
                    if (emojiPadding > 0) {
                    }
                }
                emojiPadding = 0;
                if (emojiPadding > 0) {
                }
            }
        }
        phVar.setBottomClip(paddingBottom);
        int i23 = 0;
        while (i23 < childCount) {
            View childAt = phVar.getChildAt(i23);
            if (childAt.getVisibility() != i21) {
                int i24 = org.telegram.messenger.g0.m;
                int max2 = i22 == 0 ? Math.max(org.telegram.messenger.g0.n, paddingBottom) : 0;
                if (childAt instanceof uh) {
                    uh uhVar = (uh) childAt;
                    if (uhVar.h) {
                        i24 = 0;
                    }
                    if (uhVar.f) {
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
                int i26 = i25 & org.telegram.messenger.qs.x1;
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
                        if (childAt != ciVar.U2 || childAt == ciVar.s3) {
                            i18 = 0;
                        }
                        fhVar = ciVar.B2;
                        if ((fhVar == null && fhVar.l(childAt)) || (((hhVar = ciVar.M2) != null && hhVar.l(childAt)) || (((anVar = ciVar.g2) != null && childAt == anVar.E) || ((anVar2 = ciVar.h2) != null && childAt == anVar2.E)))) {
                            if (org.telegram.messenger.g0.Q1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i22;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i18 = measuredHeight - measuredHeight2;
                        } else if (childAt == ciVar.B4) {
                            if (ciVar.W1) {
                                i19 = org.telegram.messenger.g0.m;
                                max = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                                i18 = i19 + max;
                            }
                        } else if (childAt == ciVar.t3) {
                            i19 = i18 + org.telegram.messenger.g0.n;
                            max = Math.max(i22, ci.L0(ciVar));
                            i18 = i19 + max;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, i18 + measuredHeight3);
                    } else {
                        i16 = ((((i12 - max2) - i10) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt != ciVar.U2) {
                    }
                    i18 = 0;
                    fhVar = ciVar.B2;
                    if (fhVar == null) {
                    }
                    if (childAt == ciVar.B4) {
                    }
                } else {
                    i13 = ((i20 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i14 = ciVar.t0;
                }
                i15 = i13 - i14;
                if (i26 == 16) {
                }
                i18 = i16 - i17;
                if (childAt != ciVar.U2) {
                }
                i18 = 0;
                fhVar = ciVar.B2;
                if (fhVar == null) {
                }
                if (childAt == ciVar.B4) {
                }
            }
            i23++;
            phVar = this;
            i21 = 8;
        }
        R();
        ciVar.M1(ciVar.v2, 0);
        ciVar.M1(ciVar.w2, 0);
        if (ciVar.W1) {
            ciVar.J1();
        }
        if (chatAttachAlertPhotoLayout == null || (ilVar = chatAttachAlertPhotoLayout.E) == null || ilVar.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.E.getFastScroll().h0 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.p1 + (ciVar.W1 ? (int) (x5Var.getAlpha() * x5Var.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.E.getFastScroll().invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        an anVar;
        an anVar2;
        int L0;
        ph phVar = this;
        ci ciVar = phVar.k0;
        boolean z9 = ciVar.a2;
        org.telegram.ui.ActionBar.r0 r0Var = ciVar.X2;
        int size = phVar.getLayoutParams().height > 0 ? phVar.getLayoutParams().height : View.MeasureSpec.getSize(i10);
        if (!z9) {
            phVar.h0 = true;
            int i12 = ciVar.t0;
            phVar.setPadding(i12, 0, i12, 0);
            phVar.h0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i7) - (ciVar.t0 * 2);
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
        ((FrameLayout.LayoutParams) ciVar.c3.getLayoutParams()).height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        phVar.h0 = true;
        int min = (int) (size2 / Math.min(4.5f, ciVar.x3.b()));
        if (ciVar.V3 != min) {
            ciVar.V3 = min;
            org.telegram.messenger.g0.h3(new wf(phVar, 22));
        }
        phVar.h0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i7);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        phVar.setMeasuredDimension(size3, size4);
        int i13 = ciVar.t0;
        hh hhVar = ciVar.M2;
        fh fhVar = ciVar.B2;
        int i14 = size3 - (i13 * 2);
        if (!fhVar.N && org.telegram.messenger.g0.L(20.0f) >= 0 && !fhVar.e && !fhVar.O) {
            phVar.h0 = true;
            fhVar.j();
            phVar.h0 = false;
        }
        if (!hhVar.N && org.telegram.messenger.g0.L(20.0f) >= 0 && !hhVar.e && !hhVar.O) {
            phVar.h0 = true;
            hhVar.j();
            phVar.h0 = false;
        }
        if (ciVar.g2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            an anVar3 = ciVar.g2;
            if (!anVar3.G && !anVar3.a1 && !anVar3.f1 && !anVar3.h1) {
                phVar.h0 = true;
                anVar3.f0();
                phVar.h0 = false;
            }
        }
        if (ciVar.h2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            an anVar4 = ciVar.h2;
            if (!anVar4.G && !anVar4.a1 && !anVar4.f1 && !anVar4.h1) {
                phVar.h0 = true;
                anVar4.f0();
                phVar.h0 = false;
            }
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            if (ciVar.d) {
                uh uhVar = ciVar.v2;
                an anVar5 = ciVar.g2;
                if (uhVar == anVar5 && anVar5.E != null && anVar5.h1) {
                    L0 = org.telegram.messenger.g0.L(120.0f);
                } else {
                    an anVar6 = ciVar.h2;
                    L0 = (uhVar == anVar6 && anVar6.E != null && anVar6.h1) ? org.telegram.messenger.g0.L(120.0f) : 0;
                }
            } else {
                L0 = ci.L0(ciVar);
            }
            WeakHashMap weakHashMap = r0.i0.a;
            r0.k1 a10 = r0.b0.a(phVar);
            int i15 = a10 != null ? a10.a.f(8).d : 0;
            r0.k1 a11 = r0.b0.a(phVar);
            Math.max(a11 != null ? a11.a.f(527).d : 0, L0);
            int max = Math.max(i15 > 0 ? 0 : org.telegram.messenger.g0.n, L0);
            phVar.h0 = true;
            uh uhVar2 = ciVar.v2;
            if (uhVar2.f) {
                uhVar2.e = org.telegram.messenger.g0.L(62.0f) + max;
                ciVar.v2.B(i14, size4);
            } else {
                uhVar2.e = org.telegram.messenger.g0.n;
                uhVar2.B(i14, size4 - L0);
            }
            uh uhVar3 = ciVar.w2;
            if (uhVar3 != null) {
                if (uhVar3.f) {
                    uhVar3.e = org.telegram.messenger.g0.L(62.0f) + max;
                    ciVar.w2.B(i14, size4);
                } else {
                    uhVar3.e = org.telegram.messenger.g0.n;
                    uhVar3.B(i14, size4 - L0);
                }
            }
            phVar.h0 = false;
        }
        int childCount = phVar.getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            int i17 = i16;
            View childAt = phVar.getChildAt(i17);
            if (childAt == null || childAt.getVisibility() == 8) {
                i11 = i17;
            } else if (childAt == ciVar.s3) {
                i11 = i17;
                phVar.measureChildWithMargins(childAt, i7, 0, makeMeasureSpec, 0);
            } else {
                i11 = i17;
                int i18 = org.telegram.messenger.g0.m;
                int i19 = org.telegram.messenger.g0.n;
                if (childAt instanceof uh) {
                    uh uhVar4 = (uh) childAt;
                    if (uhVar4.h) {
                        i18 = 0;
                    }
                    if (uhVar4.f) {
                        i19 = 0;
                    }
                }
                if (!fhVar.l(childAt) && !hhVar.l(childAt) && (((anVar = ciVar.g2) == null || childAt != anVar.E) && ((anVar2 = ciVar.h2) == null || childAt != anVar2.E))) {
                    measureChildWithMargins(childAt, i7, 0, makeMeasureSpec, i18 + i19);
                } else if (z9) {
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
            phVar = this;
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
        fh.g gVar = this.k0.x2;
        if (gVar != null) {
            gVar.t(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), i14, i13, true);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ci ciVar = this.k0;
        if (ciVar.v2.o(motionEvent)) {
            return true;
        }
        return !ciVar.I && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        ci ciVar = this.k0;
        ch chVar = ciVar.u3;
        float f11 = f10 + ciVar.i4;
        int i7 = ciVar.A0;
        if (i7 == 0) {
            this.i0 = f11;
        }
        if (i7 == 1) {
            if (f11 < 0.0f) {
                ciVar.v2.setTranslationY(f11);
                if (ciVar.N2 != 0 || ciVar.Q2) {
                    ciVar.f3.setTranslationY((ciVar.m3 + f11) - ciVar.i4);
                }
                chVar.setTranslationY(0.0f);
                f11 = 0.0f;
            } else {
                ciVar.v2.setTranslationY(0.0f);
                chVar.setTranslationY(((f11 / this.i0) * chVar.getMeasuredHeight()) + (-f11));
            }
            ciVar.b.invalidate();
        }
        super.setTranslationY((f11 - ciVar.i4) + ciVar.s2);
        if (ciVar.A0 != 1) {
            ciVar.v2.m(ciVar.i4);
        }
    }

    @Override // org.telegram.ui.Components.st0
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z9) {
    }
}
