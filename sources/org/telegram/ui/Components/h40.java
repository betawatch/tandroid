package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class h40 extends xv0 {
    public final /* synthetic */ k40 i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h40(k40 k40Var, Context context, pv0 pv0Var, k40 k40Var2, g40 g40Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0L, pv0Var, 0, null, null, null, 8, 0, k40Var2, g40Var, 0, g6Var, null);
        this.i2 = k40Var;
    }

    @Override // org.telegram.ui.Components.xv0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.xv0
    public final String getStoriesHashtag() {
        return this.i2.b;
    }

    @Override // org.telegram.ui.Components.xv0
    public final String getStoriesHashtagUsername() {
        return this.i2.c;
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean w0() {
        return true;
    }

    @Override // org.telegram.ui.Components.xv0
    public final void G0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.xv0
    public final void N0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.xv0
    public final void P0(float f7) {
    }

    @Override // org.telegram.ui.Components.xv0
    public final void Q0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.xv0
    public final void e1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.xv0
    public final void q0() {
    }

    @Override // org.telegram.ui.Components.xv0
    public final void Q(Canvas canvas, float f7, Rect rect, Paint paint) {
    }
}
