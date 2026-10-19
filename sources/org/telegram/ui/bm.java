package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class bm extends org.telegram.ui.Components.s6 {
    public final /* synthetic */ cm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(cm cmVar) {
        super("alpha", 0);
        this.b = cmVar;
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
