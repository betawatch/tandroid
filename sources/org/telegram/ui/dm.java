package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class dm extends org.telegram.ui.Components.u6 {
    public final /* synthetic */ em b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm(em emVar) {
        super("alpha", 0);
        this.b = emVar;
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
