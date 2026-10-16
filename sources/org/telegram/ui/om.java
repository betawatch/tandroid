package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class om extends org.telegram.ui.Components.u6 {
    public final /* synthetic */ qm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om(qm qmVar) {
        super("progress", 0);
        this.b = qmVar;
    }

    @Override // org.telegram.ui.Components.u6
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
