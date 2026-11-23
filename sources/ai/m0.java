package ai;

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
import c8.ma;
import di.n4;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.bn;
import org.telegram.ui.r61;
import org.telegram.ui.t4;
import org.telegram.ui.x71;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class m0 extends FrameLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.c = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.c;
                super.dispatchDraw(canvas);
                float height = getHeight() / 2.0f;
                if (this.b) {
                    float width = getWidth() - org.telegram.messenger.g0.L(26.0f);
                    canvas.drawLine(width - org.telegram.messenger.g0.L(5.0f), height, width - org.telegram.messenger.g0.L(1.5f), height + org.telegram.messenger.g0.L(3.5f), paint);
                    canvas.drawLine(width - org.telegram.messenger.g0.L(1.5f), org.telegram.messenger.g0.L(3.5f) + height, org.telegram.messenger.g0.L(5.5f) + width, height - org.telegram.messenger.g0.L(4.0f), paint);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        r4 r4Var;
        r4 r4Var2;
        int i7;
        switch (this.a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j3);
                x71 x71Var = (x71) this.c;
                if (view == x71Var.u0) {
                    r4Var = ((org.telegram.ui.ActionBar.g2) x71Var).parentLayout;
                    if (r4Var != null) {
                        r4Var2 = ((org.telegram.ui.ActionBar.g2) x71Var).parentLayout;
                        if (x71Var.u0.getVisibility() == 0) {
                            i7 = (int) (x71Var.u0.getTranslationY() + x71Var.u0.getMeasuredHeight());
                        } else {
                            i7 = 0;
                        }
                        ((ActionBarLayout) r4Var2).q(canvas, i7);
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 0:
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
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.c;
                super.onLayout(z10, i7, i10, i11, i12);
                int i13 = 0;
                if (!hd.a0 && q0Var.h.getVisibility() == 0) {
                    i13 = org.telegram.messenger.g0.L(4.0f) + q0Var.h.getMeasuredWidth();
                }
                if (q0Var.f.getVisibility() == 0) {
                    i13 += q0Var.f.getMeasuredWidth();
                }
                ah.i iVar = q0Var.e;
                iVar.layout(i13, iVar.getTop(), q0Var.e.getMeasuredWidth() + i13, q0Var.e.getBottom());
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        TextView textView;
        float f10;
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.c;
                measureChildWithMargins(q0Var.s, i7, 0, i10, 0);
                View view = q0Var.x;
                if (view != null) {
                    measureChildWithMargins(view, i7, 0, i10, 0);
                }
                if (!hd.a0) {
                    if (q0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(q0Var.h, i7, View.MeasureSpec.getSize(i7) / 2, i10, 0);
                        i12 = org.telegram.messenger.g0.L(4.0f) + q0Var.h.getMeasuredWidth();
                    } else {
                        i12 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i7);
                    this.b = true;
                    measureChildWithMargins(q0Var.f, i7, i12, i10, 0);
                    int measuredWidth = q0Var.f.getVisibility() == 0 ? q0Var.f.getMeasuredWidth() : 0;
                    ah.i iVar = q0Var.e;
                    int i14 = i12 + measuredWidth;
                    View view2 = q0Var.x;
                    measureChildWithMargins(iVar, i7, i14 + (view2 != null ? view2.getMeasuredWidth() : 0), i10, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(q0Var.e.getMeasuredWidth() + measuredWidth, size), View.MeasureSpec.getSize(i10));
                    break;
                } else {
                    if (q0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(q0Var.h, i7, View.MeasureSpec.getSize(i7) / 2, i10, 0);
                        i11 = org.telegram.messenger.g0.L(4.0f) + q0Var.h.getMeasuredWidth();
                    } else {
                        i11 = 0;
                    }
                    int size2 = View.MeasureSpec.getSize(i7);
                    this.b = true;
                    measureChildWithMargins(q0Var.f, i7, i11, i10, 0);
                    int measuredWidth2 = q0Var.f.getVisibility() == 0 ? q0Var.f.getMeasuredWidth() : 0;
                    measureChildWithMargins(q0Var.e, o10.c(12.0f, size2, 0), i11 + measuredWidth2, i10, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(q0Var.e.getMeasuredWidth() + measuredWidth2, size2), View.MeasureSpec.getSize(i10));
                    break;
                }
            case 2:
                int size3 = View.MeasureSpec.getSize(i7);
                bn bnVar = (bn) this.c;
                if (bnVar.ba()) {
                    size3 -= org.telegram.messenger.g0.L(71.0f);
                    i13 = org.telegram.messenger.g0.L(32.0f);
                } else {
                    i13 = 0;
                }
                TextView textView2 = bnVar.a2;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = bnVar.c2) != null && textView.getVisibility() == 0) {
                    size3 = o10.z(31.0f, size3, 2);
                }
                this.b = true;
                TextView textView3 = bnVar.c2;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bnVar.c2.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = bnVar.a2;
                    if (textView4 == null || textView4.getVisibility() != 0) {
                        bnVar.c2.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
                        layoutParams.leftMargin = i13;
                    } else {
                        bnVar.c2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        layoutParams.leftMargin = i13 + size3;
                        layoutParams.width -= org.telegram.messenger.g0.L(15.0f);
                    }
                }
                TextView textView5 = bnVar.a2;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) bnVar.a2.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = bnVar.c2;
                    if (textView6 == null || textView6.getVisibility() != 0) {
                        bnVar.a2.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
                    } else {
                        bnVar.a2.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    }
                    layoutParams2.leftMargin = i13;
                }
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 3:
                int size4 = View.MeasureSpec.getSize(i7);
                int size5 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size4, size5);
                if (((x71) this.c).e != null) {
                    this.b = true;
                    if (!org.telegram.messenger.g0.Q1()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((x71) this.c).e.getLayoutParams();
                        layoutParams3.topMargin = org.telegram.messenger.g0.m;
                        ((x71) this.c).e.setLayoutParams(layoutParams3);
                    }
                    if (org.telegram.messenger.g0.Q1() || org.telegram.messenger.t0.b.getResources().getConfiguration().orientation != 2) {
                        ((x71) this.c).h.setTextSize(1, 20.0f);
                    } else {
                        ((x71) this.c).h.setTextSize(1, 18.0f);
                    }
                    this.b = false;
                }
                measureChildWithMargins(((x71) this.c).u0, i7, 0, i10, 0);
                int measuredHeight = ((x71) this.c).u0.getMeasuredHeight();
                if (((x71) this.c).u0.getVisibility() == 0) {
                    size5 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((x71) this.c).w0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                x71 x71Var = (x71) this.c;
                if (x71Var.b == 2) {
                    r61 r61Var = x71Var.w0;
                    int L = org.telegram.messenger.g0.L(4.0f);
                    x71 x71Var2 = (x71) this.c;
                    r61Var.setPadding(0, L, 0, (org.telegram.messenger.g0.L(((x71Var2.M1 || x71Var2.L1 <= 0) ? 0 : 58) + 72) - 12) + (((x71) this.c).Z0() ? org.telegram.messenger.g0.n : 0));
                }
                ((x71) this.c).w0.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5 - layoutParams4.bottomMargin, TLObject.FLAG_30));
                ((FrameLayout.LayoutParams) ((x71) this.c).z0.getLayoutParams()).topMargin = measuredHeight;
                ((x71) this.c).z0.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30));
                n4 n4Var = ((x71) this.c).S1;
                if (n4Var != null) {
                    ((FrameLayout.LayoutParams) n4Var.getLayoutParams()).topMargin = measuredHeight;
                    ((x71) this.c).S1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(222.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(76.0f), TLObject.FLAG_30));
                }
                t4 t4Var = ((x71) this.c).E0;
                if (t4Var != null) {
                    t4Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + (((x71) this.c).Z0() ? org.telegram.messenger.g0.n : 0));
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((x71) this.c).E0.getLayoutParams();
                    x71 x71Var3 = (x71) this.c;
                    layoutParams5.height = org.telegram.messenger.g0.L(72 + ((x71Var3.M1 || x71Var3.L1 <= 0) ? 0 : 58)) + (((x71) this.c).Z0() ? org.telegram.messenger.g0.n : 0);
                    measureChildWithMargins(((x71) this.c).E0, i7, 0, i10, 0);
                }
                Drawable drawable = ((x71) this.c).r;
                if (drawable != null) {
                    drawable.getPadding(org.telegram.messenger.g0.Q);
                }
                int i15 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((x71) this.c).N0;
                    if (i15 >= frameLayoutArr.length) {
                        break;
                    } else {
                        FrameLayout frameLayout = frameLayoutArr[i15];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i15 == 0) {
                                f10 = ((x71) this.c).b == 2 ? ls.s5 : ls.w4;
                            } else {
                                f10 = 316.0f;
                            }
                            layoutParams6.height = org.telegram.messenger.g0.L(f10);
                            if (((x71) this.c).Z0()) {
                                layoutParams6.height += org.telegram.messenger.g0.n;
                            }
                            if (i15 == 0) {
                                layoutParams6.height = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.Q.top + layoutParams6.height;
                            }
                            ((x71) this.c).N0[i15].setPadding(0, i15 == 0 ? org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.Q.top : 0, 0, ((x71) this.c).Z0() ? org.telegram.messenger.g0.n : 0);
                            measureChildWithMargins(((x71) this.c).N0[i15], i7, 0, i10, 0);
                        }
                        i15++;
                    }
                }
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 1:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 2:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 3:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 1:
                super.setAlpha(f10);
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.c;
                org.telegram.ui.ActionBar.f0 f0Var = q0Var.s;
                if (f0Var != null && f0Var.getTag() != null) {
                    q0Var.s.setAlpha(f10);
                    q0Var.s.setScaleX(f10);
                    q0Var.s.setScaleY(f10);
                    break;
                }
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        switch (this.a) {
            case 1:
                super.setVisibility(i7);
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.c;
                org.telegram.ui.ActionBar.f0 f0Var = q0Var.s;
                if (f0Var != null) {
                    f0Var.setVisibility(i7);
                }
                View view = q0Var.x;
                if (view != null) {
                    view.setVisibility(i7);
                }
                FrameLayout frameLayout = q0Var.a;
                if (frameLayout != null) {
                    frameLayout.setVisibility(i7);
                    break;
                }
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Context context, CharSequence charSequence, CharSequence charSequence2, int i7, boolean z10) {
        super(context);
        this.a = 0;
        Paint paint = new Paint(1);
        this.c = paint;
        this.b = z10;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(i7);
        textView.setSingleLine(true);
        textView.setGravity(16);
        if (charSequence2 != null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(16);
            linearLayout.addView(textView, ma.o(-2, -2));
            TextView textView2 = new TextView(context);
            SpannableStringBuilder append = new SpannableStringBuilder(charSequence2).append((CharSequence) " >");
            append.setSpan(new n0(), append.length() - 1, append.length(), 33);
            textView2.setText(append);
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(m6.r1(0.55f, i7));
            textView2.setSingleLine(true);
            linearLayout.addView(textView2, ma.k(0.0f, 1.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, ma.d(-2, -1.0f, 3, 18.0f, 0.0f, 44.0f, 0.0f));
        } else {
            addView(textView, ma.d(-2, -1.0f, 3, 18.0f, 0.0f, 44.0f, 0.0f));
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.75f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(i7);
    }
}
