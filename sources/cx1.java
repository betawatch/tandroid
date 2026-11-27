// default package

import android.content.Context;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cx1 extends ImageView {
    public float a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx1(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View
    public final float getTranslationX() {
        return this.a;
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        this.a = f;
        float L = hl.L(-44.0f) + this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        float f2 = L + chatActivityEnterView.E + chatActivityEnterView.y;
        vw1 vw1Var = chatActivityEnterView.z2;
        float L2 = hl.L((vw1Var == null || vw1Var.getVisibility() != 0) ? 0.0f : -44.0f);
        vw1 vw1Var2 = chatActivityEnterView.z2;
        float alpha = (L2 * (vw1Var2 == null ? 0.0f : vw1Var2.getAlpha())) + f2;
        vw1 vw1Var3 = chatActivityEnterView.m2;
        float L3 = hl.L((vw1Var3 == null || vw1Var3.getVisibility() != 0) ? 0.0f : -44.0f);
        vw1 vw1Var4 = chatActivityEnterView.m2;
        super.setTranslationX((L3 * (vw1Var4 != null ? vw1Var4.getAlpha() : 0.0f)) + alpha);
    }
}
