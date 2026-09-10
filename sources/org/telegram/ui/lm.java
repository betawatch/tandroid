package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class lm extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ om b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm(om omVar) {
        super("p2", 0);
        this.b = omVar;
    }

    @Override // org.telegram.ui.Components.q6
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
