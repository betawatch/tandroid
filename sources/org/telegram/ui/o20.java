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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class o20 extends org.telegram.ui.Components.md0 {
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public final Paint H0;
    public Boolean I0;
    public final /* synthetic */ p20 J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o20(p20 p20Var, Context context) {
        super(context);
        this.J0 = p20Var;
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

    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.k kVar7;
        p20 p20Var = this.J0;
        Paint paint = p20Var.K;
        m20 m20Var = p20Var.y;
        if (!p20Var.f) {
            if (p20Var.h) {
                float f7 = p20Var.n + 0.016f;
                p20Var.n = f7;
                if (f7 > 3.0f) {
                    p20Var.h = false;
                }
            } else {
                float f10 = p20Var.n - 0.016f;
                p20Var.n = f10;
                if (f10 < 1.0f) {
                    p20Var.h = true;
                }
            }
        }
        View m10 = p20Var.c.getLayoutManager() != null ? p20Var.c.getLayoutManager().m(0) : null;
        p20Var.r = m10 != null ? m10.getBottom() : 0;
        kVar = ((org.telegram.ui.ActionBar.n2) p20Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f11 = 1.0f - ((p20Var.r - dp) / (p20Var.J - dp));
        p20Var.v = f11;
        p20Var.v = Utilities.clamp(f11, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.n2) p20Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (p20Var.r < dp2) {
            p20Var.r = dp2;
        }
        float f12 = p20Var.x;
        p20Var.x = 0.0f;
        if (p20Var.r < AndroidUtilities.dp(30.0f) + dp2) {
            p20Var.x = ((AndroidUtilities.dp(30.0f) + dp2) - p20Var.r) / AndroidUtilities.dp(30.0f);
        }
        if (p20Var.H) {
            p20Var.x = 1.0f;
            p20Var.v = 1.0f;
        }
        if (f12 != p20Var.x) {
            p20Var.c.invalidate();
        }
        p20Var.s0(p20Var.v);
        int i10 = p20Var.r;
        kVar3 = ((org.telegram.ui.ActionBar.n2) p20Var).actionBar;
        int measuredHeight = kVar3.getMeasuredHeight();
        int measuredHeight2 = m20Var.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) m20Var.d;
        TextView textView = (TextView) m20Var.b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i10 - ((measuredHeight2 + measuredHeight) - p20Var.I));
        kVar4 = ((org.telegram.ui.ActionBar.n2) p20Var).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - p20Var.I) - textView.getMeasuredHeight()) / 2.0f) + p20Var.I) - m20Var.getTop()) - textView.getTop(), dp3);
        m20Var.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f13 = p20Var.v;
        float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, f13, 0.4f, 0.6f);
        float f14 = 1.0f - (f13 > 0.5f ? (f13 - 0.5f) / 0.5f : 0.0f);
        frameLayout.setScaleX(y3);
        frameLayout.setScaleY(y3);
        frameLayout.setAlpha(f14);
        ((FrameLayout) m20Var.e).setAlpha(f14);
        ((org.telegram.ui.Components.ea0) m20Var.c).setAlpha(f14);
        p20Var.e.setAlpha(1.0f - p20Var.v);
        p20Var.e.setTranslationY((frameLayout.getY() + m20Var.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f15 = p20Var.v;
        textView.setTranslationX((1.0f - org.telegram.ui.Components.hs.h.getInterpolation(1.0f - (f15 > 0.3f ? (f15 - 0.3f) / 0.7f : 0.0f))) * dp4);
        if (!p20Var.f) {
            invalidate();
        }
        p20Var.a.d(0, (-getMeasuredWidth()) * 0.1f * p20Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (p20Var.M) {
            int themedColor = p20Var.getThemedColor(org.telegram.ui.ActionBar.i6.a7);
            Paint paint2 = this.H0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), p20Var.a.f);
        }
        int d = i0.a.d(f14, p20Var.getThemedColor(org.telegram.ui.ActionBar.i6.j5), p20Var.getThemedColor(p20Var.M ? org.telegram.ui.ActionBar.i6.G6 : org.telegram.ui.ActionBar.i6.Tj));
        kVar5 = ((org.telegram.ui.ActionBar.n2) p20Var).actionBar;
        kVar5.getBackButton().setColorFilter(d);
        textView.setTextColor(d);
        paint.setAlpha((int) ((1.0f - f14) * 255.0f));
        int i11 = org.telegram.ui.ActionBar.i6.Sj;
        e6Var = ((org.telegram.ui.ActionBar.n2) p20Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.w0(i11, e6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        kVar6 = ((org.telegram.ui.ActionBar.n2) p20Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, kVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f14 > 0.01f || !p20Var.q0()) {
            return;
        }
        d5Var = ((org.telegram.ui.ActionBar.n2) p20Var).parentLayout;
        kVar7 = ((org.telegram.ui.ActionBar.n2) p20Var).actionBar;
        ((ActionBarLayout) d5Var).p(canvas, 255, kVar7.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f7;
        org.telegram.ui.ActionBar.k kVar2;
        p20 p20Var = this.J0;
        kVar = ((org.telegram.ui.ActionBar.n2) p20Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) p20Var).actionBar;
            ImageView backButton = kVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (hh.j.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        m20 m20Var = p20Var.y;
        float x10 = m20Var.getX();
        FrameLayout frameLayout = (FrameLayout) m20Var.e;
        FrameLayout frameLayout2 = (FrameLayout) m20Var.d;
        org.telegram.ui.Components.ea0 ea0Var = (org.telegram.ui.Components.ea0) m20Var.c;
        float x11 = ea0Var.getX() + x10;
        float y3 = ea0Var.getY() + m20Var.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x11, y3, ea0Var.getMeasuredWidth() + x11, ea0Var.getMeasuredHeight() + y3);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.E0) || p20Var.c.I1 || (layout = ea0Var.getLayout()) == null) {
            f7 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f7 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && p20Var.x < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y3);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.E0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.E0 = false;
                    }
                    ea0Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + m20Var.getX();
        float y10 = frameLayout2.getY() + m20Var.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y10, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.D0) && !p20Var.c.I1 && isClickable && p20Var.x < f7) {
            motionEvent.offsetLocation(-x12, -y10);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.D0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.D0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + m20Var.getX();
        float y11 = frameLayout.getY() + m20Var.getY();
        rectF2.set(x13, y11, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.F0) && !p20Var.c.I1 && p20Var.x < f7) {
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
        p20 p20Var = this.J0;
        if (view != p20Var.c) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        kVar = ((org.telegram.ui.ActionBar.n2) p20Var).actionBar;
        canvas.clipRect(0, kVar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j3);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Components.md0, org.telegram.ui.Components.sw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.md0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.d5 d5Var;
        int i12;
        int i13;
        s4.d0 d0Var;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.d5 d5Var2;
        p20 p20Var = this.J0;
        m20 m20Var = p20Var.y;
        p20Var.H = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        d5Var = ((org.telegram.ui.ActionBar.n2) p20Var).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) p20Var).parentLayout;
            if (((ActionBarLayout) d5Var2).M0) {
                i12 = 0;
                p20Var.I = i12;
                m20Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = p20Var.e.getLayoutParams();
                i13 = p20Var.E;
                if (i13 <= 0) {
                    i13 = m20Var.getMeasuredHeight();
                }
                layoutParams.height = i13;
                d0Var = p20Var.F;
                if (d0Var instanceof org.telegram.ui.Components.f00) {
                    org.telegram.ui.Components.f00 f00Var = (org.telegram.ui.Components.f00) d0Var;
                    kVar = ((org.telegram.ui.ActionBar.n2) p20Var).actionBar;
                    f00Var.M = kVar.getMeasuredHeight();
                    f00Var.p1();
                    ((org.telegram.ui.Components.f00) p20Var.F).S = 0;
                }
                super.onMeasure(i10, i11);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    p20Var.v0();
                    return;
                }
                return;
            }
        }
        i12 = AndroidUtilities.statusBarHeight;
        p20Var.I = i12;
        m20Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = p20Var.e.getLayoutParams();
        i13 = p20Var.E;
        if (i13 <= 0) {
        }
        layoutParams2.height = i13;
        d0Var = p20Var.F;
        if (d0Var instanceof org.telegram.ui.Components.f00) {
        }
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
