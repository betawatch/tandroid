package di;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class f3 extends u8 {
    public final /* synthetic */ q9 H;
    public final /* synthetic */ j4 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(j4 j4Var, Context context, j3 j3Var, org.telegram.ui.ActionBar.h6 h6Var, q9 q9Var) {
        super(context, j3Var, h6Var);
        this.I = j4Var;
        this.H = q9Var;
    }

    @Override // di.u8
    public final void b(boolean z9) {
        c4 c4Var = this.I.z1;
        if (c4Var != null) {
            q9 q9Var = ((h9) c4Var).d;
            q9Var.h1 = z9;
            q9Var.V();
        }
    }

    @Override // di.u8
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
