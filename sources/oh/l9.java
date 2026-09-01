package oh;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class l9 extends eg.j1 {
    public final /* synthetic */ m9 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(m9 m9Var, Context context, float f10) {
        super(context, f10);
        this.N = m9Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.N.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
