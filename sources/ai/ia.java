package ai;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i80;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class ia implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ ia(int i10, Context context, long j10, long j11, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.d6 d6Var) {
        this.b = i10;
        this.e = context;
        this.c = j10;
        this.d = j11;
        this.f = f3VarArr;
        this.h = d6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.h;
                int i10 = this.b;
                k0 g10 = k0.g(i10);
                long j10 = this.c;
                g10.f(context, j10, this.d, new gi.g3(f3VarArr, context, i10, j10, d6Var, 2));
                break;
            case 1:
                ci.x0 x0Var = (ci.x0) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                x0Var.c(this.b);
                if (!"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                        new org.telegram.ui.Components.xc(x0Var.b, new ci.b()).f0(tL_error, true);
                        break;
                    } else {
                        ci.h1 h1Var = x0Var.P;
                        if (h1Var != null) {
                            h1Var.w();
                            break;
                        }
                    }
                } else {
                    Context context2 = x0Var.getContext();
                    ci.b bVar = new ci.b();
                    long j11 = this.d;
                    long j12 = this.c;
                    new cd(context2, bVar, j12, 17, "", new a3.h0(x0Var, j11, tL_textWithEntities, j12, 2), x0Var.M).show();
                    break;
                }
                break;
            case 2:
                ((MessagesController) this.e).lambda$deleteSavedDialog$143(this.c, this.d, (TLRPC.InputPeer) this.f, this.b, (int[]) this.h);
                break;
            default:
                i80 i80Var = (i80) this.e;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.h;
                i80Var.u();
                int i11 = this.b;
                MessagesController messagesController = MessagesController.getInstance(i11);
                long j13 = this.c;
                long j14 = this.d;
                boolean isDialogMuted = messagesController.isDialogMuted(j13, j14);
                NotificationsController.getInstance(i11).muteDialog(j13, j14, !isDialogMuted);
                if (org.telegram.ui.Components.xc.a(n2Var)) {
                    org.telegram.ui.Components.xc.z(n2Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, d6Var2).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ia(ci.x0 x0Var, int i10, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = x0Var;
        this.b = i10;
        this.f = tL_error;
        this.c = j10;
        this.d = j11;
        this.h = tL_textWithEntities;
    }

    public /* synthetic */ ia(MessagesController messagesController, long j10, long j11, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.e = messagesController;
        this.c = j10;
        this.d = j11;
        this.f = inputPeer;
        this.b = i10;
        this.h = iArr;
    }

    public /* synthetic */ ia(i80 i80Var, int i10, long j10, long j11, qn qnVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = i80Var;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.f = qnVar;
        this.h = d6Var;
    }
}
