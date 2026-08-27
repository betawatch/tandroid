package c2;

import ag.h1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ c(h1 h1Var, int i10, int i11) {
        this.a = i11;
        this.b = h1Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z zVar = ((e) ((a5.n) this.b.f).d).d;
                if (zVar != null) {
                    zVar.j(this.c);
                    break;
                }
                break;
            default:
                z zVar2 = ((e) ((a5.n) this.b.f).d).d;
                if (zVar2 != null) {
                    zVar2.k(this.c);
                    break;
                }
                break;
        }
    }
}
