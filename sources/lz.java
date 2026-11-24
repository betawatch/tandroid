// default package

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lz implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lz(Object obj, long j, byte b) {
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
                tz tzVar = (tz) obj;
                d S = LaunchActivity.S();
                if (S != null) {
                    if (!m9c.C(j)) {
                        Bundle bundle = new Bundle();
                        if (j > 0) {
                            bundle.putLong("user_id", j);
                            if (j == z8c.h(tzVar.a).e()) {
                                bundle.putBoolean("my_profile", true);
                            }
                        } else {
                            bundle.putLong("chat_id", -j);
                        }
                        bundle.putBoolean("open_gifts", true);
                        S.presentFragment(new ProfileActivity(bundle, null));
                    }
                }
                Runnable runnable = tzVar.i2;
                if (runnable != null) {
                    runnable.run();
                }
                tzVar.dismiss();
                break;
            case 1:
                nk3 nk3Var = (nk3) obj;
                oc7 messagesController = nk3Var.getMessagesController();
                long j2 = this.b;
                boolean o2 = messagesController.o2(j2, 0L, null);
                if (o2) {
                    nk3Var.getNotificationsController().T(j2, 4, 0L);
                } else {
                    nk3Var.getNotificationsController().T(j2, 3, 0L);
                }
                c41.A(nk3Var, !o2, null).j();
                nk3Var.finishPreviewFragment();
                break;
            case 2:
                ux4 ux4Var = (ux4) obj;
                d S2 = LaunchActivity.S();
                if (S2 != null) {
                    ux4Var.dismiss();
                    S2.presentFragment(ProfileActivity.S2(j));
                    break;
                }
                break;
            case 3:
                ew5 ew5Var = (ew5) obj;
                ew5Var.dismiss();
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                tL_messages_importChatInvite.hash = ew5Var.m1;
                ConnectionsManager.getInstance(ew5Var.a).sendRequestTyped(tL_messages_importChatInvite, null, new fv4((Object) ew5Var, this.b, (Object) tL_messages_importChatInvite, (byte) 1), 2);
                break;
            case 4:
                a58 a58Var = (a58) obj;
                Bundle bundle2 = new Bundle();
                if (j >= 0) {
                    bundle2.putLong("user_id", j);
                } else {
                    bundle2.putLong("chat_id", -j);
                }
                a58Var.z0.L(new ProfileActivity(bundle2, null));
                break;
            default:
                ((f49) obj).f.a(Long.valueOf(j));
                break;
        }
    }
}
