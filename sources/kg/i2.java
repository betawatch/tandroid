package kg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.eq;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class i2 extends eq {
    public final /* synthetic */ k2 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(k2 k2Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.D = k2Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        k2 k2Var = this.D;
        if (k2Var.d) {
            super.setBounds(i10, (int) (i11 - k2Var.M), i12, i13);
        } else {
            super.setBounds(i10, i11, i12, (int) (i13 + k2Var.M));
        }
    }
}
