package bi;

import android.animation.ValueAnimator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.an;
import org.telegram.ui.pv;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ab(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void a() {
        ab.q qVar = (ab.q) this.b;
        Map map = null;
        ((AtomicReference) qVar.c).set(null);
        synchronized (qVar) {
            try {
                if (((AtomicMarkableReference) qVar.b).isMarked()) {
                    map = ((ca.e) ((AtomicMarkableReference) qVar.b).getReference()).a();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) qVar.b;
                    atomicMarkableReference.set((ca.e) atomicMarkableReference.getReference(), false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (map != null) {
            m.q3 q3Var = (m.q3) qVar.d;
            ((ca.h) q3Var.a).h((String) q3Var.c, map, qVar.a);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ti.o oVar;
        LaunchActivity launchActivity;
        String str = null;
        boolean z9 = false;
        switch (this.a) {
            case 0:
                ((vg.m) this.b).setPaused(true);
                return;
            case 1:
                org.telegram.messenger.g0.K3((EditTextBoldCursor) this.b);
                return;
            case 2:
                ((h1[]) this.b)[0].dismiss();
                return;
            case 3:
                vf.c.t(((tc) this.b).getContext(), org.telegram.messenger.id.M0(2131744969, null));
                return;
            case 4:
                vf.c.t(((uc) this.b).getContext(), org.telegram.messenger.id.M0(2131744969, null));
                return;
            case 5:
                ((c1.e) this.b).f().a(new w0.h(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            case 6:
                m.q3 q3Var = (m.q3) this.b;
                synchronized (((AtomicMarkableReference) q3Var.g)) {
                    try {
                        if (((AtomicMarkableReference) q3Var.g).isMarked()) {
                            str = (String) ((AtomicMarkableReference) q3Var.g).getReference();
                            ((AtomicMarkableReference) q3Var.g).set(str, false);
                            z9 = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z9) {
                    ((ca.h) q3Var.a).i((String) q3Var.c, str);
                    return;
                }
                return;
            case 7:
                a();
                return;
            case 8:
                ch.r rVar = (ch.r) ((d6.i) this.b).b;
                ch.q qVar = rVar.b;
                if (qVar != null) {
                    qVar.d(true);
                }
                rVar.a.N7(true);
                return;
            case 9:
                ((ValueAnimator) this.b).start();
                return;
            case 10:
                org.telegram.ui.ActionBar.f2 f2Var = ((ch.w) this.b).g2.r;
                if (f2Var instanceof an) {
                    f2Var.showDialog(new ug.w0(f2Var, 11, false));
                    return;
                }
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.showDialog(new ug.w0(f2Var, 11, false));
                    return;
                }
                return;
            case 11:
                ((d3.e) this.b).h.q();
                return;
            case 12:
                ((d3.u) this.b).m--;
                return;
            case 13:
                r0.a.postVsyncCallback((d3.c0) this.b);
                return;
            case 14:
                ww wwVar = ((pv) this.b).O0;
                if (wwVar.L && wwVar.j4().I()) {
                    wwVar.E0.h();
                    return;
                } else {
                    wwVar.J4(true, true);
                    return;
                }
            case 15:
                ((di.e1) this.b).a.t(false);
                return;
            case 16:
                di.g1 g1Var = ((di.f1) this.b).a;
                qs.f(g1Var.e).k(qs.G2, Long.valueOf(g1Var.g()));
                return;
            case 17:
                di.i1 i1Var = (di.i1) this.b;
                di.p9 p9Var = i1Var.c;
                if (p9Var == null || !i1Var.E() || (oVar = i1Var.a) == null || oVar.c != 0 || (launchActivity = LaunchActivity.G1) == null || !c8.kc.a(launchActivity)) {
                    return;
                }
                p9Var.T();
                return;
            case 18:
                ti.o oVar2 = ((di.h1) this.b).e.a;
                if (oVar2 != null) {
                    oVar2.c();
                    return;
                }
                return;
            case 19:
                ((di.e3) this.b).a.O0();
                return;
            case 20:
                di.i4 i4Var = ((di.j3) this.b).y;
                di.b4 b4Var = i4Var.z1;
                if (b4Var != null) {
                    if (i4Var.C1 || i4Var.D1 || i4Var.E1) {
                        if (i4Var.x1.e) {
                            ((di.o9) i4Var.v2.c).loopBack();
                            return;
                        } else {
                            i4Var.F0 = 0L;
                            return;
                        }
                    }
                    di.p9 p9Var2 = ((di.g9) b4Var).d;
                    if (p9Var2.n0.getCurrentPeerView().b1(true) || p9Var2.n0.E(true)) {
                        return;
                    }
                    p9Var2.u(true);
                    return;
                }
                return;
            case 21:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 22:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                int i7 = ProfileStoriesView.s0;
                profileStoriesView.getClass();
                org.telegram.messenger.g0.c4(profileStoriesView);
                return;
            case 23:
                di.k5.a(((di.g5) this.b).d);
                return;
            case 24:
                di.w5 w5Var = (di.w5) this.b;
                if (w5Var.isShowing()) {
                    w5Var.J0(true);
                    return;
                }
                return;
            case 25:
                fi.z0 z0Var = (fi.z0) this.b;
                z0Var.c(z0Var.b);
                z0Var.c = false;
                return;
            case 26:
                ((fi.d8) this.b).run();
                return;
            case 27:
                di.c7 c7Var = (di.c7) this.b;
                c7Var.c();
                c7Var.a(true);
                return;
            case 28:
                ((di.y5) this.b).a(null);
                return;
            default:
                ((di.m7) this.b).R();
                return;
        }
    }
}
