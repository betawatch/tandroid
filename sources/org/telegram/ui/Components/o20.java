package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o20 extends ys0 {
    public final /* synthetic */ r20 w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o20(r20 r20Var, Context context, qs0 qs0Var, r20 r20Var2, n20 n20Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, 0L, qs0Var, 0, null, null, null, 8, 0, r20Var2, n20Var, 0, h6Var, null);
        this.w2 = r20Var;
    }

    @Override // org.telegram.ui.Components.ys0
    public final boolean G0() {
        return true;
    }

    @Override // org.telegram.ui.Components.ys0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.ys0
    public final String getStoriesHashtag() {
        return this.w2.b;
    }

    @Override // org.telegram.ui.Components.ys0
    public final String getStoriesHashtagUsername() {
        return this.w2.c;
    }

    @Override // org.telegram.ui.Components.ys0
    public final void P0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.ys0
    public final void X0(boolean z9) {
    }

    @Override // org.telegram.ui.Components.ys0
    public final void Z0(float f10) {
    }

    @Override // org.telegram.ui.Components.ys0
    public final void q1(boolean z9) {
    }
}
