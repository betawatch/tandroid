package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.i20;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ s(z zVar, int i7) {
        this.a = i7;
        this.b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.requestLayout();
                break;
            default:
                z zVar = this.b;
                TextView textView = zVar.P;
                v vVar = zVar.a;
                if (!vVar.d.isFirstFrameRendered()) {
                    vVar.animate().cancel();
                    vVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    i20.m(textView.animate(), 1.0f, 150L);
                    break;
                }
                break;
        }
    }
}
