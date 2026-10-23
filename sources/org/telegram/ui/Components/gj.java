package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class gj extends s4.c0 {
    public final /* synthetic */ di.k r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(di.k kVar, Context context) {
        super(context);
        this.r = kVar;
    }

    @Override // s4.c0
    public final int k(int i10, View view) {
        return org.telegram.messenger.g0.A(7.0f, ((ij) this.r.R).n.getPaddingTop(), super.k(i10, view));
    }

    @Override // s4.c0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
