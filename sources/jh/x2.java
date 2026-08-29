package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.fy;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x2 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object g;

    public /* synthetic */ x2(h5 h5Var, ye.c cVar, org.telegram.ui.ActionBar.c2 c2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.d = h5Var;
        this.e = cVar;
        this.b = c2Var;
        this.f = tL_starGiftUnique;
        this.c = j10;
        this.g = charSequence;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3((h5) this.d, (ye.c) this.e, this.b, tLObject, (TL_stars.TL_starGiftUnique) this.f, tL_error, this.c, (CharSequence) this.g));
                break;
            default:
                AndroidUtilities.runOnUIThread(new a3((fy) this.d, this.b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f, this.c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.g));
                break;
        }
    }

    public /* synthetic */ x2(fy fyVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = fyVar;
        this.b = c2Var;
        this.e = user;
        this.f = chat;
        this.c = j10;
        this.g = tL_messages_checkHistoryImportPeer;
    }
}
