package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class u3 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u3(c6 c6Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = c6Var;
        this.b = z10;
        this.e = document;
        this.c = z11;
        this.f = savestargift;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new x1((c6) this.d, tLObject, this.b, (TLRPC.Document) this.e, this.c, tL_error, (TL_stars.saveStarGift) this.f));
                break;
            default:
                org.telegram.messenger.g0.h3(new x1((zh.l) this.d, this.b, (Runnable) this.e, (String) this.f, tL_error, tLObject, this.c));
                break;
        }
    }

    public /* synthetic */ u3(zh.l lVar, boolean z10, zh.e eVar, String str, boolean z11) {
        this.d = lVar;
        this.b = z10;
        this.e = eVar;
        this.f = str;
        this.c = z11;
    }
}
