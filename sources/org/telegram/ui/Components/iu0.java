package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class iu0 extends lm0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ xv0 n;

    public iu0(xv0 xv0Var, Context context) {
        this.n = xv0Var;
        this.c = context;
    }

    public static void E(iu0 iu0Var, long j10) {
        xv0 xv0Var = iu0Var.n;
        if (iu0Var.e) {
            return;
        }
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        long j11 = xv0Var.j1;
        org.telegram.ui.ActionBar.m2 m2Var = xv0Var.v1;
        if (DialogObject.isEncryptedDialog(j11)) {
            j11 = org.telegram.messenger.g0.l(m2Var.getMessagesController(), j11).user_id;
        }
        TLRPC.InputUser inputUser = m2Var.getMessagesController().getInputUser(j11);
        tL_messages_getCommonChats.user_id = inputUser;
        if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
            return;
        }
        tL_messages_getCommonChats.limit = 100;
        tL_messages_getCommonChats.max_id = j10;
        iu0Var.e = true;
        iu0Var.l();
        m2Var.getConnectionsManager().bindRequestToGuid(m2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new y1(iu0Var, 12)), m2Var.getClassGuid());
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.b() != this.d.size();
    }

    @Override // s4.g0
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.e) {
            return 1;
        }
        int size = arrayList.size();
        return (arrayList.isEmpty() || this.h) ? size : size + 1;
    }

    @Override // s4.g0
    public final int j(int i10) {
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty() || this.e) {
            return i10 < arrayList.size() ? 14 : 16;
        }
        return 15;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f == 14) {
            View view = b1Var.a;
            if (view instanceof org.telegram.ui.Cells.i6) {
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                ArrayList arrayList = this.d;
                i6Var.u((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z10 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                i6Var.M = z10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.i6 i6Var;
        xv0 xv0Var = this.n;
        org.telegram.ui.ActionBar.c6 c6Var = xv0Var.F1;
        Context context = this.c;
        if (i10 == 14) {
            i6Var = new org.telegram.ui.Cells.i6(context, c6Var);
        } else {
            if (i10 == 15) {
                ku0 M = xv0.M(6, xv0Var.j1, context, c6Var);
                M.setLayoutParams(new s4.o0(-1, -1));
                return new wl0(M);
            }
            f10 f10Var = new f10(context, c6Var);
            f10Var.setIsSingleCell(true);
            f10Var.w = false;
            f10Var.setViewType(1);
            i6Var = f10Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(i6Var, i6Var, -1, -2);
    }
}
