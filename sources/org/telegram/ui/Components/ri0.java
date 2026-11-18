package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ri0 extends ImageReceiver {
    public final /* synthetic */ int K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri0(int i7, View view) {
        super(view);
        this.K1 = i7;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i7, boolean z10, int i10) {
        switch (this.K1) {
            case 0:
                if (drawable instanceof mh0) {
                    ((mh0) drawable).N(0, false, true);
                }
                return super.x0(drawable, str, i7, z10, i10);
            default:
                boolean x02 = super.x0(drawable, str, i7, z10, i10);
                if (x02 && (drawable instanceof mh0)) {
                    mh0 mh0Var = (mh0) drawable;
                    mh0Var.N(0, false, true);
                    mh0Var.stop();
                }
                return x02;
        }
    }
}
