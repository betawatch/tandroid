// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bea extends n39 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public int n;
    public final /* synthetic */ nfa r;

    public bea(nfa nfaVar, Context context) {
        this.r = nfaVar;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 14 || i == 25;
    }

    public final void E(long j) {
        d dVar = this.r.y1;
        if (this.e) {
            return;
        }
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        TLRPC.InputUser m1 = dVar.getMessagesController().m1(F());
        tL_messages_getCommonChats.user_id = m1;
        if (m1 instanceof TLRPC.TL_inputUserEmpty) {
            return;
        }
        tL_messages_getCommonChats.limit = 100;
        tL_messages_getCommonChats.max_id = j;
        this.e = true;
        f();
        this.n = dVar.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new wx9(this, (byte) 1));
        dVar.getConnectionsManager().bindRequestToGuid(this.n, dVar.getClassGuid());
    }

    public final long F() {
        nfa nfaVar = this.r;
        long j = nfaVar.m1;
        return cf3.B(j) ? nfaVar.y1.getMessagesController().Y0(Integer.valueOf((int) (j & 4294967295L))).user_id : j;
    }

    public final boolean G() {
        TLRPC.User V1;
        return (this.d.isEmpty() || (V1 = this.r.y1.getMessagesController().V1(Long.valueOf(F()))) == null || V1.bot || V1.self || l7c.z(V1)) ? false : true;
    }

    @Override // w39
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

    @Override // w39
    public final int d(int i) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.e) {
            return 15;
        }
        if (G()) {
            if (i == 0) {
                return 25;
            }
            i--;
        }
        return i < arrayList.size() ? 14 : 16;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 != 14) {
            if (i2 == 25 && (view instanceof dh6)) {
                ((dh6) view).b(R.drawable.msg_groups_create, 5, k96.a0(null, null, 2131751733, l7c.k(this.r.y1.getMessagesController().V1(Long.valueOf(F())), true)), true);
                return;
            }
            return;
        }
        if (view instanceof rr8) {
            rr8 rr8Var = (rr8) view;
            if (G()) {
                i--;
            }
            ArrayList arrayList = this.d;
            rr8Var.z((TLRPC.Chat) arrayList.get(i), null, null, null, false, false);
            rr8Var.N = (i == arrayList.size() - 1 && this.h) ? false : true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        rr8 rr8Var;
        nfa nfaVar = this.r;
        wjb wjbVar = nfaVar.I1;
        Context context = this.c;
        if (i == 14) {
            rr8Var = new rr8(context, wjbVar);
        } else {
            if (i == 15) {
                bi G = nfa.G(6, nfaVar.m1, wjbVar, context);
                G.setLayoutParams(new e49(-1, -1));
                return new y29(G);
            }
            if (i != 25) {
                pi4 pi4Var = new pi4(context, wjbVar);
                pi4Var.setIsSingleCell(true);
                pi4Var.x = false;
                pi4Var.setViewType(1);
                rr8Var = pi4Var;
            } else {
                dh6 dh6Var = new dh6(context);
                dh6Var.a(bkb.u6, bkb.t6);
                dh6Var.setTextLeft(gl.C);
                rr8Var = dh6Var;
            }
        }
        return ls6.h(rr8Var, rr8Var, -1, -2);
    }
}
