package ag;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.hs;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.tc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s0 {
    public static volatile s0[] e = new s0[4];
    public static final Object[] f = new Object[4];
    public final int a;
    public final ArrayList b = new ArrayList();
    public boolean c = false;
    public boolean d = false;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f[i10] = new Object();
        }
    }

    public s0(int i10) {
        this.a = i10;
    }

    public static s0 d(int i10) {
        s0 s0Var;
        s0 s0Var2 = e[i10];
        if (s0Var2 != null) {
            return s0Var2;
        }
        synchronized (f[i10]) {
            try {
                s0Var = e[i10];
                if (s0Var == null) {
                    s0[] s0VarArr = e;
                    s0 s0Var3 = new s0(i10);
                    s0VarArr[i10] = s0Var3;
                    s0Var = s0Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return s0Var;
    }

    public final void a(i0 i0Var, String str) {
        TL_account.TL_businessChatLink c10 = c(str);
        if (c10 != null) {
            ArrayList arrayList = this.b;
            int indexOf = arrayList.indexOf(c10);
            arrayList.remove(c10);
            zs.f(this.a).k(zs.J1, new Object[0]);
            cc.a0(i0Var).U(cd.L0(2131752715, null), true, new o0(this, indexOf, c10, 0), new a3.l0(this, str, c10, 4)).j();
        }
    }

    public final void b(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, tc tcVar) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.a).sendRequest(editbusinesschatlink, new p0(this, tL_businessChatLink, tcVar, 0));
    }

    public final TL_account.TL_businessChatLink c(String str) {
        TL_account.TL_businessChatLink tL_businessChatLink;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return null;
            }
            tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList.get(i10);
            if (!TextUtils.equals(tL_businessChatLink.link, str)) {
                if (!TextUtils.equals(tL_businessChatLink.link, "https://" + str)) {
                    if (TextUtils.equals(tL_businessChatLink.link, "https://t.me/m/" + str)) {
                        break;
                    }
                    if (TextUtils.equals(tL_businessChatLink.link, "tg://message?slug=" + str)) {
                        break;
                    }
                    i10++;
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
            int i10 = this.a;
            if (z10) {
                hs a02 = hs.a0(i10);
                a02.a.c(new j0(this, a02, z11, 0));
            } else {
                ConnectionsManager.getInstance(i10).sendRequest(new TL_account.getBusinessChatLinks(), new m0(this, 0));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.b);
        hs a02 = hs.a0(this.a);
        a02.a.c(new r0(a02, arrayList, 0));
    }
}
