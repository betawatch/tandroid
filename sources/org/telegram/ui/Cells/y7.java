package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class y7 extends ImageReceiver {
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 K1;
    public final /* synthetic */ z7 L1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(z7 z7Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(null);
        this.L1 = z7Var;
        this.K1 = i6Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i7, boolean z10, int i10) {
        z7 z7Var = this.L1;
        ImageView imageView = z7Var.K;
        if ((drawable instanceof BitmapDrawable) && z7Var.L == 0) {
            int J0 = org.telegram.messenger.g0.J0(((BitmapDrawable) drawable).getBitmap());
            z7Var.L = J0;
            if (J0 == -1 || J0 == 0) {
                int i11 = org.telegram.ui.ActionBar.n6.q5;
                org.telegram.ui.ActionBar.i6 i6Var = this.K1;
                z7Var.L = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
                org.telegram.ui.ActionBar.u6.B(imageView, org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(12.0f), z7Var.L), org.telegram.ui.ActionBar.u6.M(i11), i6Var);
            } else {
                imageView.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(12.0f), z7Var.L));
            }
            invalidate();
        }
        return super.x0(drawable, str, i7, z10, i10);
    }
}
