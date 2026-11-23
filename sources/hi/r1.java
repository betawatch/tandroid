package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.ur;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class r1 extends dk0 {
    public String e;
    public TLRPC.User f;
    public String h;
    public boolean n;
    public final /* synthetic */ t1 s;
    public final l c = new l(this, 5);
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
        int i7 = i2.C1;
        arrayList.addAll(new ArrayList(si.d0(i2Var.a).j0));
        if (z10) {
            r1Var.f();
        }
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 2;
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
        i2 i2Var = t1Var.r;
        if (this.r) {
            return;
        }
        this.r = true;
        t1Var.d.c(true);
        if (this.d >= 0) {
            int i7 = i2.C1;
            ConnectionsManager.getInstance(i2Var.a).cancelRequest(this.d, true);
            this.d = -1;
        }
        if (this.f == null) {
            int i10 = i2.C1;
            TLObject h22 = np.u1(i2Var.a).h2(np.u1(i2Var.a).N3);
            if (h22 instanceof TLRPC.User) {
                this.f = (TLRPC.User) h22;
            }
        }
        TLRPC.User user = this.f;
        if (user == null && !this.n) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            int i11 = i2.C1;
            tL_contacts_resolveUsername.username = np.u1(i2Var.a).N3;
            this.d = ConnectionsManager.getInstance(i2Var.a).sendRequest(tL_contacts_resolveUsername, new ai.g1(this, 9));
            return;
        }
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        int i12 = i2.C1;
        tL_messages_getInlineBotResults.bot = np.u1(i2Var.a).s1(this.f);
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
        ur.a0(i2Var.a).M(str3, new di.j3(this, isEmpty, tL_messages_getInlineBotResults, str3));
    }

    public final void H(String str) {
        t1 t1Var = this.s;
        d2 d2Var = t1Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                i2 i2Var = t1Var.r;
                int i7 = i2.C1;
                ConnectionsManager.getInstance(i2Var.a).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        l lVar = this.c;
        org.telegram.messenger.g0.r(lVar);
        if (TextUtils.isEmpty(str)) {
            t1Var.n.clear();
            d2Var.c(false);
            f();
        } else {
            if (isEmpty) {
                f();
            }
            d2Var.c(true);
            org.telegram.messenger.g0.h3(lVar, 1500L);
        }
    }

    @Override // v4.i0
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

    @Override // v4.i0
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
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, org.telegram.ui.Cells.k8] */
    /* JADX WARN: Type inference failed for: r9v12, types: [android.view.View] */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.i2 i2Var;
        t1 t1Var = this.s;
        if (i7 == 0) {
            i2Var = new View(t1Var.getContext());
        } else if (i7 == 1) {
            Context context = t1Var.getContext();
            i2 i2Var2 = t1Var.r;
            int i10 = i2.C1;
            ?? k8Var = new org.telegram.ui.Cells.k8(context, false, false, i2Var2.J0, false);
            k8Var.a(0, hd.N0(2131750822, null));
            v4.q0 q0Var = new v4.q0(-1, -2);
            ((ViewGroup.MarginLayoutParams) q0Var).topMargin = org.telegram.messenger.g0.L(2.5f);
            ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin = org.telegram.messenger.g0.L(5.5f);
            k8Var.setLayoutParams(q0Var);
            i2Var = k8Var;
        } else {
            org.telegram.ui.Cells.i2 i2Var3 = new org.telegram.ui.Cells.i2(t1Var.getContext());
            i2Var3.getPhotoImage().E0(7);
            if (i2Var3.e0 == null) {
                mc mcVar = new mc(i2Var3, 1.0f, 3.0f);
                mcVar.e = 120L;
                i2Var3.e0 = mcVar;
            }
            i2Var3.setIsKeyboard(true);
            i2Var3.setCanPreviewGif(true);
            i2Var = i2Var3;
        }
        return new mj0(i2Var);
    }
}
