package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class is0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ PhotoViewer a;

    public is0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.a.B3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new el0(this, 16)).setDuration(150L).start();
        }
    }
}
