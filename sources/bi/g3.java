package bi;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ g3(h7 h7Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.a = i10;
        this.b = h7Var;
        this.c = tL_error;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getBulletinFactory().g0(this.c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                this.b.getBulletinFactory().g0(this.c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
