package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class d0 {
    public String e;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public String k;
    public final /* synthetic */ l0 m;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f = "";
    public int l = -1;

    public d0(l0 l0Var) {
        this.m = l0Var;
        this.e = l0Var.t();
    }

    public static void a(d0 d0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = d0Var.c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !d0Var.d(wallettransaction.nft.address)) {
                    d0Var.b.add(0, wallettransaction.nft);
                }
                d0Var.h();
                d0Var.g();
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
            if (l0.b(((TL_wallet.nftItem) obj).address, str)) {
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
        this.l = ConnectionsManager.getInstance(this.m.a).sendRequestTyped(getnfts, new d3.b(1), new fi.l9(3, this, z9));
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
                if (wallettransaction.failed || !l0.b(wallettransaction.nft.address, nftitem.address)) {
                }
            }
        }
    }
}
