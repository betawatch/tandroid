package lh;

import android.content.Context;
import jh.ab;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class r extends ab {
    public final /* synthetic */ Utilities.Callback[] i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, b bVar, Utilities.Callback[] callbackArr) {
        super(context, bVar);
        this.i0 = callbackArr;
    }

    @Override // jh.ab
    public final void e(int i10) {
        this.i0[0].run(Integer.valueOf(i10));
    }
}
