package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class yu0 {
    public final int a;
    public final int b;
    public final xu0 c;
    public final wu0 d;
    public final /* synthetic */ zu0 e;

    public yu0(zu0 zu0Var, Context context, int i10) {
        this.e = zu0Var;
        this.b = i10;
        int i11 = zu0Var.X1;
        zu0Var.X1 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new xu0(this, context, i10);
        this.d = new wu0(zu0Var, context, i10, false);
    }
}
