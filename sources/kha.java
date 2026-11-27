// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class kha extends kea {
    public final /* synthetic */ e U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kha(Context context, String str, String str2, vnb vnbVar, e eVar) {
        super(context, null, str, false, str2, false, vnbVar);
        this.U2 = eVar;
    }

    @Override // kea
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        hl.d3(new a39(this.U2, zh6Var, i, (byte) 8), 100L);
    }
}
