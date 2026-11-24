// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bhc extends ehc {
    public boolean a = false;
    public int b = 0;
    public final /* synthetic */ chc c;

    public bhc(chc chcVar) {
        this.c = chcVar;
    }

    @Override // ehc, dhc
    public final void b() {
        if (this.a) {
            return;
        }
        this.a = true;
        ehc ehcVar = (ehc) this.c.e;
        if (ehcVar != null) {
            ehcVar.b();
        }
    }

    @Override // dhc
    public final void c() {
        int i = this.b + 1;
        this.b = i;
        chc chcVar = this.c;
        if (i == ((ArrayList) chcVar.c).size()) {
            ehc ehcVar = (ehc) chcVar.e;
            if (ehcVar != null) {
                ehcVar.c();
            }
            this.b = 0;
            this.a = false;
            chcVar.b = false;
        }
    }
}
