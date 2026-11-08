package fi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class r1 extends oj0 {
    public String e;
    public TLRPC.User f;
    public String h;
    public boolean n;
    public final /* synthetic */ t1 s;
    public final di.s7 c = new di.s7(this, 18);
    public int d = -1;
    public boolean r = false;

    public r1(t1 t1Var) {
        this.s = t1Var;
    }

    public static void E(r1 r1Var, boolean z9) {
        t1 t1Var = r1Var.s;
        ArrayList arrayList = t1Var.h;
        arrayList.clear();
        k2 k2Var = t1Var.r;
        int i7 = k2.y1;
        arrayList.addAll(new ArrayList(ui.b0(k2Var.a).i0));
        if (z9) {
            r1Var.f();
        }
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 2;
    }

    public final Object F(int i7) {
        int i10 = i7 - 1;
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
        k2 k2Var = t1Var.r;
        if (this.r) {
            return;
        }
        this.r = true;
        t1Var.d.c(true);
        if (this.d >= 0) {
            int i7 = k2.y1;
            ConnectionsManager.getInstance(k2Var.a).cancelRequest(this.d, true);
            this.d = -1;
        }
        if (this.f == null) {
            int i10 = k2.y1;
            TLObject f22 = qp.s1(k2Var.a).f2(qp.s1(k2Var.a).K3);
            if (f22 instanceof TLRPC.User) {
                this.f = (TLRPC.User) f22;
            }
        }
        TLRPC.User user = this.f;
        if (user == null && !this.n) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            int i11 = k2.y1;
            tL_contacts_resolveUsername.username = qp.s1(k2Var.a).K3;
            this.d = ConnectionsManager.getInstance(k2Var.a).sendRequest(tL_contacts_resolveUsername, new bi.j0(this, 8));
            return;
        }
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        int i12 = k2.y1;
        tL_messages_getInlineBotResults.bot = qp.s1(k2Var.a).q1(this.f);
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
        yr.a0(k2Var.a).M(str3, new bi.d4(this, isEmpty, tL_messages_getInlineBotResults, str3));
    }

    public final void H(String str) {
        t1 t1Var = this.s;
        e2 e2Var = t1Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                k2 k2Var = t1Var.r;
                int i7 = k2.y1;
                ConnectionsManager.getInstance(k2Var.a).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        di.s7 s7Var = this.c;
        org.telegram.messenger.g0.r(s7Var);
        if (TextUtils.isEmpty(str)) {
            t1Var.n.clear();
            e2Var.c(false);
            f();
        } else {
            if (isEmpty) {
                f();
            }
            e2Var.c(true);
            org.telegram.messenger.g0.i3(s7Var, 1500L);
        }
    }

    @Override // v4.g0
    public final int b() {
        t1 t1Var = this.s;
        int i7 = 0;
        int size = ((t1Var.h.isEmpty() || !TextUtils.isEmpty(this.e)) ? 0 : t1Var.h.size()) + 1;
        if (!t1Var.n.isEmpty()) {
            if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i7 = 1;
            }
            i7 += t1Var.n.size();
        }
        return size + i7;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        int i10 = i7 - 1;
        t1 t1Var = this.s;
        if (!t1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i10 -= t1Var.h.size();
        }
        return (t1Var.n.isEmpty() || t1Var.h.isEmpty() || !TextUtils.isEmpty(this.e) || i10 != 0) ? 2 : 1;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new v4.o0(-1, (int) this.s.r.o1));
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
            Object F = F(i7);
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
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, org.telegram.ui.Cells.j8] */
    /* JADX WARN: Type inference failed for: r9v12, types: [android.view.View] */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.h2 h2Var;
        t1 t1Var = this.s;
        if (i7 == 0) {
            h2Var = new View(t1Var.getContext());
        } else if (i7 == 1) {
            Context context = t1Var.getContext();
            k2 k2Var = t1Var.r;
            int i10 = k2.y1;
            ?? j8Var = new org.telegram.ui.Cells.j8(context, false, false, k2Var.I0, false);
            j8Var.a(0, id.M0(2131750835, null));
            v4.o0 o0Var = new v4.o0(-1, -2);
            ((ViewGroup.MarginLayoutParams) o0Var).topMargin = org.telegram.messenger.g0.L(2.5f);
            ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin = org.telegram.messenger.g0.L(5.5f);
            j8Var.setLayoutParams(o0Var);
            h2Var = j8Var;
        } else {
            org.telegram.ui.Cells.h2 h2Var2 = new org.telegram.ui.Cells.h2(t1Var.getContext());
            h2Var2.getPhotoImage().E0(7);
            if (h2Var2.d0 == null) {
                ic icVar = new ic(h2Var2, 1.0f, 3.0f);
                icVar.e = 120L;
                h2Var2.d0 = icVar;
            }
            h2Var2.setIsKeyboard(true);
            h2Var2.setCanPreviewGif(true);
            h2Var = h2Var2;
        }
        return new xi0(h2Var);
    }
}
