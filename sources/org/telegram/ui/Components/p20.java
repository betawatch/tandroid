package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class p20 extends zs0 {
    public final /* synthetic */ s20 w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p20(s20 s20Var, Context context, rs0 rs0Var, s20 s20Var2, o20 o20Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0L, rs0Var, 0, null, null, null, 8, 0, s20Var2, o20Var, 0, g6Var, null);
        this.w2 = s20Var;
    }

    @Override // org.telegram.ui.Components.zs0
    public final boolean G0() {
        return true;
    }

    @Override // org.telegram.ui.Components.zs0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.zs0
    public final String getStoriesHashtag() {
        return this.w2.b;
    }

    @Override // org.telegram.ui.Components.zs0
    public final String getStoriesHashtagUsername() {
        return this.w2.c;
    }

    @Override // org.telegram.ui.Components.zs0
    public final void P0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.zs0
    public final void X0(boolean z9) {
    }

    @Override // org.telegram.ui.Components.zs0
    public final void Z0(float f10) {
    }

    @Override // org.telegram.ui.Components.zs0
    public final void q1(boolean z9) {
    }
}
