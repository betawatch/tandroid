// default package

import android.app.Dialog;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jy1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Dialog b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ jy1(ChatActivityEnterView chatActivityEnterView, Dialog dialog, byte b) {
        this.a = b;
        this.c = chatActivityEnterView;
        this.b = dialog;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        byte b = this.a;
        Dialog dialog = this.b;
        ChatActivityEnterView chatActivityEnterView = this.c;
        switch (b) {
            case 0:
                chatActivityEnterView.q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.q0.postDelayed(new fo1(dialog, (byte) 12), 100L);
                break;
            default:
                chatActivityEnterView.q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.q0.postDelayed(new fo1(dialog, (byte) 12), 100L);
                break;
        }
        return true;
    }
}
