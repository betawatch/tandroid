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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class na0 extends RelativeLayout {
    public i0.b a;
    public boolean b;
    public final /* synthetic */ LaunchActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na0(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.c = launchActivity;
        this.a = i0.b.e;
        gu guVar = new gu(this, 15);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(this, guVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.c.o0;
        if (actionBarLayout != null) {
            actionBarLayout.N(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        boolean z10 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.c;
        if (z10 || (AndroidUtilities.isSmallTablet() && getResources().getConfiguration().orientation != 2)) {
            launchActivity.n0.getView().layout(0, 0, launchActivity.n0.getView().getMeasuredWidth(), launchActivity.n0.getView().getMeasuredHeight());
        } else {
            i0.b bVar = this.a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(measuredWidth, bVar.a, bVar.c);
            launchActivity.n0.getView().layout(0, 0, launchActivity.n0.getView().getMeasuredWidth(), launchActivity.n0.getView().getMeasuredHeight());
            launchActivity.p0.getView().layout(tabletLeftFragmentSize, 0, launchActivity.p0.getView().getMeasuredWidth() + tabletLeftFragmentSize, launchActivity.p0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.o0.getView().getMeasuredWidth()) / 2;
        int dp = AndroidUtilities.dp(8.0f) + this.a.b;
        launchActivity.o0.getView().layout(measuredWidth2, dp, launchActivity.o0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.o0.getView().getMeasuredHeight() + dp);
        org.telegram.ui.Components.z51 z51Var = launchActivity.s0;
        z51Var.layout(0, 0, z51Var.getMeasuredWidth(), launchActivity.s0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.r0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.r0.getMeasuredHeight());
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.b = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        boolean z4 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.c;
        if (z4 || (AndroidUtilities.isSmallTablet() && getResources().getConfiguration().orientation != 2)) {
            launchActivity.L0 = true;
            launchActivity.n0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        } else {
            launchActivity.L0 = false;
            i0.b bVar = this.a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(size, bVar.a, bVar.c);
            launchActivity.n0.getView().measure(View.MeasureSpec.makeMeasureSpec(tabletLeftFragmentSize, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            launchActivity.p0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - tabletLeftFragmentSize, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        launchActivity.s0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        launchActivity.r0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        ViewGroup view = launchActivity.o0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(500.0f), size - AndroidUtilities.dp(16.0f)), TLObject.FLAG_30);
        i0.b bVar2 = this.a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(16.0f), TLObject.FLAG_30));
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
