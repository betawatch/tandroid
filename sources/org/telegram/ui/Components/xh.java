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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xh extends st0 {
    public int g0;
    public final RectF h0;
    public boolean i0;
    public float j0;
    public final wh k0;
    public final /* synthetic */ ki l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(ki kiVar, Context context) {
        super(context, null);
        this.l0 = kiVar;
        this.h0 = new RectF();
        this.k0 = new wh(this, this);
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
        ci ciVar;
        canvas.save();
        ki kiVar = this.l0;
        ci ciVar2 = kiVar.w2;
        im imVar = kiVar.l2;
        if ((ciVar2 == imVar || (ciVar = kiVar.x2) == imVar || (ciVar2 == kiVar.e2 && ciVar == null)) && ciVar2 != null) {
            canvas.save();
            float f15 = kiVar.j4;
            boolean z10 = kiVar.b2;
            ai.k0 k0Var = kiVar.M2;
            kh khVar = kiVar.g3;
            canvas.translate(0.0f, f15);
            int alpha2 = (int) (ciVar2.getAlpha() * 255.0f);
            int j3 = ciVar2.j();
            int L3 = org.telegram.messenger.g0.L(13.0f) + ((int) ((khVar != null ? khVar.getAlpha() : 0.0f) * org.telegram.messenger.g0.L(26.0f))) + ((int) (k0Var != null ? k0Var.getAlpha() * k0Var.getMeasuredHeight() : 0.0f));
            int c12 = (kiVar.c1(0) - kiVar.t0) - L3;
            if (kiVar.B0 == 1 || kiVar.r3 != null) {
                c12 = (int) (ciVar2.getTranslationY() + c12);
            }
            int L4 = org.telegram.messenger.g0.L(20.0f) + c12;
            getMeasuredHeight();
            org.telegram.messenger.g0.L(45.0f);
            int i7 = kiVar.t0;
            if (j3 != 0) {
                i7 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            if (j3 != 2) {
                float f16 = L3;
                f10 = 1.0f;
                if (ciVar2 == kiVar.j2) {
                    L = org.telegram.messenger.g0.L(11.0f);
                } else {
                    if (ciVar2 == kiVar.h2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else if (ciVar2 == kiVar.i2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    f11 = f16 - L2;
                    float alpha3 = kiVar.V2.getAlpha();
                    int i10 = (int) (((i7 - f11) + org.telegram.messenger.g0.m) * alpha3);
                    c12 -= i10;
                    L4 -= i10;
                    f12 = 1.0f - alpha3;
                }
                f11 = f16 + L;
                float alpha32 = kiVar.V2.getAlpha();
                int i102 = (int) (((i7 - f11) + org.telegram.messenger.g0.m) * alpha32);
                c12 -= i102;
                L4 -= i102;
                f12 = 1.0f - alpha32;
            } else if (c12 < i7) {
                f12 = org.telegram.ui.Cells.y0.z(i7 - c12, kiVar.t0, 1.0f, 0.0f);
                f10 = 1.0f;
            } else {
                f12 = 1.0f;
                f10 = 1.0f;
            }
            if (!z10) {
                int i11 = org.telegram.messenger.g0.m;
                c12 += i11;
                L4 += i11;
            }
            int customBackground = kiVar.w2.h() ? kiVar.w2.getCustomBackground() : kiVar.d1(true);
            kiVar.s0.setAlpha(alpha2);
            kiVar.s0.setBounds(0, c12, getMeasuredWidth(), org.telegram.messenger.g0.L(45.0f) + getMeasuredHeight() + kiVar.t0);
            kiVar.s0.draw(canvas);
            RectF rectF = this.h0;
            if (j3 == 2) {
                org.telegram.ui.ActionBar.j6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.j6.t0.setAlpha(alpha2);
                f13 = 24.0f;
                rectF.set(kiVar.u0, kiVar.t0 + c12, getMeasuredWidth() - kiVar.u0, org.telegram.messenger.g0.L(24.0f) + kiVar.t0 + c12);
            } else {
                f13 = 24.0f;
            }
            if ((f12 != f10 && j3 != 2) || kiVar.w2.g()) {
                Paint paint = org.telegram.ui.ActionBar.j6.t0;
                if (kiVar.w2.g()) {
                    customBackground = kiVar.w2.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                org.telegram.ui.ActionBar.j6.t0.setAlpha(alpha2);
                rectF.set(kiVar.u0, kiVar.t0 + c12, getMeasuredWidth() - kiVar.u0, org.telegram.messenger.g0.L(f13) + kiVar.t0 + c12);
            }
            if (kiVar.w2.g()) {
                org.telegram.ui.ActionBar.j6.t0.setColor(kiVar.w2.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.j6.t0.setAlpha(alpha2);
                int c13 = kiVar.c1(0);
                if (!z10) {
                    c13 += org.telegram.messenger.g0.m;
                }
                rectF.set(kiVar.u0, (org.telegram.messenger.g0.L(12.0f) + kiVar.t0 + c12) * f12, getMeasuredWidth() - kiVar.u0, org.telegram.messenger.g0.L(12.0f) + c13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.j6.t0);
                canvas.restore();
            }
            if ((khVar == null || khVar.getAlpha() != f10) && f12 != 0.0f) {
                int L5 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, L4, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(4.0f) + L4);
                if (j3 == 2) {
                    w02 = TLObject.FLAG_29;
                    f14 = f12;
                } else if (kiVar.w2.g()) {
                    int customActionBarBackground = kiVar.w2.getCustomActionBarBackground();
                    w02 = i0.a.f(0.5f, customActionBarBackground, i0.a.h(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (khVar != null) {
                        alpha = khVar.getAlpha();
                        f14 = f10 - alpha;
                    }
                    f14 = f10;
                } else {
                    w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.zj, kiVar.J0);
                    if (khVar != null) {
                        alpha = khVar.getAlpha();
                        f14 = f10 - alpha;
                    }
                    f14 = f10;
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.j6.t0.setColor(w02);
                org.telegram.ui.ActionBar.j6.t0.setAlpha((int) (ciVar2.getAlpha() * alpha4 * f14 * f12));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.j6.t0);
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
        ci ciVar;
        ki kiVar = this.l0;
        boolean z10 = kiVar.b2;
        ai.k0 k0Var = kiVar.M2;
        fh.g gVar = kiVar.y2;
        kh khVar = kiVar.g3;
        o7 o7Var = kiVar.V2;
        if (!(view instanceof ci) || view.getAlpha() <= 0.0f) {
            if (view != o7Var) {
                if (!(view instanceof ly) || gVar == null) {
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
            float alpha2 = o7Var.getAlpha();
            if (alpha2 <= 0.0f) {
                return false;
            }
            if (alpha2 >= 1.0f) {
                return super.drawChild(canvas, view, j3);
            }
            canvas.save();
            float x10 = o7Var.getX();
            ci ciVar2 = kiVar.w2;
            if (ciVar2 != null) {
                int j10 = ciVar2.j();
                int L5 = org.telegram.messenger.g0.L(13.0f) + ((int) ((khVar != null ? khVar.getAlpha() : 0.0f) * org.telegram.messenger.g0.L(26.0f))) + ((int) (k0Var != null ? k0Var.getAlpha() * k0Var.getMeasuredHeight() : 0.0f));
                int c12 = (kiVar.c1(0) - kiVar.t0) - L5;
                if (kiVar.B0 == 1 || kiVar.r3 != null) {
                    c12 = (int) (ciVar2.getTranslationY() + c12);
                }
                int L6 = org.telegram.messenger.g0.L(20.0f) + c12;
                int currentActionBarHeight = j10 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : kiVar.t0;
                if (j10 != 2 && c12 + kiVar.t0 < currentActionBarHeight) {
                    float f16 = L5;
                    if (ciVar2 == kiVar.j2) {
                        L = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        if (ciVar2 == kiVar.h2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else if (ciVar2 == kiVar.i2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        f11 = f16 - L2;
                        L6 -= (int) (o7Var.getAlpha() * ((currentActionBarHeight - f11) + org.telegram.messenger.g0.m));
                    }
                    f11 = f16 + L;
                    L6 -= (int) (o7Var.getAlpha() * ((currentActionBarHeight - f11) + org.telegram.messenger.g0.m));
                }
                if (!z10) {
                    L6 += org.telegram.messenger.g0.m;
                }
                f10 = L6;
            } else {
                f10 = 0.0f;
            }
            canvas.clipRect(x10, f10, o7Var.getX() + o7Var.getWidth(), o7Var.getY() + o7Var.getHeight());
            boolean drawChild3 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild3;
        }
        canvas.save();
        canvas.translate(0.0f, kiVar.j4);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        ci ciVar3 = (ci) view;
        int j11 = ciVar3.j();
        int L7 = org.telegram.messenger.g0.L(13.0f) + (khVar != null ? org.telegram.messenger.g0.L(khVar.getAlpha() * 26.0f) : 0) + ((int) (k0Var != null ? k0Var.getAlpha() * k0Var.getMeasuredHeight() : 0.0f));
        int c13 = (kiVar.c1(ciVar3 == kiVar.w2 ? 0 : 1) - kiVar.t0) - L7;
        if (kiVar.B0 == 1 || kiVar.r3 != null) {
            c13 = (int) (view.getTranslationY() + c13);
        }
        int L8 = org.telegram.messenger.g0.L(20.0f) + c13;
        int L9 = org.telegram.messenger.g0.L(45.0f) + getMeasuredHeight();
        int i7 = kiVar.t0;
        int i10 = L9 + i7;
        if (j11 != 0) {
            i7 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (j11 != 2) {
            f12 = 0.0f;
            if (kiVar.t0 + c13 < i7) {
                float f17 = L7;
                if (ciVar3 == kiVar.j2) {
                    L3 = org.telegram.messenger.g0.L(11.0f);
                } else {
                    if (ciVar3 == kiVar.h2) {
                        L4 = org.telegram.messenger.g0.L(3.0f);
                    } else if (ciVar3 == kiVar.i2) {
                        L4 = org.telegram.messenger.g0.L(3.0f);
                    } else {
                        L3 = org.telegram.messenger.g0.L(4.0f);
                    }
                    f13 = f17 - L4;
                    float min = Math.min(1.0f, ((i7 - c13) - kiVar.t0) / f13);
                    int i11 = (int) ((i7 - f13) * min);
                    c13 -= i11;
                    L8 -= i11;
                    i10 += i11;
                    f14 = 1.0f - min;
                }
                f13 = f17 + L3;
                float min2 = Math.min(1.0f, ((i7 - c13) - kiVar.t0) / f13);
                int i112 = (int) ((i7 - f13) * min2);
                c13 -= i112;
                L8 -= i112;
                i10 += i112;
                f14 = 1.0f - min2;
            }
            f14 = 1.0f;
        } else if (c13 < i7) {
            f14 = org.telegram.ui.Cells.y0.z(i7 - c13, kiVar.t0, 1.0f, 0.0f);
            f12 = 0.0f;
        } else {
            f12 = 0.0f;
            f14 = 1.0f;
        }
        if (!z10) {
            int i12 = org.telegram.messenger.g0.m;
            c13 += i12;
            L8 += i12;
            i10 -= i12;
        }
        int i13 = i10;
        int customBackground = kiVar.w2.h() ? kiVar.w2.getCustomBackground() : kiVar.d1(true);
        ci ciVar4 = kiVar.w2;
        im imVar = kiVar.l2;
        boolean z11 = (ciVar4 == imVar || (ciVar = kiVar.x2) == imVar || (ciVar4 == kiVar.e2 && ciVar == null)) ? false : true;
        RectF rectF = this.h0;
        if (z11) {
            kiVar.s0.setAlpha(alpha3);
            f15 = 24.0f;
            kiVar.s0.setBounds(0, c13, getMeasuredWidth(), i13);
            kiVar.s0.draw(canvas);
            if (j11 == 2) {
                org.telegram.ui.ActionBar.j6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.j6.t0.setAlpha(alpha3);
                rectF.set(kiVar.u0, kiVar.t0 + c13, getMeasuredWidth() - kiVar.u0, org.telegram.messenger.g0.L(24.0f) + kiVar.t0 + c13);
            }
        } else {
            f15 = 24.0f;
        }
        ciVar3.F(((kiVar.t0 + c13) - view.getTop()) - view.getTranslationY(), f14);
        if (view == kiVar.f2 || view == kiVar.n2 || view == kiVar.g2) {
            drawChild = super.drawChild(canvas, view, j3);
        } else {
            canvas.save();
            drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
        }
        if (z11) {
            if (f14 != 1.0f && j11 != 2) {
                org.telegram.ui.ActionBar.j6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.j6.t0.setAlpha(alpha3);
                rectF.set(kiVar.u0, kiVar.t0 + c13, getMeasuredWidth() - kiVar.u0, org.telegram.messenger.g0.L(f15) + kiVar.t0 + c13);
            }
            if ((khVar == null || khVar.getAlpha() != 1.0f) && f14 != f12) {
                int L10 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L10) / 2, L8, (getMeasuredWidth() + L10) / 2, org.telegram.messenger.g0.L(4.0f) + L8);
                if (j11 == 2) {
                    w02 = TLObject.FLAG_29;
                    alpha = f14;
                } else {
                    w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.zj, kiVar.J0);
                    alpha = khVar == null ? 1.0f : 1.0f - khVar.getAlpha();
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.j6.t0.setColor(w02);
                org.telegram.ui.ActionBar.j6.t0.setAlpha((int) (view.getAlpha() * alpha4 * alpha * f14));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.j6.t0);
            }
        }
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wh whVar = this.k0;
        whVar.b = this;
        whVar.c();
        ki kiVar = this.l0;
        kiVar.C2.setAdjustPanLayoutHelper(whVar);
        kiVar.N2.setAdjustPanLayoutHelper(whVar);
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
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
        ki kiVar = this.l0;
        int[] iArr = kiVar.Z3;
        if (kiVar.w2.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y10 = motionEvent.getY();
                ai.k0 k0Var = kiVar.M2;
                int i7 = iArr[0] - (kiVar.t0 * 2);
                int L = org.telegram.messenger.g0.L(13.0f);
                kh khVar = kiVar.g3;
                int L2 = org.telegram.messenger.g0.L(20.0f) + ((i7 - (L + (khVar != null ? org.telegram.messenger.g0.L(khVar.getAlpha() * 26.0f) : 0))) - ((int) (k0Var != null ? k0Var.getAlpha() * k0Var.getMeasuredHeight() : 0.0f)));
                if (!kiVar.b2) {
                    L2 += org.telegram.messenger.g0.m;
                }
                if (y10 < L2 && kiVar.V2.getAlpha() == 0.0f) {
                    kiVar.o0();
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ql qlVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        nh nhVar;
        ph phVar;
        jn jnVar;
        jn jnVar2;
        int i19;
        int max;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        xh xhVar = this;
        ki kiVar = xhVar.l0;
        ai.k0 k0Var = kiVar.M2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.e2;
        int i20 = i11 - i7;
        if (xhVar.g0 != i20) {
            xhVar.g0 = i20;
            ue ueVar = kiVar.c2;
            if (ueVar != null && !ueVar.u0) {
                ueVar.dismiss();
            }
        }
        int childCount = xhVar.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            kiVar.i4.set(i7, i10, i11, i12);
            xhVar.setSystemGestureExclusionRects(kiVar.h4);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.k1 a10 = r0.b0.a(xhVar);
        int i21 = 8;
        int i22 = a10 != null ? a10.a.f(8).d : 0;
        int paddingBottom = xhVar.getPaddingBottom();
        if (!kiVar.d) {
            jn jnVar3 = kiVar.h2;
            if (jnVar3 == null || kiVar.w2 != jnVar3 || jnVar3.F == null) {
                jn jnVar4 = kiVar.i2;
                if (jnVar4 == null || kiVar.w2 != jnVar4 || jnVar4.F == null) {
                    if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        emojiPadding = kiVar.a1().getEmojiPadding();
                        if (emojiPadding > 0) {
                            paddingBottom += emojiPadding;
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                } else {
                    if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        emojiPadding = kiVar.i2.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            } else {
                if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    emojiPadding = kiVar.h2.getEmojiPadding();
                    if (emojiPadding > 0) {
                    }
                }
                emojiPadding = 0;
                if (emojiPadding > 0) {
                }
            }
        }
        xhVar.setBottomClip(paddingBottom);
        int i23 = 0;
        while (i23 < childCount) {
            View childAt = xhVar.getChildAt(i23);
            if (childAt.getVisibility() != i21) {
                int i24 = org.telegram.messenger.g0.m;
                int max2 = i22 == 0 ? Math.max(org.telegram.messenger.g0.n, paddingBottom) : 0;
                if (childAt instanceof ci) {
                    ci ciVar = (ci) childAt;
                    if (ciVar.h) {
                        i24 = 0;
                    }
                    if (ciVar.f) {
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
                int i26 = i25 & org.telegram.messenger.ns.x1;
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
                        if (childAt != kiVar.V2 || childAt == kiVar.t3) {
                            i18 = 0;
                        }
                        nhVar = kiVar.C2;
                        if ((nhVar == null && nhVar.l(childAt)) || (((phVar = kiVar.N2) != null && phVar.l(childAt)) || (((jnVar = kiVar.h2) != null && childAt == jnVar.F) || ((jnVar2 = kiVar.i2) != null && childAt == jnVar2.F)))) {
                            if (org.telegram.messenger.g0.Q1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i22;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i18 = measuredHeight - measuredHeight2;
                        } else if (childAt == kiVar.C4) {
                            if (kiVar.X1) {
                                i19 = org.telegram.messenger.g0.m;
                                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                i18 = i19 + max;
                            }
                        } else if (childAt == kiVar.u3) {
                            i19 = i18 + org.telegram.messenger.g0.n;
                            max = Math.max(i22, ki.L0(kiVar));
                            i18 = i19 + max;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, i18 + measuredHeight3);
                    } else {
                        i16 = ((((i12 - max2) - i10) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt != kiVar.V2) {
                    }
                    i18 = 0;
                    nhVar = kiVar.C2;
                    if (nhVar == null) {
                    }
                    if (childAt == kiVar.C4) {
                    }
                } else {
                    i13 = ((i20 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i14 = kiVar.u0;
                }
                i15 = i13 - i14;
                if (i26 == 16) {
                }
                i18 = i16 - i17;
                if (childAt != kiVar.V2) {
                }
                i18 = 0;
                nhVar = kiVar.C2;
                if (nhVar == null) {
                }
                if (childAt == kiVar.C4) {
                }
            }
            i23++;
            xhVar = this;
            i21 = 8;
        }
        R();
        kiVar.M1(kiVar.w2, 0);
        kiVar.M1(kiVar.x2, 0);
        if (kiVar.X1) {
            kiVar.J1();
        }
        if (chatAttachAlertPhotoLayout == null || (qlVar = chatAttachAlertPhotoLayout.F) == null || qlVar.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.F.getFastScroll().i0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.q1 + (kiVar.X1 ? (int) (k0Var.getAlpha() * k0Var.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.F.getFastScroll().invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        jn jnVar;
        jn jnVar2;
        int L0;
        xh xhVar = this;
        ki kiVar = xhVar.l0;
        boolean z10 = kiVar.b2;
        org.telegram.ui.ActionBar.q0 q0Var = kiVar.Y2;
        int size = xhVar.getLayoutParams().height > 0 ? xhVar.getLayoutParams().height : View.MeasureSpec.getSize(i10);
        if (!z10) {
            xhVar.i0 = true;
            int i12 = kiVar.u0;
            xhVar.setPadding(i12, 0, i12, 0);
            xhVar.i0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i7) - (kiVar.u0 * 2);
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
        ((FrameLayout.LayoutParams) kiVar.d3.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        xhVar.i0 = true;
        int min = (int) (size2 / Math.min(4.5f, kiVar.y3.b()));
        if (kiVar.W3 != min) {
            kiVar.W3 = min;
            org.telegram.messenger.g0.h3(new dg(xhVar, 24));
        }
        xhVar.i0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i7);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        xhVar.setMeasuredDimension(size3, size4);
        int i13 = kiVar.u0;
        ph phVar = kiVar.N2;
        nh nhVar = kiVar.C2;
        int i14 = size3 - (i13 * 2);
        if (!nhVar.O && org.telegram.messenger.g0.L(20.0f) >= 0 && !nhVar.e && !nhVar.P) {
            xhVar.i0 = true;
            nhVar.j();
            xhVar.i0 = false;
        }
        if (!phVar.O && org.telegram.messenger.g0.L(20.0f) >= 0 && !phVar.e && !phVar.P) {
            xhVar.i0 = true;
            phVar.j();
            xhVar.i0 = false;
        }
        if (kiVar.h2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            jn jnVar3 = kiVar.h2;
            if (!jnVar3.H && !jnVar3.b1 && !jnVar3.g1 && !jnVar3.i1) {
                xhVar.i0 = true;
                jnVar3.f0();
                xhVar.i0 = false;
            }
        }
        if (kiVar.i2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            jn jnVar4 = kiVar.i2;
            if (!jnVar4.H && !jnVar4.b1 && !jnVar4.g1 && !jnVar4.i1) {
                xhVar.i0 = true;
                jnVar4.f0();
                xhVar.i0 = false;
            }
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            if (kiVar.d) {
                ci ciVar = kiVar.w2;
                jn jnVar5 = kiVar.h2;
                if (ciVar == jnVar5 && jnVar5.F != null && jnVar5.i1) {
                    L0 = org.telegram.messenger.g0.L(120.0f);
                } else {
                    jn jnVar6 = kiVar.i2;
                    L0 = (ciVar == jnVar6 && jnVar6.F != null && jnVar6.i1) ? org.telegram.messenger.g0.L(120.0f) : 0;
                }
            } else {
                L0 = ki.L0(kiVar);
            }
            WeakHashMap weakHashMap = r0.i0.a;
            r0.k1 a10 = r0.b0.a(xhVar);
            int i15 = a10 != null ? a10.a.f(8).d : 0;
            r0.k1 a11 = r0.b0.a(xhVar);
            Math.max(a11 != null ? a11.a.f(527).d : 0, L0);
            int max = Math.max(i15 > 0 ? 0 : org.telegram.messenger.g0.n, L0);
            xhVar.i0 = true;
            ci ciVar2 = kiVar.w2;
            if (ciVar2.f) {
                ciVar2.e = org.telegram.messenger.g0.L(62.0f) + max;
                kiVar.w2.B(i14, size4);
            } else {
                ciVar2.e = org.telegram.messenger.g0.n;
                ciVar2.B(i14, size4 - L0);
            }
            ci ciVar3 = kiVar.x2;
            if (ciVar3 != null) {
                if (ciVar3.f) {
                    ciVar3.e = org.telegram.messenger.g0.L(62.0f) + max;
                    kiVar.x2.B(i14, size4);
                } else {
                    ciVar3.e = org.telegram.messenger.g0.n;
                    ciVar3.B(i14, size4 - L0);
                }
            }
            xhVar.i0 = false;
        }
        int childCount = xhVar.getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            int i17 = i16;
            View childAt = xhVar.getChildAt(i17);
            if (childAt == null || childAt.getVisibility() == 8) {
                i11 = i17;
            } else if (childAt == kiVar.t3) {
                i11 = i17;
                xhVar.measureChildWithMargins(childAt, i7, 0, makeMeasureSpec, 0);
            } else {
                i11 = i17;
                int i18 = org.telegram.messenger.g0.m;
                int i19 = org.telegram.messenger.g0.n;
                if (childAt instanceof ci) {
                    ci ciVar4 = (ci) childAt;
                    if (ciVar4.h) {
                        i18 = 0;
                    }
                    if (ciVar4.f) {
                        i19 = 0;
                    }
                }
                if (!nhVar.l(childAt) && !phVar.l(childAt) && (((jnVar = kiVar.h2) == null || childAt != jnVar.F) && ((jnVar2 = kiVar.i2) == null || childAt != jnVar2.F))) {
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
            xhVar = this;
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
        ki kiVar = this.l0;
        if (kiVar.w2.o(motionEvent)) {
            return true;
        }
        return !kiVar.J && super.onTouchEvent(motionEvent);
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
        ki kiVar = this.l0;
        kh khVar = kiVar.v3;
        float f11 = f10 + kiVar.j4;
        int i7 = kiVar.B0;
        if (i7 == 0) {
            this.j0 = f11;
        }
        if (i7 == 1) {
            if (f11 < 0.0f) {
                kiVar.w2.setTranslationY(f11);
                if (kiVar.O2 != 0 || kiVar.R2) {
                    kiVar.g3.setTranslationY((kiVar.n3 + f11) - kiVar.j4);
                }
                khVar.setTranslationY(0.0f);
                f11 = 0.0f;
            } else {
                kiVar.w2.setTranslationY(0.0f);
                khVar.setTranslationY(((f11 / this.j0) * khVar.getMeasuredHeight()) + (-f11));
            }
            kiVar.b.invalidate();
        }
        super.setTranslationY((f11 - kiVar.j4) + kiVar.t2);
        if (kiVar.B0 != 1) {
            kiVar.w2.m(kiVar.j4);
        }
    }

    @Override // org.telegram.ui.Components.st0
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
