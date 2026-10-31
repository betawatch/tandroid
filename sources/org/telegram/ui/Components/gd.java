package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class gd implements org.telegram.messenger.n20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 d;

    public /* synthetic */ gd(ChatActivityEnterView chatActivityEnterView, long j10, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
        this.c = j10;
        this.d = p6Var;
    }

    @Override // org.telegram.messenger.n20
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10 = this.a;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        long j10 = this.c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i11 = ChatActivityEnterView.s5;
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.O0((TL_iv.RichMessage) obj);
                if (!chatActivityEnterView.c() || num.intValue() != 0) {
                    chatActivityEnterView.R0(bool.booleanValue(), num.intValue(), num2.intValue(), 0L, true);
                    break;
                } else {
                    s4.L(chatActivityEnterView.O2, j10, new ud(chatActivityEnterView, 0), p6Var);
                    break;
                }
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.E0.setText((CharSequence) obj);
                if (chatActivityEnterView2.Z1 == null) {
                    if (!chatActivityEnterView2.c() || num3.intValue() != 0) {
                        chatActivityEnterView2.R0(bool2.booleanValue(), num3.intValue(), num4.intValue(), 0L, true);
                        break;
                    } else {
                        s4.L(chatActivityEnterView2.O2, j10, new vd(chatActivityEnterView2), p6Var);
                        break;
                    }
                } else {
                    chatActivityEnterView2.Z();
                    break;
                }
                break;
        }
    }
}
