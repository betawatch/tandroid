package fi;

import android.animation.ValueAnimator;
import org.telegram.ui.tv;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ o(p pVar, int i7) {
        this.a = i7;
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tv tvVar = this.b.c0;
                ValueAnimator valueAnimator = tvVar.k0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                tvVar.l0 = null;
                break;
            default:
                p pVar = this.b;
                pVar.x = false;
                pVar.invalidate();
                break;
        }
    }
}
