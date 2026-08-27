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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.gb1;
import org.telegram.ui.nc1;
import org.telegram.ui.rn;
import org.telegram.ui.t11;
import org.telegram.ui.y11;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    public boolean drawChild(Canvas canvas, View view, long j10) {
        b5 b5Var;
        b5 b5Var2;
        int i10;
        switch (this.a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j10);
                nc1 nc1Var = (nc1) this.c;
                if (view == nc1Var.o0) {
                    b5Var = nc1Var.parentLayout;
                    if (b5Var != null) {
                        b5Var2 = nc1Var.parentLayout;
                        if (nc1Var.o0.getVisibility() == 0) {
                            i10 = (int) (nc1Var.o0.getTranslationY() + nc1Var.o0.getMeasuredHeight());
                        } else {
                            i10 = 0;
                        }
                        ((ActionBarLayout) b5Var2).q(canvas, i10);
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
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
                gg.g gVar = v0Var.e;
                gVar.layout(i14, gVar.getTop(), v0Var.e.getMeasuredWidth() + i14, v0Var.e.getBottom());
                break;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 2:
                y11 y11Var = (y11) this.c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                boolean z11 = measuredWidth < measuredHeight2;
                if (y11Var.x.getVisibility() == 0) {
                    if (z11) {
                        AndroidUtilities.rectTmp2.set(0, 0, measuredWidth, AndroidUtilities.dp(25.0f) + (measuredHeight2 - y11Var.x.getMeasuredHeight()));
                    } else {
                        AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth - y11Var.x.getWidth()), measuredHeight2);
                    }
                    y11Var.w.setClipBounds(AndroidUtilities.rectTmp2);
                } else {
                    y11Var.w.setClipBounds(null);
                }
                y11Var.w.layout(0, 0, measuredWidth, measuredHeight2);
                int measuredHeight3 = y11Var.x.getVisibility() == 0 ? y11Var.x.getMeasuredHeight() : 0;
                int measuredWidth2 = z11 ? (measuredWidth - y11Var.A.getMeasuredWidth()) / 2 : y11Var.M.a + ((((measuredWidth - y11Var.x.getMeasuredWidth()) - y11Var.M.a) - y11Var.A.getMeasuredWidth()) / 2);
                if (z11) {
                    int i15 = y11Var.M.b;
                    measuredHeight = AndroidUtilities.dp(52.0f) + (((((measuredHeight2 - measuredHeight3) - i15) - y11Var.A.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + i15;
                } else {
                    measuredHeight = (measuredHeight2 - y11Var.A.getMeasuredHeight()) / 2;
                }
                t11 t11Var = y11Var.A;
                t11Var.layout(measuredWidth2, measuredHeight, t11Var.getMeasuredWidth() + measuredWidth2, y11Var.A.getMeasuredHeight() + measuredHeight);
                if (z11) {
                    int measuredWidth3 = (measuredWidth - y11Var.y.getMeasuredWidth()) / 2;
                    int dp = measuredHeight - AndroidUtilities.dp(48.0f);
                    n9 n9Var = y11Var.y;
                    n9Var.layout(measuredWidth3, dp, n9Var.getMeasuredWidth() + measuredWidth3, y11Var.y.getMeasuredHeight() + dp);
                }
                if (y11Var.x.getVisibility() == 0) {
                    if (z11) {
                        int measuredWidth4 = (measuredWidth - y11Var.x.getMeasuredWidth()) / 2;
                        y11Var.x.layout(measuredWidth4, getMeasuredHeight() - measuredHeight3, y11Var.x.getMeasuredWidth() + measuredWidth4, getMeasuredHeight());
                    } else {
                        int measuredHeight4 = (measuredHeight2 - y11Var.x.getMeasuredHeight()) / 2;
                        y11Var.x.layout(getMeasuredWidth() - y11Var.x.getMeasuredWidth(), measuredHeight4, getMeasuredWidth(), y11Var.x.getMeasuredHeight() + measuredHeight4);
                    }
                }
                ri0 ri0Var = y11Var.B;
                Rect rect = y11Var.c;
                ri0Var.layout(rect.left + measuredWidth2, rect.top + measuredHeight, measuredWidth2 + rect.right, measuredHeight + rect.bottom);
                int dp2 = AndroidUtilities.dp(11.0f) + y11Var.M.a;
                int dp3 = AndroidUtilities.dp(11.0f) + y11Var.M.b;
                ImageView imageView = y11Var.C;
                imageView.layout(dp2, dp3, imageView.getMeasuredWidth() + dp2, y11Var.C.getMeasuredHeight() + dp3);
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
        float f10;
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
                    gg.g gVar = v0Var.e;
                    int i15 = i13 + measuredWidth;
                    View view2 = v0Var.w;
                    measureChildWithMargins(gVar, i10, i15 + (view2 != null ? view2.getMeasuredWidth() : 0), i11, 0);
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
                    measureChildWithMargins(v0Var.e, rl.d(12.0f, size2, 0), i12 + measuredWidth2, i11, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(v0Var.e.getMeasuredWidth() + measuredWidth2, size2), View.MeasureSpec.getSize(i11));
                    break;
                }
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                rn rnVar = (rn) this.c;
                if (rnVar.C9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i14 = AndroidUtilities.dp(32.0f);
                } else {
                    i14 = 0;
                }
                TextView textView2 = rnVar.H1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = rnVar.J1) != null && textView.getVisibility() == 0) {
                    size3 = rl.x(31.0f, size3, 2);
                }
                this.b = true;
                TextView textView3 = rnVar.J1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rnVar.J1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = rnVar.H1;
                    if (textView4 == null || textView4.getVisibility() != 0) {
                        rnVar.J1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i14;
                    } else {
                        rnVar.J1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i14 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    }
                }
                TextView textView5 = rnVar.H1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) rnVar.H1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = rnVar.J1;
                    if (textView6 == null || textView6.getVisibility() != 0) {
                        rnVar.H1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    } else {
                        rnVar.H1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    }
                    layoutParams2.leftMargin = i14;
                }
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 2:
                y11 y11Var = (y11) this.c;
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                boolean z10 = size4 < size5;
                y11Var.L = z10;
                y11Var.y.setVisibility(z10 ? 0 : 8);
                super.onMeasure(i10, i11);
                if (!z10) {
                    this.b = true;
                    ag.y1 y1Var = y11Var.x;
                    i0.c cVar = y11Var.M;
                    y1Var.setPadding(0, (cVar.b * 2) / 3, cVar.c, cVar.d);
                    this.b = false;
                    y11Var.x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + y11Var.M.c, TLObject.FLAG_30), i11);
                    y11Var.A.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), TLObject.FLAG_30));
                    break;
                } else {
                    this.b = true;
                    ag.y1 y1Var2 = y11Var.x;
                    int i16 = y11Var.M.a;
                    int dp = AndroidUtilities.dp(8.0f);
                    i0.c cVar2 = y11Var.M;
                    y1Var2.setPadding(i16, dp, cVar2.c, cVar2.d);
                    this.b = false;
                    y11Var.x.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size5 + y11Var.M.d, TLObject.FLAG_31));
                    y11Var.A.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), TLObject.FLAG_30));
                    break;
                }
            default:
                int size6 = View.MeasureSpec.getSize(i10);
                int size7 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size6, size7);
                if (((nc1) this.c).e != null) {
                    this.b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((nc1) this.c).e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((nc1) this.c).e.setLayoutParams(layoutParams3);
                    }
                    if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                        ((nc1) this.c).h.setTextSize(1, 20.0f);
                    } else {
                        ((nc1) this.c).h.setTextSize(1, 18.0f);
                    }
                    this.b = false;
                }
                measureChildWithMargins(((nc1) this.c).o0, i10, 0, i11, 0);
                int measuredHeight = ((nc1) this.c).o0.getMeasuredHeight();
                if (((nc1) this.c).o0.getVisibility() == 0) {
                    size7 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((nc1) this.c).q0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                nc1 nc1Var = (nc1) this.c;
                if (nc1Var.b == 2) {
                    gb1 gb1Var = nc1Var.q0;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    nc1 nc1Var2 = (nc1) this.c;
                    gb1Var.setPadding(0, dp2, 0, (AndroidUtilities.dp(((nc1Var2.G1 || nc1Var2.F1 <= 0) ? 0 : 58) + 72) - 12) + (((nc1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0));
                }
                ((nc1) this.c).q0.measure(View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size7 - layoutParams4.bottomMargin, TLObject.FLAG_30));
                ((FrameLayout.LayoutParams) ((nc1) this.c).t0.getLayoutParams()).topMargin = measuredHeight;
                ((nc1) this.c).t0.measure(View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30));
                ag.w wVar = ((nc1) this.c).M1;
                if (wVar != null) {
                    ((FrameLayout.LayoutParams) wVar.getLayoutParams()).topMargin = measuredHeight;
                    ((nc1) this.c).M1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), TLObject.FLAG_30));
                }
                org.telegram.ui.u4 u4Var = ((nc1) this.c).y0;
                if (u4Var != null) {
                    u4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + (((nc1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0));
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((nc1) this.c).y0.getLayoutParams();
                    nc1 nc1Var3 = (nc1) this.c;
                    layoutParams5.height = AndroidUtilities.dp(72 + ((nc1Var3.G1 || nc1Var3.F1 <= 0) ? 0 : 58)) + (((nc1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0);
                    measureChildWithMargins(((nc1) this.c).y0, i10, 0, i11, 0);
                }
                Drawable drawable = ((nc1) this.c).r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i17 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((nc1) this.c).H0;
                    if (i17 >= frameLayoutArr.length) {
                        break;
                    } else {
                        FrameLayout frameLayout = frameLayoutArr[i17];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i17 == 0) {
                                f10 = ((nc1) this.c).b == 2 ? 321 : 273;
                            } else {
                                f10 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f10);
                            if (((nc1) this.c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i17 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            ((nc1) this.c).H0[i17].setPadding(0, i17 == 0 ? AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top : 0, 0, ((nc1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0);
                            measureChildWithMargins(((nc1) this.c).H0[i17], i10, 0, i11, 0);
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
    public void setAlpha(float f10) {
        switch (this.a) {
            case 0:
                super.setAlpha(f10);
                v0 v0Var = (v0) this.c;
                l0 l0Var = v0Var.s;
                if (l0Var != null && l0Var.getTag() != null) {
                    v0Var.s.setAlpha(f10);
                    v0Var.s.setScaleX(f10);
                    v0Var.s.setScaleY(f10);
                    break;
                }
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 0:
                super.setVisibility(i10);
                v0 v0Var = (v0) this.c;
                l0 l0Var = v0Var.s;
                if (l0Var != null) {
                    l0Var.setVisibility(i10);
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
