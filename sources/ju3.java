// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ju3 implements DialogInterface.OnShowListener {
    public final /* synthetic */ ou3 a;

    public ju3(ou3 ou3Var) {
        this.a = ou3Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        ou3 ou3Var = this.a;
        stc stcVar = ou3Var.m1;
        if (ou3Var.H0() && stcVar.f()) {
            stcVar.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 2));
        }
    }
}
