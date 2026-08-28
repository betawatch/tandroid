package fh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class t5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ t5(f6 f6Var, int i9) {
        this.a = i9;
        this.b = f6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Y();
                break;
            default:
                f6 f6Var = this.b;
                f6Var.e0.N(true);
                AndroidUtilities.runOnUIThread(new t5(f6Var, 0), 150L);
                break;
        }
    }
}
