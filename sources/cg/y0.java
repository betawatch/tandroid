package cg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;
    public final /* synthetic */ s1 c;

    public /* synthetic */ y0(d1 d1Var, s1 s1Var, int i10) {
        this.a = i10;
        this.b = d1Var;
        this.c = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        s1 s1Var = this.c;
        d1 d1Var = this.b;
        switch (i10) {
            case 0:
                d1Var.c = s1Var;
                if (d1Var.h == null) {
                    d1Var.h = new RectF();
                }
                d1Var.c.a(d1Var.h);
                o5.i iVar = d1Var.a;
                if (iVar != null) {
                    iVar.q();
                    break;
                }
                break;
            default:
                if (s1Var != null && d1Var.q == 0) {
                    d1Var.q = g2.b(d1Var.g);
                }
                int i11 = 0;
                if (d1Var.H == (s1Var != null)) {
                    if (s1Var != d1Var.d) {
                        d1Var.d = s1Var;
                        o5.i iVar2 = d1Var.a;
                        if (iVar2 != null) {
                            iVar2.q();
                            break;
                        }
                    }
                } else {
                    d1Var.H = s1Var != null;
                    ValueAnimator valueAnimator = d1Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        d1Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(d1Var.I, d1Var.H ? 1.0f : 0.0f);
                    d1Var.K = ofFloat;
                    ofFloat.addUpdateListener(new w0(d1Var, i11));
                    d1Var.K.addListener(new c1(d1Var, i11));
                    d1Var.K.setInterpolator(mr.h);
                    d1Var.K.start();
                    d1Var.d = s1Var;
                    o5.i iVar3 = d1Var.a;
                    if (iVar3 != null) {
                        iVar3.q();
                    }
                    if (d1Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        break;
                    }
                }
                break;
        }
    }
}
