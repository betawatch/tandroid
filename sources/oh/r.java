package oh;

import android.content.Context;
import mh.bb;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class r extends bb {
    public final /* synthetic */ Utilities.Callback[] j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, b bVar, Utilities.Callback[] callbackArr) {
        super(context, bVar);
        this.j0 = callbackArr;
    }

    @Override // mh.bb
    public final void e(int i10) {
        this.j0[0].run(Integer.valueOf(i10));
    }
}
