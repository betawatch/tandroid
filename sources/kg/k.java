package kg;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.hp;
import org.telegram.messenger.mo;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k extends sg.a {
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

    public k(m mVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.i = tL_chatlists_chatlistUpdates;
        int i3 = mVar.X;
        mVar.X = i3 + 1;
        this.k = i3;
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.m, this.d, this.e, this.l);
    }

    public k(m mVar, String str) {
        super(22, false);
        HashMap hashMap = mVar.Z;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.k = num.intValue();
        } else {
            int i3 = mVar.X;
            mVar.X = i3 + 1;
            this.k = i3;
            hashMap.put(str, Integer.valueOf(i3));
        }
        this.l = str;
    }

    public k(m mVar, TLRPC.User user) {
        super(23, false);
        this.n = user;
        long j10 = user.id;
        LongSparseIntArray longSparseIntArray = mVar.Y;
        int i3 = longSparseIntArray.get(j10, -1);
        if (i3 >= 0) {
            this.k = i3;
            return;
        }
        int i10 = mVar.X;
        mVar.X = i10 + 1;
        this.k = i10;
        longSparseIntArray.put(user.id, i10);
    }

    public k(m mVar, TLRPC.Chat chat) {
        super(23, false);
        this.m = chat;
        long j10 = chat.id;
        LongSparseIntArray longSparseIntArray = mVar.Y;
        int i3 = longSparseIntArray.get(-j10, -1);
        if (i3 >= 0) {
            this.k = i3;
            return;
        }
        int i10 = mVar.X;
        mVar.X = i10 + 1;
        this.k = i10;
        longSparseIntArray.put(-chat.id, i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, int i3, TLRPC.Dialog dialog) {
        super(i3, true);
        LongSparseIntArray longSparseIntArray = mVar.Y;
        this.c = dialog;
        if (dialog != null) {
            int i10 = longSparseIntArray.get(dialog.id, -1);
            if (i10 >= 0) {
                this.k = i10;
            } else {
                int i11 = mVar.X;
                mVar.X = i11 + 1;
                this.k = i11;
                longSparseIntArray.put(dialog.id, i11);
            }
        } else if (i3 == 19) {
            this.k = 5;
        } else {
            int i12 = mVar.X;
            mVar.X = i12 + 1;
            this.k = i12;
        }
        if (dialog != null) {
            int i13 = mVar.h;
            int i14 = mVar.G;
            if (i13 != 7 && i13 != 8) {
                this.g = dialog.pinned;
            } else {
                mo moVar = hp.s1(i14).N[mVar.h == 8 ? (char) 1 : (char) 0];
                this.g = moVar != null && moVar.j.indexOfKey(dialog.id) >= 0;
            }
            this.h = dialog.isFolder;
            this.f = hp.s1(i14).t2(dialog.id);
        }
    }

    public k(m mVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i3 = mVar.X;
        mVar.X = i3 + 1;
        this.k = i3;
    }

    public k(m mVar, int i3) {
        super(i3, true);
        this.j = i3;
        if (i3 == 10) {
            this.k = 1;
        } else {
            if (i3 == 19) {
                this.k = 5;
                return;
            }
            int i10 = mVar.X;
            mVar.X = i10 + 1;
            this.k = i10;
        }
    }

    public k(m mVar, int i3, int i10) {
        super(5, true);
        this.j = i3;
        int i11 = mVar.X;
        mVar.X = i11 + 1;
        this.k = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = mVar.Y;
        this.e = tL_contact;
        if (tL_contact != null) {
            int i3 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i3 > 0) {
                this.k = i3;
                return;
            }
            int i10 = mVar.X;
            mVar.X = i10 + 1;
            this.k = i10;
            longSparseIntArray.put(tL_contact.user_id, i10);
            return;
        }
        int i11 = mVar.X;
        mVar.X = i11 + 1;
        this.k = i11;
    }
}
