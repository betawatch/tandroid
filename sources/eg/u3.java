package eg;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
