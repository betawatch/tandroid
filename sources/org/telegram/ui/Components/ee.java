package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 d;

    public /* synthetic */ ee(ChatActivityEnterView chatActivityEnterView, long j3, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
        this.c = j3;
        this.d = d6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10 = this.a;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        long j3 = this.c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i11 = ChatActivityEnterView.n5;
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                if (!chatActivityEnterView.c() || num.intValue() != 0) {
                    chatActivityEnterView.T0(num.intValue(), bool.booleanValue(), num2.intValue(), true, 0L);
                    break;
                } else {
                    e5.M(chatActivityEnterView.O2, j3, new re(chatActivityEnterView, 0), d6Var);
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
                        chatActivityEnterView2.T0(num3.intValue(), bool2.booleanValue(), num4.intValue(), true, 0L);
                        break;
                    } else {
                        e5.M(chatActivityEnterView2.O2, j3, new se(chatActivityEnterView2), d6Var);
                        break;
                    }
                } else {
                    chatActivityEnterView2.d0();
                    break;
                }
                break;
        }
    }
}
