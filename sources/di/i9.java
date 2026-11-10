package di;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i9 extends x {
    public final /* synthetic */ q9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(Context context, q9 q9Var) {
        super(context);
        this.a = q9Var;
    }

    @Override // di.x, android.view.View
    public final void invalidate() {
        super.invalidate();
        i4 i4Var = this.a.F0;
        if (i4Var != null) {
            i4Var.b();
        }
    }
}
