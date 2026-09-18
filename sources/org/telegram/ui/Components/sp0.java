package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sp0 implements ah.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ wl0 b;

    public /* synthetic */ sp0(wl0 wl0Var, int i10) {
        this.a = i10;
        this.b = wl0Var;
    }

    @Override // ah.n
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 0:
                return ((xp0) this.b).drawChild(canvas, view, j3);
            default:
                return ((cu0) this.b).drawChild(canvas, view, j3);
        }
    }
}
