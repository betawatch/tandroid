package hi;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.gc;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class c3 extends tj0 {
    public boolean d;
    public String f;
    public String h;
    public TLRPC.User n;
    public boolean r;
    public final /* synthetic */ d3 x;
    public final ArrayList c = new ArrayList();
    public int e = -1;
    public final ColorDrawable s = new ColorDrawable(285212671);
    public final e1 w = new e1(this, 7);

    public c3(d3 d3Var) {
        this.x = d3Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    public final void E() {
        int i7 = this.x.a;
        if (this.d) {
            return;
        }
        this.d = true;
        F(true);
        np s12 = np.s1(i7);
        String str = s12.M3;
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
            this.e = ConnectionsManager.getInstance(i7).sendRequest(tL_contacts_resolveUsername, new bi.v2(15, this, s12));
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
            this.e = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getInlineBotResults, new b3(0, this, TextUtils.isEmpty(str4)));
        }
    }

    public abstract void F(boolean z10);

    @Override // v4.h0
    public final int b() {
        return this.c.size();
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        org.telegram.ui.Components.i9 i9Var = (org.telegram.ui.Components.i9) e1Var.a;
        TLObject tLObject = (TLObject) this.c.get(i7);
        boolean z10 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.s;
        if (z10) {
            i9Var.j(gc.b((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
            return;
        }
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            i9Var.j(gc.i(org.telegram.messenger.w7.w(photo.sizes, ns.r5, false, null, false), photo), "200_200", colorDrawable, null);
        } else {
            if (!(tLObject instanceof TLRPC.BotInlineResult)) {
                i9Var.b();
                return;
            }
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                i9Var.j(gc.g(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                i9Var.b();
            }
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        return new cj0(new di.t5(this.x.getContext(), 1));
    }
}
