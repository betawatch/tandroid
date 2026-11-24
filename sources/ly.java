// default package

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ly implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ly(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ty tyVar = (ty) obj;
                d S = LaunchActivity.S();
                if (S != null) {
                    if (!l7c.C(j)) {
                        Bundle bundle = new Bundle();
                        if (j > 0) {
                            bundle.putLong("user_id", j);
                            if (j == y6c.h(tyVar.a).e()) {
                                bundle.putBoolean("my_profile", true);
                            }
                        } else {
                            bundle.putLong("chat_id", -j);
                        }
                        bundle.putBoolean("open_gifts", true);
                        S.presentFragment(new ProfileActivity(bundle, null));
                    }
                }
                Runnable runnable = tyVar.i2;
                if (runnable != null) {
                    runnable.run();
                }
                tyVar.dismiss();
                break;
            case 1:
                cj3 cj3Var = (cj3) obj;
                na7 messagesController = cj3Var.getMessagesController();
                long j2 = this.b;
                boolean n2 = messagesController.n2(j2, 0L, null);
                if (n2) {
                    cj3Var.getNotificationsController().T(j2, 4, 0L);
                } else {
                    cj3Var.getNotificationsController().T(j2, 3, 0L);
                }
                u21.A(cj3Var, !n2, null).j();
                cj3Var.finishPreviewFragment();
                break;
            case 2:
                tv4 tv4Var = (tv4) obj;
                d S2 = LaunchActivity.S();
                if (S2 != null) {
                    tv4Var.dismiss();
                    S2.presentFragment(ProfileActivity.P2(j));
                    break;
                }
                break;
            case 3:
                fu5 fu5Var = (fu5) obj;
                fu5Var.dismiss();
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                tL_messages_importChatInvite.hash = fu5Var.m1;
                ConnectionsManager.getInstance(fu5Var.a).sendRequestTyped(tL_messages_importChatInvite, null, new et4((Object) fu5Var, this.b, (Object) tL_messages_importChatInvite, (byte) 1), 2);
                break;
            case 4:
                y28 y28Var = (y28) obj;
                Bundle bundle2 = new Bundle();
                if (j >= 0) {
                    bundle2.putLong("user_id", j);
                } else {
                    bundle2.putLong("chat_id", -j);
                }
                y28Var.z0.L(new ProfileActivity(bundle2, null));
                break;
            default:
                ((b29) obj).f.a(Long.valueOf(j));
                break;
        }
    }
}
