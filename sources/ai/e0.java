package ai;

import android.content.Context;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class e0 extends yh.l8 {
    public final /* synthetic */ Utilities.Callback[] m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Context context, d dVar, Utilities.Callback[] callbackArr) {
        super(context, dVar);
        this.m0 = callbackArr;
    }

    @Override // yh.l8
    public final void e(int i10) {
        this.m0[0].run(Integer.valueOf(i10));
    }
}
