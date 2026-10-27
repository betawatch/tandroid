package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class fp extends LinearLayout {
    public gl0 a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout b;
    public FrameLayout c;
    public int d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;

    public final void a() {
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.n + this.r);
        }
    }

    public final void b() {
        float f7 = (1.0f - this.f) * this.e;
        this.b.setTranslationX(f7);
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setTranslationX(f7);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = i10;
        int i13 = this.d;
        int makeMeasureSpec = i13 != 0 ? View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_31) : i11;
        gl0 gl0Var = this.a;
        if (gl0Var == null || this.b == null) {
            super.onMeasure(i12, makeMeasureSpec);
        } else {
            gl0Var.getLayoutParams().width = -2;
            ((LinearLayout.LayoutParams) this.a.getLayoutParams()).rightMargin = 0;
            this.e = 0.0f;
            super.onMeasure(i12, makeMeasureSpec);
            int measuredWidth = this.a.getMeasuredWidth();
            if (this.b.getSwipeBack() != null && this.b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.b.getSwipeBack().getMeasuredWidth();
            }
            if (this.b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.b.getMeasuredWidth();
            }
            if (this.a.q()) {
                i12 = View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30);
            }
            gl0 gl0Var2 = this.a;
            if (!gl0Var2.f1 && gl0Var2.Q0 && gl0Var2.getMeasuredWidth() > 0) {
                int g7 = org.telegram.ui.d3.g(16.0f, gl0Var2.getMeasuredWidth(), AndroidUtilities.dp(320.0f));
                StaticLayout staticLayout = new StaticLayout(gl0Var2.R0.getText(), gl0Var2.R0.getPaint(), g7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                gl0Var2.T0 = staticLayout.getHeight();
                gl0Var2.S0 = 0;
                for (int i14 = 0; i14 < staticLayout.getLineCount(); i14++) {
                    gl0Var2.S0 = Math.max(gl0Var2.S0, (int) Math.ceil(staticLayout.getLineWidth(i14)));
                }
                if (staticLayout.getLineCount() <= 1 || gl0Var2.R0.getText().toString().contains("\n")) {
                    gl0Var2.R0.setWidth(AndroidUtilities.dp(16.0f) + g7);
                } else {
                    int a2 = fi.v3.a(gl0Var2.R0.getText(), gl0Var2.R0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(gl0Var2.R0.getText(), gl0Var2.R0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    gl0Var2.T0 = staticLayout2.getHeight();
                    gl0Var2.S0 = 0;
                    for (int i15 = 0; i15 < staticLayout2.getLineCount(); i15++) {
                        gl0Var2.S0 = Math.max(gl0Var2.S0, (int) Math.ceil(staticLayout2.getLineWidth(i15)));
                    }
                    gl0Var2.R0.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    gl0Var2.R0.setWidth(AndroidUtilities.dp(48.0f) + a2);
                }
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + gl0Var2.T0);
                int i16 = gl0Var2.M0;
                if (i16 == 1 || i16 == 2) {
                    max = AndroidUtilities.dp(20.0f);
                } else {
                    gl0Var2.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + max;
                }
                ((FrameLayout.LayoutParams) gl0Var2.z0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) gl0Var2.b.getLayoutParams()).topMargin = max;
                gl0Var2.f1 = true;
            }
            int totalWidth = this.a.getTotalWidth();
            View childAt = (this.b.getSwipeBack() != null ? this.b.getSwipeBack() : this.b).getChildAt(0);
            int dp = AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
            int hintTextWidth = this.a.getHintTextWidth();
            if (hintTextWidth > dp) {
                dp = hintTextWidth;
            } else if (dp > measuredWidth) {
                dp = measuredWidth;
            }
            this.a.G = AndroidUtilities.dp(36.0f);
            if (this.a.q()) {
                this.a.getLayoutParams().width = totalWidth;
                this.a.G = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            } else if (totalWidth > dp) {
                int dp2 = ((dp - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int dp3 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * dp2);
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > dp3) {
                    dp3 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (dp3 <= totalWidth && dp2 != this.a.getItemsCount()) {
                    totalWidth = dp3;
                }
                this.a.getLayoutParams().width = totalWidth;
            } else {
                this.a.getLayoutParams().width = -2;
            }
            if (this.a.getMeasuredWidth() == measuredWidth && this.a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.e = measuredWidth2;
                int i17 = (int) (r6.G - measuredWidth2);
                this.a.G = i17;
                if (i17 < AndroidUtilities.dp(36.0f)) {
                    this.e = 0.0f;
                    this.a.G = AndroidUtilities.dp(36.0f);
                }
                b();
            } else {
                int measuredWidth3 = this.b.getSwipeBack() != null ? this.b.getSwipeBack().getMeasuredWidth() - this.b.getSwipeBack().getChildAt(0).getMeasuredWidth() : 0;
                if (this.a.getLayoutParams().width != -2 && this.a.getLayoutParams().width + measuredWidth3 > measuredWidth) {
                    measuredWidth3 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.a.getLayoutParams().width);
                }
                r5 = measuredWidth3 >= 0 ? measuredWidth3 : 0;
                ((LinearLayout.LayoutParams) this.a.getLayoutParams()).rightMargin = r5;
                this.e = 0.0f;
                b();
            }
            if (this.c != null) {
                if (this.a.q()) {
                    this.c.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.c.getLayoutParams().width = -1;
                }
                if (this.b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f) + r5;
                } else {
                    ((LinearLayout.LayoutParams) this.c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
                }
            }
            super.onMeasure(i12, makeMeasureSpec);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f7) {
        this.b.setTranslationY(f7);
        this.n = f7;
        a();
    }

    public void setMaxHeight(int i10) {
        this.d = i10;
    }

    public void setPopupAlpha(float f7) {
        this.b.setAlpha(f7);
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new p1(18, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            th0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.x.add(new sh0() { // from class: org.telegram.ui.Components.ep
                @Override // org.telegram.ui.Components.sh0
                public final void a(float f7, float f10) {
                    fp fpVar = fp.this;
                    FrameLayout frameLayout = fpVar.c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f10);
                    }
                    fpVar.f = f10;
                    fpVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(gl0 gl0Var) {
        this.a = gl0Var;
        if (gl0Var != null) {
            gl0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f7) {
        this.b.setReactionsTransitionProgress(f7);
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
            float f10 = (f7 * 0.5f) + 0.5f;
            this.c.setPivotX(r0.getMeasuredWidth());
            this.c.setPivotY(0.0f);
            this.r = (1.0f - f7) * (-this.b.getMeasuredHeight());
            a();
            this.c.setScaleX(f10);
            this.c.setScaleY(f10);
        }
    }
}
