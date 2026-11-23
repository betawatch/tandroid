package fi;

import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class x8 extends x {
    public final /* synthetic */ f9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(Context context, f9 f9Var) {
        super(context);
        this.a = f9Var;
    }

    @Override // fi.x, android.view.View
    public final void invalidate() {
        super.invalidate();
        y3 y3Var = this.a.G0;
        if (y3Var != null) {
            y3Var.b();
        }
    }
}
