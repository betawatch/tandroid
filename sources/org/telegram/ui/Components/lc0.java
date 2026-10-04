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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class lc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lc0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((nc0) this.b).a();
                break;
            case 1:
                ((pc0) this.b).z();
                break;
            case 2:
                ((ci.u) this.b).invalidateSelf();
                break;
            case 3:
                ((wc0) this.b).invalidateSelf();
                break;
            case 4:
                ((qd0) this.b).d();
                break;
            case 5:
                zd0 zd0Var = (zd0) this.b;
                zd0Var.getClass();
                try {
                    zd0Var.d.I.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                ((me0) this.b).f.start();
                break;
            case 7:
                yz yzVar = ((qf0) this.b).c.l0;
                if (yzVar != null) {
                    yzVar.e(false, true, false);
                    break;
                }
                break;
            case 8:
                tf0 tf0Var = (tf0) this.b;
                tf0Var.r = false;
                tf0Var.invalidate();
                break;
            case 9:
                ((wf0) this.b).h = null;
                break;
            case 10:
                wf0 wf0Var = (wf0) ((n7.z0) this.b).c;
                wf0Var.d.L(wf0Var.e, false);
                break;
            case 11:
                org.telegram.ui.du0 du0Var = (org.telegram.ui.du0) this.b;
                if (du0Var.x) {
                    du0Var.h("pollPosition();");
                }
                if (du0Var.G) {
                    AndroidUtilities.runOnUIThread(du0Var.L, 500L);
                    break;
                }
                break;
            case 12:
                ((FrameLayout) this.b).invalidate();
                break;
            case 13:
                rg0 rg0Var = (rg0) ((lg.b) this.b).b;
                rg0Var.d.invalidate();
                rg0Var.e.requestLayout();
                break;
            case 14:
                ((tg0) this.b).f();
                break;
            case 15:
                try {
                    ri0 ri0Var = ((qi0) this.b).b;
                    if (ri0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ri0Var.getParent()).removeView(ri0Var);
                    }
                    ri0Var.Q.run();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 16:
                ((RLottieNative) this.b).d();
                break;
            case 17:
                sk0 sk0Var = (sk0) this.b;
                sk0Var.x0 = null;
                sk0Var.j();
                rk0 rk0Var = sk0Var.g0;
                if (rk0Var != null) {
                    rk0Var.o();
                    break;
                }
                break;
            case 18:
                ((pk0) this.b).H.a.setVisibility(4);
                break;
            case 19:
                tk0 tk0Var = (tk0) this.b;
                d81 d81Var = tk0Var.n;
                if (d81Var != null) {
                    boolean y3 = d81Var.y();
                    float n10 = tk0Var.n.n() / tk0Var.n.p();
                    float f7 = tk0Var.s;
                    if (n10 < f7) {
                        tk0Var.n.L((long) (f7 * r2.p()), false);
                    } else if (n10 > tk0Var.v) {
                        tk0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(tk0Var.x, 16L);
                    }
                }
                tk0Var.invalidate();
                break;
            case 20:
                zl0 zl0Var = (zl0) this.b;
                zl0Var.V1 = null;
                zl0Var.U1 = null;
                org.telegram.ui.Cells.z zVar = zl0Var.D1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = zl0Var.D1;
                if (zVar2 != null && zVar2.isStateful()) {
                    zl0Var.D1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 21:
                on0 on0Var = (on0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = on0Var.d;
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
                AndroidUtilities.runOnUIThread(new in0((Object) on0Var, (Object) arrayList3, (Object) arrayList4, 0));
                break;
            case 22:
                ((qn0) this.b).invalidateSelf();
                break;
            case 23:
                ((ao0) this.b).f.setVisibility(8);
                break;
            case 24:
                ((org.telegram.ui.dy) this.b).s();
                break;
            case 25:
                ((b80) this.b).s();
                break;
            case 26:
                ((yo0) this.b).getClass();
                break;
            case 27:
                org.telegram.ui.Cells.u1 u1Var = ((bp0) this.b).n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    break;
                }
                break;
            case 28:
                dp0 dp0Var = (dp0) this.b;
                dp0Var.q = false;
                dp0Var.b.run();
                break;
            default:
                ((zq0) ((ci.i2) this.b).b).X0(1);
                break;
        }
    }
}
