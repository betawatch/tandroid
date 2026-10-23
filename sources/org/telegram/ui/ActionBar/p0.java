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
import org.telegram.messenger.nk;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.fb1;
import org.telegram.ui.kc1;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        d5 d5Var;
        d5 d5Var2;
        int i10;
        switch (this.a) {
            case 2:
                boolean drawChild = super.drawChild(canvas, view, j10);
                kc1 kc1Var = (kc1) this.c;
                if (view == kc1Var.s0) {
                    d5Var = kc1Var.parentLayout;
                    if (d5Var != null) {
                        d5Var2 = kc1Var.parentLayout;
                        if (kc1Var.s0.getVisibility() == 0) {
                            i10 = (int) (kc1Var.s0.getTranslationY() + kc1Var.s0.getMeasuredHeight());
                        } else {
                            i10 = 0;
                        }
                        ((ActionBarLayout) d5Var2).q(canvas, i10);
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
                u0 u0Var = (u0) this.c;
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = 0;
                if (!LocaleController.isRTL && u0Var.h.getVisibility() == 0) {
                    i14 = AndroidUtilities.dp(4.0f) + u0Var.h.getMeasuredWidth();
                }
                if (u0Var.f.getVisibility() == 0) {
                    i14 += u0Var.f.getMeasuredWidth();
                }
                ei.e2 e2Var = u0Var.e;
                e2Var.layout(i14, e2Var.getTop(), u0Var.e.getMeasuredWidth() + i14, u0Var.e.getBottom());
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
                u0 u0Var = (u0) this.c;
                measureChildWithMargins(u0Var.s, i10, 0, i11, 0);
                View view = u0Var.w;
                if (view != null) {
                    measureChildWithMargins(view, i10, 0, i11, 0);
                }
                if (!LocaleController.isRTL) {
                    if (u0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(u0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                        i13 = AndroidUtilities.dp(4.0f) + u0Var.h.getMeasuredWidth();
                    } else {
                        i13 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i10);
                    this.b = true;
                    measureChildWithMargins(u0Var.f, i10, i13, i11, 0);
                    int measuredWidth = u0Var.f.getVisibility() == 0 ? u0Var.f.getMeasuredWidth() : 0;
                    ei.e2 e2Var = u0Var.e;
                    int i15 = i13 + measuredWidth;
                    View view2 = u0Var.w;
                    measureChildWithMargins(e2Var, i10, i15 + (view2 != null ? view2.getMeasuredWidth() : 0), i11, 0);
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
                    measureChildWithMargins(u0Var.e, nk.c(12.0f, size2, 0), i12 + measuredWidth2, i11, 0);
                    this.b = false;
                    setMeasuredDimension(Math.max(u0Var.e.getMeasuredWidth() + measuredWidth2, size2), View.MeasureSpec.getSize(i11));
                    break;
                }
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                qn qnVar = (qn) this.c;
                if (qnVar.H9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i14 = AndroidUtilities.dp(32.0f);
                } else {
                    i14 = 0;
                }
                TextView textView2 = qnVar.L1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = qnVar.N1) != null && textView.getVisibility() == 0) {
                    size3 = nk.A(31.0f, size3, 2);
                }
                this.b = true;
                TextView textView3 = qnVar.N1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qnVar.N1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = qnVar.L1;
                    if (textView4 == null || textView4.getVisibility() != 0) {
                        qnVar.N1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i14;
                    } else {
                        qnVar.N1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i14 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    }
                }
                TextView textView5 = qnVar.L1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) qnVar.L1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = qnVar.N1;
                    if (textView6 == null || textView6.getVisibility() != 0) {
                        qnVar.L1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    } else {
                        qnVar.L1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
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
                if (((kc1) this.c).e != null) {
                    this.b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((kc1) this.c).e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((kc1) this.c).e.setLayoutParams(layoutParams3);
                    }
                    if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                        ((kc1) this.c).h.setTextSize(1, 20.0f);
                    } else {
                        ((kc1) this.c).h.setTextSize(1, 18.0f);
                    }
                    this.b = false;
                }
                measureChildWithMargins(((kc1) this.c).s0, i10, 0, i11, 0);
                int measuredHeight = ((kc1) this.c).s0.getMeasuredHeight();
                if (((kc1) this.c).s0.getVisibility() == 0) {
                    size5 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((kc1) this.c).u0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                kc1 kc1Var = (kc1) this.c;
                if (kc1Var.b == 2) {
                    fb1 fb1Var = kc1Var.u0;
                    int dp = AndroidUtilities.dp(4.0f);
                    kc1 kc1Var2 = (kc1) this.c;
                    fb1Var.setPadding(0, dp, 0, (AndroidUtilities.dp(((kc1Var2.K1 || kc1Var2.J1 <= 0) ? 0 : 58) + 72) - 12) + (((kc1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0));
                }
                ((kc1) this.c).u0.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5 - layoutParams4.bottomMargin, TLObject.FLAG_30));
                ((FrameLayout.LayoutParams) ((kc1) this.c).x0.getLayoutParams()).topMargin = measuredHeight;
                ((kc1) this.c).x0.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30));
                ai.o5 o5Var = ((kc1) this.c).Q1;
                if (o5Var != null) {
                    ((FrameLayout.LayoutParams) o5Var.getLayoutParams()).topMargin = measuredHeight;
                    ((kc1) this.c).Q1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), TLObject.FLAG_30));
                }
                org.telegram.ui.z4 z4Var = ((kc1) this.c).C0;
                if (z4Var != null) {
                    z4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + (((kc1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0));
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((kc1) this.c).C0.getLayoutParams();
                    kc1 kc1Var3 = (kc1) this.c;
                    layoutParams5.height = AndroidUtilities.dp(72 + ((kc1Var3.K1 || kc1Var3.J1 <= 0) ? 0 : 58)) + (((kc1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0);
                    measureChildWithMargins(((kc1) this.c).C0, i10, 0, i11, 0);
                }
                Drawable drawable = ((kc1) this.c).r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i16 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((kc1) this.c).L0;
                    if (i16 >= frameLayoutArr.length) {
                        break;
                    } else {
                        FrameLayout frameLayout = frameLayoutArr[i16];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i16 == 0) {
                                f7 = ((kc1) this.c).b == 2 ? 321 : 273;
                            } else {
                                f7 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f7);
                            if (((kc1) this.c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i16 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            ((kc1) this.c).L0[i16].setPadding(0, i16 == 0 ? AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top : 0, 0, ((kc1) this.c).U0() ? AndroidUtilities.navigationBarHeight : 0);
                            measureChildWithMargins(((kc1) this.c).L0[i16], i10, 0, i11, 0);
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
