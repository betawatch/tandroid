package m5;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements com.google.android.gms.common.api.internal.s {
    public static final /* synthetic */ z b = new z(0);
    public static final /* synthetic */ z c = new z(1);
    public final /* synthetic */ int a;

    public /* synthetic */ z(int i9) {
        this.a = i9;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void accept(Object obj, Object obj2) {
        q5.x xVar = (q5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.a) {
            case 0:
                q5.b bVar = f0.G;
                ((q5.f) xVar.u()).U0();
                taskCompletionSource.setResult(null);
                break;
            default:
                q5.b bVar2 = f0.G;
                q5.f fVar = (q5.f) xVar.u();
                fVar.R0(fVar.M0(), 19);
                taskCompletionSource.setResult(Boolean.TRUE);
                break;
        }
    }
}
