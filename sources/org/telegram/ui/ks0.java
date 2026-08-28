package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ks0 extends OrientationEventListener {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.a = photoViewer;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i9) {
        ps0 ps0Var;
        Activity activity;
        int i10;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.S3 == null || (ps0Var = photoViewer.u2) == null || ps0Var.getVisibility() != 0 || (activity = photoViewer.y) == null || (i10 = photoViewer.U3) == 0) {
            return;
        }
        if (i10 != 1) {
            if (i9 > 0 && (i9 >= 330 || i9 <= 30)) {
                photoViewer.V3 = true;
                return;
            }
            if (!photoViewer.V3 || i9 < 240 || i9 > 300) {
                return;
            }
            activity.setRequestedOrientation(photoViewer.T3);
            photoViewer.U3 = 0;
            photoViewer.V3 = false;
            return;
        }
        if (i9 >= 240 && i9 <= 300) {
            photoViewer.V3 = true;
            return;
        }
        if (!photoViewer.V3 || i9 <= 0) {
            return;
        }
        if (i9 >= 330 || i9 <= 30) {
            activity.setRequestedOrientation(photoViewer.T3);
            photoViewer.U3 = 0;
            photoViewer.V3 = false;
        }
    }
}
