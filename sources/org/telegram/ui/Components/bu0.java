package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class bu0 extends yl0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ qv0 n;

    public bu0(qv0 qv0Var, Context context) {
        this.n = qv0Var;
        this.c = context;
    }

    public static void E(bu0 bu0Var, long j3) {
        qv0 qv0Var = bu0Var.n;
        if (bu0Var.e) {
            return;
        }
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        long j10 = qv0Var.j1;
        org.telegram.ui.ActionBar.n2 n2Var = qv0Var.v1;
        if (DialogObject.isEncryptedDialog(j10)) {
            j10 = org.telegram.messenger.q.l(n2Var.getMessagesController(), j10).user_id;
        }
        TLRPC.InputUser inputUser = n2Var.getMessagesController().getInputUser(j10);
        tL_messages_getCommonChats.user_id = inputUser;
        if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
            return;
        }
        tL_messages_getCommonChats.limit = 100;
        tL_messages_getCommonChats.max_id = j3;
        bu0Var.e = true;
        bu0Var.l();
        n2Var.getConnectionsManager().bindRequestToGuid(n2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new y1(bu0Var, 12)), n2Var.getClassGuid());
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.b() != this.d.size();
    }

    @Override // s4.h0
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.e) {
            return 1;
        }
        int size = arrayList.size();
        return (arrayList.isEmpty() || this.h) ? size : size + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty() || this.e) {
            return i10 < arrayList.size() ? 14 : 16;
        }
        return 15;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f == 14) {
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.i6) {
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                ArrayList arrayList = this.d;
                i6Var.t((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z10 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                i6Var.M = z10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.i6 i6Var;
        qv0 qv0Var = this.n;
        org.telegram.ui.ActionBar.d6 d6Var = qv0Var.F1;
        Context context = this.c;
        if (i10 == 14) {
            i6Var = new org.telegram.ui.Cells.i6(context, d6Var);
        } else {
            if (i10 == 15) {
                du0 M = qv0.M(6, qv0Var.j1, context, d6Var);
                M.setLayoutParams(new s4.p0(-1, -1));
                return new il0(M);
            }
            w00 w00Var = new w00(context, d6Var);
            w00Var.setIsSingleCell(true);
            w00Var.w = false;
            w00Var.setViewType(1);
            i6Var = w00Var;
        }
        return com.google.android.gms.internal.vision.e2.k(i6Var, i6Var, -1, -2);
    }
}
