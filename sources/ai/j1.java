package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.b3;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ String c;

    public /* synthetic */ j1(String str, Utilities.Callback callback) {
        this.c = str;
        this.b = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.f(17, this.b, h.c(this.c, AndroidUtilities.dp(240.0f), jc.c.c, 0.75f, null)));
                break;
            default:
                this.b.run(this.c);
                break;
        }
    }

    public /* synthetic */ j1(b3 b3Var, String str) {
        this.b = b3Var;
        this.c = str;
    }
}
