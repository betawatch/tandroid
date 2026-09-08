package gi;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n70;
import r0.i1;
import r0.l1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Utilities.Callback5, r0.n, Utilities.Callback5Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ u(k0 k0Var, int i10) {
        this.a = i10;
        this.b = k0Var;
    }

    @Override // r0.n
    public l1 T0(View view, l1 l1Var) {
        i1 i1Var = l1Var.a;
        i0.c f7 = i1Var.f(527);
        k0 k0Var = this.b;
        k0Var.T = f7;
        k0Var.U = i1Var.f(519);
        k0Var.F.j(AndroidUtilities.dp(56.0f) + k0Var.T.b, k0Var.T.d, false);
        k0Var.H.invalidate();
        return l1.b;
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean canRemoveBotFromCommunity;
        long j3;
        boolean z10;
        boolean z11;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = k0.V;
        Object obj6 = ((h51) obj).G;
        boolean z12 = obj6 instanceof TLRPC.Chat;
        k0 k0Var = this.b;
        boolean z13 = false;
        if (!z12) {
            if (obj6 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj6;
                long j10 = user.id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, k0Var.f);
                j3 = j10;
                z10 = false;
                z11 = isBot;
            }
            return Boolean.valueOf(z13);
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj6;
        long j11 = -chat.id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, k0Var.f);
        j3 = j11;
        z11 = false;
        z10 = isChannelAndNotMegaGroup;
        if (canRemoveBotFromCommunity) {
            n70 F = n70.F(k0Var.container, null, view);
            F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), new l(k0Var, z11, z10, j3, 1), true);
            F.W(k0Var.v.d.U0(view, true));
            F.Z();
            z13 = true;
        }
        return Boolean.valueOf(z13);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.a;
        k0 k0Var = this.b;
        h51 h51Var = (h51) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        switch (i10) {
            case 0:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                k0Var.W(h51Var);
                break;
            case 1:
            default:
                num.intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                int i11 = k0.V;
                k0Var.T(h51Var);
                break;
            case 2:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i12 = k0.V;
                k0Var.W(h51Var);
                break;
            case 3:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                k0.y(k0Var, h51Var, view);
                break;
        }
    }
}
