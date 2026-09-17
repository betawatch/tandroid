package c6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
                ((g6.f) wVar.u()).W0();
                taskCompletionSource.setResult(null);
                break;
            default:
                g6.b bVar2 = e0.G;
                g6.f fVar = (g6.f) wVar.u();
                fVar.T0(fVar.O0(), 19);
                taskCompletionSource.setResult(Boolean.TRUE);
                break;
        }
    }
}
