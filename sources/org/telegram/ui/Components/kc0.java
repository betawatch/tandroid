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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                ((ci.u) this.b).invalidateSelf();
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
                vz vzVar = ((nf0) this.b).c.l0;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
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
                tf0 tf0Var = (tf0) ((n7.z0) this.b).c;
                tf0Var.d.L(tf0Var.e, false);
                break;
            case 10:
                org.telegram.ui.iu0 iu0Var = (org.telegram.ui.iu0) this.b;
                if (iu0Var.x) {
                    iu0Var.h("pollPosition();");
                }
                if (iu0Var.G) {
                    AndroidUtilities.runOnUIThread(iu0Var.L, 500L);
                    break;
                }
                break;
            case 11:
                ((FrameLayout) this.b).invalidate();
                break;
            case 12:
                pg0 pg0Var = (pg0) ((lg.b) this.b).b;
                pg0Var.d.invalidate();
                pg0Var.e.requestLayout();
                break;
            case 13:
                ((rg0) this.b).f();
                break;
            case 14:
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
            case 15:
                ((RLottieNative) this.b).d();
                break;
            case 16:
                qk0 qk0Var = (qk0) this.b;
                qk0Var.x0 = null;
                qk0Var.j();
                pk0 pk0Var = qk0Var.g0;
                if (pk0Var != null) {
                    pk0Var.p();
                    break;
                }
                break;
            case 17:
                ((nk0) this.b).H.a.setVisibility(4);
                break;
            case 18:
                rk0 rk0Var = (rk0) this.b;
                u71 u71Var = rk0Var.n;
                if (u71Var != null) {
                    boolean y3 = u71Var.y();
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
            case 19:
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
            case 20:
                jn0 jn0Var = (jn0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = jn0Var.d;
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
                AndroidUtilities.runOnUIThread(new dn0((Object) jn0Var, (Object) arrayList3, (Object) arrayList4, 0));
                break;
            case 21:
                ((ln0) this.b).invalidateSelf();
                break;
            case 22:
                ((vn0) this.b).f.setVisibility(8);
                break;
            case 23:
                ((org.telegram.ui.ey) this.b).s();
                break;
            case 24:
                ((w70) this.b).s();
                break;
            case 25:
                ((to0) this.b).getClass();
                break;
            case 26:
                org.telegram.ui.Cells.u1 u1Var = ((wo0) this.b).n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    break;
                }
                break;
            case 27:
                yo0 yo0Var = (yo0) this.b;
                yo0Var.q = false;
                yo0Var.b.run();
                break;
            case 28:
                ((vq0) ((ci.i2) this.b).b).a1(1);
                break;
            default:
                ar0 ar0Var = (ar0) this.b;
                yq0[] yq0VarArr = ar0Var.a;
                if (ar0Var.b != 1) {
                    for (yq0 yq0Var : yq0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var = yq0Var.d;
                        j5Var.setAlpha(1.0f);
                        j5Var.setScaleX(1.0f);
                        j5Var.setScaleY(1.0f);
                        yq0Var.e.setAlpha(0.0f);
                    }
                    ar0Var.E = false;
                    AndroidUtilities.runOnUIThread(ar0Var.G, 4000L);
                    break;
                } else {
                    ar0Var.E = !ar0Var.E;
                    for (yq0 yq0Var2 : yq0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var2 = yq0Var2.d;
                        org.telegram.ui.ActionBar.j5 j5Var3 = yq0Var2.e;
                        j5Var2.setPivotX(0.0f);
                        j5Var3.setPivotX(0.0f);
                        if (ar0Var.E) {
                            j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            j5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            j5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    AndroidUtilities.runOnUIThread(ar0Var.G, 4000L);
                    break;
                }
        }
    }
}
