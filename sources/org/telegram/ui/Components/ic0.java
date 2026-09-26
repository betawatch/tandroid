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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ic0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ic0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((kc0) this.b).a();
                break;
            case 1:
                ((mc0) this.b).z();
                break;
            case 2:
                ((ci.u) this.b).invalidateSelf();
                break;
            case 3:
                ((uc0) this.b).invalidateSelf();
                break;
            case 4:
                ((od0) this.b).d();
                break;
            case 5:
                xd0 xd0Var = (xd0) this.b;
                xd0Var.getClass();
                try {
                    xd0Var.d.I.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                ((ke0) this.b).f.start();
                break;
            case 7:
                wz wzVar = ((of0) this.b).c.l0;
                if (wzVar != null) {
                    wzVar.e(false, true, false);
                    break;
                }
                break;
            case 8:
                rf0 rf0Var = (rf0) this.b;
                rf0Var.r = false;
                rf0Var.invalidate();
                break;
            case 9:
                ((uf0) this.b).h = null;
                break;
            case 10:
                uf0 uf0Var = (uf0) ((n7.z0) this.b).c;
                uf0Var.d.L(uf0Var.e, false);
                break;
            case 11:
                org.telegram.ui.au0 au0Var = (org.telegram.ui.au0) this.b;
                if (au0Var.x) {
                    au0Var.h("pollPosition();");
                }
                if (au0Var.G) {
                    AndroidUtilities.runOnUIThread(au0Var.L, 500L);
                    break;
                }
                break;
            case 12:
                ((FrameLayout) this.b).invalidate();
                break;
            case 13:
                og0 og0Var = (og0) ((lg.b) this.b).b;
                og0Var.d.invalidate();
                og0Var.e.requestLayout();
                break;
            case 14:
                ((qg0) this.b).f();
                break;
            case 15:
                try {
                    pi0 pi0Var = ((oi0) this.b).b;
                    if (pi0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) pi0Var.getParent()).removeView(pi0Var);
                    }
                    pi0Var.Q.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 16:
                ((RLottieNative) this.b).d();
                break;
            case 17:
                qk0 qk0Var = (qk0) this.b;
                qk0Var.x0 = null;
                qk0Var.j();
                pk0 pk0Var = qk0Var.g0;
                if (pk0Var != null) {
                    pk0Var.n();
                    break;
                }
                break;
            case 18:
                ((nk0) this.b).H.a.setVisibility(4);
                break;
            case 19:
                rk0 rk0Var = (rk0) this.b;
                s71 s71Var = rk0Var.n;
                if (s71Var != null) {
                    boolean y3 = s71Var.y();
                    float n10 = rk0Var.n.n() / rk0Var.n.p();
                    float f7 = rk0Var.s;
                    if (n10 < f7) {
                        rk0Var.n.L((long) (f7 * r2.p()), false);
                    } else if (n10 > rk0Var.v) {
                        rk0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(rk0Var.x, 16L);
                    }
                }
                rk0Var.invalidate();
                break;
            case 20:
                wl0 wl0Var = (wl0) this.b;
                wl0Var.V1 = null;
                wl0Var.U1 = null;
                org.telegram.ui.Cells.z zVar = wl0Var.D1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = wl0Var.D1;
                if (zVar2 != null && zVar2.isStateful()) {
                    wl0Var.D1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 21:
                in0 in0Var = (in0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = in0Var.d;
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
                AndroidUtilities.runOnUIThread(new cn0((Object) in0Var, (Object) arrayList3, (Object) arrayList4, 0));
                break;
            case 22:
                ((kn0) this.b).invalidateSelf();
                break;
            case 23:
                ((un0) this.b).f.setVisibility(8);
                break;
            case 24:
                ((org.telegram.ui.zx) this.b).s();
                break;
            case 25:
                ((y70) this.b).s();
                break;
            case 26:
                ((so0) this.b).getClass();
                break;
            case 27:
                org.telegram.ui.Cells.u1 u1Var = ((vo0) this.b).n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    break;
                }
                break;
            case 28:
                xo0 xo0Var = (xo0) this.b;
                xo0Var.q = false;
                xo0Var.b.run();
                break;
            default:
                ((uq0) ((ci.i2) this.b).b).a1(1);
                break;
        }
    }
}
