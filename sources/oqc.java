// default package

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class oqc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pqc b;

    public /* synthetic */ oqc(pqc pqcVar, byte b) {
        this.a = b;
        this.b = pqcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pqc pqcVar = this.b;
        switch (b) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, pqcVar.getResourceProvider(), pqcVar.getParentActivity());
                alertDialog$Builder.a.U = jb6.M0(2131742807, null);
                b10.t(null, 2131747564, alertDialog$Builder, null);
                break;
            default:
                pqcVar.d0();
                break;
        }
    }
}
