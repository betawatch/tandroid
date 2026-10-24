package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class cm extends org.telegram.ui.Components.s6 {
    public final /* synthetic */ dm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm(dm dmVar) {
        super("alpha", 0);
        this.b = dmVar;
    }

    @Override // org.telegram.ui.Components.s6
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f7;
        View view = this.b.b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
