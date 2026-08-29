package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessagesMetadataController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.oh0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u(int i10, nh.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j10) {
        this.a = 6;
        this.b = i10;
        this.d = dVar;
        this.e = f3Var;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ih.y((b0) this.d, (a0) this.e, this.b, tLObject, this.c, 1));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new x8((nh.d) this.d, (org.telegram.ui.ActionBar.f3[]) this.e, this.b, this.c, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ih.y((lh.s6) this.d, tLObject, this.b, (String) this.e, this.c, 3));
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
                AndroidUtilities.runOnUIThread(new t6(tLObject, this.b, (nh.d) this.d, (org.telegram.ui.ActionBar.f3) this.e, this.c, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new t6((oh0) this.d, tL_error, tLObject, this.c, this.b, (TLRPC.Chat) this.e));
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

    public /* synthetic */ u(oh0 oh0Var, long j10, int i10, TLRPC.Chat chat) {
        this.a = 7;
        this.d = oh0Var;
        this.c = j10;
        this.b = i10;
        this.e = chat;
    }
}
