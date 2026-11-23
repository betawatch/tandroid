package bi;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.o70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bx;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                    if (!n10.B(j3)) {
                        Bundle bundle = new Bundle();
                        if (j3 > 0) {
                            bundle.putLong("user_id", j3);
                            if (j3 == i10.i(yVar.a).e()) {
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
                p3 p3Var = (p3) this.c;
                p3Var.getClass();
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    p3Var.dismiss();
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
                o70 o70Var = (o70) this.c;
                o70Var.dismiss();
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                tL_messages_importChatInvite.hash = o70Var.n1;
                ConnectionsManager.getInstance(o70Var.a).sendRequestTyped(tL_messages_importChatInvite, null, new h8(o70Var, this.b, tL_messages_importChatInvite), 2);
                break;
            case 4:
                bx bxVar = (bx) this.c;
                mp messagesController = bxVar.getMessagesController();
                long j11 = this.b;
                boolean u22 = messagesController.u2(j11, 0L, null);
                if (u22) {
                    bxVar.getNotificationsController().T(j11, 4, 0L);
                } else {
                    bxVar.getNotificationsController().T(j11, 3, 0L);
                }
                kc.A(bxVar, !u22, null).j();
                bxVar.finishPreviewFragment();
                break;
            default:
                w10 w10Var = ((sh.m) this.c).f;
                if (w10Var != null) {
                    w10Var.a(Long.valueOf(this.b));
                    break;
                }
                break;
        }
    }
}
