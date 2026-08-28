package h3;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements n8.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ p(Context context, int i9) {
        this.a = i9;
        this.b = context;
    }

    @Override // n8.i
    public final Object get() {
        switch (this.a) {
            case 0:
                return new l(this.b);
            case 1:
                return new j4.m(this.b, new m3.i());
            case 2:
                return new b5.r(this.b, new wa.a(3));
            default:
                return com.google.android.exoplayer2.upstream.u.b(this.b);
        }
    }
}
