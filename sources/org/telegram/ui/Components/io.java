package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class io extends LinearLayout {
    public uj0 a;
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
        float f10 = (1.0f - this.f) * this.e;
        this.b.setTranslationX(f10);
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setTranslationX(f10);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11 = i9;
        int i12 = this.d;
        int makeMeasureSpec = i12 != 0 ? View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31) : i10;
        uj0 uj0Var = this.a;
        if (uj0Var == null || this.b == null) {
            super.onMeasure(i11, makeMeasureSpec);
        } else {
            uj0Var.getLayoutParams().width = -2;
            ((LinearLayout.LayoutParams) this.a.getLayoutParams()).rightMargin = 0;
            this.e = 0.0f;
            super.onMeasure(i11, makeMeasureSpec);
            int measuredWidth = this.a.getMeasuredWidth();
            if (this.b.getSwipeBack() != null && this.b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.b.getSwipeBack().getMeasuredWidth();
            }
            if (this.b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.b.getMeasuredWidth();
            }
            if (this.a.q()) {
                i11 = View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30);
            }
            uj0 uj0Var2 = this.a;
            if (!uj0Var2.a1 && uj0Var2.M0 && uj0Var2.getMeasuredWidth() > 0) {
                int min = Math.min(AndroidUtilities.dp(320.0f), uj0Var2.getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                StaticLayout staticLayout = new StaticLayout(uj0Var2.N0.getText(), uj0Var2.N0.getPaint(), min, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                uj0Var2.P0 = staticLayout.getHeight();
                uj0Var2.O0 = 0;
                for (int i13 = 0; i13 < staticLayout.getLineCount(); i13++) {
                    uj0Var2.O0 = Math.max(uj0Var2.O0, (int) Math.ceil(staticLayout.getLineWidth(i13)));
                }
                if (staticLayout.getLineCount() <= 1 || uj0Var2.N0.getText().toString().contains("\n")) {
                    uj0Var2.N0.setWidth(AndroidUtilities.dp(16.0f) + min);
                } else {
                    int a2 = kh.x3.a(uj0Var2.N0.getText(), uj0Var2.N0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(uj0Var2.N0.getText(), uj0Var2.N0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    uj0Var2.P0 = staticLayout2.getHeight();
                    uj0Var2.O0 = 0;
                    for (int i14 = 0; i14 < staticLayout2.getLineCount(); i14++) {
                        uj0Var2.O0 = Math.max(uj0Var2.O0, (int) Math.ceil(staticLayout2.getLineWidth(i14)));
                    }
                    uj0Var2.N0.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    uj0Var2.N0.setWidth(AndroidUtilities.dp(48.0f) + a2);
                }
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + uj0Var2.P0);
                int i15 = uj0Var2.I0;
                if (i15 == 1 || i15 == 2) {
                    max = AndroidUtilities.dp(20.0f);
                } else {
                    uj0Var2.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + max;
                }
                ((FrameLayout.LayoutParams) uj0Var2.v0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) uj0Var2.b.getLayoutParams()).topMargin = max;
                uj0Var2.a1 = true;
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
            this.a.C = AndroidUtilities.dp(36.0f);
            if (this.a.q()) {
                this.a.getLayoutParams().width = totalWidth;
                this.a.C = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
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
                int i16 = (int) (r6.C - measuredWidth2);
                this.a.C = i16;
                if (i16 < AndroidUtilities.dp(36.0f)) {
                    this.e = 0.0f;
                    this.a.C = AndroidUtilities.dp(36.0f);
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
            super.onMeasure(i11, makeMeasureSpec);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f10) {
        this.b.setTranslationY(f10);
        this.n = f10;
        a();
    }

    public void setMaxHeight(int i9) {
        this.d = i9;
    }

    public void setPopupAlpha(float f10) {
        this.b.setAlpha(f10);
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new g1(18, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            fg0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.x.add(new eg0() { // from class: org.telegram.ui.Components.ho
                @Override // org.telegram.ui.Components.eg0
                public final void a(float f10, float f11) {
                    io ioVar = io.this;
                    FrameLayout frameLayout = ioVar.c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f11);
                    }
                    ioVar.f = f11;
                    ioVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(uj0 uj0Var) {
        this.a = uj0Var;
        if (uj0Var != null) {
            uj0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f10) {
        this.b.setReactionsTransitionProgress(f10);
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
            float f11 = (f10 * 0.5f) + 0.5f;
            this.c.setPivotX(r0.getMeasuredWidth());
            this.c.setPivotY(0.0f);
            this.r = (1.0f - f10) * (-this.b.getMeasuredHeight());
            a();
            this.c.setScaleX(f11);
            this.c.setScaleY(f11);
        }
    }
}
