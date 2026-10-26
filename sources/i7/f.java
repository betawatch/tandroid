package i7;

import a8.aa;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.l;
import h7.q;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class f extends c8.b implements a {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super(8);
        this.b = i10;
        this.c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override // i7.a
    public void D(Status status, q qVar) {
        i.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // i7.a
    public void D0(Status status, h7.e eVar) {
        switch (this.b) {
            case 0:
                i.e(status, "status");
                aa.a(status, eVar, this.c);
                return;
            default:
                i.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override // i7.a
    public void d0(Status status, h7.b bVar) {
        i.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // i7.a
    public void s0(Status status, l lVar) {
        switch (this.b) {
            case 1:
                i.e(status, "status");
                aa.a(status, lVar, this.c);
                return;
            default:
                i.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }
}
