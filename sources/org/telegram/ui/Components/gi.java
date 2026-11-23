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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gi extends cu0 {
    public int g0;
    public final RectF h0;
    public boolean i0;
    public float j0;
    public final fi k0;
    public final /* synthetic */ ti l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(ti tiVar, Context context) {
        super(context, null);
        this.l0 = tiVar;
        this.h0 = new RectF();
        this.k0 = new fi(this, this);
    }

    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
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
        li liVar;
        canvas.save();
        ti tiVar = this.l0;
        li liVar2 = tiVar.w2;
        pm pmVar = tiVar.l2;
        if ((liVar2 == pmVar || (liVar = tiVar.x2) == pmVar || (liVar2 == tiVar.e2 && liVar == null)) && liVar2 != null) {
            canvas.save();
            float f15 = tiVar.j4;
            boolean z10 = tiVar.b2;
            ai.h0 h0Var = tiVar.M2;
            th thVar = tiVar.g3;
            canvas.translate(0.0f, f15);
            int alpha2 = (int) (liVar2.getAlpha() * 255.0f);
            int j3 = liVar2.j();
            int L3 = org.telegram.messenger.g0.L(13.0f) + ((int) ((thVar != null ? thVar.getAlpha() : 0.0f) * org.telegram.messenger.g0.L(26.0f))) + ((int) (h0Var != null ? h0Var.getAlpha() * h0Var.getMeasuredHeight() : 0.0f));
            int d12 = (tiVar.d1(0) - tiVar.t0) - L3;
            if (tiVar.B0 == 1 || tiVar.r3 != null) {
                d12 = (int) (liVar2.getTranslationY() + d12);
            }
            int L4 = org.telegram.messenger.g0.L(20.0f) + d12;
            getMeasuredHeight();
            org.telegram.messenger.g0.L(45.0f);
            int i7 = tiVar.t0;
            if (j3 != 0) {
                i7 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            if (j3 != 2) {
                float f16 = L3;
                f10 = 1.0f;
                if (liVar2 == tiVar.j2) {
                    L = org.telegram.messenger.g0.L(11.0f);
                } else {
                    if (liVar2 == tiVar.h2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else if (liVar2 == tiVar.i2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    f11 = f16 - L2;
                    float alpha3 = tiVar.V2.getAlpha();
                    int i10 = (int) (((i7 - f11) + org.telegram.messenger.g0.m) * alpha3);
                    d12 -= i10;
                    L4 -= i10;
                    f12 = 1.0f - alpha3;
                }
                f11 = f16 + L;
                float alpha32 = tiVar.V2.getAlpha();
                int i102 = (int) (((i7 - f11) + org.telegram.messenger.g0.m) * alpha32);
                d12 -= i102;
                L4 -= i102;
                f12 = 1.0f - alpha32;
            } else if (d12 < i7) {
                f12 = org.telegram.ui.Cells.c0.B(i7 - d12, tiVar.t0, 1.0f, 0.0f);
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
            int customBackground = tiVar.w2.h() ? tiVar.w2.getCustomBackground() : tiVar.e1(true);
            tiVar.s0.setAlpha(alpha2);
            tiVar.s0.setBounds(0, d12, getMeasuredWidth(), org.telegram.messenger.g0.L(45.0f) + getMeasuredHeight() + tiVar.t0);
            tiVar.s0.draw(canvas);
            RectF rectF = this.h0;
            if (j3 == 2) {
                org.telegram.ui.ActionBar.n6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.n6.t0.setAlpha(alpha2);
                f13 = 24.0f;
                rectF.set(tiVar.u0, tiVar.t0 + d12, getMeasuredWidth() - tiVar.u0, org.telegram.messenger.g0.L(24.0f) + tiVar.t0 + d12);
            } else {
                f13 = 24.0f;
            }
            if ((f12 != f10 && j3 != 2) || tiVar.w2.g()) {
                Paint paint = org.telegram.ui.ActionBar.n6.t0;
                if (tiVar.w2.g()) {
                    customBackground = tiVar.w2.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                org.telegram.ui.ActionBar.n6.t0.setAlpha(alpha2);
                rectF.set(tiVar.u0, tiVar.t0 + d12, getMeasuredWidth() - tiVar.u0, org.telegram.messenger.g0.L(f13) + tiVar.t0 + d12);
            }
            if (tiVar.w2.g()) {
                org.telegram.ui.ActionBar.n6.t0.setColor(tiVar.w2.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.n6.t0.setAlpha(alpha2);
                int d13 = tiVar.d1(0);
                if (!z10) {
                    d13 += org.telegram.messenger.g0.m;
                }
                rectF.set(tiVar.u0, (org.telegram.messenger.g0.L(12.0f) + tiVar.t0 + d12) * f12, getMeasuredWidth() - tiVar.u0, org.telegram.messenger.g0.L(12.0f) + d13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.n6.t0);
                canvas.restore();
            }
            if ((thVar == null || thVar.getAlpha() != f10) && f12 != 0.0f) {
                int L5 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, L4, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(4.0f) + L4);
                if (j3 == 2) {
                    w02 = TLObject.FLAG_29;
                    f14 = f12;
                } else if (tiVar.w2.g()) {
                    int customActionBarBackground = tiVar.w2.getCustomActionBarBackground();
                    w02 = i0.a.f(0.5f, customActionBarBackground, i0.a.h(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (thVar != null) {
                        alpha = thVar.getAlpha();
                        f14 = f10 - alpha;
                    }
                    f14 = f10;
                } else {
                    w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, tiVar.J0);
                    if (thVar != null) {
                        alpha = thVar.getAlpha();
                        f14 = f10 - alpha;
                    }
                    f14 = f10;
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.n6.t0.setColor(w02);
                org.telegram.ui.ActionBar.n6.t0.setAlpha((int) (liVar2.getAlpha() * alpha4 * f14 * f12));
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
        li liVar;
        ti tiVar = this.l0;
        boolean z10 = tiVar.b2;
        ai.h0 h0Var = tiVar.M2;
        fh.g gVar = tiVar.y2;
        th thVar = tiVar.g3;
        u7 u7Var = tiVar.V2;
        if (!(view instanceof li) || view.getAlpha() <= 0.0f) {
            if (view != u7Var) {
                if (!(view instanceof qy) || gVar == null) {
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
            float alpha2 = u7Var.getAlpha();
            if (alpha2 <= 0.0f) {
                return false;
            }
            if (alpha2 >= 1.0f) {
                return super.drawChild(canvas, view, j3);
            }
            canvas.save();
            float x10 = u7Var.getX();
            li liVar2 = tiVar.w2;
            if (liVar2 != null) {
                int j10 = liVar2.j();
                int L5 = org.telegram.messenger.g0.L(13.0f) + ((int) ((thVar != null ? thVar.getAlpha() : 0.0f) * org.telegram.messenger.g0.L(26.0f))) + ((int) (h0Var != null ? h0Var.getAlpha() * h0Var.getMeasuredHeight() : 0.0f));
                int d12 = (tiVar.d1(0) - tiVar.t0) - L5;
                if (tiVar.B0 == 1 || tiVar.r3 != null) {
                    d12 = (int) (liVar2.getTranslationY() + d12);
                }
                int L6 = org.telegram.messenger.g0.L(20.0f) + d12;
                int currentActionBarHeight = j10 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : tiVar.t0;
                if (j10 != 2 && d12 + tiVar.t0 < currentActionBarHeight) {
                    float f16 = L5;
                    if (liVar2 == tiVar.j2) {
                        L = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        if (liVar2 == tiVar.h2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else if (liVar2 == tiVar.i2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        f11 = f16 - L2;
                        L6 -= (int) (u7Var.getAlpha() * ((currentActionBarHeight - f11) + org.telegram.messenger.g0.m));
                    }
                    f11 = f16 + L;
                    L6 -= (int) (u7Var.getAlpha() * ((currentActionBarHeight - f11) + org.telegram.messenger.g0.m));
                }
                if (!z10) {
                    L6 += org.telegram.messenger.g0.m;
                }
                f10 = L6;
            } else {
                f10 = 0.0f;
            }
            canvas.clipRect(x10, f10, u7Var.getX() + u7Var.getWidth(), u7Var.getY() + u7Var.getHeight());
            boolean drawChild3 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild3;
        }
        canvas.save();
        canvas.translate(0.0f, tiVar.j4);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        li liVar3 = (li) view;
        int j11 = liVar3.j();
        int L7 = org.telegram.messenger.g0.L(13.0f) + (thVar != null ? org.telegram.messenger.g0.L(thVar.getAlpha() * 26.0f) : 0) + ((int) (h0Var != null ? h0Var.getAlpha() * h0Var.getMeasuredHeight() : 0.0f));
        int d13 = (tiVar.d1(liVar3 == tiVar.w2 ? 0 : 1) - tiVar.t0) - L7;
        if (tiVar.B0 == 1 || tiVar.r3 != null) {
            d13 = (int) (view.getTranslationY() + d13);
        }
        int L8 = org.telegram.messenger.g0.L(20.0f) + d13;
        int L9 = org.telegram.messenger.g0.L(45.0f) + getMeasuredHeight();
        int i7 = tiVar.t0;
        int i10 = L9 + i7;
        if (j11 != 0) {
            i7 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (j11 != 2) {
            f12 = 0.0f;
            if (tiVar.t0 + d13 < i7) {
                float f17 = L7;
                if (liVar3 == tiVar.j2) {
                    L3 = org.telegram.messenger.g0.L(11.0f);
                } else {
                    if (liVar3 == tiVar.h2) {
                        L4 = org.telegram.messenger.g0.L(3.0f);
                    } else if (liVar3 == tiVar.i2) {
                        L4 = org.telegram.messenger.g0.L(3.0f);
                    } else {
                        L3 = org.telegram.messenger.g0.L(4.0f);
                    }
                    f13 = f17 - L4;
                    float min = Math.min(1.0f, ((i7 - d13) - tiVar.t0) / f13);
                    int i11 = (int) ((i7 - f13) * min);
                    d13 -= i11;
                    L8 -= i11;
                    i10 += i11;
                    f14 = 1.0f - min;
                }
                f13 = f17 + L3;
                float min2 = Math.min(1.0f, ((i7 - d13) - tiVar.t0) / f13);
                int i112 = (int) ((i7 - f13) * min2);
                d13 -= i112;
                L8 -= i112;
                i10 += i112;
                f14 = 1.0f - min2;
            }
            f14 = 1.0f;
        } else if (d13 < i7) {
            f14 = org.telegram.ui.Cells.c0.B(i7 - d13, tiVar.t0, 1.0f, 0.0f);
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
        int customBackground = tiVar.w2.h() ? tiVar.w2.getCustomBackground() : tiVar.e1(true);
        li liVar4 = tiVar.w2;
        pm pmVar = tiVar.l2;
        boolean z11 = (liVar4 == pmVar || (liVar = tiVar.x2) == pmVar || (liVar4 == tiVar.e2 && liVar == null)) ? false : true;
        RectF rectF = this.h0;
        if (z11) {
            tiVar.s0.setAlpha(alpha3);
            f15 = 24.0f;
            tiVar.s0.setBounds(0, d13, getMeasuredWidth(), i13);
            tiVar.s0.draw(canvas);
            if (j11 == 2) {
                org.telegram.ui.ActionBar.n6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.n6.t0.setAlpha(alpha3);
                rectF.set(tiVar.u0, tiVar.t0 + d13, getMeasuredWidth() - tiVar.u0, org.telegram.messenger.g0.L(24.0f) + tiVar.t0 + d13);
            }
        } else {
            f15 = 24.0f;
        }
        liVar3.E(((tiVar.t0 + d13) - view.getTop()) - view.getTranslationY(), f14);
        if (view == tiVar.f2 || view == tiVar.n2 || view == tiVar.g2) {
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
                rectF.set(tiVar.u0, tiVar.t0 + d13, getMeasuredWidth() - tiVar.u0, org.telegram.messenger.g0.L(f15) + tiVar.t0 + d13);
            }
            if ((thVar == null || thVar.getAlpha() != 1.0f) && f14 != f12) {
                int L10 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L10) / 2, L8, (getMeasuredWidth() + L10) / 2, org.telegram.messenger.g0.L(4.0f) + L8);
                if (j11 == 2) {
                    w02 = TLObject.FLAG_29;
                    alpha = f14;
                } else {
                    w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, tiVar.J0);
                    alpha = thVar == null ? 1.0f : 1.0f - thVar.getAlpha();
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

    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fi fiVar = this.k0;
        fiVar.b = this;
        fiVar.c();
        ti tiVar = this.l0;
        tiVar.C2.setAdjustPanLayoutHelper(fiVar);
        tiVar.N2.setAdjustPanLayoutHelper(fiVar);
    }

    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
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
        ti tiVar = this.l0;
        int[] iArr = tiVar.Z3;
        if (tiVar.w2.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y10 = motionEvent.getY();
                ai.h0 h0Var = tiVar.M2;
                int i7 = iArr[0] - (tiVar.t0 * 2);
                int L = org.telegram.messenger.g0.L(13.0f);
                th thVar = tiVar.g3;
                int L2 = org.telegram.messenger.g0.L(20.0f) + ((i7 - (L + (thVar != null ? org.telegram.messenger.g0.L(thVar.getAlpha() * 26.0f) : 0))) - ((int) (h0Var != null ? h0Var.getAlpha() * h0Var.getMeasuredHeight() : 0.0f)));
                if (!tiVar.b2) {
                    L2 += org.telegram.messenger.g0.m;
                }
                if (y10 < L2 && tiVar.V2.getAlpha() == 0.0f) {
                    tiVar.o0();
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
    @Override // org.telegram.ui.Components.cu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        wh whVar;
        yh yhVar;
        qn qnVar;
        qn qnVar2;
        int i19;
        int max;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        gi giVar = this;
        ti tiVar = giVar.l0;
        ai.h0 h0Var = tiVar.M2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.e2;
        int i20 = i11 - i7;
        if (giVar.g0 != i20) {
            giVar.g0 = i20;
            ef efVar = tiVar.c2;
            if (efVar != null && !efVar.u0) {
                efVar.dismiss();
            }
        }
        int childCount = giVar.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            tiVar.i4.set(i7, i10, i11, i12);
            giVar.setSystemGestureExclusionRects(tiVar.h4);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.l1 a10 = r0.b0.a(giVar);
        int i21 = 8;
        int i22 = a10 != null ? a10.a.f(8).d : 0;
        int paddingBottom = giVar.getPaddingBottom();
        if (!tiVar.d) {
            qn qnVar3 = tiVar.h2;
            if (qnVar3 == null || tiVar.w2 != qnVar3 || qnVar3.F == null) {
                qn qnVar4 = tiVar.i2;
                if (qnVar4 == null || tiVar.w2 != qnVar4 || qnVar4.F == null) {
                    if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        emojiPadding = tiVar.b1().getEmojiPadding();
                        if (emojiPadding > 0) {
                            paddingBottom += emojiPadding;
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                } else {
                    if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        emojiPadding = tiVar.i2.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            } else {
                if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    emojiPadding = tiVar.h2.getEmojiPadding();
                    if (emojiPadding > 0) {
                    }
                }
                emojiPadding = 0;
                if (emojiPadding > 0) {
                }
            }
        }
        giVar.setBottomClip(paddingBottom);
        int i23 = 0;
        while (i23 < childCount) {
            View childAt = giVar.getChildAt(i23);
            if (childAt.getVisibility() != i21) {
                int i24 = org.telegram.messenger.g0.m;
                int max2 = i22 == 0 ? Math.max(org.telegram.messenger.g0.n, paddingBottom) : 0;
                if (childAt instanceof li) {
                    li liVar = (li) childAt;
                    if (liVar.h) {
                        i24 = 0;
                    }
                    if (liVar.f) {
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
                        if (childAt != tiVar.V2 || childAt == tiVar.t3) {
                            i18 = 0;
                        }
                        whVar = tiVar.C2;
                        if ((whVar == null && whVar.l(childAt)) || (((yhVar = tiVar.N2) != null && yhVar.l(childAt)) || (((qnVar = tiVar.h2) != null && childAt == qnVar.F) || ((qnVar2 = tiVar.i2) != null && childAt == qnVar2.F)))) {
                            if (org.telegram.messenger.g0.Q1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i22;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i18 = measuredHeight - measuredHeight2;
                        } else if (childAt == tiVar.C4) {
                            if (tiVar.X1) {
                                i19 = org.telegram.messenger.g0.m;
                                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                i18 = i19 + max;
                            }
                        } else if (childAt == tiVar.u3) {
                            i19 = i18 + org.telegram.messenger.g0.n;
                            max = Math.max(i22, ti.M0(tiVar));
                            i18 = i19 + max;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, i18 + measuredHeight3);
                    } else {
                        i16 = ((((i12 - max2) - i10) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt != tiVar.V2) {
                    }
                    i18 = 0;
                    whVar = tiVar.C2;
                    if (whVar == null) {
                    }
                    if (childAt == tiVar.C4) {
                    }
                } else {
                    i13 = ((i20 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i14 = tiVar.u0;
                }
                i15 = i13 - i14;
                if (i26 == 16) {
                }
                i18 = i16 - i17;
                if (childAt != tiVar.V2) {
                }
                i18 = 0;
                whVar = tiVar.C2;
                if (whVar == null) {
                }
                if (childAt == tiVar.C4) {
                }
            }
            i23++;
            giVar = this;
            i21 = 8;
        }
        R();
        tiVar.N1(tiVar.w2, 0);
        tiVar.N1(tiVar.x2, 0);
        if (tiVar.X1) {
            tiVar.K1();
        }
        if (chatAttachAlertPhotoLayout == null || (xlVar = chatAttachAlertPhotoLayout.F) == null || xlVar.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.F.getFastScroll().i0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.q1 + (tiVar.X1 ? (int) (h0Var.getAlpha() * h0Var.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.F.getFastScroll().invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        qn qnVar;
        qn qnVar2;
        int M0;
        gi giVar = this;
        ti tiVar = giVar.l0;
        boolean z10 = tiVar.b2;
        org.telegram.ui.ActionBar.q0 q0Var = tiVar.Y2;
        int size = giVar.getLayoutParams().height > 0 ? giVar.getLayoutParams().height : View.MeasureSpec.getSize(i10);
        if (!z10) {
            giVar.i0 = true;
            int i12 = tiVar.u0;
            giVar.setPadding(i12, 0, i12, 0);
            giVar.i0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i7) - (tiVar.u0 * 2);
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
        ((FrameLayout.LayoutParams) tiVar.d3.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        giVar.i0 = true;
        int min = (int) (size2 / Math.min(4.5f, tiVar.y3.b()));
        if (tiVar.W3 != min) {
            tiVar.W3 = min;
            org.telegram.messenger.g0.g3(new ng(giVar, 24));
        }
        giVar.i0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i7);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        giVar.setMeasuredDimension(size3, size4);
        int i13 = tiVar.u0;
        yh yhVar = tiVar.N2;
        wh whVar = tiVar.C2;
        int i14 = size3 - (i13 * 2);
        if (!whVar.O && org.telegram.messenger.g0.L(20.0f) >= 0 && !whVar.e && !whVar.P) {
            giVar.i0 = true;
            whVar.j();
            giVar.i0 = false;
        }
        if (!yhVar.O && org.telegram.messenger.g0.L(20.0f) >= 0 && !yhVar.e && !yhVar.P) {
            giVar.i0 = true;
            yhVar.j();
            giVar.i0 = false;
        }
        if (tiVar.h2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            qn qnVar3 = tiVar.h2;
            if (!qnVar3.H && !qnVar3.b1 && !qnVar3.g1 && !qnVar3.i1) {
                giVar.i0 = true;
                qnVar3.f0();
                giVar.i0 = false;
            }
        }
        if (tiVar.i2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            qn qnVar4 = tiVar.i2;
            if (!qnVar4.H && !qnVar4.b1 && !qnVar4.g1 && !qnVar4.i1) {
                giVar.i0 = true;
                qnVar4.f0();
                giVar.i0 = false;
            }
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            if (tiVar.d) {
                li liVar = tiVar.w2;
                qn qnVar5 = tiVar.h2;
                if (liVar == qnVar5 && qnVar5.F != null && qnVar5.i1) {
                    M0 = org.telegram.messenger.g0.L(120.0f);
                } else {
                    qn qnVar6 = tiVar.i2;
                    M0 = (liVar == qnVar6 && qnVar6.F != null && qnVar6.i1) ? org.telegram.messenger.g0.L(120.0f) : 0;
                }
            } else {
                M0 = ti.M0(tiVar);
            }
            WeakHashMap weakHashMap = r0.i0.a;
            r0.l1 a10 = r0.b0.a(giVar);
            int i15 = a10 != null ? a10.a.f(8).d : 0;
            r0.l1 a11 = r0.b0.a(giVar);
            Math.max(a11 != null ? a11.a.f(527).d : 0, M0);
            int max = Math.max(i15 > 0 ? 0 : org.telegram.messenger.g0.n, M0);
            giVar.i0 = true;
            li liVar2 = tiVar.w2;
            if (liVar2.f) {
                liVar2.e = org.telegram.messenger.g0.L(62.0f) + max;
                tiVar.w2.B(i14, size4);
            } else {
                liVar2.e = org.telegram.messenger.g0.n;
                liVar2.B(i14, size4 - M0);
            }
            li liVar3 = tiVar.x2;
            if (liVar3 != null) {
                if (liVar3.f) {
                    liVar3.e = org.telegram.messenger.g0.L(62.0f) + max;
                    tiVar.x2.B(i14, size4);
                } else {
                    liVar3.e = org.telegram.messenger.g0.n;
                    liVar3.B(i14, size4 - M0);
                }
            }
            giVar.i0 = false;
        }
        int childCount = giVar.getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            int i17 = i16;
            View childAt = giVar.getChildAt(i17);
            if (childAt == null || childAt.getVisibility() == 8) {
                i11 = i17;
            } else if (childAt == tiVar.t3) {
                i11 = i17;
                giVar.measureChildWithMargins(childAt, i7, 0, makeMeasureSpec, 0);
            } else {
                i11 = i17;
                int i18 = org.telegram.messenger.g0.m;
                int i19 = org.telegram.messenger.g0.n;
                if (childAt instanceof li) {
                    li liVar4 = (li) childAt;
                    if (liVar4.h) {
                        i18 = 0;
                    }
                    if (liVar4.f) {
                        i19 = 0;
                    }
                }
                if (!whVar.l(childAt) && !yhVar.l(childAt) && (((qnVar = tiVar.h2) == null || childAt != qnVar.F) && ((qnVar2 = tiVar.i2) == null || childAt != qnVar2.F))) {
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
            giVar = this;
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
        ti tiVar = this.l0;
        if (tiVar.w2.o(motionEvent)) {
            return true;
        }
        return !tiVar.J && super.onTouchEvent(motionEvent);
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
        ti tiVar = this.l0;
        th thVar = tiVar.v3;
        float f11 = f10 + tiVar.j4;
        int i7 = tiVar.B0;
        if (i7 == 0) {
            this.j0 = f11;
        }
        if (i7 == 1) {
            if (f11 < 0.0f) {
                tiVar.w2.setTranslationY(f11);
                if (tiVar.O2 != 0 || tiVar.R2) {
                    tiVar.g3.setTranslationY((tiVar.n3 + f11) - tiVar.j4);
                }
                thVar.setTranslationY(0.0f);
                f11 = 0.0f;
            } else {
                tiVar.w2.setTranslationY(0.0f);
                thVar.setTranslationY(((f11 / this.j0) * thVar.getMeasuredHeight()) + (-f11));
            }
            tiVar.b.invalidate();
        }
        super.setTranslationY((f11 - tiVar.j4) + tiVar.t2);
        if (tiVar.B0 != 1) {
            tiVar.w2.m(tiVar.j4);
        }
    }

    @Override // org.telegram.ui.Components.cu0
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
