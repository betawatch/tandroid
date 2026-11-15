package l2;

import android.util.Pair;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ b1(c1 c1Var, Pair pair, int i7) {
        this.a = i7;
        this.b = c1Var;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m2.e eVar = this.b.b.h;
                Pair pair = this.c;
                eVar.z(((Integer) pair.first).intValue(), (x2.f0) pair.second);
                break;
            default:
                m2.e eVar2 = this.b.b.h;
                Pair pair2 = this.c;
                eVar2.w(((Integer) pair2.first).intValue(), (x2.f0) pair2.second);
                break;
        }
    }
}
