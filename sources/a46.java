// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class a46 extends ok8 {
    public final /* synthetic */ l46 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a46(l46 l46Var, Context context, vnb vnbVar) {
        super(vnbVar, context, true);
        this.S = l46Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.S.a2) {
            return;
        }
        super.invalidate();
    }
}
