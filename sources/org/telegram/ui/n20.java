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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public class n20 extends org.telegram.ui.Components.lc0 {
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public final Paint H0;
    public Boolean I0;
    public final /* synthetic */ o20 J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n20(o20 o20Var, Context context) {
        super(context);
        this.J0 = o20Var;
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

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.k kVar7;
        o20 o20Var = this.J0;
        Paint paint = o20Var.K;
        l20 l20Var = o20Var.y;
        if (!o20Var.f) {
            if (o20Var.h) {
                float f7 = o20Var.n + 0.016f;
                o20Var.n = f7;
                if (f7 > 3.0f) {
                    o20Var.h = false;
                }
            } else {
                float f10 = o20Var.n - 0.016f;
                o20Var.n = f10;
                if (f10 < 1.0f) {
                    o20Var.h = true;
                }
            }
        }
        View m10 = o20Var.c.getLayoutManager() != null ? o20Var.c.getLayoutManager().m(0) : null;
        o20Var.r = m10 != null ? m10.getBottom() : 0;
        kVar = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f11 = 1.0f - ((o20Var.r - dp) / (o20Var.J - dp));
        o20Var.v = f11;
        o20Var.v = Utilities.clamp(f11, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (o20Var.r < dp2) {
            o20Var.r = dp2;
        }
        float f12 = o20Var.x;
        o20Var.x = 0.0f;
        if (o20Var.r < AndroidUtilities.dp(30.0f) + dp2) {
            o20Var.x = ((AndroidUtilities.dp(30.0f) + dp2) - o20Var.r) / AndroidUtilities.dp(30.0f);
        }
        if (o20Var.H) {
            o20Var.x = 1.0f;
            o20Var.v = 1.0f;
        }
        if (f12 != o20Var.x) {
            o20Var.c.invalidate();
        }
        int i10 = o20Var.r;
        kVar3 = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
        int measuredHeight = kVar3.getMeasuredHeight();
        int measuredHeight2 = l20Var.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) l20Var.d;
        TextView textView = (TextView) l20Var.b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i10 - ((measuredHeight2 + measuredHeight) - o20Var.I));
        kVar4 = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - o20Var.I) - textView.getMeasuredHeight()) / 2.0f) + o20Var.I) - l20Var.getTop()) - textView.getTop(), dp3);
        l20Var.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f13 = o20Var.v;
        float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f13, 0.4f, 0.6f);
        float f14 = 1.0f - (f13 > 0.5f ? (f13 - 0.5f) / 0.5f : 0.0f);
        frameLayout.setScaleX(z10);
        frameLayout.setScaleY(z10);
        frameLayout.setAlpha(f14);
        ((FrameLayout) l20Var.e).setAlpha(f14);
        ((org.telegram.ui.Components.d90) l20Var.c).setAlpha(f14);
        o20Var.e.setAlpha(1.0f - o20Var.v);
        o20Var.e.setTranslationY((frameLayout.getY() + l20Var.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f15 = o20Var.v;
        textView.setTranslationX((1.0f - org.telegram.ui.Components.rr.h.getInterpolation(1.0f - (f15 > 0.3f ? (f15 - 0.3f) / 0.7f : 0.0f))) * dp4);
        if (!o20Var.f) {
            invalidate();
        }
        o20Var.a.d(0, (-getMeasuredWidth()) * 0.1f * o20Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (o20Var.M) {
            int themedColor = o20Var.getThemedColor(org.telegram.ui.ActionBar.h6.a7);
            Paint paint2 = this.H0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), o20Var.a.f);
        }
        int d = i0.a.d(f14, o20Var.getThemedColor(org.telegram.ui.ActionBar.h6.j5), o20Var.getThemedColor(o20Var.M ? org.telegram.ui.ActionBar.h6.G6 : org.telegram.ui.ActionBar.h6.Tj));
        kVar5 = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
        kVar5.getBackButton().setColorFilter(d);
        textView.setTextColor(d);
        paint.setAlpha((int) ((1.0f - f14) * 255.0f));
        int i11 = org.telegram.ui.ActionBar.h6.Sj;
        d6Var = ((org.telegram.ui.ActionBar.n2) o20Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.v0(i11, d6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        kVar6 = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, kVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f14 > 0.01f || !o20Var.q0()) {
            return;
        }
        c5Var = ((org.telegram.ui.ActionBar.n2) o20Var).parentLayout;
        kVar7 = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
        ((ActionBarLayout) c5Var).p(canvas, 255, kVar7.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f7;
        org.telegram.ui.ActionBar.k kVar2;
        o20 o20Var = this.J0;
        kVar = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
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
        l20 l20Var = o20Var.y;
        float x10 = l20Var.getX();
        FrameLayout frameLayout = (FrameLayout) l20Var.e;
        FrameLayout frameLayout2 = (FrameLayout) l20Var.d;
        org.telegram.ui.Components.d90 d90Var = (org.telegram.ui.Components.d90) l20Var.c;
        float x11 = d90Var.getX() + x10;
        float y3 = d90Var.getY() + l20Var.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x11, y3, d90Var.getMeasuredWidth() + x11, d90Var.getMeasuredHeight() + y3);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.E0) || o20Var.c.K1 || (layout = d90Var.getLayout()) == null) {
            f7 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f7 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && o20Var.x < 1.0f) {
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
        float x12 = frameLayout2.getX() + l20Var.getX();
        float y10 = frameLayout2.getY() + l20Var.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y10, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.D0) && !o20Var.c.K1 && isClickable && o20Var.x < f7) {
            motionEvent.offsetLocation(-x12, -y10);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.D0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.D0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + l20Var.getX();
        float y11 = frameLayout.getY() + l20Var.getY();
        rectF2.set(x13, y11, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.F0) && !o20Var.c.K1 && o20Var.x < f7) {
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
        o20 o20Var = this.J0;
        if (view != o20Var.c) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        kVar = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
        canvas.clipRect(0, kVar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j3);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Components.lc0, org.telegram.ui.Components.pv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.lc0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.c5 c5Var;
        int i12;
        int i13;
        s4.c0 c0Var;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.c5 c5Var2;
        o20 o20Var = this.J0;
        l20 l20Var = o20Var.y;
        o20Var.H = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        c5Var = ((org.telegram.ui.ActionBar.n2) o20Var).parentLayout;
        if (c5Var != null) {
            c5Var2 = ((org.telegram.ui.ActionBar.n2) o20Var).parentLayout;
            if (((ActionBarLayout) c5Var2).M0) {
                i12 = 0;
                o20Var.I = i12;
                l20Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = o20Var.e.getLayoutParams();
                i13 = o20Var.E;
                if (i13 <= 0) {
                    i13 = l20Var.getMeasuredHeight();
                }
                layoutParams.height = i13;
                c0Var = o20Var.F;
                if (c0Var instanceof org.telegram.ui.Components.qz) {
                    org.telegram.ui.Components.qz qzVar = (org.telegram.ui.Components.qz) c0Var;
                    kVar = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
                    qzVar.M = kVar.getMeasuredHeight();
                    qzVar.p1();
                    ((org.telegram.ui.Components.qz) o20Var.F).S = 0;
                }
                super.onMeasure(i10, i11);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    o20Var.u0();
                    return;
                }
                return;
            }
        }
        i12 = AndroidUtilities.statusBarHeight;
        o20Var.I = i12;
        l20Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = o20Var.e.getLayoutParams();
        i13 = o20Var.E;
        if (i13 <= 0) {
        }
        layoutParams2.height = i13;
        c0Var = o20Var.F;
        if (c0Var instanceof org.telegram.ui.Components.qz) {
        }
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
