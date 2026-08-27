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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mb0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((nb0) this.b).z();
                break;
            case 1:
                ((lh.v) this.b).invalidateSelf();
                break;
            case 2:
                ((vb0) this.b).invalidateSelf();
                break;
            case 3:
                ((oc0) this.b).d();
                break;
            case 4:
                yc0 yc0Var = (yc0) this.b;
                yc0Var.getClass();
                try {
                    yc0Var.d.E.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((md0) this.b).f.start();
                break;
            case 6:
                jz jzVar = ((qe0) this.b).c.h0;
                if (jzVar != null) {
                    jzVar.e(false, true, false);
                    break;
                }
                break;
            case 7:
                te0 te0Var = (te0) this.b;
                te0Var.r = false;
                te0Var.invalidate();
                break;
            case 8:
                ((we0) this.b).h = null;
                break;
            case 9:
                we0 we0Var = (we0) ((org.telegram.ui.i6) this.b).c;
                we0Var.d.M(we0Var.e, false);
                break;
            case 10:
                org.telegram.ui.ht0 ht0Var = (org.telegram.ui.ht0) this.b;
                if (ht0Var.x) {
                    ht0Var.h("pollPosition();");
                }
                if (ht0Var.C) {
                    AndroidUtilities.runOnUIThread(ht0Var.H, 500L);
                    break;
                }
                break;
            case 11:
                ((FrameLayout) this.b).invalidate();
                break;
            case 12:
                sf0 sf0Var = (sf0) ((pf0) this.b).b;
                sf0Var.d.invalidate();
                sf0Var.e.requestLayout();
                break;
            case 13:
                ((uf0) this.b).f();
                break;
            case 14:
                try {
                    sh0 sh0Var = ((rh0) this.b).b;
                    if (sh0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) sh0Var.getParent()).removeView(sh0Var);
                    }
                    sh0Var.M.run();
                    break;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            case 15:
                ((RLottieNative) this.b).d();
                break;
            case 16:
                wj0 wj0Var = (wj0) this.b;
                wj0Var.t0 = null;
                wj0Var.j();
                vj0 vj0Var = wj0Var.c0;
                if (vj0Var != null) {
                    vj0Var.s();
                    break;
                }
                break;
            case 17:
                ((tj0) this.b).D.a.setVisibility(4);
                break;
            case 18:
                xj0 xj0Var = (xj0) this.b;
                m61 m61Var = xj0Var.n;
                if (m61Var != null) {
                    boolean z10 = m61Var.z();
                    float o10 = xj0Var.n.o() / xj0Var.n.q();
                    float f10 = xj0Var.s;
                    if (o10 < f10) {
                        xj0Var.n.M((long) (f10 * r2.q()), false);
                    } else if (o10 > xj0Var.v) {
                        xj0Var.setPlaying(false);
                        z10 = false;
                    }
                    if (z10) {
                        AndroidUtilities.runOnUIThread(xj0Var.x, 16L);
                    }
                }
                xj0Var.invalidate();
                break;
            case 19:
                zk0 zk0Var = (zk0) this.b;
                zk0Var.R1 = null;
                zk0Var.Q1 = null;
                org.telegram.ui.Cells.z zVar = zk0Var.z1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = zk0Var.z1;
                if (zVar2 != null && zVar2.isStateful()) {
                    zk0Var.z1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 20:
                jm0 jm0Var = (jm0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = jm0Var.d;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3(jm0Var, arrayList3, arrayList4, 26));
                break;
            case 21:
                ((lm0) this.b).invalidateSelf();
                break;
            case 22:
                ((um0) this.b).f.setVisibility(8);
                break;
            case 23:
                ((org.telegram.ui.px) this.b).s();
                break;
            case 24:
                ((b70) this.b).s();
                break;
            case 25:
                ((qn0) this.b).getClass();
                break;
            case 26:
                org.telegram.ui.Cells.s1 s1Var = ((sn0) this.b).n;
                if (s1Var != null) {
                    s1Var.invalidate();
                    break;
                }
                break;
            case 27:
                un0 un0Var = (un0) this.b;
                un0Var.q = false;
                un0Var.b.run();
                break;
            case 28:
                ((sp0) ((ch.e) this.b).b).a1(1);
                break;
            default:
                xp0 xp0Var = (xp0) this.b;
                vp0[] vp0VarArr = xp0Var.a;
                if (xp0Var.b != 1) {
                    for (vp0 vp0Var : vp0VarArr) {
                        org.telegram.ui.ActionBar.h5 h5Var = vp0Var.d;
                        h5Var.setAlpha(1.0f);
                        h5Var.setScaleX(1.0f);
                        h5Var.setScaleY(1.0f);
                        vp0Var.e.setAlpha(0.0f);
                    }
                    xp0Var.A = false;
                    AndroidUtilities.runOnUIThread(xp0Var.C, 4000L);
                    break;
                } else {
                    xp0Var.A = !xp0Var.A;
                    for (vp0 vp0Var2 : vp0VarArr) {
                        org.telegram.ui.ActionBar.h5 h5Var2 = vp0Var2.d;
                        org.telegram.ui.ActionBar.h5 h5Var3 = vp0Var2.e;
                        h5Var2.setPivotX(0.0f);
                        h5Var3.setPivotX(0.0f);
                        if (xp0Var.A) {
                            h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            h5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            h5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    AndroidUtilities.runOnUIThread(xp0Var.C, 4000L);
                    break;
                }
        }
    }
}
