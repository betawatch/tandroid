package i2;

import android.util.Pair;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ d1(e1 e1Var, Pair pair, int i10) {
        this.a = i10;
        this.b = e1Var;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j2.e eVar = this.b.b.h;
                Pair pair = this.c;
                eVar.h(((Integer) pair.first).intValue(), (u2.h0) pair.second);
                break;
            default:
                j2.e eVar2 = this.b.b.h;
                Pair pair2 = this.c;
                eVar2.j(((Integer) pair2.first).intValue(), (u2.h0) pair2.second);
                break;
        }
    }
}
