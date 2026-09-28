package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class wt0 extends xl0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ lv0 n;

    public wt0(lv0 lv0Var, Context context) {
        this.n = lv0Var;
        this.c = context;
    }

    public static void E(wt0 wt0Var, long j3) {
        lv0 lv0Var = wt0Var.n;
        if (wt0Var.e) {
            return;
        }
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        long j10 = lv0Var.j1;
        org.telegram.ui.ActionBar.m2 m2Var = lv0Var.v1;
        if (DialogObject.isEncryptedDialog(j10)) {
            j10 = org.telegram.messenger.f0.l(m2Var.getMessagesController(), j10).user_id;
        }
        TLRPC.InputUser inputUser = m2Var.getMessagesController().getInputUser(j10);
        tL_messages_getCommonChats.user_id = inputUser;
        if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
            return;
        }
        tL_messages_getCommonChats.limit = 100;
        tL_messages_getCommonChats.max_id = j3;
        wt0Var.e = true;
        wt0Var.l();
        m2Var.getConnectionsManager().bindRequestToGuid(m2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new y1(wt0Var, 12)), m2Var.getClassGuid());
    }

    @Override // org.telegram.ui.Components.xl0
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
        lv0 lv0Var = this.n;
        org.telegram.ui.ActionBar.d6 d6Var = lv0Var.F1;
        Context context = this.c;
        if (i10 == 14) {
            i6Var = new org.telegram.ui.Cells.i6(context, d6Var);
        } else {
            if (i10 == 15) {
                yt0 M = lv0.M(6, lv0Var.j1, context, d6Var);
                M.setLayoutParams(new s4.p0(-1, -1));
                return new il0(M);
            }
            v00 v00Var = new v00(context, d6Var);
            v00Var.setIsSingleCell(true);
            v00Var.w = false;
            v00Var.setViewType(1);
            i6Var = v00Var;
        }
        return com.google.android.gms.internal.vision.e2.k(i6Var, i6Var, -1, -2);
    }
}
