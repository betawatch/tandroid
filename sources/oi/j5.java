package oi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class j5 extends ViewGroup {
    public final int a;
    public final /* synthetic */ k5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(k5 k5Var, Context context) {
        super(context);
        this.b = k5Var;
        this.a = org.telegram.messenger.g0.L(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        k5 k5Var = this.b;
        int measuredWidth = k5Var.w.getMeasuredWidth();
        int measuredHeight = k5Var.w.getMeasuredHeight();
        m5 m5Var = k5Var.w;
        int i13 = this.a;
        m5Var.layout(-i13, 0, measuredWidth - i13, measuredHeight);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int i11 = this.a;
        int max = Math.max(0, size + i11);
        k5 k5Var = this.b;
        k5Var.w.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), i10);
        int measuredWidth = k5Var.w.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i11), k5Var.w.getMeasuredHeight());
    }
}
