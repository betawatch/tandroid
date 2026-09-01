package oh;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class a9 extends v {
    public final /* synthetic */ i9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(Context context, i9 i9Var) {
        super(context);
        this.a = i9Var;
    }

    @Override // oh.v, android.view.View
    public final void invalidate() {
        super.invalidate();
        e4 e4Var = this.a.D0;
        if (e4Var != null) {
            e4Var.a();
        }
    }
}
