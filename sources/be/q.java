package be;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
