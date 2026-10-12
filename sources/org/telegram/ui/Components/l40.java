package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class l40 extends xv0 {
    public final /* synthetic */ o40 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l40(o40 o40Var, Context context, pv0 pv0Var, o40 o40Var2, k40 k40Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 0L, pv0Var, 0, null, null, null, 8, 0, o40Var2, k40Var, 0, c6Var, null);
        this.f2 = o40Var;
    }

    @Override // org.telegram.ui.Components.xv0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.xv0
    public final String getStoriesHashtag() {
        return this.f2.b;
    }

    @Override // org.telegram.ui.Components.xv0
    public final String getStoriesHashtagUsername() {
        return this.f2.c;
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean t0() {
        return true;
    }

    @Override // org.telegram.ui.Components.xv0
    public final void D0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.xv0
    public final void K0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.xv0
    public final void M0(float f7) {
    }

    @Override // org.telegram.ui.Components.xv0
    public final void N0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.xv0
    public final void b1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.xv0
    public final void o0() {
    }

    @Override // org.telegram.ui.Components.xv0
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
    }
}
