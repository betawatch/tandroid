// default package

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ex0 extends lx0 {
    public final /* synthetic */ nx0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex0(nx0 nx0Var, Context context) {
        super(nx0Var, context);
        this.I = nx0Var;
    }

    @Override // lx0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.I.W(canvas);
    }

    @Override // lx0, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        try {
            return super.drawChild(canvas, view, j);
        } catch (Exception e) {
            cc4.g(e, true);
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new py((byte) 3));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        nx0 nx0Var = this.I;
        nx0Var.h = null;
        nx0Var.c.requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }
}
