package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ms implements lg.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.jl0 b;

    public /* synthetic */ ms(org.telegram.ui.Components.jl0 jl0Var, int i10) {
        this.a = i10;
        this.b = jl0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // lg.j
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.a) {
        }
        return this.b.drawChild(canvas, view, j10);
    }
}
