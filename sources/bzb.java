// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class bzb extends lt5 {
    public final /* synthetic */ long u2;
    public final /* synthetic */ dzb v2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzb(dzb dzbVar, Context context, int i, zh6 zh6Var, long j, e eVar, long j2) {
        super(context, i, zh6Var, j, eVar, null);
        this.v2 = dzbVar;
        this.u2 = j2;
    }

    @Override // lt5
    public final boolean N0() {
        TLRPC.Chat M0 = this.v2.b.getMessagesController().M0(Long.valueOf(this.u2));
        return M0 != null && xc2.y(3, M0);
    }
}
