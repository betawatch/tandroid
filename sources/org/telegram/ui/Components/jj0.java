package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class jj0 extends ImageReceiver {
    public final /* synthetic */ int J1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj0(int i10, View view) {
        super(view);
        this.J1 = i10;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i10, boolean z10, int i11) {
        switch (this.J1) {
            case 0:
                if (drawable instanceof ci0) {
                    ((ci0) drawable).N(0, false, true);
                }
                return super.x0(drawable, str, i10, z10, i11);
            default:
                boolean x02 = super.x0(drawable, str, i10, z10, i11);
                if (x02 && (drawable instanceof ci0)) {
                    ci0 ci0Var = (ci0) drawable;
                    ci0Var.N(0, false, true);
                    ci0Var.stop();
                }
                return x02;
        }
    }
}
