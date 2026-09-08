package bi;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.yc;
import org.telegram.ui.co;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ i0(int i10, Context context, long j3, long j10, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = i10;
        this.e = context;
        this.b = j3;
        this.c = j10;
        this.f = f3VarArr;
        this.h = f6Var;
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
                        new yc(g1Var.b, new b()).d0(tL_error, true);
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
                    long j3 = this.c;
                    long j10 = this.b;
                    new zh.k7(context, bVar, j10, 17, "", new a3.g0(g1Var, j3, tL_textWithEntities, j10, 1), g1Var.M).show();
                    break;
                }
                break;
            case 1:
                ((MessagesController) this.e).lambda$deleteSavedDialog$144(this.b, this.c, (TLRPC.InputPeer) this.f, this.d, (int[]) this.h);
                break;
            case 2:
                n70 n70Var = (n70) this.e;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.h;
                n70Var.u();
                int i10 = this.d;
                MessagesController messagesController = MessagesController.getInstance(i10);
                long j11 = this.b;
                long j12 = this.c;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, j12);
                NotificationsController.getInstance(i10).muteDialog(j11, j12, !isDialogMuted);
                if (yc.a(n2Var)) {
                    yc.z(n2Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, f6Var).j();
                    break;
                }
                break;
            default:
                Context context2 = (Context) this.e;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.h;
                int i11 = this.d;
                zh.o g10 = zh.o.g(i11);
                long j13 = this.b;
                g10.f(context2, j13, this.c, new fi.q3(f3VarArr, context2, i11, j13, f6Var2, 2));
                break;
        }
    }

    public /* synthetic */ i0(g1 g1Var, int i10, TLRPC.TL_error tL_error, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = g1Var;
        this.d = i10;
        this.f = tL_error;
        this.b = j3;
        this.c = j10;
        this.h = tL_textWithEntities;
    }

    public /* synthetic */ i0(MessagesController messagesController, long j3, long j10, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.e = messagesController;
        this.b = j3;
        this.c = j10;
        this.f = inputPeer;
        this.d = i10;
        this.h = iArr;
    }

    public /* synthetic */ i0(n70 n70Var, int i10, long j3, long j10, co coVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = n70Var;
        this.d = i10;
        this.b = j3;
        this.c = j10;
        this.f = coVar;
        this.h = f6Var;
    }
}
