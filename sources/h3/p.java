package h3;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements o8.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ p(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // o8.i
    public final Object get() {
        switch (this.a) {
            case 0:
                return new l(this.b);
            case 1:
                return new j4.l(this.b, new m3.i());
            case 2:
                return new b5.q(this.b, new ab.a(3));
            default:
                return com.google.android.exoplayer2.upstream.u.b(this.b);
        }
    }
}
