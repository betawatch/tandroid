package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ym extends f2.n0 {
    public final /* synthetic */ dj r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym(dj djVar, Context context) {
        super(context);
        this.r = djVar;
    }

    @Override // f2.n0
    public final int k(int i9, View view) {
        int i10;
        jn jnVar = (jn) this.r.V;
        if (jnVar.R0) {
            i9 = -1;
        }
        int k10 = super.k(i9, view);
        if (jnVar.R0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!jnVar.R0) {
            k10 = org.telegram.messenger.l0.A(7.0f, jnVar.N0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (jnVar.R0 && k10 == 0 && (i10 = jnVar.S0) >= 0) {
            jn.J(jnVar, i10);
            jnVar.S0 = -1;
        }
        jnVar.R0 = false;
        return k10;
    }

    @Override // f2.n0
    public final int m(int i9) {
        return super.m(i9) * 2;
    }
}
