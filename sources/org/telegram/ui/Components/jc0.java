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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class jc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jc0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((lc0) this.b).a();
                break;
            case 1:
                ((nc0) this.b).z();
                break;
            case 2:
                ((ci.u) this.b).invalidateSelf();
                break;
            case 3:
                ((vc0) this.b).invalidateSelf();
                break;
            case 4:
                ((pd0) this.b).d();
                break;
            case 5:
                yd0 yd0Var = (yd0) this.b;
                yd0Var.getClass();
                try {
                    yd0Var.d.I.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                ((le0) this.b).f.start();
                break;
            case 7:
                vz vzVar = ((pf0) this.b).c.l0;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    break;
                }
                break;
            case 8:
                sf0 sf0Var = (sf0) this.b;
                sf0Var.r = false;
                sf0Var.invalidate();
                break;
            case 9:
                ((vf0) this.b).h = null;
                break;
            case 10:
                vf0 vf0Var = (vf0) ((org.telegram.ui.Cells.f3) this.b).c;
                vf0Var.d.L(vf0Var.e, false);
                break;
            case 11:
                org.telegram.ui.iu0 iu0Var = (org.telegram.ui.iu0) this.b;
                if (iu0Var.x) {
                    iu0Var.h("pollPosition();");
                }
                if (iu0Var.G) {
                    AndroidUtilities.runOnUIThread(iu0Var.L, 500L);
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
                } catch (Exception e) {
                    FileLog.e(e);
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
                v71 v71Var = tk0Var.n;
                if (v71Var != null) {
                    boolean y3 = v71Var.y();
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
                yl0 yl0Var = (yl0) this.b;
                yl0Var.V1 = null;
                yl0Var.U1 = null;
                org.telegram.ui.Cells.z zVar = yl0Var.D1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = yl0Var.D1;
                if (zVar2 != null && zVar2.isStateful()) {
                    yl0Var.D1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 21:
                kn0 kn0Var = (kn0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = kn0Var.d;
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
                AndroidUtilities.runOnUIThread(new en0((Object) kn0Var, (Object) arrayList3, (Object) arrayList4, 0));
                break;
            case 22:
                ((mn0) this.b).invalidateSelf();
                break;
            case 23:
                ((wn0) this.b).f.setVisibility(8);
                break;
            case 24:
                ((org.telegram.ui.ey) this.b).s();
                break;
            case 25:
                ((y70) this.b).s();
                break;
            case 26:
                ((uo0) this.b).getClass();
                break;
            case 27:
                org.telegram.ui.Cells.u1 u1Var = ((xo0) this.b).n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    break;
                }
                break;
            case 28:
                zo0 zo0Var = (zo0) this.b;
                zo0Var.q = false;
                zo0Var.b.run();
                break;
            default:
                ((wq0) ((ci.i2) this.b).b).a1(1);
                break;
        }
    }
}
