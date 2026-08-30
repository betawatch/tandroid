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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                ((jc0) this.b).invalidateSelf();
                break;
            case 2:
                ((mc0) this.b).invalidateSelf();
                break;
            case 3:
                ((fd0) this.b).d();
                break;
            case 4:
                pd0 pd0Var = (pd0) this.b;
                pd0Var.getClass();
                try {
                    pd0Var.d.F.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((de0) this.b).f.start();
                break;
            case 6:
                vz vzVar = ((if0) this.b).c.i0;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    break;
                }
                break;
            case 7:
                lf0 lf0Var = (lf0) this.b;
                lf0Var.r = false;
                lf0Var.invalidate();
                break;
            case 8:
                ((of0) this.b).h = null;
                break;
            case 9:
                of0 of0Var = (of0) ((n7.qa) this.b).c;
                of0Var.d.L(of0Var.e, false);
                break;
            case 10:
                org.telegram.ui.nt0 nt0Var = (org.telegram.ui.nt0) this.b;
                if (nt0Var.x) {
                    nt0Var.h("pollPosition();");
                }
                if (nt0Var.D) {
                    AndroidUtilities.runOnUIThread(nt0Var.I, 500L);
                    break;
                }
                break;
            case 11:
                ((FrameLayout) this.b).invalidate();
                break;
            case 12:
                lg0 lg0Var = (lg0) ((hg0) this.b).b;
                lg0Var.d.invalidate();
                lg0Var.e.requestLayout();
                break;
            case 13:
                ((ng0) this.b).f();
                break;
            case 14:
                try {
                    li0 li0Var = ((ki0) this.b).b;
                    if (li0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) li0Var.getParent()).removeView(li0Var);
                    }
                    li0Var.N.run();
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
                pk0Var.u0 = null;
                pk0Var.j();
                ok0 ok0Var = pk0Var.d0;
                if (ok0Var != null) {
                    ok0Var.o();
                    break;
                }
                break;
            case 17:
                ((mk0) this.b).E.a.setVisibility(4);
                break;
            case 18:
                rk0 rk0Var = (rk0) this.b;
                i71 i71Var = rk0Var.n;
                if (i71Var != null) {
                    boolean y10 = i71Var.y();
                    float n10 = rk0Var.n.n() / rk0Var.n.p();
                    float f10 = rk0Var.s;
                    if (n10 < f10) {
                        rk0Var.n.L((long) (f10 * r2.p()), false);
                    } else if (n10 > rk0Var.v) {
                        rk0Var.setPlaying(false);
                        y10 = false;
                    }
                    if (y10) {
                        AndroidUtilities.runOnUIThread(rk0Var.x, 16L);
                    }
                }
                rk0Var.invalidate();
                break;
            case 19:
                sl0 sl0Var = (sl0) this.b;
                sl0Var.S1 = null;
                sl0Var.R1 = null;
                org.telegram.ui.Cells.z zVar = sl0Var.A1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = sl0Var.A1;
                if (zVar2 != null && zVar2.isStateful()) {
                    sl0Var.A1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 20:
                dn0 dn0Var = (dn0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = dn0Var.d;
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
                AndroidUtilities.runOnUIThread(new hp(dn0Var, arrayList3, arrayList4, 14));
                break;
            case 21:
                ((fn0) this.b).invalidateSelf();
                break;
            case 22:
                ((on0) this.b).f.setVisibility(8);
                break;
            case 23:
                ((org.telegram.ui.xx) this.b).s();
                break;
            case 24:
                ((o70) this.b).s();
                break;
            case 25:
                ((ko0) this.b).getClass();
                break;
            case 26:
                org.telegram.ui.Cells.t1 t1Var = ((mo0) this.b).n;
                if (t1Var != null) {
                    t1Var.invalidate();
                    break;
                }
                break;
            case 27:
                oo0 oo0Var = (oo0) this.b;
                oo0Var.q = false;
                oo0Var.b.run();
                break;
            case 28:
                ((lq0) ((dh.c) this.b).b).a1(1);
                break;
            default:
                qq0 qq0Var = (qq0) this.b;
                oq0[] oq0VarArr = qq0Var.a;
                if (qq0Var.b != 1) {
                    for (oq0 oq0Var : oq0VarArr) {
                        org.telegram.ui.ActionBar.k5 k5Var = oq0Var.d;
                        k5Var.setAlpha(1.0f);
                        k5Var.setScaleX(1.0f);
                        k5Var.setScaleY(1.0f);
                        oq0Var.e.setAlpha(0.0f);
                    }
                    qq0Var.B = false;
                    AndroidUtilities.runOnUIThread(qq0Var.D, 4000L);
                    break;
                } else {
                    qq0Var.B = !qq0Var.B;
                    for (oq0 oq0Var2 : oq0VarArr) {
                        org.telegram.ui.ActionBar.k5 k5Var2 = oq0Var2.d;
                        org.telegram.ui.ActionBar.k5 k5Var3 = oq0Var2.e;
                        k5Var2.setPivotX(0.0f);
                        k5Var3.setPivotX(0.0f);
                        if (qq0Var.B) {
                            k5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            k5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            k5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            k5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    AndroidUtilities.runOnUIThread(qq0Var.D, 4000L);
                    break;
                }
        }
    }
}
