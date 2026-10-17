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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
                ((te0) this.b).f.start();
                break;
            case 6:
                e00 e00Var = ((xf0) this.b).c.l0;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    break;
                }
                break;
            case 7:
                ag0 ag0Var = (ag0) this.b;
                ag0Var.r = false;
                ag0Var.invalidate();
                break;
            case 8:
                ((dg0) this.b).h = null;
                break;
            case 9:
                dg0 dg0Var = (dg0) ((mi.q) this.b).c;
                dg0Var.d.L(dg0Var.e, false);
                break;
            case 10:
                org.telegram.ui.qt0 qt0Var = (org.telegram.ui.qt0) this.b;
                if (qt0Var.x) {
                    qt0Var.h("pollPosition();");
                }
                if (qt0Var.G) {
                    AndroidUtilities.runOnUIThread(qt0Var.L, 500L);
                    break;
                }
                break;
            case 11:
                ((FrameLayout) this.b).invalidate();
                break;
            case 12:
                zg0 zg0Var = (zg0) ((mg.b) this.b).b;
                zg0Var.d.invalidate();
                zg0Var.e.requestLayout();
                break;
            case 13:
                ((bh0) this.b).f();
                break;
            case 14:
                try {
                    aj0 aj0Var = ((zi0) this.b).b;
                    if (aj0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) aj0Var.getParent()).removeView(aj0Var);
                    }
                    aj0Var.Q.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 15:
                ((RLottieNative) this.b).d();
                break;
            case 16:
                cl0 cl0Var = (cl0) this.b;
                cl0Var.x0 = null;
                cl0Var.j();
                bl0 bl0Var = cl0Var.g0;
                if (bl0Var != null) {
                    bl0Var.q();
                    break;
                }
                break;
            case 17:
                ((zk0) this.b).H.a.setVisibility(4);
                break;
            case 18:
                dl0 dl0Var = (dl0) this.b;
                a81 a81Var = dl0Var.n;
                if (a81Var != null) {
                    boolean y3 = a81Var.y();
                    float n10 = dl0Var.n.n() / dl0Var.n.p();
                    float f7 = dl0Var.s;
                    if (n10 < f7) {
                        dl0Var.n.L((long) (f7 * r2.p()), false);
                    } else if (n10 > dl0Var.v) {
                        dl0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(dl0Var.x, 16L);
                    }
                }
                dl0Var.invalidate();
                break;
            case 19:
                im0 im0Var = (im0) this.b;
                im0Var.T1 = null;
                im0Var.S1 = null;
                org.telegram.ui.Cells.z zVar = im0Var.B1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = im0Var.B1;
                if (zVar2 != null && zVar2.isStateful()) {
                    im0Var.B1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 20:
                tn0 tn0Var = (tn0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = tn0Var.d;
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
                AndroidUtilities.runOnUIThread(new lg((Object) tn0Var, (Object) arrayList3, (Object) arrayList4, 18));
                break;
            case 21:
                ((vn0) this.b).invalidateSelf();
                break;
            case 22:
                ((fo0) this.b).f.setVisibility(8);
                break;
            case 23:
                ((org.telegram.ui.nx) this.b).s();
                break;
            case 24:
                ((i80) this.b).s();
                break;
            case 25:
                ((cp0) this.b).getClass();
                break;
            case 26:
                org.telegram.ui.Cells.u1 u1Var = ((fp0) this.b).n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    break;
                }
                break;
            case 27:
                gp0 gp0Var = (gp0) this.b;
                gp0Var.q = false;
                gp0Var.b.run();
                break;
            case 28:
                ((dr0) ((ai.u) this.b).b).b1(1);
                break;
            default:
                ir0 ir0Var = (ir0) this.b;
                gr0[] gr0VarArr = ir0Var.a;
                if (ir0Var.b != 1) {
                    for (gr0 gr0Var : gr0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var = gr0Var.d;
                        j5Var.setAlpha(1.0f);
                        j5Var.setScaleX(1.0f);
                        j5Var.setScaleY(1.0f);
                        gr0Var.e.setAlpha(0.0f);
                    }
                    ir0Var.E = false;
                    AndroidUtilities.runOnUIThread(ir0Var.G, 4000L);
                    break;
                } else {
                    ir0Var.E = !ir0Var.E;
                    for (gr0 gr0Var2 : gr0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var2 = gr0Var2.d;
                        org.telegram.ui.ActionBar.j5 j5Var3 = gr0Var2.e;
                        j5Var2.setPivotX(0.0f);
                        j5Var3.setPivotX(0.0f);
                        if (ir0Var.E) {
                            j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            j5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            j5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    AndroidUtilities.runOnUIThread(ir0Var.G, 4000L);
                    break;
                }
        }
    }
}
