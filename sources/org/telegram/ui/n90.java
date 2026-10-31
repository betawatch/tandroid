package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n90 extends RelativeLayout {
    public i0.c a;
    public boolean b;
    public final /* synthetic */ LaunchActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n90(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.c = launchActivity;
        this.a = i0.c.e;
        tt ttVar = new tt(this, 16);
        WeakHashMap weakHashMap = r0.h0.a;
        r0.z.i(this, ttVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.c.r0;
        if (actionBarLayout != null) {
            actionBarLayout.P(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        LaunchActivity launchActivity = this.c;
        if (launchActivity.O0) {
            launchActivity.q0.getView().layout(0, 0, launchActivity.q0.getView().getMeasuredWidth(), launchActivity.q0.getView().getMeasuredHeight());
        } else {
            i0.c cVar = this.a;
            int l1 = org.telegram.messenger.i0.l1(measuredWidth, cVar.a, cVar.c);
            launchActivity.q0.getView().layout(0, 0, launchActivity.q0.getView().getMeasuredWidth(), launchActivity.q0.getView().getMeasuredHeight());
            launchActivity.s0.getView().layout(l1, 0, launchActivity.s0.getView().getMeasuredWidth() + l1, launchActivity.s0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.r0.getView().getMeasuredWidth()) / 2;
        int L = org.telegram.messenger.i0.L(8.0f) + this.a.b;
        launchActivity.r0.getView().layout(measuredWidth2, L, launchActivity.r0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.r0.getView().getMeasuredHeight() + L);
        w8 w8Var = launchActivity.v0;
        w8Var.layout(0, 0, w8Var.getMeasuredWidth(), launchActivity.v0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.u0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.u0.getMeasuredHeight());
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.b = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        Pattern pattern = LaunchActivity.D1;
        boolean z10 = org.telegram.messenger.i0.E;
        LaunchActivity launchActivity = this.c;
        if ((!z10 && (!org.telegram.messenger.i0.P1() || launchActivity.getResources().getConfiguration().orientation == 2)) == launchActivity.O0 && !launchActivity.P0) {
            launchActivity.P0 = true;
            org.telegram.messenger.i0.g3(new zy(this, 17));
        }
        if (launchActivity.O0) {
            launchActivity.q0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        } else {
            i0.c cVar = this.a;
            int l1 = org.telegram.messenger.i0.l1(size, cVar.a, cVar.c);
            launchActivity.q0.getView().measure(View.MeasureSpec.makeMeasureSpec(l1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            launchActivity.s0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - l1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        launchActivity.v0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        launchActivity.u0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        ViewGroup view = launchActivity.r0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(500.0f), size - org.telegram.messenger.i0.L(16.0f)), TLObject.FLAG_30);
        i0.c cVar2 = this.a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - cVar2.b) - cVar2.d) - org.telegram.messenger.i0.L(16.0f), TLObject.FLAG_30));
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
