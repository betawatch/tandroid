package fh;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ c1(p2 p2Var, Utilities.Callback callback, int i9) {
        this.a = i9;
        this.b = p2Var;
        this.c = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p2 p2Var = this.b;
                Utilities.Callback callback = this.c;
                if (callback != null) {
                    p2Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                p2Var.dismiss();
                break;
            case 1:
                p2 p2Var2 = this.b;
                Utilities.Callback callback2 = this.c;
                if (callback2 != null) {
                    p2Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                p2Var2.dismiss();
                break;
            default:
                p2 p2Var3 = this.b;
                Utilities.Callback callback3 = this.c;
                if (callback3 != null) {
                    p2Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                p2Var3.dismiss();
                break;
        }
    }
}
