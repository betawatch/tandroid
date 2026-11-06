package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class y7 extends ImageReceiver {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 J1;
    public final /* synthetic */ z7 K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(z7 z7Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null);
        this.K1 = z7Var;
        this.J1 = f6Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i7, boolean z9, int i10) {
        z7 z7Var = this.K1;
        ImageView imageView = z7Var.J;
        if ((drawable instanceof BitmapDrawable) && z7Var.K == 0) {
            int J0 = org.telegram.messenger.g0.J0(((BitmapDrawable) drawable).getBitmap());
            z7Var.K = J0;
            if (J0 == -1 || J0 == 0) {
                int i11 = org.telegram.ui.ActionBar.k6.q5;
                org.telegram.ui.ActionBar.f6 f6Var = this.J1;
                z7Var.K = org.telegram.ui.ActionBar.k6.w0(i11, f6Var);
                org.telegram.ui.ActionBar.r6.C(imageView, org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), z7Var.K), org.telegram.ui.ActionBar.r6.N(i11), f6Var);
            } else {
                imageView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), z7Var.K));
            }
            invalidate();
        }
        return super.x0(drawable, str, i7, z9, i10);
    }
}
