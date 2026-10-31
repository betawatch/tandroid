package ih;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.u70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ay;
import ph.l1;
import th.z2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                q20 q20Var = ((q) this.c).f;
                if (q20Var != null) {
                    q20Var.a(Long.valueOf(this.b));
                    break;
                }
                break;
            case 1:
                u70 u70Var = (u70) this.c;
                u70Var.dismiss();
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                tL_messages_importChatInvite.hash = u70Var.j1;
                ConnectionsManager.getInstance(u70Var.a).sendRequestTyped(tL_messages_importChatInvite, null, new q70(u70Var, this.b, tL_messages_importChatInvite), 2);
                break;
            case 2:
                ay ayVar = (ay) this.c;
                vp messagesController = ayVar.getMessagesController();
                long j10 = this.b;
                boolean q22 = messagesController.q2(j10, 0L, null);
                if (q22) {
                    ayVar.getNotificationsController().T(j10, 4, 0L);
                } else {
                    ayVar.getNotificationsController().T(j10, 3, 0L);
                }
                cc.A(ayVar, !q22, null).j();
                ayVar.finishPreviewFragment();
                break;
            case 3:
                ph.m mVar = (ph.m) this.c;
                mVar.getClass();
                k2 T = LaunchActivity.T();
                if (T != null) {
                    long j11 = this.b;
                    if (!h20.A(j11)) {
                        Bundle bundle = new Bundle();
                        if (j11 > 0) {
                            bundle.putLong("user_id", j11);
                            if (j11 == d20.i(mVar.a).e()) {
                                bundle.putBoolean("my_profile", true);
                            }
                        } else {
                            bundle.putLong("chat_id", -j11);
                        }
                        bundle.putBoolean("open_gifts", true);
                        T.presentFragment(new ProfileActivity(bundle, null));
                    }
                }
                Runnable runnable = mVar.f2;
                if (runnable != null) {
                    runnable.run();
                }
                mVar.dismiss();
                break;
            case 4:
                l1 l1Var = (l1) this.c;
                l1Var.getClass();
                k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    l1Var.dismiss();
                    T2.presentFragment(ProfileActivity.z4(this.b));
                    break;
                }
                break;
            default:
                z2 z2Var = (z2) this.c;
                z2Var.getClass();
                Bundle bundle2 = new Bundle();
                long j12 = this.b;
                if (j12 >= 0) {
                    bundle2.putLong("user_id", j12);
                } else {
                    bundle2.putLong("chat_id", -j12);
                }
                z2Var.s0.V(new ProfileActivity(bundle2, null));
                break;
        }
    }
}
