package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.an;
import org.telegram.ui.r61;
import org.telegram.ui.v71;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class l0 extends FrameLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.c = obj;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        q4 q4Var;
        q4 q4Var2;
        int i7;
        switch (this.a) {
            case 2:
                boolean drawChild = super.drawChild(canvas, view, j3);
                v71 v71Var = (v71) this.c;
                if (view == v71Var.t0) {
                    q4Var = v71Var.parentLayout;
                    if (q4Var != null) {
                        q4Var2 = v71Var.parentLayout;
                        if (v71Var.t0.getVisibility() == 0) {
                            i7 = (int) (v71Var.t0.getTranslationY() + v71Var.t0.getMeasuredHeight());
                        } else {
                            i7 = 0;
                        }
                        ((ActionBarLayout) q4Var2).q(canvas, i7);
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                r0 r0Var = (r0) this.c;
                super.onLayout(z9, i7, i10, i11, i12);
                int i13 = 0;
                if (!id.a0 && r0Var.h.getVisibility() == 0) {
                    i13 = org.telegram.messenger.g0.L(4.0f) + r0Var.h.getMeasuredWidth();
                }
                if (r0Var.f.getVisibility() == 0) {
                    i13 += r0Var.f.getMeasuredWidth();
                }
                ah.i iVar = r0Var.e;
                iVar.layout(i13, iVar.getTop(), r0Var.e.getMeasuredWidth() + i13, r0Var.e.getBottom());
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        TextView textView;
        float f10;
        switch (this.a) {
            case 0:
                r0 r0Var = (r0) this.c;
                measureChildWithMargins(r0Var.s, i7, 0, i10, 0);
                View view = r0Var.x;
                if (view != null) {
                    measureChildWithMargins(view, i7, 0, i10, 0);
                }
                if (!id.a0) {
                    if (r0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(r0Var.h, i7, View.MeasureSpec.getSize(i7) / 2, i10, 0);
                        i12 = org.telegram.messenger.g0.L(4.0f) + r0Var.h.getMeasuredWidth();
                    } else {
                        i12 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i7);
                    this.b = true;
                    measureChildWithMargins(r0Var.f, i7, i12, i10, 0);
                    int measuredWidth = r0Var.f.getVisibility() == 0 ? r0Var.f.getMeasuredWidth() : 0;
                    ah.i iVar = r0Var.e;
                    int i14 = i12 + measuredWidth;
                    View view2 = r0Var.x;
                    measureChildWithMargins(iVar, i7, i14 + (view2 != null ? view2.getMeasuredWidth() : 0), i10, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(r0Var.e.getMeasuredWidth() + measuredWidth, size), View.MeasureSpec.getSize(i10));
                    break;
                } else {
                    if (r0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(r0Var.h, i7, View.MeasureSpec.getSize(i7) / 2, i10, 0);
                        i11 = org.telegram.messenger.g0.L(4.0f) + r0Var.h.getMeasuredWidth();
                    } else {
                        i11 = 0;
                    }
                    int size2 = View.MeasureSpec.getSize(i7);
                    this.b = true;
                    measureChildWithMargins(r0Var.f, i7, i11, i10, 0);
                    int measuredWidth2 = r0Var.f.getVisibility() == 0 ? r0Var.f.getMeasuredWidth() : 0;
                    measureChildWithMargins(r0Var.e, org.telegram.messenger.camera.q.c(12.0f, size2, 0), i11 + measuredWidth2, i10, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(r0Var.e.getMeasuredWidth() + measuredWidth2, size2), View.MeasureSpec.getSize(i10));
                    break;
                }
            case 1:
                int size3 = View.MeasureSpec.getSize(i7);
                an anVar = (an) this.c;
                if (anVar.Z9()) {
                    size3 -= org.telegram.messenger.g0.L(71.0f);
                    i13 = org.telegram.messenger.g0.L(32.0f);
                } else {
                    i13 = 0;
                }
                TextView textView2 = anVar.Z1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = anVar.b2) != null && textView.getVisibility() == 0) {
                    size3 = org.telegram.messenger.camera.q.y(31.0f, size3, 2);
                }
                this.b = true;
                TextView textView3 = anVar.b2;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anVar.b2.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = anVar.Z1;
                    if (textView4 == null || textView4.getVisibility() != 0) {
                        anVar.b2.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
                        layoutParams.leftMargin = i13;
                    } else {
                        anVar.b2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        layoutParams.leftMargin = i13 + size3;
                        layoutParams.width -= org.telegram.messenger.g0.L(15.0f);
                    }
                }
                TextView textView5 = anVar.Z1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) anVar.Z1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = anVar.b2;
                    if (textView6 == null || textView6.getVisibility() != 0) {
                        anVar.Z1.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
                    } else {
                        anVar.Z1.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    }
                    layoutParams2.leftMargin = i13;
                }
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            default:
                int size4 = View.MeasureSpec.getSize(i7);
                int size5 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size4, size5);
                if (((v71) this.c).e != null) {
                    this.b = true;
                    if (!org.telegram.messenger.g0.Q1()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((v71) this.c).e.getLayoutParams();
                        layoutParams3.topMargin = org.telegram.messenger.g0.m;
                        ((v71) this.c).e.setLayoutParams(layoutParams3);
                    }
                    if (org.telegram.messenger.g0.Q1() || org.telegram.messenger.t0.b.getResources().getConfiguration().orientation != 2) {
                        ((v71) this.c).h.setTextSize(1, 20.0f);
                    } else {
                        ((v71) this.c).h.setTextSize(1, 18.0f);
                    }
                    this.b = false;
                }
                measureChildWithMargins(((v71) this.c).t0, i7, 0, i10, 0);
                int measuredHeight = ((v71) this.c).t0.getMeasuredHeight();
                if (((v71) this.c).t0.getVisibility() == 0) {
                    size5 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((v71) this.c).v0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                v71 v71Var = (v71) this.c;
                if (v71Var.b == 2) {
                    r61 r61Var = v71Var.v0;
                    int L = org.telegram.messenger.g0.L(4.0f);
                    v71 v71Var2 = (v71) this.c;
                    r61Var.setPadding(0, L, 0, (org.telegram.messenger.g0.L(((v71Var2.L1 || v71Var2.K1 <= 0) ? 0 : 58) + 72) - 12) + (((v71) this.c).Z0() ? org.telegram.messenger.g0.n : 0));
                }
                ((v71) this.c).v0.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5 - layoutParams4.bottomMargin, TLObject.FLAG_30));
                ((FrameLayout.LayoutParams) ((v71) this.c).y0.getLayoutParams()).topMargin = measuredHeight;
                ((v71) this.c).y0.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30));
                bi.m5 m5Var = ((v71) this.c).R1;
                if (m5Var != null) {
                    ((FrameLayout.LayoutParams) m5Var.getLayoutParams()).topMargin = measuredHeight;
                    ((v71) this.c).R1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(222.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(76.0f), TLObject.FLAG_30));
                }
                org.telegram.ui.t4 t4Var = ((v71) this.c).D0;
                if (t4Var != null) {
                    t4Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + (((v71) this.c).Z0() ? org.telegram.messenger.g0.n : 0));
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((v71) this.c).D0.getLayoutParams();
                    v71 v71Var3 = (v71) this.c;
                    layoutParams5.height = org.telegram.messenger.g0.L(72 + ((v71Var3.L1 || v71Var3.K1 <= 0) ? 0 : 58)) + (((v71) this.c).Z0() ? org.telegram.messenger.g0.n : 0);
                    measureChildWithMargins(((v71) this.c).D0, i7, 0, i10, 0);
                }
                Drawable drawable = ((v71) this.c).r;
                if (drawable != null) {
                    drawable.getPadding(org.telegram.messenger.g0.Q);
                }
                int i15 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((v71) this.c).M0;
                    if (i15 >= frameLayoutArr.length) {
                        break;
                    } else {
                        FrameLayout frameLayout = frameLayoutArr[i15];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i15 == 0) {
                                f10 = ((v71) this.c).b == 2 ? qs.s5 : qs.w4;
                            } else {
                                f10 = 316.0f;
                            }
                            layoutParams6.height = org.telegram.messenger.g0.L(f10);
                            if (((v71) this.c).Z0()) {
                                layoutParams6.height += org.telegram.messenger.g0.n;
                            }
                            if (i15 == 0) {
                                layoutParams6.height = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.Q.top + layoutParams6.height;
                            }
                            ((v71) this.c).M0[i15].setPadding(0, i15 == 0 ? org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.Q.top : 0, 0, ((v71) this.c).Z0() ? org.telegram.messenger.g0.n : 0);
                            measureChildWithMargins(((v71) this.c).M0[i15], i7, 0, i10, 0);
                        }
                        i15++;
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
    public void setAlpha(float f10) {
        switch (this.a) {
            case 0:
                super.setAlpha(f10);
                r0 r0Var = (r0) this.c;
                f0 f0Var = r0Var.s;
                if (f0Var != null && f0Var.getTag() != null) {
                    r0Var.s.setAlpha(f10);
                    r0Var.s.setScaleX(f10);
                    r0Var.s.setScaleY(f10);
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
            case 0:
                super.setVisibility(i7);
                r0 r0Var = (r0) this.c;
                f0 f0Var = r0Var.s;
                if (f0Var != null) {
                    f0Var.setVisibility(i7);
                }
                View view = r0Var.x;
                if (view != null) {
                    view.setVisibility(i7);
                }
                FrameLayout frameLayout = r0Var.a;
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
}
