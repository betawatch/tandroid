package je;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.j;
import v0.c;
import v0.g;
import w0.d;
import zd.m;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
