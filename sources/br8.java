// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class br8 implements md2 {
    public final /* synthetic */ uj3 a;
    public final /* synthetic */ cr8 b;

    public br8(cr8 cr8Var, uj3 uj3Var) {
        this.b = cr8Var;
        this.a = uj3Var;
    }

    @Override // md2
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.b.b;
        profileActivity.N1 = true;
        this.a.removeSelfFromStack();
        jn7 notificationCenter = profileActivity.getNotificationCenter();
        int i2 = jn7.s;
        notificationCenter.n(profileActivity, i2);
        profileActivity.getNotificationCenter().k(i2, new Object[0]);
    }

    @Override // md2
    public final void a(TLRPC.User user) {
    }
}
