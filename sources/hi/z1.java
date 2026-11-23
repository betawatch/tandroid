package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class z1 extends dk0 {
    public String e;
    public TLRPC.User f;
    public String h;
    public boolean n;
    public final /* synthetic */ b2 s;
    public final w c = new w(this, 6);
    public int d = -1;
    public boolean r = false;

    public z1(b2 b2Var) {
        this.s = b2Var;
    }

    public static void E(z1 z1Var, boolean z10) {
        b2 b2Var = z1Var.s;
        ArrayList arrayList = b2Var.h;
        arrayList.clear();
        r2 r2Var = b2Var.r;
        int i7 = r2.D1;
        arrayList.addAll(new ArrayList(ri.d0(r2Var.a).j0));
        if (z10) {
            z1Var.f();
        }
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 2;
    }

    public final Object F(int i7) {
        int i10 = i7 - 1;
        b2 b2Var = this.s;
        if (!b2Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            if (i10 >= 0 && i10 < b2Var.h.size()) {
                return b2Var.h.get(i10);
            }
            i10 -= b2Var.h.size();
        }
        if (b2Var.n.isEmpty()) {
            return null;
        }
        if (!b2Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i10--;
        }
        if (i10 < 0 || i10 >= b2Var.n.size()) {
            return null;
        }
        return b2Var.n.get(i10);
    }

    public final void G() {
        b2 b2Var = this.s;
        r2 r2Var = b2Var.r;
        if (this.r) {
            return;
        }
        this.r = true;
        b2Var.d.c(true);
        if (this.d >= 0) {
            int i7 = r2.D1;
            ConnectionsManager.getInstance(r2Var.a).cancelRequest(this.d, true);
            this.d = -1;
        }
        if (this.f == null) {
            int i10 = r2.D1;
            TLObject h22 = mp.u1(r2Var.a).h2(mp.u1(r2Var.a).N3);
            if (h22 instanceof TLRPC.User) {
                this.f = (TLRPC.User) h22;
            }
        }
        TLRPC.User user = this.f;
        if (user == null && !this.n) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            int i11 = r2.D1;
            tL_contacts_resolveUsername.username = mp.u1(r2Var.a).N3;
            this.d = ConnectionsManager.getInstance(r2Var.a).sendRequest(tL_contacts_resolveUsername, new ai.b1(this, 9));
            return;
        }
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        int i12 = r2.D1;
        tL_messages_getInlineBotResults.bot = mp.u1(r2Var.a).s1(this.f);
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
        tr.a0(r2Var.a).M(str3, new di.j3(this, isEmpty, tL_messages_getInlineBotResults, str3));
    }

    public final void H(String str) {
        b2 b2Var = this.s;
        l2 l2Var = b2Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                r2 r2Var = b2Var.r;
                int i7 = r2.D1;
                ConnectionsManager.getInstance(r2Var.a).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        w wVar = this.c;
        org.telegram.messenger.g0.r(wVar);
        if (TextUtils.isEmpty(str)) {
            b2Var.n.clear();
            l2Var.c(false);
            f();
        } else {
            if (isEmpty) {
                f();
            }
            l2Var.c(true);
            org.telegram.messenger.g0.h3(wVar, 1500L);
        }
    }

    @Override // v4.i0
    public final int b() {
        b2 b2Var = this.s;
        int i7 = 0;
        int size = ((b2Var.h.isEmpty() || !TextUtils.isEmpty(this.e)) ? 0 : b2Var.h.size()) + 1;
        if (!b2Var.n.isEmpty()) {
            if (!b2Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i7 = 1;
            }
            i7 += b2Var.n.size();
        }
        return size + i7;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        int i10 = i7 - 1;
        b2 b2Var = this.s;
        if (!b2Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i10 -= b2Var.h.size();
        }
        return (b2Var.n.isEmpty() || b2Var.h.isEmpty() || !TextUtils.isEmpty(this.e) || i10 != 0) ? 2 : 1;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new v4.q0(-1, (int) this.s.r.s1));
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
            Object F = F(i7);
            if (!(F instanceof TLRPC.Document)) {
                if (F instanceof TLRPC.BotInlineResult) {
                    i2Var.e((TLRPC.BotInlineResult) F, this.f, true, false, false, true);
                }
            } else {
                TLRPC.Document document = (TLRPC.Document) F;
                i2Var.getClass();
                i2Var.d(0, "gif" + document, document);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, org.telegram.ui.Cells.j8] */
    /* JADX WARN: Type inference failed for: r9v12, types: [android.view.View] */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.i2 i2Var;
        b2 b2Var = this.s;
        if (i7 == 0) {
            i2Var = new View(b2Var.getContext());
        } else if (i7 == 1) {
            Context context = b2Var.getContext();
            r2 r2Var = b2Var.r;
            int i10 = r2.D1;
            ?? j8Var = new org.telegram.ui.Cells.j8(context, false, false, r2Var.J0, false);
            j8Var.a(0, gd.N0(2131750822, null));
            v4.q0 q0Var = new v4.q0(-1, -2);
            ((ViewGroup.MarginLayoutParams) q0Var).topMargin = org.telegram.messenger.g0.L(2.5f);
            ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin = org.telegram.messenger.g0.L(5.5f);
            j8Var.setLayoutParams(q0Var);
            i2Var = j8Var;
        } else {
            org.telegram.ui.Cells.i2 i2Var2 = new org.telegram.ui.Cells.i2(b2Var.getContext());
            i2Var2.getPhotoImage().F0(7);
            if (i2Var2.e0 == null) {
                org.telegram.ui.Components.lc lcVar = new org.telegram.ui.Components.lc(i2Var2, 1.0f, 3.0f);
                lcVar.e = 120L;
                i2Var2.e0 = lcVar;
            }
            i2Var2.setIsKeyboard(true);
            i2Var2.setCanPreviewGif(true);
            i2Var = i2Var2;
        }
        return new mj0(i2Var);
    }
}
