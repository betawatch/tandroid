package d6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
