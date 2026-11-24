// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jp8 extends tca {
    public final /* synthetic */ ProfileActivity U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp8(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.U2 = profileActivity;
    }

    @Override // tca
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            gm.d3(new mn8(this, vh6Var, i, (byte) 13), 250L);
        }
    }
}
