package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.n10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                TextView textView = yVar.P;
                u uVar = yVar.a;
                if (!uVar.d.isFirstFrameRendered()) {
                    uVar.animate().cancel();
                    uVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    n10.n(textView.animate(), 1.0f, 150L);
                    break;
                }
                break;
        }
    }
}
