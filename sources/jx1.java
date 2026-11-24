// default package

import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jx1 implements nac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ylb d;

    public /* synthetic */ jx1(ChatActivityEnterView chatActivityEnterView, long j, ylb ylbVar, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
        this.c = j;
        this.d = ylbVar;
    }

    @Override // nac
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        ylb ylbVar = this.d;
        long j = this.c;
        switch (b) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i = ChatActivityEnterView.z7;
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.u1((TL_iv.RichMessage) obj);
                if (!chatActivityEnterView.c() || num.intValue() != 0) {
                    chatActivityEnterView.x1(bool.booleanValue(), num.intValue(), num2.intValue(), 0L, true);
                    break;
                } else {
                    ik.J(chatActivityEnterView.E3, j, new vx1(chatActivityEnterView, (byte) 0), ylbVar);
                    break;
                }
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                int i2 = ChatActivityEnterView.z7;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.F0.setText((CharSequence) obj);
                if (chatActivityEnterView2.P2 == null) {
                    if (!chatActivityEnterView2.c() || num3.intValue() != 0) {
                        chatActivityEnterView2.x1(bool2.booleanValue(), num3.intValue(), num4.intValue(), 0L, true);
                        break;
                    } else {
                        ik.J(chatActivityEnterView2.E3, j, new wx1(chatActivityEnterView2), ylbVar);
                        break;
                    }
                } else {
                    chatActivityEnterView2.t0();
                    break;
                }
                break;
        }
    }
}
