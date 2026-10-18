package hi;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i80;
import r0.h1;
import r0.k1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Utilities.Callback5, r0.n, Utilities.Callback5Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ u(k0 k0Var, int i10) {
        this.a = i10;
        this.b = k0Var;
    }

    @Override // r0.n
    public k1 B0(View view, k1 k1Var) {
        h1 h1Var = k1Var.a;
        i0.b f7 = h1Var.f(527);
        k0 k0Var = this.b;
        k0Var.T = f7;
        k0Var.U = h1Var.f(519);
        k0Var.F.j(AndroidUtilities.dp(56.0f) + k0Var.T.b, k0Var.T.d, false);
        k0Var.H.invalidate();
        return k1.b;
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean canRemoveBotFromCommunity;
        long j10;
        boolean z10;
        boolean z11;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = k0.V;
        Object obj6 = ((f61) obj).G;
        boolean z12 = obj6 instanceof TLRPC.Chat;
        k0 k0Var = this.b;
        boolean z13 = false;
        if (!z12) {
            if (obj6 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj6;
                long j11 = user.id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, k0Var.f);
                j10 = j11;
                z10 = isBot;
                z11 = false;
            }
            return Boolean.valueOf(z13);
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj6;
        long j12 = -chat.id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, k0Var.f);
        j10 = j12;
        z11 = isChannelAndNotMegaGroup;
        z10 = false;
        if (canRemoveBotFromCommunity) {
            i80 F = i80.F(k0Var.container, null, view);
            F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), new l(k0Var, z10, z11, j10, 1), true);
            F.W(k0Var.v.d.V0(view, true));
            F.Z();
            z13 = true;
        }
        return Boolean.valueOf(z13);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.a;
        k0 k0Var = this.b;
        f61 f61Var = (f61) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        switch (i10) {
            case 0:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                k0Var.X(f61Var);
                break;
            case 1:
            default:
                num.intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                int i11 = k0.V;
                k0Var.U(f61Var);
                break;
            case 2:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i12 = k0.V;
                k0Var.X(f61Var);
                break;
            case 3:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                k0.A(k0Var, f61Var, view);
                break;
        }
    }
}
