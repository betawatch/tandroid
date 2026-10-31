package ag;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.m5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c1 extends s4.b0 {
    public final /* synthetic */ d1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d1 d1Var, Context context) {
        super(context);
        this.r = d1Var;
    }

    @Override // s4.b0
    public final int k(int i10, View view) {
        return m5.B(8.0f, ((h1) this.r.V).s.getPaddingTop() - org.telegram.messenger.i0.m, super.k(i10, view));
    }

    @Override // s4.b0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
