// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class a7d extends xjb {
    public final /* synthetic */ wjb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7d(wjb wjbVar, a94[] a94VarArr, boolean z, int i) {
        super(a94VarArr, z, i);
        this.d = wjbVar;
    }

    @Override // xjb
    public final void c(d05 d05Var, TaskCompletionSource taskCompletionSource) {
        this.d.a.accept(d05Var, taskCompletionSource);
    }
}
