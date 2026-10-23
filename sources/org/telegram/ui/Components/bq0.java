package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bq0 implements bh.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ jm0 b;

    public /* synthetic */ bq0(jm0 jm0Var, int i10) {
        this.a = i10;
        this.b = jm0Var;
    }

    @Override // bh.k
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                return ((hq0) this.b).drawChild(canvas, view, j10);
            default:
                return ((mu0) this.b).drawChild(canvas, view, j10);
        }
    }
}
