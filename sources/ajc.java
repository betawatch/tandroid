// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ajc extends djc {
    public boolean a = false;
    public int b = 0;
    public final /* synthetic */ bjc c;

    public ajc(bjc bjcVar) {
        this.c = bjcVar;
    }

    @Override // djc, cjc
    public final void b() {
        if (this.a) {
            return;
        }
        this.a = true;
        djc djcVar = (djc) this.c.e;
        if (djcVar != null) {
            djcVar.b();
        }
    }

    @Override // cjc
    public final void c() {
        int i = this.b + 1;
        this.b = i;
        bjc bjcVar = this.c;
        if (i == ((ArrayList) bjcVar.c).size()) {
            djc djcVar = (djc) bjcVar.e;
            if (djcVar != null) {
                djcVar.c();
            }
            this.b = 0;
            this.a = false;
            bjcVar.b = false;
        }
    }
}
