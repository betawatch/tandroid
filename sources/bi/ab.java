package bi;

import android.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cn;
import org.telegram.ui.sv;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                vf.c.t(((tc) this.b).getContext(), org.telegram.messenger.id.M0(2131744966, null));
                return;
            case 4:
                vf.c.t(((uc) this.b).getContext(), org.telegram.messenger.id.M0(2131744966, null));
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
                rVar.a.O7(true);
                return;
            case 9:
                ((ValueAnimator) this.b).start();
                return;
            case 10:
                org.telegram.ui.ActionBar.f2 f2Var = ((ch.w) this.b).g2.r;
                if (f2Var instanceof cn) {
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
                zw zwVar = ((sv) this.b).O0;
                if (zwVar.L && zwVar.j4().I()) {
                    zwVar.E0.h();
                    return;
                } else {
                    zwVar.J4(true, true);
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
                di.q9 q9Var = i1Var.c;
                if (q9Var == null || !i1Var.E() || (oVar = i1Var.a) == null || oVar.c != 0 || (launchActivity = LaunchActivity.G1) == null || !c8.kc.a(launchActivity)) {
                    return;
                }
                q9Var.T();
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
                di.j4 j4Var = ((di.j3) this.b).y;
                di.c4 c4Var = j4Var.z1;
                if (c4Var != null) {
                    if (j4Var.C1 || j4Var.D1 || j4Var.E1) {
                        if (j4Var.x1.e) {
                            ((di.p9) j4Var.v2.c).loopBack();
                            return;
                        } else {
                            j4Var.F0 = 0L;
                            return;
                        }
                    }
                    di.q9 q9Var2 = ((di.h9) c4Var).d;
                    if (q9Var2.n0.getCurrentPeerView().b1(true) || q9Var2.n0.E(true)) {
                        return;
                    }
                    q9Var2.u(true);
                    return;
                }
                return;
            case 21:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                int i7 = ProfileStoriesView.s0;
                profileStoriesView.getClass();
                org.telegram.messenger.g0.c4(profileStoriesView);
                return;
            case 22:
                di.l5.a(((di.h5) this.b).d);
                return;
            case 23:
                di.x5 x5Var = (di.x5) this.b;
                if (x5Var.isShowing()) {
                    x5Var.J0(true);
                    return;
                }
                return;
            case 24:
                fi.z0 z0Var = (fi.z0) this.b;
                z0Var.c(z0Var.b);
                z0Var.c = false;
                return;
            case 25:
                ((fi.d8) this.b).run();
                return;
            case 26:
                di.d7 d7Var = (di.d7) this.b;
                d7Var.c();
                d7Var.a(true);
                return;
            case 27:
                ((di.z5) this.b).a(null);
                return;
            case 28:
                ((di.n7) this.b).R();
                return;
            default:
                di.w7 w7Var = (di.w7) this.b;
                ArrayList arrayList = w7Var.c;
                if (arrayList != null) {
                    w7Var.a.i1 = arrayList;
                }
                di.j4 j4Var2 = w7Var.a;
                long j3 = w7Var.b;
                if (j4Var2.k1 == j3 && j4Var2.i1 == null) {
                    return;
                }
                j4Var2.k1 = j3;
                j4Var2.h1();
                j4Var2.g1();
                j4Var2.d1(true);
                TL_stories.PeerStories peerStories = j4Var2.s0.P0;
                if (peerStories != null) {
                    j4Var2.B1.V(peerStories, true);
                    return;
                }
                di.z6 z6Var = j4Var2.B1;
                TL_stories.PeerStories y10 = z6Var.y(j3);
                if (y10 == null) {
                    y10 = z6Var.z(j3);
                    z9 = true;
                }
                z6Var.V(y10, z9);
                return;
        }
    }
}
