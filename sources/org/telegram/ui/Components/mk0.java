package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class mk0 extends ImageReceiver {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mk0(int i10, View view) {
        super(view);
        this.a = i10;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z4, int i11) {
        switch (this.a) {
            case 0:
                if (drawable instanceof hj0) {
                    ((hj0) drawable).L(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z4, i11);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z4, i11);
                if (imageBitmapByKey && (drawable instanceof hj0)) {
                    hj0 hj0Var = (hj0) drawable;
                    hj0Var.L(0, false, true);
                    hj0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
