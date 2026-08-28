package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i30 extends eu0 {
    public final /* synthetic */ l30 b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i30(l30 l30Var, Context context, wt0 wt0Var, l30 l30Var2, h30 h30Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, 0L, wt0Var, 0, null, null, null, 8, 0, l30Var2, h30Var, 0, b6Var, null);
        this.b2 = l30Var;
    }

    @Override // org.telegram.ui.Components.eu0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.eu0
    public final String getStoriesHashtag() {
        return this.b2.b;
    }

    @Override // org.telegram.ui.Components.eu0
    public final String getStoriesHashtagUsername() {
        return this.b2.c;
    }

    @Override // org.telegram.ui.Components.eu0
    public final boolean t0() {
        return true;
    }

    @Override // org.telegram.ui.Components.eu0
    public final void D0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.eu0
    public final void K0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.eu0
    public final void M0(float f10) {
    }

    @Override // org.telegram.ui.Components.eu0
    public final void N0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.eu0
    public final void b1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.eu0
    public final void o0() {
    }

    @Override // org.telegram.ui.Components.eu0
    public final void P(Canvas canvas, float f10, Rect rect, Paint paint) {
    }
}
