package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w70;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class uc implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ uc(int i10, Context context, long j3, long j10, org.telegram.ui.ActionBar.h3[] h3VarArr, org.telegram.ui.ActionBar.f6 f6Var) {
        this.b = i10;
        this.e = context;
        this.c = j3;
        this.d = j10;
        this.f = h3VarArr;
        this.h = f6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesController) this.e).lambda$deleteSavedDialog$144(this.c, this.d, (TLRPC.InputPeer) this.f, this.b, (int[]) this.h);
                break;
            case 1:
                w70 w70Var = (w70) this.e;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.h;
                w70Var.u();
                int i10 = this.b;
                MessagesController messagesController = MessagesController.getInstance(i10);
                long j3 = this.c;
                long j10 = this.d;
                boolean isDialogMuted = messagesController.isDialogMuted(j3, j10);
                NotificationsController.getInstance(i10).muteDialog(j3, j10, !isDialogMuted);
                if (org.telegram.ui.Components.wc.a(p2Var)) {
                    org.telegram.ui.Components.wc.z(p2Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, f6Var).j();
                    break;
                }
                break;
            case 2:
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.f;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.h;
                int i11 = this.b;
                xh.p g10 = xh.p.g(i11);
                long j11 = this.c;
                g10.f(context, j11, this.d, new di.t3(h3VarArr, context, i11, j11, f6Var2, 2));
                break;
            default:
                zh.m0 m0Var = (zh.m0) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                m0Var.c(this.b);
                if (!"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                        new org.telegram.ui.Components.wc(m0Var.b, new zh.b()).d0(tL_error, true);
                        break;
                    } else {
                        zh.t0 t0Var = m0Var.P;
                        if (t0Var != null) {
                            t0Var.w();
                            break;
                        }
                    }
                } else {
                    Context context2 = m0Var.getContext();
                    zh.b bVar = new zh.b();
                    long j12 = this.d;
                    long j13 = this.c;
                    new xh.o7(context2, bVar, j13, 17, "", new a3.g0(m0Var, j12, tL_textWithEntities, j13, 14), m0Var.M).show();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ uc(MessagesController messagesController, long j3, long j10, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.e = messagesController;
        this.c = j3;
        this.d = j10;
        this.f = inputPeer;
        this.b = i10;
        this.h = iArr;
    }

    public /* synthetic */ uc(w70 w70Var, int i10, long j3, long j10, eo eoVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = w70Var;
        this.b = i10;
        this.c = j3;
        this.d = j10;
        this.f = eoVar;
        this.h = f6Var;
    }

    public /* synthetic */ uc(zh.m0 m0Var, int i10, TLRPC.TL_error tL_error, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = m0Var;
        this.b = i10;
        this.f = tL_error;
        this.c = j3;
        this.d = j10;
        this.h = tL_textWithEntities;
    }
}
