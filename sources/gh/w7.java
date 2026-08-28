package gh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.x60;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class w7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ w7(int i9, Context context, long j10, long j11, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.b6 b6Var) {
        this.b = i9;
        this.e = context;
        this.c = j10;
        this.d = j11;
        this.f = f3VarArr;
        this.h = b6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.h;
                int i9 = this.b;
                c0 g10 = c0.g(i9);
                long j10 = this.c;
                g10.f(context, j10, this.d, new mh.f3(f3VarArr, context, i9, j10, b6Var, 2));
                break;
            case 1:
                ih.w0 w0Var = (ih.w0) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                w0Var.c(this.b);
                if (!"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                        new oc(w0Var.b, new ih.b()).d0(tL_error, true);
                        break;
                    } else {
                        ih.f1 f1Var = w0Var.L;
                        if (f1Var != null) {
                            f1Var.w();
                            break;
                        }
                    }
                } else {
                    Context context2 = w0Var.getContext();
                    ih.b bVar = new ih.b();
                    long j11 = this.d;
                    long j12 = this.c;
                    new ea(context2, bVar, j12, 17, "", new e5.y(w0Var, j11, tL_textWithEntities, j12, 2), w0Var.I).show();
                    break;
                }
                break;
            case 2:
                ((MessagesController) this.e).lambda$deleteSavedDialog$144(this.c, this.d, (TLRPC.InputPeer) this.f, this.b, (int[]) this.h);
                break;
            default:
                x60 x60Var = (x60) this.e;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f;
                org.telegram.ui.ActionBar.b6 b6Var2 = (org.telegram.ui.ActionBar.b6) this.h;
                x60Var.u();
                int i10 = this.b;
                MessagesController messagesController = MessagesController.getInstance(i10);
                long j13 = this.c;
                long j14 = this.d;
                boolean isDialogMuted = messagesController.isDialogMuted(j13, j14);
                NotificationsController.getInstance(i10).muteDialog(j13, j14, !isDialogMuted);
                if (oc.a(o2Var)) {
                    oc.z(o2Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, b6Var2).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ w7(ih.w0 w0Var, int i9, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = w0Var;
        this.b = i9;
        this.f = tL_error;
        this.c = j10;
        this.d = j11;
        this.h = tL_textWithEntities;
    }

    public /* synthetic */ w7(MessagesController messagesController, long j10, long j11, TLRPC.InputPeer inputPeer, int i9, int[] iArr) {
        this.e = messagesController;
        this.c = j10;
        this.d = j11;
        this.f = inputPeer;
        this.b = i9;
        this.h = iArr;
    }

    public /* synthetic */ w7(x60 x60Var, int i9, long j10, long j11, qn qnVar, org.telegram.ui.ActionBar.b6 b6Var) {
        this.e = x60Var;
        this.b = i9;
        this.c = j10;
        this.d = j11;
        this.f = qnVar;
        this.h = b6Var;
    }
}
