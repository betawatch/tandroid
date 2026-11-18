package kg;

import android.text.TextUtils;
import di.ga;
import di.p6;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class y {
    public static volatile y[] e = new y[4];
    public static final Object[] f = new Object[4];
    public final int a;
    public final ArrayList b = new ArrayList();
    public boolean c = false;
    public boolean d = false;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            f[i7] = new Object();
        }
    }

    public y(int i7) {
        this.a = i7;
    }

    public static y d(int i7) {
        y yVar;
        y yVar2 = e[i7];
        if (yVar2 != null) {
            return yVar2;
        }
        synchronized (f[i7]) {
            try {
                yVar = e[i7];
                if (yVar == null) {
                    y[] yVarArr = e;
                    y yVar3 = new y(i7);
                    yVarArr[i7] = yVar3;
                    yVar = yVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yVar;
    }

    public final void a(v vVar, String str) {
        TL_account.TL_businessChatLink c10 = c(str);
        if (c10 != null) {
            ArrayList arrayList = this.b;
            int indexOf = arrayList.indexOf(c10);
            arrayList.remove(c10);
            ks.f(this.a).k(ks.J1, new Object[0]);
            lc.b0(vVar).U(gd.M0(2131752704, null), true, new ai.a1(this, indexOf, c10, 20), new ga(this, str, c10, 29)).j();
        }
    }

    public final void b(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, dd ddVar) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.a).sendRequest(editbusinesschatlink, new bi.m1(this, tL_businessChatLink, ddVar, 10));
    }

    public final TL_account.TL_businessChatLink c(String str) {
        TL_account.TL_businessChatLink tL_businessChatLink;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i7 >= arrayList.size()) {
                return null;
            }
            tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList.get(i7);
            if (!TextUtils.equals(tL_businessChatLink.link, str)) {
                if (!TextUtils.equals(tL_businessChatLink.link, "https://" + str)) {
                    if (TextUtils.equals(tL_businessChatLink.link, "https://t.me/m/" + str)) {
                        break;
                    }
                    if (TextUtils.equals(tL_businessChatLink.link, "tg://message?slug=" + str)) {
                        break;
                    }
                    i7++;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tL_businessChatLink;
    }

    public final void e(boolean z10, boolean z11) {
        if (this.c) {
            return;
        }
        if (!this.d || (z11 && !z10)) {
            this.c = true;
            int i7 = this.a;
            if (z10) {
                tr a02 = tr.a0(i7);
                a02.a.c(new p6(this, a02, z11, 5));
            } else {
                ConnectionsManager.getInstance(i7).sendRequest(new TL_account.getBusinessChatLinks(), new x(this, 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.b);
        tr a02 = tr.a0(this.a);
        a02.a.c(new hi.z0(a02, arrayList, 1));
    }
}
