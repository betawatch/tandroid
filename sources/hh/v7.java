package hh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.mc;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class v7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ v7(int i10, Context context, long j10, long j11, org.telegram.ui.ActionBar.e3[] e3VarArr, org.telegram.ui.ActionBar.c6 c6Var) {
        this.b = i10;
        this.e = context;
        this.c = j10;
        this.d = j11;
        this.f = e3VarArr;
        this.h = c6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.f;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.h;
                int i10 = this.b;
                c0 g10 = c0.g(i10);
                long j10 = this.c;
                g10.f(context, j10, this.d, new nh.e3(e3VarArr, context, i10, j10, c6Var, 2));
                break;
            case 1:
                jh.u0 u0Var = (jh.u0) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                u0Var.c(this.b);
                if (!"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                        new mc(u0Var.b, new jh.b()).d0(tL_error, true);
                        break;
                    } else {
                        jh.d1 d1Var = u0Var.L;
                        if (d1Var != null) {
                            d1Var.w();
                            break;
                        }
                    }
                } else {
                    Context context2 = u0Var.getContext();
                    jh.b bVar = new jh.b();
                    long j11 = this.d;
                    long j12 = this.c;
                    new ea(context2, bVar, j12, 17, "", new e5.w(u0Var, j11, tL_textWithEntities, j12, 3), u0Var.I).show();
                    break;
                }
                break;
            case 2:
                ((MessagesController) this.e).lambda$deleteSavedDialog$144(this.c, this.d, (TLRPC.InputPeer) this.f, this.b, (int[]) this.h);
                break;
            default:
                b70 b70Var = (b70) this.e;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.h;
                b70Var.u();
                int i11 = this.b;
                MessagesController messagesController = MessagesController.getInstance(i11);
                long j13 = this.c;
                long j14 = this.d;
                boolean isDialogMuted = messagesController.isDialogMuted(j13, j14);
                NotificationsController.getInstance(i11).muteDialog(j13, j14, !isDialogMuted);
                if (mc.a(n2Var)) {
                    mc.z(n2Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, c6Var2).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ v7(jh.u0 u0Var, int i10, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = u0Var;
        this.b = i10;
        this.f = tL_error;
        this.c = j10;
        this.d = j11;
        this.h = tL_textWithEntities;
    }

    public /* synthetic */ v7(MessagesController messagesController, long j10, long j11, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.e = messagesController;
        this.c = j10;
        this.d = j11;
        this.f = inputPeer;
        this.b = i10;
        this.h = iArr;
    }

    public /* synthetic */ v7(b70 b70Var, int i10, long j10, long j11, rn rnVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.e = b70Var;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.f = rnVar;
        this.h = c6Var;
    }
}
