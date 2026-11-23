package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class uo extends LinearLayout {
    public xi0 a;
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0387  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        xi0 xi0Var;
        float f10;
        float f11;
        int i11 = i7;
        int i12 = this.d;
        int makeMeasureSpec = i12 != 0 ? View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31) : i10;
        if (this.b != null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE) {
            this.b.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            if (this.b.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin > View.MeasureSpec.getSize(i11)) {
                z10 = true;
                xi0Var = this.a;
                if (xi0Var != null || this.b == null) {
                    super.onMeasure(i11, makeMeasureSpec);
                } else {
                    xi0Var.getLayoutParams().width = -2;
                    ((LinearLayout.LayoutParams) this.a.getLayoutParams()).rightMargin = 0;
                    this.e = 0.0f;
                    super.onMeasure(i11, makeMeasureSpec);
                    int measuredWidth = this.a.getMeasuredWidth();
                    if (this.b.getSwipeBack() != null && this.b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                        measuredWidth = this.b.getSwipeBack().getMeasuredWidth();
                    }
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
                    int measuredWidth2 = this.b.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin;
                    if (measuredWidth2 > measuredWidth) {
                        measuredWidth = measuredWidth2;
                    }
                    if (this.a.q()) {
                        i11 = View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30);
                    }
                    xi0 xi0Var2 = this.a;
                    float f12 = 16.0f;
                    if (xi0Var2.g1 || !xi0Var2.R0 || xi0Var2.getMeasuredWidth() <= 0) {
                        f10 = 16.0f;
                        f11 = 24.0f;
                    } else {
                        int D = org.telegram.messenger.o10.D(16.0f, xi0Var2.getMeasuredWidth(), org.telegram.messenger.g0.L(320.0f));
                        StaticLayout staticLayout = new StaticLayout(xi0Var2.S0.getText(), xi0Var2.S0.getPaint(), D, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        xi0Var2.U0 = staticLayout.getHeight();
                        xi0Var2.T0 = 0;
                        int i13 = 0;
                        while (i13 < staticLayout.getLineCount()) {
                            xi0Var2.T0 = Math.max(xi0Var2.T0, (int) Math.ceil(staticLayout.getLineWidth(i13)));
                            i13++;
                            f12 = f12;
                        }
                        f10 = f12;
                        f11 = 24.0f;
                        if (staticLayout.getLineCount() <= 1 || xi0Var2.S0.getText().toString().contains("\n")) {
                            xi0Var2.S0.setWidth(org.telegram.messenger.g0.L(f10) + D);
                        } else {
                            int a10 = hi.l3.a(xi0Var2.S0.getText(), xi0Var2.S0.getPaint());
                            StaticLayout staticLayout2 = new StaticLayout(xi0Var2.S0.getText(), xi0Var2.S0.getPaint(), a10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            xi0Var2.U0 = staticLayout2.getHeight();
                            xi0Var2.T0 = 0;
                            for (int i14 = 0; i14 < staticLayout2.getLineCount(); i14++) {
                                xi0Var2.T0 = Math.max(xi0Var2.T0, (int) Math.ceil(staticLayout2.getLineWidth(i14)));
                            }
                            xi0Var2.S0.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
                            xi0Var2.S0.setWidth(org.telegram.messenger.g0.L(48.0f) + a10);
                        }
                        int max = Math.max(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(7.0f) + xi0Var2.U0);
                        int i15 = xi0Var2.N0;
                        if (i15 == 1 || i15 == 2) {
                            max = org.telegram.messenger.g0.L(20.0f);
                        } else {
                            xi0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(22.0f) + org.telegram.messenger.g0.L(52.0f) + max;
                        }
                        ((FrameLayout.LayoutParams) xi0Var2.A0.getLayoutParams()).topMargin = max;
                        ((FrameLayout.LayoutParams) xi0Var2.b.getLayoutParams()).topMargin = max;
                        xi0Var2.g1 = true;
                    }
                    int totalWidth = this.a.getTotalWidth();
                    View childAt = (this.b.getSwipeBack() != null ? this.b.getSwipeBack() : this.b).getChildAt(0);
                    int L = org.telegram.messenger.g0.L(36.0f) + org.telegram.messenger.g0.L(f10) + org.telegram.messenger.g0.L(f10) + childAt.getMeasuredWidth();
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
                        int L2 = ((L - org.telegram.messenger.g0.L(f10)) / org.telegram.messenger.g0.L(36.0f)) + 1;
                        int L3 = org.telegram.messenger.g0.L(8.0f) + (org.telegram.messenger.g0.L(36.0f) * L2);
                        if (org.telegram.messenger.g0.L(f11) + hintTextWidth > L3) {
                            L3 = org.telegram.messenger.g0.L(f11) + hintTextWidth;
                        }
                        if (L3 <= totalWidth && L2 != this.a.getItemsCount()) {
                            totalWidth = L3;
                        }
                        this.a.getLayoutParams().width = totalWidth;
                    } else {
                        this.a.getLayoutParams().width = -2;
                    }
                    if (this.a.getMeasuredWidth() == measuredWidth && this.a.q()) {
                        float measuredWidth3 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                        this.e = measuredWidth3;
                        int i16 = (int) (r7.H - measuredWidth3);
                        this.a.H = i16;
                        if (i16 < org.telegram.messenger.g0.L(36.0f)) {
                            this.e = 0.0f;
                            this.a.H = org.telegram.messenger.g0.L(36.0f);
                        }
                        b();
                    } else {
                        int measuredWidth4 = this.b.getSwipeBack() != null ? this.b.getSwipeBack().getMeasuredWidth() - this.b.getSwipeBack().getChildAt(0).getMeasuredWidth() : 0;
                        if (this.a.getLayoutParams().width != -2 && this.a.getLayoutParams().width + measuredWidth4 > measuredWidth) {
                            measuredWidth4 = org.telegram.messenger.g0.L(8.0f) + (measuredWidth - this.a.getLayoutParams().width);
                        }
                        r6 = measuredWidth4 >= 0 ? measuredWidth4 : 0;
                        ((LinearLayout.LayoutParams) this.a.getLayoutParams()).rightMargin = r6;
                        this.e = 0.0f;
                        b();
                    }
                    if (this.c != null) {
                        if (this.a.q()) {
                            this.c.getLayoutParams().width = org.telegram.messenger.g0.L(f10) + childAt.getMeasuredWidth();
                            b();
                        } else {
                            this.c.getLayoutParams().width = -1;
                        }
                        if (this.b.getSwipeBack() != null) {
                            ((LinearLayout.LayoutParams) this.c.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(36.0f) + r6;
                        } else {
                            ((LinearLayout.LayoutParams) this.c.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(36.0f);
                        }
                    }
                    super.onMeasure(i11, makeMeasureSpec);
                }
                if (z10) {
                    setMeasuredDimension(getMeasuredWidthAndState() | 16777216, getMeasuredHeightAndState());
                }
                this.d = getMeasuredHeight();
            }
        }
        z10 = false;
        xi0Var = this.a;
        if (xi0Var != null) {
        }
        super.onMeasure(i11, makeMeasureSpec);
        if (z10) {
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f10) {
        this.b.setTranslationY(f10);
        this.n = f10;
        a();
    }

    public void setMaxHeight(int i7) {
        this.d = i7;
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new h2(15, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            kf0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.y.add(new jf0() { // from class: org.telegram.ui.Components.to
                @Override // org.telegram.ui.Components.jf0
                public final void a(float f10, float f11) {
                    uo uoVar = uo.this;
                    FrameLayout frameLayout = uoVar.c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f11);
                    }
                    uoVar.f = f11;
                    uoVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(xi0 xi0Var) {
        this.a = xi0Var;
        if (xi0Var != null) {
            xi0Var.setChatScrimView(this);
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
