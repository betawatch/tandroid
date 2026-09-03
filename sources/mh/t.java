package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessagesMetadataController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.xh0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t(int i10, qh.d dVar, org.telegram.ui.ActionBar.h3 h3Var, long j10) {
        this.a = 6;
        this.b = i10;
        this.d = dVar;
        this.e = h3Var;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new lh.x((a0) this.d, (z) this.e, this.b, tLObject, this.c, 1));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new y8((qh.d) this.d, (org.telegram.ui.ActionBar.h3[]) this.e, this.b, this.c, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new lh.x((oh.t6) this.d, tLObject, this.b, (String) this.e, this.c, 3));
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
                AndroidUtilities.runOnUIThread(new u6(tLObject, this.b, (qh.d) this.d, (org.telegram.ui.ActionBar.h3) this.e, this.c, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new u6((xh0) this.d, tL_error, tLObject, this.c, this.b, (TLRPC.Chat) this.e));
                break;
        }
    }

    public /* synthetic */ t(Object obj, int i10, Object obj2, long j10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.c = j10;
    }

    public /* synthetic */ t(Object obj, Object obj2, int i10, long j10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = j10;
    }

    public /* synthetic */ t(xh0 xh0Var, long j10, int i10, TLRPC.Chat chat) {
        this.a = 7;
        this.d = xh0Var;
        this.c = j10;
        this.b = i10;
        this.e = chat;
    }
}
