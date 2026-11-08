package f6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements com.google.android.gms.common.api.internal.p {
    public static final /* synthetic */ z b = new z(0);
    public static final /* synthetic */ z c = new z(1);
    public final /* synthetic */ int a;

    public /* synthetic */ z(int i7) {
        this.a = i7;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final void accept(Object obj, Object obj2) {
        j6.w wVar = (j6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.a) {
            case 0:
                j6.b bVar = e0.H;
                ((j6.f) wVar.n()).x1();
                taskCompletionSource.setResult(null);
                break;
            default:
                j6.b bVar2 = e0.H;
                j6.f fVar = (j6.f) wVar.n();
                fVar.u1(fVar.p1(), 19);
                taskCompletionSource.setResult(Boolean.TRUE);
                break;
        }
    }
}
