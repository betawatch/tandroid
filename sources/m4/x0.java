package m4;

import di.m4;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;

    public /* synthetic */ x0(e1 e1Var, int i10) {
        this.a = i10;
        this.b = e1Var;
    }

    @Override // m4.e1
    public final Object h(final a0 a0Var, final r rVar, final int i10) {
        switch (this.a) {
            case 0:
                if (a0Var != null) {
                    throw new ClassCastException();
                }
                f1.I0(null, rVar, i10, this.b, new m4(rVar, i10, 1));
                throw null;
            default:
                return f1.I0(a0Var, rVar, i10, this.b, new e2.h() { // from class: m4.a1
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
                    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
                    @Override // e2.h
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void accept(Object obj) {
                        p1 p1Var;
                        try {
                            p1Var = (p1) ((i9.w) obj).get();
                            e2.d.e(p1Var, "SessionResult must not be null");
                        } catch (InterruptedException e7) {
                            e = e7;
                            e2.a.o("MediaSessionStub", "Session operation failed", e);
                            p1Var = new p1(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
                        } catch (CancellationException e10) {
                            e2.a.o("MediaSessionStub", "Session operation cancelled", e10);
                            p1Var = new p1(1);
                        } catch (ExecutionException e11) {
                            e = e11;
                            e2.a.o("MediaSessionStub", "Session operation failed", e);
                            p1Var = new p1(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
                        }
                        f1.O0(a0.this, rVar, i10, p1Var);
                    }
                });
        }
    }
}
