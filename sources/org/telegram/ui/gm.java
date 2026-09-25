package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class gm extends org.telegram.ui.Components.r6 {
    public final /* synthetic */ im b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(im imVar) {
        super("progress", 0);
        this.b = imVar;
    }

    @Override // org.telegram.ui.Components.r6
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
