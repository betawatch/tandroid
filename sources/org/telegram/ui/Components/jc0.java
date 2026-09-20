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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                ((kc0) this.b).z();
                break;
            case 1:
                ((ci.u) this.b).invalidateSelf();
                break;
            case 2:
                ((sc0) this.b).invalidateSelf();
                break;
            case 3:
                ((md0) this.b).d();
                break;
            case 4:
                vd0 vd0Var = (vd0) this.b;
                vd0Var.getClass();
                try {
                    vd0Var.d.I.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((ie0) this.b).f.start();
                break;
            case 6:
                vz vzVar = ((mf0) this.b).c.l0;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    break;
                }
                break;
            case 7:
                pf0 pf0Var = (pf0) this.b;
                pf0Var.r = false;
                pf0Var.invalidate();
                break;
            case 8:
                ((sf0) this.b).h = null;
                break;
            case 9:
                sf0 sf0Var = (sf0) ((org.telegram.ui.Cells.f3) this.b).c;
                sf0Var.d.L(sf0Var.e, false);
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
                og0 og0Var = (og0) ((lg.b) this.b).b;
                og0Var.d.invalidate();
                og0Var.e.requestLayout();
                break;
            case 13:
                ((qg0) this.b).f();
                break;
            case 14:
                try {
                    oi0 oi0Var = ((ni0) this.b).b;
                    if (oi0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) oi0Var.getParent()).removeView(oi0Var);
                    }
                    oi0Var.Q.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 15:
                ((RLottieNative) this.b).d();
                break;
            case 16:
                pk0 pk0Var = (pk0) this.b;
                pk0Var.x0 = null;
                pk0Var.j();
                ok0 ok0Var = pk0Var.g0;
                if (ok0Var != null) {
                    ok0Var.o();
                    break;
                }
                break;
            case 17:
                ((mk0) this.b).H.a.setVisibility(4);
                break;
            case 18:
                qk0 qk0Var = (qk0) this.b;
                t71 t71Var = qk0Var.n;
                if (t71Var != null) {
                    boolean y3 = t71Var.y();
                    float n10 = qk0Var.n.n() / qk0Var.n.p();
                    float f7 = qk0Var.s;
                    if (n10 < f7) {
                        qk0Var.n.L((long) (f7 * r2.p()), false);
                    } else if (n10 > qk0Var.v) {
                        qk0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(qk0Var.x, 16L);
                    }
                }
                qk0Var.invalidate();
                break;
            case 19:
                vl0 vl0Var = (vl0) this.b;
                vl0Var.V1 = null;
                vl0Var.U1 = null;
                org.telegram.ui.Cells.z zVar = vl0Var.D1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = vl0Var.D1;
                if (zVar2 != null && zVar2.isStateful()) {
                    vl0Var.D1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 20:
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
            case 21:
                ((kn0) this.b).invalidateSelf();
                break;
            case 22:
                ((un0) this.b).f.setVisibility(8);
                break;
            case 23:
                ((org.telegram.ui.ey) this.b).s();
                break;
            case 24:
                ((v70) this.b).s();
                break;
            case 25:
                ((so0) this.b).getClass();
                break;
            case 26:
                org.telegram.ui.Cells.u1 u1Var = ((vo0) this.b).n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    break;
                }
                break;
            case 27:
                xo0 xo0Var = (xo0) this.b;
                xo0Var.q = false;
                xo0Var.b.run();
                break;
            case 28:
                ((uq0) ((ci.i2) this.b).b).a1(1);
                break;
            default:
                zq0 zq0Var = (zq0) this.b;
                xq0[] xq0VarArr = zq0Var.a;
                if (zq0Var.b != 1) {
                    for (xq0 xq0Var : xq0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var = xq0Var.d;
                        j5Var.setAlpha(1.0f);
                        j5Var.setScaleX(1.0f);
                        j5Var.setScaleY(1.0f);
                        xq0Var.e.setAlpha(0.0f);
                    }
                    zq0Var.E = false;
                    AndroidUtilities.runOnUIThread(zq0Var.G, 4000L);
                    break;
                } else {
                    zq0Var.E = !zq0Var.E;
                    for (xq0 xq0Var2 : xq0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var2 = xq0Var2.d;
                        org.telegram.ui.ActionBar.j5 j5Var3 = xq0Var2.e;
                        j5Var2.setPivotX(0.0f);
                        j5Var3.setPivotX(0.0f);
                        if (zq0Var.E) {
                            j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            j5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            j5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    AndroidUtilities.runOnUIThread(zq0Var.G, 4000L);
                    break;
                }
        }
    }
}
