// default package

import android.animation.AnimatorSet;
import java.util.LinkedList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class o11 implements xr3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o11(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // xr3
    public final void a(yla ylaVar, boolean z, float f, float f2) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                ((q11) obj2).setInOutOffset(0.0f);
                if (!z) {
                    nv0Var.run();
                    break;
                }
                break;
            case 1:
                jn1 jn1Var = (jn1) obj;
                AnimatorSet animatorSet = ((x02) obj2).A0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    jn1Var.run();
                    break;
                }
                break;
            case 2:
                x02 x02Var = (x02) ((f02) obj2).d;
                x02Var.w2.setTranslationY(0.0f);
                x02Var.w2.m(x02Var.i4);
                x02Var.X0.g();
                x02Var.b.invalidate();
                ((vq0) obj).run();
                x02Var.K1(0);
                break;
            case 3:
                r12 r12Var = (r12) obj2;
                Runnable runnable = (Runnable) obj;
                if (ylaVar == r12Var.H) {
                    r12Var.H = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = r12Var.F;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f3 = r12Var.h;
                    if (f3 != -1.0f) {
                        boolean z2 = r12Var.s;
                        r12Var.s = true;
                        r12Var.setOffsetY(f3);
                        r12Var.h = -1.0f;
                        r12Var.s = z2;
                    }
                    r12Var.n = -2.1474836E9f;
                    break;
                }
                break;
            case 4:
                ((vt4) obj2).b(0.0f);
                ((s54) obj).run();
                break;
            case 5:
                yv7 yv7Var = (yv7) obj2;
                ye7 ye7Var = (ye7) obj;
                LinkedList linkedList = yv7Var.V;
                yv7Var.U = null;
                ye7Var.C = null;
                ye7Var.x();
                if (!z) {
                    ye7Var.h = 1.0f;
                    ye7Var.x();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        yv7Var.W.poll();
                        break;
                    }
                }
                break;
            case 6:
                j4a j4aVar = (j4a) obj2;
                yla ylaVar2 = (yla) obj;
                if (!z) {
                    j4aVar.z.remove(ylaVar2);
                    ylaVar.d();
                    break;
                }
                break;
            default:
                uw1 uw1Var = (uw1) obj2;
                yla ylaVar3 = (yla) obj;
                if (!z) {
                    uw1Var.z.remove(ylaVar3);
                    ylaVar.d();
                    break;
                } else {
                    uw1Var.getClass();
                    break;
                }
        }
    }
}
