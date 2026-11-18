package fi;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
