// default package

import android.content.Context;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cy1 extends ImageView {
    public float a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy1(ChatActivityEnterView chatActivityEnterView, Context context) {
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
        float L = gm.L(-44.0f) + this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        float f2 = L + chatActivityEnterView.E + chatActivityEnterView.y;
        tx1 tx1Var = chatActivityEnterView.A2;
        float L2 = gm.L((tx1Var == null || tx1Var.getVisibility() != 0) ? 0.0f : -44.0f);
        tx1 tx1Var2 = chatActivityEnterView.A2;
        float alpha = (L2 * (tx1Var2 == null ? 0.0f : tx1Var2.getAlpha())) + f2;
        tx1 tx1Var3 = chatActivityEnterView.n2;
        float L3 = gm.L((tx1Var3 == null || tx1Var3.getVisibility() != 0) ? 0.0f : -44.0f);
        tx1 tx1Var4 = chatActivityEnterView.n2;
        super.setTranslationX((L3 * (tx1Var4 != null ? tx1Var4.getAlpha() : 0.0f)) + alpha);
    }
}
