// default package

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class moc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ noc b;

    public /* synthetic */ moc(noc nocVar, byte b) {
        this.a = b;
        this.b = nocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        noc nocVar = this.b;
        switch (b) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nocVar.getResourceProvider(), nocVar.getParentActivity());
                alertDialog$Builder.a.U = k96.M0(2131742881, null);
                b00.t(null, 2131747638, alertDialog$Builder, null);
                break;
            default:
                nocVar.c0();
                break;
        }
    }
}
