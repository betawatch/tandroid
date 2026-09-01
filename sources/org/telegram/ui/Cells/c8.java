package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class c8 extends ImageReceiver {
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 a;
    public final /* synthetic */ d8 b;

    public c8(d8 d8Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.b = d8Var;
        this.a = g6Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z4, int i11) {
        if (drawable instanceof BitmapDrawable) {
            d8 d8Var = this.b;
            if (d8Var.H == 0) {
                d8Var.H = AndroidUtilities.getDominantColor(((BitmapDrawable) drawable).getBitmap());
                int i12 = d8Var.H;
                if (i12 == -1 || i12 == 0) {
                    d8Var.H = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.q5, this.a);
                }
                d8Var.G.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(12.0f), d8Var.H));
                invalidate();
            }
        }
        return super.setImageBitmapByKey(drawable, str, i10, z4, i11);
    }
}
