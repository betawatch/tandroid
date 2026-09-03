package oh;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class a9 extends v {
    public final /* synthetic */ i9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(Context context, i9 i9Var) {
        super(context);
        this.a = i9Var;
    }

    @Override // oh.v, android.view.View
    public final void invalidate() {
        super.invalidate();
        e4 e4Var = this.a.D0;
        if (e4Var != null) {
            e4Var.a();
        }
    }
}
