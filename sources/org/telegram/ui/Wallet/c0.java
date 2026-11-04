package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c0 {
    public String e;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public String k;
    public final /* synthetic */ k0 m;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f = "";
    public int l = -1;

    public c0(k0 k0Var) {
        this.m = k0Var;
        this.e = k0Var.t();
    }

    public static void a(c0 c0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = c0Var.c;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !c0Var.d(wallettransaction.nft.address)) {
                    c0Var.b.add(0, wallettransaction.nft);
                }
                c0Var.h();
                c0Var.g();
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
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (k0.b(((TL_wallet.nftItem) obj).address, str)) {
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

    public final void f(boolean z10) {
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        TL_wallet.getNfts getnfts = new TL_wallet.getNfts();
        String str = z10 ? "" : this.f;
        getnfts.offset = str;
        getnfts.limit = TextUtils.isEmpty(str) ? 5 : 20;
        this.i = true;
        this.j = z10;
        this.k = null;
        g();
        this.l = ConnectionsManager.getInstance(this.m.a).sendRequestTyped(getnfts, new c3.b(1), new gi.m9(3, this, z10));
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.d);
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((Runnable) obj).run();
        }
    }

    public final void h() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
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
                if (wallettransaction.failed || !k0.b(wallettransaction.nft.address, nftitem.address)) {
                }
            }
        }
    }
}
