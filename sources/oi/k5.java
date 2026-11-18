package oi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class k5 extends ViewGroup {
    public final int a;
    public final /* synthetic */ l5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(l5 l5Var, Context context) {
        super(context);
        this.b = l5Var;
        this.a = org.telegram.messenger.g0.L(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        l5 l5Var = this.b;
        int measuredWidth = l5Var.w.getMeasuredWidth();
        int measuredHeight = l5Var.w.getMeasuredHeight();
        n5 n5Var = l5Var.w;
        int i13 = this.a;
        n5Var.layout(-i13, 0, measuredWidth - i13, measuredHeight);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int i11 = this.a;
        int max = Math.max(0, size + i11);
        l5 l5Var = this.b;
        l5Var.w.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), i10);
        int measuredWidth = l5Var.w.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i11), l5Var.w.getMeasuredHeight());
    }
}
