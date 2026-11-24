// default package

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jz1 extends e34 {
    public final /* synthetic */ ChatActivityEnterView V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz1(ChatActivityEnterView chatActivityEnterView, d dVar, boolean z, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z2, ylb ylbVar, boolean z3, boolean z4) {
        super(dVar, z, true, true, context, true, chatFull, viewGroup, z2, ylbVar, z3, z4);
        this.V2 = chatActivityEnterView;
    }

    @Override // e34, android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        ChatActivityEnterView chatActivityEnterView = this.V2;
        if (chatActivityEnterView.W0 == null || chatActivityEnterView.e4 != 0) {
            return;
        }
        chatActivityEnterView.P3.o(f);
    }
}
