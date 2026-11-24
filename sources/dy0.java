// default package

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dy0 extends ky0 {
    public final /* synthetic */ my0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy0(my0 my0Var, Context context) {
        super(my0Var, context);
        this.I = my0Var;
    }

    @Override // ky0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.I.W(canvas);
    }

    @Override // ky0, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        try {
            return super.drawChild(canvas, view, j);
        } catch (Exception e) {
            fc4.g(e, true);
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new oz((byte) 3));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        my0 my0Var = this.I;
        my0Var.h = null;
        my0Var.c.requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }
}
