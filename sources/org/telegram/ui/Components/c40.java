package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class c40 extends zu0 {
    public final /* synthetic */ f40 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(f40 f40Var, Context context, ru0 ru0Var, f40 f40Var2, b40 b40Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0L, ru0Var, 0, null, null, null, 8, 0, f40Var2, b40Var, 0, g6Var, null);
        this.c2 = f40Var;
    }

    @Override // org.telegram.ui.Components.zu0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.zu0
    public final String getStoriesHashtag() {
        return this.c2.b;
    }

    @Override // org.telegram.ui.Components.zu0
    public final String getStoriesHashtagUsername() {
        return this.c2.c;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean t0() {
        return true;
    }

    @Override // org.telegram.ui.Components.zu0
    public final void D0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.zu0
    public final void K0(boolean z4) {
    }

    @Override // org.telegram.ui.Components.zu0
    public final void M0(float f10) {
    }

    @Override // org.telegram.ui.Components.zu0
    public final void N0(boolean z4) {
    }

    @Override // org.telegram.ui.Components.zu0
    public final void b1(boolean z4) {
    }

    @Override // org.telegram.ui.Components.zu0
    public final void o0() {
    }

    @Override // org.telegram.ui.Components.zu0
    public final void P(Canvas canvas, float f10, Rect rect, Paint paint) {
    }
}
