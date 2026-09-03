package fg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.pq;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class r2 extends pq {
    public final /* synthetic */ t2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(t2 t2Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.y = t2Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        t2 t2Var = this.y;
        if (t2Var.d) {
            super.setBounds(i10, (int) (i11 - t2Var.J), i12, i13);
        } else {
            super.setBounds(i10, i11, i12, (int) (i13 + t2Var.J));
        }
    }
}
