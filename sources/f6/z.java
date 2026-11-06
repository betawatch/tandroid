package f6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                ((j6.f) wVar.n()).X0();
                taskCompletionSource.setResult(null);
                break;
            default:
                j6.b bVar2 = e0.H;
                j6.f fVar = (j6.f) wVar.n();
                fVar.U0(fVar.P0(), 19);
                taskCompletionSource.setResult(Boolean.TRUE);
                break;
        }
    }
}
