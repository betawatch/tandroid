// default package

import android.content.Context;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
