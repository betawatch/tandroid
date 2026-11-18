package je;

import b7.h;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.j;
import v0.c;
import v0.g;
import w0.d;
import zd.m;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
            mVar.resumeWith(h.a(e10));
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Exception exception = task.getException();
        m mVar = this.a;
        if (exception != null) {
            mVar.resumeWith(h.a(exception));
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
