package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ti0 extends ImageReceiver {
    public final /* synthetic */ int K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ti0(int i7, View view) {
        super(view);
        this.K1 = i7;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i7, boolean z10, int i10) {
        switch (this.K1) {
            case 0:
                if (drawable instanceof oh0) {
                    ((oh0) drawable).N(0, false, true);
                }
                return super.x0(drawable, str, i7, z10, i10);
            default:
                boolean x02 = super.x0(drawable, str, i7, z10, i10);
                if (x02 && (drawable instanceof oh0)) {
                    oh0 oh0Var = (oh0) drawable;
                    oh0Var.N(0, false, true);
                    oh0Var.stop();
                }
                return x02;
        }
    }
}
