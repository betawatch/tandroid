package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class z30 extends yu0 {
    public final /* synthetic */ c40 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z30(c40 c40Var, Context context, qu0 qu0Var, c40 c40Var2, y30 y30Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0L, qu0Var, 0, null, null, null, 8, 0, c40Var2, y30Var, 0, d6Var, null);
        this.f2 = c40Var;
    }

    @Override // org.telegram.ui.Components.yu0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.yu0
    public final String getStoriesHashtag() {
        return this.f2.b;
    }

    @Override // org.telegram.ui.Components.yu0
    public final String getStoriesHashtagUsername() {
        return this.f2.c;
    }

    @Override // org.telegram.ui.Components.yu0
    public final boolean t0() {
        return true;
    }

    @Override // org.telegram.ui.Components.yu0
    public final void D0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.yu0
    public final void K0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.yu0
    public final void M0(float f7) {
    }

    @Override // org.telegram.ui.Components.yu0
    public final void N0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.yu0
    public final void b1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.yu0
    public final void o0() {
    }

    @Override // org.telegram.ui.Components.yu0
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
    }
}
