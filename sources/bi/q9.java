package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.xq;
import org.telegram.ui.tp0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q9 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q9(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        int i7 = this.a;
        int i10 = 0;
        char c10 = 1;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                v10 v10Var = (v10) obj2;
                int i11 = ((f5.f) obj).a;
                boolean z9 = i11 == 0;
                String j3 = z9 ? null : org.telegram.messenger.r1.j(i11);
                org.telegram.messenger.a8.b("StarsController.buy onResult " + z9 + " " + j3);
                org.telegram.messenger.g0.h3(new u7(v10Var, z9, j3, i10));
                break;
            case 1:
                fi.o5.Y((fi.x9) obj2, (Integer) obj);
                break;
            case 2:
                hi.a3 a3Var = (hi.a3) obj2;
                Float f10 = (Float) obj;
                a3Var.E.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(xq.f);
                    duration.addUpdateListener(new hi.w1(a3Var, 1));
                    duration.addListener(new t5(a3Var, 27));
                    duration.start();
                    break;
                }
                break;
            case 3:
                hi.c4 c4Var = (hi.c4) obj2;
                Float f11 = (Float) obj;
                c4Var.I.setLoadProgressAnimated(f11.floatValue());
                if (f11.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(xq.f);
                    duration2.addUpdateListener(new hi.t3(c4Var, 1));
                    duration2.addListener(new t5(c4Var, 28));
                    duration2.start();
                    c4Var.P();
                    break;
                }
                break;
            case 4:
                ((jg.n) obj2).R.L4(((Float) obj).floatValue());
                break;
            case 5:
                androidx.activity.n nVar = (androidx.activity.n) obj2;
                int intValue = ((Integer) obj).intValue();
                switch (nVar.a) {
                    case 1:
                        fi.x9 x9Var = (fi.x9) nVar.d;
                        x9Var.F0(false);
                        sg.l0 l0Var = (sg.l0) nVar.c;
                        l0Var.h(intValue, true);
                        l0Var.g();
                        x9Var.setNewColor(intValue);
                        fi.w4 w4Var = x9Var.f1;
                        w4Var.setSelectedColorIndex(l0Var.d());
                        w4Var.getAdapter().f();
                        break;
                    default:
                        tp0 tp0Var = (tp0) nVar.d;
                        tp0Var.w0(false);
                        sg.l0 l0Var2 = tp0Var.E1;
                        l0Var2.h(intValue, true);
                        l0Var2.g();
                        tp0Var.setNewColor(intValue);
                        tg.d0 d0Var = tp0Var.p1;
                        d0Var.setSelectedColorIndex(l0Var2.d());
                        d0Var.getAdapter().f();
                        break;
                }
            default:
                zh.b4 b4Var = (zh.b4) obj2;
                if (((f5.f) obj).a == 0) {
                    org.telegram.messenger.g0.h3(new zh.r3(b4Var, c10 == true ? 1 : 0));
                    break;
                }
                break;
        }
    }
}
