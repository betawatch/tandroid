package bi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ bg.a d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ q2(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, bg.a aVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = h7Var;
        this.c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                h7.D0(this.b, this.c, this.d, this.e, tLObject, tL_error);
                break;
            default:
                h7.s0(this.b, this.c, this.d, this.e, tLObject, tL_error);
                break;
        }
    }
}
