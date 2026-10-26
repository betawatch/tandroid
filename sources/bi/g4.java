package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.cy;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g4 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object g;

    public /* synthetic */ g4(h7 h7Var, qf.c cVar, org.telegram.ui.ActionBar.e2 e2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.d = h7Var;
        this.e = cVar;
        this.b = e2Var;
        this.f = tL_starGiftUnique;
        this.c = j10;
        this.g = charSequence;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4((h7) this.d, (qf.c) this.e, this.b, tLObject, (TL_stars.TL_starGiftUnique) this.f, tL_error, this.c, (CharSequence) this.g));
                break;
            default:
                AndroidUtilities.runOnUIThread(new l4((cy) this.d, this.b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f, this.c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.g));
                break;
        }
    }

    public /* synthetic */ g4(cy cyVar, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = cyVar;
        this.b = e2Var;
        this.e = user;
        this.f = chat;
        this.c = j10;
        this.g = tL_messages_checkHistoryImportPeer;
    }
}
