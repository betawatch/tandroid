package ki;

import org.telegram.ui.ActionBar.p4;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class x extends p4 {
    public final /* synthetic */ a0 p;

    public x(a0 a0Var) {
        this.p = a0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.p.invalidate();
    }
}
