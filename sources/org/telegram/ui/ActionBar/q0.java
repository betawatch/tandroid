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
import ci.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.kc1;
import org.telegram.ui.pd1;
import org.telegram.ui.s21;
import org.telegram.ui.y21;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        c5 c5Var;
        c5 c5Var2;
        int i10;
        switch (this.a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j3);
                pd1 pd1Var = (pd1) this.c;
                if (view == pd1Var.s0) {
                    c5Var = pd1Var.parentLayout;
                    if (c5Var != null) {
                        c5Var2 = pd1Var.parentLayout;
                        if (pd1Var.s0.getVisibility() == 0) {
                            i10 = (int) (pd1Var.s0.getTranslationY() + pd1Var.s0.getMeasuredHeight());
                        } else {
                            i10 = 0;
                        }
                        ((ActionBarLayout) c5Var2).q(canvas, i10);
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
                ci.h2 h2Var = v0Var.e;
                h2Var.layout(i14, h2Var.getTop(), v0Var.e.getMeasuredWidth() + i14, v0Var.e.getBottom());
                break;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 2:
                y21 y21Var = (y21) this.c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                boolean z11 = measuredWidth < measuredHeight2;
                if (y21Var.x.getVisibility() == 0) {
                    if (z11) {
                        AndroidUtilities.rectTmp2.set(0, 0, measuredWidth, AndroidUtilities.dp(25.0f) + (measuredHeight2 - y21Var.x.getMeasuredHeight()));
                    } else {
                        AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth - y21Var.x.getWidth()), measuredHeight2);
                    }
                    y21Var.w.setClipBounds(AndroidUtilities.rectTmp2);
                } else {
                    y21Var.w.setClipBounds(null);
                }
                y21Var.w.layout(0, 0, measuredWidth, measuredHeight2);
                int measuredHeight3 = y21Var.x.getVisibility() == 0 ? y21Var.x.getMeasuredHeight() : 0;
                int measuredWidth2 = z11 ? (measuredWidth - y21Var.E.getMeasuredWidth()) / 2 : y21Var.Q.a + ((((measuredWidth - y21Var.x.getMeasuredWidth()) - y21Var.Q.a) - y21Var.E.getMeasuredWidth()) / 2);
                if (z11) {
                    int i15 = y21Var.Q.b;
                    measuredHeight = AndroidUtilities.dp(52.0f) + (((((measuredHeight2 - measuredHeight3) - i15) - y21Var.E.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + i15;
                } else {
                    measuredHeight = (measuredHeight2 - y21Var.E.getMeasuredHeight()) / 2;
                }
                s21 s21Var = y21Var.E;
                s21Var.layout(measuredWidth2, measuredHeight, s21Var.getMeasuredWidth() + measuredWidth2, y21Var.E.getMeasuredHeight() + measuredHeight);
                if (z11) {
                    int measuredWidth3 = (measuredWidth - y21Var.y.getMeasuredWidth()) / 2;
                    int dp = measuredHeight - AndroidUtilities.dp(48.0f);
                    w9 w9Var = y21Var.y;
                    w9Var.layout(measuredWidth3, dp, w9Var.getMeasuredWidth() + measuredWidth3, y21Var.y.getMeasuredHeight() + dp);
                }
                if (y21Var.x.getVisibility() == 0) {
                    if (z11) {
                        int measuredWidth4 = (measuredWidth - y21Var.x.getMeasuredWidth()) / 2;
                        y21Var.x.layout(measuredWidth4, getMeasuredHeight() - measuredHeight3, y21Var.x.getMeasuredWidth() + measuredWidth4, getMeasuredHeight());
                    } else {
                        int measuredHeight4 = (measuredHeight2 - y21Var.x.getMeasuredHeight()) / 2;
                        y21Var.x.layout(getMeasuredWidth() - y21Var.x.getMeasuredWidth(), measuredHeight4, getMeasuredWidth(), y21Var.x.getMeasuredHeight() + measuredHeight4);
                    }
                }
                nj0 nj0Var = y21Var.F;
                Rect rect = y21Var.c;
                nj0Var.layout(rect.left + measuredWidth2, rect.top + measuredHeight, measuredWidth2 + rect.right, measuredHeight + rect.bottom);
                int dp2 = AndroidUtilities.dp(11.0f) + y21Var.Q.a;
                int dp3 = AndroidUtilities.dp(11.0f) + y21Var.Q.b;
                ImageView imageView = y21Var.G;
                imageView.layout(dp2, dp3, imageView.getMeasuredWidth() + dp2, y21Var.G.getMeasuredHeight() + dp3);
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
                    ci.h2 h2Var = v0Var.e;
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
                    measureChildWithMargins(v0Var.e, bi.c(12.0f, size2, 0), i12 + measuredWidth2, i11, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(v0Var.e.getMeasuredWidth() + measuredWidth2, size2), View.MeasureSpec.getSize(i11));
                    break;
                }
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                yn ynVar = (yn) this.c;
                if (ynVar.B9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i14 = AndroidUtilities.dp(32.0f);
                } else {
                    i14 = 0;
                }
                TextView textView2 = ynVar.J1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = ynVar.L1) != null && textView.getVisibility() == 0) {
                    size3 = bi.z(31.0f, size3, 2);
                }
                this.b = true;
                TextView textView3 = ynVar.L1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ynVar.L1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = ynVar.J1;
                    if (textView4 == null || textView4.getVisibility() != 0) {
                        ynVar.L1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i14;
                    } else {
                        ynVar.L1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i14 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    }
                }
                TextView textView5 = ynVar.J1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ynVar.J1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = ynVar.L1;
                    if (textView6 == null || textView6.getVisibility() != 0) {
                        ynVar.J1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    } else {
                        ynVar.J1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    }
                    layoutParams2.leftMargin = i14;
                }
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 2:
                y21 y21Var = (y21) this.c;
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                boolean z10 = size4 < size5;
                y21Var.P = z10;
                y21Var.y.setVisibility(z10 ? 0 : 8);
                super.onMeasure(i10, i11);
                if (!z10) {
                    this.b = true;
                    m6 m6Var = y21Var.x;
                    i0.b bVar = y21Var.Q;
                    m6Var.setPadding(0, (bVar.b * 2) / 3, bVar.c, bVar.d);
                    this.b = false;
                    y21Var.x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + y21Var.Q.c, TLObject.FLAG_30), i11);
                    y21Var.E.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), TLObject.FLAG_30));
                    break;
                } else {
                    this.b = true;
                    m6 m6Var2 = y21Var.x;
                    int i16 = y21Var.Q.a;
                    int dp = AndroidUtilities.dp(8.0f);
                    i0.b bVar2 = y21Var.Q;
                    m6Var2.setPadding(i16, dp, bVar2.c, bVar2.d);
                    this.b = false;
                    y21Var.x.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size5 + y21Var.Q.d, TLObject.FLAG_31));
                    y21Var.E.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), TLObject.FLAG_30));
                    break;
                }
            default:
                int size6 = View.MeasureSpec.getSize(i10);
                int size7 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size6, size7);
                if (((pd1) this.c).e != null) {
                    this.b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((pd1) this.c).e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((pd1) this.c).e.setLayoutParams(layoutParams3);
                    }
                    if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                        ((pd1) this.c).h.setTextSize(1, 20.0f);
                    } else {
                        ((pd1) this.c).h.setTextSize(1, 18.0f);
                    }
                    this.b = false;
                }
                measureChildWithMargins(((pd1) this.c).s0, i10, 0, i11, 0);
                int measuredHeight = ((pd1) this.c).s0.getMeasuredHeight();
                if (((pd1) this.c).s0.getVisibility() == 0) {
                    size7 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((pd1) this.c).u0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                pd1 pd1Var = (pd1) this.c;
                if (pd1Var.b == 2) {
                    kc1 kc1Var = pd1Var.u0;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    pd1 pd1Var2 = (pd1) this.c;
                    kc1Var.setPadding(0, dp2, 0, (AndroidUtilities.dp(((pd1Var2.K1 || pd1Var2.J1 <= 0) ? 0 : 58) + 72) - 12) + (((pd1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0));
                }
                ((pd1) this.c).u0.measure(View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size7 - layoutParams4.bottomMargin, TLObject.FLAG_30));
                ((FrameLayout.LayoutParams) ((pd1) this.c).x0.getLayoutParams()).topMargin = measuredHeight;
                ((pd1) this.c).x0.measure(View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30));
                org.telegram.ui.u5 u5Var = ((pd1) this.c).Q1;
                if (u5Var != null) {
                    ((FrameLayout.LayoutParams) u5Var.getLayoutParams()).topMargin = measuredHeight;
                    ((pd1) this.c).Q1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), TLObject.FLAG_30));
                }
                org.telegram.ui.v4 v4Var = ((pd1) this.c).C0;
                if (v4Var != null) {
                    v4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + (((pd1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0));
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((pd1) this.c).C0.getLayoutParams();
                    pd1 pd1Var3 = (pd1) this.c;
                    layoutParams5.height = AndroidUtilities.dp(72 + ((pd1Var3.K1 || pd1Var3.J1 <= 0) ? 0 : 58)) + (((pd1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0);
                    measureChildWithMargins(((pd1) this.c).C0, i10, 0, i11, 0);
                }
                Drawable drawable = ((pd1) this.c).r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i17 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((pd1) this.c).L0;
                    if (i17 >= frameLayoutArr.length) {
                        break;
                    } else {
                        FrameLayout frameLayout = frameLayoutArr[i17];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i17 == 0) {
                                f7 = ((pd1) this.c).b == 2 ? 321 : 273;
                            } else {
                                f7 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f7);
                            if (((pd1) this.c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i17 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            ((pd1) this.c).L0[i17].setPadding(0, i17 == 0 ? AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top : 0, 0, ((pd1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0);
                            measureChildWithMargins(((pd1) this.c).L0[i17], i10, 0, i11, 0);
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
