package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class hm extends org.telegram.ui.Components.m6 {
    public final /* synthetic */ im b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(im imVar) {
        super("alpha", 0);
        this.b = imVar;
    }

    @Override // org.telegram.ui.Components.m6
    public final void b(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f10;
        View view = this.b.b.N.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
