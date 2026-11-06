package di;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class s9 extends tg.m0 {
    public final /* synthetic */ t9 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(t9 t9Var, Context context, float f10) {
        super(context, f10);
        this.Q = t9Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.Q.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
