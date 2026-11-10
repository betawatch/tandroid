package di;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class t9 extends tg.m0 {
    public final /* synthetic */ u9 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(u9 u9Var, Context context, float f10) {
        super(context, f10);
        this.Q = u9Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.Q.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
