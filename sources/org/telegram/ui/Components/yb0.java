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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class yb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yb0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((zb0) this.b).S.n.l();
                break;
            case 1:
                ((vc0) this.b).a();
                break;
            case 2:
                ((ei.u) this.b).invalidateSelf();
                break;
            case 3:
                ((gd0) this.b).invalidateSelf();
                break;
            case 4:
                ((ae0) this.b).d();
                break;
            case 5:
                je0 je0Var = (je0) this.b;
                je0Var.getClass();
                try {
                    je0Var.d.M.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                ((xe0) this.b).d.start();
                break;
            case 7:
                e00 e00Var = ((cg0) this.b).c.l0;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    break;
                }
                break;
            case 8:
                fg0 fg0Var = (fg0) this.b;
                fg0Var.r = false;
                fg0Var.invalidate();
                break;
            case 9:
                ((ig0) this.b).h = null;
                break;
            case 10:
                ig0 ig0Var = (ig0) ((n2.e) this.b).c;
                ig0Var.d.L(ig0Var.e, false);
                break;
            case 11:
                org.telegram.ui.rt0 rt0Var = (org.telegram.ui.rt0) this.b;
                if (rt0Var.x) {
                    rt0Var.h("pollPosition();");
                }
                if (rt0Var.G) {
                    AndroidUtilities.runOnUIThread(rt0Var.L, 500L);
                    break;
                }
                break;
            case 12:
                ((FrameLayout) this.b).invalidate();
                break;
            case 13:
                dh0 dh0Var = (dh0) ((mg.b) this.b).b;
                dh0Var.d.invalidate();
                dh0Var.e.requestLayout();
                break;
            case 14:
                ((fh0) this.b).f();
                break;
            case 15:
                try {
                    ej0 ej0Var = ((dj0) this.b).b;
                    if (ej0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ej0Var.getParent()).removeView(ej0Var);
                    }
                    ej0Var.Q.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 16:
                ((RLottieNative) this.b).d();
                break;
            case 17:
                gl0 gl0Var = (gl0) this.b;
                gl0Var.x0 = null;
                gl0Var.j();
                fl0 fl0Var = gl0Var.g0;
                if (fl0Var != null) {
                    fl0Var.u();
                    break;
                }
                break;
            case 18:
                ((dl0) this.b).H.a.setVisibility(4);
                break;
            case 19:
                hl0 hl0Var = (hl0) this.b;
                j81 j81Var = hl0Var.n;
                if (j81Var != null) {
                    boolean y3 = j81Var.y();
                    float n10 = hl0Var.n.n() / hl0Var.n.p();
                    float f7 = hl0Var.s;
                    if (n10 < f7) {
                        hl0Var.n.L((long) (f7 * r2.p()), false);
                    } else if (n10 > hl0Var.v) {
                        hl0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(hl0Var.x, 16L);
                    }
                }
                hl0Var.invalidate();
                break;
            case 20:
                mm0 mm0Var = (mm0) this.b;
                mm0Var.T1 = null;
                mm0Var.S1 = null;
                org.telegram.ui.Cells.y yVar = mm0Var.B1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = mm0Var.B1;
                if (yVar2 != null && yVar2.isStateful()) {
                    mm0Var.B1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 21:
                xn0 xn0Var = (xn0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = xn0Var.d;
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
                AndroidUtilities.runOnUIThread(new lg((Object) xn0Var, (Object) arrayList3, (Object) arrayList4, 18));
                break;
            case 22:
                ((zn0) this.b).invalidateSelf();
                break;
            case 23:
                ((jo0) this.b).f.setVisibility(8);
                break;
            case 24:
                ((org.telegram.ui.nx) this.b).s();
                break;
            case 25:
                ((j80) this.b).s();
                break;
            case 26:
                ((hp0) this.b).getClass();
                break;
            case 27:
                org.telegram.ui.Cells.t1 t1Var = ((kp0) this.b).n;
                if (t1Var != null) {
                    t1Var.invalidate();
                    break;
                }
                break;
            case 28:
                lp0 lp0Var = (lp0) this.b;
                lp0Var.q = false;
                lp0Var.b.run();
                break;
            default:
                ((ir0) ((ai.u) this.b).b).g1(1);
                break;
        }
    }
}
