package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.m10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ t(z zVar, int i7) {
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
                    m10.n(textView.animate(), 1.0f, 150L);
                    break;
                }
                break;
        }
    }
}
