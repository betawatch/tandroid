package k7;

import a8.l8;
import a8.q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.m;
import j7.r;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
    public void I0(Status status, m mVar) {
        switch (this.b) {
            case 1:
                j.e(status, "status");
                l8.a(status, mVar, this.c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override // k7.a
    public void J0(Status status, r rVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // k7.a
    public void a1(Status status, j7.c cVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // k7.a
    public void x0(Status status, j7.f fVar) {
        switch (this.b) {
            case 0:
                j.e(status, "status");
                l8.a(status, fVar, this.c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }
}
