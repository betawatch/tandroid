package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class oi extends v4.c0 {
    public final /* synthetic */ ei.h r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(ei.h hVar, Context context) {
        super(context);
        this.r = hVar;
    }

    @Override // v4.c0
    public final int k(int i7, View view) {
        return org.telegram.messenger.k5.B(7.0f, ((qi) this.r.R).n.getPaddingTop(), super.k(i7, view));
    }

    @Override // v4.c0
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
