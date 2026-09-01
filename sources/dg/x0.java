package dg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ r1 c;

    public /* synthetic */ x0(c1 c1Var, r1 r1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        r1 r1Var = this.c;
        c1 c1Var = this.b;
        switch (i10) {
            case 0:
                c1Var.c = r1Var;
                if (c1Var.h == null) {
                    c1Var.h = new RectF();
                }
                c1Var.c.a(c1Var.h);
                o5.i iVar = c1Var.a;
                if (iVar != null) {
                    iVar.c();
                    break;
                }
                break;
            default:
                if (r1Var != null && c1Var.q == 0) {
                    c1Var.q = f2.b(c1Var.g);
                }
                int i11 = 0;
                if (c1Var.H == (r1Var != null)) {
                    if (r1Var != c1Var.d) {
                        c1Var.d = r1Var;
                        o5.i iVar2 = c1Var.a;
                        if (iVar2 != null) {
                            iVar2.c();
                            break;
                        }
                    }
                } else {
                    c1Var.H = r1Var != null;
                    ValueAnimator valueAnimator = c1Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        c1Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(c1Var.I, c1Var.H ? 1.0f : 0.0f);
                    c1Var.K = ofFloat;
                    ofFloat.addUpdateListener(new v0(c1Var, i11));
                    c1Var.K.addListener(new b1(c1Var, i11));
                    c1Var.K.setInterpolator(pr.h);
                    c1Var.K.start();
                    c1Var.d = r1Var;
                    o5.i iVar3 = c1Var.a;
                    if (iVar3 != null) {
                        iVar3.c();
                    }
                    if (c1Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        break;
                    }
                }
                break;
        }
    }
}
