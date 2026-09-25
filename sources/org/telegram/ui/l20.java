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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public class l20 extends org.telegram.ui.Components.wc0 {
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public final Paint H0;
    public Boolean I0;
    public final /* synthetic */ m20 J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l20(m20 m20Var, Context context) {
        super(context);
        this.J0 = m20Var;
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

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.k kVar7;
        m20 m20Var = this.J0;
        Paint paint = m20Var.K;
        j20 j20Var = m20Var.y;
        if (!m20Var.f) {
            if (m20Var.h) {
                float f7 = m20Var.n + 0.016f;
                m20Var.n = f7;
                if (f7 > 3.0f) {
                    m20Var.h = false;
                }
            } else {
                float f10 = m20Var.n - 0.016f;
                m20Var.n = f10;
                if (f10 < 1.0f) {
                    m20Var.h = true;
                }
            }
        }
        View m10 = m20Var.c.getLayoutManager() != null ? m20Var.c.getLayoutManager().m(0) : null;
        m20Var.r = m10 != null ? m10.getBottom() : 0;
        kVar = ((org.telegram.ui.ActionBar.m2) m20Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f11 = 1.0f - ((m20Var.r - dp) / (m20Var.J - dp));
        m20Var.v = f11;
        m20Var.v = Utilities.clamp(f11, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.m2) m20Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (m20Var.r < dp2) {
            m20Var.r = dp2;
        }
        float f12 = m20Var.x;
        m20Var.x = 0.0f;
        if (m20Var.r < AndroidUtilities.dp(30.0f) + dp2) {
            m20Var.x = ((AndroidUtilities.dp(30.0f) + dp2) - m20Var.r) / AndroidUtilities.dp(30.0f);
        }
        if (m20Var.H) {
            m20Var.x = 1.0f;
            m20Var.v = 1.0f;
        }
        if (f12 != m20Var.x) {
            m20Var.c.invalidate();
        }
        int i10 = m20Var.r;
        kVar3 = ((org.telegram.ui.ActionBar.m2) m20Var).actionBar;
        int measuredHeight = kVar3.getMeasuredHeight();
        int measuredHeight2 = j20Var.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) j20Var.d;
        TextView textView = (TextView) j20Var.b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i10 - ((measuredHeight2 + measuredHeight) - m20Var.I));
        kVar4 = ((org.telegram.ui.ActionBar.m2) m20Var).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - m20Var.I) - textView.getMeasuredHeight()) / 2.0f) + m20Var.I) - j20Var.getTop()) - textView.getTop(), dp3);
        j20Var.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f13 = m20Var.v;
        float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f13, 0.4f, 0.6f);
        float f14 = 1.0f - (f13 > 0.5f ? (f13 - 0.5f) / 0.5f : 0.0f);
        frameLayout.setScaleX(z10);
        frameLayout.setScaleY(z10);
        frameLayout.setAlpha(f14);
        ((FrameLayout) j20Var.e).setAlpha(f14);
        ((org.telegram.ui.Components.n90) j20Var.c).setAlpha(f14);
        m20Var.e.setAlpha(1.0f - m20Var.v);
        m20Var.e.setTranslationY((frameLayout.getY() + j20Var.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f15 = m20Var.v;
        textView.setTranslationX((1.0f - org.telegram.ui.Components.rr.h.getInterpolation(1.0f - (f15 > 0.3f ? (f15 - 0.3f) / 0.7f : 0.0f))) * dp4);
        if (!m20Var.f) {
            invalidate();
        }
        m20Var.a.d(0, (-getMeasuredWidth()) * 0.1f * m20Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (m20Var.M) {
            int themedColor = m20Var.getThemedColor(org.telegram.ui.ActionBar.h6.a7);
            Paint paint2 = this.H0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), m20Var.a.f);
        }
        int d = i0.a.d(f14, m20Var.getThemedColor(org.telegram.ui.ActionBar.h6.j5), m20Var.getThemedColor(m20Var.M ? org.telegram.ui.ActionBar.h6.G6 : org.telegram.ui.ActionBar.h6.Tj));
        kVar5 = ((org.telegram.ui.ActionBar.m2) m20Var).actionBar;
        kVar5.getBackButton().setColorFilter(d);
        textView.setTextColor(d);
        paint.setAlpha((int) ((1.0f - f14) * 255.0f));
        int i11 = org.telegram.ui.ActionBar.h6.Sj;
        d6Var = ((org.telegram.ui.ActionBar.m2) m20Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.v0(i11, d6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        kVar6 = ((org.telegram.ui.ActionBar.m2) m20Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, kVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f14 > 0.01f || !m20Var.q0()) {
            return;
        }
        b5Var = ((org.telegram.ui.ActionBar.m2) m20Var).parentLayout;
        kVar7 = ((org.telegram.ui.ActionBar.m2) m20Var).actionBar;
        ((ActionBarLayout) b5Var).p(canvas, 255, kVar7.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f7;
        org.telegram.ui.ActionBar.k kVar2;
        m20 m20Var = this.J0;
        kVar = ((org.telegram.ui.ActionBar.m2) m20Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.m2) m20Var).actionBar;
            ImageView backButton = kVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (hh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        j20 j20Var = m20Var.y;
        float x10 = j20Var.getX();
        FrameLayout frameLayout = (FrameLayout) j20Var.e;
        FrameLayout frameLayout2 = (FrameLayout) j20Var.d;
        org.telegram.ui.Components.n90 n90Var = (org.telegram.ui.Components.n90) j20Var.c;
        float x11 = n90Var.getX() + x10;
        float y3 = n90Var.getY() + j20Var.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x11, y3, n90Var.getMeasuredWidth() + x11, n90Var.getMeasuredHeight() + y3);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.E0) || m20Var.c.K1 || (layout = n90Var.getLayout()) == null) {
            f7 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f7 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && m20Var.x < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y3);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.E0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.E0 = false;
                    }
                    n90Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + j20Var.getX();
        float y10 = frameLayout2.getY() + j20Var.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y10, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.D0) && !m20Var.c.K1 && isClickable && m20Var.x < f7) {
            motionEvent.offsetLocation(-x12, -y10);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.D0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.D0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + j20Var.getX();
        float y11 = frameLayout.getY() + j20Var.getY();
        rectF2.set(x13, y11, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.F0) && !m20Var.c.K1 && m20Var.x < f7) {
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
        m20 m20Var = this.J0;
        if (view != m20Var.c) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        kVar = ((org.telegram.ui.ActionBar.m2) m20Var).actionBar;
        canvas.clipRect(0, kVar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j3);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Components.wc0, org.telegram.ui.Components.aw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.wc0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.b5 b5Var;
        int i12;
        int i13;
        s4.c0 c0Var;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.b5 b5Var2;
        m20 m20Var = this.J0;
        j20 j20Var = m20Var.y;
        m20Var.H = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        b5Var = ((org.telegram.ui.ActionBar.m2) m20Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) m20Var).parentLayout;
            if (((ActionBarLayout) b5Var2).M0) {
                i12 = 0;
                m20Var.I = i12;
                j20Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = m20Var.e.getLayoutParams();
                i13 = m20Var.E;
                if (i13 <= 0) {
                    i13 = j20Var.getMeasuredHeight();
                }
                layoutParams.height = i13;
                c0Var = m20Var.F;
                if (c0Var instanceof org.telegram.ui.Components.qz) {
                    org.telegram.ui.Components.qz qzVar = (org.telegram.ui.Components.qz) c0Var;
                    kVar = ((org.telegram.ui.ActionBar.m2) m20Var).actionBar;
                    qzVar.M = kVar.getMeasuredHeight();
                    qzVar.p1();
                    ((org.telegram.ui.Components.qz) m20Var.F).S = 0;
                }
                super.onMeasure(i10, i11);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    m20Var.u0();
                    return;
                }
                return;
            }
        }
        i12 = AndroidUtilities.statusBarHeight;
        m20Var.I = i12;
        j20Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = m20Var.e.getLayoutParams();
        i13 = m20Var.E;
        if (i13 <= 0) {
        }
        layoutParams2.height = i13;
        c0Var = m20Var.F;
        if (c0Var instanceof org.telegram.ui.Components.qz) {
        }
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
