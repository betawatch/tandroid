package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class du0 {
    public final int a;
    public final int b;
    public final cu0 c;
    public final bu0 d;
    public final /* synthetic */ eu0 e;

    public du0(eu0 eu0Var, Context context, int i9) {
        this.e = eu0Var;
        this.b = i9;
        int i10 = eu0Var.W1;
        eu0Var.W1 = i10 + 1;
        this.a = (i10 & 65535) | 65536;
        this.c = new cu0(this, context, i9);
        this.d = new bu0(eu0Var, context, i9, false);
    }
}
