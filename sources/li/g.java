package li;

import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;
    public final /* synthetic */ long c;

    public /* synthetic */ g(o oVar, long j3, int i7) {
        this.a = i7;
        this.b = oVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o.c0(this.b, this.c);
                break;
            default:
                o oVar = this.b;
                oVar.getClass();
                oVar.presentFragment(bn.ua(this.c));
                break;
        }
    }
}
