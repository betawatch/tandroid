package fi;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
