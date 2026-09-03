package oh;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
