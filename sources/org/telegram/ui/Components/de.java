package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class de implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 d;

    public /* synthetic */ de(ChatActivityEnterView chatActivityEnterView, long j10, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
        this.c = j10;
        this.d = u6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10 = this.a;
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        long j10 = this.c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i11 = ChatActivityEnterView.r5;
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.O0((TL_iv.RichMessage) obj);
                if (!chatActivityEnterView.c() || num.intValue() != 0) {
                    chatActivityEnterView.R0(num.intValue(), bool.booleanValue(), num2.intValue(), true, 0L);
                    break;
                } else {
                    g5.L(chatActivityEnterView.O2, j10, new qe(chatActivityEnterView, 0), u6Var);
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
                        chatActivityEnterView2.R0(num3.intValue(), bool2.booleanValue(), num4.intValue(), true, 0L);
                        break;
                    } else {
                        g5.L(chatActivityEnterView2.O2, j10, new re(chatActivityEnterView2), u6Var);
                        break;
                    }
                } else {
                    chatActivityEnterView2.a0();
                    break;
                }
                break;
        }
    }
}
