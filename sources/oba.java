// default package

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class oba implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tca b;

    public /* synthetic */ oba(tca tcaVar, byte b) {
        this.a = b;
        this.b = tcaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        tca tcaVar = this.b;
        switch (b) {
            case 0:
                tcaVar.P0(true);
                break;
            case 1:
                tcaVar.Z1.a(!r6.a.q, true);
                tcaVar.V0();
                break;
            case 2:
                m8 m8Var = tcaVar.E2;
                if (m8Var != null && m8Var.isShowing()) {
                    tcaVar.E2.d(true);
                }
                tcaVar.P0(false);
                break;
            case 3:
                m8 m8Var2 = tcaVar.E2;
                if (m8Var2 != null && m8Var2.isShowing()) {
                    tcaVar.E2.d(true);
                }
                tcaVar.P0(true);
                break;
            case 4:
                String[] strArr = tcaVar.j2;
                if (tcaVar.P1.m() == 0) {
                    if (tcaVar.i2 || strArr[0] != null) {
                        tcaVar.dismiss();
                        PhotoViewer.r0().A(true, false);
                        if (strArr[0] != null || !tcaVar.g2) {
                            tcaVar.getContext();
                            tcaVar.F0();
                            break;
                        } else {
                            tcaVar.h2 = true;
                            Toast.makeText(tcaVar.getContext(), jb6.M0(2131748536, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                String[] strArr2 = tcaVar.j2;
                if (tcaVar.P1.m() == 0) {
                    if (tcaVar.i2 || strArr2[0] != null) {
                        tcaVar.dismiss();
                        if (strArr2[0] != null || !tcaVar.g2) {
                            tcaVar.getContext();
                            tcaVar.F0();
                            break;
                        } else {
                            tcaVar.h2 = true;
                            Toast.makeText(tcaVar.getContext(), jb6.M0(2131748536, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                String[] strArr3 = tcaVar.j2;
                if (tcaVar.P1.m() == 0) {
                    if (tcaVar.i2 || strArr3[0] != null) {
                        tcaVar.dismiss();
                        if (strArr3[0] != null || !tcaVar.g2) {
                            tcaVar.getContext();
                            tcaVar.F0();
                            break;
                        } else {
                            tcaVar.h2 = true;
                            Toast.makeText(tcaVar.getContext(), jb6.M0(2131748536, null), 0).show();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
