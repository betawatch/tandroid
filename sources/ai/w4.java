package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w4 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w4(k7 k7Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = k7Var;
        this.b = z10;
        this.e = document;
        this.c = z11;
        this.f = savestargift;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m2((k7) this.d, tLObject, this.b, (TLRPC.Document) this.e, this.c, tL_error, (TL_stars.saveStarGift) this.f));
                break;
            default:
                AndroidUtilities.runOnUIThread(new m2((xh.k) this.d, this.b, (Runnable) this.e, (String) this.f, tL_error, tLObject, this.c));
                break;
        }
    }

    public /* synthetic */ w4(xh.k kVar, boolean z10, xh.e eVar, String str, boolean z11) {
        this.d = kVar;
        this.b = z10;
        this.e = eVar;
        this.f = str;
        this.c = z11;
    }
}
