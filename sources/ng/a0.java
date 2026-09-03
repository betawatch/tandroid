package ng;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a0 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final RectF b = new RectF();
    public final RectF c = new RectF();
    public final /* synthetic */ d0 d;

    public a0(d0 d0Var) {
        this.d = d0Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        d0 d0Var = this.d;
        float lerp = AndroidUtilities.lerp(d0Var.e, AndroidUtilities.dp(8.0f), d0Var.j);
        float measuredWidth = view.getMeasuredWidth();
        float measuredHeight = view.getMeasuredHeight();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        RectF rectF2 = d0Var.f;
        float f10 = d0Var.j;
        RectF rectF3 = this.c;
        AndroidUtilities.lerp(rectF2, rectF, f10, rectF3);
        Rect rect = this.a;
        rectF3.round(rect);
        outline.setRoundRect(rect, lerp);
    }
}
