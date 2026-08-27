package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z7 extends ImageReceiver {
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 a;
    public final /* synthetic */ a8 b;

    public z7(a8 a8Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.b = a8Var;
        this.a = c6Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable instanceof BitmapDrawable) {
            a8 a8Var = this.b;
            if (a8Var.G == 0) {
                a8Var.G = AndroidUtilities.getDominantColor(((BitmapDrawable) drawable).getBitmap());
                int i12 = a8Var.G;
                if (i12 == -1 || i12 == 0) {
                    a8Var.G = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q5, this.a);
                }
                a8Var.F.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(12.0f), a8Var.G));
                invalidate();
            }
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
