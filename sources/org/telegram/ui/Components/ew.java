package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ew extends FrameLayout {
    public final /* synthetic */ fz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew(fz fzVar, Context context) {
        super(context);
        this.a = fzVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        fz fzVar = this.a;
        iw iwVar = fzVar.k0;
        if (view != fzVar.d0) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0.0f, iwVar.getY() + iwVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
