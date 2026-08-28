package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.dy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class y2 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object g;

    public /* synthetic */ y2(k5 k5Var, ve.d dVar, org.telegram.ui.ActionBar.c2 c2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.d = k5Var;
        this.e = dVar;
        this.b = c2Var;
        this.f = tL_starGiftUnique;
        this.c = j10;
        this.g = charSequence;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b3((k5) this.d, (ve.d) this.e, this.b, tLObject, (TL_stars.TL_starGiftUnique) this.f, tL_error, this.c, (CharSequence) this.g));
                break;
            default:
                AndroidUtilities.runOnUIThread(new b3((dy) this.d, this.b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f, this.c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.g));
                break;
        }
    }

    public /* synthetic */ y2(dy dyVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = dyVar;
        this.b = c2Var;
        this.e = user;
        this.f = chat;
        this.c = j10;
        this.g = tL_messages_checkHistoryImportPeer;
    }
}
