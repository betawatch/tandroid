package bi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class y5 extends ViewGroup {
    public final int a;
    public final /* synthetic */ z5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(z5 z5Var, Context context) {
        super(context);
        this.b = z5Var;
        this.a = org.telegram.messenger.i0.L(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        z5 z5Var = this.b;
        int measuredWidth = z5Var.w.getMeasuredWidth();
        int measuredHeight = z5Var.w.getMeasuredHeight();
        b6 b6Var = z5Var.w;
        int i14 = this.a;
        b6Var.layout(-i14, 0, measuredWidth - i14, measuredHeight);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.a;
        int max = Math.max(0, size + i12);
        z5 z5Var = this.b;
        z5Var.w.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), i11);
        int measuredWidth = z5Var.w.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i12), z5Var.w.getMeasuredHeight());
    }
}
