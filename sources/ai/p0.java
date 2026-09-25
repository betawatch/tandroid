package ai;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y70;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ p0(int i10, Context context, long j3, long j10, org.telegram.ui.ActionBar.e3[] e3VarArr, org.telegram.ui.ActionBar.d6 d6Var) {
        this.d = i10;
        this.e = context;
        this.b = j3;
        this.c = j10;
        this.f = e3VarArr;
        this.h = d6Var;
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
                        new xc(o1Var.b, new d()).d0(tL_error, true);
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
                    new yh.l7(context, dVar, j10, 17, "", new a3.g0(o1Var, j3, tL_textWithEntities, j10, 1), o1Var.M).show();
                    break;
                }
                break;
            case 1:
                ((MessagesController) this.e).lambda$deleteSavedDialog$144(this.b, this.c, (TLRPC.InputPeer) this.f, this.d, (int[]) this.h);
                break;
            case 2:
                y70 y70Var = (y70) this.e;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.h;
                y70Var.u();
                int i10 = this.d;
                MessagesController messagesController = MessagesController.getInstance(i10);
                long j11 = this.b;
                long j12 = this.c;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, j12);
                NotificationsController.getInstance(i10).muteDialog(j11, j12, !isDialogMuted);
                if (xc.a(m2Var)) {
                    xc.z(m2Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, d6Var).j();
                    break;
                }
                break;
            default:
                Context context2 = (Context) this.e;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.f;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.h;
                int i11 = this.d;
                yh.o g10 = yh.o.g(i11);
                long j13 = this.b;
                g10.f(context2, j13, this.c, new ei.q3(e3VarArr, context2, i11, j13, d6Var2, 2));
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

    public /* synthetic */ p0(y70 y70Var, int i10, long j3, long j10, wn wnVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = y70Var;
        this.d = i10;
        this.b = j3;
        this.c = j10;
        this.f = wnVar;
        this.h = d6Var;
    }
}
