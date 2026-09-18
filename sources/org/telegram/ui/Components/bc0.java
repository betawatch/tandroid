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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bc0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((cc0) this.b).z();
                break;
            case 1:
                ((ci.u) this.b).invalidateSelf();
                break;
            case 2:
                ((kc0) this.b).invalidateSelf();
                break;
            case 3:
                ((dd0) this.b).d();
                break;
            case 4:
                nd0 nd0Var = (nd0) this.b;
                nd0Var.getClass();
                try {
                    nd0Var.d.I.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((ae0) this.b).f.start();
                break;
            case 6:
                vz vzVar = ((ef0) this.b).c.l0;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    break;
                }
                break;
            case 7:
                hf0 hf0Var = (hf0) this.b;
                hf0Var.r = false;
                hf0Var.invalidate();
                break;
            case 8:
                ((kf0) this.b).h = null;
                break;
            case 9:
                kf0 kf0Var = (kf0) ((n7.a1) this.b).c;
                kf0Var.d.L(kf0Var.e, false);
                break;
            case 10:
                org.telegram.ui.ku0 ku0Var = (org.telegram.ui.ku0) this.b;
                if (ku0Var.x) {
                    ku0Var.h("pollPosition();");
                }
                if (ku0Var.G) {
                    AndroidUtilities.runOnUIThread(ku0Var.L, 500L);
                    break;
                }
                break;
            case 11:
                ((FrameLayout) this.b).invalidate();
                break;
            case 12:
                fg0 fg0Var = (fg0) ((lg.b) this.b).b;
                fg0Var.d.invalidate();
                fg0Var.e.requestLayout();
                break;
            case 13:
                ((hg0) this.b).f();
                break;
            case 14:
                try {
                    fi0 fi0Var = ((ei0) this.b).b;
                    if (fi0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) fi0Var.getParent()).removeView(fi0Var);
                    }
                    fi0Var.Q.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 15:
                ((RLottieNative) this.b).d();
                break;
            case 16:
                gk0 gk0Var = (gk0) this.b;
                gk0Var.x0 = null;
                gk0Var.j();
                fk0 fk0Var = gk0Var.g0;
                if (fk0Var != null) {
                    fk0Var.o();
                    break;
                }
                break;
            case 17:
                ((dk0) this.b).H.a.setVisibility(4);
                break;
            case 18:
                hk0 hk0Var = (hk0) this.b;
                h71 h71Var = hk0Var.n;
                if (h71Var != null) {
                    boolean y3 = h71Var.y();
                    float n10 = hk0Var.n.n() / hk0Var.n.p();
                    float f7 = hk0Var.s;
                    if (n10 < f7) {
                        hk0Var.n.L((long) (f7 * r2.p()), false);
                    } else if (n10 > hk0Var.v) {
                        hk0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(hk0Var.x, 16L);
                    }
                }
                hk0Var.invalidate();
                break;
            case 19:
                ml0 ml0Var = (ml0) this.b;
                ml0Var.V1 = null;
                ml0Var.U1 = null;
                org.telegram.ui.Cells.z zVar = ml0Var.D1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = ml0Var.D1;
                if (zVar2 != null && zVar2.isStateful()) {
                    ml0Var.D1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 20:
                wm0 wm0Var = (wm0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = wm0Var.d;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q(wm0Var, arrayList3, arrayList4, 27));
                break;
            case 21:
                ((ym0) this.b).invalidateSelf();
                break;
            case 22:
                ((jn0) this.b).f.setVisibility(8);
                break;
            case 23:
                ((org.telegram.ui.gy) this.b).s();
                break;
            case 24:
                ((n70) this.b).s();
                break;
            case 25:
                ((go0) this.b).getClass();
                break;
            case 26:
                org.telegram.ui.Cells.t1 t1Var = ((jo0) this.b).n;
                if (t1Var != null) {
                    t1Var.invalidate();
                    break;
                }
                break;
            case 27:
                lo0 lo0Var = (lo0) this.b;
                lo0Var.q = false;
                lo0Var.b.run();
                break;
            case 28:
                ((iq0) ((ci.i2) this.b).b).a1(1);
                break;
            default:
                nq0 nq0Var = (nq0) this.b;
                lq0[] lq0VarArr = nq0Var.a;
                if (nq0Var.b != 1) {
                    for (lq0 lq0Var : lq0VarArr) {
                        org.telegram.ui.ActionBar.k5 k5Var = lq0Var.d;
                        k5Var.setAlpha(1.0f);
                        k5Var.setScaleX(1.0f);
                        k5Var.setScaleY(1.0f);
                        lq0Var.e.setAlpha(0.0f);
                    }
                    nq0Var.E = false;
                    AndroidUtilities.runOnUIThread(nq0Var.G, 4000L);
                    break;
                } else {
                    nq0Var.E = !nq0Var.E;
                    for (lq0 lq0Var2 : lq0VarArr) {
                        org.telegram.ui.ActionBar.k5 k5Var2 = lq0Var2.d;
                        org.telegram.ui.ActionBar.k5 k5Var3 = lq0Var2.e;
                        k5Var2.setPivotX(0.0f);
                        k5Var3.setPivotX(0.0f);
                        if (nq0Var.E) {
                            k5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            k5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            k5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            k5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    AndroidUtilities.runOnUIThread(nq0Var.G, 4000L);
                    break;
                }
        }
    }
}
