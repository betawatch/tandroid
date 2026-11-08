package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class gi0 extends org.telegram.ui.Components.rt0 {
    public final /* synthetic */ int f0;
    public final /* synthetic */ FrameLayout g0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gi0(org.telegram.ui.ActionBar.f2 f2Var, Context context, FrameLayout frameLayout, int i7) {
        super(context, null);
        this.f0 = i7;
        this.h0 = f2Var;
        this.g0 = frameLayout;
    }

    @Override // org.telegram.ui.Components.rt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int measuredHeight;
        org.telegram.ui.ActionBar.y4 y4Var;
        int measuredHeight2;
        switch (this.f0) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.h0;
                int visibility = passcodeActivity.w.getVisibility();
                FrameLayout frameLayout = this.g0;
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
                y4Var = ((org.telegram.ui.ActionBar.f2) passcodeActivity).simpleActionBar;
                View view = y4Var != null ? ((org.telegram.ui.ActionBar.f2) passcodeActivity).simpleActionBar : ((org.telegram.ui.ActionBar.f2) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                passcodeActivity.w.layout(0, measuredHeight, getMeasuredWidth(), org.telegram.messenger.g0.L(230.0f) + measuredHeight);
                R();
                break;
            default:
                k0 k0Var = (k0) this.g0;
                za1 za1Var = (za1) this.h0;
                if (za1Var.e0.getVisibility() == 8 || Q() < org.telegram.messenger.g0.L(20.0f)) {
                    if (za1Var.e0.getVisibility() != 8) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.g0.L(230.0f);
                        k0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        k0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (za1Var.A0()) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = Q() + (getMeasuredHeight() - org.telegram.messenger.g0.L(230.0f));
                    k0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    k0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                za1Var.e0.layout(0, measuredHeight2, getMeasuredWidth(), org.telegram.messenger.g0.L(230.0f) + measuredHeight2);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.y4 y4Var;
        switch (this.f0) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.h0;
                this.g0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((passcodeActivity.w.getVisibility() == 8 || Q() >= org.telegram.messenger.g0.L(20.0f)) ? size2 : size2 - org.telegram.messenger.g0.L(230.0f), TLObject.FLAG_30));
                passcodeActivity.w.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(230.0f), TLObject.FLAG_30));
                y4Var = ((org.telegram.ui.ActionBar.f2) passcodeActivity).simpleActionBar;
                View view = y4Var != null ? ((org.telegram.ui.ActionBar.f2) passcodeActivity).simpleActionBar : ((org.telegram.ui.ActionBar.f2) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    break;
                }
                break;
            default:
                int size3 = View.MeasureSpec.getSize(i7);
                int size4 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size3, size4);
                za1 za1Var = (za1) this.h0;
                if (za1Var.e0.getVisibility() != 8 && Q() < org.telegram.messenger.g0.L(20.0f)) {
                    size4 -= org.telegram.messenger.g0.L(230.0f);
                }
                ((k0) this.g0).measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                za1Var.e0.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(230.0f), TLObject.FLAG_30));
                break;
        }
    }
}
