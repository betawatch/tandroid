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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class cc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cc0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((dc0) this.b).z();
                break;
            case 1:
                ((di.u) this.b).invalidateSelf();
                break;
            case 2:
                ((lc0) this.b).invalidateSelf();
                break;
            case 3:
                ((ed0) this.b).d();
                break;
            case 4:
                nd0 nd0Var = (nd0) this.b;
                nd0Var.getClass();
                try {
                    nd0Var.d.I.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((ae0) this.b).f.start();
                break;
            case 6:
                vz vzVar = ((ef0) this.b).c.l0;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    break;
                }
                break;
            case 7:
                hf0 hf0Var = (hf0) this.b;
                hf0Var.r = false;
                hf0Var.invalidate();
                break;
            case 8:
                ((kf0) this.b).h = null;
                break;
            case 9:
                kf0 kf0Var = (kf0) ((n7.z0) this.b).c;
                kf0Var.d.L(kf0Var.e, false);
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
                eg0 eg0Var = (eg0) ((mg.b) this.b).b;
                eg0Var.d.invalidate();
                eg0Var.e.requestLayout();
                break;
            case 13:
                ((gg0) this.b).f();
                break;
            case 14:
                try {
                    ei0 ei0Var = ((di0) this.b).b;
                    if (ei0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ei0Var.getParent()).removeView(ei0Var);
                    }
                    ei0Var.Q.run();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 15:
                ((RLottieNative) this.b).d();
                break;
            case 16:
                fk0 fk0Var = (fk0) this.b;
                fk0Var.x0 = null;
                fk0Var.j();
                ek0 ek0Var = fk0Var.g0;
                if (ek0Var != null) {
                    ek0Var.J();
                    break;
                }
                break;
            case 17:
                ((ck0) this.b).H.a.setVisibility(4);
                break;
            case 18:
                gk0 gk0Var = (gk0) this.b;
                g71 g71Var = gk0Var.n;
                if (g71Var != null) {
                    boolean y3 = g71Var.y();
                    float n10 = gk0Var.n.n() / gk0Var.n.p();
                    float f7 = gk0Var.s;
                    if (n10 < f7) {
                        gk0Var.n.L((long) (f7 * r2.p()), false);
                    } else if (n10 > gk0Var.v) {
                        gk0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(gk0Var.x, 16L);
                    }
                }
                gk0Var.invalidate();
                break;
            case 19:
                ll0 ll0Var = (ll0) this.b;
                ll0Var.V1 = null;
                ll0Var.U1 = null;
                org.telegram.ui.Cells.z zVar = ll0Var.D1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = ll0Var.D1;
                if (zVar2 != null && zVar2.isStateful()) {
                    ll0Var.D1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 20:
                vm0 vm0Var = (vm0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = vm0Var.d;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(vm0Var, arrayList3, arrayList4, 27));
                break;
            case 21:
                ((xm0) this.b).invalidateSelf();
                break;
            case 22:
                ((hn0) this.b).f.setVisibility(8);
                break;
            case 23:
                ((org.telegram.ui.ey) this.b).s();
                break;
            case 24:
                ((n70) this.b).s();
                break;
            case 25:
                ((fo0) this.b).getClass();
                break;
            case 26:
                org.telegram.ui.Cells.t1 t1Var = ((io0) this.b).n;
                if (t1Var != null) {
                    t1Var.invalidate();
                    break;
                }
                break;
            case 27:
                ko0 ko0Var = (ko0) this.b;
                ko0Var.q = false;
                ko0Var.b.run();
                break;
            case 28:
                ((hq0) ((di.i2) this.b).b).a1(1);
                break;
            default:
                mq0 mq0Var = (mq0) this.b;
                kq0[] kq0VarArr = mq0Var.a;
                if (mq0Var.b != 1) {
                    for (kq0 kq0Var : kq0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var = kq0Var.d;
                        j5Var.setAlpha(1.0f);
                        j5Var.setScaleX(1.0f);
                        j5Var.setScaleY(1.0f);
                        kq0Var.e.setAlpha(0.0f);
                    }
                    mq0Var.E = false;
                    AndroidUtilities.runOnUIThread(mq0Var.G, 4000L);
                    break;
                } else {
                    mq0Var.E = !mq0Var.E;
                    for (kq0 kq0Var2 : kq0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var2 = kq0Var2.d;
                        org.telegram.ui.ActionBar.j5 j5Var3 = kq0Var2.e;
                        j5Var2.setPivotX(0.0f);
                        j5Var3.setPivotX(0.0f);
                        if (mq0Var.E) {
                            j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            j5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            j5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    AndroidUtilities.runOnUIThread(mq0Var.G, 4000L);
                    break;
                }
        }
    }
}
