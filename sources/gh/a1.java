package gh;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2 b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ a1(k2 k2Var, Utilities.Callback callback, int i10) {
        this.a = i10;
        this.b = k2Var;
        this.c = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k2 k2Var = this.b;
                Utilities.Callback callback = this.c;
                if (callback != null) {
                    k2Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                k2Var.dismiss();
                break;
            case 1:
                k2 k2Var2 = this.b;
                Utilities.Callback callback2 = this.c;
                if (callback2 != null) {
                    k2Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                k2Var2.dismiss();
                break;
            default:
                k2 k2Var3 = this.b;
                Utilities.Callback callback3 = this.c;
                if (callback3 != null) {
                    k2Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                k2Var3.dismiss();
                break;
        }
    }
}
