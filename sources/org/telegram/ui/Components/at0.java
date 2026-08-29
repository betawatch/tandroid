package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class at0 extends il0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ qu0 n;

    public at0(qu0 qu0Var, Context context) {
        this.n = qu0Var;
        this.c = context;
    }

    public static void E(at0 at0Var, long j10) {
        qu0 qu0Var = at0Var.n;
        if (at0Var.e) {
            return;
        }
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        long j11 = qu0Var.f1;
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.r1;
        if (DialogObject.isEncryptedDialog(j11)) {
            j11 = org.telegram.messenger.x3.p(o2Var.getMessagesController(), j11).user_id;
        }
        TLRPC.InputUser inputUser = o2Var.getMessagesController().getInputUser(j11);
        tL_messages_getCommonChats.user_id = inputUser;
        if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
            return;
        }
        tL_messages_getCommonChats.limit = 100;
        tL_messages_getCommonChats.max_id = j10;
        at0Var.e = true;
        at0Var.l();
        o2Var.getConnectionsManager().bindRequestToGuid(o2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new a2(at0Var, 12)), o2Var.getClassGuid());
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.b() != this.d.size();
    }

    @Override // f2.p0
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.e) {
            return 1;
        }
        int size = arrayList.size();
        return (arrayList.isEmpty() || this.h) ? size : size + 1;
    }

    @Override // f2.p0
    public final int j(int i10) {
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty() || this.e) {
            return i10 < arrayList.size() ? 14 : 16;
        }
        return 15;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        if (n1Var.f == 14) {
            View view = n1Var.a;
            if (view instanceof org.telegram.ui.Cells.f6) {
                org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
                ArrayList arrayList = this.d;
                f6Var.t((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z10 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                f6Var.I = z10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.f6 f6Var;
        qu0 qu0Var = this.n;
        org.telegram.ui.ActionBar.c6 c6Var = qu0Var.B1;
        Context context = this.c;
        if (i10 == 14) {
            f6Var = new org.telegram.ui.Cells.f6(context, c6Var);
        } else {
            if (i10 == 15) {
                ct0 M = qu0.M(6, qu0Var.f1, context, c6Var);
                M.setLayoutParams(new f2.x0(-1, -1));
                return new vk0(M);
            }
            p00 p00Var = new p00(context, c6Var);
            p00Var.setIsSingleCell(true);
            p00Var.w = false;
            p00Var.setViewType(1);
            f6Var = p00Var;
        }
        return org.telegram.ui.th.m(f6Var, f6Var, -1, -2);
    }
}
