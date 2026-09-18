package ai;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ p0(int i10, Context context, long j3, long j10, org.telegram.ui.ActionBar.g3[] g3VarArr, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = i10;
        this.e = context;
        this.b = j3;
        this.c = j10;
        this.f = g3VarArr;
        this.h = f6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o1 o1Var = (o1) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                o1Var.c(this.d);
                if (!"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                        new vc(o1Var.b, new d()).d0(tL_error, true);
                        break;
                    } else {
                        d2 d2Var = o1Var.P;
                        if (d2Var != null) {
                            d2Var.w();
                            break;
                        }
                    }
                } else {
                    Context context = o1Var.getContext();
                    d dVar = new d();
                    long j3 = this.c;
                    long j10 = this.b;
                    new yh.n7(context, dVar, j10, 17, "", new a3.g0(o1Var, j3, tL_textWithEntities, j10, 1), o1Var.M).show();
                    break;
                }
                break;
            case 1:
                ((MessagesController) this.e).lambda$deleteSavedDialog$144(this.b, this.c, (TLRPC.InputPeer) this.f, this.d, (int[]) this.h);
                break;
            case 2:
                n70 n70Var = (n70) this.e;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.h;
                n70Var.u();
                int i10 = this.d;
                MessagesController messagesController = MessagesController.getInstance(i10);
                long j11 = this.b;
                long j12 = this.c;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, j12);
                NotificationsController.getInstance(i10).muteDialog(j11, j12, !isDialogMuted);
                if (vc.a(o2Var)) {
                    vc.z(o2Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, f6Var).j();
                    break;
                }
                break;
            default:
                Context context2 = (Context) this.e;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) this.f;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.h;
                int i11 = this.d;
                yh.o g10 = yh.o.g(i11);
                long j13 = this.b;
                g10.f(context2, j13, this.c, new ei.q3(g3VarArr, context2, i11, j13, f6Var2, 2));
                break;
        }
    }

    public /* synthetic */ p0(o1 o1Var, int i10, TLRPC.TL_error tL_error, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = o1Var;
        this.d = i10;
        this.f = tL_error;
        this.b = j3;
        this.c = j10;
        this.h = tL_textWithEntities;
    }

    public /* synthetic */ p0(MessagesController messagesController, long j3, long j10, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.e = messagesController;
        this.b = j3;
        this.c = j10;
        this.f = inputPeer;
        this.d = i10;
        this.h = iArr;
    }

    public /* synthetic */ p0(n70 n70Var, int i10, long j3, long j10, bo boVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = n70Var;
        this.d = i10;
        this.b = j3;
        this.c = j10;
        this.f = boVar;
        this.h = f6Var;
    }
}
