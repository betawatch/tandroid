package ai;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class j4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;
    public final /* synthetic */ pf.c c;
    public final /* synthetic */ ug.l1 d;

    public /* synthetic */ j4(l7 l7Var, pf.c cVar, ug.l1 l1Var, int i10) {
        this.a = i10;
        this.b = l7Var;
        this.c = cVar;
        this.d = l1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                l7.f0(this.b, this.c, this.d, (String) obj);
                break;
            default:
                l7.h0(this.b, this.c, this.d, (String) obj);
                break;
        }
    }
}
