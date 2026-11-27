// default package

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class j04 extends z5c {
    public final /* synthetic */ o24 b;

    public j04(o24 o24Var) {
        this.b = o24Var;
    }

    @Override // z5c
    public final boolean a() {
        return this.b.u1.b();
    }

    @Override // z5c
    public final String[] b() {
        return this.b.X0;
    }

    @Override // z5c
    public final boolean c() {
        return this.b.u1.c();
    }

    @Override // z5c
    public final boolean d(s5c s5cVar, MotionEvent motionEvent) {
        rw2 e = rw2.e();
        o24 o24Var = this.b;
        o24Var.getMeasuredHeight();
        return e.g(motionEvent, s5cVar, o24Var.h2, o24Var.a2);
    }

    @Override // z5c
    public final boolean e(s5c s5cVar, t39 t39Var, MotionEvent motionEvent) {
        rw2 e = rw2.e();
        o24 o24Var = this.b;
        o24Var.getMeasuredHeight();
        return e.h(motionEvent, s5cVar, t39Var, o24Var.h2, o24Var.a2);
    }

    @Override // z5c
    public final void f(int i, Object obj, TLRPC.Document document, boolean z) {
        this.b.u1.x(null, document, null, obj, null, z, i);
    }

    @Override // z5c
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z) {
        o24 o24Var = this.b;
        o24Var.u1.q(stickerSetCovered);
        if (z) {
            o24Var.X(true);
        }
    }

    @Override // z5c
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.u1.i(stickerSetCovered);
    }

    @Override // z5c
    public final void i(String[] strArr) {
        this.b.X0 = strArr;
    }
}
