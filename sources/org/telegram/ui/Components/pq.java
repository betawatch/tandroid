package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pq implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ pq(boolean[] zArr, ag.g3 g3Var, boolean[] zArr2, org.telegram.messenger.r20 r20Var, int[] iArr, int i10) {
        this.b = zArr;
        this.e = g3Var;
        this.c = zArr2;
        this.f = r20Var;
        this.h = iArr;
        this.d = i10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ag.g3 g3Var = (ag.g3) this.e;
                org.telegram.messenger.r20 r20Var = (org.telegram.messenger.r20) this.f;
                int[] iArr = (int[]) this.h;
                this.b[0] = true;
                g3Var.run();
                boolean[] zArr = this.c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    r20Var.a(null);
                }
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(this.d).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                    break;
                }
                break;
            default:
                Context context = (Context) this.e;
                TLRPC.User user = (TLRPC.User) this.f;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.h;
                if (!this.b[0]) {
                    boolean[] zArr2 = this.c;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        xh.r3.e(context, this.d, user.id);
                        oVar.a(Boolean.TRUE, "cancelled");
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ pq(boolean[] zArr, boolean[] zArr2, Context context, int i10, TLRPC.User user, org.telegram.ui.web.o oVar) {
        this.b = zArr;
        this.c = zArr2;
        this.e = context;
        this.d = i10;
        this.f = user;
        this.h = oVar;
    }
}
