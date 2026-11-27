// default package

import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kw1 implements mcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ long c;

    public /* synthetic */ kw1(ChatActivityEnterView chatActivityEnterView, long j, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
        this.c = j;
    }

    @Override // mcc
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        long j = this.c;
        switch (b) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i = ChatActivityEnterView.X7;
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.C1((TL_iv.RichMessage) obj);
                if (!chatActivityEnterView.c() || num.intValue() != 0) {
                    chatActivityEnterView.F1(bool.booleanValue(), num.intValue(), num2.intValue(), 0L, true);
                    break;
                } else {
                    jj.J(chatActivityEnterView.D3, j, new hx1(chatActivityEnterView), chatActivityEnterView.K4);
                    break;
                }
                break;
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                int i2 = ChatActivityEnterView.X7;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.F0.setText((CharSequence) obj);
                if (chatActivityEnterView2.O2 == null) {
                    if (!chatActivityEnterView2.c() || num3.intValue() != 0) {
                        chatActivityEnterView2.F1(bool2.booleanValue(), num3.intValue(), num4.intValue(), 0L, true);
                        break;
                    } else {
                        jj.J(chatActivityEnterView2.D3, j, new ex1(chatActivityEnterView2, (byte) 2), chatActivityEnterView2.K4);
                        break;
                    }
                } else {
                    chatActivityEnterView2.w0();
                    break;
                }
                break;
        }
    }
}
