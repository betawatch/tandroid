package f6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements com.google.android.gms.common.api.internal.q {
    public static final /* synthetic */ z b = new z(0);
    public static final /* synthetic */ z c = new z(1);
    public final /* synthetic */ int a;

    public /* synthetic */ z(int i7) {
        this.a = i7;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public final void accept(Object obj, Object obj2) {
        j6.x xVar = (j6.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.a) {
            case 0:
                j6.b bVar = e0.H;
                ((j6.f) xVar.n()).x1();
                taskCompletionSource.setResult(null);
                break;
            default:
                j6.b bVar2 = e0.H;
                j6.f fVar = (j6.f) xVar.n();
                fVar.u1(fVar.p1(), 19);
                taskCompletionSource.setResult(Boolean.TRUE);
                break;
        }
    }
}
