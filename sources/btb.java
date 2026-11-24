// default package

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class btb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ btb(Toolbar toolbar, byte b) {
        this.a = b;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Toolbar toolbar = this.b;
        switch (b) {
            case 0:
                dtb dtbVar = toolbar.f0;
                c07 c07Var = dtbVar == null ? null : dtbVar.b;
                if (c07Var != null) {
                    c07Var.collapseActionView();
                    break;
                }
                break;
            default:
                toolbar.m();
                break;
        }
    }
}
