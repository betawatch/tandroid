// default package

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class o9a implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ taa b;

    public /* synthetic */ o9a(taa taaVar, byte b) {
        this.a = b;
        this.b = taaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        taa taaVar = this.b;
        switch (b) {
            case 0:
                taaVar.P0(true);
                break;
            case 1:
                taaVar.Z1.a(!r6.a.q, true);
                taaVar.V0();
                break;
            case 2:
                m8 m8Var = taaVar.E2;
                if (m8Var != null && m8Var.isShowing()) {
                    taaVar.E2.d(true);
                }
                taaVar.P0(false);
                break;
            case 3:
                m8 m8Var2 = taaVar.E2;
                if (m8Var2 != null && m8Var2.isShowing()) {
                    taaVar.E2.d(true);
                }
                taaVar.P0(true);
                break;
            case 4:
                String[] strArr = taaVar.j2;
                if (taaVar.P1.m() == 0) {
                    if (taaVar.i2 || strArr[0] != null) {
                        taaVar.dismiss();
                        PhotoViewer.r0().B(true, false);
                        if (strArr[0] != null || !taaVar.g2) {
                            taaVar.getContext();
                            taaVar.F0();
                            break;
                        } else {
                            taaVar.h2 = true;
                            Toast.makeText(taaVar.getContext(), k96.M0(2131748587, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                String[] strArr2 = taaVar.j2;
                if (taaVar.P1.m() == 0) {
                    if (taaVar.i2 || strArr2[0] != null) {
                        taaVar.dismiss();
                        if (strArr2[0] != null || !taaVar.g2) {
                            taaVar.getContext();
                            taaVar.F0();
                            break;
                        } else {
                            taaVar.h2 = true;
                            Toast.makeText(taaVar.getContext(), k96.M0(2131748587, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                String[] strArr3 = taaVar.j2;
                if (taaVar.P1.m() == 0) {
                    if (taaVar.i2 || strArr3[0] != null) {
                        taaVar.dismiss();
                        if (strArr3[0] != null || !taaVar.g2) {
                            taaVar.getContext();
                            taaVar.F0();
                            break;
                        } else {
                            taaVar.h2 = true;
                            Toast.makeText(taaVar.getContext(), k96.M0(2131748587, null), 0).show();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
