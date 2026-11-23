package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class c30 extends jt0 {
    public final /* synthetic */ f30 x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(f30 f30Var, Context context, bt0 bt0Var, f30 f30Var2, b30 b30Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, 0L, bt0Var, 0, null, null, null, 8, 0, f30Var2, b30Var, 0, h6Var, null);
        this.x2 = f30Var;
    }

    @Override // org.telegram.ui.Components.jt0
    public final boolean G0() {
        return true;
    }

    @Override // org.telegram.ui.Components.jt0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.jt0
    public final String getStoriesHashtag() {
        return this.x2.b;
    }

    @Override // org.telegram.ui.Components.jt0
    public final String getStoriesHashtagUsername() {
        return this.x2.c;
    }

    @Override // org.telegram.ui.Components.jt0
    public final void P0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.jt0
    public final void X0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.jt0
    public final void Z0(float f10) {
    }

    @Override // org.telegram.ui.Components.jt0
    public final void q1(boolean z10) {
    }
}
