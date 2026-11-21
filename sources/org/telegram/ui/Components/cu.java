package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class cu extends OrientationEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cu(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i7) {
        Activity activity;
        ue0 ue0Var;
        Activity activity2;
        int i10;
        switch (this.a) {
            case 0:
                iu iuVar = (iu) this.b;
                z71 z71Var = iuVar.n1;
                if (iuVar.A1 != null && z71Var.getVisibility() == 0 && (activity = iuVar.t1) != null && z71Var.U && iuVar.H1) {
                    if (i7 >= 240 && i7 <= 300) {
                        iuVar.I1 = true;
                        break;
                    } else if (iuVar.I1 && i7 > 0) {
                        if (i7 >= 330 || i7 <= 30) {
                            activity.setRequestedOrientation(iuVar.G1);
                            iuVar.H1 = false;
                            iuVar.I1 = false;
                            break;
                        }
                    }
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (photoViewer.W3 != null && (ue0Var = photoViewer.z2) != null && ue0Var.getVisibility() == 0 && (activity2 = photoViewer.E) != null && (i10 = photoViewer.Y3) != 0) {
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
