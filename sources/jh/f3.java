package jh;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class f3 extends m8 {
    public final /* synthetic */ i9 D;
    public final /* synthetic */ e4 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(e4 e4Var, Context context, j3 j3Var, org.telegram.ui.ActionBar.c6 c6Var, i9 i9Var) {
        super(context, j3Var, c6Var);
        this.E = e4Var;
        this.D = i9Var;
    }

    @Override // jh.m8
    public final void b(boolean z10) {
        y3 y3Var = this.E.M1;
        if (y3Var != null) {
            i9 i9Var = ((z8) y3Var).d;
            i9Var.e1 = z10;
            i9Var.P();
        }
    }

    @Override // jh.m8
    public final Bitmap getPlayingBitmap() {
        return this.E.getPlayingBitmap();
    }
}
