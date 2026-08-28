package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vj extends f2.n0 {
    public final /* synthetic */ dj r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(dj djVar, Context context) {
        super(context);
        this.r = djVar;
    }

    @Override // f2.n0
    public final int k(int i9, View view) {
        return org.telegram.messenger.l0.A(56.0f, ((fk) this.r.V).r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i9, view));
    }

    @Override // f2.n0
    public final int m(int i9) {
        return super.m(i9) * 2;
    }
}
