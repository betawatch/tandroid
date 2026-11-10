package k7;

import a8.k8;
import a8.q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.m;
import j7.r;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class f extends q implements a {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i7, TaskCompletionSource taskCompletionSource) {
        super(10);
        this.b = i7;
        this.c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override // k7.a
    public void H0(Status status, m mVar) {
        switch (this.b) {
            case 1:
                j.e(status, "status");
                k8.a(status, mVar, this.c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override // k7.a
    public void I0(Status status, r rVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // k7.a
    public void a1(Status status, j7.c cVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // k7.a
    public void w0(Status status, j7.f fVar) {
        switch (this.b) {
            case 0:
                j.e(status, "status");
                k8.a(status, fVar, this.c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }
}
