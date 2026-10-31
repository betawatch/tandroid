package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.z20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ l(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.requestLayout();
                break;
            default:
                r rVar = this.b;
                TextView textView = rVar.O;
                n nVar = rVar.a;
                if (!nVar.d.isFirstFrameRendered()) {
                    nVar.animate().cancel();
                    nVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    z20.l(textView.animate(), 1.0f, 150L);
                    break;
                }
                break;
        }
    }
}
