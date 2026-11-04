package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd implements org.telegram.messenger.r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;

    public /* synthetic */ kd(ChatActivityEnterView chatActivityEnterView, long j10, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        this.a = i3;
        this.b = chatActivityEnterView;
        this.c = j10;
        this.d = e6Var;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i3 = this.a;
        int i10 = 0;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        long j10 = this.c;
        switch (i3) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i11 = ChatActivityEnterView.t5;
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.P0((TL_iv.RichMessage) obj);
                if (!chatActivityEnterView.c() || num.intValue() != 0) {
                    chatActivityEnterView.S0(bool.booleanValue(), num.intValue(), num2.intValue(), 0L, true);
                    break;
                } else {
                    t4.L(chatActivityEnterView.P2, j10, new xd(chatActivityEnterView, 0), e6Var);
                    break;
                }
                break;
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.F0.setText((CharSequence) obj);
                if (chatActivityEnterView2.a2 == null) {
                    if (!chatActivityEnterView2.c() || num3.intValue() != 0) {
                        chatActivityEnterView2.S0(bool2.booleanValue(), num3.intValue(), num4.intValue(), 0L, true);
                        break;
                    } else {
                        t4.L(chatActivityEnterView2.P2, j10, new yd(chatActivityEnterView2, i10), e6Var);
                        break;
                    }
                } else {
                    chatActivityEnterView2.a0();
                    break;
                }
        }
    }
}
