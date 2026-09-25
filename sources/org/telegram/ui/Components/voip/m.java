package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.ok;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ m(u uVar, int i10) {
        this.a = i10;
        this.b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.requestLayout();
                break;
            default:
                u uVar = this.b;
                TextView textView = uVar.O;
                p pVar = uVar.a;
                if (!pVar.d.isFirstFrameRendered()) {
                    pVar.animate().cancel();
                    pVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    ok.r(textView.animate(), 1.0f, 150L);
                    break;
                }
                break;
        }
    }
}
