package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ns implements ig.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.wk0 b;

    public /* synthetic */ ns(org.telegram.ui.Components.wk0 wk0Var, int i9) {
        this.a = i9;
        this.b = wk0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ig.j
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.a) {
        }
        return this.b.drawChild(canvas, view, j10);
    }
}
