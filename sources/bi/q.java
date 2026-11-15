package bi;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.e70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                y yVar = (y) this.c;
                yVar.getClass();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    long j3 = this.b;
                    if (!q10.A(j3)) {
                        Bundle bundle = new Bundle();
                        if (j3 > 0) {
                            bundle.putLong("user_id", j3);
                            if (j3 == m10.i(yVar.a).e()) {
                                bundle.putBoolean("my_profile", true);
                            }
                        } else {
                            bundle.putLong("chat_id", -j3);
                        }
                        bundle.putBoolean("open_gifts", true);
                        T.presentFragment(new ProfileActivity(bundle, null));
                    }
                }
                Runnable runnable = yVar.j2;
                if (runnable != null) {
                    runnable.run();
                }
                yVar.dismiss();
                break;
            case 1:
                s2 s2Var = (s2) this.c;
                s2Var.getClass();
                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    s2Var.dismiss();
                    T2.presentFragment(ProfileActivity.C4(this.b));
                    break;
                }
                break;
            case 2:
                fi.b4 b4Var = (fi.b4) this.c;
                b4Var.getClass();
                Bundle bundle2 = new Bundle();
                long j10 = this.b;
                if (j10 >= 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                b4Var.t0.N(new ProfileActivity(bundle2, null));
                break;
            case 3:
                e70 e70Var = (e70) this.c;
                e70Var.dismiss();
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                tL_messages_importChatInvite.hash = e70Var.n1;
                ConnectionsManager.getInstance(e70Var.a).sendRequestTyped(tL_messages_importChatInvite, null, new v5(e70Var, this.b, tL_messages_importChatInvite), 2);
                break;
            case 4:
                yw ywVar = (yw) this.c;
                np messagesController = ywVar.getMessagesController();
                long j11 = this.b;
                boolean r22 = messagesController.r2(j11, 0L, null);
                if (r22) {
                    ywVar.getNotificationsController().T(j11, 4, 0L);
                } else {
                    ywVar.getNotificationsController().T(j11, 3, 0L);
                }
                cc.A(ywVar, !r22, null).j();
                ywVar.finishPreviewFragment();
                break;
            default:
                z10 z10Var = ((sh.m) this.c).f;
                if (z10Var != null) {
                    z10Var.a(Long.valueOf(this.b));
                    break;
                }
                break;
        }
    }
}
