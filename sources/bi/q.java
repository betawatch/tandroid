package bi;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.p70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cx;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    long j3 = this.b;
                    if (!o10.B(j3)) {
                        Bundle bundle = new Bundle();
                        if (j3 > 0) {
                            bundle.putLong("user_id", j3);
                            if (j3 == j10.i(yVar.a).e()) {
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
                j3 j3Var = (j3) this.c;
                j3Var.getClass();
                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    j3Var.dismiss();
                    T2.presentFragment(ProfileActivity.D4(this.b));
                    break;
                }
                break;
            case 2:
                fi.z3 z3Var = (fi.z3) this.c;
                z3Var.getClass();
                Bundle bundle2 = new Bundle();
                long j10 = this.b;
                if (j10 >= 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                z3Var.t0.N(new ProfileActivity(bundle2, null));
                break;
            case 3:
                p70 p70Var = (p70) this.c;
                p70Var.dismiss();
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                tL_messages_importChatInvite.hash = p70Var.n1;
                ConnectionsManager.getInstance(p70Var.a).sendRequestTyped(tL_messages_importChatInvite, null, new c8(p70Var, this.b, tL_messages_importChatInvite), 2);
                break;
            case 4:
                cx cxVar = (cx) this.c;
                mp messagesController = cxVar.getMessagesController();
                long j11 = this.b;
                boolean u22 = messagesController.u2(j11, 0L, null);
                if (u22) {
                    cxVar.getNotificationsController().T(j11, 4, 0L);
                } else {
                    cxVar.getNotificationsController().T(j11, 3, 0L);
                }
                lc.A(cxVar, !u22, null).j();
                cxVar.finishPreviewFragment();
                break;
            default:
                x10 x10Var = ((sh.n) this.c).f;
                if (x10Var != null) {
                    x10Var.a(Long.valueOf(this.b));
                    break;
                }
                break;
        }
    }
}
