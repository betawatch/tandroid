package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ka0 extends org.telegram.ui.Components.jt0 {
    public final /* synthetic */ qa0 x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka0(qa0 qa0Var, Context context, org.telegram.ui.Components.bt0 bt0Var, qa0 qa0Var2, ja0 ja0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, 0L, bt0Var, 0, null, null, null, 8, 0, qa0Var2, ja0Var, 0, h6Var, null);
        this.x2 = qa0Var;
    }

    @Override // org.telegram.ui.Components.jt0
    public final int O0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.jt0
    public final boolean Y() {
        return true;
    }

    @Override // org.telegram.ui.Components.jt0
    public final int e1() {
        return 3;
    }

    @Override // org.telegram.ui.Components.jt0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.x2.T0;
    }
}
