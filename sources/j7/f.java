package j7;

import b8.y9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.tasks.TaskCompletionSource;
import i7.l;
import i7.r;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends o implements a {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i3, TaskCompletionSource taskCompletionSource) {
        super(8);
        this.b = i3;
        this.c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override // j7.a
    public void c0(Status status, r rVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // j7.a
    public void t(Status status, l lVar) {
        switch (this.b) {
            case 1:
                j.e(status, "status");
                y9.a(status, lVar, this.c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override // j7.a
    public void t0(Status status, i7.b bVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // j7.a
    public void y(Status status, i7.e eVar) {
        switch (this.b) {
            case 0:
                j.e(status, "status");
                y9.a(status, eVar, this.c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }
}
