package gh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class t1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ gf.a d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ t1(k5 k5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, gf.a aVar, Runnable runnable, int i9) {
        this.a = i9;
        this.b = k5Var;
        this.c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                k5.M0(this.b, this.c, this.d, this.e, tLObject, tL_error);
                break;
            default:
                k5.r0(this.b, this.c, this.d, this.e, tLObject, tL_error);
                break;
        }
    }
}
