package bi;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;
    public final /* synthetic */ qf.c c;
    public final /* synthetic */ vg.n1 d;

    public /* synthetic */ e4(h7 h7Var, qf.c cVar, vg.n1 n1Var, int i10) {
        this.a = i10;
        this.b = h7Var;
        this.c = cVar;
        this.d = n1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                h7.f0(this.b, this.c, this.d, (String) obj);
                break;
            default:
                h7.h0(this.b, this.c, this.d, (String) obj);
                break;
        }
    }
}
