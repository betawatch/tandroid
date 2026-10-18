package i2;

import android.util.Pair;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                j2.f fVar = this.b.b.h;
                Pair pair = this.c;
                fVar.h(((Integer) pair.first).intValue(), (u2.g0) pair.second);
                break;
            default:
                j2.f fVar2 = this.b.b.h;
                Pair pair2 = this.c;
                fVar2.j(((Integer) pair2.first).intValue(), (u2.g0) pair2.second);
                break;
        }
    }
}
