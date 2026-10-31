package oh;

import org.telegram.messenger.i0;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import rh.e4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g(q qVar, boolean z10, f fVar, String str, boolean z11) {
        this.d = qVar;
        this.b = z10;
        this.e = fVar;
        this.f = str;
        this.c = z11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                i0.g3(new h((q) this.d, this.b, (Runnable) this.e, (String) this.f, tL_error, tLObject, this.c));
                break;
            default:
                i0.g3(new h((e4) this.d, tLObject, this.b, (TLRPC.Document) this.e, this.c, tL_error, (TL_stars.saveStarGift) this.f));
                break;
        }
    }

    public /* synthetic */ g(e4 e4Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = e4Var;
        this.b = z10;
        this.e = document;
        this.c = z11;
        this.f = savestargift;
    }
}
