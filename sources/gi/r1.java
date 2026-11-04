package gi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.sj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r1 extends sj0 {
    public String e;
    public TLRPC.User f;
    public String h;
    public boolean n;
    public final /* synthetic */ t1 s;
    public final ei.z5 c = new ei.z5(this, 22);
    public int d = -1;
    public boolean r = false;

    public r1(t1 t1Var) {
        this.s = t1Var;
    }

    public static void E(r1 r1Var, boolean z10) {
        t1 t1Var = r1Var.s;
        ArrayList arrayList = t1Var.h;
        arrayList.clear();
        i2 i2Var = t1Var.r;
        int i3 = i2.z1;
        arrayList.addAll(new ArrayList(li.b0(i2Var.a).j0));
        if (z10) {
            r1Var.f();
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 2;
    }

    public final Object F(int i3) {
        int i10 = i3 - 1;
        t1 t1Var = this.s;
        if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            if (i10 >= 0 && i10 < t1Var.h.size()) {
                return t1Var.h.get(i10);
            }
            i10 -= t1Var.h.size();
        }
        if (t1Var.n.isEmpty()) {
            return null;
        }
        if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i10--;
        }
        if (i10 < 0 || i10 >= t1Var.n.size()) {
            return null;
        }
        return t1Var.n.get(i10);
    }

    public final void G() {
        t1 t1Var = this.s;
        i2 i2Var = t1Var.r;
        if (this.r) {
            return;
        }
        this.r = true;
        t1Var.d.c(true);
        if (this.d >= 0) {
            int i3 = i2.z1;
            ConnectionsManager.getInstance(i2Var.a).cancelRequest(this.d, true);
            this.d = -1;
        }
        if (this.f == null) {
            int i10 = i2.z1;
            TLObject f22 = hp.s1(i2Var.a).f2(hp.s1(i2Var.a).L3);
            if (f22 instanceof TLRPC.User) {
                this.f = (TLRPC.User) f22;
            }
        }
        TLRPC.User user = this.f;
        if (user == null && !this.n) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            int i11 = i2.z1;
            tL_contacts_resolveUsername.username = hp.s1(i2Var.a).L3;
            this.d = ConnectionsManager.getInstance(i2Var.a).sendRequest(tL_contacts_resolveUsername, new ci.d0(this, 8));
            return;
        }
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        int i12 = i2.z1;
        tL_messages_getInlineBotResults.bot = hp.s1(i2Var.a).q1(this.f);
        String str = this.e;
        if (str == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.query = str;
        boolean isEmpty = TextUtils.isEmpty(this.h);
        String str2 = this.h;
        tL_messages_getInlineBotResults.offset = str2 != null ? str2 : "";
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        String str3 = "gif_search_" + tL_messages_getInlineBotResults.query + "_" + tL_messages_getInlineBotResults.offset;
        qr.a0(i2Var.a).M(str3, new ci.o3(this, isEmpty, tL_messages_getInlineBotResults, str3));
    }

    public final void H(String str) {
        t1 t1Var = this.s;
        d2 d2Var = t1Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                i2 i2Var = t1Var.r;
                int i3 = i2.z1;
                ConnectionsManager.getInstance(i2Var.a).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        ei.z5 z5Var = this.c;
        org.telegram.messenger.g0.r(z5Var);
        if (TextUtils.isEmpty(str)) {
            t1Var.n.clear();
            d2Var.c(false);
            f();
        } else {
            if (isEmpty) {
                f();
            }
            d2Var.c(true);
            org.telegram.messenger.g0.i3(z5Var, 1500L);
        }
    }

    @Override // u4.h0
    public final int b() {
        t1 t1Var = this.s;
        int i3 = 0;
        int size = ((t1Var.h.isEmpty() || !TextUtils.isEmpty(this.e)) ? 0 : t1Var.h.size()) + 1;
        if (!t1Var.n.isEmpty()) {
            if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i3 = 1;
            }
            i3 += t1Var.n.size();
        }
        return size + i3;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i10 = i3 - 1;
        t1 t1Var = this.s;
        if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i10 -= t1Var.h.size();
        }
        return (t1Var.n.isEmpty() || t1Var.h.isEmpty() || !TextUtils.isEmpty(this.e) || i10 != 0) ? 2 : 1;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new u4.p0(-1, (int) this.s.r.p1));
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
            Object F = F(i3);
            if (!(F instanceof TLRPC.Document)) {
                if (F instanceof TLRPC.BotInlineResult) {
                    h2Var.e((TLRPC.BotInlineResult) F, this.f, true, false, false, true);
                }
            } else {
                TLRPC.Document document = (TLRPC.Document) F;
                h2Var.getClass();
                h2Var.d(0, "gif" + document, document);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, org.telegram.ui.Cells.i8] */
    /* JADX WARN: Type inference failed for: r9v12, types: [android.view.View] */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.h2 h2Var;
        t1 t1Var = this.s;
        if (i3 == 0) {
            h2Var = new View(t1Var.getContext());
        } else if (i3 == 1) {
            Context context = t1Var.getContext();
            i2 i2Var = t1Var.r;
            int i10 = i2.z1;
            ?? i8Var = new org.telegram.ui.Cells.i8(context, false, false, i2Var.J0, false);
            i8Var.a(0, bd.M0(2131750835, null));
            u4.p0 p0Var = new u4.p0(-1, -2);
            ((ViewGroup.MarginLayoutParams) p0Var).topMargin = org.telegram.messenger.g0.L(2.5f);
            ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin = org.telegram.messenger.g0.L(5.5f);
            i8Var.setLayoutParams(p0Var);
            h2Var = i8Var;
        } else {
            org.telegram.ui.Cells.h2 h2Var2 = new org.telegram.ui.Cells.h2(t1Var.getContext());
            h2Var2.getPhotoImage().E0(7);
            if (h2Var2.e0 == null) {
                gc gcVar = new gc(h2Var2, 1.0f, 3.0f);
                gcVar.e = 120L;
                h2Var2.e0 = gcVar;
            }
            h2Var2.setIsKeyboard(true);
            h2Var2.setCanPreviewGif(true);
            h2Var = h2Var2;
        }
        return new bj0(h2Var);
    }
}
