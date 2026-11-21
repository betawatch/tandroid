package org.telegram.ui.Wallet;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class l0 {
    public String e;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public String m;
    public final /* synthetic */ u0 o;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f = "";
    public int n = -1;

    public l0(u0 u0Var) {
        this.o = u0Var;
        this.e = u0Var.y();
    }

    public static void a(l0 l0Var, TL_wallet.walletTransaction wallettransaction) {
        boolean z10;
        ArrayList arrayList = l0Var.c;
        ArrayList arrayList2 = l0Var.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed) {
                    String str = wallettransaction.nft.address;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size2) {
                            z10 = false;
                            break;
                        }
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        if (u0.c(((TL_wallet.nftItem) obj2).address, str)) {
                            z10 = true;
                            break;
                        }
                    }
                    if (!z10) {
                        arrayList2.add(0, wallettransaction.nft);
                    }
                }
                l0Var.j();
                l0Var.h();
                return;
            }
        }
    }

    public final void b() {
        if (this.n >= 0) {
            ConnectionsManager.getInstance(this.o.a).cancelRequest(this.n, true);
            this.n = -1;
        }
        if (this.j) {
            this.g = false;
            this.h = false;
        }
        this.j = false;
        this.i = false;
        this.k = false;
    }

    public final void c() {
        b();
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.f = "";
        this.g = false;
        this.h = false;
        this.m = null;
        h();
    }

    public final boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (u0.c(((TL_wallet.nftItem) obj).address, str)) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.j) {
            this.k = true;
        } else {
            b();
            g(true);
        }
    }

    public final void f() {
        if (this.i || this.g) {
            return;
        }
        g(!this.h);
    }

    public final void g(final boolean z10) {
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        TL_wallet.getNfts getnfts = new TL_wallet.getNfts();
        String str = z10 ? "" : this.f;
        getnfts.offset = str;
        getnfts.limit = TextUtils.isEmpty(str) ? 5 : 20;
        this.i = true;
        this.j = z10;
        this.m = null;
        h();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.n = ConnectionsManager.getInstance(this.o.a).sendRequestTyped(getnfts, new d3.b(1), new q10() { // from class: org.telegram.ui.Wallet.k0
            @Override // org.telegram.messenger.q10
            public final void a(Object obj, Object obj2) {
                TL_wallet.nftItems nftitems = (TL_wallet.nftItems) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                l0 l0Var = l0.this;
                ArrayList arrayList = l0Var.b;
                ArrayList arrayList2 = l0Var.c;
                l0Var.n = -1;
                l0Var.j = false;
                l0Var.i = false;
                boolean z11 = z10;
                if (nftitems != null) {
                    if (z11) {
                        arrayList.clear();
                        l0Var.l = elapsedRealtime;
                    }
                    ArrayList<TL_wallet.nftItem> arrayList3 = nftitems.items;
                    int size = arrayList3.size();
                    int i7 = 0;
                    while (i7 < size) {
                        TL_wallet.nftItem nftitem = arrayList3.get(i7);
                        i7++;
                        TL_wallet.nftItem nftitem2 = nftitem;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                arrayList.add(nftitem2);
                                break;
                            } else {
                                if (u0.c(((TL_wallet.nftItem) arrayList.get(i10)).address, nftitem2.address)) {
                                    arrayList.set(i10, nftitem2);
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                    String str2 = nftitems.next_offset;
                    l0Var.f = str2;
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    l0Var.g = isEmpty;
                    l0Var.h = true;
                    if (isEmpty) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size2);
                            if (!wallettransaction.pending && !wallettransaction.failed) {
                                String str3 = wallettransaction.nft.address;
                                int size3 = arrayList.size();
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= size3) {
                                        arrayList2.remove(size2);
                                        break;
                                    }
                                    Object obj3 = arrayList.get(i11);
                                    i11++;
                                    if (u0.c(((TL_wallet.nftItem) obj3).address, str3)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    l0Var.j();
                } else {
                    if (z11) {
                        l0Var.g = false;
                        l0Var.h = false;
                    }
                    l0Var.m = tL_error == null ? "Could not load collectibles" : tL_error.text;
                }
                if (l0Var.k) {
                    l0Var.k = false;
                    l0Var.e();
                    if (l0Var.i) {
                        return;
                    }
                }
                l0Var.h();
            }
        });
    }

    public final void h() {
        ArrayList arrayList = new ArrayList(this.d);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
    }

    public final void i(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null || TextUtils.isEmpty(tL_starGiftUnique.slug)) {
            return;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        boolean z10 = false;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            TL_stars.StarGift starGift = nftitem.gift;
            if ((starGift instanceof TL_stars.TL_starGiftUnique) && starGift != tL_starGiftUnique && TextUtils.equals(((TL_stars.TL_starGiftUnique) starGift).slug, tL_starGiftUnique.slug)) {
                nftitem.gift = tL_starGiftUnique;
                z10 = true;
            }
        }
        if (z10) {
            h();
        }
    }

    public final void j() {
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
                if (wallettransaction.failed || !u0.c(wallettransaction.nft.address, nftitem.address)) {
                }
            }
        }
    }
}
