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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class yc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yc0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ad0) this.b).a();
                break;
            case 1:
                ((cd0) this.b).z();
                break;
            case 2:
                ((di.u) this.b).invalidateSelf();
                break;
            case 3:
                ((kd0) this.b).invalidateSelf();
                break;
            case 4:
                ((de0) this.b).d();
                break;
            case 5:
                me0 me0Var = (me0) this.b;
                me0Var.getClass();
                try {
                    me0Var.d.I.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                ((ze0) this.b).f.start();
                break;
            case 7:
                h00 h00Var = ((dg0) this.b).c.l0;
                if (h00Var != null) {
                    h00Var.d(false, true, false);
                    break;
                }
                break;
            case 8:
                gg0 gg0Var = (gg0) this.b;
                gg0Var.r = false;
                gg0Var.invalidate();
                break;
            case 9:
                ((jg0) this.b).h = null;
                break;
            case 10:
                jg0 jg0Var = (jg0) ((m4.c) this.b).c;
                jg0Var.d.L(jg0Var.e, false);
                break;
            case 11:
                org.telegram.ui.pu0 pu0Var = (org.telegram.ui.pu0) this.b;
                if (pu0Var.x) {
                    pu0Var.h("pollPosition();");
                }
                if (pu0Var.G) {
                    AndroidUtilities.runOnUIThread(pu0Var.L, 500L);
                    break;
                }
                break;
            case 12:
                ((FrameLayout) this.b).invalidate();
                break;
            case 13:
                fh0 fh0Var = (fh0) ((mg.b) this.b).b;
                fh0Var.d.invalidate();
                fh0Var.e.requestLayout();
                break;
            case 14:
                ((hh0) this.b).f();
                break;
            case 15:
                try {
                    fj0 fj0Var = ((ej0) this.b).b;
                    if (fj0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) fj0Var.getParent()).removeView(fj0Var);
                    }
                    fj0Var.Q.run();
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
                    fl0Var.y();
                    break;
                }
                break;
            case 18:
                ((dl0) this.b).H.a.setVisibility(4);
                break;
            case 19:
                hl0 hl0Var = (hl0) this.b;
                h81 h81Var = hl0Var.n;
                if (h81Var != null) {
                    boolean y3 = h81Var.y();
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
                org.telegram.ui.Cells.z zVar = mm0Var.B1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = mm0Var.B1;
                if (zVar2 != null && zVar2.isStateful()) {
                    mm0Var.B1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 21:
                yn0 yn0Var = (yn0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = yn0Var.d;
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
                AndroidUtilities.runOnUIThread(new v70(yn0Var, arrayList3, arrayList4, 6));
                break;
            case 22:
                ((ao0) this.b).invalidateSelf();
                break;
            case 23:
                ((ko0) this.b).f.setVisibility(8);
                break;
            case 24:
                ((org.telegram.ui.iy) this.b).s();
                break;
            case 25:
                ((m80) this.b).s();
                break;
            case 26:
                ((gp0) this.b).getClass();
                break;
            case 27:
                org.telegram.ui.Cells.u1 u1Var = ((jp0) this.b).n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    break;
                }
                break;
            case 28:
                lp0 lp0Var = (lp0) this.b;
                lp0Var.q = false;
                lp0Var.b.run();
                break;
            default:
                ((jr0) ((di.h2) this.b).b).b1(1);
                break;
        }
    }
}
