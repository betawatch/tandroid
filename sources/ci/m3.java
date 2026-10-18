package ci;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class m3 extends d9 {
    public final /* synthetic */ z9 H;
    public final /* synthetic */ p4 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(p4 p4Var, Context context, q3 q3Var, org.telegram.ui.ActionBar.d6 d6Var, z9 z9Var) {
        super(context, q3Var, d6Var);
        this.I = p4Var;
        this.H = z9Var;
    }

    @Override // ci.d9
    public final void b(boolean z10) {
        i4 i4Var = this.I.Q1;
        if (i4Var != null) {
            z9 z9Var = ((q9) i4Var).d;
            z9Var.i1 = z10;
            z9Var.P();
        }
    }

    @Override // ci.d9
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
