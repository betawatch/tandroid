package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ps0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ PhotoViewer a;

    public ps0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.a.B3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new gl0(this, 15)).setDuration(150L).start();
        }
    }
}
