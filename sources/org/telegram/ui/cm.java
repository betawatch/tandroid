package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class cm extends org.telegram.ui.Components.s6 {
    public final /* synthetic */ em b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm(em emVar) {
        super("progress", 0);
        this.b = emVar;
    }

    @Override // org.telegram.ui.Components.s6
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).progress = f7;
        View view = this.b.b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
