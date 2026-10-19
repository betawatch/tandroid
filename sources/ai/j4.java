package ai;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class j4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;
    public final /* synthetic */ pf.c c;
    public final /* synthetic */ ug.m1 d;

    public /* synthetic */ j4(l7 l7Var, pf.c cVar, ug.m1 m1Var, int i10) {
        this.a = i10;
        this.b = l7Var;
        this.c = cVar;
        this.d = m1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                l7.g0(this.b, this.c, this.d, (String) obj);
                break;
            default:
                l7.i0(this.b, this.c, this.d, (String) obj);
                break;
        }
    }
}
