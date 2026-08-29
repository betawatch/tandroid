package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class js0 extends OrientationEventListener {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.a = photoViewer;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        os0 os0Var;
        Activity activity;
        int i11;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.S3 == null || (os0Var = photoViewer.u2) == null || os0Var.getVisibility() != 0 || (activity = photoViewer.y) == null || (i11 = photoViewer.U3) == 0) {
            return;
        }
        if (i11 != 1) {
            if (i10 > 0 && (i10 >= 330 || i10 <= 30)) {
                photoViewer.V3 = true;
                return;
            }
            if (!photoViewer.V3 || i10 < 240 || i10 > 300) {
                return;
            }
            activity.setRequestedOrientation(photoViewer.T3);
            photoViewer.U3 = 0;
            photoViewer.V3 = false;
            return;
        }
        if (i10 >= 240 && i10 <= 300) {
            photoViewer.V3 = true;
            return;
        }
        if (!photoViewer.V3 || i10 <= 0) {
            return;
        }
        if (i10 >= 330 || i10 <= 30) {
            activity.setRequestedOrientation(photoViewer.T3);
            photoViewer.U3 = 0;
            photoViewer.V3 = false;
        }
    }
}
