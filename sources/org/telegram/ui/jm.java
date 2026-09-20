package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class jm extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ km b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(km kmVar) {
        super("alpha", 0);
        this.b = kmVar;
    }

    @Override // org.telegram.ui.Components.q6
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
