package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class h40 extends sv0 {
    public final /* synthetic */ k40 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h40(k40 k40Var, Context context, kv0 kv0Var, k40 k40Var2, g40 g40Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0L, kv0Var, 0, null, null, null, 8, 0, k40Var2, g40Var, 0, d6Var, null);
        this.f2 = k40Var;
    }

    @Override // org.telegram.ui.Components.sv0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.sv0
    public final String getStoriesHashtag() {
        return this.f2.b;
    }

    @Override // org.telegram.ui.Components.sv0
    public final String getStoriesHashtagUsername() {
        return this.f2.c;
    }

    @Override // org.telegram.ui.Components.sv0
    public final boolean v0() {
        return true;
    }

    @Override // org.telegram.ui.Components.sv0
    public final void F0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.sv0
    public final void M0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.sv0
    public final void O0(float f7) {
    }

    @Override // org.telegram.ui.Components.sv0
    public final void P0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.sv0
    public final void d1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.sv0
    public final void p0() {
    }

    @Override // org.telegram.ui.Components.sv0
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
    }
}
