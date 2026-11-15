package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;

    public /* synthetic */ ld(ChatActivityEnterView chatActivityEnterView, long j3, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
        this.c = j3;
        this.d = e6Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7 = this.a;
        int i10 = 0;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        long j3 = this.c;
        switch (i7) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i11 = ChatActivityEnterView.N6;
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.h1((TL_iv.RichMessage) obj);
                if (!chatActivityEnterView.c() || num.intValue() != 0) {
                    chatActivityEnterView.k1(bool.booleanValue(), num.intValue(), num2.intValue(), 0L, true);
                    break;
                } else {
                    t4.J(chatActivityEnterView.w3, j3, new ae(chatActivityEnterView, i10), e6Var);
                    break;
                }
                break;
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.F0.setText((CharSequence) obj);
                if (chatActivityEnterView2.H2 == null) {
                    if (!chatActivityEnterView2.c() || num3.intValue() != 0) {
                        chatActivityEnterView2.k1(bool2.booleanValue(), num3.intValue(), num4.intValue(), 0L, true);
                        break;
                    } else {
                        t4.J(chatActivityEnterView2.w3, j3, new be(chatActivityEnterView2, 0), e6Var);
                        break;
                    }
                } else {
                    chatActivityEnterView2.j0();
                    break;
                }
        }
    }
}
