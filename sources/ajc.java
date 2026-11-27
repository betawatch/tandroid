// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
