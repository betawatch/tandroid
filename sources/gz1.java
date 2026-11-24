// default package

import android.content.Context;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gz1 extends or0 {
    public final /* synthetic */ ChatActivityEnterView E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz1(ChatActivityEnterView chatActivityEnterView, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.E = chatActivityEnterView;
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        ChatActivityEnterView chatActivityEnterView = this.E;
        if (chatActivityEnterView.W0 == null || chatActivityEnterView.e4 != 1) {
            return;
        }
        chatActivityEnterView.P3.o(f);
    }
}
