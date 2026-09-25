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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.jc1;
import org.telegram.ui.od1;
import org.telegram.ui.q21;
import org.telegram.ui.w21;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class p0 extends FrameLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Object obj, Context context, int i10) {
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
        b5 b5Var;
        b5 b5Var2;
        int i10;
        switch (this.a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j3);
                od1 od1Var = (od1) this.c;
                if (view == od1Var.s0) {
                    b5Var = od1Var.parentLayout;
                    if (b5Var != null) {
                        b5Var2 = od1Var.parentLayout;
                        if (od1Var.s0.getVisibility() == 0) {
                            i10 = (int) (od1Var.s0.getTranslationY() + od1Var.s0.getMeasuredHeight());
                        } else {
                            i10 = 0;
                        }
                        ((ActionBarLayout) b5Var2).q(canvas, i10);
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
                u0 u0Var = (u0) this.c;
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = 0;
                if (!LocaleController.isRTL && u0Var.h.getVisibility() == 0) {
                    i14 = AndroidUtilities.dp(4.0f) + u0Var.h.getMeasuredWidth();
                }
                if (u0Var.f.getVisibility() == 0) {
                    i14 += u0Var.f.getMeasuredWidth();
                }
                ci.h2 h2Var = u0Var.e;
                h2Var.layout(i14, h2Var.getTop(), u0Var.e.getMeasuredWidth() + i14, u0Var.e.getBottom());
                break;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 2:
                w21 w21Var = (w21) this.c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                boolean z11 = measuredWidth < measuredHeight2;
                if (w21Var.x.getVisibility() == 0) {
                    if (z11) {
                        AndroidUtilities.rectTmp2.set(0, 0, measuredWidth, AndroidUtilities.dp(25.0f) + (measuredHeight2 - w21Var.x.getMeasuredHeight()));
                    } else {
                        AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth - w21Var.x.getWidth()), measuredHeight2);
                    }
                    w21Var.w.setClipBounds(AndroidUtilities.rectTmp2);
                } else {
                    w21Var.w.setClipBounds(null);
                }
                w21Var.w.layout(0, 0, measuredWidth, measuredHeight2);
                int measuredHeight3 = w21Var.x.getVisibility() == 0 ? w21Var.x.getMeasuredHeight() : 0;
                int measuredWidth2 = z11 ? (measuredWidth - w21Var.E.getMeasuredWidth()) / 2 : w21Var.Q.a + ((((measuredWidth - w21Var.x.getMeasuredWidth()) - w21Var.Q.a) - w21Var.E.getMeasuredWidth()) / 2);
                if (z11) {
                    int i15 = w21Var.Q.b;
                    measuredHeight = AndroidUtilities.dp(52.0f) + (((((measuredHeight2 - measuredHeight3) - i15) - w21Var.E.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + i15;
                } else {
                    measuredHeight = (measuredHeight2 - w21Var.E.getMeasuredHeight()) / 2;
                }
                q21 q21Var = w21Var.E;
                q21Var.layout(measuredWidth2, measuredHeight, q21Var.getMeasuredWidth() + measuredWidth2, w21Var.E.getMeasuredHeight() + measuredHeight);
                if (z11) {
                    int measuredWidth3 = (measuredWidth - w21Var.y.getMeasuredWidth()) / 2;
                    int dp = measuredHeight - AndroidUtilities.dp(48.0f);
                    w9 w9Var = w21Var.y;
                    w9Var.layout(measuredWidth3, dp, w9Var.getMeasuredWidth() + measuredWidth3, w21Var.y.getMeasuredHeight() + dp);
                }
                if (w21Var.x.getVisibility() == 0) {
                    if (z11) {
                        int measuredWidth4 = (measuredWidth - w21Var.x.getMeasuredWidth()) / 2;
                        w21Var.x.layout(measuredWidth4, getMeasuredHeight() - measuredHeight3, w21Var.x.getMeasuredWidth() + measuredWidth4, getMeasuredHeight());
                    } else {
                        int measuredHeight4 = (measuredHeight2 - w21Var.x.getMeasuredHeight()) / 2;
                        w21Var.x.layout(getMeasuredWidth() - w21Var.x.getMeasuredWidth(), measuredHeight4, getMeasuredWidth(), w21Var.x.getMeasuredHeight() + measuredHeight4);
                    }
                }
                lj0 lj0Var = w21Var.F;
                Rect rect = w21Var.c;
                lj0Var.layout(rect.left + measuredWidth2, rect.top + measuredHeight, measuredWidth2 + rect.right, measuredHeight + rect.bottom);
                int dp2 = AndroidUtilities.dp(11.0f) + w21Var.Q.a;
                int dp3 = AndroidUtilities.dp(11.0f) + w21Var.Q.b;
                ImageView imageView = w21Var.G;
                imageView.layout(dp2, dp3, imageView.getMeasuredWidth() + dp2, w21Var.G.getMeasuredHeight() + dp3);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        p0 p0Var;
        int i13;
        int i14;
        TextView textView;
        float f7;
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) this.c;
                measureChildWithMargins(u0Var.s, i10, 0, i11, 0);
                View view = u0Var.w;
                if (view != null) {
                    measureChildWithMargins(view, i10, 0, i11, 0);
                }
                if (!LocaleController.isRTL) {
                    if (u0Var.h.getVisibility() == 0) {
                        p0Var = this;
                        p0Var.measureChildWithMargins(u0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                        i13 = AndroidUtilities.dp(4.0f) + u0Var.h.getMeasuredWidth();
                    } else {
                        p0Var = this;
                        i13 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i10);
                    p0Var.b = true;
                    p0Var.measureChildWithMargins(u0Var.f, i10, i13, i11, 0);
                    int measuredWidth = u0Var.f.getVisibility() == 0 ? u0Var.f.getMeasuredWidth() : 0;
                    ci.h2 h2Var = u0Var.e;
                    int i15 = i13 + measuredWidth;
                    View view2 = u0Var.w;
                    measureChildWithMargins(h2Var, i10, i15 + (view2 != null ? view2.getMeasuredWidth() : 0), i11, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(u0Var.e.getMeasuredWidth() + measuredWidth, size), View.MeasureSpec.getSize(i11));
                    break;
                } else {
                    if (u0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(u0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                        i12 = AndroidUtilities.dp(4.0f) + u0Var.h.getMeasuredWidth();
                    } else {
                        i12 = 0;
                    }
                    int size2 = View.MeasureSpec.getSize(i10);
                    this.b = true;
                    measureChildWithMargins(u0Var.f, i10, i12, i11, 0);
                    int measuredWidth2 = u0Var.f.getVisibility() == 0 ? u0Var.f.getMeasuredWidth() : 0;
                    measureChildWithMargins(u0Var.e, ok.c(12.0f, size2, 0), i12 + measuredWidth2, i11, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(u0Var.e.getMeasuredWidth() + measuredWidth2, size2), View.MeasureSpec.getSize(i11));
                    break;
                }
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                wn wnVar = (wn) this.c;
                if (wnVar.C9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i14 = AndroidUtilities.dp(32.0f);
                } else {
                    i14 = 0;
                }
                TextView textView2 = wnVar.L1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = wnVar.N1) != null && textView.getVisibility() == 0) {
                    size3 = ok.A(31.0f, size3, 2);
                }
                this.b = true;
                TextView textView3 = wnVar.N1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wnVar.N1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = wnVar.L1;
                    if (textView4 == null || textView4.getVisibility() != 0) {
                        wnVar.N1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i14;
                    } else {
                        wnVar.N1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i14 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    }
                }
                TextView textView5 = wnVar.L1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) wnVar.L1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = wnVar.N1;
                    if (textView6 == null || textView6.getVisibility() != 0) {
                        wnVar.L1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    } else {
                        wnVar.L1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    }
                    layoutParams2.leftMargin = i14;
                }
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 2:
                w21 w21Var = (w21) this.c;
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                boolean z10 = size4 < size5;
                w21Var.P = z10;
                w21Var.y.setVisibility(z10 ? 0 : 8);
                super.onMeasure(i10, i11);
                if (!z10) {
                    this.b = true;
                    m6 m6Var = w21Var.x;
                    i0.b bVar = w21Var.Q;
                    m6Var.setPadding(0, (bVar.b * 2) / 3, bVar.c, bVar.d);
                    this.b = false;
                    w21Var.x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + w21Var.Q.c, TLObject.FLAG_30), i11);
                    w21Var.E.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), TLObject.FLAG_30));
                    break;
                } else {
                    this.b = true;
                    m6 m6Var2 = w21Var.x;
                    int i16 = w21Var.Q.a;
                    int dp = AndroidUtilities.dp(8.0f);
                    i0.b bVar2 = w21Var.Q;
                    m6Var2.setPadding(i16, dp, bVar2.c, bVar2.d);
                    this.b = false;
                    w21Var.x.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size5 + w21Var.Q.d, TLObject.FLAG_31));
                    w21Var.E.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), TLObject.FLAG_30));
                    break;
                }
            default:
                int size6 = View.MeasureSpec.getSize(i10);
                int size7 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size6, size7);
                if (((od1) this.c).e != null) {
                    this.b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((od1) this.c).e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((od1) this.c).e.setLayoutParams(layoutParams3);
                    }
                    if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                        ((od1) this.c).h.setTextSize(1, 20.0f);
                    } else {
                        ((od1) this.c).h.setTextSize(1, 18.0f);
                    }
                    this.b = false;
                }
                measureChildWithMargins(((od1) this.c).s0, i10, 0, i11, 0);
                int measuredHeight = ((od1) this.c).s0.getMeasuredHeight();
                if (((od1) this.c).s0.getVisibility() == 0) {
                    size7 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((od1) this.c).u0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                od1 od1Var = (od1) this.c;
                if (od1Var.b == 2) {
                    jc1 jc1Var = od1Var.u0;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    od1 od1Var2 = (od1) this.c;
                    jc1Var.setPadding(0, dp2, 0, (AndroidUtilities.dp(((od1Var2.K1 || od1Var2.J1 <= 0) ? 0 : 58) + 72) - 12) + (((od1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0));
                }
                ((od1) this.c).u0.measure(View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size7 - layoutParams4.bottomMargin, TLObject.FLAG_30));
                ((FrameLayout.LayoutParams) ((od1) this.c).x0.getLayoutParams()).topMargin = measuredHeight;
                ((od1) this.c).x0.measure(View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30));
                org.telegram.ui.t5 t5Var = ((od1) this.c).Q1;
                if (t5Var != null) {
                    ((FrameLayout.LayoutParams) t5Var.getLayoutParams()).topMargin = measuredHeight;
                    ((od1) this.c).Q1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), TLObject.FLAG_30));
                }
                org.telegram.ui.u4 u4Var = ((od1) this.c).C0;
                if (u4Var != null) {
                    u4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + (((od1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0));
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((od1) this.c).C0.getLayoutParams();
                    od1 od1Var3 = (od1) this.c;
                    layoutParams5.height = AndroidUtilities.dp(72 + ((od1Var3.K1 || od1Var3.J1 <= 0) ? 0 : 58)) + (((od1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0);
                    measureChildWithMargins(((od1) this.c).C0, i10, 0, i11, 0);
                }
                Drawable drawable = ((od1) this.c).r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i17 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((od1) this.c).L0;
                    if (i17 >= frameLayoutArr.length) {
                        break;
                    } else {
                        FrameLayout frameLayout = frameLayoutArr[i17];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i17 == 0) {
                                f7 = ((od1) this.c).b == 2 ? 321 : 273;
                            } else {
                                f7 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f7);
                            if (((od1) this.c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i17 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            ((od1) this.c).L0[i17].setPadding(0, i17 == 0 ? AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top : 0, 0, ((od1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0);
                            measureChildWithMargins(((od1) this.c).L0[i17], i10, 0, i11, 0);
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
                u0 u0Var = (u0) this.c;
                j0 j0Var = u0Var.s;
                if (j0Var != null && j0Var.getTag() != null) {
                    u0Var.s.setAlpha(f7);
                    u0Var.s.setScaleX(f7);
                    u0Var.s.setScaleY(f7);
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
                u0 u0Var = (u0) this.c;
                j0 j0Var = u0Var.s;
                if (j0Var != null) {
                    j0Var.setVisibility(i10);
                }
                View view = u0Var.w;
                if (view != null) {
                    view.setVisibility(i10);
                }
                FrameLayout frameLayout = u0Var.a;
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
