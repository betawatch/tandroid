package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class dt0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ PhotoViewer a;

    public dt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new rl0(this, 15)).setDuration(150L).start();
        }
    }
}
