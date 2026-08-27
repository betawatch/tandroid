package m5;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements com.google.android.gms.common.api.internal.s {
    public static final /* synthetic */ a0 b = new a0(0);
    public static final /* synthetic */ a0 c = new a0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ a0(int i10) {
        this.a = i10;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void accept(Object obj, Object obj2) {
        r5.x xVar = (r5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.a) {
            case 0:
                r5.b bVar = f0.G;
                ((r5.f) xVar.u()).U0();
                taskCompletionSource.setResult(null);
                break;
            default:
                r5.b bVar2 = f0.G;
                r5.f fVar = (r5.f) xVar.u();
                fVar.R0(fVar.M0(), 19);
                taskCompletionSource.setResult(Boolean.TRUE);
                break;
        }
    }
}
