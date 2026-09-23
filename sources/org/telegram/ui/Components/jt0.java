package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class jt0 extends ll0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ yu0 n;

    public jt0(yu0 yu0Var, Context context) {
        this.n = yu0Var;
        this.c = context;
    }

    public static void E(jt0 jt0Var, long j3) {
        yu0 yu0Var = jt0Var.n;
        if (jt0Var.e) {
            return;
        }
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        long j10 = yu0Var.j1;
        org.telegram.ui.ActionBar.n2 n2Var = yu0Var.v1;
        if (DialogObject.isEncryptedDialog(j10)) {
            j10 = org.telegram.messenger.z0.l(n2Var.getMessagesController(), j10).user_id;
        }
        TLRPC.InputUser inputUser = n2Var.getMessagesController().getInputUser(j10);
        tL_messages_getCommonChats.user_id = inputUser;
        if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
            return;
        }
        tL_messages_getCommonChats.limit = 100;
        tL_messages_getCommonChats.max_id = j3;
        jt0Var.e = true;
        jt0Var.l();
        n2Var.getConnectionsManager().bindRequestToGuid(n2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new y1(jt0Var, 12)), n2Var.getClassGuid());
    }

    @Override // org.telegram.ui.Components.ll0
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
        yu0 yu0Var = this.n;
        org.telegram.ui.ActionBar.d6 d6Var = yu0Var.F1;
        Context context = this.c;
        if (i10 == 14) {
            i6Var = new org.telegram.ui.Cells.i6(context, d6Var);
        } else {
            if (i10 == 15) {
                lt0 M = yu0.M(6, yu0Var.j1, context, d6Var);
                M.setLayoutParams(new s4.p0(-1, -1));
                return new wk0(M);
            }
            u00 u00Var = new u00(context, d6Var);
            u00Var.setIsSingleCell(true);
            u00Var.w = false;
            u00Var.setViewType(1);
            i6Var = u00Var;
        }
        return com.google.android.gms.internal.vision.e2.k(i6Var, i6Var, -1, -2);
    }
}
