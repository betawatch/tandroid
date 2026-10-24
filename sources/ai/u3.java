package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m70;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h3 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ TLObject g;

    public /* synthetic */ u3(org.telegram.ui.ActionBar.h3 h3Var, Object obj, Object obj2, long j10, TLObject tLObject, TLObject tLObject2, int i10) {
        this.a = i10;
        this.c = h3Var;
        this.d = obj;
        this.e = obj2;
        this.b = j10;
        this.f = tLObject;
        this.g = tLObject2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                l7.Q0((l7) this.c, (pf.c) this.d, (ug.l1) this.e, this.b, (TL_stars.TL_starGiftUnique) this.f, (TL_wallet.nftItem) this.g, (TL_stars.starGiftDepositPayload) obj);
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e((m70) this.c, (org.telegram.ui.ActionBar.c2) this.d, (Context) this.e, this.b, (TLRPC.TL_chatInviteExported) this.f, (TLRPC.TL_chatInviteImporter) this.g, (TLRPC.ChannelParticipant) obj));
                break;
        }
    }
}
