package lh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ lf.a d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ r1(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, lf.a aVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = g5Var;
        this.c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g5.M0(this.b, this.c, this.d, this.e, tLObject, tL_error);
                break;
            default:
                g5.s0(this.b, this.c, this.d, this.e, tLObject, tL_error);
                break;
        }
    }
}
