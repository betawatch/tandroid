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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class k20 extends org.telegram.ui.Components.oc0 {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public final Paint E0;
    public Boolean F0;
    public final /* synthetic */ l20 G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k20(l20 l20Var, Context context) {
        super(context);
        this.G0 = l20Var;
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

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.k kVar7;
        l20 l20Var = this.G0;
        Paint paint = l20Var.H;
        kg.a aVar = l20Var.y;
        if (!l20Var.f) {
            if (l20Var.h) {
                float f10 = l20Var.n + 0.016f;
                l20Var.n = f10;
                if (f10 > 3.0f) {
                    l20Var.h = false;
                }
            } else {
                float f11 = l20Var.n - 0.016f;
                l20Var.n = f11;
                if (f11 < 1.0f) {
                    l20Var.h = true;
                }
            }
        }
        View m9 = l20Var.c.getLayoutManager() != null ? l20Var.c.getLayoutManager().m(0) : null;
        l20Var.r = m9 != null ? m9.getBottom() : 0;
        kVar = ((org.telegram.ui.ActionBar.p2) l20Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f12 = 1.0f - ((l20Var.r - dp) / (l20Var.G - dp));
        l20Var.v = f12;
        l20Var.v = Utilities.clamp(f12, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.p2) l20Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (l20Var.r < dp2) {
            l20Var.r = dp2;
        }
        float f13 = l20Var.x;
        l20Var.x = 0.0f;
        if (l20Var.r < AndroidUtilities.dp(30.0f) + dp2) {
            l20Var.x = ((AndroidUtilities.dp(30.0f) + dp2) - l20Var.r) / AndroidUtilities.dp(30.0f);
        }
        if (l20Var.E) {
            l20Var.x = 1.0f;
            l20Var.v = 1.0f;
        }
        if (f13 != l20Var.x) {
            l20Var.c.invalidate();
        }
        int i10 = l20Var.r;
        kVar3 = ((org.telegram.ui.ActionBar.p2) l20Var).actionBar;
        int measuredHeight = kVar3.getMeasuredHeight();
        int measuredHeight2 = aVar.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) aVar.d;
        TextView textView = (TextView) aVar.b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i10 - ((measuredHeight2 + measuredHeight) - l20Var.F));
        kVar4 = ((org.telegram.ui.ActionBar.p2) l20Var).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - l20Var.F) - textView.getMeasuredHeight()) / 2.0f) + l20Var.F) - aVar.getTop()) - textView.getTop(), dp3);
        aVar.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f14 = l20Var.v;
        float w10 = e2.c.w(1.0f, f14, 0.4f, 0.6f);
        float f15 = 1.0f - (f14 > 0.5f ? (f14 - 0.5f) / 0.5f : 0.0f);
        frameLayout.setScaleX(w10);
        frameLayout.setScaleY(w10);
        frameLayout.setAlpha(f15);
        ((FrameLayout) aVar.e).setAlpha(f15);
        ((org.telegram.ui.Components.e90) aVar.c).setAlpha(f15);
        l20Var.e.setAlpha(1.0f - l20Var.v);
        l20Var.e.setTranslationY((frameLayout.getY() + aVar.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f16 = l20Var.v;
        textView.setTranslationX((1.0f - org.telegram.ui.Components.nr.h.getInterpolation(1.0f - (f16 > 0.3f ? (f16 - 0.3f) / 0.7f : 0.0f))) * dp4);
        if (!l20Var.f) {
            invalidate();
        }
        l20Var.a.d(0, (-getMeasuredWidth()) * 0.1f * l20Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (l20Var.J) {
            int themedColor = l20Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7);
            Paint paint2 = this.E0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), l20Var.a.f);
        }
        int d = i0.a.d(f15, l20Var.getThemedColor(org.telegram.ui.ActionBar.j6.j5), l20Var.getThemedColor(l20Var.J ? org.telegram.ui.ActionBar.j6.G6 : org.telegram.ui.ActionBar.j6.Tj));
        kVar5 = ((org.telegram.ui.ActionBar.p2) l20Var).actionBar;
        kVar5.getBackButton().setColorFilter(d);
        textView.setTextColor(d);
        paint.setAlpha((int) ((1.0f - f15) * 255.0f));
        int i11 = org.telegram.ui.ActionBar.j6.Sj;
        f6Var = ((org.telegram.ui.ActionBar.p2) l20Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        kVar6 = ((org.telegram.ui.ActionBar.p2) l20Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, kVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f15 > 0.01f || !l20Var.q0()) {
            return;
        }
        e5Var = ((org.telegram.ui.ActionBar.p2) l20Var).parentLayout;
        kVar7 = ((org.telegram.ui.ActionBar.p2) l20Var).actionBar;
        ((ActionBarLayout) e5Var).p(canvas, 255, kVar7.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        l20 l20Var = this.G0;
        kVar = ((org.telegram.ui.ActionBar.p2) l20Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.p2) l20Var).actionBar;
            ImageView backButton = kVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (ug.i.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        kg.a aVar = l20Var.y;
        float x10 = aVar.getX();
        FrameLayout frameLayout = (FrameLayout) aVar.e;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        org.telegram.ui.Components.e90 e90Var = (org.telegram.ui.Components.e90) aVar.c;
        float x11 = e90Var.getX() + x10;
        float y10 = e90Var.getY() + aVar.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x11, y10, e90Var.getMeasuredWidth() + x11, e90Var.getMeasuredHeight() + y10);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.B0) || l20Var.c.H1 || (layout = e90Var.getLayout()) == null) {
            f10 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f10 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && l20Var.x < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y10);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.B0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.B0 = false;
                    }
                    e90Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + aVar.getX();
        float y11 = frameLayout2.getY() + aVar.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y11, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.A0) && !l20Var.c.H1 && isClickable && l20Var.x < f10) {
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
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.C0) && !l20Var.c.H1 && l20Var.x < f10) {
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
        l20 l20Var = this.G0;
        if (view != l20Var.c) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        kVar = ((org.telegram.ui.ActionBar.p2) l20Var).actionBar;
        canvas.clipRect(0, kVar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j10);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Components.oc0, org.telegram.ui.Components.qv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.oc0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.e5 e5Var;
        int i12;
        int i13;
        f2.i0 i0Var;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.e5 e5Var2;
        l20 l20Var = this.G0;
        kg.a aVar = l20Var.y;
        l20Var.E = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        e5Var = ((org.telegram.ui.ActionBar.p2) l20Var).parentLayout;
        if (e5Var != null) {
            e5Var2 = ((org.telegram.ui.ActionBar.p2) l20Var).parentLayout;
            if (((ActionBarLayout) e5Var2).J0) {
                i12 = 0;
                l20Var.F = i12;
                aVar.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = l20Var.e.getLayoutParams();
                i13 = l20Var.B;
                if (i13 <= 0) {
                    i13 = aVar.getMeasuredHeight();
                }
                layoutParams.height = i13;
                i0Var = l20Var.C;
                if (i0Var instanceof org.telegram.ui.Components.pz) {
                    org.telegram.ui.Components.pz pzVar = (org.telegram.ui.Components.pz) i0Var;
                    kVar = ((org.telegram.ui.ActionBar.p2) l20Var).actionBar;
                    pzVar.M = kVar.getMeasuredHeight();
                    pzVar.p1();
                    ((org.telegram.ui.Components.pz) l20Var.C).S = 0;
                }
                super.onMeasure(i10, i11);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    l20Var.u0();
                    return;
                }
                return;
            }
        }
        i12 = AndroidUtilities.statusBarHeight;
        l20Var.F = i12;
        aVar.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = l20Var.e.getLayoutParams();
        i13 = l20Var.B;
        if (i13 <= 0) {
        }
        layoutParams2.height = i13;
        i0Var = l20Var.C;
        if (i0Var instanceof org.telegram.ui.Components.pz) {
        }
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
