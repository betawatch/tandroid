// default package

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ni1 extends b38 {
    public final /* synthetic */ oi1 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni1(oi1 oi1Var, Context context, int i, long j, ylb ylbVar) {
        super(i, j, ylbVar, context);
        this.H = oi1Var;
    }

    @Override // b38
    public final void b(int i, boolean z) {
        super.b(i, z);
        oi1 oi1Var = this.H;
        TextView textView = oi1Var.d;
        if (textView != null) {
            textView.setTextColor(oi1Var.b.h.getTextColor());
        }
    }
}
