package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c40 extends yu0 {
    public final /* synthetic */ f40 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(f40 f40Var, Context context, qu0 qu0Var, f40 f40Var2, b40 b40Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0L, qu0Var, 0, null, null, null, 8, 0, f40Var2, b40Var, 0, g6Var, null);
        this.c2 = f40Var;
    }

    @Override // org.telegram.ui.Components.yu0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.yu0
    public final String getStoriesHashtag() {
        return this.c2.b;
    }

    @Override // org.telegram.ui.Components.yu0
    public final String getStoriesHashtagUsername() {
        return this.c2.c;
    }

    @Override // org.telegram.ui.Components.yu0
    public final boolean t0() {
        return true;
    }

    @Override // org.telegram.ui.Components.yu0
    public final void D0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.yu0
    public final void K0(boolean z4) {
    }

    @Override // org.telegram.ui.Components.yu0
    public final void M0(float f10) {
    }

    @Override // org.telegram.ui.Components.yu0
    public final void N0(boolean z4) {
    }

    @Override // org.telegram.ui.Components.yu0
    public final void b1(boolean z4) {
    }

    @Override // org.telegram.ui.Components.yu0
    public final void o0() {
    }

    @Override // org.telegram.ui.Components.yu0
    public final void P(Canvas canvas, float f10, Rect rect, Paint paint) {
    }
}
