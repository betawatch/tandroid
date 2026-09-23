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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ac0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ac0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((bc0) this.b).z();
                break;
            case 1:
                ((ci.u) this.b).invalidateSelf();
                break;
            case 2:
                ((jc0) this.b).invalidateSelf();
                break;
            case 3:
                ((dd0) this.b).d();
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
                wz wzVar = ((ef0) this.b).c.l0;
                if (wzVar != null) {
                    wzVar.e(false, true, false);
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
                kf0 kf0Var = (kf0) ((n7.a1) this.b).c;
                kf0Var.d.L(kf0Var.e, false);
                break;
            case 10:
                org.telegram.ui.bu0 bu0Var = (org.telegram.ui.bu0) this.b;
                if (bu0Var.x) {
                    bu0Var.h("pollPosition();");
                }
                if (bu0Var.G) {
                    AndroidUtilities.runOnUIThread(bu0Var.L, 500L);
                    break;
                }
                break;
            case 11:
                ((FrameLayout) this.b).invalidate();
                break;
            case 12:
                eg0 eg0Var = (eg0) ((lg.b) this.b).b;
                eg0Var.d.invalidate();
                eg0Var.e.requestLayout();
                break;
            case 13:
                ((gg0) this.b).f();
                break;
            case 14:
                try {
                    fi0 fi0Var = ((ei0) this.b).b;
                    if (fi0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) fi0Var.getParent()).removeView(fi0Var);
                    }
                    fi0Var.Q.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 15:
                ((RLottieNative) this.b).d();
                break;
            case 16:
                gk0 gk0Var = (gk0) this.b;
                gk0Var.x0 = null;
                gk0Var.j();
                fk0 fk0Var = gk0Var.g0;
                if (fk0Var != null) {
                    fk0Var.o();
                    break;
                }
                break;
            case 17:
                ((dk0) this.b).H.a.setVisibility(4);
                break;
            case 18:
                hk0 hk0Var = (hk0) this.b;
                f71 f71Var = hk0Var.n;
                if (f71Var != null) {
                    boolean y3 = f71Var.y();
                    float n10 = hk0Var.n.n() / hk0Var.n.p();
                    float f7 = hk0Var.s;
                    if (n10 < f7) {
                        hk0Var.n.L((long) (f7 * r2.p()), false);
                    } else if (n10 > hk0Var.v) {
                        hk0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(hk0Var.x, 16L);
                    }
                }
                hk0Var.invalidate();
                break;
            case 19:
                ml0 ml0Var = (ml0) this.b;
                ml0Var.V1 = null;
                ml0Var.U1 = null;
                org.telegram.ui.Cells.z zVar = ml0Var.D1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = ml0Var.D1;
                if (zVar2 != null && zVar2.isStateful()) {
                    ml0Var.D1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 20:
                wm0 wm0Var = (wm0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = wm0Var.d;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(wm0Var, arrayList3, arrayList4, 27));
                break;
            case 21:
                ((ym0) this.b).invalidateSelf();
                break;
            case 22:
                ((in0) this.b).f.setVisibility(8);
                break;
            case 23:
                ((org.telegram.ui.ay) this.b).s();
                break;
            case 24:
                ((o70) this.b).s();
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
                ((hq0) ((ci.i2) this.b).b).a1(1);
                break;
            default:
                mq0 mq0Var = (mq0) this.b;
                kq0[] kq0VarArr = mq0Var.a;
                if (mq0Var.b != 1) {
                    for (kq0 kq0Var : kq0VarArr) {
                        org.telegram.ui.ActionBar.i5 i5Var = kq0Var.d;
                        i5Var.setAlpha(1.0f);
                        i5Var.setScaleX(1.0f);
                        i5Var.setScaleY(1.0f);
                        kq0Var.e.setAlpha(0.0f);
                    }
                    mq0Var.E = false;
                    AndroidUtilities.runOnUIThread(mq0Var.G, 4000L);
                    break;
                } else {
                    mq0Var.E = !mq0Var.E;
                    for (kq0 kq0Var2 : kq0VarArr) {
                        org.telegram.ui.ActionBar.i5 i5Var2 = kq0Var2.d;
                        org.telegram.ui.ActionBar.i5 i5Var3 = kq0Var2.e;
                        i5Var2.setPivotX(0.0f);
                        i5Var3.setPivotX(0.0f);
                        if (mq0Var.E) {
                            i5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            i5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            i5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            i5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    AndroidUtilities.runOnUIThread(mq0Var.G, 4000L);
                    break;
                }
        }
    }
}
