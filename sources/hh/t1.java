package hh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class t1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ hf.a d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ t1(i5 i5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, hf.a aVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = i5Var;
        this.c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                i5.M0(this.b, this.c, this.d, this.e, tLObject, tL_error);
                break;
            default:
                i5.s0(this.b, this.c, this.d, this.e, tLObject, tL_error);
                break;
        }
    }
}
