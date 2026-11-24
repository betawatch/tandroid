// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ft implements v2b {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ ht c;

    public ft(ht htVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = htVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // v2b
    public final void a() {
        mu8 mu8Var = ((et) this.a).f;
        if (mu8Var != null) {
            mu8Var.a(true, true);
        }
        vh6 vh6Var = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        vh6Var.k(stickerSetCovered, stickerSetCovered.set.id);
    }
}
