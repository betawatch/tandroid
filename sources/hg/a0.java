package hg;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a0 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final RectF b = new RectF();
    public final RectF c = new RectF();
    public final /* synthetic */ e0 d;

    public a0(e0 e0Var) {
        this.d = e0Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        e0 e0Var = this.d;
        float lerp = AndroidUtilities.lerp(e0Var.e, AndroidUtilities.dp(8.0f), e0Var.j);
        float measuredWidth = view.getMeasuredWidth();
        float measuredHeight = view.getMeasuredHeight();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        RectF rectF2 = e0Var.f;
        float f10 = e0Var.j;
        RectF rectF3 = this.c;
        AndroidUtilities.lerp(rectF2, rectF, f10, rectF3);
        Rect rect = this.a;
        rectF3.round(rect);
        outline.setRoundRect(rect, lerp);
    }
}
