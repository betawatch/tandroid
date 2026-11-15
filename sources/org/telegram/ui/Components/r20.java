package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r20 extends ys0 {
    public final /* synthetic */ u20 x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r20(u20 u20Var, Context context, qs0 qs0Var, u20 u20Var2, q20 q20Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 0L, qs0Var, 0, null, null, null, 8, 0, u20Var2, q20Var, 0, e6Var, null);
        this.x2 = u20Var;
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
        return this.x2.b;
    }

    @Override // org.telegram.ui.Components.ys0
    public final String getStoriesHashtagUsername() {
        return this.x2.c;
    }

    @Override // org.telegram.ui.Components.ys0
    public final void P0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.ys0
    public final void X0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ys0
    public final void Z0(float f10) {
    }

    @Override // org.telegram.ui.Components.ys0
    public final void q1(boolean z10) {
    }
}
