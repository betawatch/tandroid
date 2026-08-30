package lh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ u7(int i10, Context context, long j10, long j11, org.telegram.ui.ActionBar.g3[] g3VarArr, org.telegram.ui.ActionBar.f6 f6Var) {
        this.b = i10;
        this.e = context;
        this.c = j10;
        this.d = j11;
        this.f = g3VarArr;
        this.h = f6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) this.f;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.h;
                int i10 = this.b;
                b0 g10 = b0.g(i10);
                long j10 = this.c;
                g10.f(context, j10, this.d, new rh.t2(g3VarArr, context, i10, j10, f6Var, 2));
                break;
            case 1:
                nh.v0 v0Var = (nh.v0) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                v0Var.c(this.b);
                if (!"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                        new qc(v0Var.b, new nh.b()).d0(tL_error, true);
                        break;
                    } else {
                        nh.e1 e1Var = v0Var.M;
                        if (e1Var != null) {
                            e1Var.w();
                            break;
                        }
                    }
                } else {
                    Context context2 = v0Var.getContext();
                    nh.b bVar = new nh.b();
                    long j11 = this.d;
                    long j12 = this.c;
                    new z9(context2, bVar, j12, 17, "", new i5.x(v0Var, j11, tL_textWithEntities, j12, 3), v0Var.J).show();
                    break;
                }
                break;
            case 2:
                ((MessagesController) this.e).lambda$deleteSavedDialog$144(this.c, this.d, (TLRPC.InputPeer) this.f, this.b, (int[]) this.h);
                break;
            default:
                o70 o70Var = (o70) this.e;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.h;
                o70Var.u();
                int i11 = this.b;
                MessagesController messagesController = MessagesController.getInstance(i11);
                long j13 = this.c;
                long j14 = this.d;
                boolean isDialogMuted = messagesController.isDialogMuted(j13, j14);
                NotificationsController.getInstance(i11).muteDialog(j13, j14, !isDialogMuted);
                if (qc.a(p2Var)) {
                    qc.z(p2Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, f6Var2).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u7(nh.v0 v0Var, int i10, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = v0Var;
        this.b = i10;
        this.f = tL_error;
        this.c = j10;
        this.d = j11;
        this.h = tL_textWithEntities;
    }

    public /* synthetic */ u7(MessagesController messagesController, long j10, long j11, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.e = messagesController;
        this.c = j10;
        this.d = j11;
        this.f = inputPeer;
        this.b = i10;
        this.h = iArr;
    }

    public /* synthetic */ u7(o70 o70Var, int i10, long j10, long j11, xn xnVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = o70Var;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.f = xnVar;
        this.h = f6Var;
    }
}
