// default package

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class my implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ my(Object obj, long j, byte b) {
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
                uy uyVar = (uy) obj;
                e S = LaunchActivity.S();
                if (S != null) {
                    if (!lbc.C(j)) {
                        Bundle bundle = new Bundle();
                        if (j > 0) {
                            bundle.putLong("user_id", j);
                            if (j == yac.h(uyVar.a).e()) {
                                bundle.putBoolean("my_profile", true);
                            }
                        } else {
                            bundle.putLong("chat_id", -j);
                        }
                        bundle.putBoolean("open_gifts", true);
                        S.presentFragment(new ProfileActivity(bundle, null));
                    }
                }
                Runnable runnable = uyVar.i2;
                if (runnable != null) {
                    runnable.run();
                }
                uyVar.dismiss();
                break;
            case 1:
                uj3 uj3Var = (uj3) obj;
                uc7 messagesController = uj3Var.getMessagesController();
                long j2 = this.b;
                boolean p2 = messagesController.p2(j2, 0L, null);
                if (p2) {
                    uj3Var.getNotificationsController().T(j2, 4, 0L);
                } else {
                    uj3Var.getNotificationsController().T(j2, 3, 0L);
                }
                d31.A(uj3Var, !p2, null).j();
                uj3Var.finishPreviewFragment();
                break;
            case 2:
                yx4 yx4Var = (yx4) obj;
                e S2 = LaunchActivity.S();
                if (S2 != null) {
                    yx4Var.dismiss();
                    S2.presentFragment(ProfileActivity.Q2(j));
                    break;
                }
                break;
            case 3:
                jw5 jw5Var = (jw5) obj;
                jw5Var.dismiss();
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                tL_messages_importChatInvite.hash = jw5Var.m1;
                ConnectionsManager.getInstance(jw5Var.a).sendRequestTyped(tL_messages_importChatInvite, null, new iv4((Object) jw5Var, this.b, (Object) tL_messages_importChatInvite, (byte) 1), 2);
                break;
            case 4:
                o68 o68Var = (o68) obj;
                Bundle bundle2 = new Bundle();
                if (j >= 0) {
                    bundle2.putLong("user_id", j);
                } else {
                    bundle2.putLong("chat_id", -j);
                }
                o68Var.t0.L(new ProfileActivity(bundle2, null));
                break;
            default:
                ((q59) obj).f.a(Long.valueOf(j));
                break;
        }
    }
}
