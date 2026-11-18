package org.telegram.messenger;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ye implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ af b;
    public final /* synthetic */ int c;

    public /* synthetic */ ye(af afVar, int i7, int i10) {
        this.a = i10;
        this.b = afVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                af afVar = this.b;
                try {
                    afVar.b.o(this.c);
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                af afVar2 = this.b;
                try {
                    afVar2.b.o(this.c);
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 2:
                af afVar3 = this.b;
                try {
                    afVar3.b.o(this.c);
                    break;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            default:
                af afVar4 = this.b;
                try {
                    afVar4.b.o(this.c);
                    break;
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
        }
    }
}
