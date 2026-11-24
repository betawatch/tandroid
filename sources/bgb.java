// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class bgb {
    public final f84[] a;
    public final boolean b;
    public final char c;

    /* JADX WARN: Multi-variable type inference failed */
    public bgb(f84[] f84VarArr, boolean z, int i) {
        this.a = f84VarArr;
        boolean z2 = false;
        if (f84VarArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }

    public static agb b() {
        agb agbVar = new agb();
        agbVar.b = true;
        agbVar.d = (char) 0;
        return agbVar;
    }

    public abstract void c(xx4 xx4Var, TaskCompletionSource taskCompletionSource);
}
