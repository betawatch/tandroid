// default package

import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class hx1 implements View.OnLongClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ hx1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.z7;
                break;
            default:
                int i2 = ChatActivityEnterView.z7;
                sy1 sy1Var = chatActivityEnterView.F0;
                if (sy1Var != null && sy1Var.length() > 0) {
                    break;
                }
                break;
        }
        return chatActivityEnterView.h1(view);
    }
}
