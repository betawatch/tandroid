package ih;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h2 b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ y0(h2 h2Var, Utilities.Callback callback, int i10) {
        this.a = i10;
        this.b = h2Var;
        this.c = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h2 h2Var = this.b;
                Utilities.Callback callback = this.c;
                if (callback != null) {
                    h2Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                h2Var.dismiss();
                break;
            case 1:
                h2 h2Var2 = this.b;
                Utilities.Callback callback2 = this.c;
                if (callback2 != null) {
                    h2Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                h2Var2.dismiss();
                break;
            default:
                h2 h2Var3 = this.b;
                Utilities.Callback callback3 = this.c;
                if (callback3 != null) {
                    h2Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                h2Var3.dismiss();
                break;
        }
    }
}
