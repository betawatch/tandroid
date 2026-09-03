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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dc0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ec0) this.b).z();
                break;
            case 1:
                ((kc0) this.b).invalidateSelf();
                break;
            case 2:
                ((nc0) this.b).invalidateSelf();
                break;
            case 3:
                ((gd0) this.b).d();
                break;
            case 4:
                qd0 qd0Var = (qd0) this.b;
                qd0Var.getClass();
                try {
                    qd0Var.d.F.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((ee0) this.b).f.start();
                break;
            case 6:
                vz vzVar = ((jf0) this.b).c.i0;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    break;
                }
                break;
            case 7:
                mf0 mf0Var = (mf0) this.b;
                mf0Var.r = false;
                mf0Var.invalidate();
                break;
            case 8:
                ((pf0) this.b).h = null;
                break;
            case 9:
                pf0 pf0Var = (pf0) ((n7.qa) this.b).c;
                pf0Var.d.L(pf0Var.e, false);
                break;
            case 10:
                org.telegram.ui.ut0 ut0Var = (org.telegram.ui.ut0) this.b;
                if (ut0Var.x) {
                    ut0Var.h("pollPosition();");
                }
                if (ut0Var.D) {
                    AndroidUtilities.runOnUIThread(ut0Var.I, 500L);
                    break;
                }
                break;
            case 11:
                ((FrameLayout) this.b).invalidate();
                break;
            case 12:
                mg0 mg0Var = (mg0) ((ig0) this.b).b;
                mg0Var.d.invalidate();
                mg0Var.e.requestLayout();
                break;
            case 13:
                ((og0) this.b).f();
                break;
            case 14:
                try {
                    mi0 mi0Var = ((li0) this.b).b;
                    if (mi0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) mi0Var.getParent()).removeView(mi0Var);
                    }
                    mi0Var.N.run();
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
                    ok0Var.m();
                    break;
                }
                break;
            case 17:
                ((mk0) this.b).E.a.setVisibility(4);
                break;
            case 18:
                qk0 qk0Var = (qk0) this.b;
                i71 i71Var = qk0Var.n;
                if (i71Var != null) {
                    boolean y10 = i71Var.y();
                    float n10 = qk0Var.n.n() / qk0Var.n.p();
                    float f10 = qk0Var.s;
                    if (n10 < f10) {
                        qk0Var.n.L((long) (f10 * r2.p()), false);
                    } else if (n10 > qk0Var.v) {
                        qk0Var.setPlaying(false);
                        y10 = false;
                    }
                    if (y10) {
                        AndroidUtilities.runOnUIThread(qk0Var.x, 16L);
                    }
                }
                qk0Var.invalidate();
                break;
            case 19:
                rl0 rl0Var = (rl0) this.b;
                rl0Var.S1 = null;
                rl0Var.R1 = null;
                org.telegram.ui.Cells.z zVar = rl0Var.A1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = rl0Var.A1;
                if (zVar2 != null && zVar2.isStateful()) {
                    rl0Var.A1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 20:
                cn0 cn0Var = (cn0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = cn0Var.d;
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
                AndroidUtilities.runOnUIThread(new gp(cn0Var, arrayList3, arrayList4, 14));
                break;
            case 21:
                ((en0) this.b).invalidateSelf();
                break;
            case 22:
                ((nn0) this.b).f.setVisibility(8);
                break;
            case 23:
                ((org.telegram.ui.zx) this.b).s();
                break;
            case 24:
                ((p70) this.b).s();
                break;
            case 25:
                ((jo0) this.b).getClass();
                break;
            case 26:
                org.telegram.ui.Cells.s1 s1Var = ((lo0) this.b).n;
                if (s1Var != null) {
                    s1Var.invalidate();
                    break;
                }
                break;
            case 27:
                no0 no0Var = (no0) this.b;
                no0Var.q = false;
                no0Var.b.run();
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
