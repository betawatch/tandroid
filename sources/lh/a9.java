package lh;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class a9 extends v {
    public final /* synthetic */ i9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(Context context, i9 i9Var) {
        super(context);
        this.a = i9Var;
    }

    @Override // lh.v, android.view.View
    public final void invalidate() {
        super.invalidate();
        c4 c4Var = this.a.C0;
        if (c4Var != null) {
            c4Var.a();
        }
    }
}
