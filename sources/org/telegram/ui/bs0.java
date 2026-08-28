package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bs0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ PhotoViewer a;

    public bs0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.a.A3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new zk0(this, 16)).setDuration(150L).start();
        }
    }
}
