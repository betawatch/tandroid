package fi;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.hc;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public abstract class e3 extends oj0 {
    public boolean d;
    public String f;
    public String h;
    public TLRPC.User n;
    public boolean r;
    public final /* synthetic */ f3 x;
    public final ArrayList c = new ArrayList();
    public int e = -1;
    public final ColorDrawable s = new ColorDrawable(285212671);
    public final di.s7 w = new di.s7(this, 24);

    public e3(f3 f3Var) {
        this.x = f3Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    public final void E() {
        int i7 = this.x.a;
        if (this.d) {
            return;
        }
        this.d = true;
        F(true);
        qp s12 = qp.s1(i7);
        String str = s12.L3;
        if (this.n == null) {
            TLObject f22 = s12.f2(str);
            if (f22 instanceof TLRPC.User) {
                this.n = (TLRPC.User) f22;
            }
        }
        TLRPC.User user = this.n;
        if (user == null && !this.r) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername.username = str;
            this.e = ConnectionsManager.getInstance(i7).sendRequest(tL_contacts_resolveUsername, new bi.j(13, this, s12));
        } else {
            if (user == null) {
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.bot = s12.q1(this.n);
            String str2 = this.f;
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            String str3 = this.h;
            String str4 = str3 != null ? str3 : "";
            tL_messages_getInlineBotResults.offset = str4;
            this.e = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getInlineBotResults, new d3(0, this, TextUtils.isEmpty(str4)));
        }
    }

    public abstract void F(boolean z9);

    @Override // v4.g0
    public final int b() {
        return this.c.size();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        org.telegram.ui.Components.l9 l9Var = (org.telegram.ui.Components.l9) d1Var.a;
        TLObject tLObject = (TLObject) this.c.get(i7);
        boolean z9 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.s;
        if (z9) {
            l9Var.j(hc.b((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
            return;
        }
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            l9Var.j(hc.i(org.telegram.messenger.w7.w(photo.sizes, qs.r5, false, null, false), photo), "200_200", colorDrawable, null);
        } else {
            if (!(tLObject instanceof TLRPC.BotInlineResult)) {
                l9Var.b();
                return;
            }
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                l9Var.j(hc.g(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                l9Var.b();
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new xi0(new bi.b7(this.x.getContext(), 1));
    }
}
