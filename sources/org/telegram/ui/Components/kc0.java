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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class kc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kc0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((lc0) this.b).z();
                break;
            case 1:
                ((bi.y) this.b).invalidateSelf();
                break;
            case 2:
                ((tc0) this.b).invalidateSelf();
                break;
            case 3:
                ((nd0) this.b).d();
                break;
            case 4:
                wd0 wd0Var = (wd0) this.b;
                wd0Var.getClass();
                try {
                    wd0Var.d.I.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((je0) this.b).f.start();
                break;
            case 6:
                c00 c00Var = ((nf0) this.b).c.l0;
                if (c00Var != null) {
                    c00Var.e(false, true, false);
                    break;
                }
                break;
            case 7:
                qf0 qf0Var = (qf0) this.b;
                qf0Var.r = false;
                qf0Var.invalidate();
                break;
            case 8:
                ((tf0) this.b).h = null;
                break;
            case 9:
                tf0 tf0Var = (tf0) ((og.u0) this.b).c;
                tf0Var.d.L(tf0Var.e, false);
                break;
            case 10:
                org.telegram.ui.hu0 hu0Var = (org.telegram.ui.hu0) this.b;
                if (hu0Var.x) {
                    hu0Var.h("pollPosition();");
                }
                if (hu0Var.G) {
                    AndroidUtilities.runOnUIThread(hu0Var.L, 500L);
                    break;
                }
                break;
            case 11:
                ((FrameLayout) this.b).invalidate();
                break;
            case 12:
                og0 og0Var = (og0) ((kg.b) this.b).b;
                og0Var.d.invalidate();
                og0Var.e.requestLayout();
                break;
            case 13:
                ((qg0) this.b).f();
                break;
            case 14:
                try {
                    oi0 oi0Var = ((ni0) this.b).b;
                    if (oi0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) oi0Var.getParent()).removeView(oi0Var);
                    }
                    oi0Var.Q.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 15:
                ((RLottieNative) this.b).d();
                break;
            case 16:
                pk0 pk0Var = (pk0) this.b;
                pk0Var.x0 = null;
                pk0Var.j();
                ok0 ok0Var = pk0Var.g0;
                if (ok0Var != null) {
                    ok0Var.s();
                    break;
                }
                break;
            case 17:
                ((mk0) this.b).H.a.setVisibility(4);
                break;
            case 18:
                qk0 qk0Var = (qk0) this.b;
                t71 t71Var = qk0Var.n;
                if (t71Var != null) {
                    boolean y3 = t71Var.y();
                    float n10 = qk0Var.n.n() / qk0Var.n.p();
                    float f7 = qk0Var.s;
                    if (n10 < f7) {
                        qk0Var.n.L((long) (f7 * r2.p()), false);
                    } else if (n10 > qk0Var.v) {
                        qk0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(qk0Var.x, 16L);
                    }
                }
                qk0Var.invalidate();
                break;
            case 19:
                vl0 vl0Var = (vl0) this.b;
                vl0Var.V1 = null;
                vl0Var.U1 = null;
                org.telegram.ui.Cells.z zVar = vl0Var.D1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = vl0Var.D1;
                if (zVar2 != null && zVar2.isStateful()) {
                    vl0Var.D1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 20:
                fn0 fn0Var = (fn0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = fn0Var.d;
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
                AndroidUtilities.runOnUIThread(new gf(fn0Var, arrayList3, arrayList4, 19));
                break;
            case 21:
                ((hn0) this.b).invalidateSelf();
                break;
            case 22:
                ((rn0) this.b).f.setVisibility(8);
                break;
            case 23:
                ((org.telegram.ui.gy) this.b).s();
                break;
            case 24:
                ((w70) this.b).s();
                break;
            case 25:
                ((oo0) this.b).getClass();
                break;
            case 26:
                org.telegram.ui.Cells.t1 t1Var = ((ro0) this.b).n;
                if (t1Var != null) {
                    t1Var.invalidate();
                    break;
                }
                break;
            case 27:
                to0 to0Var = (to0) this.b;
                to0Var.q = false;
                to0Var.b.run();
                break;
            case 28:
                ((sq0) ((bi.u2) this.b).b).a1(1);
                break;
            default:
                xq0 xq0Var = (xq0) this.b;
                vq0[] vq0VarArr = xq0Var.a;
                if (xq0Var.b != 1) {
                    for (vq0 vq0Var : vq0VarArr) {
                        org.telegram.ui.ActionBar.l5 l5Var = vq0Var.d;
                        l5Var.setAlpha(1.0f);
                        l5Var.setScaleX(1.0f);
                        l5Var.setScaleY(1.0f);
                        vq0Var.e.setAlpha(0.0f);
                    }
                    xq0Var.E = false;
                    AndroidUtilities.runOnUIThread(xq0Var.G, 4000L);
                    break;
                } else {
                    xq0Var.E = !xq0Var.E;
                    for (vq0 vq0Var2 : vq0VarArr) {
                        org.telegram.ui.ActionBar.l5 l5Var2 = vq0Var2.d;
                        org.telegram.ui.ActionBar.l5 l5Var3 = vq0Var2.e;
                        l5Var2.setPivotX(0.0f);
                        l5Var3.setPivotX(0.0f);
                        if (xq0Var.E) {
                            l5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            l5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            l5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            l5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    AndroidUtilities.runOnUIThread(xq0Var.G, 4000L);
                    break;
                }
        }
    }
}
