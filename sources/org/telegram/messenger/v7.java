package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class v7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ int c;

    public /* synthetic */ v7(MediaDataController mediaDataController, int i10, int i11) {
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
