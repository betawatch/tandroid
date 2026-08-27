package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class n30 extends hu0 {
    public final /* synthetic */ q30 b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n30(q30 q30Var, Context context, zt0 zt0Var, q30 q30Var2, m30 m30Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 0L, zt0Var, 0, null, null, null, 8, 0, q30Var2, m30Var, 0, c6Var, null);
        this.b2 = q30Var;
    }

    @Override // org.telegram.ui.Components.hu0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.hu0
    public final String getStoriesHashtag() {
        return this.b2.b;
    }

    @Override // org.telegram.ui.Components.hu0
    public final String getStoriesHashtagUsername() {
        return this.b2.c;
    }

    @Override // org.telegram.ui.Components.hu0
    public final boolean t0() {
        return true;
    }

    @Override // org.telegram.ui.Components.hu0
    public final void D0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.hu0
    public final void K0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.hu0
    public final void M0(float f10) {
    }

    @Override // org.telegram.ui.Components.hu0
    public final void N0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.hu0
    public final void b1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.hu0
    public final void o0() {
    }

    @Override // org.telegram.ui.Components.hu0
    public final void P(Canvas canvas, float f10, Rect rect, Paint paint) {
    }
}
