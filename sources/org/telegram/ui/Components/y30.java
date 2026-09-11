package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class y30 extends xu0 {
    public final /* synthetic */ b40 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y30(b40 b40Var, Context context, pu0 pu0Var, b40 b40Var2, x30 x30Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0L, pu0Var, 0, null, null, null, 8, 0, b40Var2, x30Var, 0, f6Var, null);
        this.f2 = b40Var;
    }

    @Override // org.telegram.ui.Components.xu0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.xu0
    public final String getStoriesHashtag() {
        return this.f2.b;
    }

    @Override // org.telegram.ui.Components.xu0
    public final String getStoriesHashtagUsername() {
        return this.f2.c;
    }

    @Override // org.telegram.ui.Components.xu0
    public final boolean t0() {
        return true;
    }

    @Override // org.telegram.ui.Components.xu0
    public final void D0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.xu0
    public final void K0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.xu0
    public final void M0(float f7) {
    }

    @Override // org.telegram.ui.Components.xu0
    public final void N0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.xu0
    public final void b1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.xu0
    public final void o0() {
    }

    @Override // org.telegram.ui.Components.xu0
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
    }
}
