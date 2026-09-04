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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class q20 extends org.telegram.ui.Components.nc0 {
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public final Paint H0;
    public Boolean I0;
    public final /* synthetic */ r20 J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q20(r20 r20Var, Context context) {
        super(context);
        this.J0 = r20Var;
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

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.k kVar7;
        r20 r20Var = this.J0;
        Paint paint = r20Var.K;
        o20 o20Var = r20Var.y;
        if (!r20Var.f) {
            if (r20Var.h) {
                float f7 = r20Var.n + 0.016f;
                r20Var.n = f7;
                if (f7 > 3.0f) {
                    r20Var.h = false;
                }
            } else {
                float f10 = r20Var.n - 0.016f;
                r20Var.n = f10;
                if (f10 < 1.0f) {
                    r20Var.h = true;
                }
            }
        }
        View m10 = r20Var.c.getLayoutManager() != null ? r20Var.c.getLayoutManager().m(0) : null;
        r20Var.r = m10 != null ? m10.getBottom() : 0;
        kVar = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f11 = 1.0f - ((r20Var.r - dp) / (r20Var.J - dp));
        r20Var.v = f11;
        r20Var.v = Utilities.clamp(f11, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (r20Var.r < dp2) {
            r20Var.r = dp2;
        }
        float f12 = r20Var.x;
        r20Var.x = 0.0f;
        if (r20Var.r < AndroidUtilities.dp(30.0f) + dp2) {
            r20Var.x = ((AndroidUtilities.dp(30.0f) + dp2) - r20Var.r) / AndroidUtilities.dp(30.0f);
        }
        if (r20Var.H) {
            r20Var.x = 1.0f;
            r20Var.v = 1.0f;
        }
        if (f12 != r20Var.x) {
            r20Var.c.invalidate();
        }
        int i10 = r20Var.r;
        kVar3 = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
        int measuredHeight = kVar3.getMeasuredHeight();
        int measuredHeight2 = o20Var.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) o20Var.d;
        TextView textView = (TextView) o20Var.b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i10 - ((measuredHeight2 + measuredHeight) - r20Var.I));
        kVar4 = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - r20Var.I) - textView.getMeasuredHeight()) / 2.0f) + r20Var.I) - o20Var.getTop()) - textView.getTop(), dp3);
        o20Var.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f13 = r20Var.v;
        float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f13, 0.4f, 0.6f);
        float f14 = 1.0f - (f13 > 0.5f ? (f13 - 0.5f) / 0.5f : 0.0f);
        frameLayout.setScaleX(z10);
        frameLayout.setScaleY(z10);
        frameLayout.setAlpha(f14);
        ((FrameLayout) o20Var.e).setAlpha(f14);
        ((org.telegram.ui.Components.d90) o20Var.c).setAlpha(f14);
        r20Var.e.setAlpha(1.0f - r20Var.v);
        r20Var.e.setTranslationY((frameLayout.getY() + o20Var.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f15 = r20Var.v;
        textView.setTranslationX((1.0f - org.telegram.ui.Components.pr.h.getInterpolation(1.0f - (f15 > 0.3f ? (f15 - 0.3f) / 0.7f : 0.0f))) * dp4);
        if (!r20Var.f) {
            invalidate();
        }
        r20Var.a.d(0, (-getMeasuredWidth()) * 0.1f * r20Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (r20Var.M) {
            int themedColor = r20Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7);
            Paint paint2 = this.H0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), r20Var.a.f);
        }
        int d = i0.a.d(f14, r20Var.getThemedColor(org.telegram.ui.ActionBar.j6.j5), r20Var.getThemedColor(r20Var.M ? org.telegram.ui.ActionBar.j6.G6 : org.telegram.ui.ActionBar.j6.Tj));
        kVar5 = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
        kVar5.getBackButton().setColorFilter(d);
        textView.setTextColor(d);
        paint.setAlpha((int) ((1.0f - f14) * 255.0f));
        int i11 = org.telegram.ui.ActionBar.j6.Sj;
        f6Var = ((org.telegram.ui.ActionBar.n2) r20Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        kVar6 = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, kVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f14 > 0.01f || !r20Var.q0()) {
            return;
        }
        d5Var = ((org.telegram.ui.ActionBar.n2) r20Var).parentLayout;
        kVar7 = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
        ((ActionBarLayout) d5Var).p(canvas, 255, kVar7.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f7;
        org.telegram.ui.ActionBar.k kVar2;
        r20 r20Var = this.J0;
        kVar = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
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
        o20 o20Var = r20Var.y;
        float x10 = o20Var.getX();
        FrameLayout frameLayout = (FrameLayout) o20Var.e;
        FrameLayout frameLayout2 = (FrameLayout) o20Var.d;
        org.telegram.ui.Components.d90 d90Var = (org.telegram.ui.Components.d90) o20Var.c;
        float x11 = d90Var.getX() + x10;
        float y3 = d90Var.getY() + o20Var.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x11, y3, d90Var.getMeasuredWidth() + x11, d90Var.getMeasuredHeight() + y3);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.E0) || r20Var.c.K1 || (layout = d90Var.getLayout()) == null) {
            f7 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f7 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && r20Var.x < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y3);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.E0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.E0 = false;
                    }
                    d90Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + o20Var.getX();
        float y10 = frameLayout2.getY() + o20Var.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y10, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.D0) && !r20Var.c.K1 && isClickable && r20Var.x < f7) {
            motionEvent.offsetLocation(-x12, -y10);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.D0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.D0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + o20Var.getX();
        float y11 = frameLayout.getY() + o20Var.getY();
        rectF2.set(x13, y11, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.F0) && !r20Var.c.K1 && r20Var.x < f7) {
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        r20 r20Var = this.J0;
        if (view != r20Var.c) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        kVar = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
        canvas.clipRect(0, kVar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j3);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Components.nc0, org.telegram.ui.Components.ov0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.nc0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.d5 d5Var;
        int i12;
        int i13;
        s4.c0 c0Var;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.d5 d5Var2;
        r20 r20Var = this.J0;
        o20 o20Var = r20Var.y;
        r20Var.H = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        d5Var = ((org.telegram.ui.ActionBar.n2) r20Var).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) r20Var).parentLayout;
            if (((ActionBarLayout) d5Var2).M0) {
                i12 = 0;
                r20Var.I = i12;
                o20Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = r20Var.e.getLayoutParams();
                i13 = r20Var.E;
                if (i13 <= 0) {
                    i13 = o20Var.getMeasuredHeight();
                }
                layoutParams.height = i13;
                c0Var = r20Var.F;
                if (c0Var instanceof org.telegram.ui.Components.pz) {
                    org.telegram.ui.Components.pz pzVar = (org.telegram.ui.Components.pz) c0Var;
                    kVar = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
                    pzVar.M = kVar.getMeasuredHeight();
                    pzVar.p1();
                    ((org.telegram.ui.Components.pz) r20Var.F).S = 0;
                }
                super.onMeasure(i10, i11);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    r20Var.u0();
                    return;
                }
                return;
            }
        }
        i12 = AndroidUtilities.statusBarHeight;
        r20Var.I = i12;
        o20Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = r20Var.e.getLayoutParams();
        i13 = r20Var.E;
        if (i13 <= 0) {
        }
        layoutParams2.height = i13;
        c0Var = r20Var.F;
        if (c0Var instanceof org.telegram.ui.Components.pz) {
        }
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
