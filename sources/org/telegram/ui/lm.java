package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
