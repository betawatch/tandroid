package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w30 extends qu0 {
    public final /* synthetic */ z30 b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w30(z30 z30Var, Context context, iu0 iu0Var, z30 z30Var2, v30 v30Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 0L, iu0Var, 0, null, null, null, 8, 0, z30Var2, v30Var, 0, c6Var, null);
        this.b2 = z30Var;
    }

    @Override // org.telegram.ui.Components.qu0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.qu0
    public final String getStoriesHashtag() {
        return this.b2.b;
    }

    @Override // org.telegram.ui.Components.qu0
    public final String getStoriesHashtagUsername() {
        return this.b2.c;
    }

    @Override // org.telegram.ui.Components.qu0
    public final boolean t0() {
        return true;
    }

    @Override // org.telegram.ui.Components.qu0
    public final void D0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.qu0
    public final void K0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qu0
    public final void M0(float f9) {
    }

    @Override // org.telegram.ui.Components.qu0
    public final void N0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qu0
    public final void b1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qu0
    public final void o0() {
    }

    @Override // org.telegram.ui.Components.qu0
    public final void P(Canvas canvas, float f9, Rect rect, Paint paint) {
    }
}
