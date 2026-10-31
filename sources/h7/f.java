package h7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.l;
import g7.q;
import kotlin.jvm.internal.i;
import v7.i5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    public void F0(Status status, l lVar) {
        switch (this.b) {
            case 1:
                i.e(status, "status");
                i5.a(status, lVar, this.c);
                return;
            default:
                i.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override // h7.a
    public void c0(Status status, g7.b bVar) {
        i.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // h7.a
    public void q0(Status status, g7.e eVar) {
        switch (this.b) {
            case 0:
                i.e(status, "status");
                i5.a(status, eVar, this.c);
                return;
            default:
                i.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override // h7.a
    public void s(Status status, q qVar) {
        i.e(status, "status");
        throw new UnsupportedOperationException();
    }
}
