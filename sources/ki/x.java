package ki;

import org.telegram.ui.ActionBar.p4;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
