package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class at0 extends OrientationEventListener {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.a = photoViewer;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        ft0 ft0Var;
        Activity activity;
        int i11;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.W3 == null || (ft0Var = photoViewer.y2) == null || ft0Var.getVisibility() != 0 || (activity = photoViewer.y) == null || (i11 = photoViewer.Y3) == 0) {
            return;
        }
        if (i11 != 1) {
            if (i10 > 0 && (i10 >= 330 || i10 <= 30)) {
                photoViewer.Z3 = true;
                return;
            }
            if (!photoViewer.Z3 || i10 < 240 || i10 > 300) {
                return;
            }
            activity.setRequestedOrientation(photoViewer.X3);
            photoViewer.Y3 = 0;
            photoViewer.Z3 = false;
            return;
        }
        if (i10 >= 240 && i10 <= 300) {
            photoViewer.Z3 = true;
            return;
        }
        if (!photoViewer.Z3 || i10 <= 0) {
            return;
        }
        if (i10 >= 330 || i10 <= 30) {
            activity.setRequestedOrientation(photoViewer.X3);
            photoViewer.Y3 = 0;
            photoViewer.Z3 = false;
        }
    }
}
