// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class dcb extends ui5 {
    public final /* synthetic */ lcb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcb(lcb lcbVar, Context context) {
        super(context);
        this.a = lcbVar;
    }

    @Override // ui5, android.view.View
    public final void invalidate() {
        super.invalidate();
        d30 d30Var = this.a.G0;
        if (d30Var != null) {
            d30Var.m();
        }
    }
}
