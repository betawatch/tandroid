// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
