package ih;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class f5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q5 b;

    public /* synthetic */ f5(q5 q5Var, int i10) {
        this.a = i10;
        this.b = q5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Z();
                break;
            default:
                q5 q5Var = this.b;
                q5Var.e0.N(true);
                AndroidUtilities.runOnUIThread(new f5(q5Var, 0), 150L);
                break;
        }
    }
}
