package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ij0 extends ImageReceiver {
    public final /* synthetic */ int J1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ij0(int i10, View view) {
        super(view);
        this.J1 = i10;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i10, boolean z10, int i11) {
        switch (this.J1) {
            case 0:
                if (drawable instanceof bi0) {
                    ((bi0) drawable).N(0, false, true);
                }
                return super.x0(drawable, str, i10, z10, i11);
            default:
                boolean x02 = super.x0(drawable, str, i10, z10, i11);
                if (x02 && (drawable instanceof bi0)) {
                    bi0 bi0Var = (bi0) drawable;
                    bi0Var.N(0, false, true);
                    bi0Var.stop();
                }
                return x02;
        }
    }
}
