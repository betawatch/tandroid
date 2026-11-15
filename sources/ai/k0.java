package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ja;
import di.k4;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.an;
import org.telegram.ui.n61;
import org.telegram.ui.t4;
import org.telegram.ui.t71;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class k0 extends FrameLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i7, Context context, Object obj) {
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
                if (this.b) {
                    float height = getHeight() / 2.0f;
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
        o4 o4Var;
        o4 o4Var2;
        int i7;
        switch (this.a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j3);
                t71 t71Var = (t71) this.c;
                if (view == t71Var.u0) {
                    o4Var = ((org.telegram.ui.ActionBar.e2) t71Var).parentLayout;
                    if (o4Var != null) {
                        o4Var2 = ((org.telegram.ui.ActionBar.e2) t71Var).parentLayout;
                        if (t71Var.u0.getVisibility() == 0) {
                            i7 = (int) (t71Var.u0.getTranslationY() + t71Var.u0.getMeasuredHeight());
                        } else {
                            i7 = 0;
                        }
                        ((ActionBarLayout) o4Var2).q(canvas, i7);
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
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
                    measureChildWithMargins(q0Var.e, i20.c(12.0f, size2, 0), i11 + measuredWidth2, i10, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(q0Var.e.getMeasuredWidth() + measuredWidth2, size2), View.MeasureSpec.getSize(i10));
                    break;
                }
            case 2:
                int size3 = View.MeasureSpec.getSize(i7);
                an anVar = (an) this.c;
                if (anVar.ba()) {
                    size3 -= org.telegram.messenger.g0.L(71.0f);
                    i13 = org.telegram.messenger.g0.L(32.0f);
                } else {
                    i13 = 0;
                }
                TextView textView2 = anVar.a2;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = anVar.c2) != null && textView.getVisibility() == 0) {
                    size3 = i20.y(31.0f, size3, 2);
                }
                this.b = true;
                TextView textView3 = anVar.c2;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anVar.c2.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = anVar.a2;
                    if (textView4 == null || textView4.getVisibility() != 0) {
                        anVar.c2.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
                        layoutParams.leftMargin = i13;
                    } else {
                        anVar.c2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        layoutParams.leftMargin = i13 + size3;
                        layoutParams.width -= org.telegram.messenger.g0.L(15.0f);
                    }
                }
                TextView textView5 = anVar.a2;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) anVar.a2.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = anVar.c2;
                    if (textView6 == null || textView6.getVisibility() != 0) {
                        anVar.a2.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
                    } else {
                        anVar.a2.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
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
                if (((t71) this.c).e != null) {
                    this.b = true;
                    if (!org.telegram.messenger.g0.Q1()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((t71) this.c).e.getLayoutParams();
                        layoutParams3.topMargin = org.telegram.messenger.g0.m;
                        ((t71) this.c).e.setLayoutParams(layoutParams3);
                    }
                    if (org.telegram.messenger.g0.Q1() || org.telegram.messenger.t0.b.getResources().getConfiguration().orientation != 2) {
                        ((t71) this.c).h.setTextSize(1, 20.0f);
                    } else {
                        ((t71) this.c).h.setTextSize(1, 18.0f);
                    }
                    this.b = false;
                }
                measureChildWithMargins(((t71) this.c).u0, i7, 0, i10, 0);
                int measuredHeight = ((t71) this.c).u0.getMeasuredHeight();
                if (((t71) this.c).u0.getVisibility() == 0) {
                    size5 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((t71) this.c).w0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                t71 t71Var = (t71) this.c;
                if (t71Var.b == 2) {
                    n61 n61Var = t71Var.w0;
                    int L = org.telegram.messenger.g0.L(4.0f);
                    t71 t71Var2 = (t71) this.c;
                    n61Var.setPadding(0, L, 0, (org.telegram.messenger.g0.L(((t71Var2.M1 || t71Var2.L1 <= 0) ? 0 : 58) + 72) - 12) + (((t71) this.c).Z0() ? org.telegram.messenger.g0.n : 0));
                }
                ((t71) this.c).w0.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5 - layoutParams4.bottomMargin, TLObject.FLAG_30));
                ((FrameLayout.LayoutParams) ((t71) this.c).z0.getLayoutParams()).topMargin = measuredHeight;
                ((t71) this.c).z0.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30));
                k4 k4Var = ((t71) this.c).S1;
                if (k4Var != null) {
                    ((FrameLayout.LayoutParams) k4Var.getLayoutParams()).topMargin = measuredHeight;
                    ((t71) this.c).S1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(222.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(76.0f), TLObject.FLAG_30));
                }
                t4 t4Var = ((t71) this.c).E0;
                if (t4Var != null) {
                    t4Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + (((t71) this.c).Z0() ? org.telegram.messenger.g0.n : 0));
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((t71) this.c).E0.getLayoutParams();
                    t71 t71Var3 = (t71) this.c;
                    layoutParams5.height = org.telegram.messenger.g0.L(72 + ((t71Var3.M1 || t71Var3.L1 <= 0) ? 0 : 58)) + (((t71) this.c).Z0() ? org.telegram.messenger.g0.n : 0);
                    measureChildWithMargins(((t71) this.c).E0, i7, 0, i10, 0);
                }
                Drawable drawable = ((t71) this.c).r;
                if (drawable != null) {
                    drawable.getPadding(org.telegram.messenger.g0.Q);
                }
                int i15 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((t71) this.c).N0;
                    if (i15 >= frameLayoutArr.length) {
                        break;
                    } else {
                        FrameLayout frameLayout = frameLayoutArr[i15];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i15 == 0) {
                                f10 = ((t71) this.c).b == 2 ? ns.s5 : ns.w4;
                            } else {
                                f10 = 316.0f;
                            }
                            layoutParams6.height = org.telegram.messenger.g0.L(f10);
                            if (((t71) this.c).Z0()) {
                                layoutParams6.height += org.telegram.messenger.g0.n;
                            }
                            if (i15 == 0) {
                                layoutParams6.height = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.Q.top + layoutParams6.height;
                            }
                            ((t71) this.c).N0[i15].setPadding(0, i15 == 0 ? org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.Q.top : 0, 0, ((t71) this.c).Z0() ? org.telegram.messenger.g0.n : 0);
                            measureChildWithMargins(((t71) this.c).N0[i15], i7, 0, i10, 0);
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
    public k0(Context context, CharSequence charSequence, int i7, boolean z10) {
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
        addView(textView, ja.d(-2, -1.0f, 3, 18.0f, 0.0f, 44.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.75f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(i7);
    }
}
