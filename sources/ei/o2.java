package ei;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;
    public final /* synthetic */ ai.r0 c;

    public /* synthetic */ o2(s2 s2Var, ai.r0 r0Var, int i10) {
        this.a = i10;
        this.b = s2Var;
        this.c = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s2 s2Var = this.b;
                s2Var.getClass();
                AndroidUtilities.runOnUIThread(new o2(s2Var, this.c, 1), 320L);
                break;
            default:
                s2 s2Var2 = this.b;
                s2Var2.getClass();
                this.c.run(new ai.r0(s2Var2, 14));
                break;
        }
    }
}
