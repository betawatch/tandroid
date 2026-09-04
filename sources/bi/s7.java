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
import org.telegram.ui.gi0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class s7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s7(int i10, di.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j3) {
        this.a = 4;
        this.b = i10;
        this.d = dVar;
        this.e = f3Var;
        this.c = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u7((u8) this.d, tLObject, this.b, (String) this.e, this.c, 0));
                break;
            case 1:
                ((ChatMessagesMetadataController) this.d).lambda$loadStoriesForMessages$2(this.b, (MessageObject) this.e, this.c, tLObject, tL_error);
                break;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$101(this.b, (Utilities.Callback) this.e, this.c, tLObject, tL_error);
                break;
            case 3:
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$167(this.b, (TLRPC.TL_help_promoData) this.e, this.c, tLObject, tL_error);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new fi.p3(tLObject, this.b, (di.d) this.d, (org.telegram.ui.ActionBar.f3) this.e, this.c, tL_error));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new fi.p3((gi0) this.d, tL_error, tLObject, this.c, this.b, (TLRPC.Chat) this.e, 4));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new u7((zh.o) this.d, (zh.n) this.e, this.b, tLObject, this.c));
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.j7((di.d) this.d, (org.telegram.ui.ActionBar.f3[]) this.e, this.b, this.c, 14));
                break;
        }
    }

    public /* synthetic */ s7(Object obj, int i10, Object obj2, long j3, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.c = j3;
    }

    public /* synthetic */ s7(Object obj, Object obj2, int i10, long j3, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = j3;
    }

    public /* synthetic */ s7(gi0 gi0Var, long j3, int i10, TLRPC.Chat chat) {
        this.a = 5;
        this.d = gi0Var;
        this.c = j3;
        this.b = i10;
        this.e = chat;
    }
}
