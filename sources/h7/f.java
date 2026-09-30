package h7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.l;
import g7.q;
import kotlin.jvm.internal.i;
import v7.h5;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class f extends b8.b implements a {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super(8);
        this.b = i10;
        this.c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override // h7.a
    public void E0(Status status, l lVar) {
        switch (this.b) {
            case 1:
                i.e(status, "status");
                h5.a(status, lVar, this.c);
                return;
            default:
                i.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override // h7.a
    public void b0(Status status, g7.b bVar) {
        i.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // h7.a
    public void o0(Status status, g7.e eVar) {
        switch (this.b) {
            case 0:
                i.e(status, "status");
                h5.a(status, eVar, this.c);
                return;
            default:
                i.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override // h7.a
    public void r(Status status, q qVar) {
        i.e(status, "status");
        throw new UnsupportedOperationException();
    }
}
