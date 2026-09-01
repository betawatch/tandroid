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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ec0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ec0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((fc0) this.b).z();
                break;
            case 1:
                ((lc0) this.b).invalidateSelf();
                break;
            case 2:
                ((oc0) this.b).invalidateSelf();
                break;
            case 3:
                ((hd0) this.b).d();
                break;
            case 4:
                rd0 rd0Var = (rd0) this.b;
                rd0Var.getClass();
                try {
                    rd0Var.d.F.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((fe0) this.b).f.start();
                break;
            case 6:
                xz xzVar = ((kf0) this.b).c.i0;
                if (xzVar != null) {
                    xzVar.e(false, true, false);
                    break;
                }
                break;
            case 7:
                nf0 nf0Var = (nf0) this.b;
                nf0Var.r = false;
                nf0Var.invalidate();
                break;
            case 8:
                ((qf0) this.b).h = null;
                break;
            case 9:
                qf0 qf0Var = (qf0) ((n7.qa) this.b).c;
                qf0Var.d.L(qf0Var.e, false);
                break;
            case 10:
                org.telegram.ui.pt0 pt0Var = (org.telegram.ui.pt0) this.b;
                if (pt0Var.x) {
                    pt0Var.h("pollPosition();");
                }
                if (pt0Var.D) {
                    AndroidUtilities.runOnUIThread(pt0Var.I, 500L);
                    break;
                }
                break;
            case 11:
                ((FrameLayout) this.b).invalidate();
                break;
            case 12:
                ng0 ng0Var = (ng0) ((jg0) this.b).b;
                ng0Var.d.invalidate();
                ng0Var.e.requestLayout();
                break;
            case 13:
                ((pg0) this.b).f();
                break;
            case 14:
                try {
                    ni0 ni0Var = ((mi0) this.b).b;
                    if (ni0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ni0Var.getParent()).removeView(ni0Var);
                    }
                    ni0Var.N.run();
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 15:
                ((RLottieNative) this.b).d();
                break;
            case 16:
                rk0 rk0Var = (rk0) this.b;
                rk0Var.u0 = null;
                rk0Var.j();
                qk0 qk0Var = rk0Var.d0;
                if (qk0Var != null) {
                    qk0Var.m();
                    break;
                }
                break;
            case 17:
                ((ok0) this.b).E.a.setVisibility(4);
                break;
            case 18:
                sk0 sk0Var = (sk0) this.b;
                k71 k71Var = sk0Var.n;
                if (k71Var != null) {
                    boolean y10 = k71Var.y();
                    float n10 = sk0Var.n.n() / sk0Var.n.p();
                    float f10 = sk0Var.s;
                    if (n10 < f10) {
                        sk0Var.n.L((long) (f10 * r2.p()), false);
                    } else if (n10 > sk0Var.v) {
                        sk0Var.setPlaying(false);
                        y10 = false;
                    }
                    if (y10) {
                        AndroidUtilities.runOnUIThread(sk0Var.x, 16L);
                    }
                }
                sk0Var.invalidate();
                break;
            case 19:
                tl0 tl0Var = (tl0) this.b;
                tl0Var.S1 = null;
                tl0Var.R1 = null;
                org.telegram.ui.Cells.z zVar = tl0Var.A1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = tl0Var.A1;
                if (zVar2 != null && zVar2.isStateful()) {
                    tl0Var.A1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 20:
                en0 en0Var = (en0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = en0Var.d;
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
                AndroidUtilities.runOnUIThread(new jp(en0Var, arrayList3, arrayList4, 14));
                break;
            case 21:
                ((gn0) this.b).invalidateSelf();
                break;
            case 22:
                ((pn0) this.b).f.setVisibility(8);
                break;
            case 23:
                ((org.telegram.ui.yx) this.b).s();
                break;
            case 24:
                ((q70) this.b).s();
                break;
            case 25:
                ((lo0) this.b).getClass();
                break;
            case 26:
                org.telegram.ui.Cells.t1 t1Var = ((no0) this.b).n;
                if (t1Var != null) {
                    t1Var.invalidate();
                    break;
                }
                break;
            case 27:
                po0 po0Var = (po0) this.b;
                po0Var.q = false;
                po0Var.b.run();
                break;
            case 28:
                ((mq0) ((eh.c) this.b).b).a1(1);
                break;
            default:
                rq0 rq0Var = (rq0) this.b;
                pq0[] pq0VarArr = rq0Var.a;
                if (rq0Var.b != 1) {
                    for (pq0 pq0Var : pq0VarArr) {
                        org.telegram.ui.ActionBar.l5 l5Var = pq0Var.d;
                        l5Var.setAlpha(1.0f);
                        l5Var.setScaleX(1.0f);
                        l5Var.setScaleY(1.0f);
                        pq0Var.e.setAlpha(0.0f);
                    }
                    rq0Var.B = false;
                    AndroidUtilities.runOnUIThread(rq0Var.D, 4000L);
                    break;
                } else {
                    rq0Var.B = !rq0Var.B;
                    for (pq0 pq0Var2 : pq0VarArr) {
                        org.telegram.ui.ActionBar.l5 l5Var2 = pq0Var2.d;
                        org.telegram.ui.ActionBar.l5 l5Var3 = pq0Var2.e;
                        l5Var2.setPivotX(0.0f);
                        l5Var3.setPivotX(0.0f);
                        if (rq0Var.B) {
                            l5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            l5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            l5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            l5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    AndroidUtilities.runOnUIThread(rq0Var.D, 4000L);
                    break;
                }
        }
    }
}
