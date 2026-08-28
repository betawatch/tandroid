package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c8 extends ImageReceiver {
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 a;
    public final /* synthetic */ d8 b;

    public c8(d8 d8Var, org.telegram.ui.ActionBar.b6 b6Var) {
        this.b = d8Var;
        this.a = b6Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i9, boolean z10, int i10) {
        if (drawable instanceof BitmapDrawable) {
            d8 d8Var = this.b;
            if (d8Var.G == 0) {
                d8Var.G = AndroidUtilities.getDominantColor(((BitmapDrawable) drawable).getBitmap());
                int i11 = d8Var.G;
                if (i11 == -1 || i11 == 0) {
                    d8Var.G = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q5, this.a);
                }
                d8Var.F.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(12.0f), d8Var.G));
                invalidate();
            }
        }
        return super.setImageBitmapByKey(drawable, str, i9, z10, i10);
    }
}
