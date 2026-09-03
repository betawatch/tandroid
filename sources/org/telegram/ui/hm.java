package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hm extends org.telegram.ui.Components.m6 {
    public final /* synthetic */ km b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(km kmVar) {
        super("p2", 0);
        this.b = kmVar;
    }

    @Override // org.telegram.ui.Components.m6
    public final void b(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).currentX = f10;
        View view = this.b.b.N.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
