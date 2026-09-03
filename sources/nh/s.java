package nh;

import android.content.Context;
import lh.bb;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class s extends bb {
    public final /* synthetic */ Utilities.Callback[] j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, b bVar, Utilities.Callback[] callbackArr) {
        super(context, bVar);
        this.j0 = callbackArr;
    }

    @Override // lh.bb
    public final void e(int i10) {
        this.j0[0].run(Integer.valueOf(i10));
    }
}
