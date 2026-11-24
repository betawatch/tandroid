// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class i04 extends s24 {
    public final /* synthetic */ e34 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i04(e34 e34Var, Context context) {
        super(e34Var, context, 2);
        this.I = e34Var;
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            super.setTranslationY(f);
            this.I.h0.invalidate();
        }
    }
}
