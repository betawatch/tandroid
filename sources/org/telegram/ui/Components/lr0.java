package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class lr0 extends oj0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ xs0 n;

    public lr0(xs0 xs0Var, Context context) {
        this.n = xs0Var;
        this.c = context;
    }

    public static void E(lr0 lr0Var, long j3) {
        xs0 xs0Var = lr0Var.n;
        if (lr0Var.e) {
            return;
        }
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        long j10 = xs0Var.l1;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.x1;
        if (org.telegram.messenger.m5.C(j10)) {
            j10 = f2Var.getMessagesController().a1(Integer.valueOf((int) (j10 & 4294967295L))).user_id;
        }
        TLRPC.InputUser o12 = f2Var.getMessagesController().o1(j10);
        tL_messages_getCommonChats.user_id = o12;
        if (o12 instanceof TLRPC.TL_inputUserEmpty) {
            return;
        }
        tL_messages_getCommonChats.limit = 100;
        tL_messages_getCommonChats.max_id = j3;
        lr0Var.e = true;
        lr0Var.f();
        f2Var.getConnectionsManager().bindRequestToGuid(f2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new x1(lr0Var, 11)), f2Var.getClassGuid());
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.b() != this.d.size();
    }

    @Override // v4.g0
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.e) {
            return 1;
        }
        int size = arrayList.size();
        return (arrayList.isEmpty() || this.h) ? size : size + 1;
    }

    @Override // v4.g0
    public final int d(int i7) {
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty() || this.e) {
            return i7 < arrayList.size() ? 14 : 16;
        }
        return 15;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        if (d1Var.f == 14) {
            View view = d1Var.a;
            if (view instanceof org.telegram.ui.Cells.g6) {
                org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                ArrayList arrayList = this.d;
                g6Var.x((TLRPC.Chat) arrayList.get(i7), null, null, null, false, false);
                boolean z9 = true;
                if (i7 == arrayList.size() - 1 && this.h) {
                    z9 = false;
                }
                g6Var.M = z9;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.g6 g6Var;
        xs0 xs0Var = this.n;
        org.telegram.ui.ActionBar.f6 f6Var = xs0Var.H1;
        Context context = this.c;
        if (i7 == 14) {
            g6Var = new org.telegram.ui.Cells.g6(context, f6Var);
        } else {
            if (i7 == 15) {
                r3 X = xs0.X(6, xs0Var.l1, context, f6Var);
                X.setLayoutParams(new v4.o0(-1, -1));
                return new xi0(X);
            }
            mz mzVar = new mz(context, f6Var);
            mzVar.setIsSingleCell(true);
            mzVar.x = false;
            mzVar.setViewType(1);
            g6Var = mzVar;
        }
        return jg.g.r(g6Var, g6Var, -1, -2);
    }
}
