package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 d;

    public /* synthetic */ vd(ChatActivityEnterView chatActivityEnterView, long j3, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
        this.c = j3;
        this.d = i6Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7 = this.a;
        int i10 = 0;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        long j3 = this.c;
        switch (i7) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i11 = ChatActivityEnterView.n7;
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.p1((TL_iv.RichMessage) obj);
                if (!chatActivityEnterView.c() || num.intValue() != 0) {
                    chatActivityEnterView.s1(bool.booleanValue(), num.intValue(), num2.intValue(), 0L, true);
                    break;
                } else {
                    b5.J(chatActivityEnterView.C3, j3, new je(chatActivityEnterView, i10), i6Var);
                    break;
                }
                break;
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.F0.setText((CharSequence) obj);
                if (chatActivityEnterView2.N2 == null) {
                    if (!chatActivityEnterView2.c() || num3.intValue() != 0) {
                        chatActivityEnterView2.s1(bool2.booleanValue(), num3.intValue(), num4.intValue(), 0L, true);
                        break;
                    } else {
                        b5.J(chatActivityEnterView2.C3, j3, new ke(chatActivityEnterView2, 0), i6Var);
                        break;
                    }
                } else {
                    chatActivityEnterView2.q0();
                    break;
                }
        }
    }
}
