package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class im extends org.telegram.ui.Components.r6 {
    public final /* synthetic */ jm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(jm jmVar) {
        super("alpha", 0);
        this.b = jmVar;
    }

    @Override // org.telegram.ui.Components.r6
    public final void b(Object obj, float f7) {
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
