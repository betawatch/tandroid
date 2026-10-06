package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class c40 extends qv0 {
    public final /* synthetic */ f40 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(f40 f40Var, Context context, iv0 iv0Var, f40 f40Var2, b40 b40Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0L, iv0Var, 0, null, null, null, 8, 0, f40Var2, b40Var, 0, d6Var, null);
        this.f2 = f40Var;
    }

    @Override // org.telegram.ui.Components.qv0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.qv0
    public final String getStoriesHashtag() {
        return this.f2.b;
    }

    @Override // org.telegram.ui.Components.qv0
    public final String getStoriesHashtagUsername() {
        return this.f2.c;
    }

    @Override // org.telegram.ui.Components.qv0
    public final boolean t0() {
        return true;
    }

    @Override // org.telegram.ui.Components.qv0
    public final void D0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.qv0
    public final void K0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qv0
    public final void M0(float f7) {
    }

    @Override // org.telegram.ui.Components.qv0
    public final void N0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qv0
    public final void b1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qv0
    public final void o0() {
    }

    @Override // org.telegram.ui.Components.qv0
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
    }
}
