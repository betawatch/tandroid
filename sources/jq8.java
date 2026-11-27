// default package

import android.content.Context;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class jq8 extends et8 {
    public final /* synthetic */ ProfileActivity t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq8(ProfileActivity profileActivity, Context context, long j, a aVar, zp8 zp8Var, iq8 iq8Var, at8 at8Var, ws8 ws8Var) {
        super(context, j, aVar, zp8Var, iq8Var, at8Var, ws8Var);
        this.t1 = profileActivity;
    }

    @Override // et8
    public final void setCustomAvatarProgress(float f) {
        ProfileActivity profileActivity = this.t1;
        profileActivity.t5 = f;
        profileActivity.I1();
    }
}
