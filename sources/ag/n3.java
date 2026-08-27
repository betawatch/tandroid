package ag;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.dq;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class n3 extends dq {
    public final /* synthetic */ p3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(p3 p3Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.y = p3Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        p3 p3Var = this.y;
        if (p3Var.d) {
            super.setBounds(i10, (int) (i11 - p3Var.I), i12, i13);
        } else {
            super.setBounds(i10, i11, i12, (int) (i13 + p3Var.I));
        }
    }
}
