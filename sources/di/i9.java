package di;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
