package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class d8 extends ImageReceiver {
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 a;
    public final /* synthetic */ e8 b;

    public d8(e8 e8Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.b = e8Var;
        this.a = g6Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable instanceof BitmapDrawable) {
            e8 e8Var = this.b;
            if (e8Var.K == 0) {
                e8Var.K = AndroidUtilities.getDominantColor(((BitmapDrawable) drawable).getBitmap());
                int i12 = e8Var.K;
                if (i12 == -1 || i12 == 0) {
                    int i13 = org.telegram.ui.ActionBar.k6.q5;
                    org.telegram.ui.ActionBar.g6 g6Var = this.a;
                    e8Var.K = org.telegram.ui.ActionBar.k6.w0(i13, g6Var);
                    org.telegram.ui.ActionBar.r6.D(e8Var.J, org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(12.0f), e8Var.K), org.telegram.ui.ActionBar.r6.O(i13), g6Var);
                } else {
                    e8Var.J.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(12.0f), e8Var.K));
                }
                invalidate();
            }
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
