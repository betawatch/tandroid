package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class lm extends org.telegram.ui.Components.s6 {
    public final /* synthetic */ nm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm(nm nmVar) {
        super("progress", 0);
        this.b = nmVar;
    }

    @Override // org.telegram.ui.Components.s6
    public final void b(Object obj, float f7) {
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
