// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
