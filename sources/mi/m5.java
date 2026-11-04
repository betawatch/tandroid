package mi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class m5 extends ViewGroup {
    public final int a;
    public final /* synthetic */ n5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(n5 n5Var, Context context) {
        super(context);
        this.b = n5Var;
        this.a = org.telegram.messenger.g0.L(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        n5 n5Var = this.b;
        int measuredWidth = n5Var.w.getMeasuredWidth();
        int measuredHeight = n5Var.w.getMeasuredHeight();
        p5 p5Var = n5Var.w;
        int i13 = this.a;
        p5Var.layout(-i13, 0, measuredWidth - i13, measuredHeight);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int i11 = this.a;
        int max = Math.max(0, size + i11);
        n5 n5Var = this.b;
        n5Var.w.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), i10);
        int measuredWidth = n5Var.w.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i11), n5Var.w.getMeasuredHeight());
    }
}
