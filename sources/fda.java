// default package

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fda implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kea b;

    public /* synthetic */ fda(kea keaVar, byte b) {
        this.a = b;
        this.b = keaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        kea keaVar = this.b;
        switch (b) {
            case 0:
                keaVar.Q0(true);
                break;
            case 1:
                keaVar.Z1.a(!r6.a.q, true);
                keaVar.W0();
                break;
            case 2:
                n8 n8Var = keaVar.E2;
                if (n8Var != null && n8Var.isShowing()) {
                    keaVar.E2.d(true);
                }
                keaVar.Q0(false);
                break;
            case 3:
                n8 n8Var2 = keaVar.E2;
                if (n8Var2 != null && n8Var2.isShowing()) {
                    keaVar.E2.d(true);
                }
                keaVar.Q0(true);
                break;
            case 4:
                String[] strArr = keaVar.j2;
                if (keaVar.P1.m() == 0) {
                    if (keaVar.i2 || strArr[0] != null) {
                        keaVar.dismiss();
                        PhotoViewer.q0().A(true, false);
                        if (strArr[0] != null || !keaVar.g2) {
                            keaVar.getContext();
                            keaVar.G0();
                            break;
                        } else {
                            keaVar.h2 = true;
                            Toast.makeText(keaVar.getContext(), ob6.M0(2131748533, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                String[] strArr2 = keaVar.j2;
                if (keaVar.P1.m() == 0) {
                    if (keaVar.i2 || strArr2[0] != null) {
                        keaVar.dismiss();
                        if (strArr2[0] != null || !keaVar.g2) {
                            keaVar.getContext();
                            keaVar.G0();
                            break;
                        } else {
                            keaVar.h2 = true;
                            Toast.makeText(keaVar.getContext(), ob6.M0(2131748533, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                String[] strArr3 = keaVar.j2;
                if (keaVar.P1.m() == 0) {
                    if (keaVar.i2 || strArr3[0] != null) {
                        keaVar.dismiss();
                        if (strArr3[0] != null || !keaVar.g2) {
                            keaVar.getContext();
                            keaVar.G0();
                            break;
                        } else {
                            keaVar.h2 = true;
                            Toast.makeText(keaVar.getContext(), ob6.M0(2131748533, null), 0).show();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
