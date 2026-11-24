// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lxa extends zc2 {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ uxa e1;
    public final /* synthetic */ nxa f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxa(nxa nxaVar, long j, long j2, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z, boolean[] zArr, uxa uxaVar) {
        super(j, j2, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z, null);
        this.f1 = nxaVar;
        this.d1 = zArr;
        this.e1 = uxaVar;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z && z2 && this.d1[0]) {
            uxa uxaVar = this.e1;
            if (u21.a(uxaVar)) {
                u21.C(this.f1.a.first_name, uxaVar).j();
            }
        }
    }
}
