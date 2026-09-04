package di;

import android.content.Context;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class a4 extends x3 {
    public final /* synthetic */ String k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(int i10, Context context, bi.b bVar, float f7, String str) {
        super(i10, context, bVar, null, true, f7, false, false);
        this.k0 = str;
    }

    @Override // di.x3
    public final String getTitle() {
        return this.k0;
    }
}
