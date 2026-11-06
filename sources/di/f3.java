package di;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class f3 extends t8 {
    public final /* synthetic */ p9 H;
    public final /* synthetic */ i4 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(i4 i4Var, Context context, j3 j3Var, org.telegram.ui.ActionBar.f6 f6Var, p9 p9Var) {
        super(context, j3Var, f6Var);
        this.I = i4Var;
        this.H = p9Var;
    }

    @Override // di.t8
    public final void b(boolean z9) {
        b4 b4Var = this.I.z1;
        if (b4Var != null) {
            p9 p9Var = ((g9) b4Var).d;
            p9Var.h1 = z9;
            p9Var.V();
        }
    }

    @Override // di.t8
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
