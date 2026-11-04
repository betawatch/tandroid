package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ei0 extends org.telegram.ui.Components.qt0 {
    public final /* synthetic */ int g0;
    public final /* synthetic */ FrameLayout h0;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ei0(org.telegram.ui.ActionBar.d2 d2Var, Context context, FrameLayout frameLayout, int i3) {
        super(context, null);
        this.g0 = i3;
        this.i0 = d2Var;
        this.h0 = frameLayout;
    }

    @Override // org.telegram.ui.Components.qt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int measuredHeight;
        org.telegram.ui.ActionBar.y4 y4Var;
        int measuredHeight2;
        switch (this.g0) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.i0;
                int visibility = passcodeActivity.w.getVisibility();
                FrameLayout frameLayout = this.h0;
                if (visibility == 8 || Q() < org.telegram.messenger.g0.L(20.0f)) {
                    if (passcodeActivity.w.getVisibility() != 8) {
                        int measuredWidth = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(230.0f);
                        frameLayout.layout(0, 0, measuredWidth, measuredHeight);
                    } else {
                        int measuredWidth2 = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight();
                        frameLayout.layout(0, 0, measuredWidth2, measuredHeight);
                    }
                } else if (passcodeActivity.q0()) {
                    int measuredWidth3 = getMeasuredWidth();
                    measuredHeight = Q() + (getMeasuredHeight() - org.telegram.messenger.g0.L(230.0f));
                    frameLayout.layout(0, 0, measuredWidth3, measuredHeight);
                } else {
                    int measuredWidth4 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight();
                    frameLayout.layout(0, 0, measuredWidth4, measuredHeight);
                }
                y4Var = ((org.telegram.ui.ActionBar.d2) passcodeActivity).simpleActionBar;
                View view = y4Var != null ? ((org.telegram.ui.ActionBar.d2) passcodeActivity).simpleActionBar : ((org.telegram.ui.ActionBar.d2) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                passcodeActivity.w.layout(0, measuredHeight, getMeasuredWidth(), org.telegram.messenger.g0.L(230.0f) + measuredHeight);
                R();
                break;
            default:
                l0 l0Var = (l0) this.h0;
                ra1 ra1Var = (ra1) this.i0;
                if (ra1Var.f0.getVisibility() == 8 || Q() < org.telegram.messenger.g0.L(20.0f)) {
                    if (ra1Var.f0.getVisibility() != 8) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.g0.L(230.0f);
                        l0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        l0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (ra1Var.A0()) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = Q() + (getMeasuredHeight() - org.telegram.messenger.g0.L(230.0f));
                    l0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    l0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                ra1Var.f0.layout(0, measuredHeight2, getMeasuredWidth(), org.telegram.messenger.g0.L(230.0f) + measuredHeight2);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        org.telegram.ui.ActionBar.y4 y4Var;
        switch (this.g0) {
            case 0:
                int size = View.MeasureSpec.getSize(i3);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.i0;
                this.h0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((passcodeActivity.w.getVisibility() == 8 || Q() >= org.telegram.messenger.g0.L(20.0f)) ? size2 : size2 - org.telegram.messenger.g0.L(230.0f), TLObject.FLAG_30));
                passcodeActivity.w.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(230.0f), TLObject.FLAG_30));
                y4Var = ((org.telegram.ui.ActionBar.d2) passcodeActivity).simpleActionBar;
                View view = y4Var != null ? ((org.telegram.ui.ActionBar.d2) passcodeActivity).simpleActionBar : ((org.telegram.ui.ActionBar.d2) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    break;
                }
                break;
            default:
                int size3 = View.MeasureSpec.getSize(i3);
                int size4 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size3, size4);
                ra1 ra1Var = (ra1) this.i0;
                if (ra1Var.f0.getVisibility() != 8 && Q() < org.telegram.messenger.g0.L(20.0f)) {
                    size4 -= org.telegram.messenger.g0.L(230.0f);
                }
                ((l0) this.h0).measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                ra1Var.f0.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(230.0f), TLObject.FLAG_30));
                break;
        }
    }
}
