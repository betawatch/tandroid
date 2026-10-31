package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class oj0 extends org.telegram.ui.Components.uu0 {
    public final /* synthetic */ int f0;
    public final /* synthetic */ FrameLayout g0;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oj0(org.telegram.ui.ActionBar.k2 k2Var, Context context, FrameLayout frameLayout, int i10) {
        super(context, null);
        this.f0 = i10;
        this.h0 = k2Var;
        this.g0 = frameLayout;
    }

    @Override // org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        org.telegram.ui.ActionBar.i5 i5Var;
        int measuredHeight2;
        switch (this.f0) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.h0;
                int visibility = passcodeActivity.w.getVisibility();
                FrameLayout frameLayout = this.g0;
                if (visibility == 8 || Q() < org.telegram.messenger.i0.L(20.0f)) {
                    if (passcodeActivity.w.getVisibility() != 8) {
                        int measuredWidth = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(230.0f);
                        frameLayout.layout(0, 0, measuredWidth, measuredHeight);
                    } else {
                        int measuredWidth2 = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight();
                        frameLayout.layout(0, 0, measuredWidth2, measuredHeight);
                    }
                } else if (passcodeActivity.p0()) {
                    int measuredWidth3 = getMeasuredWidth();
                    measuredHeight = Q() + (getMeasuredHeight() - org.telegram.messenger.i0.L(230.0f));
                    frameLayout.layout(0, 0, measuredWidth3, measuredHeight);
                } else {
                    int measuredWidth4 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight();
                    frameLayout.layout(0, 0, measuredWidth4, measuredHeight);
                }
                i5Var = ((org.telegram.ui.ActionBar.k2) passcodeActivity).simpleActionBar;
                View view = i5Var != null ? ((org.telegram.ui.ActionBar.k2) passcodeActivity).simpleActionBar : ((org.telegram.ui.ActionBar.k2) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                passcodeActivity.w.layout(0, measuredHeight, getMeasuredWidth(), org.telegram.messenger.i0.L(230.0f) + measuredHeight);
                R();
                break;
            default:
                uc1 uc1Var = (uc1) this.g0;
                tc1 tc1Var = (tc1) this.h0;
                if (tc1Var.e0.getVisibility() == 8 || Q() < org.telegram.messenger.i0.L(20.0f)) {
                    if (tc1Var.e0.getVisibility() != 8) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.i0.L(230.0f);
                        uc1Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        uc1Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (tc1Var.z0()) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = Q() + (getMeasuredHeight() - org.telegram.messenger.i0.L(230.0f));
                    uc1Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    uc1Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                tc1Var.e0.layout(0, measuredHeight2, getMeasuredWidth(), org.telegram.messenger.i0.L(230.0f) + measuredHeight2);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.i5 i5Var;
        switch (this.f0) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.h0;
                this.g0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((passcodeActivity.w.getVisibility() == 8 || Q() >= org.telegram.messenger.i0.L(20.0f)) ? size2 : size2 - org.telegram.messenger.i0.L(230.0f), TLObject.FLAG_30));
                passcodeActivity.w.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(230.0f), TLObject.FLAG_30));
                i5Var = ((org.telegram.ui.ActionBar.k2) passcodeActivity).simpleActionBar;
                View view = i5Var != null ? ((org.telegram.ui.ActionBar.k2) passcodeActivity).simpleActionBar : ((org.telegram.ui.ActionBar.k2) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    break;
                }
                break;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size3, size4);
                tc1 tc1Var = (tc1) this.h0;
                if (tc1Var.e0.getVisibility() != 8 && Q() < org.telegram.messenger.i0.L(20.0f)) {
                    size4 -= org.telegram.messenger.i0.L(230.0f);
                }
                ((uc1) this.g0).measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                tc1Var.e0.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(230.0f), TLObject.FLAG_30));
                break;
        }
    }
}
