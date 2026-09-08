package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.x9;
import org.telegram.ui.a31;
import org.telegram.ui.co;
import org.telegram.ui.g31;
import org.telegram.ui.rc1;
import org.telegram.ui.wd1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class q0 extends FrameLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        d5 d5Var;
        d5 d5Var2;
        int i10;
        switch (this.a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j3);
                wd1 wd1Var = (wd1) this.c;
                if (view == wd1Var.s0) {
                    d5Var = wd1Var.parentLayout;
                    if (d5Var != null) {
                        d5Var2 = wd1Var.parentLayout;
                        if (wd1Var.s0.getVisibility() == 0) {
                            i10 = (int) (wd1Var.s0.getTranslationY() + wd1Var.s0.getMeasuredHeight());
                        } else {
                            i10 = 0;
                        }
                        ((ActionBarLayout) d5Var2).q(canvas, i10);
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        switch (this.a) {
            case 0:
                v0 v0Var = (v0) this.c;
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = 0;
                if (!LocaleController.isRTL && v0Var.h.getVisibility() == 0) {
                    i14 = AndroidUtilities.dp(4.0f) + v0Var.h.getMeasuredWidth();
                }
                if (v0Var.f.getVisibility() == 0) {
                    i14 += v0Var.f.getMeasuredWidth();
                }
                di.h2 h2Var = v0Var.e;
                h2Var.layout(i14, h2Var.getTop(), v0Var.e.getMeasuredWidth() + i14, v0Var.e.getBottom());
                break;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 2:
                g31 g31Var = (g31) this.c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                boolean z11 = measuredWidth < measuredHeight2;
                if (g31Var.x.getVisibility() == 0) {
                    if (z11) {
                        AndroidUtilities.rectTmp2.set(0, 0, measuredWidth, AndroidUtilities.dp(25.0f) + (measuredHeight2 - g31Var.x.getMeasuredHeight()));
                    } else {
                        AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth - g31Var.x.getWidth()), measuredHeight2);
                    }
                    g31Var.w.setClipBounds(AndroidUtilities.rectTmp2);
                } else {
                    g31Var.w.setClipBounds(null);
                }
                g31Var.w.layout(0, 0, measuredWidth, measuredHeight2);
                int measuredHeight3 = g31Var.x.getVisibility() == 0 ? g31Var.x.getMeasuredHeight() : 0;
                int measuredWidth2 = z11 ? (measuredWidth - g31Var.E.getMeasuredWidth()) / 2 : g31Var.Q.a + ((((measuredWidth - g31Var.x.getMeasuredWidth()) - g31Var.Q.a) - g31Var.E.getMeasuredWidth()) / 2);
                if (z11) {
                    int i15 = g31Var.Q.b;
                    measuredHeight = AndroidUtilities.dp(52.0f) + (((((measuredHeight2 - measuredHeight3) - i15) - g31Var.E.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + i15;
                } else {
                    measuredHeight = (measuredHeight2 - g31Var.E.getMeasuredHeight()) / 2;
                }
                a31 a31Var = g31Var.E;
                a31Var.layout(measuredWidth2, measuredHeight, a31Var.getMeasuredWidth() + measuredWidth2, g31Var.E.getMeasuredHeight() + measuredHeight);
                if (z11) {
                    int measuredWidth3 = (measuredWidth - g31Var.y.getMeasuredWidth()) / 2;
                    int dp = measuredHeight - AndroidUtilities.dp(48.0f);
                    x9 x9Var = g31Var.y;
                    x9Var.layout(measuredWidth3, dp, x9Var.getMeasuredWidth() + measuredWidth3, g31Var.y.getMeasuredHeight() + dp);
                }
                if (g31Var.x.getVisibility() == 0) {
                    if (z11) {
                        int measuredWidth4 = (measuredWidth - g31Var.x.getMeasuredWidth()) / 2;
                        g31Var.x.layout(measuredWidth4, getMeasuredHeight() - measuredHeight3, g31Var.x.getMeasuredWidth() + measuredWidth4, getMeasuredHeight());
                    } else {
                        int measuredHeight4 = (measuredHeight2 - g31Var.x.getMeasuredHeight()) / 2;
                        g31Var.x.layout(getMeasuredWidth() - g31Var.x.getMeasuredWidth(), measuredHeight4, getMeasuredWidth(), g31Var.x.getMeasuredHeight() + measuredHeight4);
                    }
                }
                aj0 aj0Var = g31Var.F;
                Rect rect = g31Var.c;
                aj0Var.layout(rect.left + measuredWidth2, rect.top + measuredHeight, measuredWidth2 + rect.right, measuredHeight + rect.bottom);
                int dp2 = AndroidUtilities.dp(11.0f) + g31Var.Q.a;
                int dp3 = AndroidUtilities.dp(11.0f) + g31Var.Q.b;
                ImageView imageView = g31Var.G;
                imageView.layout(dp2, dp3, imageView.getMeasuredWidth() + dp2, g31Var.G.getMeasuredHeight() + dp3);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        q0 q0Var;
        int i13;
        int i14;
        TextView textView;
        float f7;
        switch (this.a) {
            case 0:
                v0 v0Var = (v0) this.c;
                measureChildWithMargins(v0Var.s, i10, 0, i11, 0);
                View view = v0Var.w;
                if (view != null) {
                    measureChildWithMargins(view, i10, 0, i11, 0);
                }
                if (!LocaleController.isRTL) {
                    if (v0Var.h.getVisibility() == 0) {
                        q0Var = this;
                        q0Var.measureChildWithMargins(v0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                        i13 = AndroidUtilities.dp(4.0f) + v0Var.h.getMeasuredWidth();
                    } else {
                        q0Var = this;
                        i13 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i10);
                    q0Var.b = true;
                    q0Var.measureChildWithMargins(v0Var.f, i10, i13, i11, 0);
                    int measuredWidth = v0Var.f.getVisibility() == 0 ? v0Var.f.getMeasuredWidth() : 0;
                    di.h2 h2Var = v0Var.e;
                    int i15 = i13 + measuredWidth;
                    View view2 = v0Var.w;
                    measureChildWithMargins(h2Var, i10, i15 + (view2 != null ? view2.getMeasuredWidth() : 0), i11, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(v0Var.e.getMeasuredWidth() + measuredWidth, size), View.MeasureSpec.getSize(i11));
                    break;
                } else {
                    if (v0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(v0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                        i12 = AndroidUtilities.dp(4.0f) + v0Var.h.getMeasuredWidth();
                    } else {
                        i12 = 0;
                    }
                    int size2 = View.MeasureSpec.getSize(i10);
                    this.b = true;
                    measureChildWithMargins(v0Var.f, i10, i12, i11, 0);
                    int measuredWidth2 = v0Var.f.getVisibility() == 0 ? v0Var.f.getMeasuredWidth() : 0;
                    measureChildWithMargins(v0Var.e, wl.d(12.0f, size2, 0), i12 + measuredWidth2, i11, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(v0Var.e.getMeasuredWidth() + measuredWidth2, size2), View.MeasureSpec.getSize(i11));
                    break;
                }
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                co coVar = (co) this.c;
                if (coVar.C9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i14 = AndroidUtilities.dp(32.0f);
                } else {
                    i14 = 0;
                }
                TextView textView2 = coVar.L1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = coVar.N1) != null && textView.getVisibility() == 0) {
                    size3 = wl.y(31.0f, size3, 2);
                }
                this.b = true;
                TextView textView3 = coVar.N1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) coVar.N1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = coVar.L1;
                    if (textView4 == null || textView4.getVisibility() != 0) {
                        coVar.N1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i14;
                    } else {
                        coVar.N1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i14 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    }
                }
                TextView textView5 = coVar.L1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) coVar.L1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = coVar.N1;
                    if (textView6 == null || textView6.getVisibility() != 0) {
                        coVar.L1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    } else {
                        coVar.L1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    }
                    layoutParams2.leftMargin = i14;
                }
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 2:
                g31 g31Var = (g31) this.c;
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                boolean z10 = size4 < size5;
                g31Var.P = z10;
                g31Var.y.setVisibility(z10 ? 0 : 8);
                super.onMeasure(i10, i11);
                if (!z10) {
                    this.b = true;
                    ah.w wVar = g31Var.x;
                    i0.c cVar = g31Var.Q;
                    wVar.setPadding(0, (cVar.b * 2) / 3, cVar.c, cVar.d);
                    this.b = false;
                    g31Var.x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + g31Var.Q.c, TLObject.FLAG_30), i11);
                    g31Var.E.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), TLObject.FLAG_30));
                    break;
                } else {
                    this.b = true;
                    ah.w wVar2 = g31Var.x;
                    int i16 = g31Var.Q.a;
                    int dp = AndroidUtilities.dp(8.0f);
                    i0.c cVar2 = g31Var.Q;
                    wVar2.setPadding(i16, dp, cVar2.c, cVar2.d);
                    this.b = false;
                    g31Var.x.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size5 + g31Var.Q.d, TLObject.FLAG_31));
                    g31Var.E.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), TLObject.FLAG_30));
                    break;
                }
            default:
                int size6 = View.MeasureSpec.getSize(i10);
                int size7 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size6, size7);
                if (((wd1) this.c).e != null) {
                    this.b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((wd1) this.c).e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((wd1) this.c).e.setLayoutParams(layoutParams3);
                    }
                    if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                        ((wd1) this.c).h.setTextSize(1, 20.0f);
                    } else {
                        ((wd1) this.c).h.setTextSize(1, 18.0f);
                    }
                    this.b = false;
                }
                measureChildWithMargins(((wd1) this.c).s0, i10, 0, i11, 0);
                int measuredHeight = ((wd1) this.c).s0.getMeasuredHeight();
                if (((wd1) this.c).s0.getVisibility() == 0) {
                    size7 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((wd1) this.c).u0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                wd1 wd1Var = (wd1) this.c;
                if (wd1Var.b == 2) {
                    rc1 rc1Var = wd1Var.u0;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    wd1 wd1Var2 = (wd1) this.c;
                    rc1Var.setPadding(0, dp2, 0, (AndroidUtilities.dp(((wd1Var2.K1 || wd1Var2.J1 <= 0) ? 0 : 58) + 72) - 12) + (((wd1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0));
                }
                ((wd1) this.c).u0.measure(View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size7 - layoutParams4.bottomMargin, TLObject.FLAG_30));
                ((FrameLayout.LayoutParams) ((wd1) this.c).x0.getLayoutParams()).topMargin = measuredHeight;
                ((wd1) this.c).x0.measure(View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30));
                org.telegram.ui.t5 t5Var = ((wd1) this.c).Q1;
                if (t5Var != null) {
                    ((FrameLayout.LayoutParams) t5Var.getLayoutParams()).topMargin = measuredHeight;
                    ((wd1) this.c).Q1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), TLObject.FLAG_30));
                }
                org.telegram.ui.u4 u4Var = ((wd1) this.c).C0;
                if (u4Var != null) {
                    u4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + (((wd1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0));
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((wd1) this.c).C0.getLayoutParams();
                    wd1 wd1Var3 = (wd1) this.c;
                    layoutParams5.height = AndroidUtilities.dp(72 + ((wd1Var3.K1 || wd1Var3.J1 <= 0) ? 0 : 58)) + (((wd1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0);
                    measureChildWithMargins(((wd1) this.c).C0, i10, 0, i11, 0);
                }
                Drawable drawable = ((wd1) this.c).r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i17 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((wd1) this.c).L0;
                    if (i17 >= frameLayoutArr.length) {
                        break;
                    } else {
                        FrameLayout frameLayout = frameLayoutArr[i17];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i17 == 0) {
                                f7 = ((wd1) this.c).b == 2 ? 321 : 273;
                            } else {
                                f7 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f7);
                            if (((wd1) this.c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i17 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            ((wd1) this.c).L0[i17].setPadding(0, i17 == 0 ? AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top : 0, 0, ((wd1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0);
                            measureChildWithMargins(((wd1) this.c).L0[i17], i10, 0, i11, 0);
                        }
                        i17++;
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
                v0 v0Var = (v0) this.c;
                k0 k0Var = v0Var.s;
                if (k0Var != null && k0Var.getTag() != null) {
                    v0Var.s.setAlpha(f7);
                    v0Var.s.setScaleX(f7);
                    v0Var.s.setScaleY(f7);
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
                v0 v0Var = (v0) this.c;
                k0 k0Var = v0Var.s;
                if (k0Var != null) {
                    k0Var.setVisibility(i10);
                }
                View view = v0Var.w;
                if (view != null) {
                    view.setVisibility(i10);
                }
                FrameLayout frameLayout = v0Var.a;
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
