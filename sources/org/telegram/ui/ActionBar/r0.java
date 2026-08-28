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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.ib1;
import org.telegram.ui.oc1;
import org.telegram.ui.qn;
import org.telegram.ui.u11;
import org.telegram.ui.z11;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r0 extends FrameLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(Object obj, Context context, int i9) {
        super(context);
        this.a = i9;
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
        int i9;
        switch (this.a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j10);
                oc1 oc1Var = (oc1) this.c;
                if (view == oc1Var.o0) {
                    b5Var = oc1Var.parentLayout;
                    if (b5Var != null) {
                        b5Var2 = oc1Var.parentLayout;
                        if (oc1Var.o0.getVisibility() == 0) {
                            i9 = (int) (oc1Var.o0.getTranslationY() + oc1Var.o0.getMeasuredHeight());
                        } else {
                            i9 = 0;
                        }
                        ((ActionBarLayout) b5Var2).q(canvas, i9);
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int measuredHeight;
        switch (this.a) {
            case 0:
                w0 w0Var = (w0) this.c;
                super.onLayout(z10, i9, i10, i11, i12);
                int i13 = 0;
                if (!LocaleController.isRTL && w0Var.h.getVisibility() == 0) {
                    i13 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                }
                if (w0Var.f.getVisibility() == 0) {
                    i13 += w0Var.f.getMeasuredWidth();
                }
                fg.g gVar = w0Var.e;
                gVar.layout(i13, gVar.getTop(), w0Var.e.getMeasuredWidth() + i13, w0Var.e.getBottom());
                break;
            case 1:
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
            case 2:
                z11 z11Var = (z11) this.c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                boolean z11 = measuredWidth < measuredHeight2;
                if (z11Var.x.getVisibility() == 0) {
                    if (z11) {
                        AndroidUtilities.rectTmp2.set(0, 0, measuredWidth, AndroidUtilities.dp(25.0f) + (measuredHeight2 - z11Var.x.getMeasuredHeight()));
                    } else {
                        AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth - z11Var.x.getWidth()), measuredHeight2);
                    }
                    z11Var.w.setClipBounds(AndroidUtilities.rectTmp2);
                } else {
                    z11Var.w.setClipBounds(null);
                }
                z11Var.w.layout(0, 0, measuredWidth, measuredHeight2);
                int measuredHeight3 = z11Var.x.getVisibility() == 0 ? z11Var.x.getMeasuredHeight() : 0;
                int measuredWidth2 = z11 ? (measuredWidth - z11Var.A.getMeasuredWidth()) / 2 : z11Var.M.a + ((((measuredWidth - z11Var.x.getMeasuredWidth()) - z11Var.M.a) - z11Var.A.getMeasuredWidth()) / 2);
                if (z11) {
                    int i14 = z11Var.M.b;
                    measuredHeight = AndroidUtilities.dp(52.0f) + (((((measuredHeight2 - measuredHeight3) - i14) - z11Var.A.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + i14;
                } else {
                    measuredHeight = (measuredHeight2 - z11Var.A.getMeasuredHeight()) / 2;
                }
                u11 u11Var = z11Var.A;
                u11Var.layout(measuredWidth2, measuredHeight, u11Var.getMeasuredWidth() + measuredWidth2, z11Var.A.getMeasuredHeight() + measuredHeight);
                if (z11) {
                    int measuredWidth3 = (measuredWidth - z11Var.y.getMeasuredWidth()) / 2;
                    int dp = measuredHeight - AndroidUtilities.dp(48.0f);
                    o9 o9Var = z11Var.y;
                    o9Var.layout(measuredWidth3, dp, o9Var.getMeasuredWidth() + measuredWidth3, z11Var.y.getMeasuredHeight() + dp);
                }
                if (z11Var.x.getVisibility() == 0) {
                    if (z11) {
                        int measuredWidth4 = (measuredWidth - z11Var.x.getMeasuredWidth()) / 2;
                        z11Var.x.layout(measuredWidth4, getMeasuredHeight() - measuredHeight3, z11Var.x.getMeasuredWidth() + measuredWidth4, getMeasuredHeight());
                    } else {
                        int measuredHeight4 = (measuredHeight2 - z11Var.x.getMeasuredHeight()) / 2;
                        z11Var.x.layout(getMeasuredWidth() - z11Var.x.getMeasuredWidth(), measuredHeight4, getMeasuredWidth(), z11Var.x.getMeasuredHeight() + measuredHeight4);
                    }
                }
                pi0 pi0Var = z11Var.B;
                Rect rect = z11Var.c;
                pi0Var.layout(rect.left + measuredWidth2, rect.top + measuredHeight, measuredWidth2 + rect.right, measuredHeight + rect.bottom);
                int dp2 = AndroidUtilities.dp(11.0f) + z11Var.M.a;
                int dp3 = AndroidUtilities.dp(11.0f) + z11Var.M.b;
                ImageView imageView = z11Var.C;
                imageView.layout(dp2, dp3, imageView.getMeasuredWidth() + dp2, z11Var.C.getMeasuredHeight() + dp3);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        r0 r0Var;
        int i12;
        int i13;
        TextView textView;
        float f10;
        switch (this.a) {
            case 0:
                w0 w0Var = (w0) this.c;
                measureChildWithMargins(w0Var.s, i9, 0, i10, 0);
                View view = w0Var.w;
                if (view != null) {
                    measureChildWithMargins(view, i9, 0, i10, 0);
                }
                if (!LocaleController.isRTL) {
                    if (w0Var.h.getVisibility() == 0) {
                        r0Var = this;
                        r0Var.measureChildWithMargins(w0Var.h, i9, View.MeasureSpec.getSize(i9) / 2, i10, 0);
                        i12 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                    } else {
                        r0Var = this;
                        i12 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i9);
                    r0Var.b = true;
                    r0Var.measureChildWithMargins(w0Var.f, i9, i12, i10, 0);
                    int measuredWidth = w0Var.f.getVisibility() == 0 ? w0Var.f.getMeasuredWidth() : 0;
                    fg.g gVar = w0Var.e;
                    int i14 = i12 + measuredWidth;
                    View view2 = w0Var.w;
                    measureChildWithMargins(gVar, i9, i14 + (view2 != null ? view2.getMeasuredWidth() : 0), i10, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(w0Var.e.getMeasuredWidth() + measuredWidth, size), View.MeasureSpec.getSize(i10));
                    break;
                } else {
                    if (w0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(w0Var.h, i9, View.MeasureSpec.getSize(i9) / 2, i10, 0);
                        i11 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                    } else {
                        i11 = 0;
                    }
                    int size2 = View.MeasureSpec.getSize(i9);
                    this.b = true;
                    measureChildWithMargins(w0Var.f, i9, i11, i10, 0);
                    int measuredWidth2 = w0Var.f.getVisibility() == 0 ? w0Var.f.getMeasuredWidth() : 0;
                    measureChildWithMargins(w0Var.e, ll.d(12.0f, size2, 0), i11 + measuredWidth2, i10, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(w0Var.e.getMeasuredWidth() + measuredWidth2, size2), View.MeasureSpec.getSize(i10));
                    break;
                }
            case 1:
                int size3 = View.MeasureSpec.getSize(i9);
                qn qnVar = (qn) this.c;
                if (qnVar.C9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i13 = AndroidUtilities.dp(32.0f);
                } else {
                    i13 = 0;
                }
                TextView textView2 = qnVar.H1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = qnVar.J1) != null && textView.getVisibility() == 0) {
                    size3 = ll.y(31.0f, size3, 2);
                }
                this.b = true;
                TextView textView3 = qnVar.J1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qnVar.J1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = qnVar.H1;
                    if (textView4 == null || textView4.getVisibility() != 0) {
                        qnVar.J1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i13;
                    } else {
                        qnVar.J1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i13 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    }
                }
                TextView textView5 = qnVar.H1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) qnVar.H1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = qnVar.J1;
                    if (textView6 == null || textView6.getVisibility() != 0) {
                        qnVar.H1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    } else {
                        qnVar.H1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    }
                    layoutParams2.leftMargin = i13;
                }
                this.b = false;
                super.onMeasure(i9, i10);
                break;
            case 2:
                z11 z11Var = (z11) this.c;
                int size4 = View.MeasureSpec.getSize(i9);
                int size5 = View.MeasureSpec.getSize(i10);
                boolean z10 = size4 < size5;
                z11Var.L = z10;
                z11Var.y.setVisibility(z10 ? 0 : 8);
                super.onMeasure(i9, i10);
                if (!z10) {
                    this.b = true;
                    fh.v vVar = z11Var.x;
                    i0.b bVar = z11Var.M;
                    vVar.setPadding(0, (bVar.b * 2) / 3, bVar.c, bVar.d);
                    this.b = false;
                    z11Var.x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + z11Var.M.c, TLObject.FLAG_30), i10);
                    z11Var.A.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), TLObject.FLAG_30));
                    break;
                } else {
                    this.b = true;
                    fh.v vVar2 = z11Var.x;
                    int i15 = z11Var.M.a;
                    int dp = AndroidUtilities.dp(8.0f);
                    i0.b bVar2 = z11Var.M;
                    vVar2.setPadding(i15, dp, bVar2.c, bVar2.d);
                    this.b = false;
                    z11Var.x.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size5 + z11Var.M.d, TLObject.FLAG_31));
                    z11Var.A.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), TLObject.FLAG_30));
                    break;
                }
            default:
                int size6 = View.MeasureSpec.getSize(i9);
                int size7 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size6, size7);
                if (((oc1) this.c).e != null) {
                    this.b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((oc1) this.c).e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((oc1) this.c).e.setLayoutParams(layoutParams3);
                    }
                    if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                        ((oc1) this.c).h.setTextSize(1, 20.0f);
                    } else {
                        ((oc1) this.c).h.setTextSize(1, 18.0f);
                    }
                    this.b = false;
                }
                measureChildWithMargins(((oc1) this.c).o0, i9, 0, i10, 0);
                int measuredHeight = ((oc1) this.c).o0.getMeasuredHeight();
                if (((oc1) this.c).o0.getVisibility() == 0) {
                    size7 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((oc1) this.c).q0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                oc1 oc1Var = (oc1) this.c;
                if (oc1Var.b == 2) {
                    ib1 ib1Var = oc1Var.q0;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    oc1 oc1Var2 = (oc1) this.c;
                    ib1Var.setPadding(0, dp2, 0, (AndroidUtilities.dp(((oc1Var2.G1 || oc1Var2.F1 <= 0) ? 0 : 58) + 72) - 12) + (((oc1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0));
                }
                ((oc1) this.c).q0.measure(View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size7 - layoutParams4.bottomMargin, TLObject.FLAG_30));
                ((FrameLayout.LayoutParams) ((oc1) this.c).t0.getLayoutParams()).topMargin = measuredHeight;
                ((oc1) this.c).t0.measure(View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30));
                bh.g gVar2 = ((oc1) this.c).M1;
                if (gVar2 != null) {
                    ((FrameLayout.LayoutParams) gVar2.getLayoutParams()).topMargin = measuredHeight;
                    ((oc1) this.c).M1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), TLObject.FLAG_30));
                }
                org.telegram.ui.t4 t4Var = ((oc1) this.c).y0;
                if (t4Var != null) {
                    t4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + (((oc1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0));
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((oc1) this.c).y0.getLayoutParams();
                    oc1 oc1Var3 = (oc1) this.c;
                    layoutParams5.height = AndroidUtilities.dp(72 + ((oc1Var3.G1 || oc1Var3.F1 <= 0) ? 0 : 58)) + (((oc1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0);
                    measureChildWithMargins(((oc1) this.c).y0, i9, 0, i10, 0);
                }
                Drawable drawable = ((oc1) this.c).r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i16 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((oc1) this.c).H0;
                    if (i16 >= frameLayoutArr.length) {
                        break;
                    } else {
                        FrameLayout frameLayout = frameLayoutArr[i16];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i16 == 0) {
                                f10 = ((oc1) this.c).b == 2 ? 321 : 273;
                            } else {
                                f10 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f10);
                            if (((oc1) this.c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i16 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            ((oc1) this.c).H0[i16].setPadding(0, i16 == 0 ? AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top : 0, 0, ((oc1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0);
                            measureChildWithMargins(((oc1) this.c).H0[i16], i9, 0, i10, 0);
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
    public void setVisibility(int i9) {
        switch (this.a) {
            case 0:
                super.setVisibility(i9);
                w0 w0Var = (w0) this.c;
                l0 l0Var = w0Var.s;
                if (l0Var != null) {
                    l0Var.setVisibility(i9);
                }
                View view = w0Var.w;
                if (view != null) {
                    view.setVisibility(i9);
                }
                FrameLayout frameLayout = w0Var.a;
                if (frameLayout != null) {
                    frameLayout.setVisibility(i9);
                    break;
                }
                break;
            default:
                super.setVisibility(i9);
                break;
        }
    }
}
