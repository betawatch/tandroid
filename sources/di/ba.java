package di;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class ba extends sg.s0 {
    public final /* synthetic */ ca Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(ca caVar, Context context, float f7) {
        super(context, f7);
        this.Q = caVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.Q.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
