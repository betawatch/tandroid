package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class mb0 extends xd {
    public final /* synthetic */ rb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb0(rb0 rb0Var, Context context) {
        super(context);
        this.c = rb0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.c.getClass();
    }

    @Override // org.telegram.ui.xd, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }
}
