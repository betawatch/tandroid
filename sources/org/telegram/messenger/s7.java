package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class s7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ int c;

    public /* synthetic */ s7(MediaDataController mediaDataController, int i10, int i11) {
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
