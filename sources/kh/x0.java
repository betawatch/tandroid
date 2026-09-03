package kh;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ x0(g2 g2Var, Utilities.Callback callback, int i10) {
        this.a = i10;
        this.b = g2Var;
        this.c = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g2 g2Var = this.b;
                Utilities.Callback callback = this.c;
                if (callback != null) {
                    g2Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                g2Var.dismiss();
                break;
            case 1:
                g2 g2Var2 = this.b;
                Utilities.Callback callback2 = this.c;
                if (callback2 != null) {
                    g2Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                g2Var2.dismiss();
                break;
            default:
                g2 g2Var3 = this.b;
                Utilities.Callback callback3 = this.c;
                if (callback3 != null) {
                    g2Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                g2Var3.dismiss();
                break;
        }
    }
}
