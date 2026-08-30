package eg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.nq;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class s2 extends nq {
    public final /* synthetic */ u2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(u2 u2Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.y = u2Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        u2 u2Var = this.y;
        if (u2Var.d) {
            super.setBounds(i10, (int) (i11 - u2Var.J), i12, i13);
        } else {
            super.setBounds(i10, i11, i12, (int) (i13 + u2Var.J));
        }
    }
}
