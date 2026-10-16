package bi;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ i0(int i10, Context context, long j10, long j11, org.telegram.ui.ActionBar.e3[] e3VarArr, org.telegram.ui.ActionBar.c6 c6Var) {
        this.d = i10;
        this.e = context;
        this.b = j10;
        this.c = j11;
        this.f = e3VarArr;
        this.h = c6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g1 g1Var = (g1) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                g1Var.c(this.d);
                if (!"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                        new zc(g1Var.b, new b()).f0(tL_error, true);
                        break;
                    } else {
                        t1 t1Var = g1Var.P;
                        if (t1Var != null) {
                            t1Var.w();
                            break;
                        }
                    }
                } else {
                    Context context = g1Var.getContext();
                    b bVar = new b();
                    long j10 = this.c;
                    long j11 = this.b;
                    new zh.e7(context, bVar, j11, 17, "", new a3.h0(g1Var, j10, tL_textWithEntities, j11, 1), g1Var.M).show();
                    break;
                }
                break;
            case 1:
                ((MessagesController) this.e).lambda$deleteSavedDialog$143(this.b, this.c, (TLRPC.InputPeer) this.f, this.d, (int[]) this.h);
                break;
            case 2:
                l80 l80Var = (l80) this.e;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.h;
                l80Var.u();
                int i10 = this.d;
                MessagesController messagesController = MessagesController.getInstance(i10);
                long j12 = this.b;
                long j13 = this.c;
                boolean isDialogMuted = messagesController.isDialogMuted(j12, j13);
                NotificationsController.getInstance(i10).muteDialog(j12, j13, !isDialogMuted);
                if (zc.a(m2Var)) {
                    zc.z(m2Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, c6Var).j();
                    break;
                }
                break;
            default:
                Context context2 = (Context) this.e;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.f;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.h;
                int i11 = this.d;
                zh.p g10 = zh.p.g(i11);
                long j14 = this.b;
                g10.f(context2, j14, this.c, new fi.r3(e3VarArr, context2, i11, j14, c6Var2, 2));
                break;
        }
    }

    public /* synthetic */ i0(g1 g1Var, int i10, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = g1Var;
        this.d = i10;
        this.f = tL_error;
        this.b = j10;
        this.c = j11;
        this.h = tL_textWithEntities;
    }

    public /* synthetic */ i0(MessagesController messagesController, long j10, long j11, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.e = messagesController;
        this.b = j10;
        this.c = j11;
        this.f = inputPeer;
        this.d = i10;
        this.h = iArr;
    }

    public /* synthetic */ i0(l80 l80Var, int i10, long j10, long j11, fo foVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.e = l80Var;
        this.d = i10;
        this.b = j10;
        this.c = j11;
        this.f = foVar;
        this.h = c6Var;
    }
}
