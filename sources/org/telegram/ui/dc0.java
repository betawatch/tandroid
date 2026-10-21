package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class dc0 extends org.telegram.ui.Components.uv0 {
    public final /* synthetic */ nc0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc0(nc0 nc0Var, Context context, org.telegram.ui.Components.mv0 mv0Var, nc0 nc0Var2, cc0 cc0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0L, mv0Var, 0, null, null, null, 8, 0, nc0Var2, cc0Var, 0, d6Var, null);
        this.f2 = nc0Var;
    }

    @Override // org.telegram.ui.Components.uv0
    public final int D0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.uv0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.Components.uv0
    public final int U0() {
        return 3;
    }

    @Override // org.telegram.ui.Components.uv0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f2.M0;
    }
}
