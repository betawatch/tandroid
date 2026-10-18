package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.l70;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ TLObject g;

    public /* synthetic */ s3(org.telegram.ui.ActionBar.f3 f3Var, Object obj, Object obj2, long j10, TLObject tLObject, TLObject tLObject2, int i10) {
        this.a = i10;
        this.c = f3Var;
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
                k7.Q0((k7) this.c, (pf.c) this.d, (ug.m1) this.e, this.b, (TL_stars.TL_starGiftUnique) this.f, (TL_wallet.nftItem) this.g, (TL_stars.starGiftDepositPayload) obj);
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e((l70) this.c, (org.telegram.ui.ActionBar.b2) this.d, (Context) this.e, this.b, (TLRPC.TL_chatInviteExported) this.f, (TLRPC.TL_chatInviteImporter) this.g, (TLRPC.ChannelParticipant) obj));
                break;
        }
    }
}
