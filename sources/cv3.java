// default package

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class cv3 extends OrientationEventListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cv3(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        Activity activity;
        dc8 dc8Var;
        Activity activity2;
        byte b;
        byte b2 = this.a;
        Object obj = this.b;
        switch (b2) {
            case 0:
                iv3 iv3Var = (iv3) obj;
                hyc hycVar = iv3Var.m1;
                if (iv3Var.z1 != null && hycVar.getVisibility() == 0 && (activity = iv3Var.s1) != null && hycVar.U && iv3Var.G1) {
                    if (i >= 240 && i <= 300) {
                        iv3Var.H1 = true;
                        break;
                    } else if (iv3Var.H1 && i > 0) {
                        if (i >= 330 || i <= 30) {
                            activity.setRequestedOrientation(iv3Var.F1);
                            iv3Var.G1 = false;
                            iv3Var.H1 = false;
                            break;
                        }
                    }
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.W3 != null && (dc8Var = photoViewer.z2) != null && dc8Var.getVisibility() == 0 && (activity2 = photoViewer.E) != null && (b = photoViewer.Y3) != 0) {
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
