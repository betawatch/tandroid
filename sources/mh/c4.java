package mh;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.yc0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c4 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c4(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                f4 f4Var = (f4) this.b;
                Runnable runnable = (Runnable) this.c;
                if (hVar == f4Var.C) {
                    f4Var.C = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = f4Var.A;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f12 = f4Var.h;
                    if (f12 != -1.0f) {
                        boolean z11 = f4Var.s;
                        f4Var.s = true;
                        f4Var.setOffsetY(f12);
                        f4Var.h = -1.0f;
                        f4Var.s = z11;
                    }
                    f4Var.n = -2.14748365E9f;
                    break;
                }
                break;
            case 1:
                lb lbVar = (lb) this.b;
                fg fgVar = (fg) this.c;
                lbVar.setInOutOffset(0.0f);
                if (!z10) {
                    fgVar.run();
                    break;
                }
                break;
            case 2:
                ki.r((ki) this.b, (org.telegram.messenger.video.e) this.c);
                break;
            case 3:
                gh.m3 m3Var = (gh.m3) this.b;
                wg wgVar = (wg) this.c;
                ki kiVar = (ki) m3Var.d;
                kiVar.v0.setTranslationY(0.0f);
                kiVar.v0.k(kiVar.h2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) kiVar).containerView;
                viewGroup.invalidate();
                wgVar.run();
                kiVar.a2(0);
                break;
            default:
                yc0 yc0Var = (yc0) this.b;
                jb0 jb0Var = (jb0) this.c;
                LinkedList linkedList = yc0Var.I;
                yc0Var.H = null;
                jb0Var.D = null;
                jb0Var.z();
                if (!z10) {
                    jb0Var.h = 1.0f;
                    jb0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        yc0Var.J.poll();
                        break;
                    }
                }
                break;
        }
    }
}
