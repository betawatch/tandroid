package ca;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f implements i {
    public final j a;
    public final TaskCompletionSource b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.a = jVar;
        this.b = taskCompletionSource;
    }

    @Override // ca.i
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override // ca.i
    public final boolean b(da.b bVar) {
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
}
