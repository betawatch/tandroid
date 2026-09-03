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
import org.telegram.ui.ec1;
import org.telegram.ui.jd1;
import org.telegram.ui.o21;
import org.telegram.ui.u21;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                jd1 jd1Var = (jd1) this.c;
                if (view == jd1Var.p0) {
                    e5Var = jd1Var.parentLayout;
                    if (e5Var != null) {
                        e5Var2 = jd1Var.parentLayout;
                        if (jd1Var.p0.getVisibility() == 0) {
                            i10 = (int) (jd1Var.p0.getTranslationY() + jd1Var.p0.getMeasuredHeight());
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
                u21 u21Var = (u21) this.c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                boolean z10 = measuredWidth < measuredHeight2;
                if (u21Var.x.getVisibility() == 0) {
                    if (z10) {
                        AndroidUtilities.rectTmp2.set(0, 0, measuredWidth, AndroidUtilities.dp(25.0f) + (measuredHeight2 - u21Var.x.getMeasuredHeight()));
                    } else {
                        AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth - u21Var.x.getWidth()), measuredHeight2);
                    }
                    u21Var.w.setClipBounds(AndroidUtilities.rectTmp2);
                } else {
                    u21Var.w.setClipBounds(null);
                }
                u21Var.w.layout(0, 0, measuredWidth, measuredHeight2);
                int measuredHeight3 = u21Var.x.getVisibility() == 0 ? u21Var.x.getMeasuredHeight() : 0;
                int measuredWidth2 = z10 ? (measuredWidth - u21Var.B.getMeasuredWidth()) / 2 : u21Var.N.a + ((((measuredWidth - u21Var.x.getMeasuredWidth()) - u21Var.N.a) - u21Var.B.getMeasuredWidth()) / 2);
                if (z10) {
                    int i15 = u21Var.N.b;
                    measuredHeight = AndroidUtilities.dp(52.0f) + (((((measuredHeight2 - measuredHeight3) - i15) - u21Var.B.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + i15;
                } else {
                    measuredHeight = (measuredHeight2 - u21Var.B.getMeasuredHeight()) / 2;
                }
                o21 o21Var = u21Var.B;
                o21Var.layout(measuredWidth2, measuredHeight, o21Var.getMeasuredWidth() + measuredWidth2, u21Var.B.getMeasuredHeight() + measuredHeight);
                if (z10) {
                    int measuredWidth3 = (measuredWidth - u21Var.y.getMeasuredWidth()) / 2;
                    int dp = measuredHeight - AndroidUtilities.dp(48.0f);
                    p9 p9Var = u21Var.y;
                    p9Var.layout(measuredWidth3, dp, p9Var.getMeasuredWidth() + measuredWidth3, u21Var.y.getMeasuredHeight() + dp);
                }
                if (u21Var.x.getVisibility() == 0) {
                    if (z10) {
                        int measuredWidth4 = (measuredWidth - u21Var.x.getMeasuredWidth()) / 2;
                        u21Var.x.layout(measuredWidth4, getMeasuredHeight() - measuredHeight3, u21Var.x.getMeasuredWidth() + measuredWidth4, getMeasuredHeight());
                    } else {
                        int measuredHeight4 = (measuredHeight2 - u21Var.x.getMeasuredHeight()) / 2;
                        u21Var.x.layout(getMeasuredWidth() - u21Var.x.getMeasuredWidth(), measuredHeight4, getMeasuredWidth(), u21Var.x.getMeasuredHeight() + measuredHeight4);
                    }
                }
                jj0 jj0Var = u21Var.C;
                Rect rect = u21Var.c;
                jj0Var.layout(rect.left + measuredWidth2, rect.top + measuredHeight, measuredWidth2 + rect.right, measuredHeight + rect.bottom);
                int dp2 = AndroidUtilities.dp(11.0f) + u21Var.N.a;
                int dp3 = AndroidUtilities.dp(11.0f) + u21Var.N.b;
                ImageView imageView = u21Var.D;
                imageView.layout(dp2, dp3, imageView.getMeasuredWidth() + dp2, u21Var.D.getMeasuredHeight() + dp3);
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
                zn znVar = (zn) this.c;
                if (znVar.C9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i14 = AndroidUtilities.dp(32.0f);
                } else {
                    i14 = 0;
                }
                TextView textView2 = znVar.I1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = znVar.K1) != null && textView.getVisibility() == 0) {
                    size3 = org.telegram.ui.b.x(31.0f, size3, 2);
                }
                this.b = true;
                TextView textView3 = znVar.K1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) znVar.K1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = znVar.I1;
                    if (textView4 == null || textView4.getVisibility() != 0) {
                        znVar.K1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i14;
                    } else {
                        znVar.K1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i14 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    }
                }
                TextView textView5 = znVar.I1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) znVar.I1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = znVar.K1;
                    if (textView6 == null || textView6.getVisibility() != 0) {
                        znVar.I1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    } else {
                        znVar.I1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    }
                    layoutParams2.leftMargin = i14;
                }
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 2:
                u21 u21Var = (u21) this.c;
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                boolean z4 = size4 < size5;
                u21Var.M = z4;
                u21Var.y.setVisibility(z4 ? 0 : 8);
                super.onMeasure(i10, i11);
                if (!z4) {
                    this.b = true;
                    ah.e eVar = u21Var.x;
                    i0.b bVar = u21Var.N;
                    eVar.setPadding(0, (bVar.b * 2) / 3, bVar.c, bVar.d);
                    this.b = false;
                    u21Var.x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + u21Var.N.c, TLObject.FLAG_30), i11);
                    u21Var.B.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), TLObject.FLAG_30));
                    break;
                } else {
                    this.b = true;
                    ah.e eVar2 = u21Var.x;
                    int i16 = u21Var.N.a;
                    int dp = AndroidUtilities.dp(8.0f);
                    i0.b bVar2 = u21Var.N;
                    eVar2.setPadding(i16, dp, bVar2.c, bVar2.d);
                    this.b = false;
                    u21Var.x.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size5 + u21Var.N.d, TLObject.FLAG_31));
                    u21Var.B.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), TLObject.FLAG_30));
                    break;
                }
            default:
                int size6 = View.MeasureSpec.getSize(i10);
                int size7 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size6, size7);
                if (((jd1) this.c).e != null) {
                    this.b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((jd1) this.c).e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((jd1) this.c).e.setLayoutParams(layoutParams3);
                    }
                    if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                        ((jd1) this.c).h.setTextSize(1, 20.0f);
                    } else {
                        ((jd1) this.c).h.setTextSize(1, 18.0f);
                    }
                    this.b = false;
                }
                measureChildWithMargins(((jd1) this.c).p0, i10, 0, i11, 0);
                int measuredHeight = ((jd1) this.c).p0.getMeasuredHeight();
                if (((jd1) this.c).p0.getVisibility() == 0) {
                    size7 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((jd1) this.c).r0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                jd1 jd1Var = (jd1) this.c;
                if (jd1Var.b == 2) {
                    ec1 ec1Var = jd1Var.r0;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    jd1 jd1Var2 = (jd1) this.c;
                    ec1Var.setPadding(0, dp2, 0, (AndroidUtilities.dp(((jd1Var2.H1 || jd1Var2.G1 <= 0) ? 0 : 58) + 72) - 12) + (((jd1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0));
                }
                ((jd1) this.c).r0.measure(View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size7 - layoutParams4.bottomMargin, TLObject.FLAG_30));
                ((FrameLayout.LayoutParams) ((jd1) this.c).u0.getLayoutParams()).topMargin = measuredHeight;
                ((jd1) this.c).u0.measure(View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30));
                dg.s1 s1Var = ((jd1) this.c).N1;
                if (s1Var != null) {
                    ((FrameLayout.LayoutParams) s1Var.getLayoutParams()).topMargin = measuredHeight;
                    ((jd1) this.c).N1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), TLObject.FLAG_30));
                }
                org.telegram.ui.y4 y4Var = ((jd1) this.c).z0;
                if (y4Var != null) {
                    y4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + (((jd1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0));
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((jd1) this.c).z0.getLayoutParams();
                    jd1 jd1Var3 = (jd1) this.c;
                    layoutParams5.height = AndroidUtilities.dp(72 + ((jd1Var3.H1 || jd1Var3.G1 <= 0) ? 0 : 58)) + (((jd1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0);
                    measureChildWithMargins(((jd1) this.c).z0, i10, 0, i11, 0);
                }
                Drawable drawable = ((jd1) this.c).r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i17 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((jd1) this.c).I0;
                    if (i17 >= frameLayoutArr.length) {
                        break;
                    } else {
                        FrameLayout frameLayout = frameLayoutArr[i17];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i17 == 0) {
                                f10 = ((jd1) this.c).b == 2 ? 321 : 273;
                            } else {
                                f10 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f10);
                            if (((jd1) this.c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i17 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            ((jd1) this.c).I0[i17].setPadding(0, i17 == 0 ? AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top : 0, 0, ((jd1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0);
                            measureChildWithMargins(((jd1) this.c).I0[i17], i10, 0, i11, 0);
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
