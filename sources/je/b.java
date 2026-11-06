package je;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.j;
import v0.c;
import v0.g;
import w0.d;
import zd.m;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class b implements OnCompleteListener, g {
    public final /* synthetic */ m a;

    public /* synthetic */ b(m mVar) {
        this.a = mVar;
    }

    @Override // v0.g
    public void a(Object obj) {
        d e10 = (d) obj;
        j.e(e10, "e");
        m mVar = this.a;
        if (mVar.w()) {
            mVar.resumeWith(af.b.b(e10));
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Exception exception = task.getException();
        m mVar = this.a;
        if (exception != null) {
            mVar.resumeWith(af.b.b(exception));
        } else if (task.isCanceled()) {
            mVar.n(null);
        } else {
            mVar.resumeWith(task.getResult());
        }
    }

    @Override // v0.g
    public void onResult(Object obj) {
        c result = (c) obj;
        j.e(result, "result");
        m mVar = this.a;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }
}
