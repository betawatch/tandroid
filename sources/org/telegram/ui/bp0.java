package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class bp0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ PhotoViewer a;

    public bp0(PhotoViewer photoViewer) {
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
