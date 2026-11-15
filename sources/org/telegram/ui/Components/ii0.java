package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ii0 extends ImageReceiver {
    public final /* synthetic */ int K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ii0(int i7, View view) {
        super(view);
        this.K1 = i7;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i7, boolean z10, int i10) {
        switch (this.K1) {
            case 0:
                if (drawable instanceof ch0) {
                    ((ch0) drawable).N(0, false, true);
                }
                return super.x0(drawable, str, i7, z10, i10);
            default:
                boolean x02 = super.x0(drawable, str, i7, z10, i10);
                if (x02 && (drawable instanceof ch0)) {
                    ch0 ch0Var = (ch0) drawable;
                    ch0Var.N(0, false, true);
                    ch0Var.stop();
                }
                return x02;
        }
    }
}
