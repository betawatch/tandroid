package fi;

import org.telegram.messenger.c20;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c20 b;

    public /* synthetic */ k9(c20 c20Var, int i7) {
        this.a = i7;
        this.b = c20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(LaunchActivity.T());
                break;
            case 1:
                org.telegram.messenger.g0.h3(new k9(this.b, 3));
                break;
            case 2:
                this.b.a(null);
                break;
            default:
                this.b.a(null);
                break;
        }
    }
}
