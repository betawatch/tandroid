// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class eg2 extends ke2 {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ long e1;
    public final /* synthetic */ wg2 f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg2(wg2 wg2Var, long j, long j2, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i, boolean[] zArr, long j3) {
        super(j, j2, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i, true, false, null);
        this.f1 = wg2Var;
        this.d1 = zArr;
        this.e1 = j3;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z && z2 && this.d1[0]) {
            wg2 wg2Var = this.f1;
            if (c41.a(wg2Var)) {
                long j = this.e1;
                if (j > 0) {
                    TLRPC.User W1 = getMessagesController().W1(Long.valueOf(j));
                    if (W1 != null) {
                        c41.C(W1.first_name, wg2Var).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j));
                if (L0 != null) {
                    c41.C(L0.title, wg2Var).j();
                }
            }
        }
    }
}
