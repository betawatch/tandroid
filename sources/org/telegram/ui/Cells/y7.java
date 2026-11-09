package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class y7 extends ImageReceiver {
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 J1;
    public final /* synthetic */ z7 K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(z7 z7Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null);
        this.K1 = z7Var;
        this.J1 = g6Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i7, boolean z9, int i10) {
        z7 z7Var = this.K1;
        ImageView imageView = z7Var.J;
        if ((drawable instanceof BitmapDrawable) && z7Var.K == 0) {
            int J0 = org.telegram.messenger.g0.J0(((BitmapDrawable) drawable).getBitmap());
            z7Var.K = J0;
            if (J0 == -1 || J0 == 0) {
                int i11 = org.telegram.ui.ActionBar.l6.q5;
                org.telegram.ui.ActionBar.g6 g6Var = this.J1;
                z7Var.K = org.telegram.ui.ActionBar.l6.w0(i11, g6Var);
                org.telegram.ui.ActionBar.s6.B(imageView, org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(12.0f), z7Var.K), org.telegram.ui.ActionBar.s6.M(i11), g6Var);
            } else {
                imageView.setBackground(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(12.0f), z7Var.K));
            }
            invalidate();
        }
        return super.x0(drawable, str, i7, z9, i10);
    }
}
