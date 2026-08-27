package nh;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.sg;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a4 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a4(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.b;
                Runnable runnable = (Runnable) this.c;
                if (hVar == d4Var.C) {
                    d4Var.C = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = d4Var.A;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f12 = d4Var.h;
                    if (f12 != -1.0f) {
                        boolean z11 = d4Var.s;
                        d4Var.s = true;
                        d4Var.setOffsetY(f12);
                        d4Var.h = -1.0f;
                        d4Var.s = z11;
                    }
                    d4Var.n = -2.14748365E9f;
                    break;
                }
                break;
            case 1:
                jb jbVar = (jb) this.b;
                bg bgVar = (bg) this.c;
                jbVar.setInOutOffset(0.0f);
                if (!z10) {
                    bgVar.run();
                    break;
                }
                break;
            case 2:
                gi.s((gi) this.b, (org.telegram.ui.ActionBar.i3) this.c);
                break;
            case 3:
                hh.l3 l3Var = (hh.l3) this.b;
                sg sgVar = (sg) this.c;
                gi giVar = (gi) l3Var.d;
                giVar.v0.setTranslationY(0.0f);
                giVar.v0.k(giVar.h2);
                viewGroup = ((org.telegram.ui.ActionBar.e3) giVar).containerView;
                viewGroup.invalidate();
                sgVar.run();
                giVar.a2(0);
                break;
            default:
                dd0 dd0Var = (dd0) this.b;
                nb0 nb0Var = (nb0) this.c;
                LinkedList linkedList = dd0Var.I;
                dd0Var.H = null;
                nb0Var.D = null;
                nb0Var.z();
                if (!z10) {
                    nb0Var.h = 1.0f;
                    nb0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        dd0Var.J.poll();
                        break;
                    }
                }
                break;
        }
    }
}
