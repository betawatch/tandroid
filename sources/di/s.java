package di;

import android.content.Context;
import bi.zd;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class s extends zd {
    public final /* synthetic */ c20[] m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, b bVar, c20[] c20VarArr) {
        super(context, bVar);
        this.m0 = c20VarArr;
    }

    @Override // bi.zd
    public final void e(int i7) {
        this.m0[0].a(Integer.valueOf(i7));
    }
}
