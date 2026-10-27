package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ll0 extends org.telegram.ui.Components.ww0 {
    public final /* synthetic */ int l0;
    public final /* synthetic */ FrameLayout m0;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ll0(org.telegram.ui.ActionBar.r2 r2Var, Context context, FrameLayout frameLayout, int i10) {
        super(context, null);
        this.l0 = i10;
        this.n0 = r2Var;
        this.m0 = frameLayout;
    }

    @Override // org.telegram.ui.Components.ww0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        org.telegram.ui.ActionBar.r5 r5Var;
        int measuredHeight2;
        switch (this.l0) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n0;
                int visibility = passcodeActivity.v.getVisibility();
                FrameLayout frameLayout = this.m0;
                if (visibility == 8 || Q() < AndroidUtilities.dp(20.0f)) {
                    if (passcodeActivity.v.getVisibility() != 8) {
                        int measuredWidth = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                        frameLayout.layout(0, 0, measuredWidth, measuredHeight);
                    } else {
                        int measuredWidth2 = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight();
                        frameLayout.layout(0, 0, measuredWidth2, measuredHeight);
                    }
                } else if (passcodeActivity.m0()) {
                    int measuredWidth3 = getMeasuredWidth();
                    measuredHeight = Q() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                    frameLayout.layout(0, 0, measuredWidth3, measuredHeight);
                } else {
                    int measuredWidth4 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight();
                    frameLayout.layout(0, 0, measuredWidth4, measuredHeight);
                }
                r5Var = ((org.telegram.ui.ActionBar.r2) passcodeActivity).simpleActionBar;
                View view = r5Var != null ? ((org.telegram.ui.ActionBar.r2) passcodeActivity).simpleActionBar : ((org.telegram.ui.ActionBar.r2) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                passcodeActivity.v.layout(0, measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight);
                R();
                break;
            default:
                k0 k0Var = (k0) this.m0;
                fg1 fg1Var = (fg1) this.n0;
                if (fg1Var.e0.getVisibility() == 8 || Q() < AndroidUtilities.dp(20.0f)) {
                    if (fg1Var.e0.getVisibility() != 8) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                        k0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        k0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (fg1Var.w0()) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = Q() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                    k0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    k0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                fg1Var.e0.layout(0, measuredHeight2, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight2);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.r5 r5Var;
        switch (this.l0) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n0;
                this.m0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((passcodeActivity.v.getVisibility() == 8 || Q() >= AndroidUtilities.dp(20.0f)) ? size2 : size2 - AndroidUtilities.dp(230.0f), TLObject.FLAG_30));
                passcodeActivity.v.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), TLObject.FLAG_30));
                r5Var = ((org.telegram.ui.ActionBar.r2) passcodeActivity).simpleActionBar;
                View view = r5Var != null ? ((org.telegram.ui.ActionBar.r2) passcodeActivity).simpleActionBar : ((org.telegram.ui.ActionBar.r2) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    break;
                }
                break;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size3, size4);
                fg1 fg1Var = (fg1) this.n0;
                if (fg1Var.e0.getVisibility() != 8 && Q() < AndroidUtilities.dp(20.0f)) {
                    size4 -= AndroidUtilities.dp(230.0f);
                }
                ((k0) this.m0).measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                fg1Var.e0.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), TLObject.FLAG_30));
                break;
        }
    }
}
