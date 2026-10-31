package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.i81;
import org.telegram.ui.m91;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m0 extends FrameLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        z4 z4Var;
        z4 z4Var2;
        int i10;
        switch (this.a) {
            case 2:
                boolean drawChild = super.drawChild(canvas, view, j10);
                m91 m91Var = (m91) this.c;
                if (view == m91Var.t0) {
                    z4Var = m91Var.parentLayout;
                    if (z4Var != null) {
                        z4Var2 = m91Var.parentLayout;
                        if (m91Var.t0.getVisibility() == 0) {
                            i10 = (int) (m91Var.t0.getTranslationY() + m91Var.t0.getMeasuredHeight());
                        } else {
                            i10 = 0;
                        }
                        ((ActionBarLayout) z4Var2).q(canvas, i10);
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                t0 t0Var = (t0) this.c;
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = 0;
                if (!cd.X && t0Var.h.getVisibility() == 0) {
                    i14 = org.telegram.messenger.i0.L(4.0f) + t0Var.h.getMeasuredWidth();
                }
                if (t0Var.f.getVisibility() == 0) {
                    i14 += t0Var.f.getMeasuredWidth();
                }
                n0 n0Var = t0Var.e;
                n0Var.layout(i14, n0Var.getTop(), t0Var.e.getMeasuredWidth() + i14, t0Var.e.getBottom());
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        TextView textView;
        float f7;
        switch (this.a) {
            case 0:
                t0 t0Var = (t0) this.c;
                measureChildWithMargins(t0Var.s, i10, 0, i11, 0);
                View view = t0Var.x;
                if (view != null) {
                    measureChildWithMargins(view, i10, 0, i11, 0);
                }
                if (!cd.X) {
                    if (t0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(t0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                        i13 = org.telegram.messenger.i0.L(4.0f) + t0Var.h.getMeasuredWidth();
                    } else {
                        i13 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i10);
                    this.b = true;
                    measureChildWithMargins(t0Var.f, i10, i13, i11, 0);
                    int measuredWidth = t0Var.f.getVisibility() == 0 ? t0Var.f.getMeasuredWidth() : 0;
                    n0 n0Var = t0Var.e;
                    int i15 = i13 + measuredWidth;
                    View view2 = t0Var.x;
                    measureChildWithMargins(n0Var, i10, i15 + (view2 != null ? view2.getMeasuredWidth() : 0), i11, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(t0Var.e.getMeasuredWidth() + measuredWidth, size), View.MeasureSpec.getSize(i11));
                    break;
                } else {
                    if (t0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(t0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                        i12 = org.telegram.messenger.i0.L(4.0f) + t0Var.h.getMeasuredWidth();
                    } else {
                        i12 = 0;
                    }
                    int size2 = View.MeasureSpec.getSize(i10);
                    this.b = true;
                    measureChildWithMargins(t0Var.f, i10, i12, i11, 0);
                    int measuredWidth2 = t0Var.f.getVisibility() == 0 ? t0Var.f.getMeasuredWidth() : 0;
                    measureChildWithMargins(t0Var.e, z20.c(12.0f, size2, 0), i12 + measuredWidth2, i11, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(t0Var.e.getMeasuredWidth() + measuredWidth2, size2), View.MeasureSpec.getSize(i11));
                    break;
                }
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                un unVar = (un) this.c;
                if (unVar.P9()) {
                    size3 -= org.telegram.messenger.i0.L(71.0f);
                    i14 = org.telegram.messenger.i0.L(32.0f);
                } else {
                    i14 = 0;
                }
                TextView textView2 = unVar.Z1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = unVar.b2) != null && textView.getVisibility() == 0) {
                    size3 = z20.y(31.0f, size3, 2);
                }
                this.b = true;
                TextView textView3 = unVar.b2;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) unVar.b2.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = unVar.Z1;
                    if (textView4 == null || textView4.getVisibility() != 0) {
                        unVar.b2.setPadding(org.telegram.messenger.i0.L(48.0f), 0, org.telegram.messenger.i0.L(48.0f), 0);
                        layoutParams.leftMargin = i14;
                    } else {
                        unVar.b2.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
                        layoutParams.leftMargin = i14 + size3;
                        layoutParams.width -= org.telegram.messenger.i0.L(15.0f);
                    }
                }
                TextView textView5 = unVar.Z1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) unVar.Z1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = unVar.b2;
                    if (textView6 == null || textView6.getVisibility() != 0) {
                        unVar.Z1.setPadding(org.telegram.messenger.i0.L(48.0f), 0, org.telegram.messenger.i0.L(48.0f), 0);
                    } else {
                        unVar.Z1.setPadding(org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
                    }
                    layoutParams2.leftMargin = i14;
                }
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size4, size5);
                if (((m91) this.c).e != null) {
                    this.b = true;
                    if (!org.telegram.messenger.i0.Q1()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((m91) this.c).e.getLayoutParams();
                        layoutParams3.topMargin = org.telegram.messenger.i0.m;
                        ((m91) this.c).e.setLayoutParams(layoutParams3);
                    }
                    if (org.telegram.messenger.i0.Q1() || org.telegram.messenger.w0.b.getResources().getConfiguration().orientation != 2) {
                        ((m91) this.c).h.setTextSize(1, 20.0f);
                    } else {
                        ((m91) this.c).h.setTextSize(1, 18.0f);
                    }
                    this.b = false;
                }
                measureChildWithMargins(((m91) this.c).t0, i10, 0, i11, 0);
                int measuredHeight = ((m91) this.c).t0.getMeasuredHeight();
                if (((m91) this.c).t0.getVisibility() == 0) {
                    size5 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((m91) this.c).v0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                m91 m91Var = (m91) this.c;
                if (m91Var.b == 2) {
                    i81 i81Var = m91Var.v0;
                    int L = org.telegram.messenger.i0.L(4.0f);
                    m91 m91Var2 = (m91) this.c;
                    i81Var.setPadding(0, L, 0, (org.telegram.messenger.i0.L(((m91Var2.L1 || m91Var2.K1 <= 0) ? 0 : 58) + 72) - 12) + (((m91) this.c).Y0() ? org.telegram.messenger.i0.n : 0));
                }
                ((m91) this.c).v0.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5 - layoutParams4.bottomMargin, TLObject.FLAG_30));
                ((FrameLayout.LayoutParams) ((m91) this.c).y0.getLayoutParams()).topMargin = measuredHeight;
                ((m91) this.c).y0.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30));
                jg.b1 b1Var = ((m91) this.c).R1;
                if (b1Var != null) {
                    ((FrameLayout.LayoutParams) b1Var.getLayoutParams()).topMargin = measuredHeight;
                    ((m91) this.c).R1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(222.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(76.0f), TLObject.FLAG_30));
                }
                ig.s sVar = ((m91) this.c).D0;
                if (sVar != null) {
                    sVar.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f) + (((m91) this.c).Y0() ? org.telegram.messenger.i0.n : 0));
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((m91) this.c).D0.getLayoutParams();
                    m91 m91Var3 = (m91) this.c;
                    layoutParams5.height = org.telegram.messenger.i0.L(72 + ((m91Var3.L1 || m91Var3.K1 <= 0) ? 0 : 58)) + (((m91) this.c).Y0() ? org.telegram.messenger.i0.n : 0);
                    measureChildWithMargins(((m91) this.c).D0, i10, 0, i11, 0);
                }
                Drawable drawable = ((m91) this.c).r;
                if (drawable != null) {
                    drawable.getPadding(org.telegram.messenger.i0.Q);
                }
                int i16 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((m91) this.c).M0;
                    if (i16 >= frameLayoutArr.length) {
                        break;
                    } else {
                        FrameLayout frameLayout = frameLayoutArr[i16];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i16 == 0) {
                                f7 = ((m91) this.c).b == 2 ? zs.s5 : zs.w4;
                            } else {
                                f7 = 316.0f;
                            }
                            layoutParams6.height = org.telegram.messenger.i0.L(f7);
                            if (((m91) this.c).Y0()) {
                                layoutParams6.height += org.telegram.messenger.i0.n;
                            }
                            if (i16 == 0) {
                                layoutParams6.height = org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.Q.top + layoutParams6.height;
                            }
                            ((m91) this.c).M0[i16].setPadding(0, i16 == 0 ? org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.Q.top : 0, 0, ((m91) this.c).Y0() ? org.telegram.messenger.i0.n : 0);
                            measureChildWithMargins(((m91) this.c).M0[i16], i10, 0, i11, 0);
                        }
                        i16++;
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
            default:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 0:
                super.setAlpha(f7);
                t0 t0Var = (t0) this.c;
                g0 g0Var = t0Var.s;
                if (g0Var != null && g0Var.getTag() != null) {
                    t0Var.s.setAlpha(f7);
                    t0Var.s.setScaleX(f7);
                    t0Var.s.setScaleY(f7);
                    break;
                }
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 0:
                super.setVisibility(i10);
                t0 t0Var = (t0) this.c;
                g0 g0Var = t0Var.s;
                if (g0Var != null) {
                    g0Var.setVisibility(i10);
                }
                View view = t0Var.x;
                if (view != null) {
                    view.setVisibility(i10);
                }
                FrameLayout frameLayout = t0Var.a;
                if (frameLayout != null) {
                    frameLayout.setVisibility(i10);
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
