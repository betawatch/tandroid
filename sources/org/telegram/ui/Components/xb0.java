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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xb0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((yb0) this.b).z();
                break;
            case 1:
                ((nh.u) this.b).invalidateSelf();
                break;
            case 2:
                ((gc0) this.b).invalidateSelf();
                break;
            case 3:
                ((zc0) this.b).d();
                break;
            case 4:
                id0 id0Var = (id0) this.b;
                id0Var.getClass();
                try {
                    id0Var.d.E.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((vd0) this.b).f.start();
                break;
            case 6:
                qz qzVar = ((ze0) this.b).c.h0;
                if (qzVar != null) {
                    qzVar.e(false, true, false);
                    break;
                }
                break;
            case 7:
                cf0 cf0Var = (cf0) this.b;
                cf0Var.r = false;
                cf0Var.invalidate();
                break;
            case 8:
                ((ff0) this.b).h = null;
                break;
            case 9:
                ff0 ff0Var = (ff0) ((oc.i) this.b).c;
                ff0Var.d.M(ff0Var.e, false);
                break;
            case 10:
                org.telegram.ui.et0 et0Var = (org.telegram.ui.et0) this.b;
                if (et0Var.x) {
                    et0Var.h("pollPosition();");
                }
                if (et0Var.C) {
                    AndroidUtilities.runOnUIThread(et0Var.H, 500L);
                    break;
                }
                break;
            case 11:
                ((FrameLayout) this.b).invalidate();
                break;
            case 12:
                bg0 bg0Var = (bg0) ((yf0) this.b).b;
                bg0Var.d.invalidate();
                bg0Var.e.requestLayout();
                break;
            case 13:
                ((dg0) this.b).f();
                break;
            case 14:
                try {
                    ai0 ai0Var = ((zh0) this.b).b;
                    if (ai0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ai0Var.getParent()).removeView(ai0Var);
                    }
                    ai0Var.M.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 15:
                ((RLottieNative) this.b).d();
                break;
            case 16:
                fk0 fk0Var = (fk0) this.b;
                fk0Var.t0 = null;
                fk0Var.j();
                ek0 ek0Var = fk0Var.c0;
                if (ek0Var != null) {
                    ek0Var.H();
                    break;
                }
                break;
            case 17:
                ((ck0) this.b).D.a.setVisibility(4);
                break;
            case 18:
                gk0 gk0Var = (gk0) this.b;
                x61 x61Var = gk0Var.n;
                if (x61Var != null) {
                    boolean z10 = x61Var.z();
                    float o10 = gk0Var.n.o() / gk0Var.n.q();
                    float f9 = gk0Var.s;
                    if (o10 < f9) {
                        gk0Var.n.M((long) (f9 * r2.q()), false);
                    } else if (o10 > gk0Var.v) {
                        gk0Var.setPlaying(false);
                        z10 = false;
                    }
                    if (z10) {
                        AndroidUtilities.runOnUIThread(gk0Var.x, 16L);
                    }
                }
                gk0Var.invalidate();
                break;
            case 19:
                jl0 jl0Var = (jl0) this.b;
                jl0Var.R1 = null;
                jl0Var.Q1 = null;
                org.telegram.ui.Cells.z zVar = jl0Var.z1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = jl0Var.z1;
                if (zVar2 != null && zVar2.isStateful()) {
                    jl0Var.z1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 20:
                tm0 tm0Var = (tm0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = tm0Var.d;
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
                AndroidUtilities.runOnUIThread(new g(tm0Var, arrayList3, arrayList4, 21));
                break;
            case 21:
                ((vm0) this.b).invalidateSelf();
                break;
            case 22:
                ((en0) this.b).f.setVisibility(8);
                break;
            case 23:
                ((org.telegram.ui.ox) this.b).s();
                break;
            case 24:
                ((j70) this.b).s();
                break;
            case 25:
                ((ao0) this.b).getClass();
                break;
            case 26:
                org.telegram.ui.Cells.s1 s1Var = ((co0) this.b).n;
                if (s1Var != null) {
                    s1Var.invalidate();
                    break;
                }
                break;
            case 27:
                eo0 eo0Var = (eo0) this.b;
                eo0Var.q = false;
                eo0Var.b.run();
                break;
            case 28:
                ((dq0) ((bh.c) this.b).b).a1(1);
                break;
            default:
                iq0 iq0Var = (iq0) this.b;
                gq0[] gq0VarArr = iq0Var.a;
                if (iq0Var.b != 1) {
                    for (gq0 gq0Var : gq0VarArr) {
                        org.telegram.ui.ActionBar.h5 h5Var = gq0Var.d;
                        h5Var.setAlpha(1.0f);
                        h5Var.setScaleX(1.0f);
                        h5Var.setScaleY(1.0f);
                        gq0Var.e.setAlpha(0.0f);
                    }
                    iq0Var.A = false;
                    AndroidUtilities.runOnUIThread(iq0Var.C, 4000L);
                    break;
                } else {
                    iq0Var.A = !iq0Var.A;
                    for (gq0 gq0Var2 : gq0VarArr) {
                        org.telegram.ui.ActionBar.h5 h5Var2 = gq0Var2.d;
                        org.telegram.ui.ActionBar.h5 h5Var3 = gq0Var2.e;
                        h5Var2.setPivotX(0.0f);
                        h5Var3.setPivotX(0.0f);
                        if (iq0Var.A) {
                            h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            h5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            h5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    AndroidUtilities.runOnUIThread(iq0Var.C, 4000L);
                    break;
                }
        }
    }
}
