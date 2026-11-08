package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class cp0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ PhotoViewer a;

    public cp0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.a.D3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new ef0(this, 19)).setDuration(150L).start();
        }
    }
}
