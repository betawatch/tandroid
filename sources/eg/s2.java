package eg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.mq;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s2 extends mq {
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
