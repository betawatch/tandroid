package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x7 extends ImageReceiver {
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 K1;
    public final /* synthetic */ y7 L1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(y7 y7Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null);
        this.L1 = y7Var;
        this.K1 = e6Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i7, boolean z10, int i10) {
        y7 y7Var = this.L1;
        ImageView imageView = y7Var.K;
        if ((drawable instanceof BitmapDrawable) && y7Var.L == 0) {
            int J0 = org.telegram.messenger.g0.J0(((BitmapDrawable) drawable).getBitmap());
            y7Var.L = J0;
            if (J0 == -1 || J0 == 0) {
                int i11 = org.telegram.ui.ActionBar.j6.q5;
                org.telegram.ui.ActionBar.e6 e6Var = this.K1;
                y7Var.L = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
                org.telegram.ui.ActionBar.q6.B(imageView, org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(12.0f), y7Var.L), org.telegram.ui.ActionBar.q6.M(i11), e6Var);
            } else {
                imageView.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(12.0f), y7Var.L));
            }
            invalidate();
        }
        return super.x0(drawable, str, i7, z10, i10);
    }
}
