package di;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class h9 extends x {
    public final /* synthetic */ p9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(Context context, p9 p9Var) {
        super(context);
        this.a = p9Var;
    }

    @Override // di.x, android.view.View
    public final void invalidate() {
        super.invalidate();
        h4 h4Var = this.a.F0;
        if (h4Var != null) {
            h4Var.b();
        }
    }
}
