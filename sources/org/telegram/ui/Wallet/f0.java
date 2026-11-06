package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class f0 {
    public String e;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public String k;
    public final /* synthetic */ n0 m;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f = "";
    public int l = -1;

    public f0(n0 n0Var) {
        this.m = n0Var;
        this.e = n0Var.t();
    }

    public static void a(f0 f0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = f0Var.c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !f0Var.d(wallettransaction.nft.address)) {
                    f0Var.b.add(0, wallettransaction.nft);
                }
                f0Var.h();
                f0Var.g();
                return;
            }
        }
    }

    public final void b() {
        if (this.l >= 0) {
            ConnectionsManager.getInstance(this.m.a).cancelRequest(this.l, true);
            this.l = -1;
        }
        if (this.j) {
            this.g = false;
            this.h = false;
        }
        this.j = false;
        this.i = false;
    }

    public final void c() {
        b();
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.f = "";
        this.g = false;
        this.h = false;
        this.k = null;
        g();
    }

    public final boolean d(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (n0.b(((TL_wallet.nftItem) obj).address, str)) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.i || this.g) {
            return;
        }
        f(!this.h);
    }

    public final void f(boolean z9) {
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        TL_wallet.getNfts getnfts = new TL_wallet.getNfts();
        String str = z9 ? "" : this.f;
        getnfts.offset = str;
        getnfts.limit = TextUtils.isEmpty(str) ? 5 : 20;
        this.i = true;
        this.j = z9;
        this.k = null;
        g();
        this.l = ConnectionsManager.getInstance(this.m.a).sendRequestTyped(getnfts, new d3.b(1), new fi.m9(3, this, z9));
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.d);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
    }

    public final void h() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.c;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size2) {
                    arrayList.add(nftitem);
                    break;
                }
                Object obj2 = arrayList3.get(i10);
                i10++;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                if (wallettransaction.failed || !n0.b(wallettransaction.nft.address, nftitem.address)) {
                }
            }
        }
    }
}
