package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class z7 extends ImageReceiver {
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 K1;
    public final /* synthetic */ a8 L1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(a8 a8Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(null);
        this.L1 = a8Var;
        this.K1 = h6Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i7, boolean z10, int i10) {
        a8 a8Var = this.L1;
        ImageView imageView = a8Var.K;
        if ((drawable instanceof BitmapDrawable) && a8Var.L == 0) {
            int J0 = org.telegram.messenger.g0.J0(((BitmapDrawable) drawable).getBitmap());
            a8Var.L = J0;
            if (J0 == -1 || J0 == 0) {
                int i11 = org.telegram.ui.ActionBar.m6.q5;
                org.telegram.ui.ActionBar.h6 h6Var = this.K1;
                a8Var.L = org.telegram.ui.ActionBar.m6.w0(i11, h6Var);
                org.telegram.ui.ActionBar.t6.B(imageView, org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(12.0f), a8Var.L), org.telegram.ui.ActionBar.t6.M(i11), h6Var);
            } else {
                imageView.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(12.0f), a8Var.L));
            }
            invalidate();
        }
        return super.x0(drawable, str, i7, z10, i10);
    }
}
