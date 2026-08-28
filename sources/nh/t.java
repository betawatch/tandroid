package nh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.x60;
import r0.j1;
import r0.m1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Utilities.Callback5, r0.o, Utilities.Callback5Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ t(j0 j0Var, int i9) {
        this.a = i9;
        this.b = j0Var;
    }

    @Override // r0.o
    public m1 L0(View view, m1 m1Var) {
        j1 j1Var = m1Var.a;
        i0.b f10 = j1Var.f(527);
        j0 j0Var = this.b;
        j0Var.P = f10;
        j0Var.Q = j1Var.f(519);
        j0Var.B.j(AndroidUtilities.dp(56.0f) + j0Var.P.b, j0Var.P.d, false);
        j0Var.D.invalidate();
        return m1.b;
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
        int i9 = j0.R;
        Object obj6 = ((l41) obj).G;
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
                z10 = false;
                z11 = isBot;
            }
            return Boolean.valueOf(z13);
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj6;
        long j12 = -chat.id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, j0Var.f);
        j10 = j12;
        z11 = false;
        z10 = isChannelAndNotMegaGroup;
        if (canRemoveBotFromCommunity) {
            x60 F = x60.F(j0Var.container, null, view);
            F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), new l(j0Var, z11, z10, j10, 1), true);
            F.W(j0Var.v.d.V0(view, true));
            F.Z();
            z13 = true;
        }
        return Boolean.valueOf(z13);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i9 = this.a;
        j0 j0Var = this.b;
        l41 l41Var = (l41) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        switch (i9) {
            case 0:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                j0Var.V(l41Var);
                break;
            case 1:
            default:
                num.intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                int i10 = j0.R;
                j0Var.S(l41Var);
                break;
            case 2:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i11 = j0.R;
                j0Var.V(l41Var);
                break;
            case 3:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                j0.y(j0Var, l41Var, view);
                break;
        }
    }
}
