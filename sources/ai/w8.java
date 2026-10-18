package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ff0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ w8(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.a = i10;
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
                AndroidUtilities.runOnUIThread(new ff0(4), 220L);
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

    public /* synthetic */ w8(ga gaVar, boolean[] zArr, Utilities.Callback callback) {
        this.a = 0;
        this.b = zArr;
        this.c = callback;
    }
}
