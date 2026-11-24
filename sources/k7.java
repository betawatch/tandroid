// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class k7 extends FrameLayout {
    public final /* synthetic */ byte a;
    public boolean b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(Context context, CharSequence charSequence, String str, int i, boolean z) {
        super(context);
        this.a = (byte) 2;
        Paint paint = new Paint(1);
        this.c = paint;
        this.b = z;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(i);
        textView.setSingleLine(true);
        textView.setGravity(16);
        if (str != null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(16);
            linearLayout.addView(textView, nme.o(-2, -2));
            TextView textView2 = new TextView(context);
            SpannableStringBuilder append = new SpannableStringBuilder(str).append((CharSequence) " >");
            append.setSpan(new hm3(), append.length() - 1, append.length(), 33);
            textView2.setText(append);
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(bkb.p1(0.55f, i));
            textView2.setSingleLine(true);
            linearLayout.addView(textView2, nme.k(0.0f, 1.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, nme.d(-2, -1.0f, 3, 18.0f, 0.0f, 44.0f, 0.0f));
        } else {
            addView(textView, nme.d(-2, -1.0f, 3, 18.0f, 0.0f, 44.0f, 0.0f));
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.N(1.75f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                Paint paint = (Paint) this.c;
                super.dispatchDraw(canvas);
                float height = getHeight() / 2.0f;
                if (this.b) {
                    float width = getWidth() - gl.L(26.0f);
                    canvas.drawLine(width - gl.L(5.0f), height, width - gl.L(1.5f), height + gl.L(3.5f), paint);
                    canvas.drawLine(width - gl.L(1.5f), gl.L(3.5f) + height, width + gl.L(5.5f), height - gl.L(4.0f), paint);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ui5 ui5Var;
        ui5 ui5Var2;
        int i;
        switch (this.a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j);
                qmb qmbVar = (qmb) this.c;
                if (view == qmbVar.u0) {
                    ui5Var = ((d) qmbVar).parentLayout;
                    if (ui5Var != null) {
                        ui5Var2 = ((d) qmbVar).parentLayout;
                        if (qmbVar.u0.getVisibility() == 0) {
                            i = (int) (qmbVar.u0.getTranslationY() + qmbVar.u0.getMeasuredHeight());
                        } else {
                            i = 0;
                        }
                        ((ActionBarLayout) ui5Var2).o(canvas, i);
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(this.b);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                r7 r7Var = (r7) this.c;
                super.onLayout(z, i, i2, i3, i4);
                int i5 = 0;
                if (!k96.a0 && r7Var.h.getVisibility() == 0) {
                    i5 = gl.L(4.0f) + r7Var.h.getMeasuredWidth();
                }
                if (r7Var.f.getVisibility() == 0) {
                    i5 += r7Var.f.getMeasuredWidth();
                }
                l7 l7Var = r7Var.e;
                l7Var.layout(i5, l7Var.getTop(), r7Var.e.getMeasuredWidth() + i5, r7Var.e.getBottom());
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        k7 k7Var;
        int i4;
        int i5;
        TextView textView;
        long j;
        float f;
        int i6;
        switch (this.a) {
            case 0:
                r7 r7Var = (r7) this.c;
                measureChildWithMargins(r7Var.s, i, 0, i2, 0);
                View view = r7Var.x;
                if (view != null) {
                    measureChildWithMargins(view, i, 0, i2, 0);
                }
                boolean z = k96.a0;
                TextView textView2 = r7Var.h;
                if (!z) {
                    if (textView2.getVisibility() == 0) {
                        k7Var = this;
                        k7Var.measureChildWithMargins(r7Var.h, i, View.MeasureSpec.getSize(i) / 2, i2, 0);
                        i4 = gl.L(4.0f) + r7Var.h.getMeasuredWidth();
                    } else {
                        k7Var = this;
                        i4 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i);
                    k7Var.b = true;
                    k7Var.measureChildWithMargins(r7Var.f, i, i4, i2, 0);
                    int measuredWidth = r7Var.f.getVisibility() == 0 ? r7Var.f.getMeasuredWidth() : 0;
                    l7 l7Var = r7Var.e;
                    int i7 = i4 + measuredWidth;
                    View view2 = r7Var.x;
                    measureChildWithMargins(l7Var, i, i7 + (view2 != null ? view2.getMeasuredWidth() : 0), i2, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(r7Var.e.getMeasuredWidth() + measuredWidth, size), View.MeasureSpec.getSize(i2));
                    break;
                } else {
                    if (textView2.getVisibility() == 0) {
                        measureChildWithMargins(r7Var.h, i, View.MeasureSpec.getSize(i) / 2, i2, 0);
                        i3 = gl.L(4.0f) + r7Var.h.getMeasuredWidth();
                    } else {
                        i3 = 0;
                    }
                    int size2 = View.MeasureSpec.getSize(i);
                    this.b = true;
                    measureChildWithMargins(r7Var.f, i, i3, i2, 0);
                    int measuredWidth2 = r7Var.f.getVisibility() == 0 ? r7Var.f.getMeasuredWidth() : 0;
                    measureChildWithMargins(r7Var.e, ug8.f(12.0f, size2, 0), i3 + measuredWidth2, i2, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(r7Var.e.getMeasuredWidth() + measuredWidth2, size2), View.MeasureSpec.getSize(i2));
                    break;
                }
            case 1:
                int size3 = View.MeasureSpec.getSize(i);
                mu1 mu1Var = (mu1) this.c;
                if (mu1Var.W7()) {
                    size3 -= gl.L(71.0f);
                    i5 = gl.L(32.0f);
                } else {
                    i5 = 0;
                }
                TextView textView3 = mu1Var.a2;
                if (textView3 != null && textView3.getVisibility() == 0 && (textView = mu1Var.c2) != null && textView.getVisibility() == 0) {
                    size3 = ug8.D(31.0f, size3, 2);
                }
                this.b = true;
                TextView textView4 = mu1Var.c2;
                if (textView4 != null && textView4.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mu1Var.c2.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView5 = mu1Var.a2;
                    if (textView5 == null || textView5.getVisibility() != 0) {
                        mu1Var.c2.setPadding(gl.L(48.0f), 0, gl.L(48.0f), 0);
                        layoutParams.leftMargin = i5;
                    } else {
                        mu1Var.c2.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
                        layoutParams.leftMargin = i5 + size3;
                        layoutParams.width -= gl.L(15.0f);
                    }
                }
                TextView textView6 = mu1Var.a2;
                if (textView6 != null && textView6.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) mu1Var.a2.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView7 = mu1Var.c2;
                    if (textView7 == null || textView7.getVisibility() != 0) {
                        mu1Var.a2.setPadding(gl.L(48.0f), 0, gl.L(48.0f), 0);
                    } else {
                        mu1Var.a2.setPadding(gl.L(11.0f), 0, gl.L(4.0f), 0);
                    }
                    layoutParams2.leftMargin = i5;
                }
                this.b = false;
                super.onMeasure(i, i2);
                break;
            case 2:
            default:
                super.onMeasure(i, i2);
                break;
            case 3:
                int size4 = View.MeasureSpec.getSize(i);
                int size5 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size4, size5);
                if (((qmb) this.c).e != null) {
                    this.b = true;
                    if (!gl.O1()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((qmb) this.c).e.getLayoutParams();
                        layoutParams3.topMargin = gl.m;
                        ((qmb) this.c).e.setLayoutParams(layoutParams3);
                    }
                    if (gl.O1() || a.b.getResources().getConfiguration().orientation != 2) {
                        ((qmb) this.c).h.setTextSize(1, 20.0f);
                    } else {
                        ((qmb) this.c).h.setTextSize(1, 18.0f);
                    }
                    this.b = false;
                }
                measureChildWithMargins(((qmb) this.c).u0, i, 0, i2, 0);
                int measuredHeight = ((qmb) this.c).u0.getMeasuredHeight();
                if (((qmb) this.c).u0.getVisibility() == 0) {
                    size5 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((qmb) this.c).w0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                qmb qmbVar = (qmb) this.c;
                if (qmbVar.b == 2) {
                    nlb nlbVar = qmbVar.w0;
                    int L = gl.L(4.0f);
                    qmb qmbVar2 = (qmb) this.c;
                    if (qmbVar2.M1) {
                        j = 0;
                    } else {
                        j = 0;
                        if (qmbVar2.L1 > 0) {
                            i6 = 58;
                            nlbVar.setPadding(0, L, 0, (gl.L(i6 + 72) - 12) + (!((qmb) this.c).V0() ? gl.n : 0));
                        }
                    }
                    i6 = 0;
                    nlbVar.setPadding(0, L, 0, (gl.L(i6 + 72) - 12) + (!((qmb) this.c).V0() ? gl.n : 0));
                } else {
                    j = 0;
                }
                ((qmb) this.c).w0.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5 - layoutParams4.bottomMargin, TLObject.FLAG_30));
                ((FrameLayout.LayoutParams) ((qmb) this.c).z0.getLayoutParams()).topMargin = measuredHeight;
                ((qmb) this.c).z0.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30));
                jo0 jo0Var = ((qmb) this.c).S1;
                if (jo0Var != null) {
                    ((FrameLayout.LayoutParams) jo0Var.getLayoutParams()).topMargin = measuredHeight;
                    ((qmb) this.c).S1.measure(View.MeasureSpec.makeMeasureSpec(gl.L(222.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(76.0f), TLObject.FLAG_30));
                }
                tb0 tb0Var = ((qmb) this.c).E0;
                if (tb0Var != null) {
                    tb0Var.setPadding(gl.L(12.0f), gl.L(12.0f), gl.L(12.0f), gl.L(12.0f) + (((qmb) this.c).V0() ? gl.n : 0));
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((qmb) this.c).E0.getLayoutParams();
                    qmb qmbVar3 = (qmb) this.c;
                    layoutParams5.height = gl.L(72 + ((qmbVar3.M1 || qmbVar3.L1 <= j) ? 0 : 58)) + (((qmb) this.c).V0() ? gl.n : 0);
                    measureChildWithMargins(((qmb) this.c).E0, i, 0, i2, 0);
                }
                Drawable drawable = ((qmb) this.c).r;
                if (drawable != null) {
                    drawable.getPadding(gl.Q);
                }
                int i8 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((qmb) this.c).N0;
                    if (i8 >= frameLayoutArr.length) {
                        break;
                    } else {
                        FrameLayout frameLayout = frameLayoutArr[i8];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i8 == 0) {
                                f = ((qmb) this.c).b == 2 ? kk7.r5 : kk7.v4;
                            } else {
                                f = 316.0f;
                            }
                            layoutParams6.height = gl.L(f);
                            if (((qmb) this.c).V0()) {
                                layoutParams6.height += gl.n;
                            }
                            if (i8 == 0) {
                                layoutParams6.height = gl.L(12.0f) + gl.Q.top + layoutParams6.height;
                            }
                            ((qmb) this.c).N0[i8].setPadding(0, i8 == 0 ? gl.L(12.0f) + gl.Q.top : 0, 0, ((qmb) this.c).V0() ? gl.n : 0);
                            measureChildWithMargins(((qmb) this.c).N0[i8], i, 0, i2, 0);
                        }
                        i8++;
                    }
                }
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 1:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 2:
            default:
                super.requestLayout();
                break;
            case 3:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.a) {
            case 0:
                super.setAlpha(f);
                r7 r7Var = (r7) this.c;
                c7 c7Var = r7Var.s;
                if (c7Var != null && c7Var.getTag() != null) {
                    r7Var.s.setAlpha(f);
                    r7Var.s.setScaleX(f);
                    r7Var.s.setScaleY(f);
                    break;
                }
                break;
            default:
                super.setAlpha(f);
                break;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        switch (this.a) {
            case 0:
                super.setVisibility(i);
                r7 r7Var = (r7) this.c;
                c7 c7Var = r7Var.s;
                if (c7Var != null) {
                    c7Var.setVisibility(i);
                }
                View view = r7Var.x;
                if (view != null) {
                    view.setVisibility(i);
                }
                FrameLayout frameLayout = r7Var.a;
                if (frameLayout != null) {
                    frameLayout.setVisibility(i);
                    break;
                }
                break;
            default:
                super.setVisibility(i);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k7(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.c = obj;
    }
}
