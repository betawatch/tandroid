package j3;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements p8.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ p(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // p8.i
    public final Object get() {
        switch (this.a) {
            case 0:
                return new l(this.b);
            case 1:
                return new l4.l(this.b, new o3.i());
            case 2:
                return new d5.p(this.b, new ab.b(5));
            default:
                return com.google.android.exoplayer2.upstream.u.b(this.b);
        }
    }
}
