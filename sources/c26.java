// default package

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class c26 extends RelativeLayout {
    public mq5 a;
    public boolean b;
    public final /* synthetic */ LaunchActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c26(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.c = launchActivity;
        this.a = mq5.e;
        e05 e05Var = new e05((Object) this, (byte) 24);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(this, e05Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.c.q0;
        if (actionBarLayout != null) {
            actionBarLayout.P(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        LaunchActivity launchActivity = this.c;
        if (launchActivity.N0) {
            launchActivity.p0.getView().layout(0, 0, launchActivity.p0.getView().getMeasuredWidth(), launchActivity.p0.getView().getMeasuredHeight());
        } else {
            mq5 mq5Var = this.a;
            int k1 = hl.k1(measuredWidth, mq5Var.a, mq5Var.c);
            launchActivity.p0.getView().layout(0, 0, launchActivity.p0.getView().getMeasuredWidth(), launchActivity.p0.getView().getMeasuredHeight());
            launchActivity.r0.getView().layout(k1, 0, launchActivity.r0.getView().getMeasuredWidth() + k1, launchActivity.r0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.q0.getView().getMeasuredWidth()) / 2;
        int L = hl.L(8.0f) + this.a.b;
        launchActivity.q0.getView().layout(measuredWidth2, L, launchActivity.q0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.q0.getView().getMeasuredHeight() + L);
        w81 w81Var = launchActivity.u0;
        w81Var.layout(0, 0, w81Var.getMeasuredWidth(), launchActivity.u0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.t0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.t0.getMeasuredHeight());
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.b = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        String str = LaunchActivity.C1;
        boolean z = hl.E;
        LaunchActivity launchActivity = this.c;
        if ((!z && (!hl.N1() || launchActivity.getResources().getConfiguration().orientation == 2)) == launchActivity.N0 && !launchActivity.O0) {
            launchActivity.O0 = true;
            hl.c3(new ea5(this, (byte) 24));
        }
        if (launchActivity.N0) {
            launchActivity.p0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        } else {
            mq5 mq5Var = this.a;
            int k1 = hl.k1(size, mq5Var.a, mq5Var.c);
            launchActivity.p0.getView().measure(View.MeasureSpec.makeMeasureSpec(k1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            launchActivity.r0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - k1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        launchActivity.u0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        launchActivity.t0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        ViewGroup view = launchActivity.q0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(500.0f), size - hl.L(16.0f)), TLObject.FLAG_30);
        mq5 mq5Var2 = this.a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - mq5Var2.b) - mq5Var2.d) - hl.L(16.0f), TLObject.FLAG_30));
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
