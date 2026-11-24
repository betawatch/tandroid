// default package

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class me2 extends LinearLayout {
    public v29 a;
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
        float f = (1.0f - this.f) * this.e;
        this.b.setTranslationX(f);
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setTranslationX(f);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0379  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z;
        v29 v29Var;
        float f;
        float f2;
        int i3 = i;
        int i4 = this.d;
        int makeMeasureSpec = i4 != 0 ? View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_31) : i2;
        if (this.b != null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            this.b.measure(0, makeMeasureSpec);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            if (this.b.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin > View.MeasureSpec.getSize(i3)) {
                z = true;
                v29Var = this.a;
                if (v29Var != null || this.b == null) {
                    super.onMeasure(i3, makeMeasureSpec);
                } else {
                    v29Var.getLayoutParams().width = -2;
                    ((LinearLayout.LayoutParams) this.a.getLayoutParams()).rightMargin = 0;
                    this.e = 0.0f;
                    super.onMeasure(i3, makeMeasureSpec);
                    int measuredWidth = this.a.getMeasuredWidth();
                    if (this.b.getSwipeBack() != null && this.b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                        measuredWidth = this.b.getSwipeBack().getMeasuredWidth();
                    }
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
                    int measuredWidth2 = this.b.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin;
                    if (measuredWidth2 > measuredWidth) {
                        measuredWidth = measuredWidth2;
                    }
                    if (this.a.n()) {
                        i3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30);
                    }
                    v29 v29Var2 = this.a;
                    float f3 = 16.0f;
                    if (v29Var2.g1 || !v29Var2.R0 || v29Var2.getMeasuredWidth() <= 0) {
                        f = 16.0f;
                        f2 = 24.0f;
                    } else {
                        int x = b10.x(16.0f, v29Var2.getMeasuredWidth(), gm.L(320.0f));
                        StaticLayout staticLayout = new StaticLayout(v29Var2.S0.getText(), v29Var2.S0.getPaint(), x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        v29Var2.U0 = staticLayout.getHeight();
                        v29Var2.T0 = 0;
                        int i5 = 0;
                        while (i5 < staticLayout.getLineCount()) {
                            v29Var2.T0 = Math.max(v29Var2.T0, (int) Math.ceil(staticLayout.getLineWidth(i5)));
                            i5++;
                            f3 = f3;
                        }
                        f = f3;
                        f2 = 24.0f;
                        if (staticLayout.getLineCount() <= 1 || v29Var2.S0.getText().toString().contains("\n")) {
                            v29Var2.S0.setWidth(gm.L(f) + x);
                        } else {
                            int a = hg5.a(v29Var2.S0.getText(), v29Var2.S0.getPaint());
                            StaticLayout staticLayout2 = new StaticLayout(v29Var2.S0.getText(), v29Var2.S0.getPaint(), a, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            v29Var2.U0 = staticLayout2.getHeight();
                            v29Var2.T0 = 0;
                            for (int i6 = 0; i6 < staticLayout2.getLineCount(); i6++) {
                                v29Var2.T0 = Math.max(v29Var2.T0, (int) Math.ceil(staticLayout2.getLineWidth(i6)));
                            }
                            v29Var2.S0.setPadding(gm.L(24.0f), 0, gm.L(24.0f), 0);
                            v29Var2.S0.setWidth(gm.L(48.0f) + a);
                        }
                        int max = Math.max(gm.L(20.0f), gm.L(7.0f) + v29Var2.U0);
                        byte b = v29Var2.N0;
                        if (b == 1 || b == 2) {
                            max = gm.L(20.0f);
                        } else {
                            v29Var2.getLayoutParams().height = gm.L(22.0f) + gm.L(52.0f) + max;
                        }
                        ((FrameLayout.LayoutParams) v29Var2.A0.getLayoutParams()).topMargin = max;
                        ((FrameLayout.LayoutParams) v29Var2.b.getLayoutParams()).topMargin = max;
                        v29Var2.g1 = true;
                    }
                    int totalWidth = this.a.getTotalWidth();
                    th8 swipeBack = this.b.getSwipeBack();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
                    View childAt = swipeBack != null ? actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().getChildAt(0) : actionBarPopupWindow$ActionBarPopupWindowLayout.getChildAt(0);
                    int L = gm.L(36.0f) + gm.L(f) + gm.L(f) + childAt.getMeasuredWidth();
                    int hintTextWidth = this.a.getHintTextWidth();
                    if (hintTextWidth > L) {
                        L = hintTextWidth;
                    } else if (L > measuredWidth) {
                        L = measuredWidth;
                    }
                    this.a.H = gm.L(36.0f);
                    if (this.a.n()) {
                        this.a.getLayoutParams().width = totalWidth;
                        this.a.H = Math.max((totalWidth - childAt.getMeasuredWidth()) - gm.L(36.0f), gm.L(36.0f));
                    } else if (totalWidth > L) {
                        int L2 = ((L - gm.L(f)) / gm.L(36.0f)) + 1;
                        int L3 = gm.L(8.0f) + (gm.L(36.0f) * L2);
                        if (gm.L(f2) + hintTextWidth > L3) {
                            L3 = gm.L(f2) + hintTextWidth;
                        }
                        if (L3 <= totalWidth && L2 != this.a.getItemsCount()) {
                            totalWidth = L3;
                        }
                        this.a.getLayoutParams().width = totalWidth;
                    } else {
                        this.a.getLayoutParams().width = -2;
                    }
                    if (this.a.getMeasuredWidth() == measuredWidth && this.a.n()) {
                        float measuredWidth3 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                        this.e = measuredWidth3;
                        int i7 = (int) (r7.H - measuredWidth3);
                        this.a.H = i7;
                        if (i7 < gm.L(36.0f)) {
                            this.e = 0.0f;
                            this.a.H = gm.L(36.0f);
                        }
                        b();
                    } else {
                        int measuredWidth4 = this.b.getSwipeBack() != null ? this.b.getSwipeBack().getMeasuredWidth() - this.b.getSwipeBack().getChildAt(0).getMeasuredWidth() : 0;
                        if (this.a.getLayoutParams().width != -2 && this.a.getLayoutParams().width + measuredWidth4 > measuredWidth) {
                            measuredWidth4 = gm.L(8.0f) + (measuredWidth - this.a.getLayoutParams().width);
                        }
                        r6 = measuredWidth4 >= 0 ? measuredWidth4 : 0;
                        ((LinearLayout.LayoutParams) this.a.getLayoutParams()).rightMargin = r6;
                        this.e = 0.0f;
                        b();
                    }
                    if (this.c != null) {
                        boolean n = this.a.n();
                        FrameLayout frameLayout = this.c;
                        if (n) {
                            frameLayout.getLayoutParams().width = gm.L(f) + childAt.getMeasuredWidth();
                            b();
                        } else {
                            frameLayout.getLayoutParams().width = -1;
                        }
                        th8 swipeBack2 = this.b.getSwipeBack();
                        FrameLayout frameLayout2 = this.c;
                        if (swipeBack2 != null) {
                            ((LinearLayout.LayoutParams) frameLayout2.getLayoutParams()).rightMargin = gm.L(36.0f) + r6;
                        } else {
                            ((LinearLayout.LayoutParams) frameLayout2.getLayoutParams()).rightMargin = gm.L(36.0f);
                        }
                    }
                    super.onMeasure(i3, makeMeasureSpec);
                }
                if (z) {
                    setMeasuredDimension(getMeasuredWidthAndState() | 16777216, getMeasuredHeightAndState());
                }
                this.d = getMeasuredHeight();
            }
        }
        z = false;
        v29Var = this.a;
        if (v29Var != null) {
        }
        super.onMeasure(i3, makeMeasureSpec);
        if (z) {
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f) {
        this.b.setTranslationY(f);
        this.n = f;
        a();
    }

    public void setMaxHeight(int i) {
        this.d = i;
    }

    public void setPopupAlpha(float f) {
        this.b.setAlpha(f);
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new x92((Object) this, (Object) actionBarPopupWindow$ActionBarPopupWindowLayout, (byte) 5));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            th8 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.y.add(new le2(this, (byte) 0));
        }
    }

    public void setReactionsLayout(v29 v29Var) {
        this.a = v29Var;
        if (v29Var != null) {
            v29Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f) {
        this.b.setReactionsTransitionProgress(f);
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f);
            float f2 = (f * 0.5f) + 0.5f;
            this.c.setPivotX(r0.getMeasuredWidth());
            this.c.setPivotY(0.0f);
            this.r = (1.0f - f) * (-this.b.getMeasuredHeight());
            a();
            this.c.setScaleX(f2);
            this.c.setScaleY(f2);
        }
    }
}
