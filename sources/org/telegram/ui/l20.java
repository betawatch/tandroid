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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class l20 extends org.telegram.ui.Components.qc0 {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public final Paint E0;
    public Boolean F0;
    public final /* synthetic */ m20 G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l20(m20 m20Var, Context context) {
        super(context);
        this.G0 = m20Var;
        new Paint(1);
        this.E0 = new Paint(1);
    }

    private void setLightStatusBar(int i10) {
        boolean z4 = AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f;
        Boolean bool = this.F0;
        if (bool == null || bool.booleanValue() != z4) {
            View view = this.G0.fragmentView;
            this.F0 = Boolean.valueOf(z4);
            AndroidUtilities.setLightStatusBar(view, z4);
        }
    }

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.k kVar7;
        m20 m20Var = this.G0;
        Paint paint = m20Var.H;
        lg.a aVar = m20Var.y;
        if (!m20Var.f) {
            if (m20Var.h) {
                float f10 = m20Var.n + 0.016f;
                m20Var.n = f10;
                if (f10 > 3.0f) {
                    m20Var.h = false;
                }
            } else {
                float f11 = m20Var.n - 0.016f;
                m20Var.n = f11;
                if (f11 < 1.0f) {
                    m20Var.h = true;
                }
            }
        }
        View m9 = m20Var.c.getLayoutManager() != null ? m20Var.c.getLayoutManager().m(0) : null;
        m20Var.r = m9 != null ? m9.getBottom() : 0;
        kVar = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f12 = 1.0f - ((m20Var.r - dp) / (m20Var.G - dp));
        m20Var.v = f12;
        m20Var.v = Utilities.clamp(f12, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (m20Var.r < dp2) {
            m20Var.r = dp2;
        }
        float f13 = m20Var.x;
        m20Var.x = 0.0f;
        if (m20Var.r < AndroidUtilities.dp(30.0f) + dp2) {
            m20Var.x = ((AndroidUtilities.dp(30.0f) + dp2) - m20Var.r) / AndroidUtilities.dp(30.0f);
        }
        if (m20Var.E) {
            m20Var.x = 1.0f;
            m20Var.v = 1.0f;
        }
        if (f13 != m20Var.x) {
            m20Var.c.invalidate();
        }
        int i10 = m20Var.r;
        kVar3 = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
        int measuredHeight = kVar3.getMeasuredHeight();
        int measuredHeight2 = aVar.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) aVar.d;
        TextView textView = (TextView) aVar.b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i10 - ((measuredHeight2 + measuredHeight) - m20Var.F));
        kVar4 = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - m20Var.F) - textView.getMeasuredHeight()) / 2.0f) + m20Var.F) - aVar.getTop()) - textView.getTop(), dp3);
        aVar.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f14 = m20Var.v;
        float w10 = e2.c.w(1.0f, f14, 0.4f, 0.6f);
        float f15 = 1.0f - (f14 > 0.5f ? (f14 - 0.5f) / 0.5f : 0.0f);
        frameLayout.setScaleX(w10);
        frameLayout.setScaleY(w10);
        frameLayout.setAlpha(f15);
        ((FrameLayout) aVar.e).setAlpha(f15);
        ((org.telegram.ui.Components.g90) aVar.c).setAlpha(f15);
        m20Var.e.setAlpha(1.0f - m20Var.v);
        m20Var.e.setTranslationY((frameLayout.getY() + aVar.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f16 = m20Var.v;
        textView.setTranslationX((1.0f - org.telegram.ui.Components.pr.h.getInterpolation(1.0f - (f16 > 0.3f ? (f16 - 0.3f) / 0.7f : 0.0f))) * dp4);
        if (!m20Var.f) {
            invalidate();
        }
        m20Var.a.d(0, (-getMeasuredWidth()) * 0.1f * m20Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (m20Var.J) {
            int themedColor = m20Var.getThemedColor(org.telegram.ui.ActionBar.k6.a7);
            Paint paint2 = this.E0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), m20Var.a.f);
        }
        int d = i0.a.d(f15, m20Var.getThemedColor(org.telegram.ui.ActionBar.k6.j5), m20Var.getThemedColor(m20Var.J ? org.telegram.ui.ActionBar.k6.G6 : org.telegram.ui.ActionBar.k6.Tj));
        kVar5 = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
        kVar5.getBackButton().setColorFilter(d);
        textView.setTextColor(d);
        paint.setAlpha((int) ((1.0f - f15) * 255.0f));
        int i11 = org.telegram.ui.ActionBar.k6.Sj;
        g6Var = ((org.telegram.ui.ActionBar.p2) m20Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.v0(i11, g6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        kVar6 = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, kVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f15 > 0.01f || !m20Var.q0()) {
            return;
        }
        f5Var = ((org.telegram.ui.ActionBar.p2) m20Var).parentLayout;
        kVar7 = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
        ((ActionBarLayout) f5Var).p(canvas, 255, kVar7.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        m20 m20Var = this.G0;
        kVar = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
            ImageView backButton = kVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (vg.i.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        this.D0 = true;
                    }
                }
                if (this.D0) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return dispatchTouchEvent;
                    }
                    this.D0 = false;
                    return dispatchTouchEvent;
                }
            }
        }
        lg.a aVar = m20Var.y;
        float x10 = aVar.getX();
        FrameLayout frameLayout = (FrameLayout) aVar.e;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        org.telegram.ui.Components.g90 g90Var = (org.telegram.ui.Components.g90) aVar.c;
        float x11 = g90Var.getX() + x10;
        float y10 = g90Var.getY() + aVar.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x11, y10, g90Var.getMeasuredWidth() + x11, g90Var.getMeasuredHeight() + y10);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.B0) || m20Var.c.H1 || (layout = g90Var.getLayout()) == null) {
            f10 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f10 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && m20Var.x < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y10);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.B0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.B0 = false;
                    }
                    g90Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + aVar.getX();
        float y11 = frameLayout2.getY() + aVar.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y11, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.A0) && !m20Var.c.H1 && isClickable && m20Var.x < f10) {
            motionEvent.offsetLocation(-x12, -y11);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.A0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.A0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + aVar.getX();
        float y12 = frameLayout.getY() + aVar.getY();
        rectF2.set(x13, y12, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y12);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.C0) && !m20Var.c.H1 && m20Var.x < f10) {
            motionEvent.offsetLocation(-x13, -y12);
            if (motionEvent.getAction() == 0) {
                this.C0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.C0 = false;
            }
            frameLayout.dispatchTouchEvent(motionEvent);
            if (this.C0) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        m20 m20Var = this.G0;
        if (view != m20Var.c) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        kVar = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
        canvas.clipRect(0, kVar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j10);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Components.qc0, org.telegram.ui.Components.pv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.qc0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.f5 f5Var;
        int i12;
        int i13;
        f2.j0 j0Var;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.f5 f5Var2;
        m20 m20Var = this.G0;
        lg.a aVar = m20Var.y;
        m20Var.E = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        f5Var = ((org.telegram.ui.ActionBar.p2) m20Var).parentLayout;
        if (f5Var != null) {
            f5Var2 = ((org.telegram.ui.ActionBar.p2) m20Var).parentLayout;
            if (((ActionBarLayout) f5Var2).J0) {
                i12 = 0;
                m20Var.F = i12;
                aVar.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = m20Var.e.getLayoutParams();
                i13 = m20Var.B;
                if (i13 <= 0) {
                    i13 = aVar.getMeasuredHeight();
                }
                layoutParams.height = i13;
                j0Var = m20Var.C;
                if (j0Var instanceof org.telegram.ui.Components.rz) {
                    org.telegram.ui.Components.rz rzVar = (org.telegram.ui.Components.rz) j0Var;
                    kVar = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
                    rzVar.M = kVar.getMeasuredHeight();
                    rzVar.p1();
                    ((org.telegram.ui.Components.rz) m20Var.C).S = 0;
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
        m20Var.F = i12;
        aVar.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = m20Var.e.getLayoutParams();
        i13 = m20Var.B;
        if (i13 <= 0) {
        }
        layoutParams2.height = i13;
        j0Var = m20Var.C;
        if (j0Var instanceof org.telegram.ui.Components.rz) {
        }
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
