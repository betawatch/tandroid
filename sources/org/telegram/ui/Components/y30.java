package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class y30 extends lv0 {
    public final /* synthetic */ b40 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y30(b40 b40Var, Context context, dv0 dv0Var, b40 b40Var2, x30 x30Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0L, dv0Var, 0, null, null, null, 8, 0, b40Var2, x30Var, 0, f6Var, null);
        this.f2 = b40Var;
    }

    @Override // org.telegram.ui.Components.lv0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.lv0
    public final String getStoriesHashtag() {
        return this.f2.b;
    }

    @Override // org.telegram.ui.Components.lv0
    public final String getStoriesHashtagUsername() {
        return this.f2.c;
    }

    @Override // org.telegram.ui.Components.lv0
    public final boolean t0() {
        return true;
    }

    @Override // org.telegram.ui.Components.lv0
    public final void D0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.lv0
    public final void K0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.lv0
    public final void M0(float f7) {
    }

    @Override // org.telegram.ui.Components.lv0
    public final void N0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.lv0
    public final void b1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.lv0
    public final void o0() {
    }

    @Override // org.telegram.ui.Components.lv0
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
    }
}
