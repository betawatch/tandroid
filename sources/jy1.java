// default package

import android.content.Context;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class jy1 extends oq0 {
    public final /* synthetic */ ChatActivityEnterView E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy1(ChatActivityEnterView chatActivityEnterView, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.E = chatActivityEnterView;
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        ChatActivityEnterView chatActivityEnterView = this.E;
        if (chatActivityEnterView.W0 == null || chatActivityEnterView.d4 != 1) {
            return;
        }
        chatActivityEnterView.O3.o(f);
    }
}
