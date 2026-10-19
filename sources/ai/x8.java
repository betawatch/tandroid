package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.df0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class x8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ x8(int i10, Utilities.Callback callback, boolean[] zArr) {
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
                AndroidUtilities.runOnUIThread(new df0(4), 220L);
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

    public /* synthetic */ x8(ga gaVar, boolean[] zArr, Utilities.Callback callback) {
        this.a = 0;
        this.b = zArr;
        this.c = callback;
    }
}
