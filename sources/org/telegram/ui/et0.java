package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class et0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ PhotoViewer a;

    public et0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new pl0(this, 15)).setDuration(150L).start();
        }
    }
}
