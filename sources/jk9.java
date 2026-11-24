// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class jk9 extends ViewGroup {
    public final int a;
    public final /* synthetic */ kk9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk9(kk9 kk9Var, Context context) {
        super(context);
        this.b = kk9Var;
        this.a = gm.L(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mk9 mk9Var = this.b.w;
        int measuredWidth = mk9Var.getMeasuredWidth();
        int measuredHeight = mk9Var.getMeasuredHeight();
        int i5 = this.a;
        mk9Var.layout(-i5, 0, measuredWidth - i5, measuredHeight);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.a;
        int max = Math.max(0, size + i3);
        mk9 mk9Var = this.b.w;
        mk9Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), i2);
        int measuredWidth = mk9Var.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i3), mk9Var.getMeasuredHeight());
    }
}
