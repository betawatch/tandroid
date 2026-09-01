package eg;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class u3 extends e1 {
    public final /* synthetic */ w3 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(w3 w3Var, Context context, float f10) {
        super(context, f10);
        this.q0 = w3Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        this.q0.d.invalidate();
        super.invalidate();
    }
}
