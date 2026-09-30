package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class m7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ int c;

    public /* synthetic */ m7(MediaDataController mediaDataController, int i10, int i11) {
        this.a = i11;
        this.b = mediaDataController;
        this.c = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$loadArchivedStickersCount$72(this.c, tLObject, tL_error);
                break;
            case 1:
                this.b.lambda$fetchEmojiStatuses$234(this.c, tLObject, tL_error);
                break;
            case 2:
                this.b.lambda$loadRecents$50(this.c, tLObject, tL_error);
                break;
            default:
                this.b.lambda$loadRecents$51(this.c, tLObject, tL_error);
                break;
        }
    }
}
