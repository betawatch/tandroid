package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class mw extends FrameLayout {
    public final /* synthetic */ lz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(lz lzVar, Context context) {
        super(context);
        this.a = lzVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        lz lzVar = this.a;
        qw qwVar = lzVar.o0;
        if (view != lzVar.h0) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0.0f, qwVar.getY() + qwVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
