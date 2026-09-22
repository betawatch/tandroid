package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class im extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ km b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(km kmVar) {
        super("progress", 0);
        this.b = kmVar;
    }

    @Override // org.telegram.ui.Components.q6
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
