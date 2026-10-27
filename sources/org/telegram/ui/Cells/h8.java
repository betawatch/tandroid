package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class h8 extends ImageReceiver {
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 a;
    public final /* synthetic */ i8 b;

    public h8(i8 i8Var, org.telegram.ui.ActionBar.u6 u6Var) {
        this.b = i8Var;
        this.a = u6Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable instanceof BitmapDrawable) {
            i8 i8Var = this.b;
            if (i8Var.K == 0) {
                i8Var.K = AndroidUtilities.getDominantColor(((BitmapDrawable) drawable).getBitmap());
                int i12 = i8Var.K;
                if (i12 == -1 || i12 == 0) {
                    int i13 = org.telegram.ui.ActionBar.y6.q5;
                    org.telegram.ui.ActionBar.u6 u6Var = this.a;
                    i8Var.K = org.telegram.ui.ActionBar.y6.w0(i13, u6Var);
                    org.telegram.ui.ActionBar.f7.C(i8Var.J, org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(12.0f), i8Var.K), org.telegram.ui.ActionBar.f7.N(i13), u6Var);
                } else {
                    i8Var.J.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(12.0f), i8Var.K));
                }
                invalidate();
            }
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
