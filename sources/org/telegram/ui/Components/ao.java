package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class ao extends LinearLayout {
    public li0 a;
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11 = i3;
        int i12 = this.d;
        int makeMeasureSpec = i12 != 0 ? View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31) : i10;
        li0 li0Var = this.a;
        if (li0Var == null || this.b == null) {
            super.onMeasure(i11, makeMeasureSpec);
        } else {
            li0Var.getLayoutParams().width = -2;
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
            li0 li0Var2 = this.a;
            if (!li0Var2.g1 && li0Var2.R0 && li0Var2.getMeasuredWidth() > 0) {
                int C = org.telegram.messenger.camera.q.C(16.0f, li0Var2.getMeasuredWidth(), org.telegram.messenger.g0.L(320.0f));
                StaticLayout staticLayout = new StaticLayout(li0Var2.S0.getText(), li0Var2.S0.getPaint(), C, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                li0Var2.U0 = staticLayout.getHeight();
                li0Var2.T0 = 0;
                for (int i13 = 0; i13 < staticLayout.getLineCount(); i13++) {
                    li0Var2.T0 = Math.max(li0Var2.T0, (int) Math.ceil(staticLayout.getLineWidth(i13)));
                }
                if (staticLayout.getLineCount() <= 1 || li0Var2.S0.getText().toString().contains("\n")) {
                    li0Var2.S0.setWidth(org.telegram.messenger.g0.L(16.0f) + C);
                } else {
                    int a10 = gi.l3.a(li0Var2.S0.getText(), li0Var2.S0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(li0Var2.S0.getText(), li0Var2.S0.getPaint(), a10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    li0Var2.U0 = staticLayout2.getHeight();
                    li0Var2.T0 = 0;
                    for (int i14 = 0; i14 < staticLayout2.getLineCount(); i14++) {
                        li0Var2.T0 = Math.max(li0Var2.T0, (int) Math.ceil(staticLayout2.getLineWidth(i14)));
                    }
                    li0Var2.S0.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
                    li0Var2.S0.setWidth(org.telegram.messenger.g0.L(48.0f) + a10);
                }
                int max = Math.max(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(7.0f) + li0Var2.U0);
                int i15 = li0Var2.N0;
                if (i15 == 1 || i15 == 2) {
                    max = org.telegram.messenger.g0.L(20.0f);
                } else {
                    li0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(22.0f) + org.telegram.messenger.g0.L(52.0f) + max;
                }
                ((FrameLayout.LayoutParams) li0Var2.A0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) li0Var2.b.getLayoutParams()).topMargin = max;
                li0Var2.g1 = true;
            }
            int totalWidth = this.a.getTotalWidth();
            View childAt = (this.b.getSwipeBack() != null ? this.b.getSwipeBack() : this.b).getChildAt(0);
            int L = org.telegram.messenger.g0.L(36.0f) + org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(16.0f) + childAt.getMeasuredWidth();
            int hintTextWidth = this.a.getHintTextWidth();
            if (hintTextWidth > L) {
                L = hintTextWidth;
            } else if (L > measuredWidth) {
                L = measuredWidth;
            }
            this.a.H = org.telegram.messenger.g0.L(36.0f);
            if (this.a.q()) {
                this.a.getLayoutParams().width = totalWidth;
                this.a.H = Math.max((totalWidth - childAt.getMeasuredWidth()) - org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f));
            } else if (totalWidth > L) {
                int L2 = ((L - org.telegram.messenger.g0.L(16.0f)) / org.telegram.messenger.g0.L(36.0f)) + 1;
                int L3 = org.telegram.messenger.g0.L(8.0f) + (org.telegram.messenger.g0.L(36.0f) * L2);
                if (org.telegram.messenger.g0.L(24.0f) + hintTextWidth > L3) {
                    L3 = org.telegram.messenger.g0.L(24.0f) + hintTextWidth;
                }
                if (L3 <= totalWidth && L2 != this.a.getItemsCount()) {
                    totalWidth = L3;
                }
                this.a.getLayoutParams().width = totalWidth;
            } else {
                this.a.getLayoutParams().width = -2;
            }
            if (this.a.getMeasuredWidth() == measuredWidth && this.a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.e = measuredWidth2;
                int i16 = (int) (r6.H - measuredWidth2);
                this.a.H = i16;
                if (i16 < org.telegram.messenger.g0.L(36.0f)) {
                    this.e = 0.0f;
                    this.a.H = org.telegram.messenger.g0.L(36.0f);
                }
                b();
            } else {
                int measuredWidth3 = this.b.getSwipeBack() != null ? this.b.getSwipeBack().getMeasuredWidth() - this.b.getSwipeBack().getChildAt(0).getMeasuredWidth() : 0;
                if (this.a.getLayoutParams().width != -2 && this.a.getLayoutParams().width + measuredWidth3 > measuredWidth) {
                    measuredWidth3 = org.telegram.messenger.g0.L(8.0f) + (measuredWidth - this.a.getLayoutParams().width);
                }
                r5 = measuredWidth3 >= 0 ? measuredWidth3 : 0;
                ((LinearLayout.LayoutParams) this.a.getLayoutParams()).rightMargin = r5;
                this.e = 0.0f;
                b();
            }
            if (this.c != null) {
                if (this.a.q()) {
                    this.c.getLayoutParams().width = org.telegram.messenger.g0.L(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.c.getLayoutParams().width = -1;
                }
                if (this.b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.c.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(36.0f) + r5;
                } else {
                    ((LinearLayout.LayoutParams) this.c.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(36.0f);
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

    public void setMaxHeight(int i3) {
        this.d = i3;
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new org.telegram.ui.jo(22, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            xe0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.y.add(new we0() { // from class: org.telegram.ui.Components.zn
                @Override // org.telegram.ui.Components.we0
                public final void a(float f10, float f11) {
                    ao aoVar = ao.this;
                    FrameLayout frameLayout = aoVar.c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f11);
                    }
                    aoVar.f = f11;
                    aoVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(li0 li0Var) {
        this.a = li0Var;
        if (li0Var != null) {
            li0Var.setChatScrimView(this);
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
