package di;

import android.content.Context;
import bi.yd;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class t extends yd {
    public final /* synthetic */ Utilities.Callback[] m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, b bVar, Utilities.Callback[] callbackArr) {
        super(context, bVar);
        this.m0 = callbackArr;
    }

    @Override // bi.yd
    public final void e(int i10) {
        this.m0[0].run(Integer.valueOf(i10));
    }
}
