package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.LinkedList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lb implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lb(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                nb nbVar = (nb) this.b;
                fg fgVar = (fg) this.c;
                nbVar.setInOutOffset(0.0f);
                if (!z4) {
                    fgVar.run();
                    break;
                }
                break;
            case 1:
                mi.r((mi) this.b, (mh.p6) this.c);
                break;
            case 2:
                mh.k3 k3Var = (mh.k3) this.b;
                wg wgVar = (wg) this.c;
                mi miVar = (mi) k3Var.d;
                miVar.w0.setTranslationY(0.0f);
                miVar.w0.k(miVar.i2);
                viewGroup = ((org.telegram.ui.ActionBar.h3) miVar).containerView;
                viewGroup.invalidate();
                wgVar.run();
                miVar.a2(0);
                break;
            case 3:
                xd0 xd0Var = (xd0) this.b;
                fc0 fc0Var = (fc0) this.c;
                LinkedList linkedList = xd0Var.J;
                xd0Var.I = null;
                fc0Var.D = null;
                fc0Var.z();
                if (!z4) {
                    fc0Var.h = 1.0f;
                    fc0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        xd0Var.K.poll();
                        break;
                    }
                }
                break;
            default:
                sh.m3 m3Var = (sh.m3) this.b;
                Runnable runnable = (Runnable) this.c;
                if (hVar == m3Var.D) {
                    m3Var.D = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = m3Var.B;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f12 = m3Var.h;
                    if (f12 != -1.0f) {
                        boolean z10 = m3Var.s;
                        m3Var.s = true;
                        m3Var.setOffsetY(f12);
                        m3Var.h = -1.0f;
                        m3Var.s = z10;
                    }
                    m3Var.n = -2.14748365E9f;
                    break;
                }
                break;
        }
    }
}
