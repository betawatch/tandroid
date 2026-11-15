package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class lw extends FrameLayout {
    public final /* synthetic */ ly a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(ly lyVar, Context context) {
        super(context);
        this.a = lyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ly lyVar = this.a;
        qw qwVar = lyVar.J;
        nv nvVar = lyVar.W;
        yw ywVar = lyVar.Q;
        if (view != ywVar && view != nvVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y10 = qwVar.getY() + qwVar.getMeasuredHeight() + 1.0f;
        if (view == ywVar && nvVar != null) {
            y10 = Math.max(y10, nvVar.getY() + nvVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * lyVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
