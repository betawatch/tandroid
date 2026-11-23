package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ti0 extends ImageReceiver {
    public final /* synthetic */ int K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ti0(int i7, View view) {
        super(view);
        this.K1 = i7;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean y0(Drawable drawable, String str, int i7, boolean z10, int i10) {
        switch (this.K1) {
            case 0:
                if (drawable instanceof nh0) {
                    ((nh0) drawable).N(0, false, true);
                }
                return super.y0(drawable, str, i7, z10, i10);
            default:
                boolean y02 = super.y0(drawable, str, i7, z10, i10);
                if (y02 && (drawable instanceof nh0)) {
                    nh0 nh0Var = (nh0) drawable;
                    nh0Var.N(0, false, true);
                    nh0Var.stop();
                }
                return y02;
        }
    }
}
