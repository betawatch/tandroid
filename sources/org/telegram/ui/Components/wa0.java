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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wa0(Object obj, int i10) {
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
                final gb0 gb0Var = (gb0) this.b;
                boolean z10 = gb0Var.I;
                boolean z11 = !z10;
                ig.p1 p1Var = gb0Var.e;
                fb0 fb0Var = gb0Var.b;
                if (fb0Var == null || p1Var == null) {
                    gb0Var.O = 0;
                    break;
                } else if (gb0Var.L && (jVar = gb0Var.K) != null && jVar.f && !z10) {
                    gb0Var.O = 0;
                    break;
                } else {
                    boolean g7 = gb0Var.g();
                    if (z10) {
                        int computeVerticalScrollRange = fb0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - p1Var.h) + gb0Var.s;
                        if (computeVerticalScrollRange <= 0 && gb0Var.f.K() > 0 && (i10 = gb0Var.O) < 3) {
                            gb0Var.O = i10 + 1;
                            gb0Var.o(true);
                            break;
                        }
                    } else {
                        f7 = (-gb0Var.s) - AndroidUtilities.dp(6.0f);
                    }
                    gb0Var.O = 0;
                    float f10 = gb0Var.v;
                    float max = g7 ? -Math.max(0.0f, f10 - f7) : Math.max(0.0f, f10 - f7) + (-f10);
                    if (!z10 && !g7) {
                        max += fb0Var.computeVerticalScrollOffset();
                    }
                    o1.j jVar2 = gb0Var.K;
                    if (jVar2 != null) {
                        jVar2.c();
                    }
                    gb0Var.L = z11;
                    final float translationY = fb0Var.getTranslationY();
                    final float f11 = gb0Var.M;
                    float f12 = z10 ? 0.0f : 1.0f;
                    Integer num = null;
                    if (translationY == max) {
                        gb0Var.K = null;
                        num = Integer.valueOf(!z10 ? 8 : 0);
                        if (gb0Var.N && !z10) {
                            gb0Var.N = false;
                            fb0Var.setLayoutManager(gb0Var.getNeededLayoutManager());
                            gb0Var.I = true;
                            gb0Var.o(true);
                        }
                    } else {
                        o1.j jVar3 = new o1.j(new ac.a(translationY));
                        o1.k kVar = new o1.k(max);
                        kVar.a(1.0f);
                        kVar.b(550.0f);
                        jVar3.u = kVar;
                        gb0Var.K = jVar3;
                        final float f13 = max;
                        final float f14 = f12;
                        jVar3.b(new o1.g() { // from class: org.telegram.ui.Components.xa0
                            @Override // o1.g
                            public final void a(o1.h hVar, float f15, float f16) {
                                gb0 gb0Var2 = gb0.this;
                                gb0Var2.b.setTranslationY(f15);
                                gb0Var2.i();
                                float f17 = translationY;
                                gb0Var2.M = AndroidUtilities.lerp(f11, f14, (f15 - f17) / (f13 - f17));
                            }
                        });
                        if (!z10) {
                            gb0Var.K.a(new fi.p4(gb0Var, z11, 2));
                        }
                        gb0Var.K.a(new ya0());
                        gb0Var.K.h();
                    }
                    if (num != null && gb0Var.getVisibility() != num.intValue()) {
                        gb0Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            case 1:
                ((vb0) this.b).S.n.l();
                break;
            case 2:
                ((rc0) this.b).a();
                break;
            case 3:
                ((fi.u) this.b).invalidateSelf();
                break;
            case 4:
                ((cd0) this.b).invalidateSelf();
                break;
            case 5:
                ((wd0) this.b).d();
                break;
            case 6:
                fe0 fe0Var = (fe0) this.b;
                fe0Var.getClass();
                try {
                    fe0Var.d.M.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 7:
                ((te0) this.b).d.start();
                break;
            case 8:
                e00 e00Var = ((zf0) this.b).c.l0;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    break;
                }
                break;
            case 9:
                cg0 cg0Var = (cg0) this.b;
                cg0Var.r = false;
                cg0Var.invalidate();
                break;
            case 10:
                ((fg0) this.b).h = null;
                break;
            case 11:
                fg0 fg0Var = (fg0) ((m4.w1) this.b).c;
                fg0Var.d.L(fg0Var.e, false);
                break;
            case 12:
                org.telegram.ui.vt0 vt0Var = (org.telegram.ui.vt0) this.b;
                if (vt0Var.x) {
                    vt0Var.h("pollPosition();");
                }
                if (vt0Var.G) {
                    AndroidUtilities.runOnUIThread(vt0Var.L, 500L);
                    break;
                }
                break;
            case 13:
                ((FrameLayout) this.b).invalidate();
                break;
            case 14:
                ch0 ch0Var = (ch0) ((ng.b) this.b).b;
                ch0Var.d.invalidate();
                ch0Var.e.requestLayout();
                break;
            case 15:
                ((eh0) this.b).f();
                break;
            case 16:
                try {
                    dj0 dj0Var = ((cj0) this.b).b;
                    if (dj0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) dj0Var.getParent()).removeView(dj0Var);
                    }
                    dj0Var.Q.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 17:
                ((RLottieNative) this.b).d();
                break;
            case 18:
                fl0 fl0Var = (fl0) this.b;
                fl0Var.x0 = null;
                fl0Var.j();
                el0 el0Var = fl0Var.g0;
                if (el0Var != null) {
                    el0Var.m();
                    break;
                }
                break;
            case 19:
                ((cl0) this.b).H.a.setVisibility(4);
                break;
            case 20:
                gl0 gl0Var = (gl0) this.b;
                s81 s81Var = gl0Var.n;
                if (s81Var != null) {
                    boolean y3 = s81Var.y();
                    float n10 = gl0Var.n.n() / gl0Var.n.p();
                    float f15 = gl0Var.s;
                    if (n10 < f15) {
                        gl0Var.n.L((long) (f15 * r2.p()), false);
                    } else if (n10 > gl0Var.v) {
                        gl0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(gl0Var.x, 16L);
                    }
                }
                gl0Var.invalidate();
                break;
            case 21:
                mm0 mm0Var = (mm0) this.b;
                mm0Var.T1 = null;
                mm0Var.S1 = null;
                org.telegram.ui.Cells.y yVar = mm0Var.B1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = mm0Var.B1;
                if (yVar2 != null && yVar2.isStateful()) {
                    mm0Var.B1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 22:
                an0 an0Var = (an0) this.b;
                if (an0Var.r && an0Var.h() != an0Var.x) {
                    an0Var.m("on screen, settled after start", true);
                    break;
                }
                break;
            case 23:
                co0 co0Var = (co0) this.b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i11 = co0Var.d;
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
                AndroidUtilities.runOnUIThread(new kg(co0Var, arrayList3, arrayList4, 19));
                break;
            case 24:
                ((eo0) this.b).invalidateSelf();
                break;
            case 25:
                ((oo0) this.b).f.setVisibility(8);
                break;
            case 26:
                ((org.telegram.ui.jx) this.b).s();
                break;
            case 27:
                ((k80) this.b).s();
                break;
            case 28:
                ((gp0) this.b).setOverscrolling(false);
                break;
            default:
                ((lp0) this.b).getClass();
                break;
        }
    }
}
