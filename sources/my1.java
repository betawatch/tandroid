// default package

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class my1 extends o24 {
    public final /* synthetic */ ChatActivityEnterView V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my1(ChatActivityEnterView chatActivityEnterView, e eVar, boolean z, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z2, vnb vnbVar, boolean z3, boolean z4) {
        super(eVar, z, true, true, context, true, chatFull, viewGroup, z2, vnbVar, z3, z4);
        this.V2 = chatActivityEnterView;
    }

    @Override // o24, android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        ChatActivityEnterView chatActivityEnterView = this.V2;
        if (chatActivityEnterView.W0 == null || chatActivityEnterView.d4 != 0) {
            return;
        }
        chatActivityEnterView.O3.o(f);
    }
}
