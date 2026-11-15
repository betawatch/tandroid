package fi;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a9 extends x {
    public final /* synthetic */ i9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(Context context, i9 i9Var) {
        super(context);
        this.a = i9Var;
    }

    @Override // fi.x, android.view.View
    public final void invalidate() {
        super.invalidate();
        a4 a4Var = this.a.G0;
        if (a4Var != null) {
            a4Var.b();
        }
    }
}
