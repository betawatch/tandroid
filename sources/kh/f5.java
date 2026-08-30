package kh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                q5Var.f0.N(true);
                AndroidUtilities.runOnUIThread(new f5(q5Var, 0), 150L);
                break;
        }
    }
}
