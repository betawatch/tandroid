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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oh extends qt0 {
    public int g0;
    public final RectF h0;
    public boolean i0;
    public float j0;
    public final mh k0;
    public final /* synthetic */ bi l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh(bi biVar, Context context) {
        super(context, null);
        this.l0 = biVar;
        this.h0 = new RectF();
        this.k0 = new mh(this, this);
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
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
        th thVar;
        canvas.save();
        bi biVar = this.l0;
        th thVar2 = biVar.t2;
        am amVar = biVar.i2;
        if ((thVar2 == amVar || (thVar = biVar.u2) == amVar || (thVar2 == biVar.b2 && thVar == null)) && thVar2 != null) {
            canvas.save();
            float f15 = biVar.g4;
            boolean z10 = biVar.Y1;
            ai.c0 c0Var = biVar.J2;
            ah ahVar = biVar.d3;
            canvas.translate(0.0f, f15);
            int alpha2 = (int) (thVar2.getAlpha() * 255.0f);
            int j10 = thVar2.j();
            int L3 = org.telegram.messenger.g0.L(13.0f) + ((int) ((ahVar != null ? ahVar.getAlpha() : 0.0f) * org.telegram.messenger.g0.L(26.0f))) + ((int) (c0Var != null ? c0Var.getAlpha() * c0Var.getMeasuredHeight() : 0.0f));
            int c12 = (biVar.c1(0) - biVar.t0) - L3;
            if (biVar.B0 == 1 || biVar.o3 != null) {
                c12 = (int) (thVar2.getTranslationY() + c12);
            }
            int L4 = org.telegram.messenger.g0.L(20.0f) + c12;
            getMeasuredHeight();
            org.telegram.messenger.g0.L(45.0f);
            int i3 = biVar.t0;
            if (j10 != 0) {
                i3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            if (j10 != 2) {
                float f16 = L3;
                f10 = 1.0f;
                if (thVar2 == biVar.g2) {
                    L = org.telegram.messenger.g0.L(11.0f);
                } else {
                    if (thVar2 == biVar.e2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else if (thVar2 == biVar.f2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    f11 = f16 - L2;
                    float alpha3 = biVar.S2.getAlpha();
                    int i10 = (int) (((i3 - f11) + org.telegram.messenger.g0.m) * alpha3);
                    c12 -= i10;
                    L4 -= i10;
                    f12 = 1.0f - alpha3;
                }
                f11 = f16 + L;
                float alpha32 = biVar.S2.getAlpha();
                int i102 = (int) (((i3 - f11) + org.telegram.messenger.g0.m) * alpha32);
                c12 -= i102;
                L4 -= i102;
                f12 = 1.0f - alpha32;
            } else if (c12 < i3) {
                f12 = org.telegram.ui.Cells.f1.y(i3 - c12, biVar.t0, 1.0f, 0.0f);
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
            int customBackground = biVar.t2.h() ? biVar.t2.getCustomBackground() : biVar.d1(true);
            biVar.s0.setAlpha(alpha2);
            biVar.s0.setBounds(0, c12, getMeasuredWidth(), org.telegram.messenger.g0.L(45.0f) + getMeasuredHeight() + biVar.t0);
            biVar.s0.draw(canvas);
            RectF rectF = this.h0;
            if (j10 == 2) {
                org.telegram.ui.ActionBar.k6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.k6.t0.setAlpha(alpha2);
                f13 = 24.0f;
                rectF.set(biVar.u0, biVar.t0 + c12, getMeasuredWidth() - biVar.u0, org.telegram.messenger.g0.L(24.0f) + biVar.t0 + c12);
            } else {
                f13 = 24.0f;
            }
            if ((f12 != f10 && j10 != 2) || biVar.t2.g()) {
                Paint paint = org.telegram.ui.ActionBar.k6.t0;
                if (biVar.t2.g()) {
                    customBackground = biVar.t2.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                org.telegram.ui.ActionBar.k6.t0.setAlpha(alpha2);
                rectF.set(biVar.u0, biVar.t0 + c12, getMeasuredWidth() - biVar.u0, org.telegram.messenger.g0.L(f13) + biVar.t0 + c12);
            }
            if (biVar.t2.g()) {
                org.telegram.ui.ActionBar.k6.t0.setColor(biVar.t2.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.k6.t0.setAlpha(alpha2);
                int c13 = biVar.c1(0);
                if (!z10) {
                    c13 += org.telegram.messenger.g0.m;
                }
                rectF.set(biVar.u0, (org.telegram.messenger.g0.L(12.0f) + biVar.t0 + c12) * f12, getMeasuredWidth() - biVar.u0, org.telegram.messenger.g0.L(12.0f) + c13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.k6.t0);
                canvas.restore();
            }
            if ((ahVar == null || ahVar.getAlpha() != f10) && f12 != 0.0f) {
                int L5 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, L4, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(4.0f) + L4);
                if (j10 == 2) {
                    w02 = TLObject.FLAG_29;
                    f14 = f12;
                } else if (biVar.t2.g()) {
                    int customActionBarBackground = biVar.t2.getCustomActionBarBackground();
                    w02 = i0.a.f(0.5f, customActionBarBackground, i0.a.h(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (ahVar != null) {
                        alpha = ahVar.getAlpha();
                        f14 = f10 - alpha;
                    }
                    f14 = f10;
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, biVar.J0);
                    if (ahVar != null) {
                        alpha = ahVar.getAlpha();
                        f14 = f10 - alpha;
                    }
                    f14 = f10;
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.k6.t0.setColor(w02);
                org.telegram.ui.ActionBar.k6.t0.setAlpha((int) (thVar2.getAlpha() * alpha4 * f14 * f12));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.t0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
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
        th thVar;
        bi biVar = this.l0;
        boolean z10 = biVar.Y1;
        ai.c0 c0Var = biVar.J2;
        gh.g gVar = biVar.v2;
        ah ahVar = biVar.d3;
        p7 p7Var = biVar.S2;
        if (!(view instanceof th) || view.getAlpha() <= 0.0f) {
            if (view != p7Var) {
                if (!(view instanceof ey) || gVar == null) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                gVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(gVar.R.k);
                gVar.draw(canvas);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
            float alpha2 = p7Var.getAlpha();
            if (alpha2 <= 0.0f) {
                return false;
            }
            if (alpha2 >= 1.0f) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            float x10 = p7Var.getX();
            th thVar2 = biVar.t2;
            if (thVar2 != null) {
                int j11 = thVar2.j();
                int L5 = org.telegram.messenger.g0.L(13.0f) + ((int) ((ahVar != null ? ahVar.getAlpha() : 0.0f) * org.telegram.messenger.g0.L(26.0f))) + ((int) (c0Var != null ? c0Var.getAlpha() * c0Var.getMeasuredHeight() : 0.0f));
                int c12 = (biVar.c1(0) - biVar.t0) - L5;
                if (biVar.B0 == 1 || biVar.o3 != null) {
                    c12 = (int) (thVar2.getTranslationY() + c12);
                }
                int L6 = org.telegram.messenger.g0.L(20.0f) + c12;
                int currentActionBarHeight = j11 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : biVar.t0;
                if (j11 != 2 && c12 + biVar.t0 < currentActionBarHeight) {
                    float f16 = L5;
                    if (thVar2 == biVar.g2) {
                        L = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        if (thVar2 == biVar.e2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else if (thVar2 == biVar.f2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        f11 = f16 - L2;
                        L6 -= (int) (p7Var.getAlpha() * ((currentActionBarHeight - f11) + org.telegram.messenger.g0.m));
                    }
                    f11 = f16 + L;
                    L6 -= (int) (p7Var.getAlpha() * ((currentActionBarHeight - f11) + org.telegram.messenger.g0.m));
                }
                if (!z10) {
                    L6 += org.telegram.messenger.g0.m;
                }
                f10 = L6;
            } else {
                f10 = 0.0f;
            }
            canvas.clipRect(x10, f10, p7Var.getX() + p7Var.getWidth(), p7Var.getY() + p7Var.getHeight());
            boolean drawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild3;
        }
        canvas.save();
        canvas.translate(0.0f, biVar.g4);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        th thVar3 = (th) view;
        int j12 = thVar3.j();
        int L7 = org.telegram.messenger.g0.L(13.0f) + (ahVar != null ? org.telegram.messenger.g0.L(ahVar.getAlpha() * 26.0f) : 0) + ((int) (c0Var != null ? c0Var.getAlpha() * c0Var.getMeasuredHeight() : 0.0f));
        int c13 = (biVar.c1(thVar3 == biVar.t2 ? 0 : 1) - biVar.t0) - L7;
        if (biVar.B0 == 1 || biVar.o3 != null) {
            c13 = (int) (view.getTranslationY() + c13);
        }
        int L8 = org.telegram.messenger.g0.L(20.0f) + c13;
        int L9 = org.telegram.messenger.g0.L(45.0f) + getMeasuredHeight();
        int i3 = biVar.t0;
        int i10 = L9 + i3;
        if (j12 != 0) {
            i3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (j12 != 2) {
            f12 = 0.0f;
            if (biVar.t0 + c13 < i3) {
                float f17 = L7;
                if (thVar3 == biVar.g2) {
                    L3 = org.telegram.messenger.g0.L(11.0f);
                } else {
                    if (thVar3 == biVar.e2) {
                        L4 = org.telegram.messenger.g0.L(3.0f);
                    } else if (thVar3 == biVar.f2) {
                        L4 = org.telegram.messenger.g0.L(3.0f);
                    } else {
                        L3 = org.telegram.messenger.g0.L(4.0f);
                    }
                    f13 = f17 - L4;
                    float min = Math.min(1.0f, ((i3 - c13) - biVar.t0) / f13);
                    int i11 = (int) ((i3 - f13) * min);
                    c13 -= i11;
                    L8 -= i11;
                    i10 += i11;
                    f14 = 1.0f - min;
                }
                f13 = f17 + L3;
                float min2 = Math.min(1.0f, ((i3 - c13) - biVar.t0) / f13);
                int i112 = (int) ((i3 - f13) * min2);
                c13 -= i112;
                L8 -= i112;
                i10 += i112;
                f14 = 1.0f - min2;
            }
            f14 = 1.0f;
        } else if (c13 < i3) {
            f14 = org.telegram.ui.Cells.f1.y(i3 - c13, biVar.t0, 1.0f, 0.0f);
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
        int customBackground = biVar.t2.h() ? biVar.t2.getCustomBackground() : biVar.d1(true);
        th thVar4 = biVar.t2;
        am amVar = biVar.i2;
        boolean z11 = (thVar4 == amVar || (thVar = biVar.u2) == amVar || (thVar4 == biVar.b2 && thVar == null)) ? false : true;
        RectF rectF = this.h0;
        if (z11) {
            biVar.s0.setAlpha(alpha3);
            f15 = 24.0f;
            biVar.s0.setBounds(0, c13, getMeasuredWidth(), i13);
            biVar.s0.draw(canvas);
            if (j12 == 2) {
                org.telegram.ui.ActionBar.k6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.k6.t0.setAlpha(alpha3);
                rectF.set(biVar.u0, biVar.t0 + c13, getMeasuredWidth() - biVar.u0, org.telegram.messenger.g0.L(24.0f) + biVar.t0 + c13);
            }
        } else {
            f15 = 24.0f;
        }
        thVar3.E(((biVar.t0 + c13) - view.getTop()) - view.getTranslationY(), f14);
        if (view == biVar.c2 || view == biVar.k2 || view == biVar.d2) {
            drawChild = super.drawChild(canvas, view, j10);
        } else {
            canvas.save();
            drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
        }
        if (z11) {
            if (f14 != 1.0f && j12 != 2) {
                org.telegram.ui.ActionBar.k6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.k6.t0.setAlpha(alpha3);
                rectF.set(biVar.u0, biVar.t0 + c13, getMeasuredWidth() - biVar.u0, org.telegram.messenger.g0.L(f15) + biVar.t0 + c13);
            }
            if ((ahVar == null || ahVar.getAlpha() != 1.0f) && f14 != f12) {
                int L10 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L10) / 2, L8, (getMeasuredWidth() + L10) / 2, org.telegram.messenger.g0.L(4.0f) + L8);
                if (j12 == 2) {
                    w02 = TLObject.FLAG_29;
                    alpha = f14;
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, biVar.J0);
                    alpha = ahVar == null ? 1.0f : 1.0f - ahVar.getAlpha();
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.k6.t0.setColor(w02);
                org.telegram.ui.ActionBar.k6.t0.setAlpha((int) (view.getAlpha() * alpha4 * alpha * f14));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.t0);
            }
        }
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mh mhVar = this.k0;
        mhVar.b = this;
        mhVar.c();
        bi biVar = this.l0;
        biVar.z2.setAdjustPanLayoutHelper(mhVar);
        biVar.K2.setAdjustPanLayoutHelper(mhVar);
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.k0.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.l0.Y1;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        bi biVar = this.l0;
        int[] iArr = biVar.W3;
        if (biVar.t2.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y9 = motionEvent.getY();
                ai.c0 c0Var = biVar.J2;
                int i3 = iArr[0] - (biVar.t0 * 2);
                int L = org.telegram.messenger.g0.L(13.0f);
                ah ahVar = biVar.d3;
                int L2 = org.telegram.messenger.g0.L(20.0f) + ((i3 - (L + (ahVar != null ? org.telegram.messenger.g0.L(ahVar.getAlpha() * 26.0f) : 0))) - ((int) (c0Var != null ? c0Var.getAlpha() * c0Var.getMeasuredHeight() : 0.0f)));
                if (!biVar.Y1) {
                    L2 += org.telegram.messenger.g0.m;
                }
                if (y9 < L2 && biVar.S2.getAlpha() == 0.0f) {
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
    @Override // org.telegram.ui.Components.qt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        il ilVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        dh dhVar;
        fh fhVar;
        an anVar;
        an anVar2;
        int i19;
        int max;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        oh ohVar = this;
        bi biVar = ohVar.l0;
        ai.c0 c0Var = biVar.J2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.b2;
        int i20 = i11 - i3;
        if (ohVar.g0 != i20) {
            ohVar.g0 = i20;
            se seVar = biVar.Z1;
            if (seVar != null && !seVar.q0) {
                seVar.dismiss();
            }
        }
        int childCount = ohVar.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            biVar.f4.set(i3, i10, i11, i12);
            ohVar.setSystemGestureExclusionRects(biVar.e4);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.k1 a10 = r0.b0.a(ohVar);
        int i21 = 8;
        int i22 = a10 != null ? a10.a.f(8).d : 0;
        int paddingBottom = ohVar.getPaddingBottom();
        if (!biVar.d) {
            an anVar3 = biVar.e2;
            if (anVar3 == null || biVar.t2 != anVar3 || anVar3.F == null) {
                an anVar4 = biVar.f2;
                if (anVar4 == null || biVar.t2 != anVar4 || anVar4.F == null) {
                    if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        emojiPadding = biVar.a1().getEmojiPadding();
                        if (emojiPadding > 0) {
                            paddingBottom += emojiPadding;
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                } else {
                    if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        emojiPadding = biVar.f2.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            } else {
                if (i22 <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    emojiPadding = biVar.e2.getEmojiPadding();
                    if (emojiPadding > 0) {
                    }
                }
                emojiPadding = 0;
                if (emojiPadding > 0) {
                }
            }
        }
        ohVar.setBottomClip(paddingBottom);
        int i23 = 0;
        while (i23 < childCount) {
            View childAt = ohVar.getChildAt(i23);
            if (childAt.getVisibility() != i21) {
                int i24 = org.telegram.messenger.g0.m;
                int max2 = i22 == 0 ? Math.max(org.telegram.messenger.g0.n, paddingBottom) : 0;
                if (childAt instanceof th) {
                    th thVar = (th) childAt;
                    if (thVar.h) {
                        i24 = 0;
                    }
                    if (thVar.f) {
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
                int i26 = i25 & org.telegram.messenger.hs.x1;
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
                        if (childAt != biVar.S2 || childAt == biVar.q3) {
                            i18 = 0;
                        }
                        dhVar = biVar.z2;
                        if ((dhVar == null && dhVar.l(childAt)) || (((fhVar = biVar.K2) != null && fhVar.l(childAt)) || (((anVar = biVar.e2) != null && childAt == anVar.F) || ((anVar2 = biVar.f2) != null && childAt == anVar2.F)))) {
                            if (org.telegram.messenger.g0.Q1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i22;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i18 = measuredHeight - measuredHeight2;
                        } else if (childAt == biVar.z4) {
                            if (biVar.U1) {
                                i19 = org.telegram.messenger.g0.m;
                                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                i18 = i19 + max;
                            }
                        } else if (childAt == biVar.r3) {
                            i19 = i18 + org.telegram.messenger.g0.n;
                            max = Math.max(i22, bi.L0(biVar));
                            i18 = i19 + max;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, i18 + measuredHeight3);
                    } else {
                        i16 = ((((i12 - max2) - i10) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt != biVar.S2) {
                    }
                    i18 = 0;
                    dhVar = biVar.z2;
                    if (dhVar == null) {
                    }
                    if (childAt == biVar.z4) {
                    }
                } else {
                    i13 = ((i20 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i14 = biVar.u0;
                }
                i15 = i13 - i14;
                if (i26 == 16) {
                }
                i18 = i16 - i17;
                if (childAt != biVar.S2) {
                }
                i18 = 0;
                dhVar = biVar.z2;
                if (dhVar == null) {
                }
                if (childAt == biVar.z4) {
                }
            }
            i23++;
            ohVar = this;
            i21 = 8;
        }
        R();
        biVar.M1(biVar.t2, 0);
        biVar.M1(biVar.u2, 0);
        if (biVar.U1) {
            biVar.J1();
        }
        if (chatAttachAlertPhotoLayout == null || (ilVar = chatAttachAlertPhotoLayout.F) == null || ilVar.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.F.getFastScroll().i0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.q1 + (biVar.U1 ? (int) (c0Var.getAlpha() * c0Var.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.F.getFastScroll().invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        an anVar;
        an anVar2;
        int L0;
        oh ohVar = this;
        bi biVar = ohVar.l0;
        boolean z10 = biVar.Y1;
        org.telegram.ui.ActionBar.q0 q0Var = biVar.V2;
        int size = ohVar.getLayoutParams().height > 0 ? ohVar.getLayoutParams().height : View.MeasureSpec.getSize(i10);
        if (!z10) {
            ohVar.i0 = true;
            int i12 = biVar.u0;
            ohVar.setPadding(i12, 0, i12, 0);
            ohVar.i0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i3) - (biVar.u0 * 2);
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
        ((FrameLayout.LayoutParams) biVar.a3.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ohVar.i0 = true;
        int min = (int) (size2 / Math.min(4.5f, biVar.v3.b()));
        if (biVar.T3 != min) {
            biVar.T3 = min;
            org.telegram.messenger.g0.h3(new vf(ohVar, 22));
        }
        ohVar.i0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i3);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        ohVar.setMeasuredDimension(size3, size4);
        int i13 = biVar.u0;
        fh fhVar = biVar.K2;
        dh dhVar = biVar.z2;
        int i14 = size3 - (i13 * 2);
        if (!dhVar.O && org.telegram.messenger.g0.L(20.0f) >= 0 && !dhVar.e && !dhVar.P) {
            ohVar.i0 = true;
            dhVar.j();
            ohVar.i0 = false;
        }
        if (!fhVar.O && org.telegram.messenger.g0.L(20.0f) >= 0 && !fhVar.e && !fhVar.P) {
            ohVar.i0 = true;
            fhVar.j();
            ohVar.i0 = false;
        }
        if (biVar.e2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            an anVar3 = biVar.e2;
            if (!anVar3.H && !anVar3.b1 && !anVar3.g1 && !anVar3.i1) {
                ohVar.i0 = true;
                anVar3.f0();
                ohVar.i0 = false;
            }
        }
        if (biVar.f2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            an anVar4 = biVar.f2;
            if (!anVar4.H && !anVar4.b1 && !anVar4.g1 && !anVar4.i1) {
                ohVar.i0 = true;
                anVar4.f0();
                ohVar.i0 = false;
            }
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            if (biVar.d) {
                th thVar = biVar.t2;
                an anVar5 = biVar.e2;
                if (thVar == anVar5 && anVar5.F != null && anVar5.i1) {
                    L0 = org.telegram.messenger.g0.L(120.0f);
                } else {
                    an anVar6 = biVar.f2;
                    L0 = (thVar == anVar6 && anVar6.F != null && anVar6.i1) ? org.telegram.messenger.g0.L(120.0f) : 0;
                }
            } else {
                L0 = bi.L0(biVar);
            }
            WeakHashMap weakHashMap = r0.i0.a;
            r0.k1 a10 = r0.b0.a(ohVar);
            int i15 = a10 != null ? a10.a.f(8).d : 0;
            r0.k1 a11 = r0.b0.a(ohVar);
            Math.max(a11 != null ? a11.a.f(527).d : 0, L0);
            int max = Math.max(i15 > 0 ? 0 : org.telegram.messenger.g0.n, L0);
            ohVar.i0 = true;
            th thVar2 = biVar.t2;
            if (thVar2.f) {
                thVar2.e = org.telegram.messenger.g0.L(62.0f) + max;
                biVar.t2.B(i14, size4);
            } else {
                thVar2.e = org.telegram.messenger.g0.n;
                thVar2.B(i14, size4 - L0);
            }
            th thVar3 = biVar.u2;
            if (thVar3 != null) {
                if (thVar3.f) {
                    thVar3.e = org.telegram.messenger.g0.L(62.0f) + max;
                    biVar.u2.B(i14, size4);
                } else {
                    thVar3.e = org.telegram.messenger.g0.n;
                    thVar3.B(i14, size4 - L0);
                }
            }
            ohVar.i0 = false;
        }
        int childCount = ohVar.getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            int i17 = i16;
            View childAt = ohVar.getChildAt(i17);
            if (childAt == null || childAt.getVisibility() == 8) {
                i11 = i17;
            } else if (childAt == biVar.q3) {
                i11 = i17;
                ohVar.measureChildWithMargins(childAt, i3, 0, makeMeasureSpec, 0);
            } else {
                i11 = i17;
                int i18 = org.telegram.messenger.g0.m;
                int i19 = org.telegram.messenger.g0.n;
                if (childAt instanceof th) {
                    th thVar4 = (th) childAt;
                    if (thVar4.h) {
                        i18 = 0;
                    }
                    if (thVar4.f) {
                        i19 = 0;
                    }
                }
                if (!dhVar.l(childAt) && !fhVar.l(childAt) && (((anVar = biVar.e2) == null || childAt != anVar.F) && ((anVar2 = biVar.f2) == null || childAt != anVar2.F))) {
                    measureChildWithMargins(childAt, i3, 0, makeMeasureSpec, i18 + i19);
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
            ohVar = this;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        int i13;
        WindowInsets rootWindowInsets;
        super.onSizeChanged(i3, i10, i11, i12);
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
        gh.g gVar = this.l0.v2;
        if (gVar != null) {
            gVar.t(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), i14, i13, true);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bi biVar = this.l0;
        if (biVar.t2.o(motionEvent)) {
            return true;
        }
        return !biVar.J && super.onTouchEvent(motionEvent);
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
        bi biVar = this.l0;
        ah ahVar = biVar.s3;
        float f11 = f10 + biVar.g4;
        int i3 = biVar.B0;
        if (i3 == 0) {
            this.j0 = f11;
        }
        if (i3 == 1) {
            if (f11 < 0.0f) {
                biVar.t2.setTranslationY(f11);
                if (biVar.L2 != 0 || biVar.O2) {
                    biVar.d3.setTranslationY((biVar.k3 + f11) - biVar.g4);
                }
                ahVar.setTranslationY(0.0f);
                f11 = 0.0f;
            } else {
                biVar.t2.setTranslationY(0.0f);
                ahVar.setTranslationY(((f11 / this.j0) * ahVar.getMeasuredHeight()) + (-f11));
            }
            biVar.b.invalidate();
        }
        super.setTranslationY((f11 - biVar.g4) + biVar.q2);
        if (biVar.B0 != 1) {
            biVar.t2.m(biVar.g4);
        }
    }

    @Override // org.telegram.ui.Components.qt0
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
