package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i40 extends iv0 {
    public final /* synthetic */ l40 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i40(l40 l40Var, Context context, av0 av0Var, l40 l40Var2, h40 h40Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0L, av0Var, 0, null, null, null, 8, 0, l40Var2, h40Var, 0, f6Var, null);
        this.f2 = l40Var;
    }

    @Override // org.telegram.ui.Components.iv0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.iv0
    public final String getStoriesHashtag() {
        return this.f2.b;
    }

    @Override // org.telegram.ui.Components.iv0
    public final String getStoriesHashtagUsername() {
        return this.f2.c;
    }

    @Override // org.telegram.ui.Components.iv0
    public final boolean t0() {
        return true;
    }

    @Override // org.telegram.ui.Components.iv0
    public final void D0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.iv0
    public final void K0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.iv0
    public final void M0(float f7) {
    }

    @Override // org.telegram.ui.Components.iv0
    public final void N0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.iv0
    public final void b1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.iv0
    public final void o0() {
    }

    @Override // org.telegram.ui.Components.iv0
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
    }
}
