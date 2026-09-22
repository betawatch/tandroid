package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class lm extends org.telegram.ui.Components.p6 {
    public final /* synthetic */ mm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm(mm mmVar) {
        super("alpha", 0);
        this.b = mmVar;
    }

    @Override // org.telegram.ui.Components.p6
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
