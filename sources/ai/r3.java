package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.l70;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r3 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object g;

    public /* synthetic */ r3(k7 k7Var, pf.c cVar, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_wallet.nftItem nftitem, ug.l1 l1Var) {
        this.c = k7Var;
        this.d = cVar;
        this.b = j10;
        this.e = tL_starGiftUnique;
        this.f = nftitem;
        this.g = l1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                k7.j1((k7) this.c, (pf.c) this.d, this.b, (TL_stars.TL_starGiftUnique) this.e, (TL_wallet.nftItem) this.f, (ug.l1) this.g, (TL_stars.starGiftDepositPayload) obj);
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e((l70) this.c, (org.telegram.ui.ActionBar.b2) this.d, (Context) this.e, this.b, (TLRPC.TL_chatInviteExported) this.f, (TLRPC.TL_chatInviteImporter) this.g, (TLRPC.ChannelParticipant) obj));
                break;
        }
    }

    public /* synthetic */ r3(l70 l70Var, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.c = l70Var;
        this.d = b2Var;
        this.e = context;
        this.b = j10;
        this.f = tL_chatInviteExported;
        this.g = tL_chatInviteImporter;
    }
}
