// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dq8 extends kea {
    public final /* synthetic */ eq8 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq8(eq8 eq8Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.U2 = eq8Var;
    }

    @Override // kea
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            hl.d3(new ep8(this, zh6Var, i, (byte) 9), 250L);
        }
    }
}
