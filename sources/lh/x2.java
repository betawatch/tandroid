package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.oy;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x2 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object g;

    public /* synthetic */ x2(g5 g5Var, af.f fVar, org.telegram.ui.ActionBar.d2 d2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.d = g5Var;
        this.e = fVar;
        this.b = d2Var;
        this.f = tL_starGiftUnique;
        this.c = j10;
        this.g = charSequence;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3((g5) this.d, (af.f) this.e, this.b, tLObject, (TL_stars.TL_starGiftUnique) this.f, tL_error, this.c, (CharSequence) this.g));
                break;
            default:
                AndroidUtilities.runOnUIThread(new a3((oy) this.d, this.b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f, this.c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.g));
                break;
        }
    }

    public /* synthetic */ x2(oy oyVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = oyVar;
        this.b = d2Var;
        this.e = user;
        this.f = chat;
        this.c = j10;
        this.g = tL_messages_checkHistoryImportPeer;
    }
}
