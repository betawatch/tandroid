package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g80 extends RelativeLayout {
    public i0.b a;
    public boolean b;
    public final /* synthetic */ LaunchActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g80(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.c = launchActivity;
        this.a = i0.b.e;
        ur urVar = new ur(this, 17);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(this, urVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.c.s0;
        if (actionBarLayout != null) {
            actionBarLayout.Q(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        LaunchActivity launchActivity = this.c;
        if (launchActivity.P0) {
            launchActivity.r0.getView().layout(0, 0, launchActivity.r0.getView().getMeasuredWidth(), launchActivity.r0.getView().getMeasuredHeight());
        } else {
            i0.b bVar = this.a;
            int l12 = org.telegram.messenger.g0.l1(measuredWidth, bVar.a, bVar.c);
            launchActivity.r0.getView().layout(0, 0, launchActivity.r0.getView().getMeasuredWidth(), launchActivity.r0.getView().getMeasuredHeight());
            launchActivity.t0.getView().layout(l12, 0, launchActivity.t0.getView().getMeasuredWidth() + l12, launchActivity.t0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.s0.getView().getMeasuredWidth()) / 2;
        int L = org.telegram.messenger.g0.L(8.0f) + this.a.b;
        launchActivity.s0.getView().layout(measuredWidth2, L, launchActivity.s0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.s0.getView().getMeasuredHeight() + L);
        ai.h5 h5Var = launchActivity.w0;
        h5Var.layout(0, 0, h5Var.getMeasuredWidth(), launchActivity.w0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.v0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.v0.getMeasuredHeight());
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        this.b = true;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        String str = LaunchActivity.E1;
        boolean z10 = org.telegram.messenger.g0.E;
        LaunchActivity launchActivity = this.c;
        if ((!z10 && (!org.telegram.messenger.g0.P1() || launchActivity.getResources().getConfiguration().orientation == 2)) == launchActivity.P0 && !launchActivity.Q0) {
            launchActivity.Q0 = true;
            org.telegram.messenger.g0.h3(new fz(this, 16));
        }
        if (launchActivity.P0) {
            launchActivity.r0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        } else {
            i0.b bVar = this.a;
            int l12 = org.telegram.messenger.g0.l1(size, bVar.a, bVar.c);
            launchActivity.r0.getView().measure(View.MeasureSpec.makeMeasureSpec(l12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            launchActivity.t0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - l12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        launchActivity.w0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        launchActivity.v0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        ViewGroup view = launchActivity.s0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(500.0f), size - org.telegram.messenger.g0.L(16.0f)), TLObject.FLAG_30);
        i0.b bVar2 = this.a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.b) - bVar2.d) - org.telegram.messenger.g0.L(16.0f), TLObject.FLAG_30));
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
