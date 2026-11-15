package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vt extends OrientationEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vt(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i7) {
        Activity activity;
        ie0 ie0Var;
        Activity activity2;
        int i10;
        switch (this.a) {
            case 0:
                bu buVar = (bu) this.b;
                m71 m71Var = buVar.n1;
                if (buVar.A1 != null && m71Var.getVisibility() == 0 && (activity = buVar.t1) != null && m71Var.U && buVar.H1) {
                    if (i7 >= 240 && i7 <= 300) {
                        buVar.I1 = true;
                        break;
                    } else if (buVar.I1 && i7 > 0) {
                        if (i7 >= 330 || i7 <= 30) {
                            activity.setRequestedOrientation(buVar.G1);
                            buVar.H1 = false;
                            buVar.I1 = false;
                            break;
                        }
                    }
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (photoViewer.W3 != null && (ie0Var = photoViewer.z2) != null && ie0Var.getVisibility() == 0 && (activity2 = photoViewer.E) != null && (i10 = photoViewer.Y3) != 0) {
                    if (i10 != 1) {
                        if (i7 > 0 && (i7 >= 330 || i7 <= 30)) {
                            photoViewer.Z3 = true;
                            break;
                        } else if (photoViewer.Z3 && i7 >= 240 && i7 <= 300) {
                            activity2.setRequestedOrientation(photoViewer.X3);
                            photoViewer.Y3 = 0;
                            photoViewer.Z3 = false;
                            break;
                        }
                    } else if (i7 >= 240 && i7 <= 300) {
                        photoViewer.Z3 = true;
                        break;
                    } else if (photoViewer.Z3 && i7 > 0) {
                        if (i7 >= 330 || i7 <= 30) {
                            activity2.setRequestedOrientation(photoViewer.X3);
                            photoViewer.Y3 = 0;
                            photoViewer.Z3 = false;
                            break;
                        }
                    }
                }
                break;
        }
    }
}
