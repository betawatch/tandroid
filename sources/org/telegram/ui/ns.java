package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ns implements bh.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.mm0 b;

    public /* synthetic */ ns(org.telegram.ui.Components.mm0 mm0Var, int i10) {
        this.a = i10;
        this.b = mm0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // bh.k
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.a) {
        }
        return this.b.drawChild(canvas, view, j10);
    }
}
