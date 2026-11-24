// default package

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class iu3 extends OrientationEventListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iu3(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        Activity activity;
        m88 m88Var;
        Activity activity2;
        byte b;
        byte b2 = this.a;
        Object obj = this.b;
        switch (b2) {
            case 0:
                ou3 ou3Var = (ou3) obj;
                stc stcVar = ou3Var.m1;
                if (ou3Var.z1 != null && stcVar.getVisibility() == 0 && (activity = ou3Var.s1) != null && stcVar.U && ou3Var.G1) {
                    if (i >= 240 && i <= 300) {
                        ou3Var.H1 = true;
                        break;
                    } else if (ou3Var.H1 && i > 0) {
                        if (i >= 330 || i <= 30) {
                            activity.setRequestedOrientation(ou3Var.F1);
                            ou3Var.G1 = false;
                            ou3Var.H1 = false;
                            break;
                        }
                    }
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.W3 != null && (m88Var = photoViewer.z2) != null && m88Var.getVisibility() == 0 && (activity2 = photoViewer.E) != null && (b = photoViewer.Y3) != 0) {
                    if (b != 1) {
                        if (i > 0 && (i >= 330 || i <= 30)) {
                            photoViewer.Z3 = true;
                            break;
                        } else if (photoViewer.Z3 && i >= 240 && i <= 300) {
                            activity2.setRequestedOrientation(photoViewer.X3);
                            photoViewer.Y3 = (byte) 0;
                            photoViewer.Z3 = false;
                            break;
                        }
                    } else if (i >= 240 && i <= 300) {
                        photoViewer.Z3 = true;
                        break;
                    } else if (photoViewer.Z3 && i > 0) {
                        if (i >= 330 || i <= 30) {
                            activity2.setRequestedOrientation(photoViewer.X3);
                            photoViewer.Y3 = (byte) 0;
                            photoViewer.Z3 = false;
                            break;
                        }
                    }
                }
                break;
        }
    }
}
