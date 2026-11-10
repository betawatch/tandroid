package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class mr0 extends oj0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public int n;
    public final /* synthetic */ ys0 r;

    public mr0(ys0 ys0Var, Context context) {
        this.r = ys0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 14 || i7 == 25;
    }

    public final void E(long j3) {
        org.telegram.ui.ActionBar.f2 f2Var = this.r.x1;
        if (this.e) {
            return;
        }
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        TLRPC.InputUser o12 = f2Var.getMessagesController().o1(F());
        tL_messages_getCommonChats.user_id = o12;
        if (o12 instanceof TLRPC.TL_inputUserEmpty) {
            return;
        }
        tL_messages_getCommonChats.limit = 100;
        tL_messages_getCommonChats.max_id = j3;
        this.e = true;
        f();
        this.n = f2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new w1(this, 11));
        f2Var.getConnectionsManager().bindRequestToGuid(this.n, f2Var.getClassGuid());
    }

    public final long F() {
        ys0 ys0Var = this.r;
        return org.telegram.messenger.m5.C(ys0Var.l1) ? ys0Var.x1.getMessagesController().a1(Integer.valueOf((int) (ys0Var.l1 & 4294967295L))).user_id : ys0Var.l1;
    }

    public final boolean G() {
        TLRPC.User a22;
        return (this.d.isEmpty() || (a22 = this.r.x1.getMessagesController().a2(Long.valueOf(F()))) == null || a22.bot || a22.self || org.telegram.messenger.t10.x(a22)) ? false : true;
    }

    @Override // v4.g0
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.e) {
            return 1;
        }
        int size = arrayList.size();
        if (arrayList.isEmpty()) {
            return size;
        }
        if (G()) {
            size++;
        }
        return !this.h ? size + 1 : size;
    }

    @Override // v4.g0
    public final int d(int i7) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.e) {
            return 15;
        }
        if (G()) {
            if (i7 == 0) {
                return 25;
            }
            i7--;
        }
        return i7 < arrayList.size() ? 14 : 16;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 != 14) {
            if (i10 == 25 && (view instanceof org.telegram.ui.Cells.x4)) {
                ((org.telegram.ui.Cells.x4) view).b(R.drawable.msg_groups_create, 5, org.telegram.messenger.id.a0(null, null, 2131751745, org.telegram.messenger.t10.j(this.r.x1.getMessagesController().a2(Long.valueOf(F())), true)), true);
                return;
            }
            return;
        }
        if (view instanceof org.telegram.ui.Cells.g6) {
            org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
            if (G()) {
                i7--;
            }
            ArrayList arrayList = this.d;
            g6Var.x((TLRPC.Chat) arrayList.get(i7), null, null, null, false, false);
            g6Var.M = (i7 == arrayList.size() - 1 && this.h) ? false : true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.g6 g6Var;
        ys0 ys0Var = this.r;
        org.telegram.ui.ActionBar.h6 h6Var = ys0Var.H1;
        Context context = this.c;
        if (i7 == 14) {
            g6Var = new org.telegram.ui.Cells.g6(context, h6Var);
        } else {
            if (i7 == 15) {
                q3 X = ys0.X(6, ys0Var.l1, context, h6Var);
                X.setLayoutParams(new v4.o0(-1, -1));
                return new xi0(X);
            }
            if (i7 != 25) {
                lz lzVar = new lz(context, h6Var);
                lzVar.setIsSingleCell(true);
                lzVar.x = false;
                lzVar.setViewType(1);
                g6Var = lzVar;
            } else {
                org.telegram.ui.Cells.x4 x4Var = new org.telegram.ui.Cells.x4(context);
                x4Var.a(org.telegram.ui.ActionBar.m6.v6, org.telegram.ui.ActionBar.m6.u6);
                x4Var.setTextLeft(org.telegram.messenger.g0.C);
                g6Var = x4Var;
            }
        }
        return jg.g.r(g6Var, g6Var, -1, -2);
    }
}
