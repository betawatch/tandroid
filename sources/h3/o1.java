package h3;

import android.util.Pair;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class o1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5.b b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ j4.x d;

    public /* synthetic */ o1(g5.b bVar, Pair pair, j4.x xVar, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = pair;
        this.d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i3.f fVar = ((s1) this.b.c).h;
                Pair pair = this.c;
                fVar.b(((Integer) pair.first).intValue(), (j4.c0) pair.second, this.d);
                break;
            default:
                i3.f fVar2 = ((s1) this.b.c).h;
                Pair pair2 = this.c;
                int intValue = ((Integer) pair2.first).intValue();
                j4.c0 c0Var = (j4.c0) pair2.second;
                c0Var.getClass();
                fVar2.c(intValue, c0Var, this.d);
                break;
        }
    }
}
