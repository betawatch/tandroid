package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class km extends org.telegram.ui.Components.p6 {
    public final /* synthetic */ mm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km(mm mmVar) {
        super("progress", 0);
        this.b = mmVar;
    }

    @Override // org.telegram.ui.Components.p6
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
