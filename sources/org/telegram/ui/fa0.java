package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fa0 extends RelativeLayout {
    public i0.c a;
    public boolean b;
    public final /* synthetic */ LaunchActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa0(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.c = launchActivity;
        this.a = i0.c.e;
        zt ztVar = new zt(this, 15);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(this, ztVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.c.n0;
        if (actionBarLayout != null) {
            actionBarLayout.N(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        boolean z11 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.c;
        if (z11 || (AndroidUtilities.isSmallTablet() && getResources().getConfiguration().orientation != 2)) {
            launchActivity.m0.getView().layout(0, 0, launchActivity.m0.getView().getMeasuredWidth(), launchActivity.m0.getView().getMeasuredHeight());
        } else {
            i0.c cVar = this.a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(measuredWidth, cVar.a, cVar.c);
            launchActivity.m0.getView().layout(0, 0, launchActivity.m0.getView().getMeasuredWidth(), launchActivity.m0.getView().getMeasuredHeight());
            launchActivity.o0.getView().layout(tabletLeftFragmentSize, 0, launchActivity.o0.getView().getMeasuredWidth() + tabletLeftFragmentSize, launchActivity.o0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.n0.getView().getMeasuredWidth()) / 2;
        int dp = AndroidUtilities.dp(8.0f) + this.a.b;
        launchActivity.n0.getView().layout(measuredWidth2, dp, launchActivity.n0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.n0.getView().getMeasuredHeight() + dp);
        org.telegram.ui.Components.d51 d51Var = launchActivity.r0;
        d51Var.layout(0, 0, d51Var.getMeasuredWidth(), launchActivity.r0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.q0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.q0.getMeasuredHeight());
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.b = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        boolean z10 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.c;
        if (z10 || (AndroidUtilities.isSmallTablet() && getResources().getConfiguration().orientation != 2)) {
            launchActivity.K0 = true;
            launchActivity.m0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        } else {
            launchActivity.K0 = false;
            i0.c cVar = this.a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(size, cVar.a, cVar.c);
            launchActivity.m0.getView().measure(View.MeasureSpec.makeMeasureSpec(tabletLeftFragmentSize, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            launchActivity.o0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - tabletLeftFragmentSize, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        launchActivity.r0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        launchActivity.q0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        ViewGroup view = launchActivity.n0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(500.0f), size - AndroidUtilities.dp(16.0f)), TLObject.FLAG_30);
        i0.c cVar2 = this.a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - cVar2.b) - cVar2.d) - AndroidUtilities.dp(16.0f), TLObject.FLAG_30));
        this.b = false;
    }

    @Override // android.widget.RelativeLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.b) {
            return;
        }
        super.requestLayout();
    }
}
