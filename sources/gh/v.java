package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessagesMetadataController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ph0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v(int i9, kh.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j10) {
        this.a = 6;
        this.b = i9;
        this.d = dVar;
        this.e = f3Var;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fh.c0((c0) this.d, (b0) this.e, this.b, tLObject, this.c, 1));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new c9((kh.d) this.d, (org.telegram.ui.ActionBar.f3[]) this.e, this.b, this.c, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new fh.c0((ih.v6) this.d, tLObject, this.b, (String) this.e, this.c, 3));
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
                AndroidUtilities.runOnUIThread(new w6(tLObject, this.b, (kh.d) this.d, (org.telegram.ui.ActionBar.f3) this.e, this.c, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new w6((ph0) this.d, tL_error, tLObject, this.c, this.b, (TLRPC.Chat) this.e));
                break;
        }
    }

    public /* synthetic */ v(Object obj, int i9, Object obj2, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i9;
        this.e = obj2;
        this.c = j10;
    }

    public /* synthetic */ v(Object obj, Object obj2, int i9, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = i9;
        this.c = j10;
    }

    public /* synthetic */ v(ph0 ph0Var, long j10, int i9, TLRPC.Chat chat) {
        this.a = 7;
        this.d = ph0Var;
        this.c = j10;
        this.b = i9;
        this.e = chat;
    }
}
