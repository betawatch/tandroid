// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class in8 extends taa {
    public final /* synthetic */ ProfileActivity U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in8(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.U2 = profileActivity;
    }

    @Override // taa
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            gl.e3(new ll8(this, vf6Var, i, (byte) 11), 250L);
        }
    }
}
