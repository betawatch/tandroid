package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class b40 extends lv0 {
    public final /* synthetic */ e40 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(e40 e40Var, Context context, dv0 dv0Var, e40 e40Var2, a40 a40Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0L, dv0Var, 0, null, null, null, 8, 0, e40Var2, a40Var, 0, d6Var, null);
        this.f2 = e40Var;
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
