// default package

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
