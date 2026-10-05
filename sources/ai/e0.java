package ai;

import android.content.Context;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class e0 extends yh.o8 {
    public final /* synthetic */ Utilities.Callback[] m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Context context, d dVar, Utilities.Callback[] callbackArr) {
        super(context, dVar);
        this.m0 = callbackArr;
    }

    @Override // yh.o8
    public final void e(int i10) {
        this.m0[0].run(Integer.valueOf(i10));
    }
}
