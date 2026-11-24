// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class le9 implements ag9 {
    public final /* synthetic */ iy6 a;
    public final /* synthetic */ lk0 b;
    public final /* synthetic */ ye9 c;

    public le9(ye9 ye9Var, iy6 iy6Var, lk0 lk0Var) {
        this.c = ye9Var;
        this.a = iy6Var;
        this.b = lk0Var;
    }

    @Override // ag9
    public final void a() {
        iy6 iy6Var = this.a;
        iy6Var.a = (byte) 3;
        ye9 ye9Var = this.c;
        ye9Var.h4.remove(iy6Var);
        ye9Var.r4(this.b, iy6Var);
        ye9Var.p3.onContentChanged();
    }

    @Override // ag9
    public final void b(int i, int i2) {
        if (i > 0 && i2 > 0) {
            iy6 iy6Var = this.a;
            iy6Var.j = i;
            iy6Var.k = i2;
        }
        View C1 = this.c.C1(this.b);
        if (C1 instanceof vf9) {
            C1.requestLayout();
            C1.invalidate();
        }
    }

    @Override // ag9
    public final void c(TLRPC.Photo photo) {
        int i;
        int i2;
        iy6 iy6Var = this.a;
        iy6Var.g = photo;
        iy6Var.a = (byte) 2;
        TLRPC.PhotoSize w = ba4.w(photo.sizes, gl.Y0(false), false, null, false);
        if (w != null && (i = w.w) > 0 && (i2 = w.h) > 0) {
            iy6Var.j = i;
            iy6Var.k = i2;
        }
        lk0 lk0Var = this.b;
        TL_iv.PageBlock J3 = ye9.J3(lk0Var, iy6Var);
        if (J3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) J3).photo_id = photo.id;
        }
        ye9 ye9Var = this.c;
        ye9Var.h4.remove(iy6Var);
        ye9Var.o4(lk0Var);
        ye9Var.p3.onContentChanged();
    }

    @Override // ag9
    public final void d(TLRPC.Document document) {
        iy6 iy6Var = this.a;
        iy6Var.h = document;
        iy6Var.a = (byte) 2;
        lk0 lk0Var = this.b;
        TL_iv.PageBlock J3 = ye9.J3(lk0Var, iy6Var);
        if (J3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) J3).video_id = document.id;
        }
        ye9 ye9Var = this.c;
        ye9Var.h4.remove(iy6Var);
        ye9Var.o4(lk0Var);
        ye9Var.p3.onContentChanged();
    }

    @Override // ag9
    public final void g(float f) {
        this.a.f = f;
        lk0 lk0Var = this.b;
        ye9 ye9Var = this.c;
        View C1 = ye9Var.C1(lk0Var);
        if (C1 instanceof vf9) {
            C1.requestLayout();
            C1.invalidate();
        }
        ye9Var.p3.onContentChanged();
    }

    @Override // ag9
    public final void e(TLRPC.Document document) {
    }

    @Override // ag9
    public final void f(TLRPC.Document document) {
    }
}
