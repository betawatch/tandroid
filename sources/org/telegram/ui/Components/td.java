package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class td implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 d;

    public /* synthetic */ td(ChatActivityEnterView chatActivityEnterView, long j10, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        this.a = i9;
        this.b = chatActivityEnterView;
        this.c = j10;
        this.d = b6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        int i9 = this.a;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        long j10 = this.c;
        switch (i9) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i10 = ChatActivityEnterView.i5;
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                if (!chatActivityEnterView.c() || num.intValue() != 0) {
                    chatActivityEnterView.T0(num.intValue(), bool.booleanValue(), num2.intValue(), true, 0L);
                    break;
                } else {
                    y4.M(chatActivityEnterView.J2, j10, new he(chatActivityEnterView, 0), b6Var);
                    break;
                }
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.A0.setText((CharSequence) obj);
                if (chatActivityEnterView2.U1 == null) {
                    if (!chatActivityEnterView2.c() || num3.intValue() != 0) {
                        chatActivityEnterView2.T0(num3.intValue(), bool2.booleanValue(), num4.intValue(), true, 0L);
                        break;
                    } else {
                        y4.M(chatActivityEnterView2.J2, j10, new ie(chatActivityEnterView2), b6Var);
                        break;
                    }
                } else {
                    chatActivityEnterView2.c0();
                    break;
                }
                break;
        }
    }
}
