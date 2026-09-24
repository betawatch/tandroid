package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class kx extends FrameLayout {
    public final /* synthetic */ lz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx(lz lzVar, Context context) {
        super(context);
        this.a = lzVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        lz lzVar = this.a;
        px pxVar = lzVar.I;
        lw lwVar = lzVar.V;
        xx xxVar = lzVar.P;
        if (view != xxVar && view != lwVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = pxVar.getY() + pxVar.getMeasuredHeight() + 1.0f;
        if (view == xxVar && lwVar != null) {
            y3 = Math.max(y3, lwVar.getY() + lwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * lzVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
