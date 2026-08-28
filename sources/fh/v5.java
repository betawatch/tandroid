package fh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.eb0;
import org.telegram.ui.zo0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class v5 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ gf.b b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v5(f6 f6Var, org.telegram.ui.ActionBar.c2 c2Var, gf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = f6Var;
        this.f = c2Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                f6.T((f6) this.e, (org.telegram.ui.ActionBar.c2) this.f, this.b, this.c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
            default:
                zo0.T((zo0) this.e, this.b, this.c, this.d, (eb0) this.f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
        }
    }

    public /* synthetic */ v5(zo0 zo0Var, gf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, eb0 eb0Var) {
        this.e = zo0Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j10;
        this.f = eb0Var;
    }
}
