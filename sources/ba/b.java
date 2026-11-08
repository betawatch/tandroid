package ba;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Continuation, r1 {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ b(Runnable runnable) {
        this.a = runnable;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        this.a.run();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        this.a.run();
        return Tasks.forResult(null);
    }
}
