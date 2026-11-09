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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class qh extends tt0 {
    public int f0;
    public final RectF g0;
    public boolean h0;
    public float i0;
    public final ph j0;
    public final /* synthetic */ di k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(di diVar, Context context) {
        super(context, null);
        this.k0 = diVar;
        this.g0 = new RectF();
        this.j0 = new ph(this, this);
    }

    @Override // org.telegram.ui.Components.tt0, android.view.ViewGroup, android.view.View
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
        vh vhVar;
        canvas.save();
        di diVar = this.k0;
        vh vhVar2 = diVar.s2;
        bm bmVar = diVar.h2;
        if ((vhVar2 == bmVar || (vhVar = diVar.t2) == bmVar || (vhVar2 == diVar.a2 && vhVar == null)) && vhVar2 != null) {
            canvas.save();
            float f15 = diVar.f4;
            boolean z9 = diVar.X1;
            bi.x5 x5Var = diVar.I2;
            dh dhVar = diVar.c3;
            canvas.translate(0.0f, f15);
            int alpha2 = (int) (vhVar2.getAlpha() * 255.0f);
            int j3 = vhVar2.j();
            int L3 = org.telegram.messenger.g0.L(13.0f) + ((int) ((dhVar != null ? dhVar.getAlpha() : 0.0f) * org.telegram.messenger.g0.L(26.0f))) + ((int) (x5Var != null ? x5Var.getAlpha() * x5Var.getMeasuredHeight() : 0.0f));
            int c12 = (diVar.c1(0) - diVar.s0) - L3;
            if (diVar.A0 == 1 || diVar.n3 != null) {
                c12 = (int) (vhVar2.getTranslationY() + c12);
            }
            int L4 = org.telegram.messenger.g0.L(20.0f) + c12;
            getMeasuredHeight();
            org.telegram.messenger.g0.L(45.0f);
            int i7 = diVar.s0;
            if (j3 != 0) {
                i7 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            if (j3 != 2) {
                float f16 = L3;
                f10 = 1.0f;
                if (vhVar2 == diVar.f2) {
                    L = org.telegram.messenger.g0.L(11.0f);
                } else {
                    if (vhVar2 == diVar.d2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else if (vhVar2 == diVar.e2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    f11 = f16 - L2;
                    float alpha3 = diVar.R2.getAlpha();
                    int i10 = (int) (((i7 - f11) + org.telegram.messenger.g0.m) * alpha3);
                    c12 -= i10;
                    L4 -= i10;
                    f12 = 1.0f - alpha3;
                }
                f11 = f16 + L;
                float alpha32 = diVar.R2.getAlpha();
                int i102 = (int) (((i7 - f11) + org.telegram.messenger.g0.m) * alpha32);
                c12 -= i102;
                L4 -= i102;
                f12 = 1.0f - alpha32;
            } else if (c12 < i7) {
                f12 = org.telegram.ui.Cells.f1.v(i7 - c12, diVar.s0, 1.0f, 0.0f);
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
            int customBackground = diVar.s2.h() ? diVar.s2.getCustomBackground() : diVar.d1(true);
            diVar.r0.setAlpha(alpha2);
            diVar.r0.setBounds(0, c12, getMeasuredWidth(), org.telegram.messenger.g0.L(45.0f) + getMeasuredHeight() + diVar.s0);
            diVar.r0.draw(canvas);
            RectF rectF = this.g0;
            if (j3 == 2) {
                org.telegram.ui.ActionBar.l6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.l6.t0.setAlpha(alpha2);
                f13 = 24.0f;
                rectF.set(diVar.t0, diVar.s0 + c12, getMeasuredWidth() - diVar.t0, org.telegram.messenger.g0.L(24.0f) + diVar.s0 + c12);
            } else {
                f13 = 24.0f;
            }
            if ((f12 != f10 && j3 != 2) || diVar.s2.g()) {
                Paint paint = org.telegram.ui.ActionBar.l6.t0;
                if (diVar.s2.g()) {
                    customBackground = diVar.s2.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                org.telegram.ui.ActionBar.l6.t0.setAlpha(alpha2);
                rectF.set(diVar.t0, diVar.s0 + c12, getMeasuredWidth() - diVar.t0, org.telegram.messenger.g0.L(f13) + diVar.s0 + c12);
            }
            if (diVar.s2.g()) {
                org.telegram.ui.ActionBar.l6.t0.setColor(diVar.s2.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.l6.t0.setAlpha(alpha2);
                int c13 = diVar.c1(0);
                if (!z9) {
                    c13 += org.telegram.messenger.g0.m;
                }
                rectF.set(diVar.t0, (org.telegram.messenger.g0.L(12.0f) + diVar.s0 + c12) * f12, getMeasuredWidth() - diVar.t0, org.telegram.messenger.g0.L(12.0f) + c13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.l6.t0);
                canvas.restore();
            }
            if ((dhVar == null || dhVar.getAlpha() != f10) && f12 != 0.0f) {
                int L5 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, L4, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(4.0f) + L4);
                if (j3 == 2) {
                    w02 = TLObject.FLAG_29;
                    f14 = f12;
                } else if (diVar.s2.g()) {
                    int customActionBarBackground = diVar.s2.getCustomActionBarBackground();
                    w02 = i0.a.f(0.5f, customActionBarBackground, i0.a.h(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (dhVar != null) {
                        alpha = dhVar.getAlpha();
                        f14 = f10 - alpha;
                    }
                    f14 = f10;
                } else {
                    w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.wj, diVar.I0);
                    if (dhVar != null) {
                        alpha = dhVar.getAlpha();
                        f14 = f10 - alpha;
                    }
                    f14 = f10;
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.l6.t0.setColor(w02);
                org.telegram.ui.ActionBar.l6.t0.setAlpha((int) (vhVar2.getAlpha() * alpha4 * f14 * f12));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.l6.t0);
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
        vh vhVar;
        di diVar = this.k0;
        boolean z9 = diVar.X1;
        bi.x5 x5Var = diVar.I2;
        fh.g gVar = diVar.u2;
        dh dhVar = diVar.c3;
        r7 r7Var = diVar.R2;
        if (!(view instanceof vh) || view.getAlpha() <= 0.0f) {
            if (view != r7Var) {
                if (!(view instanceof hy) || gVar == null) {
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
            float alpha2 = r7Var.getAlpha();
            if (alpha2 <= 0.0f) {
                return false;
            }
            if (alpha2 >= 1.0f) {
                return super.drawChild(canvas, view, j3);
            }
            canvas.save();
            float x10 = r7Var.getX();
            vh vhVar2 = diVar.s2;
            if (vhVar2 != null) {
                int j10 = vhVar2.j();
                int L5 = org.telegram.messenger.g0.L(13.0f) + ((int) ((dhVar != null ? dhVar.getAlpha() : 0.0f) * org.telegram.messenger.g0.L(26.0f))) + ((int) (x5Var != null ? x5Var.getAlpha() * x5Var.getMeasuredHeight() : 0.0f));
                int c12 = (diVar.c1(0) - diVar.s0) - L5;
                if (diVar.A0 == 1 || diVar.n3 != null) {
                    c12 = (int) (vhVar2.getTranslationY() + c12);
                }
                int L6 = org.telegram.messenger.g0.L(20.0f) + c12;
                int currentActionBarHeight = j10 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : diVar.s0;
                if (j10 != 2 && c12 + diVar.s0 < currentActionBarHeight) {
                    float f16 = L5;
                    if (vhVar2 == diVar.f2) {
                        L = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        if (vhVar2 == diVar.d2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else if (vhVar2 == diVar.e2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        f11 = f16 - L2;
                        L6 -= (int) (r7Var.getAlpha() * ((currentActionBarHeight - f11) + org.telegram.messenger.g0.m));
                    }
                    f11 = f16 + L;
                    L6 -= (int) (r7Var.getAlpha() * ((currentActionBarHeight - f11) + org.telegram.messenger.g0.m));
                }
                if (!z9) {
                    L6 += org.telegram.messenger.g0.m;
                }
                f10 = L6;
            } else {
                f10 = 0.0f;
            }
            canvas.clipRect(x10, f10, r7Var.getX() + r7Var.getWidth(), r7Var.getY() + r7Var.getHeight());
            boolean drawChild3 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild3;
        }
        canvas.save();
        canvas.translate(0.0f, diVar.f4);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        vh vhVar3 = (vh) view;
        int j11 = vhVar3.j();
        int L7 = org.telegram.messenger.g0.L(13.0f) + (dhVar != null ? org.telegram.messenger.g0.L(dhVar.getAlpha() * 26.0f) : 0) + ((int) (x5Var != null ? x5Var.getAlpha() * x5Var.getMeasuredHeight() : 0.0f));
        int c13 = (diVar.c1(vhVar3 == diVar.s2 ? 0 : 1) - diVar.s0) - L7;
        if (diVar.A0 == 1 || diVar.n3 != null) {
            c13 = (int) (view.getTranslationY() + c13);
        }
        int L8 = org.telegram.messenger.g0.L(20.0f) + c13;
        int L9 = org.telegram.messenger.g0.L(45.0f) + getMeasuredHeight();
        int i7 = diVar.s0;
        int i10 = L9 + i7;
        if (j11 != 0) {
            i7 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (j11 != 2) {
            f12 = 0.0f;
            if (diVar.s0 + c13 < i7) {
                float f17 = L7;
                if (vhVar3 == diVar.f2) {
                    L3 = org.telegram.messenger.g0.L(11.0f);
                } else {
                    if (vhVar3 == diVar.d2) {
                        L4 = org.telegram.messenger.g0.L(3.0f);
                    } else if (vhVar3 == diVar.e2) {
                        L4 = org.telegram.messenger.g0.L(3.0f);
                    } else {
                        L3 = org.telegram.messenger.g0.L(4.0f);
                    }
                    f13 = f17 - L4;
                    float min = Math.min(1.0f, ((i7 - c13) - diVar.s0) / f13);
                    int i11 = (int) ((i7 - f13) * min);
                    c13 -= i11;
                    L8 -= i11;
                    i10 += i11;
                    f14 = 1.0f - min;
                }
                f13 = f17 + L3;
                float min2 = Math.min(1.0f, ((i7 - c13) - diVar.s0) / f13);
                int i112 = (int) ((i7 - f13) * min2);
                c13 -= i112;
                L8 -= i112;
                i10 += i112;
                f14 = 1.0f - min2;
            }
            f14 = 1.0f;
        } else if (c13 < i7) {
            f14 = org.telegram.ui.Cells.f1.v(i7 - c13, diVar.s0, 1.0f, 0.0f);
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
        int customBackground = diVar.s2.h() ? diVar.s2.getCustomBackground() : diVar.d1(true);
        vh vhVar4 = diVar.s2;
        bm bmVar = diVar.h2;
        boolean z10 = (vhVar4 == bmVar || (vhVar = diVar.t2) == bmVar || (vhVar4 == diVar.a2 && vhVar == null)) ? false : true;
        RectF rectF = this.g0;
        if (z10) {
            diVar.r0.setAlpha(alpha3);
            f15 = 24.0f;
            diVar.r0.setBounds(0, c13, getMeasuredWidth(), i13);
            diVar.r0.draw(canvas);
            if (j11 == 2) {
                org.telegram.ui.ActionBar.l6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.l6.t0.setAlpha(alpha3);
                rectF.set(diVar.t0, diVar.s0 + c13, getMeasuredWidth() - diVar.t0, org.telegram.messenger.g0.L(24.0f) + diVar.s0 + c13);
            }
        } else {
            f15 = 24.0f;
        }
        vhVar3.E(((diVar.s0 + c13) - view.getTop()) - view.getTranslationY(), f14);
        if (view == diVar.b2 || view == diVar.j2 || view == diVar.c2) {
            drawChild = super.drawChild(canvas, view, j3);
        } else {
            canvas.save();
            drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
        }
        if (z10) {
            if (f14 != 1.0f && j11 != 2) {
                org.telegram.ui.ActionBar.l6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.l6.t0.setAlpha(alpha3);
                rectF.set(diVar.t0, diVar.s0 + c13, getMeasuredWidth() - diVar.t0, org.telegram.messenger.g0.L(f15) + diVar.s0 + c13);
            }
            if ((dhVar == null || dhVar.getAlpha() != 1.0f) && f14 != f12) {
                int L10 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L10) / 2, L8, (getMeasuredWidth() + L10) / 2, org.telegram.messenger.g0.L(4.0f) + L8);
                if (j11 == 2) {
                    w02 = TLObject.FLAG_29;
                    alpha = f14;
                } else {
                    w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.wj, diVar.I0);
                    alpha = dhVar == null ? 1.0f : 1.0f - dhVar.getAlpha();
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.l6.t0.setColor(w02);
                org.telegram.ui.ActionBar.l6.t0.setAlpha((int) (view.getAlpha() * alpha4 * alpha * f14));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.l6.t0);
            }
        }
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.tt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ph phVar = this.j0;
        phVar.b = this;
        phVar.c();
        di diVar = this.k0;
        diVar.y2.setAdjustPanLayoutHelper(phVar);
        diVar.J2.setAdjustPanLayoutHelper(phVar);
    }

    @Override // org.telegram.ui.Components.tt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j0.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z9 = this.k0.X1;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        di diVar = this.k0;
        int[] iArr = diVar.V3;
        if (diVar.s2.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y10 = motionEvent.getY();
                bi.x5 x5Var = diVar.I2;
                int i7 = iArr[0] - (diVar.s0 * 2);
                int L = org.telegram.messenger.g0.L(13.0f);
                dh dhVar = diVar.c3;
                int L2 = org.telegram.messenger.g0.L(20.0f) + ((i7 - (L + (dhVar != null ? org.telegram.messenger.g0.L(dhVar.getAlpha() * 26.0f) : 0))) - ((int) (x5Var != null ? x5Var.getAlpha() * x5Var.getMeasuredHeight() : 0.0f)));
                if (!diVar.X1) {
                    L2 += org.telegram.messenger.g0.m;
                }
                if (y10 < L2 && diVar.R2.getAlpha() == 0.0f) {
                    diVar.o0();
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
    @Override // org.telegram.ui.Components.tt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        jl jlVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        gh ghVar;
        ih ihVar;
        bn bnVar;
        bn bnVar2;
        int i19;
        int max;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        qh qhVar = this;
        di diVar = qhVar.k0;
        bi.x5 x5Var = diVar.I2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar.a2;
        int i20 = i11 - i7;
        if (qhVar.f0 != i20) {
            qhVar.f0 = i20;
            ue ueVar = diVar.Y1;
            if (ueVar != null && !ueVar.p0) {
                ueVar.dismiss();
            }
        }
        int childCount = qhVar.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            diVar.e4.set(i7, i10, i11, i12);
            qhVar.setSystemGestureExclusionRects(diVar.d4);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.k1 a10 = r0.b0.a(qhVar);
        int i21 = 8;
        int i22 = a10 != null ? a10.a.f(8).d : 0;
        int paddingBottom = qhVar.getPaddingBottom();
        if (!diVar.d) {
            bn bnVar3 = diVar.d2;
            if (bnVar3 == null || diVar.s2 != bnVar3 || bnVar3.E == null) {
                bn bnVar4 = diVar.e2;
                if (bnVar4 == null || diVar.s2 != bnVar4 || bnVar4.E == null) {
                    if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        emojiPadding = diVar.a1().getEmojiPadding();
                        if (emojiPadding > 0) {
                            paddingBottom += emojiPadding;
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                } else {
                    if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        emojiPadding = diVar.e2.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            } else {
                if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    emojiPadding = diVar.d2.getEmojiPadding();
                    if (emojiPadding > 0) {
                    }
                }
                emojiPadding = 0;
                if (emojiPadding > 0) {
                }
            }
        }
        qhVar.setBottomClip(paddingBottom);
        int i23 = 0;
        while (i23 < childCount) {
            View childAt = qhVar.getChildAt(i23);
            if (childAt.getVisibility() != i21) {
                int i24 = org.telegram.messenger.g0.m;
                int max2 = i22 == 0 ? Math.max(org.telegram.messenger.g0.n, paddingBottom) : 0;
                if (childAt instanceof vh) {
                    vh vhVar = (vh) childAt;
                    if (vhVar.h) {
                        i24 = 0;
                    }
                    if (vhVar.f) {
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
                        if (childAt != diVar.R2 || childAt == diVar.p3) {
                            i18 = 0;
                        }
                        ghVar = diVar.y2;
                        if ((ghVar == null && ghVar.l(childAt)) || (((ihVar = diVar.J2) != null && ihVar.l(childAt)) || (((bnVar = diVar.d2) != null && childAt == bnVar.E) || ((bnVar2 = diVar.e2) != null && childAt == bnVar2.E)))) {
                            if (org.telegram.messenger.g0.Q1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i22;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i18 = measuredHeight - measuredHeight2;
                        } else if (childAt == diVar.y4) {
                            if (diVar.T1) {
                                i19 = org.telegram.messenger.g0.m;
                                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                i18 = i19 + max;
                            }
                        } else if (childAt == diVar.q3) {
                            i19 = i18 + org.telegram.messenger.g0.n;
                            max = Math.max(i22, di.L0(diVar));
                            i18 = i19 + max;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, i18 + measuredHeight3);
                    } else {
                        i16 = ((((i12 - max2) - i10) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt != diVar.R2) {
                    }
                    i18 = 0;
                    ghVar = diVar.y2;
                    if (ghVar == null) {
                    }
                    if (childAt == diVar.y4) {
                    }
                } else {
                    i13 = ((i20 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i14 = diVar.t0;
                }
                i15 = i13 - i14;
                if (i26 == 16) {
                }
                i18 = i16 - i17;
                if (childAt != diVar.R2) {
                }
                i18 = 0;
                ghVar = diVar.y2;
                if (ghVar == null) {
                }
                if (childAt == diVar.y4) {
                }
            }
            i23++;
            qhVar = this;
            i21 = 8;
        }
        R();
        diVar.M1(diVar.s2, 0);
        diVar.M1(diVar.t2, 0);
        if (diVar.T1) {
            diVar.J1();
        }
        if (chatAttachAlertPhotoLayout == null || (jlVar = chatAttachAlertPhotoLayout.E) == null || jlVar.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.E.getFastScroll().h0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.p1 + (diVar.T1 ? (int) (x5Var.getAlpha() * x5Var.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.E.getFastScroll().invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        bn bnVar;
        bn bnVar2;
        int L0;
        qh qhVar = this;
        di diVar = qhVar.k0;
        boolean z9 = diVar.X1;
        org.telegram.ui.ActionBar.r0 r0Var = diVar.U2;
        int size = qhVar.getLayoutParams().height > 0 ? qhVar.getLayoutParams().height : View.MeasureSpec.getSize(i10);
        if (!z9) {
            qhVar.h0 = true;
            int i12 = diVar.t0;
            qhVar.setPadding(i12, 0, i12, 0);
            qhVar.h0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i7) - (diVar.t0 * 2);
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
        ((FrameLayout.LayoutParams) diVar.Z2.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        qhVar.h0 = true;
        int min = (int) (size2 / Math.min(4.5f, diVar.u3.b()));
        if (diVar.S3 != min) {
            diVar.S3 = min;
            org.telegram.messenger.g0.h3(new xf(qhVar, 22));
        }
        qhVar.h0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i7);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        qhVar.setMeasuredDimension(size3, size4);
        int i13 = diVar.t0;
        ih ihVar = diVar.J2;
        gh ghVar = diVar.y2;
        int i14 = size3 - (i13 * 2);
        if (!ghVar.N && org.telegram.messenger.g0.L(20.0f) >= 0 && !ghVar.e && !ghVar.O) {
            qhVar.h0 = true;
            ghVar.j();
            qhVar.h0 = false;
        }
        if (!ihVar.N && org.telegram.messenger.g0.L(20.0f) >= 0 && !ihVar.e && !ihVar.O) {
            qhVar.h0 = true;
            ihVar.j();
            qhVar.h0 = false;
        }
        if (diVar.d2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            bn bnVar3 = diVar.d2;
            if (!bnVar3.G && !bnVar3.a1 && !bnVar3.f1 && !bnVar3.h1) {
                qhVar.h0 = true;
                bnVar3.f0();
                qhVar.h0 = false;
            }
        }
        if (diVar.e2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            bn bnVar4 = diVar.e2;
            if (!bnVar4.G && !bnVar4.a1 && !bnVar4.f1 && !bnVar4.h1) {
                qhVar.h0 = true;
                bnVar4.f0();
                qhVar.h0 = false;
            }
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            if (diVar.d) {
                vh vhVar = diVar.s2;
                bn bnVar5 = diVar.d2;
                if (vhVar == bnVar5 && bnVar5.E != null && bnVar5.h1) {
                    L0 = org.telegram.messenger.g0.L(120.0f);
                } else {
                    bn bnVar6 = diVar.e2;
                    L0 = (vhVar == bnVar6 && bnVar6.E != null && bnVar6.h1) ? org.telegram.messenger.g0.L(120.0f) : 0;
                }
            } else {
                L0 = di.L0(diVar);
            }
            WeakHashMap weakHashMap = r0.i0.a;
            r0.k1 a10 = r0.b0.a(qhVar);
            int i15 = a10 != null ? a10.a.f(8).d : 0;
            r0.k1 a11 = r0.b0.a(qhVar);
            Math.max(a11 != null ? a11.a.f(527).d : 0, L0);
            int max = Math.max(i15 > 0 ? 0 : org.telegram.messenger.g0.n, L0);
            qhVar.h0 = true;
            vh vhVar2 = diVar.s2;
            if (vhVar2.f) {
                vhVar2.e = org.telegram.messenger.g0.L(62.0f) + max;
                diVar.s2.B(i14, size4);
            } else {
                vhVar2.e = org.telegram.messenger.g0.n;
                vhVar2.B(i14, size4 - L0);
            }
            vh vhVar3 = diVar.t2;
            if (vhVar3 != null) {
                if (vhVar3.f) {
                    vhVar3.e = org.telegram.messenger.g0.L(62.0f) + max;
                    diVar.t2.B(i14, size4);
                } else {
                    vhVar3.e = org.telegram.messenger.g0.n;
                    vhVar3.B(i14, size4 - L0);
                }
            }
            qhVar.h0 = false;
        }
        int childCount = qhVar.getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            int i17 = i16;
            View childAt = qhVar.getChildAt(i17);
            if (childAt == null || childAt.getVisibility() == 8) {
                i11 = i17;
            } else if (childAt == diVar.p3) {
                i11 = i17;
                qhVar.measureChildWithMargins(childAt, i7, 0, makeMeasureSpec, 0);
            } else {
                i11 = i17;
                int i18 = org.telegram.messenger.g0.m;
                int i19 = org.telegram.messenger.g0.n;
                if (childAt instanceof vh) {
                    vh vhVar4 = (vh) childAt;
                    if (vhVar4.h) {
                        i18 = 0;
                    }
                    if (vhVar4.f) {
                        i19 = 0;
                    }
                }
                if (!ghVar.l(childAt) && !ihVar.l(childAt) && (((bnVar = diVar.d2) == null || childAt != bnVar.E) && ((bnVar2 = diVar.e2) == null || childAt != bnVar2.E))) {
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
            qhVar = this;
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
        fh.g gVar = this.k0.u2;
        if (gVar != null) {
            gVar.t(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), i14, i13, true);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        di diVar = this.k0;
        if (diVar.s2.o(motionEvent)) {
            return true;
        }
        return !diVar.I && super.onTouchEvent(motionEvent);
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
        di diVar = this.k0;
        dh dhVar = diVar.r3;
        float f11 = f10 + diVar.f4;
        int i7 = diVar.A0;
        if (i7 == 0) {
            this.i0 = f11;
        }
        if (i7 == 1) {
            if (f11 < 0.0f) {
                diVar.s2.setTranslationY(f11);
                if (diVar.K2 != 0 || diVar.N2) {
                    diVar.c3.setTranslationY((diVar.j3 + f11) - diVar.f4);
                }
                dhVar.setTranslationY(0.0f);
                f11 = 0.0f;
            } else {
                diVar.s2.setTranslationY(0.0f);
                dhVar.setTranslationY(((f11 / this.i0) * dhVar.getMeasuredHeight()) + (-f11));
            }
            diVar.b.invalidate();
        }
        super.setTranslationY((f11 - diVar.f4) + diVar.p2);
        if (diVar.A0 != 1) {
            diVar.s2.m(diVar.f4);
        }
    }

    @Override // org.telegram.ui.Components.tt0
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z9) {
    }
}
