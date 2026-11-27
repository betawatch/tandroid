// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class gq8 implements md2 {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ pd2 b;
    public final /* synthetic */ ProfileActivity c;

    public gq8(ProfileActivity profileActivity, TLRPC.Chat chat, pd2 pd2Var) {
        this.c = profileActivity;
        this.a = chat;
        this.b = pd2Var;
    }

    @Override // md2
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.M.m(-profileActivity.f1, user, profileActivity.F2.megagroup ? 10 : 9);
    }

    @Override // md2
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User X1 = profileActivity.getMessagesController().X1(Long.valueOf(profileActivity.e1));
        if (X1 == null || (chat = this.a) == null || profileActivity.e1 == 0) {
            return;
        }
        pd2 pd2Var = this.b;
        if (!pd2Var.R || pd2Var.getParentLayout() == null) {
            return;
        }
        for (e eVar : pd2Var.getParentLayout().getFragmentStack()) {
            if (eVar instanceof wf1) {
                wf1 wf1Var = (wf1) eVar;
                wf1Var.Z0();
                hl.c3(new sa8(wf1Var, X1, chat, (byte) 9));
                return;
            }
        }
    }
}
