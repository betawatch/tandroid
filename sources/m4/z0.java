package m4;

import bi.g5;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements g1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;

    public /* synthetic */ z0(g1 g1Var, int i10) {
        this.a = i10;
        this.b = g1Var;
    }

    @Override // m4.g1
    public final Object i(final b0 b0Var, final r rVar, final int i10) {
        switch (this.a) {
            case 0:
                if (b0Var != null) {
                    throw new ClassCastException();
                }
                h1.I0(null, rVar, i10, this.b, new g5(rVar, i10, 1));
                throw null;
            default:
                return h1.I0(b0Var, rVar, i10, this.b, new e2.h() { // from class: m4.c1
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
                    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
                    @Override // e2.h
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void accept(Object obj) {
                        r1 r1Var;
                        try {
                            r1Var = (r1) ((i9.w) obj).get();
                            e2.d.e(r1Var, "SessionResult must not be null");
                        } catch (InterruptedException e) {
                            e = e;
                            e2.a.o("MediaSessionStub", "Session operation failed", e);
                            r1Var = new r1(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
                        } catch (CancellationException e7) {
                            e2.a.o("MediaSessionStub", "Session operation cancelled", e7);
                            r1Var = new r1(1);
                        } catch (ExecutionException e10) {
                            e = e10;
                            e2.a.o("MediaSessionStub", "Session operation failed", e);
                            r1Var = new r1(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
                        }
                        h1.O0(b0.this, rVar, i10, r1Var);
                    }
                });
        }
    }
}
