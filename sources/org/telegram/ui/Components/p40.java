package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class p40 extends bw0 {
    public final /* synthetic */ s40 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p40(s40 s40Var, Context context, tv0 tv0Var, s40 s40Var2, o40 o40Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 0L, tv0Var, 0, null, null, null, 8, 0, s40Var2, o40Var, 0, e6Var, null);
        this.f2 = s40Var;
    }

    @Override // org.telegram.ui.Components.bw0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.bw0
    public final String getStoriesHashtag() {
        return this.f2.b;
    }

    @Override // org.telegram.ui.Components.bw0
    public final String getStoriesHashtagUsername() {
        return this.f2.c;
    }

    @Override // org.telegram.ui.Components.bw0
    public final boolean t0() {
        return true;
    }

    @Override // org.telegram.ui.Components.bw0
    public final void D0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.bw0
    public final void K0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.bw0
    public final void M0(float f7) {
    }

    @Override // org.telegram.ui.Components.bw0
    public final void N0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.bw0
    public final void b1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.bw0
    public final void o0() {
    }

    @Override // org.telegram.ui.Components.bw0
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
    }
}
