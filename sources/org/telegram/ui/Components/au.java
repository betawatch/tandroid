package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class au extends OrientationEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i7) {
        Activity activity;
        se0 se0Var;
        Activity activity2;
        int i10;
        switch (this.a) {
            case 0:
                gu guVar = (gu) this.b;
                w71 w71Var = guVar.n1;
                if (guVar.A1 != null && w71Var.getVisibility() == 0 && (activity = guVar.t1) != null && w71Var.U && guVar.H1) {
                    if (i7 >= 240 && i7 <= 300) {
                        guVar.I1 = true;
                        break;
                    } else if (guVar.I1 && i7 > 0) {
                        if (i7 >= 330 || i7 <= 30) {
                            activity.setRequestedOrientation(guVar.G1);
                            guVar.H1 = false;
                            guVar.I1 = false;
                            break;
                        }
                    }
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (photoViewer.W3 != null && (se0Var = photoViewer.z2) != null && se0Var.getVisibility() == 0 && (activity2 = photoViewer.E) != null && (i10 = photoViewer.Y3) != 0) {
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
