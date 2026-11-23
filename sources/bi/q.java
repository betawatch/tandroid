package bi;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.r70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cx;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    long j3 = this.b;
                    if (!p10.B(j3)) {
                        Bundle bundle = new Bundle();
                        if (j3 > 0) {
                            bundle.putLong("user_id", j3);
                            if (j3 == k10.i(yVar.a).e()) {
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
                n3 n3Var = (n3) this.c;
                n3Var.getClass();
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    n3Var.dismiss();
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
                r70 r70Var = (r70) this.c;
                r70Var.dismiss();
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                tL_messages_importChatInvite.hash = r70Var.n1;
                ConnectionsManager.getInstance(r70Var.a).sendRequestTyped(tL_messages_importChatInvite, null, new e8(r70Var, this.b, tL_messages_importChatInvite), 2);
                break;
            case 4:
                cx cxVar = (cx) this.c;
                np messagesController = cxVar.getMessagesController();
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
                y10 y10Var = ((sh.m) this.c).f;
                if (y10Var != null) {
                    y10Var.a(Long.valueOf(this.b));
                    break;
                }
                break;
        }
    }
}
