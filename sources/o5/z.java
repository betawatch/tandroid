package o5;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        s5.x xVar = (s5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.a) {
            case 0:
                s5.b bVar = e0.G;
                ((s5.f) xVar.u()).U0();
                taskCompletionSource.setResult(null);
                break;
            default:
                s5.b bVar2 = e0.G;
                s5.f fVar = (s5.f) xVar.u();
                fVar.R0(fVar.M0(), 19);
                taskCompletionSource.setResult(Boolean.TRUE);
                break;
        }
    }
}
