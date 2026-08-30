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
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.cd1;
import org.telegram.ui.h21;
import org.telegram.ui.m21;
import org.telegram.ui.wb1;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        e5 e5Var;
        e5 e5Var2;
        int i10;
        switch (this.a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j10);
                cd1 cd1Var = (cd1) this.c;
                if (view == cd1Var.p0) {
                    e5Var = cd1Var.parentLayout;
                    if (e5Var != null) {
                        e5Var2 = cd1Var.parentLayout;
                        if (cd1Var.p0.getVisibility() == 0) {
                            i10 = (int) (cd1Var.p0.getTranslationY() + cd1Var.p0.getMeasuredHeight());
                        } else {
                            i10 = 0;
                        }
                        ((ActionBarLayout) e5Var2).q(canvas, i10);
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        switch (this.a) {
            case 0:
                w0 w0Var = (w0) this.c;
                super.onLayout(z4, i10, i11, i12, i13);
                int i14 = 0;
                if (!LocaleController.isRTL && w0Var.h.getVisibility() == 0) {
                    i14 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                }
                if (w0Var.f.getVisibility() == 0) {
                    i14 += w0Var.f.getMeasuredWidth();
                }
                kg.f fVar = w0Var.e;
                fVar.layout(i14, fVar.getTop(), w0Var.e.getMeasuredWidth() + i14, w0Var.e.getBottom());
                break;
            case 1:
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
            case 2:
                m21 m21Var = (m21) this.c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                boolean z10 = measuredWidth < measuredHeight2;
                if (m21Var.x.getVisibility() == 0) {
                    if (z10) {
                        AndroidUtilities.rectTmp2.set(0, 0, measuredWidth, AndroidUtilities.dp(25.0f) + (measuredHeight2 - m21Var.x.getMeasuredHeight()));
                    } else {
                        AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth - m21Var.x.getWidth()), measuredHeight2);
                    }
                    m21Var.w.setClipBounds(AndroidUtilities.rectTmp2);
                } else {
                    m21Var.w.setClipBounds(null);
                }
                m21Var.w.layout(0, 0, measuredWidth, measuredHeight2);
                int measuredHeight3 = m21Var.x.getVisibility() == 0 ? m21Var.x.getMeasuredHeight() : 0;
                int measuredWidth2 = z10 ? (measuredWidth - m21Var.B.getMeasuredWidth()) / 2 : m21Var.N.a + ((((measuredWidth - m21Var.x.getMeasuredWidth()) - m21Var.N.a) - m21Var.B.getMeasuredWidth()) / 2);
                if (z10) {
                    int i15 = m21Var.N.b;
                    measuredHeight = AndroidUtilities.dp(52.0f) + (((((measuredHeight2 - measuredHeight3) - i15) - m21Var.B.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + i15;
                } else {
                    measuredHeight = (measuredHeight2 - m21Var.B.getMeasuredHeight()) / 2;
                }
                h21 h21Var = m21Var.B;
                h21Var.layout(measuredWidth2, measuredHeight, h21Var.getMeasuredWidth() + measuredWidth2, m21Var.B.getMeasuredHeight() + measuredHeight);
                if (z10) {
                    int measuredWidth3 = (measuredWidth - m21Var.y.getMeasuredWidth()) / 2;
                    int dp = measuredHeight - AndroidUtilities.dp(48.0f);
                    p9 p9Var = m21Var.y;
                    p9Var.layout(measuredWidth3, dp, p9Var.getMeasuredWidth() + measuredWidth3, m21Var.y.getMeasuredHeight() + dp);
                }
                if (m21Var.x.getVisibility() == 0) {
                    if (z10) {
                        int measuredWidth4 = (measuredWidth - m21Var.x.getMeasuredWidth()) / 2;
                        m21Var.x.layout(measuredWidth4, getMeasuredHeight() - measuredHeight3, m21Var.x.getMeasuredWidth() + measuredWidth4, getMeasuredHeight());
                    } else {
                        int measuredHeight4 = (measuredHeight2 - m21Var.x.getMeasuredHeight()) / 2;
                        m21Var.x.layout(getMeasuredWidth() - m21Var.x.getMeasuredWidth(), measuredHeight4, getMeasuredWidth(), m21Var.x.getMeasuredHeight() + measuredHeight4);
                    }
                }
                jj0 jj0Var = m21Var.C;
                Rect rect = m21Var.c;
                jj0Var.layout(rect.left + measuredWidth2, rect.top + measuredHeight, measuredWidth2 + rect.right, measuredHeight + rect.bottom);
                int dp2 = AndroidUtilities.dp(11.0f) + m21Var.N.a;
                int dp3 = AndroidUtilities.dp(11.0f) + m21Var.N.b;
                ImageView imageView = m21Var.D;
                imageView.layout(dp2, dp3, imageView.getMeasuredWidth() + dp2, m21Var.D.getMeasuredHeight() + dp3);
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
        float f10;
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
                    kg.f fVar = w0Var.e;
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
                xn xnVar = (xn) this.c;
                if (xnVar.C9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i14 = AndroidUtilities.dp(32.0f);
                } else {
                    i14 = 0;
                }
                TextView textView2 = xnVar.I1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = xnVar.K1) != null && textView.getVisibility() == 0) {
                    size3 = org.telegram.ui.b.x(31.0f, size3, 2);
                }
                this.b = true;
                TextView textView3 = xnVar.K1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xnVar.K1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = xnVar.I1;
                    if (textView4 == null || textView4.getVisibility() != 0) {
                        xnVar.K1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i14;
                    } else {
                        xnVar.K1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i14 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    }
                }
                TextView textView5 = xnVar.I1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) xnVar.I1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = xnVar.K1;
                    if (textView6 == null || textView6.getVisibility() != 0) {
                        xnVar.I1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    } else {
                        xnVar.I1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    }
                    layoutParams2.leftMargin = i14;
                }
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 2:
                m21 m21Var = (m21) this.c;
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                boolean z4 = size4 < size5;
                m21Var.M = z4;
                m21Var.y.setVisibility(z4 ? 0 : 8);
                super.onMeasure(i10, i11);
                if (!z4) {
                    this.b = true;
                    ah.d dVar = m21Var.x;
                    i0.b bVar = m21Var.N;
                    dVar.setPadding(0, (bVar.b * 2) / 3, bVar.c, bVar.d);
                    this.b = false;
                    m21Var.x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + m21Var.N.c, TLObject.FLAG_30), i11);
                    m21Var.B.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), TLObject.FLAG_30));
                    break;
                } else {
                    this.b = true;
                    ah.d dVar2 = m21Var.x;
                    int i16 = m21Var.N.a;
                    int dp = AndroidUtilities.dp(8.0f);
                    i0.b bVar2 = m21Var.N;
                    dVar2.setPadding(i16, dp, bVar2.c, bVar2.d);
                    this.b = false;
                    m21Var.x.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size5 + m21Var.N.d, TLObject.FLAG_31));
                    m21Var.B.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), TLObject.FLAG_30));
                    break;
                }
            default:
                int size6 = View.MeasureSpec.getSize(i10);
                int size7 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size6, size7);
                if (((cd1) this.c).e != null) {
                    this.b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((cd1) this.c).e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((cd1) this.c).e.setLayoutParams(layoutParams3);
                    }
                    if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                        ((cd1) this.c).h.setTextSize(1, 20.0f);
                    } else {
                        ((cd1) this.c).h.setTextSize(1, 18.0f);
                    }
                    this.b = false;
                }
                measureChildWithMargins(((cd1) this.c).p0, i10, 0, i11, 0);
                int measuredHeight = ((cd1) this.c).p0.getMeasuredHeight();
                if (((cd1) this.c).p0.getVisibility() == 0) {
                    size7 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((cd1) this.c).r0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                cd1 cd1Var = (cd1) this.c;
                if (cd1Var.b == 2) {
                    wb1 wb1Var = cd1Var.r0;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    cd1 cd1Var2 = (cd1) this.c;
                    wb1Var.setPadding(0, dp2, 0, (AndroidUtilities.dp(((cd1Var2.H1 || cd1Var2.G1 <= 0) ? 0 : 58) + 72) - 12) + (((cd1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0));
                }
                ((cd1) this.c).r0.measure(View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size7 - layoutParams4.bottomMargin, TLObject.FLAG_30));
                ((FrameLayout.LayoutParams) ((cd1) this.c).u0.getLayoutParams()).topMargin = measuredHeight;
                ((cd1) this.c).u0.measure(View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30));
                dg.s1 s1Var = ((cd1) this.c).N1;
                if (s1Var != null) {
                    ((FrameLayout.LayoutParams) s1Var.getLayoutParams()).topMargin = measuredHeight;
                    ((cd1) this.c).N1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), TLObject.FLAG_30));
                }
                org.telegram.ui.w4 w4Var = ((cd1) this.c).z0;
                if (w4Var != null) {
                    w4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + (((cd1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0));
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((cd1) this.c).z0.getLayoutParams();
                    cd1 cd1Var3 = (cd1) this.c;
                    layoutParams5.height = AndroidUtilities.dp(72 + ((cd1Var3.H1 || cd1Var3.G1 <= 0) ? 0 : 58)) + (((cd1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0);
                    measureChildWithMargins(((cd1) this.c).z0, i10, 0, i11, 0);
                }
                Drawable drawable = ((cd1) this.c).r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i17 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((cd1) this.c).I0;
                    if (i17 >= frameLayoutArr.length) {
                        break;
                    } else {
                        FrameLayout frameLayout = frameLayoutArr[i17];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i17 == 0) {
                                f10 = ((cd1) this.c).b == 2 ? 321 : 273;
                            } else {
                                f10 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f10);
                            if (((cd1) this.c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i17 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            ((cd1) this.c).I0[i17].setPadding(0, i17 == 0 ? AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top : 0, 0, ((cd1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0);
                            measureChildWithMargins(((cd1) this.c).I0[i17], i10, 0, i11, 0);
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
                w0 w0Var = (w0) this.c;
                l0 l0Var = w0Var.s;
                if (l0Var != null && l0Var.getTag() != null) {
                    w0Var.s.setAlpha(f10);
                    w0Var.s.setScaleX(f10);
                    w0Var.s.setScaleY(f10);
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
                w0 w0Var = (w0) this.c;
                l0 l0Var = w0Var.s;
                if (l0Var != null) {
                    l0Var.setVisibility(i10);
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
