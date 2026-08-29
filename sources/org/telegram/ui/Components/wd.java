package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 d;

    public /* synthetic */ wd(ChatActivityEnterView chatActivityEnterView, long j10, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
        this.c = j10;
        this.d = c6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10 = this.a;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        long j10 = this.c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i11 = ChatActivityEnterView.i5;
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                if (!chatActivityEnterView.c() || num.intValue() != 0) {
                    chatActivityEnterView.T0(num.intValue(), bool.booleanValue(), num2.intValue(), true, 0L);
                    break;
                } else {
                    c5.M(chatActivityEnterView.J2, j10, new ke(chatActivityEnterView, 0), c6Var);
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
                        c5.M(chatActivityEnterView2.J2, j10, new le(chatActivityEnterView2), c6Var);
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
