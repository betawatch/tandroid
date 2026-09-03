package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessagesMetadataController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.yh0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u(int i10, ph.d dVar, org.telegram.ui.ActionBar.g3 g3Var, long j10) {
        this.a = 6;
        this.b = i10;
        this.d = dVar;
        this.e = g3Var;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kh.x((b0) this.d, (a0) this.e, this.b, tLObject, this.c, 1));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new y8((ph.d) this.d, (org.telegram.ui.ActionBar.g3[]) this.e, this.b, this.c, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new kh.x((nh.t6) this.d, tLObject, this.b, (String) this.e, this.c, 3));
                break;
            case 3:
                ((ChatMessagesMetadataController) this.d).lambda$loadStoriesForMessages$2(this.b, (MessageObject) this.e, this.c, tLObject, tL_error);
                break;
            case 4:
                ((MediaDataController) this.d).lambda$loadStickers$101(this.b, (Utilities.Callback) this.e, this.c, tLObject, tL_error);
                break;
            case 5:
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$167(this.b, (TLRPC.TL_help_promoData) this.e, this.c, tLObject, tL_error);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new u6(tLObject, this.b, (ph.d) this.d, (org.telegram.ui.ActionBar.g3) this.e, this.c, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new u6((yh0) this.d, tL_error, tLObject, this.c, this.b, (TLRPC.Chat) this.e));
                break;
        }
    }

    public /* synthetic */ u(Object obj, int i10, Object obj2, long j10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.c = j10;
    }

    public /* synthetic */ u(Object obj, Object obj2, int i10, long j10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = j10;
    }

    public /* synthetic */ u(yh0 yh0Var, long j10, int i10, TLRPC.Chat chat) {
        this.a = 7;
        this.d = yh0Var;
        this.c = j10;
        this.b = i10;
        this.e = chat;
    }
}
