package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qj0 extends ImageReceiver {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qj0(int i9, View view) {
        super(view);
        this.a = i9;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i9, boolean z10, int i10) {
        switch (this.a) {
            case 0:
                if (drawable instanceof mi0) {
                    ((mi0) drawable).L(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i9, z10, i10);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i9, z10, i10);
                if (imageBitmapByKey && (drawable instanceof mi0)) {
                    mi0 mi0Var = (mi0) drawable;
                    mi0Var.L(0, false, true);
                    mi0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
