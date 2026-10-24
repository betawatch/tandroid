package ai;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ k3(l7 l7Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.a = i10;
        this.b = l7Var;
        this.c = tL_error;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getBulletinFactory().f0(this.c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                this.b.getBulletinFactory().f0(this.c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
