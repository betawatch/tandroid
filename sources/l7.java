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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class l7 extends FrameLayout {
    public final /* synthetic */ byte a;
    public boolean b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(Context context, CharSequence charSequence, String str, int i, boolean z) {
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
            linearLayout.addView(textView, tre.o(-2, -2));
            TextView textView2 = new TextView(context);
            SpannableStringBuilder append = new SpannableStringBuilder(str).append((CharSequence) " >");
            append.setSpan(new zm3(), append.length() - 1, append.length(), 33);
            textView2.setText(append);
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(aob.p1(0.55f, i));
            textView2.setSingleLine(true);
            linearLayout.addView(textView2, tre.k(0.0f, 1.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, tre.d(-2, -1.0f, 3, 18.0f, 0.0f, 44.0f, 0.0f));
        } else {
            addView(textView, tre.d(-2, -1.0f, 3, 18.0f, 0.0f, 44.0f, 0.0f));
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.N(1.75f));
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
                    float width = getWidth() - hl.L(26.0f);
                    canvas.drawLine(width - hl.L(5.0f), height, width - hl.L(1.5f), height + hl.L(3.5f), paint);
                    canvas.drawLine(width - hl.L(1.5f), hl.L(3.5f) + height, width + hl.L(5.5f), height - hl.L(4.0f), paint);
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
        wk5 wk5Var;
        wk5 wk5Var2;
        int i;
        switch (this.a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j);
                pqb pqbVar = (pqb) this.c;
                if (view == pqbVar.u0) {
                    wk5Var = ((e) pqbVar).parentLayout;
                    if (wk5Var != null) {
                        wk5Var2 = ((e) pqbVar).parentLayout;
                        if (pqbVar.u0.getVisibility() == 0) {
                            i = (int) (pqbVar.u0.getTranslationY() + pqbVar.u0.getMeasuredHeight());
                        } else {
                            i = 0;
                        }
                        ((ActionBarLayout) wk5Var2).o(canvas, i);
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
                s7 s7Var = (s7) this.c;
                super.onLayout(z, i, i2, i3, i4);
                int i5 = 0;
                if (!ob6.a0 && s7Var.h.getVisibility() == 0) {
                    i5 = hl.L(4.0f) + s7Var.h.getMeasuredWidth();
                }
                if (s7Var.f.getVisibility() == 0) {
                    i5 += s7Var.f.getMeasuredWidth();
                }
                m7 m7Var = s7Var.e;
                m7Var.layout(i5, m7Var.getTop(), s7Var.e.getMeasuredWidth() + i5, s7Var.e.getBottom());
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
        l7 l7Var;
        int i4;
        int i5;
        TextView textView;
        long j;
        float f;
        int i6;
        switch (this.a) {
            case 0:
                s7 s7Var = (s7) this.c;
                measureChildWithMargins(s7Var.s, i, 0, i2, 0);
                View view = s7Var.x;
                if (view != null) {
                    measureChildWithMargins(view, i, 0, i2, 0);
                }
                boolean z = ob6.a0;
                TextView textView2 = s7Var.h;
                if (!z) {
                    if (textView2.getVisibility() == 0) {
                        l7Var = this;
                        l7Var.measureChildWithMargins(s7Var.h, i, View.MeasureSpec.getSize(i) / 2, i2, 0);
                        i4 = hl.L(4.0f) + s7Var.h.getMeasuredWidth();
                    } else {
                        l7Var = this;
                        i4 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i);
                    l7Var.b = true;
                    l7Var.measureChildWithMargins(s7Var.f, i, i4, i2, 0);
                    int measuredWidth = s7Var.f.getVisibility() == 0 ? s7Var.f.getMeasuredWidth() : 0;
                    m7 m7Var = s7Var.e;
                    int i7 = i4 + measuredWidth;
                    View view2 = s7Var.x;
                    measureChildWithMargins(m7Var, i, i7 + (view2 != null ? view2.getMeasuredWidth() : 0), i2, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(s7Var.e.getMeasuredWidth() + measuredWidth, size), View.MeasureSpec.getSize(i2));
                    break;
                } else {
                    if (textView2.getVisibility() == 0) {
                        measureChildWithMargins(s7Var.h, i, View.MeasureSpec.getSize(i) / 2, i2, 0);
                        i3 = hl.L(4.0f) + s7Var.h.getMeasuredWidth();
                    } else {
                        i3 = 0;
                    }
                    int size2 = View.MeasureSpec.getSize(i);
                    this.b = true;
                    measureChildWithMargins(s7Var.f, i, i3, i2, 0);
                    int measuredWidth2 = s7Var.f.getVisibility() == 0 ? s7Var.f.getMeasuredWidth() : 0;
                    measureChildWithMargins(s7Var.e, ik8.f(12.0f, size2, 0), i3 + measuredWidth2, i2, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(s7Var.e.getMeasuredWidth() + measuredWidth2, size2), View.MeasureSpec.getSize(i2));
                    break;
                }
            case 1:
                int size3 = View.MeasureSpec.getSize(i);
                zu1 zu1Var = (zu1) this.c;
                if (zu1Var.f8()) {
                    size3 -= hl.L(71.0f);
                    i5 = hl.L(32.0f);
                } else {
                    i5 = 0;
                }
                TextView textView3 = zu1Var.a2;
                if (textView3 != null && textView3.getVisibility() == 0 && (textView = zu1Var.c2) != null && textView.getVisibility() == 0) {
                    size3 = ik8.D(31.0f, size3, 2);
                }
                this.b = true;
                TextView textView4 = zu1Var.c2;
                if (textView4 != null && textView4.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zu1Var.c2.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView5 = zu1Var.a2;
                    if (textView5 == null || textView5.getVisibility() != 0) {
                        zu1Var.c2.setPadding(hl.L(48.0f), 0, hl.L(48.0f), 0);
                        layoutParams.leftMargin = i5;
                    } else {
                        zu1Var.c2.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                        layoutParams.leftMargin = i5 + size3;
                        layoutParams.width -= hl.L(15.0f);
                    }
                }
                TextView textView6 = zu1Var.a2;
                if (textView6 != null && textView6.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) zu1Var.a2.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView7 = zu1Var.c2;
                    if (textView7 == null || textView7.getVisibility() != 0) {
                        zu1Var.a2.setPadding(hl.L(48.0f), 0, hl.L(48.0f), 0);
                    } else {
                        zu1Var.a2.setPadding(hl.L(11.0f), 0, hl.L(4.0f), 0);
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
                if (((pqb) this.c).e != null) {
                    this.b = true;
                    if (!hl.O1()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((pqb) this.c).e.getLayoutParams();
                        layoutParams3.topMargin = hl.m;
                        ((pqb) this.c).e.setLayoutParams(layoutParams3);
                    }
                    if (hl.O1() || a.b.getResources().getConfiguration().orientation != 2) {
                        ((pqb) this.c).h.setTextSize(1, 20.0f);
                    } else {
                        ((pqb) this.c).h.setTextSize(1, 18.0f);
                    }
                    this.b = false;
                }
                measureChildWithMargins(((pqb) this.c).u0, i, 0, i2, 0);
                int measuredHeight = ((pqb) this.c).u0.getMeasuredHeight();
                if (((pqb) this.c).u0.getVisibility() == 0) {
                    size5 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((pqb) this.c).w0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                pqb pqbVar = (pqb) this.c;
                if (pqbVar.b == 2) {
                    mpb mpbVar = pqbVar.w0;
                    int L = hl.L(4.0f);
                    pqb pqbVar2 = (pqb) this.c;
                    if (pqbVar2.M1) {
                        j = 0;
                    } else {
                        j = 0;
                        if (pqbVar2.L1 > 0) {
                            i6 = 58;
                            mpbVar.setPadding(0, L, 0, (hl.L(i6 + 72) - 12) + (!((pqb) this.c).W0() ? hl.n : 0));
                        }
                    }
                    i6 = 0;
                    mpbVar.setPadding(0, L, 0, (hl.L(i6 + 72) - 12) + (!((pqb) this.c).W0() ? hl.n : 0));
                } else {
                    j = 0;
                }
                ((pqb) this.c).w0.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5 - layoutParams4.bottomMargin, TLObject.FLAG_30));
                ((FrameLayout.LayoutParams) ((pqb) this.c).z0.getLayoutParams()).topMargin = measuredHeight;
                ((pqb) this.c).z0.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30));
                jo0 jo0Var = ((pqb) this.c).S1;
                if (jo0Var != null) {
                    ((FrameLayout.LayoutParams) jo0Var.getLayoutParams()).topMargin = measuredHeight;
                    ((pqb) this.c).S1.measure(View.MeasureSpec.makeMeasureSpec(hl.L(222.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(76.0f), TLObject.FLAG_30));
                }
                vb0 vb0Var = ((pqb) this.c).E0;
                if (vb0Var != null) {
                    vb0Var.setPadding(hl.L(12.0f), hl.L(12.0f), hl.L(12.0f), hl.L(12.0f) + (((pqb) this.c).W0() ? hl.n : 0));
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((pqb) this.c).E0.getLayoutParams();
                    pqb pqbVar3 = (pqb) this.c;
                    layoutParams5.height = hl.L(72 + ((pqbVar3.M1 || pqbVar3.L1 <= j) ? 0 : 58)) + (((pqb) this.c).W0() ? hl.n : 0);
                    measureChildWithMargins(((pqb) this.c).E0, i, 0, i2, 0);
                }
                Drawable drawable = ((pqb) this.c).r;
                if (drawable != null) {
                    drawable.getPadding(hl.Q);
                }
                int i8 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((pqb) this.c).N0;
                    if (i8 >= frameLayoutArr.length) {
                        break;
                    } else {
                        FrameLayout frameLayout = frameLayoutArr[i8];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i8 == 0) {
                                f = ((pqb) this.c).b == 2 ? jn7.r5 : jn7.v4;
                            } else {
                                f = 316.0f;
                            }
                            layoutParams6.height = hl.L(f);
                            if (((pqb) this.c).W0()) {
                                layoutParams6.height += hl.n;
                            }
                            if (i8 == 0) {
                                layoutParams6.height = hl.L(12.0f) + hl.Q.top + layoutParams6.height;
                            }
                            ((pqb) this.c).N0[i8].setPadding(0, i8 == 0 ? hl.L(12.0f) + hl.Q.top : 0, 0, ((pqb) this.c).W0() ? hl.n : 0);
                            measureChildWithMargins(((pqb) this.c).N0[i8], i, 0, i2, 0);
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
                s7 s7Var = (s7) this.c;
                d7 d7Var = s7Var.s;
                if (d7Var != null && d7Var.getTag() != null) {
                    s7Var.s.setAlpha(f);
                    s7Var.s.setScaleX(f);
                    s7Var.s.setScaleY(f);
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
                s7 s7Var = (s7) this.c;
                d7 d7Var = s7Var.s;
                if (d7Var != null) {
                    d7Var.setVisibility(i);
                }
                View view = s7Var.x;
                if (view != null) {
                    view.setVisibility(i);
                }
                FrameLayout frameLayout = s7Var.a;
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
    public /* synthetic */ l7(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.c = obj;
    }
}
