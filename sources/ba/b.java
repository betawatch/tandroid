package ba;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Continuation, r1 {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ b(Runnable runnable) {
        this.a = runnable;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(u1 u1Var, int i7) {
        this.a.run();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        this.a.run();
        return Tasks.forResult(null);
    }
}
