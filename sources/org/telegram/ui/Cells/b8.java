package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class b8 extends ImageReceiver {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 a;
    public final /* synthetic */ c8 b;

    public b8(c8 c8Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.b = c8Var;
        this.a = f6Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z4, int i11) {
        if (drawable instanceof BitmapDrawable) {
            c8 c8Var = this.b;
            if (c8Var.H == 0) {
                c8Var.H = AndroidUtilities.getDominantColor(((BitmapDrawable) drawable).getBitmap());
                int i12 = c8Var.H;
                if (i12 == -1 || i12 == 0) {
                    c8Var.H = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q5, this.a);
                }
                c8Var.G.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), c8Var.H));
                invalidate();
            }
        }
        return super.setImageBitmapByKey(drawable, str, i10, z4, i11);
    }
}
