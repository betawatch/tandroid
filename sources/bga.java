// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bga extends q59 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public int n;
    public final /* synthetic */ nha r;

    public bga(nha nhaVar, Context context) {
        this.r = nhaVar;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 14 || i == 25;
    }

    public final void E(long j) {
        d dVar = this.r.y1;
        if (this.e) {
            return;
        }
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        TLRPC.InputUser n1 = dVar.getMessagesController().n1(F());
        tL_messages_getCommonChats.user_id = n1;
        if (n1 instanceof TLRPC.TL_inputUserEmpty) {
            return;
        }
        tL_messages_getCommonChats.limit = 100;
        tL_messages_getCommonChats.max_id = j;
        this.e = true;
        f();
        this.n = dVar.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new go9(this, (byte) 2));
        dVar.getConnectionsManager().bindRequestToGuid(this.n, dVar.getClassGuid());
    }

    public final long F() {
        nha nhaVar = this.r;
        long j = nhaVar.m1;
        return pg3.B(j) ? nhaVar.y1.getMessagesController().Z0(Integer.valueOf((int) (j & 4294967295L))).user_id : j;
    }

    public final boolean G() {
        TLRPC.User W1;
        return (this.d.isEmpty() || (W1 = this.r.y1.getMessagesController().W1(Long.valueOf(F()))) == null || W1.bot || W1.self || m9c.z(W1)) ? false : true;
    }

    @Override // y59
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

    @Override // y59
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

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 != 14) {
            if (i2 == 25 && (view instanceof fj6)) {
                ((fj6) view).b(R.drawable.msg_groups_create, 5, jb6.a0(null, null, 2131751682, m9c.k(this.r.y1.getMessagesController().W1(Long.valueOf(F())), true)), true);
                return;
            }
            return;
        }
        if (view instanceof ut8) {
            ut8 ut8Var = (ut8) view;
            if (G()) {
                i--;
            }
            ArrayList arrayList = this.d;
            ut8Var.x((TLRPC.Chat) arrayList.get(i), null, null, null, false, false);
            ut8Var.N = (i == arrayList.size() - 1 && this.h) ? false : true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        ut8 ut8Var;
        nha nhaVar = this.r;
        ylb ylbVar = nhaVar.I1;
        Context context = this.c;
        if (i == 14) {
            ut8Var = new ut8(context, ylbVar);
        } else {
            if (i == 15) {
                bj G = nha.G(6, nhaVar.m1, ylbVar, context);
                G.setLayoutParams(new g69(-1, -1));
                return new b59(G);
            }
            if (i != 25) {
                tk4 tk4Var = new tk4(context, ylbVar);
                tk4Var.setIsSingleCell(true);
                tk4Var.x = false;
                tk4Var.setViewType(1);
                ut8Var = tk4Var;
            } else {
                fj6 fj6Var = new fj6(context);
                fj6Var.a(cmb.u6, cmb.t6);
                fj6Var.setTextLeft(gm.C);
                ut8Var = fj6Var;
            }
        }
        return kt6.h(ut8Var, ut8Var, -1, -2);
    }
}
