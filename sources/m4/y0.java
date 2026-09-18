package m4;

import ci.m4;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements f1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ y0(f1 f1Var, int i10) {
        this.a = i10;
        this.b = f1Var;
    }

    @Override // m4.f1
    public final Object h(final a0 a0Var, final r rVar, final int i10) {
        switch (this.a) {
            case 0:
                if (a0Var != null) {
                    throw new ClassCastException();
                }
                g1.I0(null, rVar, i10, this.b, new m4(rVar, i10, 1));
                throw null;
            default:
                return g1.I0(a0Var, rVar, i10, this.b, new e2.h() { // from class: m4.b1
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
                    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
                    @Override // e2.h
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void accept(Object obj) {
                        q1 q1Var;
                        try {
                            q1Var = (q1) ((i9.w) obj).get();
                            e2.d.e(q1Var, "SessionResult must not be null");
                        } catch (InterruptedException e) {
                            e = e;
                            e2.a.o("MediaSessionStub", "Session operation failed", e);
                            q1Var = new q1(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
                        } catch (CancellationException e7) {
                            e2.a.o("MediaSessionStub", "Session operation cancelled", e7);
                            q1Var = new q1(1);
                        } catch (ExecutionException e10) {
                            e = e10;
                            e2.a.o("MediaSessionStub", "Session operation failed", e);
                            q1Var = new q1(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
                        }
                        g1.O0(a0.this, rVar, i10, q1Var);
                    }
                });
        }
    }
}
