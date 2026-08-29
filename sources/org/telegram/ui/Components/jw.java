package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jw extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ fz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw(fz fzVar, Context context, boolean z10) {
        super(context);
        this.b = fzVar;
        this.a = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        fz fzVar = this.b;
        pw pwVar = fzVar.x0;
        lw lwVar = fzVar.z0;
        ow owVar = fzVar.C0;
        if (this.a || !(view == lwVar || view == owVar)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y8 = pwVar.getY() + pwVar.getMeasuredHeight() + 1.0f;
        if (view == lwVar) {
            y8 = Math.max(y8, owVar.getY() + owVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y8 - (AndroidUtilities.dp(16.0f) * fzVar.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fz fzVar = this.b;
        fzVar.G0 = true;
        fzVar.a0();
        vw vwVar = fzVar.P0;
        if (vwVar != null) {
            vwVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fz fzVar = this.b;
        fzVar.G0 = false;
        fzVar.a0();
        vw vwVar = fzVar.P0;
        if (vwVar != null) {
            vwVar.a();
        }
    }
}
