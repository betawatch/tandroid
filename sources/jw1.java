// default package

import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class jw1 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ jw1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.X7;
                chatActivityEnterView.x0((Canvas) obj, false);
                break;
            case 1:
                chatActivityEnterView.C1((TL_iv.RichMessage) obj);
                break;
            default:
                CharSequence charSequence = (CharSequence) obj;
                int i2 = ChatActivityEnterView.X7;
                chatActivityEnterView.F0.setText(charSequence);
                chatActivityEnterView.F0.setSelection(charSequence.length(), charSequence.length());
                break;
        }
    }
}
