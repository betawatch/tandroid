package hi;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.fc;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public abstract class c3 extends dk0 {
    public boolean d;
    public String f;
    public String h;
    public TLRPC.User n;
    public boolean r;
    public final /* synthetic */ d3 x;
    public final ArrayList c = new ArrayList();
    public int e = -1;
    public final ColorDrawable s = new ColorDrawable(285212671);
    public final l w = new l(this, 11);

    public c3(d3 d3Var) {
        this.x = d3Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final void E() {
        int i7 = this.x.a;
        if (this.d) {
            return;
        }
        this.d = true;
        F(true);
        mp u12 = mp.u1(i7);
        String str = u12.O3;
        if (this.n == null) {
            TLObject h22 = u12.h2(str);
            if (h22 instanceof TLRPC.User) {
                this.n = (TLRPC.User) h22;
            }
        }
        TLRPC.User user = this.n;
        if (user == null && !this.r) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername.username = str;
            this.e = ConnectionsManager.getInstance(i7).sendRequest(tL_contacts_resolveUsername, new bi.o1(16, this, u12));
        } else {
            if (user == null) {
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.bot = u12.s1(this.n);
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

    @Override // v4.i0
    public final int b() {
        return this.c.size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.ui.Components.q9 q9Var = (org.telegram.ui.Components.q9) f1Var.a;
        TLObject tLObject = (TLObject) this.c.get(i7);
        boolean z10 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.s;
        if (z10) {
            q9Var.j(fc.b((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
            return;
        }
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            q9Var.j(fc.i(org.telegram.messenger.w7.w(photo.sizes, ks.r5, false, null, false), photo), "200_200", colorDrawable, null);
        } else {
            if (!(tLObject instanceof TLRPC.BotInlineResult)) {
                q9Var.b();
                return;
            }
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                q9Var.j(fc.g(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                q9Var.b();
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new mj0(new di.w5(this.x.getContext(), 1));
    }
}
