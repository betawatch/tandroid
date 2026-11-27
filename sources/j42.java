// default package

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class j42 implements n7, zj5, bk5, fd, ng0 {
    public final /* synthetic */ s42 a;

    public /* synthetic */ j42(s42 s42Var) {
        this.a = s42Var;
    }

    @Override // zj5
    public final boolean a(MotionEvent motionEvent, a15 a15Var) {
        MotionEvent motionEvent2;
        s42 s42Var = this.a;
        if (s42Var.H != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-s42Var.H) / 2.0f);
            motionEvent2 = motionEvent;
        } else {
            motionEvent2 = null;
        }
        boolean booleanValue = a15Var.a(motionEvent).booleanValue();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return booleanValue;
    }

    @Override // ng0
    public final void b() {
        s42 s42Var = this.a;
        s42Var.f0 = false;
        s42Var.h0();
    }

    @Override // bk5
    public final void c(int i) {
        View childAt;
        s42 s42Var = this.a;
        gu guVar = s42Var.M;
        if (i != 1 || s42Var.I || guVar.getChildCount() <= 0 || (childAt = guVar.getChildAt(0)) == null) {
            return;
        }
        View G = guVar.G(childAt);
        f89 U = G == null ? null : guVar.U(G);
        if (U == null || U.b() != 0) {
            return;
        }
        int L = s42Var.p0 == 0 ? 0 : hl.L(66.0f);
        int top = childAt.getTop();
        if (top < (-L)) {
            ky5 d = s42Var.E.d();
            s42Var.G = ((z3f) a.j()).newCameraUpdateLatLngZoom((ak5) d.b, d.c);
            guVar.y0(0, top + L, null);
        }
    }

    @Override // n7
    public final void g(int i) {
        x05 x05Var = this.a.E;
        if (x05Var != null) {
            if (i == 2) {
                x05Var.j(0);
            } else if (i == 3) {
                x05Var.j(1);
            } else if (i == 4) {
                x05Var.j(2);
            }
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        this.a.a0();
    }
}
