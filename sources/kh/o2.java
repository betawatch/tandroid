package kh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;
    public final /* synthetic */ i9 c;

    public /* synthetic */ o2(s2 s2Var, i9 i9Var, int i9) {
        this.a = i9;
        this.b = s2Var;
        this.c = i9Var;
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
                this.c.run(new bg.i(s2Var2, 25));
                break;
        }
    }
}
