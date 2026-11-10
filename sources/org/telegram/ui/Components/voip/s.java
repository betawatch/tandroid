package org.telegram.ui.Components.voip;

import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
