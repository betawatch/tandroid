package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.n10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
