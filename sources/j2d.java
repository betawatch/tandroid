// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
