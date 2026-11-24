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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
            linearLayout.addView(textView, qoe.o(-2, -2));
            TextView textView2 = new TextView(context);
            SpannableStringBuilder append = new SpannableStringBuilder(str).append((CharSequence) " >");
            append.setSpan(new sn3(), append.length() - 1, append.length(), 33);
            textView2.setText(append);
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(cmb.p1(0.55f, i));
            textView2.setSingleLine(true);
            linearLayout.addView(textView2, qoe.k(0.0f, 1.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, qoe.d(-2, -1.0f, 3, 18.0f, 0.0f, 44.0f, 0.0f));
        } else {
            addView(textView, qoe.d(-2, -1.0f, 3, 18.0f, 0.0f, 44.0f, 0.0f));
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.N(1.75f));
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
                    float width = getWidth() - gm.L(26.0f);
                    canvas.drawLine(width - gm.L(5.0f), height, width - gm.L(1.5f), height + gm.L(3.5f), paint);
                    canvas.drawLine(width - gm.L(1.5f), gm.L(3.5f) + height, width + gm.L(5.5f), height - gm.L(4.0f), paint);
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
        tk5 tk5Var;
        tk5 tk5Var2;
        int i;
        switch (this.a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j);
                rob robVar = (rob) this.c;
                if (view == robVar.u0) {
                    tk5Var = ((d) robVar).parentLayout;
                    if (tk5Var != null) {
                        tk5Var2 = ((d) robVar).parentLayout;
                        if (robVar.u0.getVisibility() == 0) {
                            i = (int) (robVar.u0.getTranslationY() + robVar.u0.getMeasuredHeight());
                        } else {
                            i = 0;
                        }
                        ((ActionBarLayout) tk5Var2).o(canvas, i);
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
                if (!jb6.a0 && r7Var.h.getVisibility() == 0) {
                    i5 = gm.L(4.0f) + r7Var.h.getMeasuredWidth();
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
                boolean z = jb6.a0;
                TextView textView2 = r7Var.h;
                if (!z) {
                    if (textView2.getVisibility() == 0) {
                        k7Var = this;
                        k7Var.measureChildWithMargins(r7Var.h, i, View.MeasureSpec.getSize(i) / 2, i2, 0);
                        i4 = gm.L(4.0f) + r7Var.h.getMeasuredWidth();
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
                        i3 = gm.L(4.0f) + r7Var.h.getMeasuredWidth();
                    } else {
                        i3 = 0;
                    }
                    int size2 = View.MeasureSpec.getSize(i);
                    this.b = true;
                    measureChildWithMargins(r7Var.f, i, i3, i2, 0);
                    int measuredWidth2 = r7Var.f.getVisibility() == 0 ? r7Var.f.getMeasuredWidth() : 0;
                    measureChildWithMargins(r7Var.e, wi8.f(12.0f, size2, 0), i3 + measuredWidth2, i2, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(r7Var.e.getMeasuredWidth() + measuredWidth2, size2), View.MeasureSpec.getSize(i2));
                    break;
                }
            case 1:
                int size3 = View.MeasureSpec.getSize(i);
                yv1 yv1Var = (yv1) this.c;
                if (yv1Var.f8()) {
                    size3 -= gm.L(71.0f);
                    i5 = gm.L(32.0f);
                } else {
                    i5 = 0;
                }
                TextView textView3 = yv1Var.a2;
                if (textView3 != null && textView3.getVisibility() == 0 && (textView = yv1Var.c2) != null && textView.getVisibility() == 0) {
                    size3 = wi8.D(31.0f, size3, 2);
                }
                this.b = true;
                TextView textView4 = yv1Var.c2;
                if (textView4 != null && textView4.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yv1Var.c2.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView5 = yv1Var.a2;
                    if (textView5 == null || textView5.getVisibility() != 0) {
                        yv1Var.c2.setPadding(gm.L(48.0f), 0, gm.L(48.0f), 0);
                        layoutParams.leftMargin = i5;
                    } else {
                        yv1Var.c2.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
                        layoutParams.leftMargin = i5 + size3;
                        layoutParams.width -= gm.L(15.0f);
                    }
                }
                TextView textView6 = yv1Var.a2;
                if (textView6 != null && textView6.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) yv1Var.a2.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView7 = yv1Var.c2;
                    if (textView7 == null || textView7.getVisibility() != 0) {
                        yv1Var.a2.setPadding(gm.L(48.0f), 0, gm.L(48.0f), 0);
                    } else {
                        yv1Var.a2.setPadding(gm.L(11.0f), 0, gm.L(4.0f), 0);
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
                if (((rob) this.c).e != null) {
                    this.b = true;
                    if (!gm.O1()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((rob) this.c).e.getLayoutParams();
                        layoutParams3.topMargin = gm.m;
                        ((rob) this.c).e.setLayoutParams(layoutParams3);
                    }
                    if (gm.O1() || a.b.getResources().getConfiguration().orientation != 2) {
                        ((rob) this.c).h.setTextSize(1, 20.0f);
                    } else {
                        ((rob) this.c).h.setTextSize(1, 18.0f);
                    }
                    this.b = false;
                }
                measureChildWithMargins(((rob) this.c).u0, i, 0, i2, 0);
                int measuredHeight = ((rob) this.c).u0.getMeasuredHeight();
                if (((rob) this.c).u0.getVisibility() == 0) {
                    size5 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((rob) this.c).w0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                rob robVar = (rob) this.c;
                if (robVar.b == 2) {
                    onb onbVar = robVar.w0;
                    int L = gm.L(4.0f);
                    rob robVar2 = (rob) this.c;
                    if (robVar2.M1) {
                        j = 0;
                    } else {
                        j = 0;
                        if (robVar2.L1 > 0) {
                            i6 = 58;
                            onbVar.setPadding(0, L, 0, (gm.L(i6 + 72) - 12) + (!((rob) this.c).W0() ? gm.n : 0));
                        }
                    }
                    i6 = 0;
                    onbVar.setPadding(0, L, 0, (gm.L(i6 + 72) - 12) + (!((rob) this.c).W0() ? gm.n : 0));
                } else {
                    j = 0;
                }
                ((rob) this.c).w0.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5 - layoutParams4.bottomMargin, TLObject.FLAG_30));
                ((FrameLayout.LayoutParams) ((rob) this.c).z0.getLayoutParams()).topMargin = measuredHeight;
                ((rob) this.c).z0.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30));
                jp0 jp0Var = ((rob) this.c).S1;
                if (jp0Var != null) {
                    ((FrameLayout.LayoutParams) jp0Var.getLayoutParams()).topMargin = measuredHeight;
                    ((rob) this.c).S1.measure(View.MeasureSpec.makeMeasureSpec(gm.L(222.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(76.0f), TLObject.FLAG_30));
                }
                tc0 tc0Var = ((rob) this.c).E0;
                if (tc0Var != null) {
                    tc0Var.setPadding(gm.L(12.0f), gm.L(12.0f), gm.L(12.0f), gm.L(12.0f) + (((rob) this.c).W0() ? gm.n : 0));
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((rob) this.c).E0.getLayoutParams();
                    rob robVar3 = (rob) this.c;
                    layoutParams5.height = gm.L(72 + ((robVar3.M1 || robVar3.L1 <= j) ? 0 : 58)) + (((rob) this.c).W0() ? gm.n : 0);
                    measureChildWithMargins(((rob) this.c).E0, i, 0, i2, 0);
                }
                Drawable drawable = ((rob) this.c).r;
                if (drawable != null) {
                    drawable.getPadding(gm.Q);
                }
                int i8 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((rob) this.c).N0;
                    if (i8 >= frameLayoutArr.length) {
                        break;
                    } else {
                        FrameLayout frameLayout = frameLayoutArr[i8];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i8 == 0) {
                                f = ((rob) this.c).b == 2 ? nm7.r5 : nm7.v4;
                            } else {
                                f = 316.0f;
                            }
                            layoutParams6.height = gm.L(f);
                            if (((rob) this.c).W0()) {
                                layoutParams6.height += gm.n;
                            }
                            if (i8 == 0) {
                                layoutParams6.height = gm.L(12.0f) + gm.Q.top + layoutParams6.height;
                            }
                            ((rob) this.c).N0[i8].setPadding(0, i8 == 0 ? gm.L(12.0f) + gm.Q.top : 0, 0, ((rob) this.c).W0() ? gm.n : 0);
                            measureChildWithMargins(((rob) this.c).N0[i8], i, 0, i2, 0);
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
