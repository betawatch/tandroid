package be;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class q implements rd.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                zd.m mVar = (zd.m) this.b;
                gd.k kVar = gd.k.a;
                mVar.resumeWith(kVar);
                return kVar;
            default:
                ((CancellationSignal) this.b).cancel();
                return gd.k.a;
        }
    }
}
