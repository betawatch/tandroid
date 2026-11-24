// default package

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class bd2 extends LinearLayout {
    public t09 a;
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
        t09 t09Var;
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
                t09Var = this.a;
                if (t09Var != null || this.b == null) {
                    super.onMeasure(i3, makeMeasureSpec);
                } else {
                    t09Var.getLayoutParams().width = -2;
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
                    t09 t09Var2 = this.a;
                    float f3 = 16.0f;
                    if (t09Var2.g1 || !t09Var2.R0 || t09Var2.getMeasuredWidth() <= 0) {
                        f = 16.0f;
                        f2 = 24.0f;
                    } else {
                        int x = b00.x(16.0f, t09Var2.getMeasuredWidth(), gl.L(320.0f));
                        StaticLayout staticLayout = new StaticLayout(t09Var2.S0.getText(), t09Var2.S0.getPaint(), x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        t09Var2.U0 = staticLayout.getHeight();
                        t09Var2.T0 = 0;
                        int i5 = 0;
                        while (i5 < staticLayout.getLineCount()) {
                            t09Var2.T0 = Math.max(t09Var2.T0, (int) Math.ceil(staticLayout.getLineWidth(i5)));
                            i5++;
                            f3 = f3;
                        }
                        f = f3;
                        f2 = 24.0f;
                        if (staticLayout.getLineCount() <= 1 || t09Var2.S0.getText().toString().contains("\n")) {
                            t09Var2.S0.setWidth(gl.L(f) + x);
                        } else {
                            int a = je5.a(t09Var2.S0.getText(), t09Var2.S0.getPaint());
                            StaticLayout staticLayout2 = new StaticLayout(t09Var2.S0.getText(), t09Var2.S0.getPaint(), a, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            t09Var2.U0 = staticLayout2.getHeight();
                            t09Var2.T0 = 0;
                            for (int i6 = 0; i6 < staticLayout2.getLineCount(); i6++) {
                                t09Var2.T0 = Math.max(t09Var2.T0, (int) Math.ceil(staticLayout2.getLineWidth(i6)));
                            }
                            t09Var2.S0.setPadding(gl.L(24.0f), 0, gl.L(24.0f), 0);
                            t09Var2.S0.setWidth(gl.L(48.0f) + a);
                        }
                        int max = Math.max(gl.L(20.0f), gl.L(7.0f) + t09Var2.U0);
                        byte b = t09Var2.N0;
                        if (b == 1 || b == 2) {
                            max = gl.L(20.0f);
                        } else {
                            t09Var2.getLayoutParams().height = gl.L(22.0f) + gl.L(52.0f) + max;
                        }
                        ((FrameLayout.LayoutParams) t09Var2.A0.getLayoutParams()).topMargin = max;
                        ((FrameLayout.LayoutParams) t09Var2.b.getLayoutParams()).topMargin = max;
                        t09Var2.g1 = true;
                    }
                    int totalWidth = this.a.getTotalWidth();
                    rf8 swipeBack = this.b.getSwipeBack();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
                    View childAt = swipeBack != null ? actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().getChildAt(0) : actionBarPopupWindow$ActionBarPopupWindowLayout.getChildAt(0);
                    int L = gl.L(36.0f) + gl.L(f) + gl.L(f) + childAt.getMeasuredWidth();
                    int hintTextWidth = this.a.getHintTextWidth();
                    if (hintTextWidth > L) {
                        L = hintTextWidth;
                    } else if (L > measuredWidth) {
                        L = measuredWidth;
                    }
                    this.a.H = gl.L(36.0f);
                    if (this.a.n()) {
                        this.a.getLayoutParams().width = totalWidth;
                        this.a.H = Math.max((totalWidth - childAt.getMeasuredWidth()) - gl.L(36.0f), gl.L(36.0f));
                    } else if (totalWidth > L) {
                        int L2 = ((L - gl.L(f)) / gl.L(36.0f)) + 1;
                        int L3 = gl.L(8.0f) + (gl.L(36.0f) * L2);
                        if (gl.L(f2) + hintTextWidth > L3) {
                            L3 = gl.L(f2) + hintTextWidth;
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
                        if (i7 < gl.L(36.0f)) {
                            this.e = 0.0f;
                            this.a.H = gl.L(36.0f);
                        }
                        b();
                    } else {
                        int measuredWidth4 = this.b.getSwipeBack() != null ? this.b.getSwipeBack().getMeasuredWidth() - this.b.getSwipeBack().getChildAt(0).getMeasuredWidth() : 0;
                        if (this.a.getLayoutParams().width != -2 && this.a.getLayoutParams().width + measuredWidth4 > measuredWidth) {
                            measuredWidth4 = gl.L(8.0f) + (measuredWidth - this.a.getLayoutParams().width);
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
                            frameLayout.getLayoutParams().width = gl.L(f) + childAt.getMeasuredWidth();
                            b();
                        } else {
                            frameLayout.getLayoutParams().width = -1;
                        }
                        rf8 swipeBack2 = this.b.getSwipeBack();
                        FrameLayout frameLayout2 = this.c;
                        if (swipeBack2 != null) {
                            ((LinearLayout.LayoutParams) frameLayout2.getLayoutParams()).rightMargin = gl.L(36.0f) + r6;
                        } else {
                            ((LinearLayout.LayoutParams) frameLayout2.getLayoutParams()).rightMargin = gl.L(36.0f);
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
        t09Var = this.a;
        if (t09Var != null) {
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new v82((Object) this, (Object) actionBarPopupWindow$ActionBarPopupWindowLayout, (byte) 4));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            rf8 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.y.add(new ad2(this, (byte) 0));
        }
    }

    public void setReactionsLayout(t09 t09Var) {
        this.a = t09Var;
        if (t09Var != null) {
            t09Var.setChatScrimView(this);
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
