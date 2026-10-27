package fi;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;
    public final /* synthetic */ ai.i c;

    public /* synthetic */ m2(q2 q2Var, ai.i iVar, int i10) {
        this.a = i10;
        this.b = q2Var;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q2 q2Var = this.b;
                q2Var.getClass();
                AndroidUtilities.runOnUIThread(new m2(q2Var, this.c, 1), 320L);
                break;
            default:
                q2 q2Var2 = this.b;
                q2Var2.getClass();
                this.c.run(new ai.i(q2Var2, 18));
                break;
        }
    }
}
