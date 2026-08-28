package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ps0 extends vk0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ eu0 n;

    public ps0(eu0 eu0Var, Context context) {
        this.n = eu0Var;
        this.c = context;
    }

    public static void E(ps0 ps0Var, long j10) {
        eu0 eu0Var = ps0Var.n;
        if (ps0Var.e) {
            return;
        }
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        long j11 = eu0Var.f1;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.r1;
        if (DialogObject.isEncryptedDialog(j11)) {
            j11 = org.telegram.messenger.l0.l(o2Var.getMessagesController(), j11).user_id;
        }
        TLRPC.InputUser inputUser = o2Var.getMessagesController().getInputUser(j11);
        tL_messages_getCommonChats.user_id = inputUser;
        if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
            return;
        }
        tL_messages_getCommonChats.limit = 100;
        tL_messages_getCommonChats.max_id = j10;
        ps0Var.e = true;
        ps0Var.l();
        o2Var.getConnectionsManager().bindRequestToGuid(o2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new w1(ps0Var, 12)), o2Var.getClassGuid());
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.b() != this.d.size();
    }

    @Override // f2.r0
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.e) {
            return 1;
        }
        int size = arrayList.size();
        return (arrayList.isEmpty() || this.h) ? size : size + 1;
    }

    @Override // f2.r0
    public final int j(int i9) {
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty() || this.e) {
            return i9 < arrayList.size() ? 14 : 16;
        }
        return 15;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        if (q1Var.f == 14) {
            View view = q1Var.a;
            if (view instanceof org.telegram.ui.Cells.h6) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                ArrayList arrayList = this.d;
                h6Var.t((TLRPC.Chat) arrayList.get(i9), null, null, null, false, false);
                boolean z10 = true;
                if (i9 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                h6Var.I = z10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.h6 h6Var;
        eu0 eu0Var = this.n;
        org.telegram.ui.ActionBar.b6 b6Var = eu0Var.B1;
        Context context = this.c;
        if (i9 == 14) {
            h6Var = new org.telegram.ui.Cells.h6(context, b6Var);
        } else {
            if (i9 == 15) {
                rs0 M = eu0.M(6, eu0Var.f1, context, b6Var);
                M.setLayoutParams(new f2.a1(-1, -1));
                return new ik0(M);
            }
            e00 e00Var = new e00(context, b6Var);
            e00Var.setIsSingleCell(true);
            e00Var.w = false;
            e00Var.setViewType(1);
            h6Var = e00Var;
        }
        return j3.r0.s(h6Var, h6Var, -1, -2);
    }
}
