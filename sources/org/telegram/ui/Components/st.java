package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class st extends OrientationEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ st(int i3, Context context, Object obj) {
        super(context);
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i3) {
        Activity activity;
        zd0 zd0Var;
        Activity activity2;
        int i10;
        switch (this.a) {
            case 0:
                ut utVar = (ut) this.b;
                d71 d71Var = utVar.k1;
                if (utVar.x1 != null && d71Var.getVisibility() == 0 && (activity = utVar.q1) != null && d71Var.U && utVar.E1) {
                    if (i3 >= 240 && i3 <= 300) {
                        utVar.F1 = true;
                        break;
                    } else if (utVar.F1 && i3 > 0) {
                        if (i3 >= 330 || i3 <= 30) {
                            activity.setRequestedOrientation(utVar.D1);
                            utVar.E1 = false;
                            utVar.F1 = false;
                            break;
                        }
                    }
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (photoViewer.X3 != null && (zd0Var = photoViewer.z2) != null && zd0Var.getVisibility() == 0 && (activity2 = photoViewer.E) != null && (i10 = photoViewer.Z3) != 0) {
                    if (i10 != 1) {
                        if (i3 > 0 && (i3 >= 330 || i3 <= 30)) {
                            photoViewer.a4 = true;
                            break;
                        } else if (photoViewer.a4 && i3 >= 240 && i3 <= 300) {
                            activity2.setRequestedOrientation(photoViewer.Y3);
                            photoViewer.Z3 = 0;
                            photoViewer.a4 = false;
                            break;
                        }
                    } else if (i3 >= 240 && i3 <= 300) {
                        photoViewer.a4 = true;
                        break;
                    } else if (photoViewer.a4 && i3 > 0) {
                        if (i3 >= 330 || i3 <= 30) {
                            activity2.setRequestedOrientation(photoViewer.Y3);
                            photoViewer.Z3 = 0;
                            photoViewer.a4 = false;
                            break;
                        }
                    }
                }
                break;
        }
    }
}
