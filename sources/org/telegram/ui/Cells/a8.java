package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a8 extends ImageReceiver {
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 a;
    public final /* synthetic */ b8 b;

    public a8(b8 b8Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.b = b8Var;
        this.a = c6Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable instanceof BitmapDrawable) {
            b8 b8Var = this.b;
            if (b8Var.G == 0) {
                b8Var.G = AndroidUtilities.getDominantColor(((BitmapDrawable) drawable).getBitmap());
                int i12 = b8Var.G;
                if (i12 == -1 || i12 == 0) {
                    b8Var.G = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q5, this.a);
                }
                b8Var.F.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(12.0f), b8Var.G));
                invalidate();
            }
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
