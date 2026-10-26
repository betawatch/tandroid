package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.nb1;
import org.telegram.ui.tc1;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        j5 j5Var;
        j5 j5Var2;
        int i10;
        switch (this.a) {
            case 2:
                boolean drawChild = super.drawChild(canvas, view, j10);
                tc1 tc1Var = (tc1) this.c;
                if (view == tc1Var.t0) {
                    j5Var = tc1Var.parentLayout;
                    if (j5Var != null) {
                        j5Var2 = tc1Var.parentLayout;
                        if (tc1Var.t0.getVisibility() == 0) {
                            i10 = (int) (tc1Var.t0.getTranslationY() + tc1Var.t0.getMeasuredHeight());
                        } else {
                            i10 = 0;
                        }
                        ((ActionBarLayout) j5Var2).q(canvas, i10);
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
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
                fi.c2 c2Var = w0Var.e;
                c2Var.layout(i14, c2Var.getTop(), w0Var.e.getMeasuredWidth() + i14, w0Var.e.getBottom());
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        TextView textView;
        float f7;
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
                        measureChildWithMargins(w0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                        i13 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                    } else {
                        i13 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i10);
                    this.b = true;
                    measureChildWithMargins(w0Var.f, i10, i13, i11, 0);
                    int measuredWidth = w0Var.f.getVisibility() == 0 ? w0Var.f.getMeasuredWidth() : 0;
                    fi.c2 c2Var = w0Var.e;
                    int i15 = i13 + measuredWidth;
                    View view2 = w0Var.w;
                    measureChildWithMargins(c2Var, i10, i15 + (view2 != null ? view2.getMeasuredWidth() : 0), i11, 0);
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
                    measureChildWithMargins(w0Var.e, vh.x(12.0f, size2, 0), i12 + measuredWidth2, i11, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(w0Var.e.getMeasuredWidth() + measuredWidth2, size2), View.MeasureSpec.getSize(i11));
                    break;
                }
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                un unVar = (un) this.c;
                if (unVar.L9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i14 = AndroidUtilities.dp(32.0f);
                } else {
                    i14 = 0;
                }
                TextView textView2 = unVar.X1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = unVar.Z1) != null && textView.getVisibility() == 0) {
                    size3 = vh.B(31.0f, size3, 2);
                }
                this.b = true;
                TextView textView3 = unVar.Z1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) unVar.Z1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = unVar.X1;
                    if (textView4 == null || textView4.getVisibility() != 0) {
                        unVar.Z1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i14;
                    } else {
                        unVar.Z1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i14 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    }
                }
                TextView textView5 = unVar.X1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) unVar.X1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = unVar.Z1;
                    if (textView6 == null || textView6.getVisibility() != 0) {
                        unVar.X1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    } else {
                        unVar.X1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    }
                    layoutParams2.leftMargin = i14;
                }
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size4, size5);
                if (((tc1) this.c).e != null) {
                    this.b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((tc1) this.c).e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((tc1) this.c).e.setLayoutParams(layoutParams3);
                    }
                    if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                        ((tc1) this.c).h.setTextSize(1, 20.0f);
                    } else {
                        ((tc1) this.c).h.setTextSize(1, 18.0f);
                    }
                    this.b = false;
                }
                measureChildWithMargins(((tc1) this.c).t0, i10, 0, i11, 0);
                int measuredHeight = ((tc1) this.c).t0.getMeasuredHeight();
                if (((tc1) this.c).t0.getVisibility() == 0) {
                    size5 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((tc1) this.c).v0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                tc1 tc1Var = (tc1) this.c;
                if (tc1Var.b == 2) {
                    nb1 nb1Var = tc1Var.v0;
                    int dp = AndroidUtilities.dp(4.0f);
                    tc1 tc1Var2 = (tc1) this.c;
                    nb1Var.setPadding(0, dp, 0, (AndroidUtilities.dp(((tc1Var2.L1 || tc1Var2.K1 <= 0) ? 0 : 58) + 72) - 12) + (((tc1) this.c).V0() ? AndroidUtilities.navigationBarHeight : 0));
                }
                ((tc1) this.c).v0.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5 - layoutParams4.bottomMargin, TLObject.FLAG_30));
                ((FrameLayout.LayoutParams) ((tc1) this.c).y0.getLayoutParams()).topMargin = measuredHeight;
                ((tc1) this.c).y0.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30));
                bi.j5 j5Var = ((tc1) this.c).R1;
                if (j5Var != null) {
                    ((FrameLayout.LayoutParams) j5Var.getLayoutParams()).topMargin = measuredHeight;
                    ((tc1) this.c).R1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), TLObject.FLAG_30));
                }
                org.telegram.ui.x4 x4Var = ((tc1) this.c).D0;
                if (x4Var != null) {
                    x4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + (((tc1) this.c).V0() ? AndroidUtilities.navigationBarHeight : 0));
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((tc1) this.c).D0.getLayoutParams();
                    tc1 tc1Var3 = (tc1) this.c;
                    layoutParams5.height = AndroidUtilities.dp(72 + ((tc1Var3.L1 || tc1Var3.K1 <= 0) ? 0 : 58)) + (((tc1) this.c).V0() ? AndroidUtilities.navigationBarHeight : 0);
                    measureChildWithMargins(((tc1) this.c).D0, i10, 0, i11, 0);
                }
                Drawable drawable = ((tc1) this.c).r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i16 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((tc1) this.c).M0;
                    if (i16 >= frameLayoutArr.length) {
                        break;
                    } else {
                        FrameLayout frameLayout = frameLayoutArr[i16];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i16 == 0) {
                                f7 = ((tc1) this.c).b == 2 ? 321 : 273;
                            } else {
                                f7 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f7);
                            if (((tc1) this.c).V0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i16 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            ((tc1) this.c).M0[i16].setPadding(0, i16 == 0 ? AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top : 0, 0, ((tc1) this.c).V0() ? AndroidUtilities.navigationBarHeight : 0);
                            measureChildWithMargins(((tc1) this.c).M0[i16], i10, 0, i11, 0);
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
                w0 w0Var = (w0) this.c;
                k0 k0Var = w0Var.s;
                if (k0Var != null && k0Var.getTag() != null) {
                    w0Var.s.setAlpha(f7);
                    w0Var.s.setScaleX(f7);
                    w0Var.s.setScaleY(f7);
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
                w0 w0Var = (w0) this.c;
                k0 k0Var = w0Var.s;
                if (k0Var != null) {
                    k0Var.setVisibility(i10);
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
