package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class km extends org.telegram.ui.Components.s6 {
    public final /* synthetic */ nm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km(nm nmVar) {
        super("p2", 0);
        this.b = nmVar;
    }

    @Override // org.telegram.ui.Components.s6
    public final void b(Object obj, float f7) {
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
