package kg;

import android.text.TextUtils;
import bi.f2;
import bi.u7;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
            qs.f(this.a).k(qs.J1, new Object[0]);
            hc.a0(vVar).U(id.M0(2131752715, null), true, new ai.e0(this, indexOf, c10, 18), new fi.x1(this, str, c10, 25)).j();
        }
    }

    public final void b(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, ad adVar) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.a).sendRequest(editbusinesschatlink, new f2(this, tL_businessChatLink, adVar, 9));
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

    public final void e(boolean z9, boolean z10) {
        if (this.c) {
            return;
        }
        if (!this.d || (z10 && !z9)) {
            this.c = true;
            int i7 = this.a;
            if (z9) {
                yr a02 = yr.a0(i7);
                a02.a.c(new u7(this, a02, z10, 5));
            } else {
                ConnectionsManager.getInstance(i7).sendRequest(new TL_account.getBusinessChatLinks(), new x(this, 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.b);
        yr a02 = yr.a0(this.a);
        a02.a.c(new fi.x0(a02, arrayList, 1));
    }
}
