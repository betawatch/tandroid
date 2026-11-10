package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fp0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ PhotoViewer a;

    public fp0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.a.D3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new hf0(this, 19)).setDuration(150L).start();
        }
    }
}
