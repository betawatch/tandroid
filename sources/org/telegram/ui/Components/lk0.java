package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class lk0 extends ImageReceiver {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lk0(int i10, View view) {
        super(view);
        this.a = i10;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z4, int i11) {
        switch (this.a) {
            case 0:
                if (drawable instanceof gj0) {
                    ((gj0) drawable).L(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z4, i11);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z4, i11);
                if (imageBitmapByKey && (drawable instanceof gj0)) {
                    gj0 gj0Var = (gj0) drawable;
                    gj0Var.L(0, false, true);
                    gj0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
