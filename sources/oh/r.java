package oh;

import android.content.Context;
import mh.bb;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
