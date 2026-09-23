package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ep0 implements ah.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ ml0 b;

    public /* synthetic */ ep0(ml0 ml0Var, int i10) {
        this.a = i10;
        this.b = ml0Var;
    }

    @Override // ah.m
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 0:
                return ((jp0) this.b).drawChild(canvas, view, j3);
            default:
                return ((qt0) this.b).drawChild(canvas, view, j3);
        }
    }
}
