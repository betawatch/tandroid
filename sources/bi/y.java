package bi;

import android.content.Context;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class y extends zh.k8 {
    public final /* synthetic */ Utilities.Callback[] m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, b bVar, Utilities.Callback[] callbackArr) {
        super(context, bVar);
        this.m0 = callbackArr;
    }

    @Override // zh.k8
    public final void e(int i10) {
        this.m0[0].run(Integer.valueOf(i10));
    }
}
