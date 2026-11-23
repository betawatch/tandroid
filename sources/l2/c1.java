package l2;

import android.util.Pair;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ c1(d1 d1Var, Pair pair, int i7) {
        this.a = i7;
        this.b = d1Var;
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
