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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ib0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ib0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((jb0) this.b).z();
                break;
            case 1:
                ((kh.v) this.b).invalidateSelf();
                break;
            case 2:
                ((rb0) this.b).invalidateSelf();
                break;
            case 3:
                ((kc0) this.b).d();
                break;
            case 4:
                tc0 tc0Var = (tc0) this.b;
                tc0Var.getClass();
                try {
                    tc0Var.d.E.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((hd0) this.b).f.start();
                break;
            case 6:
                hz hzVar = ((le0) this.b).c.h0;
                if (hzVar != null) {
                    hzVar.e(false, true, false);
                    break;
                }
                break;
            case 7:
                oe0 oe0Var = (oe0) this.b;
                oe0Var.r = false;
                oe0Var.invalidate();
                break;
            case 8:
                ((re0) this.b).h = null;
                break;
            case 9:
                re0 re0Var = (re0) ((org.telegram.ui.Cells.e3) this.b).c;
                re0Var.d.M(re0Var.e, false);
                break;
            case 10:
                org.telegram.ui.gt0 gt0Var = (org.telegram.ui.gt0) this.b;
                if (gt0Var.x) {
                    gt0Var.h("pollPosition();");
                }
                if (gt0Var.C) {
                    AndroidUtilities.runOnUIThread(gt0Var.H, 500L);
                    break;
                }
                break;
            case 11:
                ((FrameLayout) this.b).invalidate();
                break;
            case 12:
                pf0 pf0Var = (pf0) ((mf0) this.b).b;
                pf0Var.d.invalidate();
                pf0Var.e.requestLayout();
                break;
            case 13:
                ((rf0) this.b).f();
                break;
            case 14:
                try {
                    qh0 qh0Var = ((ph0) this.b).b;
                    if (qh0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) qh0Var.getParent()).removeView(qh0Var);
                    }
                    qh0Var.M.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 15:
                ((RLottieNative) this.b).d();
                break;
            case 16:
                uj0 uj0Var = (uj0) this.b;
                uj0Var.t0 = null;
                uj0Var.j();
                tj0 tj0Var = uj0Var.c0;
                if (tj0Var != null) {
                    tj0Var.t();
                    break;
                }
                break;
            case 17:
                ((rj0) this.b).D.a.setVisibility(4);
                break;
            case 18:
                vj0 vj0Var = (vj0) this.b;
                k61 k61Var = vj0Var.n;
                if (k61Var != null) {
                    boolean z10 = k61Var.z();
                    float o6 = vj0Var.n.o() / vj0Var.n.q();
                    float f10 = vj0Var.s;
                    if (o6 < f10) {
                        vj0Var.n.M((long) (f10 * r2.q()), false);
                    } else if (o6 > vj0Var.v) {
                        vj0Var.setPlaying(false);
                        z10 = false;
                    }
                    if (z10) {
                        AndroidUtilities.runOnUIThread(vj0Var.x, 16L);
                    }
                }
                vj0Var.invalidate();
                break;
            case 19:
                wk0 wk0Var = (wk0) this.b;
                wk0Var.R1 = null;
                wk0Var.Q1 = null;
                org.telegram.ui.Cells.z zVar = wk0Var.z1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = wk0Var.z1;
                if (zVar2 != null && zVar2.isStateful()) {
                    wk0Var.z1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 20:
                gm0 gm0Var = (gm0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i9 = gm0Var.d;
                FileLoader.getInstance(i9).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(i9).getRecentLoadingFiles(arrayList2);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (FileLoader.getInstance(i9).getPathToMessage(arrayList.get(i10).messageOwner).exists()) {
                        arrayList3.add(arrayList.get(i10));
                    }
                }
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (!FileLoader.getInstance(i9).getPathToMessage(arrayList2.get(i11).messageOwner).exists()) {
                        arrayList4.add(arrayList2.get(i11));
                    }
                }
                AndroidUtilities.runOnUIThread(new ue0(gm0Var, arrayList3, arrayList4, 2));
                break;
            case 21:
                ((im0) this.b).invalidateSelf();
                break;
            case 22:
                ((sm0) this.b).f.setVisibility(8);
                break;
            case 23:
                ((org.telegram.ui.mx) this.b).s();
                break;
            case 24:
                ((x60) this.b).s();
                break;
            case 25:
                ((pn0) this.b).getClass();
                break;
            case 26:
                org.telegram.ui.Cells.t1 t1Var = ((rn0) this.b).n;
                if (t1Var != null) {
                    t1Var.invalidate();
                    break;
                }
                break;
            case 27:
                tn0 tn0Var = (tn0) this.b;
                tn0Var.q = false;
                tn0Var.b.run();
                break;
            case 28:
                ((rp0) ((bh.f) this.b).b).a1(1);
                break;
            default:
                wp0 wp0Var = (wp0) this.b;
                up0[] up0VarArr = wp0Var.a;
                if (wp0Var.b != 1) {
                    for (up0 up0Var : up0VarArr) {
                        org.telegram.ui.ActionBar.h5 h5Var = up0Var.d;
                        h5Var.setAlpha(1.0f);
                        h5Var.setScaleX(1.0f);
                        h5Var.setScaleY(1.0f);
                        up0Var.e.setAlpha(0.0f);
                    }
                    wp0Var.A = false;
                    AndroidUtilities.runOnUIThread(wp0Var.C, 4000L);
                    break;
                } else {
                    wp0Var.A = !wp0Var.A;
                    for (up0 up0Var2 : up0VarArr) {
                        org.telegram.ui.ActionBar.h5 h5Var2 = up0Var2.d;
                        org.telegram.ui.ActionBar.h5 h5Var3 = up0Var2.e;
                        h5Var2.setPivotX(0.0f);
                        h5Var3.setPivotX(0.0f);
                        if (wp0Var.A) {
                            h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            h5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            h5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    AndroidUtilities.runOnUIThread(wp0Var.C, 4000L);
                    break;
                }
        }
    }
}
