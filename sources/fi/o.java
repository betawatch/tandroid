package fi;

import android.animation.ValueAnimator;
import org.telegram.ui.sv;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                sv svVar = this.b.c0;
                ValueAnimator valueAnimator = svVar.k0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                svVar.l0 = null;
                break;
            default:
                p pVar = this.b;
                pVar.x = false;
                pVar.invalidate();
                break;
        }
    }
}
