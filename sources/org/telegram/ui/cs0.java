package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class cs0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ PhotoViewer a;

    public cs0(PhotoViewer photoViewer) {
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
