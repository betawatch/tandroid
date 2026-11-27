// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
