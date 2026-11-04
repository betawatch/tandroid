package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.g61;
import org.telegram.ui.l71;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k0 extends FrameLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i3, Context context, Object obj) {
        super(context);
        this.a = i3;
        this.c = obj;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        q4 q4Var;
        q4 q4Var2;
        int i3;
        switch (this.a) {
            case 2:
                boolean drawChild = super.drawChild(canvas, view, j10);
                l71 l71Var = (l71) this.c;
                if (view == l71Var.u0) {
                    q4Var = l71Var.parentLayout;
                    if (q4Var != null) {
                        q4Var2 = l71Var.parentLayout;
                        if (l71Var.u0.getVisibility() == 0) {
                            i3 = (int) (l71Var.u0.getTranslationY() + l71Var.u0.getMeasuredHeight());
                        } else {
                            i3 = 0;
                        }
                        ((ActionBarLayout) q4Var2).q(canvas, i3);
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                q0 q0Var = (q0) this.c;
                super.onLayout(z10, i3, i10, i11, i12);
                int i13 = 0;
                if (!bd.a0 && q0Var.h.getVisibility() == 0) {
                    i13 = org.telegram.messenger.g0.L(4.0f) + q0Var.h.getMeasuredWidth();
                }
                if (q0Var.f.getVisibility() == 0) {
                    i13 += q0Var.f.getMeasuredWidth();
                }
                bh.g gVar = q0Var.e;
                gVar.layout(i13, gVar.getTop(), q0Var.e.getMeasuredWidth() + i13, q0Var.e.getBottom());
                break;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        TextView textView;
        float f10;
        switch (this.a) {
            case 0:
                q0 q0Var = (q0) this.c;
                measureChildWithMargins(q0Var.s, i3, 0, i10, 0);
                View view = q0Var.x;
                if (view != null) {
                    measureChildWithMargins(view, i3, 0, i10, 0);
                }
                if (!bd.a0) {
                    if (q0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(q0Var.h, i3, View.MeasureSpec.getSize(i3) / 2, i10, 0);
                        i12 = org.telegram.messenger.g0.L(4.0f) + q0Var.h.getMeasuredWidth();
                    } else {
                        i12 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i3);
                    this.b = true;
                    measureChildWithMargins(q0Var.f, i3, i12, i10, 0);
                    int measuredWidth = q0Var.f.getVisibility() == 0 ? q0Var.f.getMeasuredWidth() : 0;
                    bh.g gVar = q0Var.e;
                    int i14 = i12 + measuredWidth;
                    View view2 = q0Var.x;
                    measureChildWithMargins(gVar, i3, i14 + (view2 != null ? view2.getMeasuredWidth() : 0), i10, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(q0Var.e.getMeasuredWidth() + measuredWidth, size), View.MeasureSpec.getSize(i10));
                    break;
                } else {
                    if (q0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(q0Var.h, i3, View.MeasureSpec.getSize(i3) / 2, i10, 0);
                        i11 = org.telegram.messenger.g0.L(4.0f) + q0Var.h.getMeasuredWidth();
                    } else {
                        i11 = 0;
                    }
                    int size2 = View.MeasureSpec.getSize(i3);
                    this.b = true;
                    measureChildWithMargins(q0Var.f, i3, i11, i10, 0);
                    int measuredWidth2 = q0Var.f.getVisibility() == 0 ? q0Var.f.getMeasuredWidth() : 0;
                    measureChildWithMargins(q0Var.e, org.telegram.messenger.camera.q.c(12.0f, size2, 0), i11 + measuredWidth2, i10, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(q0Var.e.getMeasuredWidth() + measuredWidth2, size2), View.MeasureSpec.getSize(i10));
                    break;
                }
            case 1:
                int size3 = View.MeasureSpec.getSize(i3);
                wm wmVar = (wm) this.c;
                if (wmVar.Z9()) {
                    size3 -= org.telegram.messenger.g0.L(71.0f);
                    i13 = org.telegram.messenger.g0.L(32.0f);
                } else {
                    i13 = 0;
                }
                TextView textView2 = wmVar.a2;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = wmVar.c2) != null && textView.getVisibility() == 0) {
                    size3 = org.telegram.messenger.camera.q.y(31.0f, size3, 2);
                }
                this.b = true;
                TextView textView3 = wmVar.c2;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wmVar.c2.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = wmVar.a2;
                    if (textView4 == null || textView4.getVisibility() != 0) {
                        wmVar.c2.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
                        layoutParams.leftMargin = i13;
                    } else {
                        wmVar.c2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        layoutParams.leftMargin = i13 + size3;
                        layoutParams.width -= org.telegram.messenger.g0.L(15.0f);
                    }
                }
                TextView textView5 = wmVar.a2;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) wmVar.a2.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = wmVar.c2;
                    if (textView6 == null || textView6.getVisibility() != 0) {
                        wmVar.a2.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
                    } else {
                        wmVar.a2.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    }
                    layoutParams2.leftMargin = i13;
                }
                this.b = false;
                super.onMeasure(i3, i10);
                break;
            default:
                int size4 = View.MeasureSpec.getSize(i3);
                int size5 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size4, size5);
                if (((l71) this.c).e != null) {
                    this.b = true;
                    if (!org.telegram.messenger.g0.Q1()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((l71) this.c).e.getLayoutParams();
                        layoutParams3.topMargin = org.telegram.messenger.g0.m;
                        ((l71) this.c).e.setLayoutParams(layoutParams3);
                    }
                    if (org.telegram.messenger.g0.Q1() || org.telegram.messenger.t0.b.getResources().getConfiguration().orientation != 2) {
                        ((l71) this.c).h.setTextSize(1, 20.0f);
                    } else {
                        ((l71) this.c).h.setTextSize(1, 18.0f);
                    }
                    this.b = false;
                }
                measureChildWithMargins(((l71) this.c).u0, i3, 0, i10, 0);
                int measuredHeight = ((l71) this.c).u0.getMeasuredHeight();
                if (((l71) this.c).u0.getVisibility() == 0) {
                    size5 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((l71) this.c).w0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                l71 l71Var = (l71) this.c;
                if (l71Var.b == 2) {
                    g61 g61Var = l71Var.w0;
                    int L = org.telegram.messenger.g0.L(4.0f);
                    l71 l71Var2 = (l71) this.c;
                    g61Var.setPadding(0, L, 0, (org.telegram.messenger.g0.L(((l71Var2.M1 || l71Var2.L1 <= 0) ? 0 : 58) + 72) - 12) + (((l71) this.c).Z0() ? org.telegram.messenger.g0.n : 0));
                }
                ((l71) this.c).w0.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5 - layoutParams4.bottomMargin, TLObject.FLAG_30));
                ((FrameLayout.LayoutParams) ((l71) this.c).z0.getLayoutParams()).topMargin = measuredHeight;
                ((l71) this.c).z0.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30));
                ci.t4 t4Var = ((l71) this.c).S1;
                if (t4Var != null) {
                    ((FrameLayout.LayoutParams) t4Var.getLayoutParams()).topMargin = measuredHeight;
                    ((l71) this.c).S1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(222.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(76.0f), TLObject.FLAG_30));
                }
                org.telegram.ui.v4 v4Var = ((l71) this.c).E0;
                if (v4Var != null) {
                    v4Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + (((l71) this.c).Z0() ? org.telegram.messenger.g0.n : 0));
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((l71) this.c).E0.getLayoutParams();
                    l71 l71Var3 = (l71) this.c;
                    layoutParams5.height = org.telegram.messenger.g0.L(72 + ((l71Var3.M1 || l71Var3.L1 <= 0) ? 0 : 58)) + (((l71) this.c).Z0() ? org.telegram.messenger.g0.n : 0);
                    measureChildWithMargins(((l71) this.c).E0, i3, 0, i10, 0);
                }
                Drawable drawable = ((l71) this.c).r;
                if (drawable != null) {
                    drawable.getPadding(org.telegram.messenger.g0.Q);
                }
                int i15 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((l71) this.c).N0;
                    if (i15 >= frameLayoutArr.length) {
                        break;
                    } else {
                        FrameLayout frameLayout = frameLayoutArr[i15];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i15 == 0) {
                                f10 = ((l71) this.c).b == 2 ? hs.s5 : hs.w4;
                            } else {
                                f10 = 316.0f;
                            }
                            layoutParams6.height = org.telegram.messenger.g0.L(f10);
                            if (((l71) this.c).Z0()) {
                                layoutParams6.height += org.telegram.messenger.g0.n;
                            }
                            if (i15 == 0) {
                                layoutParams6.height = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.Q.top + layoutParams6.height;
                            }
                            ((l71) this.c).N0[i15].setPadding(0, i15 == 0 ? org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.Q.top : 0, 0, ((l71) this.c).Z0() ? org.telegram.messenger.g0.n : 0);
                            measureChildWithMargins(((l71) this.c).N0[i15], i3, 0, i10, 0);
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
                q0 q0Var = (q0) this.c;
                e0 e0Var = q0Var.s;
                if (e0Var != null && e0Var.getTag() != null) {
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
    public void setVisibility(int i3) {
        switch (this.a) {
            case 0:
                super.setVisibility(i3);
                q0 q0Var = (q0) this.c;
                e0 e0Var = q0Var.s;
                if (e0Var != null) {
                    e0Var.setVisibility(i3);
                }
                View view = q0Var.x;
                if (view != null) {
                    view.setVisibility(i3);
                }
                FrameLayout frameLayout = q0Var.a;
                if (frameLayout != null) {
                    frameLayout.setVisibility(i3);
                    break;
                }
                break;
            default:
                super.setVisibility(i3);
                break;
        }
    }
}
