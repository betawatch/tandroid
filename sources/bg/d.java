package bg;

import ag.r1;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import f2.z;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(Object obj, float f10, float f11, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f10;
        this.c = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i10 = this.a;
        float f10 = this.c;
        float f11 = this.b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                e eVar = (e) obj;
                i iVar = (i) eVar.b;
                ValueAnimator valueAnimator = iVar.O;
                b bVar = iVar.T;
                b bVar2 = iVar.S;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    iVar.O.cancel();
                    iVar.O = null;
                }
                AnimatorSet animatorSet = iVar.P;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    iVar.P.cancel();
                    iVar.P = null;
                }
                if (Math.abs(iVar.b.d) <= 10.0f) {
                    AndroidUtilities.cancelRunOnUIThread(iVar.Q);
                    iVar.P = new AnimatorSet();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(iVar.b.d, f11);
                    ofFloat.addUpdateListener(bVar2);
                    long j10 = 220;
                    ofFloat.setDuration(j10);
                    er erVar = er.h;
                    ofFloat.setInterpolator(erVar);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 0.0f);
                    ofFloat2.addUpdateListener(bVar2);
                    ofFloat2.setStartDelay(j10);
                    ofFloat2.setDuration(600L);
                    ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(iVar.b.g, f10);
                    ofFloat3.addUpdateListener(bVar);
                    ofFloat3.setDuration(j10);
                    ofFloat3.setInterpolator(erVar);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat4.addUpdateListener(bVar);
                    ofFloat4.setStartDelay(j10);
                    ofFloat4.setDuration(600L);
                    ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                    iVar.P.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                    iVar.P.addListener(new r1(eVar, 2));
                    iVar.P.start();
                    break;
                } else {
                    iVar.i();
                    break;
                }
            default:
                zk0 zk0Var = (zk0) ((z) obj).b;
                if (zk0Var.a1 != null && (view = zk0Var.J1) != null) {
                    zk0Var.h1(view, f11, f10, true);
                    zk0Var.a1 = null;
                    break;
                }
                break;
        }
    }
}
