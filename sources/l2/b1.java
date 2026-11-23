package l2;

import android.util.Pair;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                m2.d dVar = this.b.b.h;
                Pair pair = this.c;
                dVar.z(((Integer) pair.first).intValue(), (x2.g0) pair.second);
                break;
            default:
                m2.d dVar2 = this.b.b.h;
                Pair pair2 = this.c;
                dVar2.w(((Integer) pair2.first).intValue(), (x2.g0) pair2.second);
                break;
        }
    }
}
