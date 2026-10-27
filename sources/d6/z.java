package d6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements com.google.android.gms.common.api.internal.r {
    public static final /* synthetic */ z b = new z(0);
    public static final /* synthetic */ z c = new z(1);
    public final /* synthetic */ int a;

    public /* synthetic */ z(int i10) {
        this.a = i10;
    }

    @Override // com.google.android.gms.common.api.internal.r
    public final void accept(Object obj, Object obj2) {
        h6.w wVar = (h6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.a) {
            case 0:
                h6.b bVar = e0.G;
                ((h6.f) wVar.u()).V0();
                taskCompletionSource.setResult(null);
                break;
            default:
                h6.b bVar2 = e0.G;
                h6.f fVar = (h6.f) wVar.u();
                fVar.S0(fVar.N0(), 19);
                taskCompletionSource.setResult(Boolean.TRUE);
                break;
        }
    }
}
