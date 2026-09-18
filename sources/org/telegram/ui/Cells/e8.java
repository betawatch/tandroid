package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class e8 extends ImageReceiver {
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 a;
    public final /* synthetic */ f8 b;

    public e8(f8 f8Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.b = f8Var;
        this.a = e6Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable instanceof BitmapDrawable) {
            f8 f8Var = this.b;
            if (f8Var.K == 0) {
                f8Var.K = AndroidUtilities.getDominantColor(((BitmapDrawable) drawable).getBitmap());
                int i12 = f8Var.K;
                if (i12 == -1 || i12 == 0) {
                    f8Var.K = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q5, this.a);
                }
                f8Var.J.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), f8Var.K));
                invalidate();
            }
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
