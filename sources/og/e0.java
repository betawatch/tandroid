package og;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;
    public final /* synthetic */ w0 c;

    public /* synthetic */ e0(g0 g0Var, w0 w0Var, int i10) {
        this.a = i10;
        this.b = g0Var;
        this.c = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e0(this.b, this.c, 1));
                break;
            default:
                g0 g0Var = this.b;
                g0Var.getClass();
                g0Var.i = this.c.a;
                break;
        }
    }
}
