package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class nm extends org.telegram.ui.Components.u6 {
    public final /* synthetic */ qm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm(qm qmVar) {
        super("p2", 0);
        this.b = qmVar;
    }

    @Override // org.telegram.ui.Components.u6
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentX = f7;
        View view = this.b.b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
