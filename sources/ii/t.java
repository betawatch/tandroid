package ii;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.t61;
import r0.h1;
import r0.k1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Utilities.Callback5, r0.n, Utilities.Callback5Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ t(j0 j0Var, int i10) {
        this.a = i10;
        this.b = j0Var;
    }

    @Override // r0.n
    public k1 P0(View view, k1 k1Var) {
        h1 h1Var = k1Var.a;
        i0.b f7 = h1Var.f(527);
        j0 j0Var = this.b;
        j0Var.T = f7;
        j0Var.U = h1Var.f(519);
        j0Var.F.j(AndroidUtilities.dp(56.0f) + j0Var.T.b, j0Var.T.d, false);
        j0Var.H.invalidate();
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
        int i10 = j0.V;
        Object obj6 = ((t61) obj).G;
        boolean z12 = obj6 instanceof TLRPC.Chat;
        j0 j0Var = this.b;
        boolean z13 = false;
        if (!z12) {
            if (obj6 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj6;
                long j11 = user.id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, j0Var.f);
                j10 = j11;
                z10 = isBot;
                z11 = false;
            }
            return Boolean.valueOf(z13);
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj6;
        long j12 = -chat.id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, j0Var.f);
        j10 = j12;
        z11 = isChannelAndNotMegaGroup;
        z10 = false;
        if (canRemoveBotFromCommunity) {
            k80 F = k80.F(j0Var.container, null, view);
            F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), new l(j0Var, z10, z11, j10, 1), true);
            F.W(j0Var.v.d.V0(view, true));
            F.Z();
            z13 = true;
        }
        return Boolean.valueOf(z13);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.a;
        j0 j0Var = this.b;
        t61 t61Var = (t61) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        switch (i10) {
            case 0:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                j0Var.g0(t61Var);
                break;
            case 1:
            default:
                num.intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                int i11 = j0.V;
                j0Var.d0(t61Var);
                break;
            case 2:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i12 = j0.V;
                j0Var.g0(t61Var);
                break;
            case 3:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                j0.C(j0Var, t61Var, view);
                break;
        }
    }
}
