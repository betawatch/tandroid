package jh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.tc;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ t7(int i10, Context context, long j10, long j11, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.c6 c6Var) {
        this.b = i10;
        this.e = context;
        this.c = j10;
        this.d = j11;
        this.f = f3VarArr;
        this.h = c6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.h;
                int i10 = this.b;
                b0 g10 = b0.g(i10);
                long j10 = this.c;
                g10.f(context, j10, this.d, new ph.s2(f3VarArr, context, i10, j10, c6Var, 2));
                break;
            case 1:
                lh.u0 u0Var = (lh.u0) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                u0Var.c(this.b);
                if (!"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                        new tc(u0Var.b, new lh.b()).d0(tL_error, true);
                        break;
                    } else {
                        lh.d1 d1Var = u0Var.L;
                        if (d1Var != null) {
                            d1Var.w();
                            break;
                        }
                    }
                } else {
                    Context context2 = u0Var.getContext();
                    lh.b bVar = new lh.b();
                    long j11 = this.d;
                    long j12 = this.c;
                    new y9(context2, bVar, j12, 17, "", new g5.x(u0Var, j11, tL_textWithEntities, j12, 3), u0Var.I).show();
                    break;
                }
                break;
            case 2:
                ((MessagesController) this.e).lambda$deleteSavedDialog$144(this.c, this.d, (TLRPC.InputPeer) this.f, this.b, (int[]) this.h);
                break;
            default:
                j70 j70Var = (j70) this.e;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.h;
                j70Var.u();
                int i11 = this.b;
                MessagesController messagesController = MessagesController.getInstance(i11);
                long j13 = this.c;
                long j14 = this.d;
                boolean isDialogMuted = messagesController.isDialogMuted(j13, j14);
                NotificationsController.getInstance(i11).muteDialog(j13, j14, !isDialogMuted);
                if (tc.a(o2Var)) {
                    tc.z(o2Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, c6Var2).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t7(lh.u0 u0Var, int i10, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = u0Var;
        this.b = i10;
        this.f = tL_error;
        this.c = j10;
        this.d = j11;
        this.h = tL_textWithEntities;
    }

    public /* synthetic */ t7(MessagesController messagesController, long j10, long j11, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.e = messagesController;
        this.c = j10;
        this.d = j11;
        this.f = inputPeer;
        this.b = i10;
        this.h = iArr;
    }

    public /* synthetic */ t7(j70 j70Var, int i10, long j10, long j11, tn tnVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.e = j70Var;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.f = tnVar;
        this.h = c6Var;
    }
}
