package di;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class y3 extends v3 {
    public final /* synthetic */ String k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(int i10, Context context, bi.b bVar, float f7, String str) {
        super(i10, context, bVar, null, true, f7, false, false);
        this.k0 = str;
    }

    @Override // di.v3
    public final String getTitle() {
        return this.k0;
    }
}
