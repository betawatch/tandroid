package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class b40 extends yu0 {
    public final /* synthetic */ e40 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(e40 e40Var, Context context, qu0 qu0Var, e40 e40Var2, a40 a40Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0L, qu0Var, 0, null, null, null, 8, 0, e40Var2, a40Var, 0, f6Var, null);
        this.c2 = e40Var;
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
