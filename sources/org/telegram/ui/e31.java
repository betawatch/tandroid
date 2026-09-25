package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ e31(int i10, Utilities.Callback callback, boolean[] zArr) {
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
                    zArr[0] = true;
                    callback.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new l21(1), 220L);
                break;
            case 1:
                boolean[] zArr2 = this.b;
                if (!zArr2[0] && (callback2 = this.c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.FALSE);
                    break;
                }
                break;
            default:
                boolean[] zArr3 = this.b;
                if (!zArr3[0] && (callback3 = this.c) != null) {
                    callback3.run("cancelled");
                    zArr3[0] = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e31(yh.s5 s5Var, boolean[] zArr, Utilities.Callback callback) {
        this.a = 2;
        this.b = zArr;
        this.c = callback;
    }
}
