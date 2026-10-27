package li;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class o5 extends ViewGroup {
    public final int a;
    public final /* synthetic */ p5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(p5 p5Var, Context context) {
        super(context);
        this.b = p5Var;
        this.a = AndroidUtilities.dp(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        p5 p5Var = this.b;
        int measuredWidth = p5Var.v.getMeasuredWidth();
        int measuredHeight = p5Var.v.getMeasuredHeight();
        r5 r5Var = p5Var.v;
        int i14 = this.a;
        r5Var.layout(-i14, 0, measuredWidth - i14, measuredHeight);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.a;
        int max = Math.max(0, size + i12);
        p5 p5Var = this.b;
        p5Var.v.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), i11);
        int measuredWidth = p5Var.v.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i12), p5Var.v.getMeasuredHeight());
    }
}
