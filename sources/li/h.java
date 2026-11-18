package li;

import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ long c;

    public /* synthetic */ h(p pVar, long j3, int i7) {
        this.a = i7;
        this.b = pVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p.c0(this.b, this.c);
                break;
            default:
                p pVar = this.b;
                pVar.getClass();
                pVar.presentFragment(bn.ua(this.c));
                break;
        }
    }
}
