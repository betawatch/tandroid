package di;

import android.os.Bundle;
import android.view.View;
import bi.mc;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.hc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u1(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                j4 j4Var = (j4) this.c;
                j4Var.getClass();
                Bundle bundle = new Bundle();
                long j3 = this.b;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                j4Var.s0.N(new ProfileActivity(bundle, null));
                break;
            case 1:
                c70 c70Var = (c70) this.c;
                c70Var.dismiss();
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                tL_messages_importChatInvite.hash = c70Var.j1;
                ConnectionsManager.getInstance(c70Var.a).sendRequestTyped(tL_messages_importChatInvite, null, new mc(c70Var, this.b, tL_messages_importChatInvite), 2);
                break;
            case 2:
                yw ywVar = (yw) this.c;
                qp messagesController = ywVar.getMessagesController();
                long j10 = this.b;
                boolean r22 = messagesController.r2(j10, 0L, null);
                if (r22) {
                    ywVar.getNotificationsController().T(j10, 4, 0L);
                } else {
                    ywVar.getNotificationsController().T(j10, 3, 0L);
                }
                hc.A(ywVar, !r22, null).j();
                ywVar.finishPreviewFragment();
                break;
            case 3:
                c20 c20Var = ((sh.n) this.c).f;
                if (c20Var != null) {
                    c20Var.a(Long.valueOf(this.b));
                    break;
                }
                break;
            case 4:
                zh.l lVar = (zh.l) this.c;
                lVar.getClass();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    long j11 = this.b;
                    if (!t10.A(j11)) {
                        Bundle bundle2 = new Bundle();
                        if (j11 > 0) {
                            bundle2.putLong("user_id", j11);
                            if (j11 == p10.i(lVar.a).e()) {
                                bundle2.putBoolean("my_profile", true);
                            }
                        } else {
                            bundle2.putLong("chat_id", -j11);
                        }
                        bundle2.putBoolean("open_gifts", true);
                        T.presentFragment(new ProfileActivity(bundle2, null));
                    }
                }
                Runnable runnable = lVar.f2;
                if (runnable != null) {
                    runnable.run();
                }
                lVar.dismiss();
                break;
            default:
                zh.g1 g1Var = (zh.g1) this.c;
                g1Var.getClass();
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    g1Var.dismiss();
                    T2.presentFragment(ProfileActivity.D4(this.b));
                    break;
                }
                break;
        }
    }
}
