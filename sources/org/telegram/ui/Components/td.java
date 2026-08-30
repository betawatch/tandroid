package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class td implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;

    public /* synthetic */ td(ChatActivityEnterView chatActivityEnterView, long j10, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
        this.c = j10;
        this.d = f6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10 = this.a;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        long j10 = this.c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i11 = ChatActivityEnterView.j5;
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                if (!chatActivityEnterView.c() || num.intValue() != 0) {
                    chatActivityEnterView.T0(num.intValue(), bool.booleanValue(), num2.intValue(), true, 0L);
                    break;
                } else {
                    z4.M(chatActivityEnterView.K2, j10, new he(chatActivityEnterView, 0), f6Var);
                    break;
                }
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.B0.setText((CharSequence) obj);
                if (chatActivityEnterView2.V1 == null) {
                    if (!chatActivityEnterView2.c() || num3.intValue() != 0) {
                        chatActivityEnterView2.T0(num3.intValue(), bool2.booleanValue(), num4.intValue(), true, 0L);
                        break;
                    } else {
                        z4.M(chatActivityEnterView2.K2, j10, new ie(chatActivityEnterView2), f6Var);
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
