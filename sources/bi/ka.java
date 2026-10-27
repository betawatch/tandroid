package bi;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l80;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ka implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ ka(int i10, Context context, long j10, long j11, org.telegram.ui.ActionBar.k3[] k3VarArr, org.telegram.ui.ActionBar.u6 u6Var) {
        this.b = i10;
        this.e = context;
        this.c = j10;
        this.d = j11;
        this.f = k3VarArr;
        this.h = u6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) this.f;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.h;
                int i10 = this.b;
                m0 g7 = m0.g(i10);
                long j10 = this.c;
                g7.f(context, j10, this.d, new hi.p3(k3VarArr, context, i10, j10, u6Var, 2));
                break;
            case 1:
                di.x0 x0Var = (di.x0) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                x0Var.c(this.b);
                if (!"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                        new org.telegram.ui.Components.wc(x0Var.b, new di.b()).g0(tL_error, true);
                        break;
                    } else {
                        di.h1 h1Var = x0Var.P;
                        if (h1Var != null) {
                            h1Var.w();
                            break;
                        }
                    }
                } else {
                    Context context2 = x0Var.getContext();
                    di.b bVar = new di.b();
                    long j11 = this.d;
                    long j12 = this.c;
                    new tc(context2, bVar, j12, 17, "", new a3.h0(x0Var, j11, tL_textWithEntities, j12, 2), x0Var.M).show();
                    break;
                }
                break;
            case 2:
                ((MessagesController) this.e).lambda$deleteSavedDialog$143(this.c, this.d, (TLRPC.InputPeer) this.f, this.b, (int[]) this.h);
                break;
            case 3:
                ((MessagesStorage) this.e).lambda$updateMessageWidgetData$107(this.b, this.c, (String) this.f, this.d, (String) this.h);
                break;
            default:
                l80 l80Var = (l80) this.e;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f;
                org.telegram.ui.ActionBar.u6 u6Var2 = (org.telegram.ui.ActionBar.u6) this.h;
                l80Var.u();
                int i11 = this.b;
                MessagesController messagesController = MessagesController.getInstance(i11);
                long j13 = this.c;
                long j14 = this.d;
                boolean isDialogMuted = messagesController.isDialogMuted(j13, j14);
                NotificationsController.getInstance(i11).muteDialog(j13, j14, !isDialogMuted);
                if (org.telegram.ui.Components.wc.a(r2Var)) {
                    org.telegram.ui.Components.wc.z(r2Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, u6Var2).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ka(di.x0 x0Var, int i10, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = x0Var;
        this.b = i10;
        this.f = tL_error;
        this.c = j10;
        this.d = j11;
        this.h = tL_textWithEntities;
    }

    public /* synthetic */ ka(MessagesController messagesController, long j10, long j11, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.e = messagesController;
        this.c = j10;
        this.d = j11;
        this.f = inputPeer;
        this.b = i10;
        this.h = iArr;
    }

    public /* synthetic */ ka(MessagesStorage messagesStorage, int i10, long j10, String str, long j11, String str2) {
        this.e = messagesStorage;
        this.b = i10;
        this.c = j10;
        this.f = str;
        this.d = j11;
        this.h = str2;
    }

    public /* synthetic */ ka(l80 l80Var, int i10, long j10, long j11, wn wnVar, org.telegram.ui.ActionBar.u6 u6Var) {
        this.e = l80Var;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.f = wnVar;
        this.h = u6Var;
    }
}
