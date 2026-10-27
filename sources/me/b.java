package me;

import a8.jd;
import ce.m;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import v0.c;
import v0.i;
import w0.d;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b implements OnCompleteListener, i {
    public final /* synthetic */ m a;

    public /* synthetic */ b(m mVar) {
        this.a = mVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Exception exception = task.getException();
        m mVar = this.a;
        if (exception != null) {
            mVar.resumeWith(jd.a(exception));
        } else if (task.isCanceled()) {
            mVar.n(null);
        } else {
            mVar.resumeWith(task.getResult());
        }
    }

    @Override // v0.i
    public void onError(Object obj) {
        d e = (d) obj;
        kotlin.jvm.internal.i.e(e, "e");
        m mVar = this.a;
        if (mVar.w()) {
            mVar.resumeWith(jd.a(e));
        }
    }

    @Override // v0.i
    public void onResult(Object obj) {
        c result = (c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        m mVar = this.a;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }
}
