package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class ro {
    public static int q = 10;
    public int a;
    public String b;
    public int d;
    public volatile int e;
    public int f;
    public int g;
    public int m;
    public boolean n;
    public final int o;
    public boolean p;
    public ArrayList c = new ArrayList();
    public ArrayList h = new ArrayList();
    public ArrayList i = new ArrayList();
    public final LongSparseIntArray j = new LongSparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public ro() {
        int i7 = q;
        q = i7 + 1;
        this.o = i7;
    }

    public final boolean a(c cVar, long j3) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) mp.u1(cVar.a).R.f(j3);
        if (dialog == null) {
            return false;
        }
        return b(cVar, j3, dialog, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if ((r13 instanceof org.telegram.tgnet.TLRPC.TL_dialogCommunity ? r3.X0(r13) == 0 && !r13.unread_mark && r13.unread_mentions_count == 0 : !r3.w2(r13)) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if ((r0 & 128) != 0) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(c cVar, long j3, TLRPC.Dialog dialog, boolean z10) {
        TLRPC.Chat O0;
        if (!this.i.contains(Long.valueOf(j3))) {
            if (!this.h.contains(Long.valueOf(j3))) {
                if (dialog.folder_id != 0) {
                    int i7 = this.g;
                    int i10 = mp.I8;
                }
                int i11 = cVar.a;
                mp u12 = mp.u1(i11);
                i5 r10 = i5.r(i11);
                if ((this.g & 32) == 0 || !u12.u2(dialog.id, 0L, null) || dialog.unread_mentions_count != 0) {
                    if (!z10 && (this.g & 64) != 0) {
                    }
                    if (j3 > 0) {
                        TLRPC.User c22 = u12.c2(Long.valueOf(j3));
                        if (c22 != null) {
                            if (!c22.bot) {
                            }
                        }
                    } else if (j3 < 0 && (O0 = u12.O0(Long.valueOf(-j3))) != null) {
                        if (v3.Y(O0)) {
                            int i12 = this.g;
                            int i13 = mp.J8;
                            if ((i12 & i13) == i13) {
                            }
                        } else if (!v3.X(i11, O0) && (!v3.T(O0) || O0.megagroup ? (this.g & 4) != 0 : (this.g & 8) != 0)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean c() {
        int i7 = this.g;
        int i10 = mp.I8;
        return (i7 & 512) > 0;
    }

    public final boolean d() {
        return this.a == 0;
    }

    public final boolean e() {
        if (!c()) {
            return false;
        }
        int i7 = this.g;
        int i10 = mp.I8;
        return (i7 & 1024) > 0;
    }
}
