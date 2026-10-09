package ai;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class nc extends qg.s0 {
    public final /* synthetic */ oc Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(oc ocVar, Context context, float f7) {
        super(context, f7);
        this.Q = ocVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.Q.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
