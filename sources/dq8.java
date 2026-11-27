// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
            hl.d3(new hp8(this, zh6Var, i, (byte) 8), 250L);
        }
    }
}
