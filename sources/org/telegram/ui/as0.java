package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class as0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ PhotoViewer a;

    public as0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.a.A3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new vk0(this, 16)).setDuration(150L).start();
        }
    }
}
