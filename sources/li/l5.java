package li;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class l5 extends ViewGroup {
    public final int a;
    public final /* synthetic */ m5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(m5 m5Var, Context context) {
        super(context);
        this.b = m5Var;
        this.a = org.telegram.messenger.g0.L(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        m5 m5Var = this.b;
        int measuredWidth = m5Var.w.getMeasuredWidth();
        int measuredHeight = m5Var.w.getMeasuredHeight();
        o5 o5Var = m5Var.w;
        int i13 = this.a;
        o5Var.layout(-i13, 0, measuredWidth - i13, measuredHeight);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int i11 = this.a;
        int max = Math.max(0, size + i11);
        m5 m5Var = this.b;
        m5Var.w.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), i10);
        int measuredWidth = m5Var.w.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i11), m5Var.w.getMeasuredHeight());
    }
}
