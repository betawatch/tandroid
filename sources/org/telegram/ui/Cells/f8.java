package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class f8 extends ImageReceiver {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 a;
    public final /* synthetic */ g8 b;

    public f8(g8 g8Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.b = g8Var;
        this.a = f6Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable instanceof BitmapDrawable) {
            g8 g8Var = this.b;
            if (g8Var.K == 0) {
                g8Var.K = AndroidUtilities.getDominantColor(((BitmapDrawable) drawable).getBitmap());
                int i12 = g8Var.K;
                if (i12 == -1 || i12 == 0) {
                    g8Var.K = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q5, this.a);
                }
                g8Var.J.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), g8Var.K));
                invalidate();
            }
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
