package bi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.o70;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.k3 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ TLObject g;

    public /* synthetic */ q3(org.telegram.ui.ActionBar.k3 k3Var, Object obj, Object obj2, long j10, TLObject tLObject, TLObject tLObject2, int i10) {
        this.a = i10;
        this.c = k3Var;
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
                h7.Q0((h7) this.c, (qf.c) this.d, (vg.n1) this.e, this.b, (TL_stars.TL_starGiftUnique) this.f, (TL_wallet.nftItem) this.g, (TL_stars.starGiftDepositPayload) obj);
                break;
            default:
                AndroidUtilities.runOnUIThread(new ag.m0((o70) this.c, (org.telegram.ui.ActionBar.e2) this.d, (Context) this.e, this.b, (TLRPC.TL_chatInviteExported) this.f, (TLRPC.TL_chatInviteImporter) this.g, (TLRPC.ChannelParticipant) obj));
                break;
        }
    }
}
