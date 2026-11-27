// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class a04 extends c24 {
    public final /* synthetic */ o24 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a04(o24 o24Var, Context context) {
        super(o24Var, context, 0);
        this.I = o24Var;
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            this.I.y0.invalidate();
        }
    }
}
