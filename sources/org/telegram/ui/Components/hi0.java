package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hi0 extends ImageReceiver {
    public final /* synthetic */ int K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hi0(int i3, View view) {
        super(view);
        this.K1 = i3;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i3, boolean z10, int i10) {
        switch (this.K1) {
            case 0:
                if (drawable instanceof ch0) {
                    ((ch0) drawable).N(0, false, true);
                }
                return super.x0(drawable, str, i3, z10, i10);
            default:
                boolean x02 = super.x0(drawable, str, i3, z10, i10);
                if (x02 && (drawable instanceof ch0)) {
                    ch0 ch0Var = (ch0) drawable;
                    ch0Var.N(0, false, true);
                    ch0Var.stop();
                }
                return x02;
        }
    }
}
