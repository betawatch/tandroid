package nh;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class a9 extends w {
    public final /* synthetic */ i9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(Context context, i9 i9Var) {
        super(context);
        this.a = i9Var;
    }

    @Override // nh.w, android.view.View
    public final void invalidate() {
        super.invalidate();
        c4 c4Var = this.a.D0;
        if (c4Var != null) {
            c4Var.a();
        }
    }
}
