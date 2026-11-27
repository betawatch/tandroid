// default package

import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class gx1 implements t69 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ gx1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // t69
    public final boolean e(int i, View view) {
        if (!(view instanceof cp0)) {
            return false;
        }
        String str = ((cp0) view).getCommand() + " ";
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.setFieldText(str);
        chatActivityEnterView.n0.c();
        return true;
    }
}
