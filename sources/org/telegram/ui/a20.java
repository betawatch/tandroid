package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public class a20 extends org.telegram.ui.Components.id0 {
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public final Paint H0;
    public Boolean I0;
    public final /* synthetic */ b20 J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a20(b20 b20Var, Context context) {
        super(context);
        this.J0 = b20Var;
        new Paint(1);
        this.H0 = new Paint(1);
    }

    private void setLightStatusBar(int i10) {
        boolean z10 = AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f;
        Boolean bool = this.I0;
        if (bool == null || bool.booleanValue() != z10) {
            View view = this.J0.fragmentView;
            this.I0 = Boolean.valueOf(z10);
            AndroidUtilities.setLightStatusBar(view, z10);
        }
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.k kVar7;
        b20 b20Var = this.J0;
        Paint paint = b20Var.K;
        ai.cd cdVar = b20Var.y;
        if (!b20Var.f) {
            if (b20Var.h) {
                float f7 = b20Var.n + 0.016f;
                b20Var.n = f7;
                if (f7 > 3.0f) {
                    b20Var.h = false;
                }
            } else {
                float f10 = b20Var.n - 0.016f;
                b20Var.n = f10;
                if (f10 < 1.0f) {
                    b20Var.h = true;
                }
            }
        }
        View m10 = b20Var.c.getLayoutManager() != null ? b20Var.c.getLayoutManager().m(0) : null;
        b20Var.r = m10 != null ? m10.getBottom() : 0;
        kVar = ((org.telegram.ui.ActionBar.o2) b20Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f11 = 1.0f - ((b20Var.r - dp) / (b20Var.J - dp));
        b20Var.v = f11;
        b20Var.v = Utilities.clamp(f11, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.o2) b20Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (b20Var.r < dp2) {
            b20Var.r = dp2;
        }
        float f12 = b20Var.x;
        b20Var.x = 0.0f;
        if (b20Var.r < AndroidUtilities.dp(30.0f) + dp2) {
            b20Var.x = ((AndroidUtilities.dp(30.0f) + dp2) - b20Var.r) / AndroidUtilities.dp(30.0f);
        }
        if (b20Var.H) {
            b20Var.x = 1.0f;
            b20Var.v = 1.0f;
        }
        if (f12 != b20Var.x) {
            b20Var.c.invalidate();
        }
        b20Var.s0(b20Var.v);
        int i10 = b20Var.r;
        kVar3 = ((org.telegram.ui.ActionBar.o2) b20Var).actionBar;
        int measuredHeight = kVar3.getMeasuredHeight();
        int measuredHeight2 = cdVar.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) cdVar.d;
        TextView textView = (TextView) cdVar.b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i10 - ((measuredHeight2 + measuredHeight) - b20Var.I));
        kVar4 = ((org.telegram.ui.ActionBar.o2) b20Var).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - b20Var.I) - textView.getMeasuredHeight()) / 2.0f) + b20Var.I) - cdVar.getTop()) - textView.getTop(), dp3);
        cdVar.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f13 = b20Var.v;
        float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f13, 0.4f, 0.6f);
        float f14 = 1.0f - (f13 > 0.5f ? (f13 - 0.5f) / 0.5f : 0.0f);
        frameLayout.setScaleX(y3);
        frameLayout.setScaleY(y3);
        frameLayout.setAlpha(f14);
        ((FrameLayout) cdVar.e).setAlpha(f14);
        ((org.telegram.ui.Components.y90) cdVar.c).setAlpha(f14);
        b20Var.e.setAlpha(1.0f - b20Var.v);
        b20Var.e.setTranslationY((frameLayout.getY() + cdVar.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f15 = b20Var.v;
        textView.setTranslationX((1.0f - org.telegram.ui.Components.bs.h.getInterpolation(1.0f - (f15 > 0.3f ? (f15 - 0.3f) / 0.7f : 0.0f))) * dp4);
        if (!b20Var.f) {
            invalidate();
        }
        b20Var.a.d(0, (-getMeasuredWidth()) * 0.1f * b20Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (b20Var.M) {
            int themedColor = b20Var.getThemedColor(org.telegram.ui.ActionBar.k6.a7);
            Paint paint2 = this.H0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), b20Var.a.f);
        }
        int f16 = i0.a.f(f14, b20Var.getThemedColor(org.telegram.ui.ActionBar.k6.j5), b20Var.getThemedColor(b20Var.M ? org.telegram.ui.ActionBar.k6.G6 : org.telegram.ui.ActionBar.k6.Tj));
        kVar5 = ((org.telegram.ui.ActionBar.o2) b20Var).actionBar;
        kVar5.getBackButton().setColorFilter(f16);
        textView.setTextColor(f16);
        paint.setAlpha((int) ((1.0f - f14) * 255.0f));
        int i11 = org.telegram.ui.ActionBar.k6.Sj;
        g6Var = ((org.telegram.ui.ActionBar.o2) b20Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.w0(i11, g6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        kVar6 = ((org.telegram.ui.ActionBar.o2) b20Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, kVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f14 > 0.01f || !b20Var.q0()) {
            return;
        }
        h5Var = ((org.telegram.ui.ActionBar.o2) b20Var).parentLayout;
        kVar7 = ((org.telegram.ui.ActionBar.o2) b20Var).actionBar;
        ((ActionBarLayout) h5Var).p(canvas, 255, kVar7.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f7;
        org.telegram.ui.ActionBar.k kVar2;
        b20 b20Var = this.J0;
        kVar = ((org.telegram.ui.ActionBar.o2) b20Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.o2) b20Var).actionBar;
            ImageView backButton = kVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (ih.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        this.G0 = true;
                    }
                }
                if (this.G0) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return dispatchTouchEvent;
                    }
                    this.G0 = false;
                    return dispatchTouchEvent;
                }
            }
        }
        ai.cd cdVar = b20Var.y;
        float x10 = cdVar.getX();
        FrameLayout frameLayout = (FrameLayout) cdVar.e;
        FrameLayout frameLayout2 = (FrameLayout) cdVar.d;
        org.telegram.ui.Components.y90 y90Var = (org.telegram.ui.Components.y90) cdVar.c;
        float x11 = y90Var.getX() + x10;
        float y3 = y90Var.getY() + cdVar.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x11, y3, y90Var.getMeasuredWidth() + x11, y90Var.getMeasuredHeight() + y3);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.E0) || b20Var.c.I1 || (layout = y90Var.getLayout()) == null) {
            f7 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f7 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && b20Var.x < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y3);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.E0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.E0 = false;
                    }
                    y90Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + cdVar.getX();
        float y10 = frameLayout2.getY() + cdVar.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y10, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.D0) && !b20Var.c.I1 && isClickable && b20Var.x < f7) {
            motionEvent.offsetLocation(-x12, -y10);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.D0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.D0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + cdVar.getX();
        float y11 = frameLayout.getY() + cdVar.getY();
        rectF2.set(x13, y11, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.F0) && !b20Var.c.I1 && b20Var.x < f7) {
            motionEvent.offsetLocation(-x13, -y11);
            if (motionEvent.getAction() == 0) {
                this.F0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.F0 = false;
            }
            frameLayout.dispatchTouchEvent(motionEvent);
            if (this.F0) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        b20 b20Var = this.J0;
        if (view != b20Var.c) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        kVar = ((org.telegram.ui.ActionBar.o2) b20Var).actionBar;
        canvas.clipRect(0, kVar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j10);
        canvas.restore();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.id0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.h5 h5Var;
        int i12;
        int i13;
        s4.b0 b0Var;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.h5 h5Var2;
        b20 b20Var = this.J0;
        ai.cd cdVar = b20Var.y;
        b20Var.H = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        h5Var = ((org.telegram.ui.ActionBar.o2) b20Var).parentLayout;
        if (h5Var != null) {
            h5Var2 = ((org.telegram.ui.ActionBar.o2) b20Var).parentLayout;
            if (((ActionBarLayout) h5Var2).S0) {
                i12 = 0;
                b20Var.I = i12;
                cdVar.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = b20Var.e.getLayoutParams();
                i13 = b20Var.E;
                if (i13 <= 0) {
                    i13 = cdVar.getMeasuredHeight();
                }
                layoutParams.height = i13;
                b0Var = b20Var.F;
                if (b0Var instanceof org.telegram.ui.Components.yz) {
                    org.telegram.ui.Components.yz yzVar = (org.telegram.ui.Components.yz) b0Var;
                    kVar = ((org.telegram.ui.ActionBar.o2) b20Var).actionBar;
                    yzVar.M = kVar.getMeasuredHeight();
                    yzVar.p1();
                    ((org.telegram.ui.Components.yz) b20Var.F).S = 0;
                }
                super.onMeasure(i10, i11);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    b20Var.v0();
                    return;
                }
                return;
            }
        }
        i12 = AndroidUtilities.statusBarHeight;
        b20Var.I = i12;
        cdVar.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = b20Var.e.getLayoutParams();
        i13 = b20Var.E;
        if (i13 <= 0) {
        }
        layoutParams2.height = i13;
        b0Var = b20Var.F;
        if (b0Var instanceof org.telegram.ui.Components.yz) {
        }
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
