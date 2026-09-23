package ai;

import android.content.Context;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
