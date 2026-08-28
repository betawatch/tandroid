package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.lj0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class o6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ o6(v7 v7Var, boolean[] zArr, Utilities.Callback callback) {
        this.a = 0;
        this.b = zArr;
        this.c = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                if (!zArr[0] && (callback = this.c) != null) {
                    callback.run("cancelled");
                    zArr[0] = true;
                    break;
                }
                break;
            case 1:
                boolean[] zArr2 = this.b;
                if (!zArr2[0] && (callback2 = this.c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new lj0(4), 220L);
                break;
            default:
                boolean[] zArr3 = this.b;
                if (!zArr3[0] && (callback3 = this.c) != null) {
                    zArr3[0] = true;
                    callback3.run(Boolean.FALSE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o6(boolean[] zArr, Utilities.Callback callback, int i9) {
        this.a = i9;
        this.b = zArr;
        this.c = callback;
    }
}
