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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xa0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f7;
        int i10;
        o1.j jVar;
        switch (this.a) {
            case 0:
                final hb0 hb0Var = (hb0) this.b;
                boolean z10 = hb0Var.I;
                boolean z11 = !z10;
                ig.p1 p1Var = hb0Var.e;
                gb0 gb0Var = hb0Var.b;
                if (gb0Var == null || p1Var == null) {
                    hb0Var.O = 0;
                    break;
                } else if (hb0Var.L && (jVar = hb0Var.K) != null && jVar.f && !z10) {
                    hb0Var.O = 0;
                    break;
                } else {
                    boolean g7 = hb0Var.g();
                    if (z10) {
                        int computeVerticalScrollRange = gb0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - p1Var.h) + hb0Var.s;
                        if (computeVerticalScrollRange <= 0 && hb0Var.f.K() > 0 && (i10 = hb0Var.O) < 3) {
                            hb0Var.O = i10 + 1;
                            hb0Var.o(true);
                            break;
                        }
                    } else {
                        f7 = (-hb0Var.s) - AndroidUtilities.dp(6.0f);
                    }
                    hb0Var.O = 0;
                    float f10 = hb0Var.v;
                    float max = g7 ? -Math.max(0.0f, f10 - f7) : Math.max(0.0f, f10 - f7) + (-f10);
                    if (!z10 && !g7) {
                        max += gb0Var.computeVerticalScrollOffset();
                    }
                    o1.j jVar2 = hb0Var.K;
                    if (jVar2 != null) {
                        jVar2.c();
                    }
                    hb0Var.L = z11;
                    final float translationY = gb0Var.getTranslationY();
                    final float f11 = hb0Var.M;
                    float f12 = z10 ? 0.0f : 1.0f;
                    Integer num = null;
                    if (translationY == max) {
                        hb0Var.K = null;
                        num = Integer.valueOf(!z10 ? 8 : 0);
                        if (hb0Var.N && !z10) {
                            hb0Var.N = false;
                            gb0Var.setLayoutManager(hb0Var.getNeededLayoutManager());
                            hb0Var.I = true;
                            hb0Var.o(true);
                        }
                    } else {
                        o1.j jVar3 = new o1.j(new ac.a(translationY));
                        o1.k kVar = new o1.k(max);
                        kVar.a(1.0f);
                        kVar.b(550.0f);
                        jVar3.u = kVar;
                        hb0Var.K = jVar3;
                        final float f13 = max;
                        final float f14 = f12;
                        jVar3.b(new o1.g() { // from class: org.telegram.ui.Components.ya0
                            @Override // o1.g
                            public final void a(o1.h hVar, float f15, float f16) {
                                hb0 hb0Var2 = hb0.this;
                                hb0Var2.b.setTranslationY(f15);
                                hb0Var2.i();
                                float f17 = translationY;
                                hb0Var2.M = AndroidUtilities.lerp(f11, f14, (f15 - f17) / (f13 - f17));
                            }
                        });
                        if (!z10) {
                            hb0Var.K.a(new fi.p4(hb0Var, z11, 2));
                        }
                        hb0Var.K.a(new za0());
                        hb0Var.K.h();
                    }
                    if (num != null && hb0Var.getVisibility() != num.intValue()) {
                        hb0Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            case 1:
                ((wb0) this.b).S.n.l();
                break;
            case 2:
                ((sc0) this.b).a();
                break;
            case 3:
                ((fi.u) this.b).invalidateSelf();
                break;
            case 4:
                ((dd0) this.b).invalidateSelf();
                break;
            case 5:
                ((xd0) this.b).d();
                break;
            case 6:
                ge0 ge0Var = (ge0) this.b;
                ge0Var.getClass();
                try {
                    ge0Var.d.M.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 7:
                ((ue0) this.b).d.start();
                break;
            case 8:
                e00 e00Var = ((ag0) this.b).c.l0;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    break;
                }
                break;
            case 9:
                dg0 dg0Var = (dg0) this.b;
                dg0Var.r = false;
                dg0Var.invalidate();
                break;
            case 10:
                ((gg0) this.b).h = null;
                break;
            case 11:
                gg0 gg0Var = (gg0) ((m4.w1) this.b).c;
                gg0Var.d.L(gg0Var.e, false);
                break;
            case 12:
                org.telegram.ui.xt0 xt0Var = (org.telegram.ui.xt0) this.b;
                if (xt0Var.x) {
                    xt0Var.h("pollPosition();");
                }
                if (xt0Var.G) {
                    AndroidUtilities.runOnUIThread(xt0Var.L, 500L);
                    break;
                }
                break;
            case 13:
                ((FrameLayout) this.b).invalidate();
                break;
            case 14:
                dh0 dh0Var = (dh0) ((ng.b) this.b).b;
                dh0Var.d.invalidate();
                dh0Var.e.requestLayout();
                break;
            case 15:
                ((fh0) this.b).f();
                break;
            case 16:
                try {
                    ej0 ej0Var = ((dj0) this.b).b;
                    if (ej0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ej0Var.getParent()).removeView(ej0Var);
                    }
                    ej0Var.Q.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 17:
                ((RLottieNative) this.b).d();
                break;
            case 18:
                gl0 gl0Var = (gl0) this.b;
                gl0Var.x0 = null;
                gl0Var.j();
                fl0 fl0Var = gl0Var.g0;
                if (fl0Var != null) {
                    fl0Var.m();
                    break;
                }
                break;
            case 19:
                ((dl0) this.b).H.a.setVisibility(4);
                break;
            case 20:
                hl0 hl0Var = (hl0) this.b;
                t81 t81Var = hl0Var.n;
                if (t81Var != null) {
                    boolean y3 = t81Var.y();
                    float n10 = hl0Var.n.n() / hl0Var.n.p();
                    float f15 = hl0Var.s;
                    if (n10 < f15) {
                        hl0Var.n.L((long) (f15 * r2.p()), false);
                    } else if (n10 > hl0Var.v) {
                        hl0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(hl0Var.x, 16L);
                    }
                }
                hl0Var.invalidate();
                break;
            case 21:
                nm0 nm0Var = (nm0) this.b;
                nm0Var.T1 = null;
                nm0Var.S1 = null;
                org.telegram.ui.Cells.y yVar = nm0Var.B1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = nm0Var.B1;
                if (yVar2 != null && yVar2.isStateful()) {
                    nm0Var.B1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 22:
                bn0 bn0Var = (bn0) this.b;
                if (bn0Var.r && bn0Var.m() != bn0Var.x) {
                    bn0Var.r("on screen, settled after start", true);
                    break;
                }
                break;
            case 23:
                do0 do0Var = (do0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i11 = do0Var.d;
                FileLoader.getInstance(i11).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(i11).getRecentLoadingFiles(arrayList2);
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (FileLoader.getInstance(i11).getPathToMessage(arrayList.get(i12).messageOwner).exists()) {
                        arrayList3.add(arrayList.get(i12));
                    }
                }
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    if (!FileLoader.getInstance(i11).getPathToMessage(arrayList2.get(i13).messageOwner).exists()) {
                        arrayList4.add(arrayList2.get(i13));
                    }
                }
                AndroidUtilities.runOnUIThread(new kg(do0Var, arrayList3, arrayList4, 19));
                break;
            case 24:
                ((fo0) this.b).invalidateSelf();
                break;
            case 25:
                ((po0) this.b).f.setVisibility(8);
                break;
            case 26:
                ((org.telegram.ui.mx) this.b).s();
                break;
            case 27:
                ((l80) this.b).s();
                break;
            case 28:
                ((hp0) this.b).setOverscrolling(false);
                break;
            default:
                ((mp0) this.b).getClass();
                break;
        }
    }
}
