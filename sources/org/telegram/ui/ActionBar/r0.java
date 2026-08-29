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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.t9;
import org.telegram.ui.a21;
import org.telegram.ui.jb1;
import org.telegram.ui.qc1;
import org.telegram.ui.tn;
import org.telegram.ui.v11;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r0 extends FrameLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(Object obj, Context context, int i10) {
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
                qc1 qc1Var = (qc1) this.c;
                if (view == qc1Var.o0) {
                    b5Var = qc1Var.parentLayout;
                    if (b5Var != null) {
                        b5Var2 = qc1Var.parentLayout;
                        if (qc1Var.o0.getVisibility() == 0) {
                            i10 = (int) (qc1Var.o0.getTranslationY() + qc1Var.o0.getMeasuredHeight());
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
                w0 w0Var = (w0) this.c;
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = 0;
                if (!LocaleController.isRTL && w0Var.h.getVisibility() == 0) {
                    i14 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                }
                if (w0Var.f.getVisibility() == 0) {
                    i14 += w0Var.f.getMeasuredWidth();
                }
                ig.f fVar = w0Var.e;
                fVar.layout(i14, fVar.getTop(), w0Var.e.getMeasuredWidth() + i14, w0Var.e.getBottom());
                break;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 2:
                a21 a21Var = (a21) this.c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                boolean z11 = measuredWidth < measuredHeight2;
                if (a21Var.x.getVisibility() == 0) {
                    if (z11) {
                        AndroidUtilities.rectTmp2.set(0, 0, measuredWidth, AndroidUtilities.dp(25.0f) + (measuredHeight2 - a21Var.x.getMeasuredHeight()));
                    } else {
                        AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth - a21Var.x.getWidth()), measuredHeight2);
                    }
                    a21Var.w.setClipBounds(AndroidUtilities.rectTmp2);
                } else {
                    a21Var.w.setClipBounds(null);
                }
                a21Var.w.layout(0, 0, measuredWidth, measuredHeight2);
                int measuredHeight3 = a21Var.x.getVisibility() == 0 ? a21Var.x.getMeasuredHeight() : 0;
                int measuredWidth2 = z11 ? (measuredWidth - a21Var.A.getMeasuredWidth()) / 2 : a21Var.M.a + ((((measuredWidth - a21Var.x.getMeasuredWidth()) - a21Var.M.a) - a21Var.A.getMeasuredWidth()) / 2);
                if (z11) {
                    int i15 = a21Var.M.b;
                    measuredHeight = AndroidUtilities.dp(52.0f) + (((((measuredHeight2 - measuredHeight3) - i15) - a21Var.A.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + i15;
                } else {
                    measuredHeight = (measuredHeight2 - a21Var.A.getMeasuredHeight()) / 2;
                }
                v11 v11Var = a21Var.A;
                v11Var.layout(measuredWidth2, measuredHeight, v11Var.getMeasuredWidth() + measuredWidth2, a21Var.A.getMeasuredHeight() + measuredHeight);
                if (z11) {
                    int measuredWidth3 = (measuredWidth - a21Var.y.getMeasuredWidth()) / 2;
                    int dp = measuredHeight - AndroidUtilities.dp(48.0f);
                    t9 t9Var = a21Var.y;
                    t9Var.layout(measuredWidth3, dp, t9Var.getMeasuredWidth() + measuredWidth3, a21Var.y.getMeasuredHeight() + dp);
                }
                if (a21Var.x.getVisibility() == 0) {
                    if (z11) {
                        int measuredWidth4 = (measuredWidth - a21Var.x.getMeasuredWidth()) / 2;
                        a21Var.x.layout(measuredWidth4, getMeasuredHeight() - measuredHeight3, a21Var.x.getMeasuredWidth() + measuredWidth4, getMeasuredHeight());
                    } else {
                        int measuredHeight4 = (measuredHeight2 - a21Var.x.getMeasuredHeight()) / 2;
                        a21Var.x.layout(getMeasuredWidth() - a21Var.x.getMeasuredWidth(), measuredHeight4, getMeasuredWidth(), a21Var.x.getMeasuredHeight() + measuredHeight4);
                    }
                }
                aj0 aj0Var = a21Var.B;
                Rect rect = a21Var.c;
                aj0Var.layout(rect.left + measuredWidth2, rect.top + measuredHeight, measuredWidth2 + rect.right, measuredHeight + rect.bottom);
                int dp2 = AndroidUtilities.dp(11.0f) + a21Var.M.a;
                int dp3 = AndroidUtilities.dp(11.0f) + a21Var.M.b;
                ImageView imageView = a21Var.C;
                imageView.layout(dp2, dp3, imageView.getMeasuredWidth() + dp2, a21Var.C.getMeasuredHeight() + dp3);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        r0 r0Var;
        int i13;
        int i14;
        TextView textView;
        float f9;
        switch (this.a) {
            case 0:
                w0 w0Var = (w0) this.c;
                measureChildWithMargins(w0Var.s, i10, 0, i11, 0);
                View view = w0Var.w;
                if (view != null) {
                    measureChildWithMargins(view, i10, 0, i11, 0);
                }
                if (!LocaleController.isRTL) {
                    if (w0Var.h.getVisibility() == 0) {
                        r0Var = this;
                        r0Var.measureChildWithMargins(w0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                        i13 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                    } else {
                        r0Var = this;
                        i13 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i10);
                    r0Var.b = true;
                    r0Var.measureChildWithMargins(w0Var.f, i10, i13, i11, 0);
                    int measuredWidth = w0Var.f.getVisibility() == 0 ? w0Var.f.getMeasuredWidth() : 0;
                    ig.f fVar = w0Var.e;
                    int i15 = i13 + measuredWidth;
                    View view2 = w0Var.w;
                    measureChildWithMargins(fVar, i10, i15 + (view2 != null ? view2.getMeasuredWidth() : 0), i11, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(w0Var.e.getMeasuredWidth() + measuredWidth, size), View.MeasureSpec.getSize(i11));
                    break;
                } else {
                    if (w0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(w0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                        i12 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                    } else {
                        i12 = 0;
                    }
                    int size2 = View.MeasureSpec.getSize(i10);
                    this.b = true;
                    measureChildWithMargins(w0Var.f, i10, i12, i11, 0);
                    int measuredWidth2 = w0Var.f.getVisibility() == 0 ? w0Var.f.getMeasuredWidth() : 0;
                    measureChildWithMargins(w0Var.e, org.telegram.ui.b.d(12.0f, size2, 0), i12 + measuredWidth2, i11, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(w0Var.e.getMeasuredWidth() + measuredWidth2, size2), View.MeasureSpec.getSize(i11));
                    break;
                }
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                tn tnVar = (tn) this.c;
                if (tnVar.C9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i14 = AndroidUtilities.dp(32.0f);
                } else {
                    i14 = 0;
                }
                TextView textView2 = tnVar.H1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = tnVar.J1) != null && textView.getVisibility() == 0) {
                    size3 = org.telegram.ui.b.x(31.0f, size3, 2);
                }
                this.b = true;
                TextView textView3 = tnVar.J1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tnVar.J1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = tnVar.H1;
                    if (textView4 == null || textView4.getVisibility() != 0) {
                        tnVar.J1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i14;
                    } else {
                        tnVar.J1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i14 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    }
                }
                TextView textView5 = tnVar.H1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) tnVar.H1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = tnVar.J1;
                    if (textView6 == null || textView6.getVisibility() != 0) {
                        tnVar.H1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    } else {
                        tnVar.H1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    }
                    layoutParams2.leftMargin = i14;
                }
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 2:
                a21 a21Var = (a21) this.c;
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                boolean z10 = size4 < size5;
                a21Var.L = z10;
                a21Var.y.setVisibility(z10 ? 0 : 8);
                super.onMeasure(i10, i11);
                if (!z10) {
                    this.b = true;
                    bg.d1 d1Var = a21Var.x;
                    i0.b bVar = a21Var.M;
                    d1Var.setPadding(0, (bVar.b * 2) / 3, bVar.c, bVar.d);
                    this.b = false;
                    a21Var.x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + a21Var.M.c, TLObject.FLAG_30), i11);
                    a21Var.A.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), TLObject.FLAG_30));
                    break;
                } else {
                    this.b = true;
                    bg.d1 d1Var2 = a21Var.x;
                    int i16 = a21Var.M.a;
                    int dp = AndroidUtilities.dp(8.0f);
                    i0.b bVar2 = a21Var.M;
                    d1Var2.setPadding(i16, dp, bVar2.c, bVar2.d);
                    this.b = false;
                    a21Var.x.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size5 + a21Var.M.d, TLObject.FLAG_31));
                    a21Var.A.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), TLObject.FLAG_30));
                    break;
                }
            default:
                int size6 = View.MeasureSpec.getSize(i10);
                int size7 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size6, size7);
                if (((qc1) this.c).e != null) {
                    this.b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((qc1) this.c).e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((qc1) this.c).e.setLayoutParams(layoutParams3);
                    }
                    if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                        ((qc1) this.c).h.setTextSize(1, 20.0f);
                    } else {
                        ((qc1) this.c).h.setTextSize(1, 18.0f);
                    }
                    this.b = false;
                }
                measureChildWithMargins(((qc1) this.c).o0, i10, 0, i11, 0);
                int measuredHeight = ((qc1) this.c).o0.getMeasuredHeight();
                if (((qc1) this.c).o0.getVisibility() == 0) {
                    size7 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((qc1) this.c).q0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                qc1 qc1Var = (qc1) this.c;
                if (qc1Var.b == 2) {
                    jb1 jb1Var = qc1Var.q0;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    qc1 qc1Var2 = (qc1) this.c;
                    jb1Var.setPadding(0, dp2, 0, (AndroidUtilities.dp(((qc1Var2.G1 || qc1Var2.F1 <= 0) ? 0 : 58) + 72) - 12) + (((qc1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0));
                }
                ((qc1) this.c).q0.measure(View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size7 - layoutParams4.bottomMargin, TLObject.FLAG_30));
                ((FrameLayout.LayoutParams) ((qc1) this.c).t0.getLayoutParams()).topMargin = measuredHeight;
                ((qc1) this.c).t0.measure(View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30));
                bg.u1 u1Var = ((qc1) this.c).M1;
                if (u1Var != null) {
                    ((FrameLayout.LayoutParams) u1Var.getLayoutParams()).topMargin = measuredHeight;
                    ((qc1) this.c).M1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), TLObject.FLAG_30));
                }
                org.telegram.ui.u4 u4Var = ((qc1) this.c).y0;
                if (u4Var != null) {
                    u4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + (((qc1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0));
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((qc1) this.c).y0.getLayoutParams();
                    qc1 qc1Var3 = (qc1) this.c;
                    layoutParams5.height = AndroidUtilities.dp(72 + ((qc1Var3.G1 || qc1Var3.F1 <= 0) ? 0 : 58)) + (((qc1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0);
                    measureChildWithMargins(((qc1) this.c).y0, i10, 0, i11, 0);
                }
                Drawable drawable = ((qc1) this.c).r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i17 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((qc1) this.c).H0;
                    if (i17 >= frameLayoutArr.length) {
                        break;
                    } else {
                        FrameLayout frameLayout = frameLayoutArr[i17];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i17 == 0) {
                                f9 = ((qc1) this.c).b == 2 ? 321 : 273;
                            } else {
                                f9 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f9);
                            if (((qc1) this.c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i17 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            ((qc1) this.c).H0[i17].setPadding(0, i17 == 0 ? AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top : 0, 0, ((qc1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0);
                            measureChildWithMargins(((qc1) this.c).H0[i17], i10, 0, i11, 0);
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
    public void setAlpha(float f9) {
        switch (this.a) {
            case 0:
                super.setAlpha(f9);
                w0 w0Var = (w0) this.c;
                m0 m0Var = w0Var.s;
                if (m0Var != null && m0Var.getTag() != null) {
                    w0Var.s.setAlpha(f9);
                    w0Var.s.setScaleX(f9);
                    w0Var.s.setScaleY(f9);
                    break;
                }
                break;
            default:
                super.setAlpha(f9);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 0:
                super.setVisibility(i10);
                w0 w0Var = (w0) this.c;
                m0 m0Var = w0Var.s;
                if (m0Var != null) {
                    m0Var.setVisibility(i10);
                }
                View view = w0Var.w;
                if (view != null) {
                    view.setVisibility(i10);
                }
                FrameLayout frameLayout = w0Var.a;
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
