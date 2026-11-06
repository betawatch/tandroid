package org.telegram.ui.Components.voip;

import android.widget.TextView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;

    public /* synthetic */ s(y yVar, int i7) {
        this.a = i7;
        this.b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.requestLayout();
                break;
            default:
                y yVar = this.b;
                TextView textView = yVar.O;
                u uVar = yVar.a;
                if (!uVar.d.isFirstFrameRendered()) {
                    uVar.animate().cancel();
                    uVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    org.telegram.messenger.camera.q.k(textView.animate(), 1.0f, 150L);
                    break;
                }
                break;
        }
    }
}
