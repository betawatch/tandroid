package ba;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Continuation, q1 {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ b(Runnable runnable) {
        this.a = runnable;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(t1 t1Var, int i7) {
        this.a.run();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        this.a.run();
        return Tasks.forResult(null);
    }
}
