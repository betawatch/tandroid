package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.StateSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bd0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((cd0) this.b).z();
                break;
            case 1:
                ((ci.u) this.b).invalidateSelf();
                break;
            case 2:
                ((kd0) this.b).invalidateSelf();
                break;
            case 3:
                ((ee0) this.b).d();
                break;
            case 4:
                oe0 oe0Var = (oe0) this.b;
                oe0Var.getClass();
                try {
                    oe0Var.d.I.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((bf0) this.b).f.start();
                break;
            case 6:
                l00 l00Var = ((fg0) this.b).c.l0;
                if (l00Var != null) {
                    l00Var.e(false, true, false);
                    break;
                }
                break;
            case 7:
                ig0 ig0Var = (ig0) this.b;
                ig0Var.r = false;
                ig0Var.invalidate();
                break;
            case 8:
                ((lg0) this.b).h = null;
                break;
            case 9:
                lg0 lg0Var = (lg0) ((org.telegram.ui.ActionBar.b5) this.b).c;
                lg0Var.d.L(lg0Var.e, false);
                break;
            case 10:
                org.telegram.ui.ju0 ju0Var = (org.telegram.ui.ju0) this.b;
                if (ju0Var.x) {
                    ju0Var.h("pollPosition();");
                }
                if (ju0Var.G) {
                    AndroidUtilities.runOnUIThread(ju0Var.L, 500L);
                    break;
                }
                break;
            case 11:
                ((FrameLayout) this.b).invalidate();
                break;
            case 12:
                gh0 gh0Var = (gh0) ((lg.b) this.b).b;
                gh0Var.d.invalidate();
                gh0Var.e.requestLayout();
                break;
            case 13:
                ((ih0) this.b).f();
                break;
            case 14:
                try {
                    jj0 jj0Var = ((ij0) this.b).b;
                    if (jj0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) jj0Var.getParent()).removeView(jj0Var);
                    }
                    jj0Var.Q.run();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 15:
                ((RLottieNative) this.b).d();
                break;
            case 16:
                kl0 kl0Var = (kl0) this.b;
                kl0Var.x0 = null;
                kl0Var.j();
                jl0 jl0Var = kl0Var.g0;
                if (jl0Var != null) {
                    jl0Var.s();
                    break;
                }
                break;
            case 17:
                ((hl0) this.b).H.a.setVisibility(4);
                break;
            case 18:
                ll0 ll0Var = (ll0) this.b;
                k81 k81Var = ll0Var.n;
                if (k81Var != null) {
                    boolean y3 = k81Var.y();
                    float n10 = ll0Var.n.n() / ll0Var.n.p();
                    float f7 = ll0Var.s;
                    if (n10 < f7) {
                        ll0Var.n.L((long) (f7 * r2.p()), false);
                    } else if (n10 > ll0Var.v) {
                        ll0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(ll0Var.x, 16L);
                    }
                }
                ll0Var.invalidate();
                break;
            case 19:
                qm0 qm0Var = (qm0) this.b;
                qm0Var.T1 = null;
                qm0Var.S1 = null;
                org.telegram.ui.Cells.z zVar = qm0Var.B1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = qm0Var.B1;
                if (zVar2 != null && zVar2.isStateful()) {
                    qm0Var.B1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 20:
                bo0 bo0Var = (bo0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = bo0Var.d;
                FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(i10).getRecentLoadingFiles(arrayList2);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (FileLoader.getInstance(i10).getPathToMessage(arrayList.get(i11).messageOwner).exists()) {
                        arrayList3.add(arrayList.get(i11));
                    }
                }
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (!FileLoader.getInstance(i10).getPathToMessage(arrayList2.get(i12).messageOwner).exists()) {
                        arrayList4.add(arrayList2.get(i12));
                    }
                }
                AndroidUtilities.runOnUIThread(new og0(bo0Var, arrayList3, arrayList4, 2));
                break;
            case 21:
                ((do0) this.b).invalidateSelf();
                break;
            case 22:
                ((no0) this.b).f.setVisibility(8);
                break;
            case 23:
                ((org.telegram.ui.dy) this.b).s();
                break;
            case 24:
                ((p80) this.b).s();
                break;
            case 25:
                ((kp0) this.b).getClass();
                break;
            case 26:
                org.telegram.ui.Cells.u1 u1Var = ((np0) this.b).n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    break;
                }
                break;
            case 27:
                pp0 pp0Var = (pp0) this.b;
                pp0Var.q = false;
                pp0Var.b.run();
                break;
            case 28:
                ((mr0) ((ci.h2) this.b).b).b1(1);
                break;
            default:
                rr0 rr0Var = (rr0) this.b;
                pr0[] pr0VarArr = rr0Var.a;
                if (rr0Var.b != 1) {
                    for (pr0 pr0Var : pr0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var = pr0Var.d;
                        j5Var.setAlpha(1.0f);
                        j5Var.setScaleX(1.0f);
                        j5Var.setScaleY(1.0f);
                        pr0Var.e.setAlpha(0.0f);
                    }
                    rr0Var.E = false;
                    AndroidUtilities.runOnUIThread(rr0Var.G, 4000L);
                    break;
                } else {
                    rr0Var.E = !rr0Var.E;
                    for (pr0 pr0Var2 : pr0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var2 = pr0Var2.d;
                        org.telegram.ui.ActionBar.j5 j5Var3 = pr0Var2.e;
                        j5Var2.setPivotX(0.0f);
                        j5Var3.setPivotX(0.0f);
                        if (rr0Var.E) {
                            j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            j5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            j5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    AndroidUtilities.runOnUIThread(rr0Var.G, 4000L);
                    break;
                }
        }
    }
}
