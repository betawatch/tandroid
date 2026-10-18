package ai;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ ag.a d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ s2(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = k7Var;
        this.c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                k7.F0(this.b, this.c, this.d, this.e, tLObject, tL_error);
                break;
            default:
                k7.v0(this.b, this.c, this.d, this.e, tLObject, tL_error);
                break;
        }
    }
}
