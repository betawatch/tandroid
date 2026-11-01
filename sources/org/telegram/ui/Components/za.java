package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import java.util.LinkedList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class za implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ za(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // o1.f
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                bb bbVar = (bb) this.b;
                tf tfVar = (tf) this.c;
                bbVar.setInOutOffset(0.0f);
                if (!z10) {
                    tfVar.run();
                    break;
                }
                break;
            case 1:
                bi biVar = (bi) this.b;
                jg jgVar = (jg) this.c;
                AnimatorSet animatorSet = biVar.z0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    jgVar.run();
                    break;
                }
                break;
            case 2:
                jh jhVar = (jh) this.b;
                mg mgVar = (mg) this.c;
                bi biVar2 = (bi) jhVar.d;
                biVar2.t2.setTranslationY(0.0f);
                biVar2.t2.l(biVar2.f4);
                biVar2.X0.g();
                biVar2.b.invalidate();
                mgVar.run();
                biVar2.O1(0);
                break;
            case 3:
                zc0 zc0Var = (zc0) this.b;
                jb0 jb0Var = (jb0) this.c;
                LinkedList linkedList = zc0Var.U;
                zc0Var.T = null;
                jb0Var.D = null;
                jb0Var.y();
                if (!z10) {
                    jb0Var.h = 1.0f;
                    jb0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        zc0Var.V.poll();
                        break;
                    }
                }
                break;
            default:
                xh.i3 i3Var = (xh.i3) this.b;
                Runnable runnable = (Runnable) this.c;
                if (jVar == i3Var.G) {
                    i3Var.G = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = i3Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f11 = i3Var.h;
                    if (f11 != -1.0f) {
                        boolean z11 = i3Var.s;
                        i3Var.s = true;
                        i3Var.setOffsetY(f11);
                        i3Var.h = -1.0f;
                        i3Var.s = z11;
                    }
                    i3Var.n = -2.14748365E9f;
                    break;
                }
                break;
        }
    }
}
