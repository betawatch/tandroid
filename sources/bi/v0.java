package bi;

import android.animation.AnimatorSet;
import java.util.LinkedList;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.yf;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                x0 x0Var = (x0) this.b;
                a3.f fVar = (a3.f) this.c;
                x0Var.b(0.0f);
                fVar.run();
                break;
            case 1:
                ki.x3 x3Var = (ki.x3) this.b;
                Runnable runnable = (Runnable) this.c;
                if (gVar == x3Var.H) {
                    x3Var.H = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = x3Var.F;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f12 = x3Var.h;
                    if (f12 != -1.0f) {
                        boolean z11 = x3Var.s;
                        x3Var.s = true;
                        x3Var.setOffsetY(f12);
                        x3Var.h = -1.0f;
                        x3Var.s = z11;
                    }
                    x3Var.n = -2.14748365E9f;
                    break;
                }
                break;
            case 2:
                cb cbVar = (cb) this.b;
                dg dgVar = (dg) this.c;
                cbVar.setInOutOffset(0.0f);
                if (!z10) {
                    dgVar.run();
                    break;
                }
                break;
            case 3:
                ki kiVar = (ki) this.b;
                yf yfVar = (yf) this.c;
                AnimatorSet animatorSet = kiVar.A0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    yfVar.run();
                    break;
                }
                break;
            case 4:
                di.y3 y3Var = (di.y3) this.b;
                vg vgVar = (vg) this.c;
                ki kiVar2 = (ki) y3Var.d;
                kiVar2.x2.setTranslationY(0.0f);
                kiVar2.x2.m(kiVar2.j4);
                kiVar2.Y0.g();
                kiVar2.b.invalidate();
                vgVar.run();
                kiVar2.P1(0);
                break;
            default:
                fc0 fc0Var = (fc0) this.b;
                ra0 ra0Var = (ra0) this.c;
                LinkedList linkedList = fc0Var.V;
                fc0Var.U = null;
                ra0Var.D = null;
                ra0Var.y();
                if (!z10) {
                    ra0Var.h = 1.0f;
                    ra0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        fc0Var.W.poll();
                        break;
                    }
                }
                break;
        }
    }
}
