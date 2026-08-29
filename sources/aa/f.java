package aa;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f implements i {
    public final j a;
    public final TaskCompletionSource b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.a = jVar;
        this.b = taskCompletionSource;
    }

    @Override // aa.i
    public final boolean a(ba.b bVar) {
        if (bVar.b != 4 || this.a.a(bVar)) {
            return false;
        }
        String str = bVar.c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.b.setResult(new a(bVar.e, bVar.f, str));
        return true;
    }

    @Override // aa.i
    public final boolean b(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }
}
