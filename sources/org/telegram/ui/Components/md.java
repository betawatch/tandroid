package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class md implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 d;

    public /* synthetic */ md(ChatActivityEnterView chatActivityEnterView, long j3, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
        this.c = j3;
        this.d = g6Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7 = this.a;
        int i10 = 0;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        long j3 = this.c;
        switch (i7) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i11 = ChatActivityEnterView.s5;
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                if (!chatActivityEnterView.c() || num.intValue() != 0) {
                    chatActivityEnterView.T0(bool.booleanValue(), num.intValue(), num2.intValue(), 0L, true);
                    break;
                } else {
                    v4.J(chatActivityEnterView.O2, j3, new zd(chatActivityEnterView, 0), g6Var);
                    break;
                }
                break;
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.E0.setText((CharSequence) obj);
                if (chatActivityEnterView2.Z1 == null) {
                    if (!chatActivityEnterView2.c() || num3.intValue() != 0) {
                        chatActivityEnterView2.T0(bool2.booleanValue(), num3.intValue(), num4.intValue(), 0L, true);
                        break;
                    } else {
                        v4.J(chatActivityEnterView2.O2, j3, new ae(chatActivityEnterView2, i10), g6Var);
                        break;
                    }
                } else {
                    chatActivityEnterView2.a0();
                    break;
                }
        }
    }
}
