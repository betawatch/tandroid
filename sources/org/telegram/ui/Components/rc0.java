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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rc0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((tc0) this.b).a();
                break;
            case 1:
                ((ei.u) this.b).invalidateSelf();
                break;
            case 2:
                ((ed0) this.b).invalidateSelf();
                break;
            case 3:
                ((xd0) this.b).d();
                break;
            case 4:
                ge0 ge0Var = (ge0) this.b;
                ge0Var.getClass();
                try {
                    ge0Var.d.M.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((ue0) this.b).f.start();
                break;
            case 6:
                e00 e00Var = ((yf0) this.b).c.l0;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    break;
                }
                break;
            case 7:
                bg0 bg0Var = (bg0) this.b;
                bg0Var.r = false;
                bg0Var.invalidate();
                break;
            case 8:
                ((eg0) this.b).h = null;
                break;
            case 9:
                eg0 eg0Var = (eg0) ((mi.q) this.b).c;
                eg0Var.d.L(eg0Var.e, false);
                break;
            case 10:
                org.telegram.ui.ot0 ot0Var = (org.telegram.ui.ot0) this.b;
                if (ot0Var.x) {
                    ot0Var.h("pollPosition();");
                }
                if (ot0Var.G) {
                    AndroidUtilities.runOnUIThread(ot0Var.L, 500L);
                    break;
                }
                break;
            case 11:
                ((FrameLayout) this.b).invalidate();
                break;
            case 12:
                ah0 ah0Var = (ah0) ((mg.b) this.b).b;
                ah0Var.d.invalidate();
                ah0Var.e.requestLayout();
                break;
            case 13:
                ((ch0) this.b).f();
                break;
            case 14:
                try {
                    bj0 bj0Var = ((aj0) this.b).b;
                    if (bj0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) bj0Var.getParent()).removeView(bj0Var);
                    }
                    bj0Var.Q.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 15:
                ((RLottieNative) this.b).d();
                break;
            case 16:
                dl0 dl0Var = (dl0) this.b;
                dl0Var.x0 = null;
                dl0Var.j();
                cl0 cl0Var = dl0Var.g0;
                if (cl0Var != null) {
                    cl0Var.v();
                    break;
                }
                break;
            case 17:
                ((al0) this.b).H.a.setVisibility(4);
                break;
            case 18:
                el0 el0Var = (el0) this.b;
                c81 c81Var = el0Var.n;
                if (c81Var != null) {
                    boolean y3 = c81Var.y();
                    float n10 = el0Var.n.n() / el0Var.n.p();
                    float f7 = el0Var.s;
                    if (n10 < f7) {
                        el0Var.n.L((long) (f7 * r2.p()), false);
                    } else if (n10 > el0Var.v) {
                        el0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(el0Var.x, 16L);
                    }
                }
                el0Var.invalidate();
                break;
            case 19:
                jm0 jm0Var = (jm0) this.b;
                jm0Var.T1 = null;
                jm0Var.S1 = null;
                org.telegram.ui.Cells.z zVar = jm0Var.B1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = jm0Var.B1;
                if (zVar2 != null && zVar2.isStateful()) {
                    jm0Var.B1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 20:
                un0 un0Var = (un0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = un0Var.d;
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
                AndroidUtilities.runOnUIThread(new lg((Object) un0Var, (Object) arrayList3, (Object) arrayList4, 18));
                break;
            case 21:
                ((wn0) this.b).invalidateSelf();
                break;
            case 22:
                ((go0) this.b).f.setVisibility(8);
                break;
            case 23:
                ((org.telegram.ui.lx) this.b).s();
                break;
            case 24:
                ((i80) this.b).s();
                break;
            case 25:
                ((dp0) this.b).getClass();
                break;
            case 26:
                org.telegram.ui.Cells.u1 u1Var = ((gp0) this.b).n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    break;
                }
                break;
            case 27:
                hp0 hp0Var = (hp0) this.b;
                hp0Var.q = false;
                hp0Var.b.run();
                break;
            case 28:
                ((fr0) ((ai.u) this.b).b).c1(1);
                break;
            default:
                kr0 kr0Var = (kr0) this.b;
                ir0[] ir0VarArr = kr0Var.a;
                if (kr0Var.b != 1) {
                    for (ir0 ir0Var : ir0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var = ir0Var.d;
                        j5Var.setAlpha(1.0f);
                        j5Var.setScaleX(1.0f);
                        j5Var.setScaleY(1.0f);
                        ir0Var.e.setAlpha(0.0f);
                    }
                    kr0Var.E = false;
                    AndroidUtilities.runOnUIThread(kr0Var.G, 4000L);
                    break;
                } else {
                    kr0Var.E = !kr0Var.E;
                    for (ir0 ir0Var2 : ir0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var2 = ir0Var2.d;
                        org.telegram.ui.ActionBar.j5 j5Var3 = ir0Var2.e;
                        j5Var2.setPivotX(0.0f);
                        j5Var3.setPivotX(0.0f);
                        if (kr0Var.E) {
                            j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            j5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            j5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    AndroidUtilities.runOnUIThread(kr0Var.G, 4000L);
                    break;
                }
        }
    }
}
