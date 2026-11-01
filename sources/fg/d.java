package fg;

import org.telegram.messenger.at;
import org.telegram.ui.ActionBar.s6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s6 b;

    public /* synthetic */ d(s6 s6Var, int i10) {
        this.a = i10;
        this.b = s6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        s6 s6Var = this.b;
        switch (i10) {
            case 0:
                at.e().k(at.t4, s6Var, Boolean.TRUE, null, -1);
                break;
            default:
                s6Var.s();
                break;
        }
    }
}
