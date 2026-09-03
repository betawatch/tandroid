package nh;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class l9 extends dg.l1 {
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
