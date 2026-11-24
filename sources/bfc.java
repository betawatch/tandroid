// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class bfc extends efc {
    public boolean a = false;
    public int b = 0;
    public final /* synthetic */ cfc c;

    public bfc(cfc cfcVar) {
        this.c = cfcVar;
    }

    @Override // efc, dfc
    public final void b() {
        if (this.a) {
            return;
        }
        this.a = true;
        efc efcVar = (efc) this.c.e;
        if (efcVar != null) {
            efcVar.b();
        }
    }

    @Override // dfc
    public final void c() {
        int i = this.b + 1;
        this.b = i;
        cfc cfcVar = this.c;
        if (i == ((ArrayList) cfcVar.c).size()) {
            efc efcVar = (efc) cfcVar.e;
            if (efcVar != null) {
                efcVar.c();
            }
            this.b = 0;
            this.a = false;
            cfcVar.b = false;
        }
    }
}
