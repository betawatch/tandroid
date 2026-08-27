package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class os implements jg.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.zk0 b;

    public /* synthetic */ os(org.telegram.ui.Components.zk0 zk0Var, int i10) {
        this.a = i10;
        this.b = zk0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // jg.j
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.a) {
        }
        return this.b.drawChild(canvas, view, j10);
    }
}
