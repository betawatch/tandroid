package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class bm extends org.telegram.ui.Components.s6 {
    public final /* synthetic */ dm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(dm dmVar) {
        super("progress", 0);
        this.b = dmVar;
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
