package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ei0 extends ImageReceiver {
    public final /* synthetic */ int J1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ei0(int i7, View view) {
        super(view);
        this.J1 = i7;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i7, boolean z9, int i10) {
        switch (this.J1) {
            case 0:
                if (drawable instanceof zg0) {
                    ((zg0) drawable).N(0, false, true);
                }
                return super.x0(drawable, str, i7, z9, i10);
            default:
                boolean x02 = super.x0(drawable, str, i7, z9, i10);
                if (x02 && (drawable instanceof zg0)) {
                    zg0 zg0Var = (zg0) drawable;
                    zg0Var.N(0, false, true);
                    zg0Var.stop();
                }
                return x02;
        }
    }
}
