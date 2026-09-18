package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class pt0 extends OrientationEventListener {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.a = photoViewer;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        ut0 ut0Var;
        Activity activity;
        int i11;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.W3 == null || (ut0Var = photoViewer.y2) == null || ut0Var.getVisibility() != 0 || (activity = photoViewer.y) == null || (i11 = photoViewer.Y3) == 0) {
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
