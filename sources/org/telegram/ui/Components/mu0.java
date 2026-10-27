package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mu0 extends mm0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ bw0 n;

    public mu0(bw0 bw0Var, Context context) {
        this.n = bw0Var;
        this.c = context;
    }

    public static void E(mu0 mu0Var, long j10) {
        bw0 bw0Var = mu0Var.n;
        if (mu0Var.e) {
            return;
        }
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        long j11 = bw0Var.l1;
        org.telegram.ui.ActionBar.r2 r2Var = bw0Var.x1;
        if (DialogObject.isEncryptedDialog(j11)) {
            j11 = org.telegram.messenger.t.m(r2Var.getMessagesController(), j11).user_id;
        }
        TLRPC.InputUser inputUser = r2Var.getMessagesController().getInputUser(j11);
        tL_messages_getCommonChats.user_id = inputUser;
        if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
            return;
        }
        tL_messages_getCommonChats.limit = 100;
        tL_messages_getCommonChats.max_id = j10;
        mu0Var.e = true;
        mu0Var.l();
        r2Var.getConnectionsManager().bindRequestToGuid(r2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new b2(mu0Var, 12)), r2Var.getClassGuid());
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.b() != this.d.size();
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
    public final void v(s4.e1 e1Var, int i10) {
        if (e1Var.f == 14) {
            View view = e1Var.a;
            if (view instanceof org.telegram.ui.Cells.m6) {
                org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
                ArrayList arrayList = this.d;
                m6Var.s((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z10 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                m6Var.M = z10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m6 m6Var;
        bw0 bw0Var = this.n;
        org.telegram.ui.ActionBar.u6 u6Var = bw0Var.H1;
        Context context = this.c;
        if (i10 == 14) {
            m6Var = new org.telegram.ui.Cells.m6(context, u6Var);
        } else {
            if (i10 == 15) {
                ou0 U = bw0.U(6, bw0Var.l1, context, u6Var);
                U.setLayoutParams(new s4.q0(-1, -1));
                return new wl0(U);
            }
            c10 c10Var = new c10(context, u6Var);
            c10Var.setIsSingleCell(true);
            c10Var.w = false;
            c10Var.setViewType(1);
            m6Var = c10Var;
        }
        return ic.a.n(m6Var, m6Var, -1, -2);
    }
}
