// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class j2d extends bgb {
    public final /* synthetic */ agb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2d(agb agbVar, f84[] f84VarArr, boolean z, int i) {
        super(f84VarArr, z, i);
        this.d = agbVar;
    }

    @Override // bgb
    public final void c(xx4 xx4Var, TaskCompletionSource taskCompletionSource) {
        this.d.a.accept(xx4Var, taskCompletionSource);
    }
}
