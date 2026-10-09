package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;
    public final /* synthetic */ ai.y1 c;

    public /* synthetic */ s2(w2 w2Var, ai.y1 y1Var, int i10) {
        this.a = i10;
        this.b = w2Var;
        this.c = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w2 w2Var = this.b;
                w2Var.getClass();
                AndroidUtilities.runOnUIThread(new s2(w2Var, this.c, 1), 320L);
                break;
            default:
                w2 w2Var2 = this.b;
                w2Var2.getClass();
                this.c.run(new ai.y1(w2Var2, 8));
                break;
        }
    }
}
