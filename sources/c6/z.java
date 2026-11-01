package c6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements com.google.android.gms.common.api.internal.s {
    public static final /* synthetic */ z b = new z(0);
    public static final /* synthetic */ z c = new z(1);
    public final /* synthetic */ int a;

    public /* synthetic */ z(int i10) {
        this.a = i10;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void accept(Object obj, Object obj2) {
        g6.w wVar = (g6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.a) {
            case 0:
                g6.b bVar = e0.G;
                ((g6.f) wVar.v()).X0();
                taskCompletionSource.setResult(null);
                break;
            default:
                g6.b bVar2 = e0.G;
                g6.f fVar = (g6.f) wVar.v();
                fVar.U0(fVar.P0(), 19);
                taskCompletionSource.setResult(Boolean.TRUE);
                break;
        }
    }
}
