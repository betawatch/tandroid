package nh;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class f3 extends m8 {
    public final /* synthetic */ i9 E;
    public final /* synthetic */ d4 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(d4 d4Var, Context context, i3 i3Var, org.telegram.ui.ActionBar.f6 f6Var, i9 i9Var) {
        super(context, i3Var, f6Var);
        this.F = d4Var;
        this.E = i9Var;
    }

    @Override // nh.m8
    public final void b(boolean z4) {
        x3 x3Var = this.F.N1;
        if (x3Var != null) {
            i9 i9Var = ((z8) x3Var).d;
            i9Var.f1 = z4;
            i9Var.P();
        }
    }

    @Override // nh.m8
    public final Bitmap getPlayingBitmap() {
        return this.F.getPlayingBitmap();
    }
}
