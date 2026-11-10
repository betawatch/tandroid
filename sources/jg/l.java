package jg;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.qp;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.vo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l extends rg.a {
    public final TLRPC.Dialog c;
    public final TLRPC.RecentMeUrl d;
    public final TLRPC.TL_contact e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final TL_chatlists.TL_chatlists_chatlistUpdates i;
    public final int j;
    public final int k;
    public final String l;
    public final TLRPC.Chat m;
    public final TLRPC.User n;

    public l(n nVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.i = tL_chatlists_chatlistUpdates;
        int i7 = nVar.W;
        nVar.W = i7 + 1;
        this.k = i7;
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.m, this.d, this.e, this.l);
    }

    public l(n nVar, String str) {
        super(22, false);
        HashMap hashMap = nVar.Y;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.k = num.intValue();
        } else {
            int i7 = nVar.W;
            nVar.W = i7 + 1;
            this.k = i7;
            hashMap.put(str, Integer.valueOf(i7));
        }
        this.l = str;
    }

    public l(n nVar, TLRPC.User user) {
        super(23, false);
        this.n = user;
        long j3 = user.id;
        LongSparseIntArray longSparseIntArray = nVar.X;
        int i7 = longSparseIntArray.get(j3, -1);
        if (i7 >= 0) {
            this.k = i7;
            return;
        }
        int i10 = nVar.W;
        nVar.W = i10 + 1;
        this.k = i10;
        longSparseIntArray.put(user.id, i10);
    }

    public l(n nVar, TLRPC.Chat chat) {
        super(23, false);
        this.m = chat;
        long j3 = chat.id;
        LongSparseIntArray longSparseIntArray = nVar.X;
        int i7 = longSparseIntArray.get(-j3, -1);
        if (i7 >= 0) {
            this.k = i7;
            return;
        }
        int i10 = nVar.W;
        nVar.W = i10 + 1;
        this.k = i10;
        longSparseIntArray.put(-chat.id, i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, int i7, TLRPC.Dialog dialog) {
        super(i7, true);
        LongSparseIntArray longSparseIntArray = nVar.X;
        this.c = dialog;
        if (dialog != null) {
            int i10 = longSparseIntArray.get(dialog.id, -1);
            if (i10 >= 0) {
                this.k = i10;
            } else {
                int i11 = nVar.W;
                nVar.W = i11 + 1;
                this.k = i11;
                longSparseIntArray.put(dialog.id, i11);
            }
        } else if (i7 == 19) {
            this.k = 5;
        } else {
            int i12 = nVar.W;
            nVar.W = i12 + 1;
            this.k = i12;
        }
        if (dialog != null) {
            int i13 = nVar.h;
            int i14 = nVar.F;
            if (i13 != 7 && i13 != 8) {
                this.g = dialog.pinned;
            } else {
                vo voVar = qp.s1(i14).M[nVar.h == 8 ? (char) 1 : (char) 0];
                this.g = voVar != null && voVar.j.indexOfKey(dialog.id) >= 0;
            }
            this.h = dialog.isFolder;
            this.f = qp.s1(i14).t2(dialog.id);
        }
    }

    public l(n nVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i7 = nVar.W;
        nVar.W = i7 + 1;
        this.k = i7;
    }

    public l(n nVar, int i7) {
        super(i7, true);
        this.j = i7;
        if (i7 == 10) {
            this.k = 1;
        } else {
            if (i7 == 19) {
                this.k = 5;
                return;
            }
            int i10 = nVar.W;
            nVar.W = i10 + 1;
            this.k = i10;
        }
    }

    public l(n nVar, int i7, int i10) {
        super(5, true);
        this.j = i7;
        int i11 = nVar.W;
        nVar.W = i11 + 1;
        this.k = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = nVar.X;
        this.e = tL_contact;
        if (tL_contact != null) {
            int i7 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i7 > 0) {
                this.k = i7;
                return;
            }
            int i10 = nVar.W;
            nVar.W = i10 + 1;
            this.k = i10;
            longSparseIntArray.put(tL_contact.user_id, i10);
            return;
        }
        int i11 = nVar.W;
        nVar.W = i11 + 1;
        this.k = i11;
    }
}
