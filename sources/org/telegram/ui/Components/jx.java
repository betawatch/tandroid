package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class jx extends FrameLayout {
    public final /* synthetic */ lz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(lz lzVar, Context context) {
        super(context);
        this.a = lzVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        lz lzVar = this.a;
        ox oxVar = lzVar.I;
        kw kwVar = lzVar.V;
        wx wxVar = lzVar.P;
        if (view != wxVar && view != kwVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = oxVar.getY() + oxVar.getMeasuredHeight() + 1.0f;
        if (view == wxVar && kwVar != null) {
            y3 = Math.max(y3, kwVar.getY() + kwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * lzVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
