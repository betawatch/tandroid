package cg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.jq;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u2 extends jq {
    public final /* synthetic */ w2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(w2 w2Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.y = w2Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        w2 w2Var = this.y;
        if (w2Var.d) {
            super.setBounds(i10, (int) (i11 - w2Var.I), i12, i13);
        } else {
            super.setBounds(i10, i11, i12, (int) (i13 + w2Var.I));
        }
    }
}
