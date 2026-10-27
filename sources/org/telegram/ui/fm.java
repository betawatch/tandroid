package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fm extends org.telegram.ui.Components.u6 {
    public final /* synthetic */ gm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm(gm gmVar) {
        super("alpha", 0);
        this.b = gmVar;
    }

    @Override // org.telegram.ui.Components.u6
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
