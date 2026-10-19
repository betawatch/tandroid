package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class ks implements bh.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.im0 b;

    public /* synthetic */ ks(org.telegram.ui.Components.im0 im0Var, int i10) {
        this.a = i10;
        this.b = im0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // bh.k
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.a) {
        }
        return this.b.drawChild(canvas, view, j10);
    }
}
