package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessagesMetadataController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.th0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d0(Object obj, int i10, Object obj2, long j10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h0((m0) this.d, (l0) this.e, this.b, tLObject, this.c, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new da((fi.d) this.d, (org.telegram.ui.ActionBar.k3[]) this.e, this.b, this.c, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new h0(this.d, tLObject, this.b, this.e, this.c, 2));
                break;
            case 3:
                ((ChatMessagesMetadataController) this.d).lambda$loadStoriesForMessages$2(this.b, (MessageObject) this.e, this.c, tLObject, tL_error);
                break;
            case 4:
                ((MediaDataController) this.d).lambda$loadStickers$101(this.b, (Utilities.Callback) this.e, this.c, tLObject, tL_error);
                break;
            case 5:
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$166(this.b, (TLRPC.TL_help_promoData) this.e, this.c, tLObject, tL_error);
                break;
            default:
                AndroidUtilities.runOnUIThread(new a9((th0) this.d, tL_error, tLObject, this.c, this.b, (TLRPC.Chat) this.e));
                break;
        }
    }

    public /* synthetic */ d0(Object obj, Object obj2, int i10, long j10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = j10;
    }

    public /* synthetic */ d0(th0 th0Var, long j10, int i10, TLRPC.Chat chat) {
        this.a = 6;
        this.d = th0Var;
        this.c = j10;
        this.b = i10;
        this.e = chat;
    }
}
