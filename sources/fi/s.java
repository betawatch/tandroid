package fi;

import android.content.Context;
import di.jc;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class s extends jc {
    public final /* synthetic */ x10[] n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, b bVar, x10[] x10VarArr) {
        super(context, bVar);
        this.n0 = x10VarArr;
    }

    @Override // di.jc
    public final void e(int i7) {
        this.n0[0].a(Integer.valueOf(i7));
    }
}
